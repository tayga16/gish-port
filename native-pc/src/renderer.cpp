#include "renderer.h"
#include "physics.h"
#include "tilemap.h"
#include "font.h"
#include <algorithm>
#include <string>
#include <cmath>

Renderer::Renderer(int width, int height)
    : window(nullptr), sdl_renderer(nullptr), screen_width(width), screen_height(height), camera(0, 0) {}

Renderer::~Renderer() {
    if (sdl_renderer) SDL_DestroyRenderer(sdl_renderer);
    if (window) SDL_DestroyWindow(window);
    SDL_Quit();
}

bool Renderer::init() {
    if (SDL_Init(SDL_INIT_VIDEO | SDL_INIT_AUDIO) != 0) {
        return false;
    }

    window = SDL_CreateWindow(
        "Gish Native - 60 FPS Edition",
        SDL_WINDOWPOS_CENTERED, SDL_WINDOWPOS_CENTERED,
        screen_width, screen_height,
        SDL_WINDOW_SHOWN | SDL_WINDOW_RESIZABLE
    );
    if (!window) return false;

    // Hardware accelerated renderer with VSync
    sdl_renderer = SDL_CreateRenderer(
        window, -1,
        SDL_RENDERER_ACCELERATED | SDL_RENDERER_PRESENTVSYNC
    );
    if (!sdl_renderer) {
        sdl_renderer = SDL_CreateRenderer(window, -1, 0);
    }

    return sdl_renderer != nullptr;
}

void Renderer::toggleFullscreen() {
    Uint32 flags = SDL_GetWindowFlags(window);
    if (flags & SDL_WINDOW_FULLSCREEN_DESKTOP) {
        SDL_SetWindowFullscreen(window, 0);
    } else {
        SDL_SetWindowFullscreen(window, SDL_WINDOW_FULLSCREEN_DESKTOP);
    }
}

void Renderer::updateCamera(Vec2 target, int map_width, int map_height) {
    SDL_GetWindowSize(window, &screen_width, &screen_height);

    Vec2 desired = target - Vec2(screen_width * 0.5f, screen_height * 0.5f);
    // Smooth camera trailing
    camera += (desired - camera) * 0.12f;

    float max_x = map_width * Tilemap::TILE_SIZE - screen_width;
    float max_y = map_height * Tilemap::TILE_SIZE - screen_height;
    if (max_x > 0) camera.x = std::max(0.0f, std::min(max_x, camera.x));
    if (max_y > 0) camera.y = std::max(0.0f, std::min(max_y, camera.y));
}

void Renderer::render(const GishBlob& blob, const Tilemap& map, float fps,
                    const std::string& current_map_name, int map_index, int total_maps,
                    const CheatMenuState& menu, const std::vector<std::string>& all_maps,
                    const std::string& toast_msg) {
    // Background clear (dark sewer ambient)
    SDL_SetRenderDrawColor(sdl_renderer, 18, 16, 22, 255);
    SDL_RenderClear(sdl_renderer);

    renderTilemap(map);
    renderBlob(blob);
    renderHUD(blob, fps, current_map_name, map_index, total_maps);

    if (menu.is_open) {
        renderCheatMenu(blob, menu, all_maps);
    }

    if (!toast_msg.empty()) {
        renderToast(toast_msg);
    }

    SDL_RenderPresent(sdl_renderer);
}

void Renderer::renderTilemap(const Tilemap& map) {
    int start_x = std::max(0, (int)(camera.x / Tilemap::TILE_SIZE));
    int end_x = std::min(map.width, (int)((camera.x + screen_width) / Tilemap::TILE_SIZE) + 1);
    int start_y = std::max(0, (int)(camera.y / Tilemap::TILE_SIZE));
    int end_y = std::min(map.height, (int)((camera.y + screen_height) / Tilemap::TILE_SIZE) + 1);

    for (int y = start_y; y < end_y; ++y) {
        for (int x = start_x; x < end_x; ++x) {
            int tile = map.getTile(x, y);
            if (tile == 0) continue;

            SDL_Rect rect;
            rect.x = (int)(x * Tilemap::TILE_SIZE - camera.x);
            rect.y = (int)(y * Tilemap::TILE_SIZE - camera.y);
            rect.w = Tilemap::TILE_SIZE;
            rect.h = Tilemap::TILE_SIZE;

            if (tile == 1) { // Solid sewer stone
                SDL_SetRenderDrawColor(sdl_renderer, 48, 54, 52, 255);
                SDL_RenderFillRect(sdl_renderer, &rect);
                SDL_SetRenderDrawColor(sdl_renderer, 70, 78, 75, 255);
                SDL_RenderDrawRect(sdl_renderer, &rect);
            } else if (tile == 2) { // Breakable brick
                SDL_SetRenderDrawColor(sdl_renderer, 140, 80, 50, 255);
                SDL_RenderFillRect(sdl_renderer, &rect);
                SDL_SetRenderDrawColor(sdl_renderer, 90, 50, 30, 255);
                SDL_RenderDrawRect(sdl_renderer, &rect);
            } else if (tile == 9) { // Hazard / spikes
                SDL_SetRenderDrawColor(sdl_renderer, 180, 40, 40, 255);
                SDL_RenderFillRect(sdl_renderer, &rect);
            }
        }
    }
}

