package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final String f604b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager f605c;

    /* renamed from: d, reason: collision with root package name */
    public T f606d;

    public b(AssetManager assetManager, String str) {
        this.f605c = assetManager;
        this.f604b = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t4 = this.f606d;
        if (t4 == null) {
            return;
        }
        try {
            c(t4);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t4);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    public abstract T d(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final p.a e() {
        return p.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(@NonNull com.bumptech.glide.f fVar, @NonNull d.a<? super T> aVar) {
        try {
            T d5 = d(this.f605c, this.f604b);
            this.f606d = d5;
            aVar.d(d5);
        } catch (IOException e5) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e5);
            }
            aVar.c(e5);
        }
    }
}
