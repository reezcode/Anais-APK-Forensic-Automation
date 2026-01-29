package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f626b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f627c;

    /* renamed from: d, reason: collision with root package name */
    public T f628d;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f627c = contentResolver;
        this.f626b = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t4 = this.f628d;
        if (t4 != null) {
            try {
                c(t4);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t4);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    public abstract T d(Uri uri, ContentResolver contentResolver);

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public final p.a e() {
        return p.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(@NonNull com.bumptech.glide.f fVar, @NonNull d.a<? super T> aVar) {
        try {
            T d5 = d(this.f626b, this.f627c);
            this.f628d = d5;
            aVar.d(d5);
        } catch (FileNotFoundException e5) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e5);
            }
            aVar.c(e5);
        }
    }
}
