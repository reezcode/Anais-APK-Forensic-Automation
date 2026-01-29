package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Object> f564a;

    /* loaded from: classes24.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, Object> f565a = new HashMap();
    }

    public e(a aVar) {
        this.f564a = Collections.unmodifiableMap(new HashMap(aVar.f565a));
    }

    public final boolean a(Class<Object> cls) {
        return this.f564a.containsKey(cls);
    }
}
