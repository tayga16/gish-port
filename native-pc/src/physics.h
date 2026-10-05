#pragma once
#include "math2d.h"
#include <vector>

enum GishState {
    STATE_NORMAL = 0,
    STATE_STICKY = (1 << 0),
    STATE_SLICK  = (1 << 1),
    STATE_HEAVY  = (1 << 2),
    STATE_EXPAND = (1 << 3)
};

struct Particle {
    Vec2 pos;
    Vec2 old_pos;
    Vec2 vel;
    Vec2 force;
    float mass;
    float radius;
    bool is_contact;
    Vec2 contact_normal;

    Particle(Vec2 p, float m = 1.0f, float r = 6.0f)
        : pos(p), old_pos(p), vel(0, 0), force(0, 0), mass(m), radius(r),
          is_contact(false), contact_normal(0, 0) {}
};

struct Spring {
    int p1;
    int p2;
    float rest_length;
    float base_length;
    float stiffness;
    float damping;

    Spring(int a, int b, float len, float k = 280.0f, float d = 12.0f)
        : p1(a), p2(b), rest_length(len), base_length(len), stiffness(k), damping(d) {}
};

class Tilemap;

class GishBlob {
public:
    static const int NUM_RING = 12;
    static const int TOTAL_PARTICLES = NUM_RING + 1; // 0 is center, 1..12 is ring

    std::vector<Particle> particles;
    std::vector<Spring> springs;

    int state_flags;
    float base_radius;
    float target_area;
    Vec2 center;
    Vec2 eye_pos_left;
    Vec2 eye_pos_right;
    Vec2 look_dir;
    float roll_torque;
    bool on_ground;

    GishBlob(Vec2 spawn_pos, float radius = 24.0f);

    void reset(Vec2 spawn_pos);
    void update(float dt, const Tilemap& map);
    void applyInput(float move_x, bool jump, bool duck, bool sticky, bool slick, bool heavy);

    Vec2 getCenter() const { return particles[0].pos; }
    float getAverageRadius() const;

private:
    void updateSprings(float dt);
    void updatePressure(float dt);
    void integrate(float dt);
    void resolveCollisions(const Tilemap& map);
};
