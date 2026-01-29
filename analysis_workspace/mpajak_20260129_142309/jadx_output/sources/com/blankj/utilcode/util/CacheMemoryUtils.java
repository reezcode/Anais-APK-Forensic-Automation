package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import androidx.collection.LruCache;
import com.blankj.utilcode.constant.CacheConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes18.dex */
public final class CacheMemoryUtils implements CacheConstants {
    private static final Map<String, CacheMemoryUtils> CACHE_MAP = new HashMap();
    private static final int DEFAULT_MAX_COUNT = 256;
    private final String mCacheKey;
    private final LruCache<String, CacheValue> mMemoryCache;

    /* loaded from: classes11.dex */
    public static final class CacheValue {
        public long dueTime;
        public Object value;

        public CacheValue(long j5, Object obj) {
            this.dueTime = j5;
            this.value = obj;
        }
    }

    private CacheMemoryUtils(String str, LruCache<String, CacheValue> lruCache) {
        this.mCacheKey = str;
        this.mMemoryCache = lruCache;
    }

    public static CacheMemoryUtils getInstance() {
        return getInstance(256);
    }

    public static CacheMemoryUtils getInstance(int i5) {
        return getInstance(String.valueOf(i5), i5);
    }

    public static CacheMemoryUtils getInstance(String str, int i5) {
        Map<String, CacheMemoryUtils> map = CACHE_MAP;
        CacheMemoryUtils cacheMemoryUtils = map.get(str);
        if (cacheMemoryUtils == null) {
            synchronized (CacheMemoryUtils.class) {
                cacheMemoryUtils = map.get(str);
                if (cacheMemoryUtils == null) {
                    cacheMemoryUtils = new CacheMemoryUtils(str, new LruCache(i5));
                    map.put(str, cacheMemoryUtils);
                }
            }
        }
        return cacheMemoryUtils;
    }

    public void clear() {
        this.mMemoryCache.evictAll();
    }

    public <T> T get(@NonNull String str) {
        return (T) get(str, null);
    }

    public <T> T get(@NonNull String str, T t4) {
        CacheValue cacheValue = this.mMemoryCache.get(str);
        if (cacheValue == null) {
            return t4;
        }
        long j5 = cacheValue.dueTime;
        if (j5 == -1 || j5 >= System.currentTimeMillis()) {
            return (T) cacheValue.value;
        }
        this.mMemoryCache.remove(str);
        return t4;
    }

    public int getCacheCount() {
        return this.mMemoryCache.size();
    }

    public void put(@NonNull String str, Object obj) {
        put(str, obj, -1);
    }

    public void put(@NonNull String str, Object obj, int i5) {
        if (obj == null) {
            return;
        }
        this.mMemoryCache.put(str, new CacheValue(i5 < 0 ? -1L : System.currentTimeMillis() + (i5 * 1000), obj));
    }

    public Object remove(@NonNull String str) {
        CacheValue remove = this.mMemoryCache.remove(str);
        if (remove == null) {
            return null;
        }
        return remove.value;
    }

    public String toString() {
        return this.mCacheKey + "@" + Integer.toHexString(hashCode());
    }
}
