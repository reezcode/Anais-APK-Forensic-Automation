package w3;

import e4.d;

/* loaded from: classes22.dex */
public final class i extends d.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f5856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f4.h f5857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f4.g f5858g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, f4.h hVar, f4.g gVar, f4.h hVar2, f4.g gVar2) {
        super(hVar2, gVar2);
        this.f5856e = cVar;
        this.f5857f = hVar;
        this.f5858g = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5856e.a(true, true, null);
    }
}
