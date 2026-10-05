#include "tilemap.h"
#include <fstream>
#include <iostream>
#include <algorithm>

Tilemap::Tilemap() : width(40), height(25), tileset(0), spawn_point(120, 200), exit_point(1000, 200) {
    createDefaultLevel(width, height);
}

void Tilemap::createDefaultLevel(int w, int h) {
    width = w;
    height = h;
    tiles.assign(width * height, 0);
    bg_tiles.assign(width * height, 0);

    // Floor, ceiling, side walls
    for (int x = 0; x < width; ++x) {
        setTile(x, 0, 1);
        setTile(x, height - 1, 1);
        setTile(x, height - 2, 1);
    }
    for (int y = 0; y < height; ++y) {
        setTile(0, y, 1);
        setTile(width - 1, y, 1);
    }

    // Platforms and obstacles
    for (int x = 5; x < 14; ++x) setTile(x, 18, 1);
    for (int x = 18; x < 28; ++x) setTile(x, 15, 1);
    for (int x = 12; x < 22; ++x) setTile(x, 11, 1);
    for (int x = 28; x < 36; ++x) setTile(x, 8, 1);

    // Vertical wall to test sticky climbing
    for (int y = 6; y < 16; ++y) setTile(16, y, 1);

    // Breakable blocks (ID 2)
    for (int x = 8; x < 12; ++x) setTile(x, 21, 2);

    spawn_point = Vec2(100.0f, 480.0f);
    exit_point = Vec2(1100.0f, 180.0f);
}

bool Tilemap::loadLevel(const std::string& filepath) {
    std::ifstream file(filepath, std::ios::binary);
    if (!file.is_open()) {
        std::cerr << "Could not open level file: " << filepath << "\n";
        return false;
    }

    // Read Gish mobile level header
    unsigned char w_byte = 0, h_byte = 0, ts_byte = 0;
    file.read((char*)&w_byte, 1);
    file.read((char*)&h_byte, 1);
    file.read((char*)&ts_byte, 1);

    width = w_byte > 0 ? (int)w_byte : 40;
    height = h_byte > 0 ? (int)h_byte : 25;
    tileset = ts_byte;
    int size = width * height;

    tiles.assign(size, 0);
    bg_tiles.assign(size, 0);

    // Read Layer 0 (Background)
    std::vector<char> buf0(size);
    if (file.read(buf0.data(), size)) {
        for (int i = 0; i < size; ++i) bg_tiles[i] = (unsigned char)buf0[i];
    }

    // Read Layer 1 (Foreground / Collision terrain)
    std::vector<char> buf1(size);
    if (file.read(buf1.data(), size)) {
        for (int i = 0; i < size; ++i) tiles[i] = (unsigned char)buf1[i];
    } else {
        // Fallback if only 1 layer exists
        tiles = bg_tiles;
    }

    // Find spawn position: search from bottom-left for safe empty spot on top of floor
    bool found_spawn = false;
    for (int y = height - 2; y >= 2; --y) {
        for (int x = 2; x < width - 2; ++x) {
            if (getTile(x, y) == 0 && getTile(x, y - 1) == 0 && isSolid(x, y + 1)) {
                spawn_point = Vec2((float)x * TILE_SIZE + 16.0f, (float)y * TILE_SIZE + 16.0f);
                found_spawn = true;
                break;
            }
        }
        if (found_spawn) break;
    }

    if (!found_spawn) {
        spawn_point = Vec2(100.0f, (float)(height - 4) * TILE_SIZE);
    }

    return true;
}

int Tilemap::getTile(int tx, int ty) const {
    if (tx < 0 || tx >= width || ty < 0 || ty >= height) return 1; // Solid boundary
    return tiles[ty * width + tx];
}

void Tilemap::setTile(int tx, int ty, int val) {
    if (tx >= 0 && tx < width && ty >= 0 && ty < height) {
        tiles[ty * width + tx] = val;
    }
}

bool Tilemap::isSolid(int tx, int ty) const {
    int t = getTile(tx, ty);
    return t > 0;
}

bool Tilemap::isBreakable(int tx, int ty) const {
    return getTile(tx, ty) == 2;
}

bool Tilemap::isHazard(int tx, int ty) const {
    return getTile(tx, ty) == 9; // Spikes
}

bool Tilemap::breakBlock(int tx, int ty) {
    if (isBreakable(tx, ty)) {
        setTile(tx, ty, 0);
        return true;
    }
    return false;
}

bool Tilemap::checkCollision(Vec2 pos, float radius, Vec2& contact_point, Vec2& normal, float& depth) const {
    int min_tx = std::max(0, (int)((pos.x - radius) / TILE_SIZE));
    int max_tx = std::min(width - 1, (int)((pos.x + radius) / TILE_SIZE));
    int min_ty = std::max(0, (int)((pos.y - radius) / TILE_SIZE));
    int max_ty = std::min(height - 1, (int)((pos.y + radius) / TILE_SIZE));

    bool collided = false;
    float max_penetration = 0.0f;
    Vec2 best_normal(0, -1);
    Vec2 best_cp = pos;

    for (int ty = min_ty; ty <= max_ty; ++ty) {
        for (int tx = min_tx; tx <= max_tx; ++tx) {
            if (!isSolid(tx, ty)) continue;

            float tile_left = tx * (float)TILE_SIZE;
            float tile_top = ty * (float)TILE_SIZE;
            float tile_right = tile_left + (float)TILE_SIZE;
            float tile_bottom = tile_top + (float)TILE_SIZE;

            // Nearest point on AABB to circle center
            float nearest_x = std::max(tile_left, std::min(pos.x, tile_right));
            float nearest_y = std::max(tile_top, std::min(pos.y, tile_bottom));

            Vec2 delta = pos - Vec2(nearest_x, nearest_y);
            float dist_sq = delta.lengthSq();

            if (dist_sq < radius * radius) {
                float dist = std::sqrt(dist_sq);
                Vec2 n;
                float pen;

                if (dist > 0.0001f) {
                    n = delta / dist;
                    pen = radius - dist;
                } else {
                    // Inside tile - push out to nearest edge
                    float d_left = pos.x - tile_left;
                    float d_right = tile_right - pos.x;
                    float d_top = pos.y - tile_top;
                    float d_bottom = tile_bottom - pos.y;
                    float min_d = std::min({d_left, d_right, d_top, d_bottom});

                    if (min_d == d_top)    n = Vec2(0, -1);
                    else if (min_d == d_bottom) n = Vec2(0, 1);
                    else if (min_d == d_left)   n = Vec2(-1, 0);
                    else                        n = Vec2(1, 0);

                    pen = radius + min_d;
                }

                if (pen > max_penetration) {
                    max_penetration = pen;
                    best_normal = n;
                    best_cp = Vec2(nearest_x, nearest_y);
                    collided = true;
                }
            }
        }
    }

    if (collided) {
        normal = best_normal;
        depth = max_penetration;
        contact_point = best_cp;
    }

    return collided;
}
