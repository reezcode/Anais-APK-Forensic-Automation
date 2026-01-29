package l2;

import i2.z;
import java.lang.reflect.Field;
import l2.n;

/* loaded from: classes3.dex */
public final class m extends n.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Field f3986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f3988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i2.i f3989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o2.a f3990h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f3991i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, boolean z4, boolean z5, Field field, boolean z6, z zVar, i2.i iVar, o2.a aVar, boolean z7) {
        super(str, z4, z5);
        this.f3986d = field;
        this.f3987e = z6;
        this.f3988f = zVar;
        this.f3989g = iVar;
        this.f3990h = aVar;
        this.f3991i = z7;
    }

    @Override // l2.n.b
    public final void a(p2.a aVar, Object obj) {
        Object a5 = this.f3988f.a(aVar);
        if (a5 == null && this.f3991i) {
            return;
        }
        this.f3986d.set(obj, a5);
    }

    @Override // l2.n.b
    public final void b(p2.b bVar, Object obj) {
        (this.f3987e ? this.f3988f : new p(this.f3989g, this.f3988f, this.f3990h.f4569b)).b(bVar, this.f3986d.get(obj));
    }

    @Override // l2.n.b
    public final boolean c(Object obj) {
        return this.f3999b && this.f3986d.get(obj) != obj;
    }
}
