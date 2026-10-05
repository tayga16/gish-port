#include <SDL2/SDL.h>
#include <iostream>
#include <chrono>
#include "renderer.h"
#include "physics.h"
#include "tilemap.h"
#include "audio.h"

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

    Tilemap tilemap;
    // Attempt to load level 1 or use default level
    if (!tilemap.loadLevel("resources/c0.lvl")) {
        tilemap.createDefaultLevel(50, 30);
    }

    GishBlob gish(tilemap.spawn_point, 24.0f);

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

    while (running) {
        while (SDL_PollEvent(&event)) {
            if (event.type == SDL_QUIT) {
                running = false;
            } else if (event.type == SDL_KEYDOWN) {
                switch (event.key.keysym.sym) {
                    case SDLK_ESCAPE: running = false; break;
                    case SDLK_F11: renderer.toggleFullscreen(); break;
                    case SDLK_r: gish.reset(tilemap.spawn_point); break;
                }
            } else if (event.type == SDL_MOUSEBUTTONDOWN) {
                if (event.button.button == SDL_BUTTON_LEFT) {
                    mouse_dragging = true;
                    drag_start = Vec2((float)event.button.x + renderer.camera.x,
                                      (float)event.button.y + renderer.camera.y);
                }
            } else if (event.type == SDL_MOUSEBUTTONUP) {
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
        if (keys[SDL_SCANCODE_A] || keys[SDL_SCANCODE_LEFT])  move_x -= 1.0f;
        if (keys[SDL_SCANCODE_D] || keys[SDL_SCANCODE_RIGHT]) move_x += 1.0f;

        key_jump   = keys[SDL_SCANCODE_W] || keys[SDL_SCANCODE_UP] || keys[SDL_SCANCODE_SPACE];
        key_duck   = keys[SDL_SCANCODE_S] || keys[SDL_SCANCODE_DOWN];
        key_sticky = keys[SDL_SCANCODE_LSHIFT] || keys[SDL_SCANCODE_RSHIFT];
        key_slick  = keys[SDL_SCANCODE_LCTRL] || keys[SDL_SCANCODE_RCTRL];
        key_heavy  = keys[SDL_SCANCODE_Q] || keys[SDL_SCANCODE_E] || keys[SDL_SCANCODE_LALT];

        // Frame timing
        Uint64 now = SDL_GetPerformanceCounter();
        double frame_time = (double)(now - prev_counter) / (double)freq;
        prev_counter = now;

        // Prevent spiral of death on lag spike
        if (frame_time > 0.25) frame_time = 0.25;
        accumulator += frame_time;

        // Fixed 60 FPS physics updates
        while (accumulator >= dt) {
            gish.applyInput(move_x, key_jump, key_duck, key_sticky, key_slick, key_heavy);
            gish.update((float)dt, tilemap);
            accumulator -= dt;
        }

        // Smooth camera following Gish
        renderer.updateCamera(gish.getCenter(), tilemap.width, tilemap.height);

        // Render scene
        renderer.render(gish, tilemap, current_fps);

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
