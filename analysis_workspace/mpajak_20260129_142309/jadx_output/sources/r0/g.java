package r0;

import r0.a;

/* loaded from: classes3.dex */
public final class g implements a.InterfaceC0063a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5031a;

    public g(b bVar) {
        this.f5031a = bVar;
    }

    @Override // r0.a.InterfaceC0063a
    public final void a(boolean z4) {
        b1.a aVar = this.f5031a.f5023h;
        aVar.sendMessage(aVar.obtainMessage(1, Boolean.valueOf(z4)));
    }
}
