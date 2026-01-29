package com.blankj.utilcode.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/* loaded from: classes17.dex */
public final class NumberUtils {
    private static final ThreadLocal<DecimalFormat> DF_THREAD_LOCAL = new ThreadLocal<DecimalFormat>() { // from class: com.blankj.utilcode.util.NumberUtils.1
        @Override // java.lang.ThreadLocal
        public DecimalFormat initialValue() {
            return (DecimalFormat) NumberFormat.getInstance();
        }
    };

    private NumberUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static double float2Double(float f5) {
        return new BigDecimal(String.valueOf(f5)).doubleValue();
    }

    public static String format(double d5, int i5) {
        return format(d5, false, 1, i5, true);
    }

    public static String format(double d5, int i5, int i6, boolean z4) {
        return format(d5, false, i5, i6, z4);
    }

    public static String format(double d5, int i5, boolean z4) {
        return format(d5, false, 1, i5, z4);
    }

    public static String format(double d5, boolean z4, int i5) {
        return format(d5, z4, 1, i5, true);
    }

    public static String format(double d5, boolean z4, int i5, int i6, boolean z5) {
        DecimalFormat safeDecimalFormat = getSafeDecimalFormat();
        safeDecimalFormat.setGroupingUsed(z4);
        safeDecimalFormat.setRoundingMode(z5 ? RoundingMode.HALF_UP : RoundingMode.DOWN);
        safeDecimalFormat.setMinimumIntegerDigits(i5);
        safeDecimalFormat.setMinimumFractionDigits(i6);
        safeDecimalFormat.setMaximumFractionDigits(i6);
        return safeDecimalFormat.format(d5);
    }

    public static String format(double d5, boolean z4, int i5, boolean z5) {
        return format(d5, z4, 1, i5, z5);
    }

    public static String format(float f5, int i5) {
        return format(f5, false, 1, i5, true);
    }

    public static String format(float f5, int i5, int i6, boolean z4) {
        return format(f5, false, i5, i6, z4);
    }

    public static String format(float f5, int i5, boolean z4) {
        return format(f5, false, 1, i5, z4);
    }

    public static String format(float f5, boolean z4, int i5) {
        return format(f5, z4, 1, i5, true);
    }

    public static String format(float f5, boolean z4, int i5, int i6, boolean z5) {
        return format(float2Double(f5), z4, i5, i6, z5);
    }

    public static String format(float f5, boolean z4, int i5, boolean z5) {
        return format(f5, z4, 1, i5, z5);
    }

    public static DecimalFormat getSafeDecimalFormat() {
        return DF_THREAD_LOCAL.get();
    }
}
