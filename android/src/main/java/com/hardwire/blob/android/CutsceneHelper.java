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
    private static Method mLoadLevelInAr;
    private static Method mSaveLevelInAr;
    private static boolean reflectionInit = false;

    private static long cutscene93StartTime = 0;
    private static boolean skipTriggered = false;

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
                    for (Method m : ar.getClass().getDeclaredMethods()) {
                        m.setAccessible(true);
                        if ("a".equals(m.getName()) && m.getParameterTypes().length == 2
                                && m.getParameterTypes()[0] == byte.class && m.getParameterTypes()[1] == byte.class) {
                            mLoadLevelInAr = m;
                        }
                        if ("a".equals(m.getName()) && m.getParameterTypes().length == 2
                                && m.getParameterTypes()[0] == String.class && m.getParameterTypes()[1] == int.class) {
                            mSaveLevelInAr = m;
                        }
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
            if (fArInMain != null && fLevelInAr != null) {
                Object ar = fArInMain.get(midlet);
                if (ar != null) {
                    int lvl = getCurrentLevel(midlet);
                    if (lvl == 93) {
                        Log.i(TAG, "Fast-skipping cutscene 93 -> Level 73 directly");
                        // 1. Set Level = 73
                        fLevelInAr.set(ar, 73);

                        // 2. Save progress
                        if (mSaveLevelInAr != null) {
                            try {
                                mSaveLevelInAr.invoke(ar, "save", 73);
                            } catch (Throwable ignored) {}
                        }

                        // 3. Directly invoke level loader: ar.a((byte)1, (byte)0)
                        if (mLoadLevelInAr != null) {
                            mLoadLevelInAr.invoke(ar, (byte) 1, (byte) 0);
                        } else {
                            // Fallback to mode 5 if direct loader not found
                            if (fNextModeInAr != null) {
                                fNextModeInAr.set(ar, (byte) 5);
                            }
                        }
                        skipTriggered = true;
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
                cutscene93StartTime = 0;
                skipTriggered = false;
                return;
            }

            if (skipTriggered) {
                return;
            }

            long now = System.currentTimeMillis();
            if (cutscene93StartTime == 0) {
                cutscene93StartTime = now;
            }

            // Auto-advance watchdog: if Level 93 runs for > 2000ms (2 seconds),
            // auto-advance straight to Level 73 so the camera never freezes or drifts.
            if ((now - cutscene93StartTime) > 2000) {
                Log.w(TAG, "Watchdog: Cutscene 93 timer exceeded (>2s), auto-loading Level 73");
                skipCutscene(midlet);
            }
        } catch (Throwable ignored) {}
    }
}
