package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.io.InputStream;
import y.w;

/* loaded from: classes14.dex */
public final class k implements e<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final w f624a;

    /* loaded from: classes19.dex */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final s.b f625a;

        public a(s.b bVar) {
            this.f625a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f625a);
        }
    }

    public k(InputStream inputStream, s.b bVar) {
        w wVar = new w(inputStream, bVar);
        this.f624a = wVar;
        wVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        this.f624a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        this.f624a.reset();
        return this.f624a;
    }
}
