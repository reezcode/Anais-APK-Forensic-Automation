package com.blankj.utilcode.util;

import android.os.Vibrator;
import androidx.annotation.RequiresPermission;

/* loaded from: classes6.dex */
public final class VibrateUtils {
    private static Vibrator vibrator;

    private VibrateUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @RequiresPermission("android.permission.VIBRATE")
    public static void cancel() {
        Vibrator vibrator2 = getVibrator();
        if (vibrator2 == null) {
            return;
        }
        vibrator2.cancel();
    }

    private static Vibrator getVibrator() {
        if (vibrator == null) {
            vibrator = (Vibrator) Utils.getApp().getSystemService("vibrator");
        }
        return vibrator;
    }

    @RequiresPermission("android.permission.VIBRATE")
    public static void vibrate(long j5) {
        Vibrator vibrator2 = getVibrator();
        if (vibrator2 == null) {
            return;
        }
        vibrator2.vibrate(j5);
    }

    @RequiresPermission("android.permission.VIBRATE")
    public static void vibrate(long[] jArr, int i5) {
        Vibrator vibrator2 = getVibrator();
        if (vibrator2 == null) {
            return;
        }
        vibrator2.vibrate(jArr, i5);
    }
}
