package com.hardwire.blob.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.hardwire.blob.Main;
import javax.microedition.midlet.MIDlet;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private static final String TAG = "GISH_PORT";
    private Main midlet;
    private GishGameView gameView;
    private boolean godmode = false;
    private Thread godmodeThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Global crash catcher to prevent silent black screen / crash
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> handleFatalError(e));

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // Bridge Android AssetManager & Storage to MIDlet compat layer
        try {
            MIDlet.setAssetManager(getAssets());
            MIDlet.setFilesDir(getFilesDir());
            Log.i(TAG, "AssetManager & FilesDir initialized successfully");
        } catch (Throwable t) {
            Log.e(TAG, "Failed to initialize MIDlet environment", t);
        }

        try {
            midlet = new Main();
        } catch (Throwable t) {
            Log.e(TAG, "Failed to instantiate Main MIDlet", t);
            handleFatalError(t);
            return;
        }

        FrameLayout root = new FrameLayout(this);
        gameView = new GishGameView(this, midlet);
        root.addView(gameView, new FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        // Floating Cheat & Level Selection Button
        Button cheatButton = new Button(this);
        cheatButton.setText("⚡ ЧИТЫ & УРОВНИ");
        cheatButton.setTextColor(Color.YELLOW);
        cheatButton.setBackgroundColor(0xBB1A1A24);
        cheatButton.setTextSize(13);
        cheatButton.setPadding(24, 12, 24, 12);

        FrameLayout.LayoutParams btnParams = new FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btnParams.gravity = Gravity.TOP | Gravity.END;
        btnParams.setMargins(16, 24, 24, 16);
        root.addView(cheatButton, btnParams);

        cheatButton.setOnClickListener(v -> showMainCheatDialog());

        setContentView(root);

        // Start MIDlet
        invokeMidlet("startApp", new Class<?>[0], new Object[0]);

        // Godmode watcher thread
        godmodeThread = new Thread(() -> {
            while (!isFinishing()) {
                if (godmode) {
                    try {
                        Object ar = getFieldValue(midlet, "a");
                        if (ar != null) {
                            Object ac = getFieldValue(ar, "a");
                            if (ac != null) {
                                Field gField = ac.getClass().getField("g");
                                int current = gField.getInt(ac);
                                if (current < 999) {
                                    gField.setInt(ac, 999);
                                }
                            }
                        }
                    } catch (Exception ignored) {}
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {}
            }
        });
        godmodeThread.setDaemon(true);
        godmodeThread.start();
    }

    private void handleFatalError(final Throwable t) {
        Throwable realCause = t;
        while (realCause instanceof InvocationTargetException && realCause.getCause() != null) {
            realCause = realCause.getCause();
        }
        Log.e(TAG, "FATAL ERROR", realCause);
        final String errorText = Log.getStackTraceString(realCause);
        runOnUiThread(() -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("⚠️ Gish Runtime Error");
            builder.setMessage(errorText);
            builder.setPositiveButton("OK", null);
            builder.setCancelable(false);
            try {
                builder.show();
            } catch (Exception ignored) {}
        });
    }

    private void showMainCheatDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("⚡ GISH CHEAT & LEVEL MENU");

        String[] options = {
            "🗺 Быстрый переход по уровням (Выбор из 106 карт)",
            "💎 Выдать янтарь / коллектоблы (Количество на выбор)",
            godmode ? "🛡 Бессмертие (Godmode): [ВКЛ]" : "🛡 Бессмертие (Godmode): [ВЫКЛ]",
            "🔓 Разблокировать ВСЕ уровни игры (100%)",
            "🔄 Перезапустить текущий уровень",
            "❌ Закрыть меню"
        };

        builder.setItems(options, (dialog, which) -> {
            switch (which) {
                case 0:
                    showLevelSelectDialog();
                    break;
                case 1:
                    showCollectiblesDialog();
                    break;
                case 2:
                    godmode = !godmode;
                    if (godmode) {
                        setCollectibles(999);
                        Toast.makeText(this, "Бессмертие (Godmode) ВКЛЮЧЕНО!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "Бессмертие ВЫКЛЮЧЕНО", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case 3:
                    unlockAllLevels();
                    break;
                case 4:
                    restartCurrentLevel();
                    break;
            }
        });

        builder.show();
    }

    // ========================================================
    // 1. LEVEL SELECTOR (ПЕРЕХОД ПО УРОВНЯМ)
    // ========================================================
    private void showLevelSelectDialog() {
        final List<String> levelList = getAllLevelNames();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Выберите уровень для перехода:");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, levelList);
        builder.setAdapter(adapter, (dialog, which) -> {
            String selected = levelList.get(which);
            jumpToLevel(which, selected);
        });

        builder.setNegativeButton("Отмена", null);
        builder.show();
    }

    private List<String> getAllLevelNames() {
        List<String> list = new ArrayList<>();
        try {
            Class<?> dClass = Class.forName("d");
            Field bField = dClass.getField("b");
            String[] names = (String[]) bField.get(null);
            if (names != null) {
                for (int i = 0; i < names.length; ++i) {
                    list.add("[" + i + "] " + getLevelDescription(names[i]));
                }
                return list;
            }
        } catch (Exception ignored) {}

        // Fallback default list
        for (int i = 0; i <= 26; ++i) list.add("c" + i + " (Канализация / Sewers)");
        for (int i = 0; i <= 9; ++i) list.add("d" + i + " (Пещеры тьмы / Darkness)");
        for (int i = 0; i <= 15; ++i) list.add("e" + i + " (Древний Египет / Egypt)");
        for (int i = 0; i <= 15; ++i) list.add("h" + i + " (Преисподняя / Hell)");
        for (int i = 0; i <= 9; ++i) list.add("r" + i + " (Древние Руины / Ruins)");
        for (int i = 0; i <= 18; ++i) list.add("s" + i + " (Секретные уровни / Secrets)");
        for (int i = 0; i <= 4; ++i) list.add("pl" + i + " (Бонус Playground)");
        return list;
    }

    private String getLevelDescription(String code) {
        if (code == null) return "Неизвестный уровень";
        if (code.startsWith("c")) return code + " - Канализация / Sewers";
        if (code.startsWith("d")) return code + " - Пещеры тьмы / Darkness";
        if (code.startsWith("e")) return code + " - Древний Египет / Egypt";
        if (code.startsWith("h")) return code + " - Преисподняя / Hell";
        if (code.startsWith("r")) return code + " - Древние Руины / Ruins";
        if (code.startsWith("s")) return code + " - Секретные испытания / Secrets";
        if (code.startsWith("pl")) return code + " - Площадка / Playground";
        return code;
    }

    private void jumpToLevel(int levelIndex, String displayName) {
        try {
            Object ar = getFieldValue(midlet, "a");
            if (ar != null) {
                Field bField = ar.getClass().getField("b");
                bField.setInt(ar, levelIndex);

                Method loadMethod = ar.getClass().getMethod("a", byte.class, byte.class);
                loadMethod.invoke(ar, (byte)0, (byte)0);
                Toast.makeText(this, "Загружен уровень: " + displayName, Toast.LENGTH_SHORT).show();
                return;
            }
        } catch (Exception e) {
            Log.e(TAG, "Jump to level failed", e);
        }
        Toast.makeText(this, "Сначала начните новую игру или войдите на уровень!", Toast.LENGTH_LONG).show();
    }

    private void restartCurrentLevel() {
        try {
            Object ar = getFieldValue(midlet, "a");
            if (ar != null) {
                Method loadMethod = ar.getClass().getMethod("a", byte.class, byte.class);
                loadMethod.invoke(ar, (byte)0, (byte)0);
                Toast.makeText(this, "Уровень перезапущен!", Toast.LENGTH_SHORT).show();
                return;
            }
        } catch (Exception e) {
            Log.e(TAG, "Restart level failed", e);
        }
        Toast.makeText(this, "Не удалось перезапустить уровень", Toast.LENGTH_SHORT).show();
    }

    // ========================================================
    // 2. COLLECTIBLES & AMBER (ВЫДАЧА ЯНТАРЯ)
    // ========================================================
    private void showCollectiblesDialog() {
        int currentAmber = getCurrentCollectibles();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("💎 Выдача коллектоблов (Янтарь)");

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 30, 40, 20);

        TextView infoText = new TextView(this);
        infoText.setText("Текущее количество янтаря: " + currentAmber + " шт.\nВыберите сколько добавить или введите число:");
        infoText.setTextSize(14);
        layout.addView(infoText);

        // Quick add buttons
        LinearLayout btnRow1 = new LinearLayout(this);
        btnRow1.setOrientation(LinearLayout.HORIZONTAL);

        Button b100 = new Button(this);
        b100.setText("+100");
        b100.setOnClickListener(v -> setCollectibles(getCurrentCollectibles() + 100));

        Button b500 = new Button(this);
        b500.setText("+500");
        b500.setOnClickListener(v -> setCollectibles(getCurrentCollectibles() + 500));

        Button b9999 = new Button(this);
        b9999.setText("9999 (MAX)");
        b9999.setOnClickListener(v -> setCollectibles(9999));

        btnRow1.addView(b100, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1.0f));
        btnRow1.addView(b500, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1.0f));
        btnRow1.addView(b9999, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1.0f));
        layout.addView(btnRow1);

        // Custom amount input
        final EditText input = new EditText(this);
        input.setHint("Введите нужное количество...");
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        layout.addView(input);

        builder.setView(layout);

        builder.setPositiveButton("Установить", (dialog, which) -> {
            String txt = input.getText().toString().trim();
            if (!txt.isEmpty()) {
                try {
                    int val = Integer.parseInt(txt);
                    setCollectibles(val);
                } catch (NumberFormatException e) {
                    Toast.makeText(this, "Неверное число", Toast.LENGTH_SHORT).show();
                }
            }
        });

        builder.setNegativeButton("Назад", null);
        builder.show();
    }

    private int getCurrentCollectibles() {
        try {
            Object ar = getFieldValue(midlet, "a");
            if (ar != null) {
                Object ac = getFieldValue(ar, "a");
                if (ac != null) {
                    Field gField = ac.getClass().getField("g");
                    return gField.getInt(ac);
                }
            }
        } catch (Exception ignored) {}
        return 0;
    }

    private void setCollectibles(int amount) {
        try {
            Object ar = getFieldValue(midlet, "a");
            if (ar != null) {
                Object ac = getFieldValue(ar, "a");
                if (ac != null) {
                    Field gField = ac.getClass().getField("g");
                    gField.setInt(ac, amount);
                    Toast.makeText(this, "Коллектоблы установлены: " + amount + " янтаря!", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Set collectibles failed", e);
        }
        Toast.makeText(this, "Войдите на игровой уровень для применения!", Toast.LENGTH_LONG).show();
    }

    private void unlockAllLevels() {
        try {
            Field fField = Main.class.getField("f");
            fField.setInt(null, 106);
            Toast.makeText(this, "Все 106 уровней разблокированы!", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Log.e(TAG, "Unlock all levels failed", e);
            Toast.makeText(this, "Ошибка разблокировки: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    // ========================================================
    // HELPER REFLECTION UTILITIES
    // ========================================================
    private Object getFieldValue(Object obj, String fieldName) {
        if (obj == null) return null;
        try {
            Field f = obj.getClass().getField(fieldName);
            return f.get(obj);
        } catch (NoSuchFieldException e) {
            try {
                Field f = obj.getClass().getDeclaredField(fieldName);
                f.setAccessible(true);
                return f.get(obj);
            } catch (Exception ignored) {}
        } catch (Exception ignored) {}
        return null;
    }

    private void invokeMidlet(String methodName, Class<?>[] types, Object[] args) {
        if (midlet == null) return;
        try {
            Method m = midlet.getClass().getMethod(methodName, types);
            m.invoke(midlet, args);
        } catch (NoSuchMethodException e) {
            try {
                Method m = midlet.getClass().getDeclaredMethod(methodName, types);
                m.setAccessible(true);
                m.invoke(midlet, args);
            } catch (Throwable ex) {
                handleFatalError(ex);
            }
        } catch (Throwable e) {
            handleFatalError(e);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (gameView != null) {
            gameView.resume();
        }
        invokeMidlet("startApp", new Class<?>[0], new Object[0]);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (gameView != null) {
            gameView.pause();
        }
        invokeMidlet("pauseApp", new Class<?>[0], new Object[0]);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        invokeMidlet("destroyApp", new Class<?>[]{boolean.class}, new Object[]{true});
    }
}
