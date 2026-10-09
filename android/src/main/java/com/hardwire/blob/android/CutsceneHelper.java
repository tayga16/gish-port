package com.hardwire.blob.android;

import android.util.Log;
import com.hardwire.blob.Main;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class CutsceneHelper {
    private static final String TAG = "CutsceneHelper";

    private static Field fArInMain;
    private static Field fLevelInAr;
    private static Field fModeInAr;
    private static Field fNextModeInAr;
    private static Field fAcInAr;
    private static Field fStageInAc;
    private static Field fDialogAnimInAc;
    private static boolean reflectionInit = false;
    private static volatile boolean skipRequested = false;

    // Watchdog: let the intro cutscene (level 93) play through its natural
    // transition into Level 1 so the level/physics initialize correctly. Only
    // force a skip as a safety net if it stays stuck far longer than normal.
    // Instantly skipping (the old behaviour) dropped Gish into Level 1 before
    // spawn/camera init, which is what caused the "camera slides away" bug.
    private static volatile long cutsceneStartTime = 0L;
    private static final long CUTSCENE_WATCHDOG_MS = 15000L;

    private CutsceneHelper() {}

    public static synchronized void init(Main midlet) {
        if (reflectionInit || midlet == null) return;
        try {
            for (Field f : Main.class.getDeclaredFields()) {
                if ("ar".equals(f.getType().getName())) {
                    f.setAccessible(true);
                    fArInMain = f;
                    break;
                }
            }
            if (fArInMain != null) {
                Object ar = fArInMain.get(midlet);
                if (ar != null) {
                    for (Field f : ar.getClass().getDeclaredFields()) {
                        f.setAccessible(true);
                        if (!Modifier.isStatic(f.getModifiers()) && f.getType() == int.class && "b".equals(f.getName())) fLevelInAr = f;
                        if (!Modifier.isStatic(f.getModifiers()) && f.getType() == byte.class && "c".equals(f.getName())) fModeInAr = f;
                        if (!Modifier.isStatic(f.getModifiers()) && f.getType() == byte.class && "d".equals(f.getName())) fNextModeInAr = f;
                        if ("ac".equals(f.getType().getName())) fAcInAr = f;
                    }
                    if (fAcInAr != null) {
                        Object ac = fAcInAr.get(ar);
                        if (ac != null) {
                            for (Field f : ac.getClass().getDeclaredFields()) {
                                f.setAccessible(true);
                                if (!Modifier.isStatic(f.getModifiers()) && f.getType() == int.class) {
                                    if ("c".equals(f.getName())) fStageInAc = f;
                                    if ("e".equals(f.getName())) fDialogAnimInAc = f;
                                }
                            }
                            reflectionInit = true;
                        }
                    }
                }
            }
        } catch (Throwable t) {
            Log.e(TAG, "Failed to resolve cutscene fields", t);
        }
    }

    public static int getCurrentLevel(Main midlet) {
        init(midlet);
        try {
            if (fArInMain != null && fLevelInAr != null) {
                Object ar = fArInMain.get(midlet);
                if (ar != null) return ((Number) fLevelInAr.get(ar)).intValue();
            }
        } catch (Throwable ignored) {}
        return -1;
    }

    public static int getCurrentMode(Main midlet) {
        init(midlet);
        try {
            if (fArInMain != null && fModeInAr != null) {
                Object ar = fArInMain.get(midlet);
                if (ar != null) return ((Number) fModeInAr.get(ar)).intValue();
            }
        } catch (Throwable ignored) {}
        return -1;
    }

    public static boolean isCutsceneActive(Main midlet) {
        return getCurrentLevel(midlet) == 93;
    }

    public static synchronized boolean skipCutscene(Main midlet) {
        init(midlet);
        try {
            if (fArInMain != null && fNextModeInAr != null) {
                Object ar = fArInMain.get(midlet);
                if (ar != null) {
                    int lvl = getCurrentLevel(midlet);
                    if (lvl == 93 && !skipRequested) {
                        skipRequested = true;
                        Log.i(TAG, "Requesting clean game-thread transition to Level 73 via nextMode=5");
                        fNextModeInAr.set(ar, (byte) 5);
                        return true;
                    }
                }
            }
        } catch (Throwable t) {
            Log.e(TAG, "Failed to skip cutscene", t);
        }
        return false;
    }

    public static void ensureDialogueDismissible(Main midlet) {
        init(midlet);
        try {
            if (fArInMain != null && fAcInAr != null && fDialogAnimInAc != null) {
                Object ar = fArInMain.get(midlet);
                if (ar != null) {
                    Object ac = fAcInAr.get(ar);
                    if (ac != null) {
                        int e = ((Number) fDialogAnimInAc.get(ac)).intValue();
                        if (e < 8) {
                            fDialogAnimInAc.set(ac, 8);
                        }
                    }
                }
            }
        } catch (Throwable ignored) {}
    }

    public static void updateWatchdog(Main midlet) {
        init(midlet);
        try {
            int level = getCurrentLevel(midlet);
            if (level != 93) {
                // Not in the intro cutscene: reset watchdog state.
                cutsceneStartTime = 0L;
                skipRequested = false;
                return;
            }
            // In the intro cutscene: let it run so Level 1 initializes properly.
            long nowMs = System.currentTimeMillis();
            if (cutsceneStartTime == 0L) {
                cutsceneStartTime = nowMs;
            }
            if (!skipRequested && (nowMs - cutsceneStartTime) >= CUTSCENE_WATCHDOG_MS) {
                Log.w(TAG, "Intro cutscene stuck > " + CUTSCENE_WATCHDOG_MS + "ms; forcing transition to Level 1");
                skipCutscene(midlet);
            }
        } catch (Throwable ignored) {}
    }
}
