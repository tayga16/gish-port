#pragma once
#include <SDL2/SDL.h>
#include <string>
#include <vector>
#include "math2d.h"

class GishBlob;
class Tilemap;

struct CheatMenuState {
    bool is_open = false;
    int selected_item = 0;
    int selected_map_idx = 0;
};

class Renderer {
public:
    SDL_Window* window;
    SDL_Renderer* sdl_renderer;

    int screen_width;
    int screen_height;
    Vec2 camera;

    Renderer(int width = 960, int height = 720);
    ~Renderer();

    bool init();
    void render(const GishBlob& blob, const Tilemap& map, float fps,
                const std::string& current_map_name, int map_index, int total_maps,
                const CheatMenuState& menu, const std::vector<std::string>& all_maps,
                const std::string& toast_msg);
    void updateCamera(Vec2 target, int map_width, int map_height);
    void toggleFullscreen();

private:
    void renderTilemap(const Tilemap& map);
    void renderBlob(const GishBlob& blob);
    void renderHUD(const GishBlob& blob, float fps, const std::string& current_map_name, int map_index, int total_maps);
    void renderCheatMenu(const GishBlob& blob, const CheatMenuState& menu, const std::vector<std::string>& all_maps);
    void renderToast(const std::string& msg);
    void drawCircle(Vec2 center, float radius, SDL_Color color);
};
