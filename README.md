# Gish Mobile Port (Android & PC)

Open-source modernization and native port of the cult classic physics platformer **Gish (J2ME version 1.3.3)** to modern **Android** devices and **PC / Desktop**.

Original game created by Edmund McMillen & Alex Austin (Chronic Logic / Cryptic Sea). Mobile J2ME adaptation originally developed by Hardwire.

---

## 🎯 Goals

1. **Android (Primary Focus):**
   - Native APK running directly on modern Android devices (ART/NDK).
   - Full touch screen input support utilizing the native touch pointer handlers found in the original J2ME build.
   - Smooth pixel-perfect / integer scaling for high-resolution displays (1080p, 1440p, 4K).
   - Audio playback using `SoundPool` (sound effects) and `MediaPlayer` (background music).
   - Modern save system replacing J2ME RMS with Android persistent storage.

2. **PC / Desktop:**
   - Standalone desktop build (Windows / Linux / macOS).
   - Keyboard, gamepad, and mouse controls.
   - Clean windowed / fullscreen modes.

---

## 📁 Project Architecture

```
gish-mobile-port/
├── core/                  # Core game logic and extracted assets
│   ├── src/main/java/     # 60 decompiled classes (physics, levels, logic, entities)
│   └── src/main/resources/# Binary levels (*.lvl), audio (*.wav, *.mp3), sprites, textures
├── compat-layer/          # Lightweight J2ME API compatibility bridge
│   └── src/main/java/     # Implementations of javax.microedition (LCDUI, Media, RMS)
├── android/               # Android platform application module
│   └── src/main/          # MainActivity, SurfaceView/Canvas, Android Touch & Audio
└── desktop/               # Desktop platform runner module
    └── src/main/          # Swing / AWT / LWJGL desktop frontend
```

---

## 🕹️ Technical Details

* **Engine:** 2D soft-body physics engine (simulating Gish's tar ball mechanics: sticky, heavy, slippery, expand).
* **Entry Point:** `com.hardwire.blob.Main` (originally extending `javax.microedition.midlet.MIDlet`).
* **Display / Rendering:** `ad.java` (originally extending `javax.microedition.lcdui.Canvas`).
* **Touch Support:** The original 1.3.3 JAR already included native touch listeners (`pointerPressed`, `pointerReleased`, `pointerDragged`), allowing direct mapping to Android `MotionEvent` and desktop mouse clicks.
* **Audio:** WAV sound effects (`sound/*.wav`) and MP3 music (`sound/sewer.mp3`).

---

## 🛠️ Getting Started & Building

### Prerequisites
* Java JDK 8 or newer (JDK 17+ recommended for modern Android Studio).
* Android Studio / Android SDK (for building the Android APK).
* Git.

---

## 🚀 Pushing to GitHub

To link this repository to your own GitHub account:

1. Create a new repository on [GitHub](https://github.com/new) named `gish-mobile-port`.
2. Run the following commands in this directory:

```bash
git remote add origin https://github.com/<YOUR_USERNAME>/gish-mobile-port.git
git branch -M main
git push -u origin main
```
