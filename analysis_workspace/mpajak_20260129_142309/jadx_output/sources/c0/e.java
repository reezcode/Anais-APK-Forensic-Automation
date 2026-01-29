package c0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import c0.g;

/* loaded from: classes6.dex */
public final class e extends a0.b<c> {
    public e(c cVar) {
        super(cVar);
    }

    @Override // a0.b, r.s
    public final void a() {
        ((c) this.f22b).b().prepareToDraw();
    }

    @Override // r.w
    @NonNull
    public final Class<c> b() {
        return c.class;
    }

    @Override // r.w
    public final int getSize() {
        g gVar = ((c) this.f22b).f471b.f482a;
        return gVar.f484a.f() + gVar.f498o;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<c0.g$b>] */
    @Override // r.w
    public final void recycle() {
        ((c) this.f22b).stop();
        c cVar = (c) this.f22b;
        cVar.f474e = true;
        g gVar = cVar.f471b.f482a;
        gVar.f486c.clear();
        Bitmap bitmap = gVar.f495l;
        if (bitmap != null) {
            gVar.f488e.d(bitmap);
            gVar.f495l = null;
        }
        gVar.f489f = false;
        g.a aVar = gVar.f492i;
        if (aVar != null) {
            gVar.f487d.k(aVar);
            gVar.f492i = null;
        }
        g.a aVar2 = gVar.f494k;
        if (aVar2 != null) {
            gVar.f487d.k(aVar2);
            gVar.f494k = null;
        }
        g.a aVar3 = gVar.f497n;
        if (aVar3 != null) {
            gVar.f487d.k(aVar3);
            gVar.f497n = null;
        }
        gVar.f484a.clear();
        gVar.f493j = true;
    }
}
