package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface d<T> {

    /* loaded from: classes17.dex */
    public interface a<T> {
        void c(@NonNull Exception exc);

        void d(@Nullable T t4);
    }

    @NonNull
    Class<T> a();

    void b();

    void cancel();

    @NonNull
    p.a e();

    void f(@NonNull com.bumptech.glide.f fVar, @NonNull a<? super T> aVar);
}
