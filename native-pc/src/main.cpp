#include <SDL2/SDL.h>
#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <chrono>
#include "renderer.h"
#include "physics.h"
#include "tilemap.h"
#include "audio.h"

static std::vector<std::string> initMapList() {
    std::vector<std::string> maps;
    // Sewers & Caves
    for (int i = 0; i <= 26; ++i) maps.push_back("c" + std::to_string(i) + ".lvl");
    // Caverns & Darkness
    for (int i = 0; i <= 9; ++i)  maps.push_back("d" + std::to_string(i) + ".lvl");
    // Ancient Egypt
    for (int i = 0; i <= 15; ++i) maps.push_back("e" + std::to_string(i) + ".lvl");
    // Hell & Underworld
    for (int i = 0; i <= 15; ++i) maps.push_back("h" + std::to_string(i) + ".lvl");
    // Ruins
    for (int i = 0; i <= 9; ++i)  maps.push_back("r" + std::to_string(i) + ".lvl");
    // Secret Challenges
    for (int i = 0; i <= 18; ++i) maps.push_back("s" + std::to_string(i) + ".lvl");
    // Playground
    for (int i = 0; i <= 4; ++i)  maps.push_back("pl" + std::to_string(i) + ".lvl");
    maps.push_back("i.lvl");
    return maps;
}

