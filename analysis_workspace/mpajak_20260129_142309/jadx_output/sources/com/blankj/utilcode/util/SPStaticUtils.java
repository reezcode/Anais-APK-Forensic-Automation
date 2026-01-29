package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Set;

/* loaded from: classes15.dex */
public final class SPStaticUtils {
    private static SPUtils sDefaultSPUtils;

    public static void clear() {
        clear(getDefaultSPUtils());
    }

    public static void clear(@NonNull SPUtils sPUtils) {
        sPUtils.clear();
    }

    public static void clear(boolean z4) {
        clear(z4, getDefaultSPUtils());
    }

    public static void clear(boolean z4, @NonNull SPUtils sPUtils) {
        sPUtils.clear(z4);
    }

    public static boolean contains(@NonNull String str) {
        return contains(str, getDefaultSPUtils());
    }

    public static boolean contains(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.contains(str);
    }

    public static Map<String, ?> getAll() {
        return getAll(getDefaultSPUtils());
    }

    public static Map<String, ?> getAll(@NonNull SPUtils sPUtils) {
        return sPUtils.getAll();
    }

    public static boolean getBoolean(@NonNull String str) {
        return getBoolean(str, getDefaultSPUtils());
    }

    public static boolean getBoolean(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getBoolean(str);
    }

    public static boolean getBoolean(@NonNull String str, boolean z4) {
        return getBoolean(str, z4, getDefaultSPUtils());
    }

    public static boolean getBoolean(@NonNull String str, boolean z4, @NonNull SPUtils sPUtils) {
        return sPUtils.getBoolean(str, z4);
    }

    private static SPUtils getDefaultSPUtils() {
        SPUtils sPUtils = sDefaultSPUtils;
        return sPUtils != null ? sPUtils : SPUtils.getInstance();
    }

    public static float getFloat(@NonNull String str) {
        return getFloat(str, getDefaultSPUtils());
    }

    public static float getFloat(@NonNull String str, float f5) {
        return getFloat(str, f5, getDefaultSPUtils());
    }

    public static float getFloat(@NonNull String str, float f5, @NonNull SPUtils sPUtils) {
        return sPUtils.getFloat(str, f5);
    }

    public static float getFloat(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getFloat(str);
    }

    public static int getInt(@NonNull String str) {
        return getInt(str, getDefaultSPUtils());
    }

    public static int getInt(@NonNull String str, int i5) {
        return getInt(str, i5, getDefaultSPUtils());
    }

    public static int getInt(@NonNull String str, int i5, @NonNull SPUtils sPUtils) {
        return sPUtils.getInt(str, i5);
    }

    public static int getInt(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getInt(str);
    }

    public static long getLong(@NonNull String str) {
        return getLong(str, getDefaultSPUtils());
    }

    public static long getLong(@NonNull String str, long j5) {
        return getLong(str, j5, getDefaultSPUtils());
    }

    public static long getLong(@NonNull String str, long j5, @NonNull SPUtils sPUtils) {
        return sPUtils.getLong(str, j5);
    }

    public static long getLong(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getLong(str);
    }

    public static String getString(@NonNull String str) {
        return getString(str, getDefaultSPUtils());
    }

    public static String getString(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getString(str);
    }

    public static String getString(@NonNull String str, String str2) {
        return getString(str, str2, getDefaultSPUtils());
    }

    public static String getString(@NonNull String str, String str2, @NonNull SPUtils sPUtils) {
        return sPUtils.getString(str, str2);
    }

    public static Set<String> getStringSet(@NonNull String str) {
        return getStringSet(str, getDefaultSPUtils());
    }

    public static Set<String> getStringSet(@NonNull String str, @NonNull SPUtils sPUtils) {
        return sPUtils.getStringSet(str);
    }

    public static Set<String> getStringSet(@NonNull String str, Set<String> set) {
        return getStringSet(str, set, getDefaultSPUtils());
    }

    public static Set<String> getStringSet(@NonNull String str, Set<String> set, @NonNull SPUtils sPUtils) {
        return sPUtils.getStringSet(str, set);
    }

    public static void put(@NonNull String str, float f5) {
        put(str, f5, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, float f5, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, f5);
    }

    public static void put(@NonNull String str, float f5, boolean z4) {
        put(str, f5, z4, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, float f5, boolean z4, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, f5, z4);
    }

    public static void put(@NonNull String str, int i5) {
        put(str, i5, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, int i5, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, i5);
    }

    public static void put(@NonNull String str, int i5, boolean z4) {
        put(str, i5, z4, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, int i5, boolean z4, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, i5, z4);
    }

    public static void put(@NonNull String str, long j5) {
        put(str, j5, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, long j5, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, j5);
    }

    public static void put(@NonNull String str, long j5, boolean z4) {
        put(str, j5, z4, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, long j5, boolean z4, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, j5, z4);
    }

    public static void put(@NonNull String str, String str2) {
        put(str, str2, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, String str2, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, str2);
    }

    public static void put(@NonNull String str, String str2, boolean z4) {
        put(str, str2, z4, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, String str2, boolean z4, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, str2, z4);
    }

    public static void put(@NonNull String str, Set<String> set) {
        put(str, set, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, Set<String> set, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, set);
    }

    public static void put(@NonNull String str, Set<String> set, boolean z4) {
        put(str, set, z4, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, Set<String> set, boolean z4, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, set, z4);
    }

    public static void put(@NonNull String str, boolean z4) {
        put(str, z4, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, boolean z4, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, z4);
    }

    public static void put(@NonNull String str, boolean z4, boolean z5) {
        put(str, z4, z5, getDefaultSPUtils());
    }

    public static void put(@NonNull String str, boolean z4, boolean z5, @NonNull SPUtils sPUtils) {
        sPUtils.put(str, z4, z5);
    }

    public static void remove(@NonNull String str) {
        remove(str, getDefaultSPUtils());
    }

    public static void remove(@NonNull String str, @NonNull SPUtils sPUtils) {
        sPUtils.remove(str);
    }

    public static void remove(@NonNull String str, boolean z4) {
        remove(str, z4, getDefaultSPUtils());
    }

    public static void remove(@NonNull String str, boolean z4, @NonNull SPUtils sPUtils) {
        sPUtils.remove(str, z4);
    }

    public static void setDefaultSPUtils(SPUtils sPUtils) {
        sDefaultSPUtils = sPUtils;
    }
}
