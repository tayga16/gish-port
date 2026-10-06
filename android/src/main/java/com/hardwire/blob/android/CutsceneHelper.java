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

    private static long stage2StartTime = 0;
    private static long stage3StartTime = 0;
    private static int lastStage = -1;

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

    public static boolean skipCutscene(Main midlet) {
        init(midlet);
        try {
            if (fArInMain != null && fNextModeInAr != null) {
                Object ar = fArInMain.get(midlet);
                if (ar != null) {
                    int lvl = getCurrentLevel(midlet);
                    if (lvl == 93) {
                        Log.i(TAG, "Skipping intro cutscene 93 -> nextMode=5 (Level 73)");
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
                stage2StartTime = 0;
                stage3StartTime = 0;
                lastStage = -1;
                return;
            }

            Object ar = fArInMain != null ? fArInMain.get(midlet) : null;
            Object ac = (ar != null && fAcInAr != null) ? fAcInAr.get(ar) : null;
            if (ac == null) return;

            int stage = fStageInAc != null ? ((Number) fStageInAc.get(ac)).intValue() : -1;
            long now = System.currentTimeMillis();

            if (stage != lastStage) {
                lastStage = stage;
                if (stage == 2) stage2StartTime = now;
                if (stage == 3) stage3StartTime = now;
            }

            // Watchdog 1: Stage 2 (Monster pulling Brea down into pipe)
            // If stuck for > 6 seconds, advance to next stage or skip to Level 73
            if (stage == 2 && stage2StartTime > 0 && (now - stage2StartTime) > 6000) {
                Log.w(TAG, "Watchdog: Cutscene 93 Stage 2 timeout (>6s), auto-advancing to Level 73");
                skipCutscene(midlet);
                stage2StartTime = 0;
            }

            // Watchdog 2: Stage 3 (Gish jumping to pipe)
            // If taking > 4 seconds, complete level transition
            if (stage == 3 && stage3StartTime > 0 && (now - stage3StartTime) > 4000) {
                Log.w(TAG, "Watchdog: Cutscene 93 Stage 3 timeout (>4s), auto-advancing to Level 73");
                skipCutscene(midlet);
                stage3StartTime = 0;
            }
        } catch (Throwable ignored) {}
    }
}
