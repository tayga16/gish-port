#include "physics.h"
#include "tilemap.h"
#include <cmath>
#include <algorithm>

const float PI = 3.14159265358979323846f;

GishBlob::GishBlob(Vec2 spawn_pos, float radius)
    : state_flags(STATE_NORMAL), base_radius(radius), roll_torque(0.0f), on_ground(false) {
    reset(spawn_pos);
}

void GishBlob::reset(Vec2 spawn_pos) {
    particles.clear();
    springs.clear();
    center = spawn_pos;
    look_dir = Vec2(1.0f, 0.0f);

    // Center particle
    particles.emplace_back(spawn_pos, 2.5f, base_radius * 0.4f);

    // Ring particles
    for (int i = 0; i < NUM_RING; ++i) {
        float angle = (float)i * (2.0f * PI / (float)NUM_RING);
        Vec2 offset(std::cos(angle) * base_radius, std::sin(angle) * base_radius);
        particles.emplace_back(spawn_pos + offset, 1.0f, 6.0f);
    }

    // 1. Ring perimeter springs
    for (int i = 0; i < NUM_RING; ++i) {
        int next = (i + 1) % NUM_RING;
        float len = (particles[i + 1].pos - particles[next + 1].pos).length();
        springs.emplace_back(i + 1, next + 1, len, 320.0f, 15.0f);
    }

    // 2. Center spoke springs
    for (int i = 0; i < NUM_RING; ++i) {
        springs.emplace_back(0, i + 1, base_radius, 280.0f, 14.0f);
    }

    // 3. Cross-strut springs (to prevent inverted collapsing)
    for (int i = 0; i < NUM_RING; ++i) {
        int cross = (i + 4) % NUM_RING;
        float len = (particles[i + 1].pos - particles[cross + 1].pos).length();
        springs.emplace_back(i + 1, cross + 1, len, 180.0f, 10.0f);
    }

    target_area = PI * base_radius * base_radius;
}

float GishBlob::getAverageRadius() const {
    float sum = 0.0f;
    for (int i = 1; i <= NUM_RING; ++i) {
        sum += (particles[i].pos - particles[0].pos).length();
    }
    return sum / (float)NUM_RING;
}

void GishBlob::applyInput(float move_x, bool jump, bool duck, bool sticky, bool slick, bool heavy) {
    state_flags = STATE_NORMAL;
    if (sticky) state_flags |= STATE_STICKY;
    if (slick)  state_flags |= STATE_SLICK;
    if (heavy)  state_flags |= STATE_HEAVY;

    // Rolling torque
    roll_torque = move_x * 480.0f;
    if (move_x != 0.0f) {
        look_dir.x = move_x > 0 ? 1.0f : -1.0f;
    }

    // Jump / Expand impulse
    if (jump && on_ground) {
        for (auto& p : particles) {
            p.vel.y = (state_flags & STATE_HEAVY) ? -280.0f : -420.0f;
            p.vel.x += move_x * 80.0f;
        }
        for (auto& s : springs) {
            if (s.p1 == 0 || s.p2 == 0) {
                s.rest_length = s.base_length * 1.35f;
            }
        }
    } else if (duck) {
        // Flatten
        for (int i = 1; i <= NUM_RING; ++i) {
            float dy = particles[i].pos.y - particles[0].pos.y;
            if (dy > 0) particles[i].vel.x += (particles[i].pos.x > particles[0].pos.x ? 40.0f : -40.0f);
        }
    } else {
        // Return springs toward base rest length
        for (auto& s : springs) {
            s.rest_length += (s.base_length - s.rest_length) * 0.1f;
        }
    }
}

void GishBlob::update(float dt, const Tilemap& map) {
    updateSprings(dt);
    updatePressure(dt);
    integrate(dt);
    resolveCollisions(map);

    // Update center and eyes
    center = particles[0].pos;
    Vec2 face_offset = look_dir.normalized() * (base_radius * 0.35f);
    eye_pos_left = center + face_offset + Vec2(-4.0f, -4.0f);
    eye_pos_right = center + face_offset + Vec2(4.0f, -4.0f);
}

