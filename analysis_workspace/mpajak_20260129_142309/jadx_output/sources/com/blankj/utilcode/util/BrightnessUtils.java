package com.blankj.utilcode.util;

import android.content.ContentResolver;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class BrightnessUtils {
    private BrightnessUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getBrightness() {
        try {
            return Settings.System.getInt(Utils.getApp().getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int getWindowBrightness(@NonNull Window window) {
        float f5 = window.getAttributes().screenBrightness;
        return f5 < 0.0f ? getBrightness() : (int) (f5 * 255.0f);
    }

    public static boolean isAutoBrightnessEnabled() {
        try {
            return Settings.System.getInt(Utils.getApp().getContentResolver(), "screen_brightness_mode") == 1;
        } catch (Settings.SettingNotFoundException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean setAutoBrightnessEnabled(boolean z4) {
        return Settings.System.putInt(Utils.getApp().getContentResolver(), "screen_brightness_mode", z4 ? 1 : 0);
    }

    public static boolean setBrightness(@IntRange(from = 0, to = 255) int i5) {
        ContentResolver contentResolver = Utils.getApp().getContentResolver();
        boolean putInt = Settings.System.putInt(contentResolver, "screen_brightness", i5);
        contentResolver.notifyChange(Settings.System.getUriFor("screen_brightness"), null);
        return putInt;
    }

    public static void setWindowBrightness(@NonNull Window window, @IntRange(from = 0, to = 255) int i5) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = i5 / 255.0f;
        window.setAttributes(attributes);
    }
}