void Renderer::renderBlob(const GishBlob& blob) {
    // Base Tar color
    SDL_Color tar_color = {22, 22, 26, 255};
    if (blob.state_flags & STATE_STICKY) {
        tar_color = {45, 30, 18, 255}; // Amber sticky tint
    } else if (blob.state_flags & STATE_SLICK) {
        tar_color = {35, 45, 60, 255}; // Slick bluish sheen
    } else if (blob.state_flags & STATE_HEAVY) {
        tar_color = {10, 10, 12, 255}; // Heavy hardened iron-black
    }

    // Prepare hardware vertices for triangle fan
    std::vector<SDL_Vertex> vertices;
    std::vector<int> indices;

    // Center vertex
    SDL_Vertex center_v;
    center_v.position.x = blob.particles[0].pos.x - camera.x;
    center_v.position.y = blob.particles[0].pos.y - camera.y;
    center_v.color = tar_color;
    center_v.tex_coord = {0.5f, 0.5f};
    vertices.push_back(center_v);

    // Perimeter vertices
    for (int i = 0; i < GishBlob::NUM_RING; ++i) {
        SDL_Vertex v;
        v.position.x = blob.particles[i + 1].pos.x - camera.x;
        v.position.y = blob.particles[i + 1].pos.y - camera.y;
        v.color = tar_color;
        v.tex_coord = {0.0f, 0.0f};
        vertices.push_back(v);

        int next = (i + 1) % GishBlob::NUM_RING;
        indices.push_back(0);
        indices.push_back(i + 1);
        indices.push_back(next + 1);
    }

    SDL_RenderGeometry(sdl_renderer, nullptr, vertices.data(), (int)vertices.size(), indices.data(), (int)indices.size());

    // Outer contour lines
    SDL_SetRenderDrawColor(sdl_renderer, 10, 10, 14, 255);
    for (int i = 0; i < GishBlob::NUM_RING; ++i) {
        int next = (i + 1) % GishBlob::NUM_RING;
        SDL_RenderDrawLine(
            sdl_renderer,
            (int)(blob.particles[i + 1].pos.x - camera.x),
            (int)(blob.particles[i + 1].pos.y - camera.y),
            (int)(blob.particles[next + 1].pos.x - camera.x),
            (int)(blob.particles[next + 1].pos.y - camera.y)
        );
    }

    // Animated Expressive Eyes
    Vec2 left_eye = blob.eye_pos_left - camera;
    Vec2 right_eye = blob.eye_pos_right - camera;
    Vec2 pupil_shift = blob.look_dir.normalized() * 1.5f;

    // Eye Whites (Yellow sclera in original Gish)
    SDL_Color sclera = {245, 235, 120, 255};
    drawCircle(left_eye, 4.5f, sclera);
    drawCircle(right_eye, 4.5f, sclera);

    // Pupils (Black)
    SDL_Color pupil = {15, 15, 20, 255};
    drawCircle(left_eye + pupil_shift, 2.0f, pupil);
    drawCircle(right_eye + pupil_shift, 2.0f, pupil);
}

void Renderer::drawCircle(Vec2 c, float radius, SDL_Color color) {
    SDL_SetRenderDrawColor(sdl_renderer, color.r, color.g, color.b, color.a);
    int r = (int)radius;
    for (int dy = -r; dy <= r; ++dy) {
        for (int dx = -r; dx <= r; ++dx) {
            if (dx * dx + dy * dy <= r * r) {
                SDL_RenderDrawPoint(sdl_renderer, (int)(c.x + dx), (int)(c.y + dy));
            }
        }
    }
}

