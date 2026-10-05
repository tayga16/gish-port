#pragma once
#include "math2d.h"
#include <vector>
#include <string>

struct TileInfo {
    bool is_solid;
    bool is_breakable;
    bool is_hazard;
    bool is_exit;
    int tile_id;
};

class Tilemap {
public:
    static const int TILE_SIZE = 32;

    int width;
    int height;
    int tileset;
    Vec2 spawn_point;
    Vec2 exit_point;
    std::vector<int> tiles; // Layer 1 (Collision & terrain)
    std::vector<int> bg_tiles; // Layer 0 (Background)

    Tilemap();

    bool loadLevel(const std::string& filepath);
    void createDefaultLevel(int w = 40, int h = 25);

    int getTile(int tx, int ty) const;
    void setTile(int tx, int ty, int val);

    bool isSolid(int tx, int ty) const;
    bool isBreakable(int tx, int ty) const;
    bool isHazard(int tx, int ty) const;

    bool checkCollision(Vec2 pos, float radius, Vec2& contact_point, Vec2& normal, float& depth) const;
    bool breakBlock(int tx, int ty);
};
