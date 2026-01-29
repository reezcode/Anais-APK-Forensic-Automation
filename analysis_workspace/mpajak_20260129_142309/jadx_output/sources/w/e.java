package w;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import p.h;
import v.g;
import v.o;
import v.p;
import v.s;

/* loaded from: classes17.dex */
public final class e implements o<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final o<g, InputStream> f5748a;

    /* loaded from: classes5.dex */
    public static class a implements p<URL, InputStream> {
        @Override // v.p
        @NonNull
        public final o<URL, InputStream> b(s sVar) {
            return new e(sVar.b(g.class, InputStream.class));
        }
    }

    public e(o<g, InputStream> oVar) {
        this.f5748a = oVar;
    }

    @Override // v.o
    public final o.a<InputStream> a(@NonNull URL url, int i5, int i6, @NonNull h hVar) {
        return this.f5748a.a(new g(url), i5, i6, hVar);
    }

    @Override // v.o
    public final /* bridge */ /* synthetic */ boolean b(@NonNull URL url) {
        return true;
    }
}
