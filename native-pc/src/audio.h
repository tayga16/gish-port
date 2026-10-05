#pragma once
#include <SDL2/SDL.h>
#include <string>
#include <map>
#include <vector>

struct SoundEffect {
    Uint8* buffer;
    Uint32 length;
    SDL_AudioSpec spec;
};

class AudioEngine {
public:
    SDL_AudioDeviceID device_id;
    SDL_AudioSpec device_spec;
    std::map<std::string, SoundEffect> sounds;

    AudioEngine();
    ~AudioEngine();

    bool init();
    bool loadWAV(const std::string& name, const std::string& path);
    void playSound(const std::string& name);
};
