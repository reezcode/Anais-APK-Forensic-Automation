package com.blankj.utilcode.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import d1.c;
import i2.i;
import i2.j;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k2.a;
import p2.a;

/* loaded from: classes10.dex */
public final class GsonUtils {
    private static final Map<String, i> GSONS = new ConcurrentHashMap();
    private static final String KEY_DEFAULT = "defaultGson";
    private static final String KEY_DELEGATE = "delegateGson";
    private static final String KEY_LOG_UTILS = "logUtilsGson";

    private GsonUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static i createGson() {
        j jVar = new j();
        jVar.f3291g = true;
        jVar.f3294j = false;
        return jVar.a();
    }

    public static <T> T fromJson(@NonNull i iVar, Reader reader, @NonNull Class<T> cls) {
        Objects.requireNonNull(iVar);
        a aVar = new a(reader);
        aVar.f4648c = iVar.f3283k;
        Object d5 = iVar.d(aVar, cls);
        i.a(d5, aVar);
        return (T) c.g(cls).cast(d5);
    }

    public static <T> T fromJson(@NonNull i iVar, Reader reader, @NonNull Type type) {
        Objects.requireNonNull(iVar);
        a aVar = new a(reader);
        aVar.f4648c = iVar.f3283k;
        T t4 = (T) iVar.d(aVar, type);
        i.a(t4, aVar);
        return t4;
    }

    public static <T> T fromJson(@NonNull i iVar, String str, @NonNull Class<T> cls) {
        return (T) c.g(cls).cast(iVar.c(str, cls));
    }

    public static <T> T fromJson(@NonNull i iVar, String str, @NonNull Type type) {
        return (T) iVar.c(str, type);
    }

    public static <T> T fromJson(@NonNull Reader reader, @NonNull Class<T> cls) {
        return (T) fromJson(getGson(), reader, (Class) cls);
    }

    public static <T> T fromJson(@NonNull Reader reader, @NonNull Type type) {
        return (T) fromJson(getGson(), reader, type);
    }

    public static <T> T fromJson(String str, @NonNull Class<T> cls) {
        return (T) fromJson(getGson(), str, (Class) cls);
    }

    public static <T> T fromJson(String str, @NonNull Type type) {
        return (T) fromJson(getGson(), str, type);
    }

    public static Type getArrayType(@NonNull Type type) {
        a.C0042a c0042a = new a.C0042a(type);
        Objects.requireNonNull(c0042a);
        Type a5 = k2.a.a(c0042a);
        k2.a.f(a5);
        a5.hashCode();
        return a5;
    }

    public static i getGson() {
        Map<String, i> map = GSONS;
        i iVar = map.get(KEY_DELEGATE);
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = map.get(KEY_DEFAULT);
        if (iVar2 != null) {
            return iVar2;
        }
        i createGson = createGson();
        map.put(KEY_DEFAULT, createGson);
        return createGson;
    }

    public static i getGson(String str) {
        return GSONS.get(str);
    }

    public static i getGson4LogUtils() {
        Map<String, i> map = GSONS;
        i iVar = map.get(KEY_LOG_UTILS);
        if (iVar != null) {
            return iVar;
        }
        j jVar = new j();
        jVar.f3295k = true;
        jVar.f3291g = true;
        i a5 = jVar.a();
        map.put(KEY_LOG_UTILS, a5);
        return a5;
    }

    public static Type getListType(@NonNull Type type) {
        return o2.a.a(List.class, type).f4569b;
    }

    public static Type getMapType(@NonNull Type type, @NonNull Type type2) {
        return o2.a.a(Map.class, type, type2).f4569b;
    }

    public static Type getSetType(@NonNull Type type) {
        return o2.a.a(Set.class, type).f4569b;
    }

    public static Type getType(@NonNull Type type, @NonNull Type... typeArr) {
        return o2.a.a(type, typeArr).f4569b;
    }

    public static void setGson(String str, i iVar) {
        if (TextUtils.isEmpty(str) || iVar == null) {
            return;
        }
        GSONS.put(str, iVar);
    }

    public static void setGsonDelegate(i iVar) {
        if (iVar == null) {
            return;
        }
        GSONS.put(KEY_DELEGATE, iVar);
    }

    public static String toJson(@NonNull i iVar, Object obj) {
        return iVar.h(obj);
    }

    public static String toJson(@NonNull i iVar, Object obj, @NonNull Type type) {
        return iVar.i(obj, type);
    }

    public static String toJson(Object obj) {
        return toJson(getGson(), obj);
    }

    public static String toJson(Object obj, @NonNull Type type) {
        return toJson(getGson(), obj, type);
    }
}