void Renderer::renderHUD(const GishBlob& blob, float fps, const std::string& current_map_name, int map_index, int total_maps) {
    // Top-left status HUD box
    SDL_Rect bg_box = {16, 16, 260, 68};
    SDL_SetRenderDrawColor(sdl_renderer, 10, 10, 15, 200);
    SDL_RenderFillRect(sdl_renderer, &bg_box);
    SDL_SetRenderDrawColor(sdl_renderer, 60, 60, 75, 255);
    SDL_RenderDrawRect(sdl_renderer, &bg_box);

    // Indicators for states
    int state_x = 24;
    auto drawIndicator = [&](const char* label, bool active, SDL_Color col) {
        SDL_Rect ind_rect = {state_x, 26, 42, 20};
        if (active) {
            SDL_SetRenderDrawColor(sdl_renderer, col.r, col.g, col.b, col.a);
            SDL_RenderFillRect(sdl_renderer, &ind_rect);
            Font5x7::drawText(sdl_renderer, label, state_x + 6, 32, 1, {0, 0, 0, 255});
        } else {
            SDL_SetRenderDrawColor(sdl_renderer, 30, 30, 38, 255);
            SDL_RenderFillRect(sdl_renderer, &ind_rect);
            SDL_SetRenderDrawColor(sdl_renderer, 60, 60, 70, 255);
            SDL_RenderDrawRect(sdl_renderer, &ind_rect);
            Font5x7::drawText(sdl_renderer, label, state_x + 6, 32, 1, {100, 100, 110, 255});
        }
        state_x += 48;
    };

    drawIndicator("STK", (blob.state_flags & STATE_STICKY) != 0, {210, 150, 40, 255});
    drawIndicator("SLC", (blob.state_flags & STATE_SLICK) != 0, {60, 160, 240, 255});
    drawIndicator("HVY", (blob.state_flags & STATE_HEAVY) != 0, {180, 50, 50, 255});
    drawIndicator("GOD", blob.cheats.godmode, {240, 220, 50, 255});
    drawIndicator("FLY", blob.cheats.noclip, {160, 80, 240, 255});

    // FPS and help hint
    char fps_str[64];
    std::snprintf(fps_str, sizeof(fps_str), "FPS: %.1f | [F1/TAB] CHEAT MENU", fps);
    Font5x7::drawText(sdl_renderer, fps_str, 24, 54, 1, {180, 200, 220, 255});

    // Top-Center Level banner
    int banner_w = 340;
    int banner_x = (screen_width - banner_w) / 2;
    SDL_Rect map_box = {banner_x, 16, banner_w, 36};
    SDL_SetRenderDrawColor(sdl_renderer, 10, 10, 15, 200);
    SDL_RenderFillRect(sdl_renderer, &map_box);
    SDL_SetRenderDrawColor(sdl_renderer, 70, 70, 90, 255);
    SDL_RenderDrawRect(sdl_renderer, &map_box);

    char map_str[128];
    std::snprintf(map_str, sizeof(map_str), "< [ MAP: %s (%d/%d) ] >", current_map_name.c_str(), map_index + 1, total_maps);
    Font5x7::drawText(sdl_renderer, map_str, banner_x + 16, 28, 1, {255, 230, 120, 255});
}

