package a3;

import java.util.HashMap;
import java.util.Map;
import t2.j;
import t2.l;
import t2.m;
import v2.g;

/* loaded from: classes23.dex */
public abstract class a<T, ID> extends b<T, ID> implements z2.d<T> {

    /* renamed from: g, reason: collision with root package name */
    public final v2.g[] f64g;

    /* renamed from: h, reason: collision with root package name */
    public Map<String, Integer> f65h;

    /* renamed from: i, reason: collision with root package name */
    public Object f66i;

    /* renamed from: j, reason: collision with root package name */
    public Object f67j;

    public a(d3.c<T, ID> cVar, String str, v2.g[] gVarArr, v2.g[] gVarArr2) {
        super(cVar, str, gVarArr);
        this.f65h = null;
        this.f66i = null;
        this.f67j = null;
        this.f64g = gVarArr2;
    }

    @Override // z2.d
    public final T a(c3.e eVar) {
        int i5;
        v2.g gVar;
        g.b bVar;
        Object jVar;
        Object obj;
        Map<String, Integer> map = this.f65h;
        if (map == null) {
            map = new HashMap<>();
        }
        m mVar = ((q2.d) eVar).f4747d;
        if (mVar != null) {
            this.f71c.o(eVar, map);
            T t4 = (T) mVar.get();
            if (t4 != null) {
                return t4;
            }
        }
        T a5 = this.f69a.a();
        boolean z4 = false;
        Object obj2 = null;
        for (v2.g gVar2 : this.f64g) {
            if (gVar2.f5681e.F) {
                z4 = true;
            } else {
                Object o4 = gVar2.o(eVar, map);
                if (o4 == null || this.f66i == null || gVar2.f5679c.getType() != this.f66i.getClass() || !o4.equals(this.f67j)) {
                    gVar2.b(a5, o4, false, mVar);
                } else {
                    gVar2.b(a5, this.f66i, true, mVar);
                }
                if (gVar2 == this.f71c) {
                    obj2 = o4;
                }
            }
        }
        if (z4) {
            v2.g[] gVarArr = this.f64g;
            int i6 = 0;
            for (int length = gVarArr.length; i6 < length; length = i5) {
                v2.g gVar3 = gVarArr[i6];
                v2.e eVar2 = gVar3.f5681e;
                if (eVar2.F) {
                    v2.g gVar4 = gVar3.f5694r;
                    if (gVar4 == null) {
                        gVar = gVar3;
                        i5 = length;
                        obj = null;
                    } else {
                        t2.a<?, ?> aVar = gVar3.f5695s;
                        if (eVar2.G) {
                            gVar = gVar3;
                            g.b bVar2 = v2.g.f5676u.get();
                            int i7 = bVar2.f5699c;
                            if (i7 == 0) {
                                bVar2.f5700d = gVar.f5681e.H;
                            }
                            if (i7 >= bVar2.f5700d) {
                                v2.g gVar5 = gVar.f5694r;
                                v2.e eVar3 = gVar.f5681e;
                                jVar = new l(aVar, a5, obj2, gVar5, eVar3.I, eVar3.J);
                            } else {
                                bVar2.f5699c = i7 + 1;
                                try {
                                    v2.g gVar6 = gVar.f5694r;
                                    v2.e eVar4 = gVar.f5681e;
                                    i5 = length;
                                    bVar = bVar2;
                                    try {
                                        jVar = new j(aVar, a5, obj2, gVar6, eVar4.I, eVar4.J);
                                        bVar.f5699c--;
                                        obj = jVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        bVar.f5699c--;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar = bVar2;
                                }
                            }
                        } else {
                            gVar = gVar3;
                            jVar = new l(aVar, a5, obj2, gVar4, eVar2.I, eVar2.J);
                        }
                        i5 = length;
                        obj = jVar;
                    }
                    if (obj != null) {
                        gVar.b(a5, obj, false, mVar);
                    }
                } else {
                    i5 = length;
                }
                i6++;
            }
        }
        if (mVar != null && obj2 != null) {
            mVar.a();
        }
        if (this.f65h == null) {
            this.f65h = map;
        }
        return a5;
    }
}