int main(int argc, char* argv[]) {
    Renderer renderer(960, 720);
    if (!renderer.init()) {
        std::cerr << "Failed to initialize SDL2 Renderer!\n";
        return 1;
    }

    AudioEngine audio;
    audio.init();

    // Load sound effects from resources if available
    audio.loadWAV("squish", "resources/sound/squish.wav");
    audio.loadWAV("gishhit", "resources/sound/gishhit.wav");
    audio.loadWAV("amber", "resources/sound/amber.wav");
    audio.loadWAV("blockbreak", "resources/sound/blockbreak.wav");

    std::vector<std::string> all_maps = initMapList();
    int current_map_idx = 0;

    Tilemap tilemap;
    auto loadLevelByIdx = [&](int idx, GishBlob& blob) {
        if (idx < 0) idx = 0;
        if (idx >= (int)all_maps.size()) idx = (int)all_maps.size() - 1;
        current_map_idx = idx;

        std::string path = "resources/" + all_maps[current_map_idx];
        if (!tilemap.loadLevel(path)) {
            tilemap.createDefaultLevel(50, 30);
        }
        blob.reset(tilemap.spawn_point);
        audio.playSound("squish");
    };

    GishBlob gish(tilemap.spawn_point, 24.0f);
    loadLevelByIdx(0, gish);

    CheatMenuState menu;
    menu.is_open = false;
    menu.selected_item = 0;
    menu.selected_map_idx = 0;

    std::string toast_msg = "WELCOME TO GISH! PRESS [F1] FOR CHEATS & MAPS";
    float toast_timer = 4.0f;

    auto showToast = [&](const std::string& msg) {
        toast_msg = msg;
        toast_timer = 2.5f;
    };

    bool running = true;
    SDL_Event event;

    // Fixed timestep 60 FPS
    const double dt = 1.0 / 60.0;
    Uint64 freq = SDL_GetPerformanceFrequency();
    Uint64 prev_counter = SDL_GetPerformanceCounter();
    double accumulator = 0.0;

    // FPS counter
    int frame_count = 0;
    float current_fps = 60.0f;
    Uint64 fps_timer = SDL_GetPerformanceCounter();

    // Input state
    float move_x = 0.0f;
    bool key_jump = false;
    bool key_duck = false;
    bool key_sticky = false;
    bool key_slick = false;
    bool key_heavy = false;

    // Mouse drag
    bool mouse_dragging = false;
    Vec2 drag_start(0, 0);

    auto toggleCheat = [&](int item_index) {
        switch (item_index) {
            case 0:
                gish.cheats.godmode = !gish.cheats.godmode;
                showToast(gish.cheats.godmode ? ">> GODMODE: ENABLED <<" : ">> GODMODE: DISABLED <<");
                break;
            case 1:
                gish.cheats.infinite_jump = !gish.cheats.infinite_jump;
                showToast(gish.cheats.infinite_jump ? ">> INFINITE JUMP: ENABLED <<" : ">> INFINITE JUMP: DISABLED <<");
                break;
            case 2:
                gish.cheats.super_speed = !gish.cheats.super_speed;
                showToast(gish.cheats.super_speed ? ">> SUPER SPEED: ENABLED <<" : ">> SUPER SPEED: DISABLED <<");
                break;
            case 3:
                gish.cheats.low_gravity = !gish.cheats.low_gravity;
                showToast(gish.cheats.low_gravity ? ">> LOW GRAVITY: ENABLED <<" : ">> LOW GRAVITY: DISABLED <<");
                break;
            case 4:
                gish.cheats.noclip = !gish.cheats.noclip;
                showToast(gish.cheats.noclip ? ">> NOCLIP FLY: ENABLED <<" : ">> NOCLIP FLY: DISABLED <<");
                break;
            case 5:
                gish.cheats.heavy_slam = !gish.cheats.heavy_slam;
                showToast(gish.cheats.heavy_slam ? ">> HEAVY SLAM: ENABLED <<" : ">> HEAVY SLAM: DISABLED <<");
                break;
        }
    };

    while (running) {
        while (SDL_PollEvent(&event)) {
            if (event.type == SDL_QUIT) {
                running = false;
            } else if (event.type == SDL_KEYDOWN) {
                SDL_Keycode k = event.key.keysym.sym;

                // Global toggles
                if (k == SDLK_F1 || k == SDLK_TAB || k == SDLK_BACKQUOTE) {
                    menu.is_open = !menu.is_open;
                    if (menu.is_open) {
                        menu.selected_map_idx = current_map_idx;
                    }
                    continue;
                }
                if (k == SDLK_F11) {
                    renderer.toggleFullscreen();
                    continue;
                }

                if (menu.is_open) {
                    // Cheat Menu navigation
                    if (k == SDLK_ESCAPE) {
                        menu.is_open = false;
                    } else if (k == SDLK_UP) {
                        menu.selected_item = (menu.selected_item - 1 + 9) % 9;
                    } else if (k == SDLK_DOWN) {
                        menu.selected_item = (menu.selected_item + 1) % 9;
                    } else if (k == SDLK_LEFT) {
                        if (menu.selected_item == 6) {
                            menu.selected_map_idx = (menu.selected_map_idx - 1 + (int)all_maps.size()) % (int)all_maps.size();
                        } else if (menu.selected_item <= 5) {
                            toggleCheat(menu.selected_item);
                        }
                    } else if (k == SDLK_RIGHT) {
                        if (menu.selected_item == 6) {
                            menu.selected_map_idx = (menu.selected_map_idx + 1) % (int)all_maps.size();
                        } else if (menu.selected_item <= 5) {
                            toggleCheat(menu.selected_item);
                        }
                    } else if (k == SDLK_RETURN || k == SDLK_KP_ENTER || k == SDLK_SPACE) {
                        if (menu.selected_item <= 5) {
                            toggleCheat(menu.selected_item);
                        } else if (menu.selected_item == 6) {
                            loadLevelByIdx(menu.selected_map_idx, gish);
                            showToast(">> LOADED: " + all_maps[current_map_idx] + " <<");
                            menu.is_open = false;
                        } else if (menu.selected_item == 7) {
                            loadLevelByIdx(current_map_idx, gish);
                            showToast(">> MAP RESTARTED <<");
                            menu.is_open = false;
                        } else if (menu.selected_item == 8) {
                            menu.is_open = false;
                        }
                    } else if (k >= SDLK_1 && k <= SDLK_6) {
                        toggleCheat(k - SDLK_1);
                    }
                } else {
                    // Gameplay key shortcuts
                    if (k == SDLK_ESCAPE) {
                        running = false;
                    } else if (k == SDLK_r) {
                        loadLevelByIdx(current_map_idx, gish);
                        showToast(">> LEVEL RESTARTED <<");
                    } else if (k == SDLK_LEFTBRACKET) { // [ Previous Map
                        int next_idx = (current_map_idx - 1 + (int)all_maps.size()) % (int)all_maps.size();
                        loadLevelByIdx(next_idx, gish);
                        showToast(">> MAP: " + all_maps[current_map_idx] + " <<");
                    } else if (k == SDLK_RIGHTBRACKET) { // ] Next Map
                        int next_idx = (current_map_idx + 1) % (int)all_maps.size();
                        loadLevelByIdx(next_idx, gish);
                        showToast(">> MAP: " + all_maps[current_map_idx] + " <<");
                    } else if (k == SDLK_g) {
                        toggleCheat(0);
                    } else if (k == SDLK_j) {
                        toggleCheat(1);
                    } else if (k == SDLK_v) {
                        toggleCheat(4);
                    }
                }
            } else if (event.type == SDL_MOUSEBUTTONDOWN && !menu.is_open) {
                if (event.button.button == SDL_BUTTON_LEFT) {
                    mouse_dragging = true;
                    drag_start = Vec2((float)event.button.x + renderer.camera.x,
                                      (float)event.button.y + renderer.camera.y);
                }
            } else if (event.type == SDL_MOUSEBUTTONUP && !menu.is_open) {
                if (event.button.button == SDL_BUTTON_LEFT && mouse_dragging) {
                    mouse_dragging = false;
                    Vec2 drag_end = Vec2((float)event.button.x + renderer.camera.x,
                                        (float)event.button.y + renderer.camera.y);
                    Vec2 fling = (drag_start - drag_end) * 4.0f;
                    for (auto& p : gish.particles) {
                        p.vel += fling;
                    }
                    audio.playSound("squish");
                }
            }
        }

        // Poll continuous keyboard inputs
        const Uint8* keys = SDL_GetKeyboardState(nullptr);
        move_x = 0.0f;
        key_jump = false;
        key_duck = false;
        key_sticky = false;
        key_slick = false;
        key_heavy = false;

        if (!menu.is_open) {
            if (keys[SDL_SCANCODE_A] || keys[SDL_SCANCODE_LEFT])  move_x -= 1.0f;
            if (keys[SDL_SCANCODE_D] || keys[SDL_SCANCODE_RIGHT]) move_x += 1.0f;

            key_jump   = keys[SDL_SCANCODE_W] || keys[SDL_SCANCODE_UP] || keys[SDL_SCANCODE_SPACE];
            key_duck   = keys[SDL_SCANCODE_S] || keys[SDL_SCANCODE_DOWN];
            key_sticky = keys[SDL_SCANCODE_LSHIFT] || keys[SDL_SCANCODE_RSHIFT];
            key_slick  = keys[SDL_SCANCODE_LCTRL] || keys[SDL_SCANCODE_RCTRL];
            key_heavy  = keys[SDL_SCANCODE_Q] || keys[SDL_SCANCODE_E] || keys[SDL_SCANCODE_LALT];
        }

        // Frame timing
        Uint64 now = SDL_GetPerformanceCounter();
        double frame_time = (double)(now - prev_counter) / (double)freq;
        prev_counter = now;

        // Prevent spiral of death on lag spike
        if (frame_time > 0.25) frame_time = 0.25;
        accumulator += frame_time;

        // Update toast notification timer
        if (toast_timer > 0.0f) {
            toast_timer -= (float)frame_time;
            if (toast_timer <= 0.0f) {
                toast_msg.clear();
            }
        }

        // Fixed 60 FPS physics updates
        while (accumulator >= dt) {
            gish.applyInput(move_x, key_jump, key_duck, key_sticky, key_slick, key_heavy);
            gish.update((float)dt, tilemap);
            accumulator -= dt;
        }

        // Smooth camera following Gish
        renderer.updateCamera(gish.getCenter(), tilemap.width, tilemap.height);

        // Render scene
        renderer.render(gish, tilemap, current_fps,
                        all_maps[current_map_idx], current_map_idx, (int)all_maps.size(),
                        menu, all_maps, toast_msg);

        // Update FPS counter
        frame_count++;
        if ((double)(now - fps_timer) / (double)freq >= 0.5) {
            current_fps = (float)frame_count / ((double)(now - fps_timer) / (double)freq);
            fps_timer = now;
            frame_count = 0;
        }
    }

    return 0;
}
