package r;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.d;
import r.h;
import v.o;

/* loaded from: classes14.dex */
public final class a0 implements d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o.a f4804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f4805c;

    public a0(b0 b0Var, o.a aVar) {
        this.f4805c = b0Var;
        this.f4804b = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(@NonNull Exception exc) {
        b0 b0Var = this.f4805c;
        o.a<?> aVar = this.f4804b;
        o.a<?> aVar2 = b0Var.f4812g;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f4805c;
            o.a aVar3 = this.f4804b;
            h.a aVar4 = b0Var2.f4808c;
            p.f fVar = b0Var2.f4813h;
            com.bumptech.glide.load.data.d<Data> dVar = aVar3.f5514c;
            aVar4.b(fVar, exc, dVar, dVar.e());
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void d(@Nullable Object obj) {
        b0 b0Var = this.f4805c;
        o.a<?> aVar = this.f4804b;
        o.a<?> aVar2 = b0Var.f4812g;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f4805c;
            o.a aVar3 = this.f4804b;
            l lVar = b0Var2.f4807b.f4850p;
            if (obj != null && lVar.c(aVar3.f5514c.e())) {
                b0Var2.f4811f = obj;
                b0Var2.f4808c.a();
            } else {
                h.a aVar4 = b0Var2.f4808c;
                p.f fVar = aVar3.f5512a;
                com.bumptech.glide.load.data.d<Data> dVar = aVar3.f5514c;
                aVar4.d(fVar, obj, dVar, dVar.e(), b0Var2.f4813h);
            }
        }
    }
}
