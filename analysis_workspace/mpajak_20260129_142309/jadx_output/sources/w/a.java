package w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import java.util.Objects;
import p.h;
import v.g;
import v.n;
import v.o;
import v.p;
import v.s;

/* loaded from: classes23.dex */
public final class a implements o<g, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final p.g<Integer> f5724b = p.g.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final n<g, g> f5725a;

    /* renamed from: w.a$a, reason: collision with other inner class name */
    /* loaded from: classes18.dex */
    public static class C0078a implements p<g, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final n<g, g> f5726a = new n<>();

        @Override // v.p
        @NonNull
        public final o<g, InputStream> b(s sVar) {
            return new a(this.f5726a);
        }
    }

    public a(@Nullable n<g, g> nVar) {
        this.f5725a = nVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Queue<v.n$a<?>>] */
    @Override // v.o
    public final o.a<InputStream> a(@NonNull g gVar, int i5, int i6, @NonNull h hVar) {
        g gVar2 = gVar;
        n<g, g> nVar = this.f5725a;
        if (nVar != null) {
            n.a<g> a5 = n.a.a(gVar2);
            g a6 = nVar.f5507a.a(a5);
            ?? r02 = n.a.f5508d;
            synchronized (r02) {
                r02.offer(a5);
            }
            g gVar3 = a6;
            if (gVar3 == null) {
                n<g, g> nVar2 = this.f5725a;
                Objects.requireNonNull(nVar2);
                nVar2.f5507a.d(n.a.a(gVar2), gVar2);
            } else {
                gVar2 = gVar3;
            }
        }
        return new o.a<>(gVar2, new j(gVar2, ((Integer) hVar.c(f5724b)).intValue()));
    }

    @Override // v.o
    public final /* bridge */ /* synthetic */ boolean b(@NonNull g gVar) {
        return true;
    }
}