void GishBlob::updateSprings(float dt) {
    for (auto& s : springs) {
        Particle& p1 = particles[s.p1];
        Particle& p2 = particles[s.p2];

        Vec2 delta = p2.pos - p1.pos;
        float dist = delta.length();
        if (dist < 0.0001f) continue;

        Vec2 dir = delta / dist;
        float displacement = dist - s.rest_length;
        Vec2 rel_vel = p2.vel - p1.vel;
        float damping_force = rel_vel.dot(dir) * s.damping;

        float spring_force = displacement * s.stiffness;
        Vec2 total_force = dir * (spring_force + damping_force);

        p1.force += total_force;
        p2.force -= total_force;
    }
}

void GishBlob::updatePressure(float dt) {
    // Calculate current polygon area via Shoelace formula
    float current_area = 0.0f;
    for (int i = 0; i < NUM_RING; ++i) {
        int next = (i + 1) % NUM_RING;
        const Vec2& p1 = particles[i + 1].pos;
        const Vec2& p2 = particles[next + 1].pos;
        current_area += (p1.x * p2.y - p2.x * p1.y);
    }
    current_area = std::abs(current_area) * 0.5f;

    float area_diff = target_area - current_area;
    float pressure = area_diff * 1.8f; // Pressure coefficient

    for (int i = 0; i < NUM_RING; ++i) {
        int next = (i + 1) % NUM_RING;
        Particle& p1 = particles[i + 1];
        Particle& p2 = particles[next + 1];

        Vec2 edge = p2.pos - p1.pos;
        Vec2 normal(edge.y, -edge.x); // Outward normal
        float len = normal.length();
        if (len > 0.0001f) {
            Vec2 normal_dir = normal / len;
            Vec2 p_force = normal_dir * (pressure * len * 0.08f);
            p1.force += p_force * 0.5f;
            p2.force += p_force * 0.5f;
        }
    }
}

void GishBlob::integrate(float dt) {
    float gravity_y = (state_flags & STATE_HEAVY) ? 1400.0f : 850.0f;
    float mass_mult = (state_flags & STATE_HEAVY) ? 3.5f : 1.0f;

    for (int i = 0; i < TOTAL_PARTICLES; ++i) {
        Particle& p = particles[i];
        p.force.y += gravity_y * (p.mass * mass_mult);

        // Apply roll torque to outer ring
        if (i > 0 && roll_torque != 0.0f) {
            Vec2 radial = (p.pos - particles[0].pos);
            Vec2 tangent(-radial.y, radial.x);
            tangent = tangent.normalized();
            p.force += tangent * (roll_torque * (on_ground ? 1.0f : 0.35f));
        }

        // Acceleration
        Vec2 acc = p.force / (p.mass * mass_mult);
        p.vel += acc * dt;

        // Air damping
        p.vel *= 0.992f;

        // Position update
        p.old_pos = p.pos;
        p.pos += p.vel * dt;

        p.force = Vec2(0.0f, 0.0f);
        p.is_contact = false;
    }
}

void GishBlob::resolveCollisions(const Tilemap& map) {
    on_ground = false;

    float friction = 0.85f;
    if (state_flags & STATE_SLICK) friction = 0.02f; // Ice-like slip
    else if (state_flags & STATE_STICKY) friction = 1.0f; // Climbing stick

    for (int i = 0; i < TOTAL_PARTICLES; ++i) {
        Particle& p = particles[i];

        Vec2 cp, normal;
        float depth = 0.0f;

        if (map.checkCollision(p.pos, p.radius, cp, normal, depth)) {
            p.pos += normal * depth;
            p.is_contact = true;
            p.contact_normal = normal;

            if (normal.y < -0.5f) {
                on_ground = true;
            }

            // Normal and tangential velocities
            float v_dot_n = p.vel.dot(normal);
            if (v_dot_n < 0.0f) {
                Vec2 v_norm = normal * v_dot_n;
                Vec2 v_tang = p.vel - v_norm;

                if (state_flags & STATE_STICKY) {
                    // Stick completely to wall / ceiling / floor
                    p.vel = Vec2(0, 0);
                    on_ground = true; // Can jump off walls when sticky!
                } else {
                    float restitution = (state_flags & STATE_SLICK) ? 0.35f : 0.1f;
                    p.vel = v_tang * (1.0f - friction) - v_norm * restitution;
                }
            }
        }
    }
}