void Renderer::renderCheatMenu(const GishBlob& blob, const CheatMenuState& menu, const std::vector<std::string>& all_maps) {
    // Dark modal overlay
    SDL_Rect full = {0, 0, screen_width, screen_height};
    SDL_SetRenderDrawBlendMode(sdl_renderer, SDL_BLENDMODE_BLEND);
    SDL_SetRenderDrawColor(sdl_renderer, 5, 5, 10, 215);
    SDL_RenderFillRect(sdl_renderer, &full);

    int box_w = 560;
    int box_h = 420;
    int box_x = (screen_width - box_w) / 2;
    int box_y = (screen_height - box_h) / 2;

    SDL_Rect menu_box = {box_x, box_y, box_w, box_h};
    SDL_SetRenderDrawColor(sdl_renderer, 20, 22, 30, 255);
    SDL_RenderFillRect(sdl_renderer, &menu_box);
    SDL_SetRenderDrawColor(sdl_renderer, 240, 200, 60, 255);
    SDL_RenderDrawRect(sdl_renderer, &menu_box);
    SDL_Rect inner_border = {box_x + 4, box_y + 4, box_w - 8, box_h - 8};
    SDL_SetRenderDrawColor(sdl_renderer, 70, 70, 100, 255);
    SDL_RenderDrawRect(sdl_renderer, &inner_border);

    // Title
    Font5x7::drawText(sdl_renderer, "*** GISH CHEAT MENU & LEVEL SELECTOR ***", box_x + 36, box_y + 24, 2, {255, 220, 40, 255});

    struct MenuItem {
        std::string label;
        std::string value;
        bool active;
    };

    std::string current_sel_map = (menu.selected_map_idx >= 0 && menu.selected_map_idx < (int)all_maps.size())
                                      ? all_maps[menu.selected_map_idx]
                                      : "None";

    std::vector<MenuItem> items = {
        {"[1] GODMODE (IMMORTALITY)", blob.cheats.godmode ? "[ON]" : "[OFF]", blob.cheats.godmode},
        {"[2] INFINITE AIR JUMP", blob.cheats.infinite_jump ? "[ON]" : "[OFF]", blob.cheats.infinite_jump},
        {"[3] SUPER SPEED (2.5X)", blob.cheats.super_speed ? "[ON]" : "[OFF]", blob.cheats.super_speed},
        {"[4] LOW MOON GRAVITY", blob.cheats.low_gravity ? "[ON]" : "[OFF]", blob.cheats.low_gravity},
        {"[5] NOCLIP / FREE FLIGHT", blob.cheats.noclip ? "[ON]" : "[OFF]", blob.cheats.noclip},
        {"[6] HEAVY SLAM (SMASH BRICKS)", blob.cheats.heavy_slam ? "[ON]" : "[OFF]", blob.cheats.heavy_slam},
        {"[7] MAP SELECTOR", "< " + current_sel_map + " >", true},
        {"[8] RESTART CURRENT MAP", "[PRESS ENTER]", false},
        {"[9] CLOSE MENU", "[ESC / F1 / TAB]", false}
    };

    int item_y = box_y + 70;
    for (size_t i = 0; i < items.size(); ++i) {
        bool selected = ((int)i == menu.selected_item);
        SDL_Rect row = {box_x + 20, item_y - 4, box_w - 40, 28};

        if (selected) {
            SDL_SetRenderDrawColor(sdl_renderer, 45, 55, 85, 255);
            SDL_RenderFillRect(sdl_renderer, &row);
            SDL_SetRenderDrawColor(sdl_renderer, 100, 160, 255, 255);
            SDL_RenderDrawRect(sdl_renderer, &row);
        }

        SDL_Color label_col = selected ? SDL_Color{255, 255, 255, 255} : SDL_Color{190, 195, 210, 255};
        Font5x7::drawText(sdl_renderer, items[i].label, box_x + 32, item_y + 4, 1, label_col);

        SDL_Color val_col = items[i].active ? SDL_Color{80, 240, 120, 255} : SDL_Color{220, 70, 70, 255};
        if (i >= 6) val_col = {255, 220, 80, 255};
        Font5x7::drawText(sdl_renderer, items[i].value, box_x + 360, item_y + 4, 1, val_col);

        item_y += 32;
    }

    // Footer hint
    Font5x7::drawText(sdl_renderer, "UP/DOWN: Navigate | LEFT/RIGHT or 1-8: Toggle/Change Map", box_x + 32, box_y + box_h - 44, 1, {150, 170, 190, 255});
    Font5x7::drawText(sdl_renderer, "ENTER: Apply/Load Map | [ and ]: Instant Map Switch", box_x + 32, box_y + box_h - 26, 1, {130, 150, 170, 255});
}

void Renderer::renderToast(const std::string& msg) {
    int toast_w = (int)msg.length() * 12 + 48;
    int toast_h = 36;
    int toast_x = (screen_width - toast_w) / 2;
    int toast_y = screen_height - 64;

    SDL_Rect toast_box = {toast_x, toast_y, toast_w, toast_h};
    SDL_SetRenderDrawBlendMode(sdl_renderer, SDL_BLENDMODE_BLEND);
    SDL_SetRenderDrawColor(sdl_renderer, 15, 18, 26, 230);
    SDL_RenderFillRect(sdl_renderer, &toast_box);
    SDL_SetRenderDrawColor(sdl_renderer, 255, 215, 40, 255);
    SDL_RenderDrawRect(sdl_renderer, &toast_box);

    Font5x7::drawText(sdl_renderer, msg, toast_x + 24, toast_y + 11, 2, {255, 235, 80, 255});
}
