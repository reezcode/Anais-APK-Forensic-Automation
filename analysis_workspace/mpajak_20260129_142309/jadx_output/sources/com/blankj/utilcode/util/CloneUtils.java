package com.blankj.utilcode.util;

import java.lang.reflect.Type;

/* loaded from: classes7.dex */
public final class CloneUtils {
    private CloneUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static <T> T deepClone(T t4, Type type) {
        try {
            return (T) UtilsBridge.fromJson(UtilsBridge.toJson(t4), type);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
