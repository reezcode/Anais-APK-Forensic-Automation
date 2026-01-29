package com.blankj.utilcode.util;

import androidx.annotation.NonNull;

/* loaded from: classes13.dex */
public final class CacheMemoryStaticUtils {
    private static CacheMemoryUtils sDefaultCacheMemoryUtils;

    public static void clear() {
        clear(getDefaultCacheMemoryUtils());
    }

    public static void clear(@NonNull CacheMemoryUtils cacheMemoryUtils) {
        cacheMemoryUtils.clear();
    }

    public static <T> T get(@NonNull String str) {
        return (T) get(str, getDefaultCacheMemoryUtils());
    }

    public static <T> T get(@NonNull String str, @NonNull CacheMemoryUtils cacheMemoryUtils) {
        return (T) cacheMemoryUtils.get(str);
    }

    public static <T> T get(@NonNull String str, T t4) {
        return (T) get(str, t4, getDefaultCacheMemoryUtils());
    }

    public static <T> T get(@NonNull String str, T t4, @NonNull CacheMemoryUtils cacheMemoryUtils) {
        return (T) cacheMemoryUtils.get(str, t4);
    }

    public static int getCacheCount() {
        return getCacheCount(getDefaultCacheMemoryUtils());
    }

    public static int getCacheCount(@NonNull CacheMemoryUtils cacheMemoryUtils) {
        return cacheMemoryUtils.getCacheCount();
    }

    private static CacheMemoryUtils getDefaultCacheMemoryUtils() {
        CacheMemoryUtils cacheMemoryUtils = sDefaultCacheMemoryUtils;
        return cacheMemoryUtils != null ? cacheMemoryUtils : CacheMemoryUtils.getInstance();
    }

    public static void put(@NonNull String str, Object obj) {
        put(str, obj, getDefaultCacheMemoryUtils());
    }

    public static void put(@NonNull String str, Object obj, int i5) {
        put(str, obj, i5, getDefaultCacheMemoryUtils());
    }

    public static void put(@NonNull String str, Object obj, int i5, @NonNull CacheMemoryUtils cacheMemoryUtils) {
        cacheMemoryUtils.put(str, obj, i5);
    }

    public static void put(@NonNull String str, Object obj, @NonNull CacheMemoryUtils cacheMemoryUtils) {
        cacheMemoryUtils.put(str, obj);
    }

    public static Object remove(@NonNull String str) {
        return remove(str, getDefaultCacheMemoryUtils());
    }

    public static Object remove(@NonNull String str, @NonNull CacheMemoryUtils cacheMemoryUtils) {
        return cacheMemoryUtils.remove(str);
    }

    public static void setDefaultCacheMemoryUtils(CacheMemoryUtils cacheMemoryUtils) {
        sDefaultCacheMemoryUtils = cacheMemoryUtils;
    }
}
