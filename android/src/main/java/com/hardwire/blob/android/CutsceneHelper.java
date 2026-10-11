package com.hardwire.blob.android;

import android.util.Log;
import com.hardwire.blob.Main;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
    private static Method mLoadLevelInAr; // ar.a(byte,byte) — same loader the level-select cheat uses
    private static boolean reflectionInit = false;
    private static volatile boolean skipRequested = false;

    // New Game boots into the intro cutscene (level 93). The engine's own
    // cutscene -> level transition drops Gish FAR inside Level 1 (not at the
    // entrance), so he immediately slides down the slope and the follow-camera
    // "runs away". Instead, as soon as the intro cutscene is detected we do one
    // clean, deterministic load of Level 1 (index 0) at its real start — exactly
    // what the level-select cheat does (ar.b = 0; ar.a(0,0)).
    private static volatile boolean levelOneLoaded = false;

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
                    try {
                        mLoadLevelInAr = ar.getClass().getMethod("a", byte.class, byte.class);
                        mLoadLevelInAr.setAccessible(true);
                    } catch (Throwable t) {
                        Log.e(TAG, "Could not resolve ar.a(byte,byte) level loader", t);
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
            // One-shot. The first time the intro cutscene (scene 93) appears after
            // launch is New Game -> clean-load Level 1 at its entrance. After that
            // NEVER touch scene 93 again: natural end-of-level transitions can also
            // pass through it, and re-hijacking them froze the game ("при переходе
            // зависает").
            if (levelOneLoaded) return;
            if (getCurrentLevel(midlet) == 93) {
                levelOneLoaded = true;
                startLevelOne(midlet);
            }
        } catch (Throwable ignored) {}
    }

    /** Clean, deterministic load of Level 1 (index 0) at its start — the exact
     *  mechanism the level-select cheat uses (ar.b = 0; ar.a(0,0)). */
    private static void startLevelOne(Main midlet) {
        try {
            if (fArInMain == null || fLevelInAr == null || mLoadLevelInAr == null) {
                Log.w(TAG, "startLevelOne: reflection not ready, leaving cutscene as-is");
                return;
            }
            Object ar = fArInMain.get(midlet);
            if (ar == null) return;
            fLevelInAr.setInt(ar, 0);                       // level index 0 = Sewer 1
            mLoadLevelInAr.invoke(ar, (byte) 0, (byte) 0);  // load it at its entrance
            Log.i(TAG, "New Game: clean-loaded Level 1 (index 0) at its start");
        } catch (Throwable t) {
            Log.e(TAG, "startLevelOne failed", t);
        }
    }
}
