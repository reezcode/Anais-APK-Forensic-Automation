package com.blankj.utilcode.util;

import android.graphics.Color;
import androidx.activity.d;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;

/* loaded from: classes10.dex */
public final class ColorUtils {
    private ColorUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getColor(@ColorRes int i5) {
        return ContextCompat.getColor(Utils.getApp(), i5);
    }

    public static int getRandomColor() {
        return getRandomColor(true);
    }

    public static int getRandomColor(boolean z4) {
        return (z4 ? ((int) (Math.random() * 256.0d)) << 24 : -16777216) | ((int) (Math.random() * 1.6777216E7d));
    }

    public static String int2ArgbString(@ColorInt int i5) {
        String hexString = Integer.toHexString(i5);
        while (hexString.length() < 6) {
            hexString = d.f("0", hexString);
        }
        while (hexString.length() < 8) {
            hexString = d.f("f", hexString);
        }
        return d.f("#", hexString);
    }

    public static String int2RgbString(@ColorInt int i5) {
        String hexString = Integer.toHexString(i5 & ViewCompat.MEASURED_SIZE_MASK);
        while (hexString.length() < 6) {
            hexString = d.f("0", hexString);
        }
        return d.f("#", hexString);
    }

    public static boolean isLightColor(@ColorInt int i5) {
        return (((double) Color.blue(i5)) * 0.114d) + ((((double) Color.green(i5)) * 0.587d) + (((double) Color.red(i5)) * 0.299d)) >= 127.5d;
    }

    public static int setAlphaComponent(@ColorInt int i5, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return (i5 & ViewCompat.MEASURED_SIZE_MASK) | (((int) ((f5 * 255.0f) + 0.5f)) << 24);
    }

    public static int setAlphaComponent(@ColorInt int i5, @IntRange(from = 0, to = 255) int i6) {
        return (i5 & ViewCompat.MEASURED_SIZE_MASK) | (i6 << 24);
    }

    public static int setBlueComponent(@ColorInt int i5, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return (i5 & InputDeviceCompat.SOURCE_ANY) | ((int) ((f5 * 255.0f) + 0.5f));
    }

    public static int setBlueComponent(@ColorInt int i5, @IntRange(from = 0, to = 255) int i6) {
        return (i5 & InputDeviceCompat.SOURCE_ANY) | i6;
    }

    public static int setGreenComponent(@ColorInt int i5, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return (i5 & (-65281)) | (((int) ((f5 * 255.0f) + 0.5f)) << 8);
    }

    public static int setGreenComponent(@ColorInt int i5, @IntRange(from = 0, to = 255) int i6) {
        return (i5 & (-65281)) | (i6 << 8);
    }

    public static int setRedComponent(@ColorInt int i5, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return (i5 & (-16711681)) | (((int) ((f5 * 255.0f) + 0.5f)) << 16);
    }

    public static int setRedComponent(@ColorInt int i5, @IntRange(from = 0, to = 255) int i6) {
        return (i5 & (-16711681)) | (i6 << 16);
    }

    public static int string2Int(@NonNull String str) {
        return Color.parseColor(str);
    }
}
