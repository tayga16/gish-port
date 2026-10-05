#pragma once
#include <SDL2/SDL.h>
#include "math2d.h"

class GishBlob;
class Tilemap;

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
    void render(const GishBlob& blob, const Tilemap& map, float fps);
    void updateCamera(Vec2 target, int map_width, int map_height);
    void toggleFullscreen();

private:
    void renderTilemap(const Tilemap& map);
    void renderBlob(const GishBlob& blob);
    void renderHUD(const GishBlob& blob, float fps);
    void drawFilledTriangle(Vec2 p1, Vec2 p2, Vec2 p3, SDL_Color color);
    void drawCircle(Vec2 center, float radius, SDL_Color color);
};
