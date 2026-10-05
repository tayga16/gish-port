#include "audio.h"
#include <iostream>

AudioEngine::AudioEngine() : device_id(0) {}

AudioEngine::~AudioEngine() {
    for (auto& pair : sounds) {
        if (pair.second.buffer) {
            SDL_free(pair.second.buffer);
        }
    }
    if (device_id > 0) {
        SDL_CloseAudioDevice(device_id);
    }
}

bool AudioEngine::init() {
    SDL_AudioSpec desired;
    SDL_zero(desired);
    desired.freq = 44100;
    desired.format = AUDIO_S16SYS;
    desired.channels = 2;
    desired.samples = 2048;

    device_id = SDL_OpenAudioDevice(nullptr, 0, &desired, &device_spec, 0);
    if (device_id == 0) {
        std::cerr << "Failed to open SDL audio: " << SDL_GetError() << "\n";
        return false;
    }

    SDL_PauseAudioDevice(device_id, 0); // Unpause
    return true;
}

bool AudioEngine::loadWAV(const std::string& name, const std::string& path) {
    SDL_AudioSpec wav_spec;
    Uint8* wav_buf = nullptr;
    Uint32 wav_len = 0;

    if (!SDL_LoadWAV(path.c_str(), &wav_spec, &wav_buf, &wav_len)) {
        return false;
    }

    // Convert to device format
    SDL_AudioCVT cvt;
    if (SDL_BuildAudioCVT(&cvt, wav_spec.format, wav_spec.channels, wav_spec.freq,
                          device_spec.format, device_spec.channels, device_spec.freq) < 0) {
        SDL_free(wav_buf);
        return false;
    }

    cvt.len = (int)wav_len;
    cvt.buf = (Uint8*)SDL_malloc(cvt.len * cvt.len_mult);
    SDL_memcpy(cvt.buf, wav_buf, wav_len);
    SDL_free(wav_buf);

    if (SDL_ConvertAudio(&cvt) < 0) {
        SDL_free(cvt.buf);
        return false;
    }

    SoundEffect sfx;
    sfx.buffer = cvt.buf;
    sfx.length = (Uint32)cvt.len_cvt;
    sfx.spec = device_spec;

    sounds[name] = sfx;
    return true;
}

void AudioEngine::playSound(const std::string& name) {
    auto it = sounds.find(name);
    if (it != sounds.end() && device_id > 0) {
        SDL_QueueAudio(device_id, it->second.buffer, it->second.length);
    }
}
