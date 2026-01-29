package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes23.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final e.a<?> f611b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, e.a<?>> f612a = new HashMap();

    /* loaded from: classes6.dex */
    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final e<Object> b(@NonNull Object obj) {
            return new b(obj);
        }
    }

    /* loaded from: classes12.dex */
    public static final class b implements e<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f613a;

        public b(@NonNull Object obj) {
            this.f613a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @NonNull
        public final Object a() {
            return this.f613a;
        }

        @Override // com.bumptech.glide.load.data.e
        public final void b() {
        }
    }
}
