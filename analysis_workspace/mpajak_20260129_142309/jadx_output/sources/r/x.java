package r;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import r.h;
import v.o;

/* loaded from: classes10.dex */
public final class x implements h, d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final h.a f4986b;

    /* renamed from: c, reason: collision with root package name */
    public final i<?> f4987c;

    /* renamed from: d, reason: collision with root package name */
    public int f4988d;

    /* renamed from: e, reason: collision with root package name */
    public int f4989e = -1;

    /* renamed from: f, reason: collision with root package name */
    public p.f f4990f;

    /* renamed from: g, reason: collision with root package name */
    public List<v.o<File, ?>> f4991g;

    /* renamed from: h, reason: collision with root package name */
    public int f4992h;

    /* renamed from: i, reason: collision with root package name */
    public volatile o.a<?> f4993i;

    /* renamed from: j, reason: collision with root package name */
    public File f4994j;

    /* renamed from: k, reason: collision with root package name */
    public y f4995k;

    public x(i<?> iVar, h.a aVar) {
        this.f4987c = iVar;
        this.f4986b = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(@NonNull Exception exc) {
        this.f4986b.b(this.f4995k, exc, this.f4993i.f5514c, p.a.RESOURCE_DISK_CACHE);
    }

    @Override // r.h
    public final void cancel() {
        o.a<?> aVar = this.f4993i;
        if (aVar != null) {
            aVar.f5514c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void d(Object obj) {
        this.f4986b.d(this.f4990f, obj, this.f4993i.f5514c, p.a.RESOURCE_DISK_CACHE, this.f4995k);
    }

    @Override // r.h
    public final boolean e() {
        List<Class<?>> list;
        List<Class<?>> d5;
        ArrayList arrayList = (ArrayList) this.f4987c.a();
        if (arrayList.isEmpty()) {
            return false;
        }
        i<?> iVar = this.f4987c;
        com.bumptech.glide.g gVar = iVar.f4837c.f555b;
        Class<?> cls = iVar.f4838d.getClass();
        Class<?> cls2 = iVar.f4841g;
        Class<?> cls3 = iVar.f4845k;
        g0.d dVar = gVar.f578h;
        l0.i andSet = dVar.f2915a.getAndSet(null);
        if (andSet == null) {
            andSet = new l0.i(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (dVar.f2916b) {
            list = dVar.f2916b.get(andSet);
        }
        dVar.f2915a.set(andSet);
        List<Class<?>> list2 = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            v.q qVar = gVar.f571a;
            synchronized (qVar) {
                d5 = qVar.f5515a.d(cls);
            }
            Iterator it = ((ArrayList) d5).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) gVar.f573c.b((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) gVar.f576f.a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            g0.d dVar2 = gVar.f578h;
            List<Class<?>> unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (dVar2.f2916b) {
                dVar2.f2916b.put(new l0.i(cls, cls2, cls3), unmodifiableList);
            }
            list2 = arrayList2;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f4987c.f4845k)) {
                return false;
            }
            StringBuilder g5 = androidx.activity.d.g("Failed to find any load path from ");
            g5.append(this.f4987c.f4838d.getClass());
            g5.append(" to ");
            g5.append(this.f4987c.f4845k);
            throw new IllegalStateException(g5.toString());
        }
        while (true) {
            List<v.o<File, ?>> list3 = this.f4991g;
            if (list3 != null) {
                if (this.f4992h < list3.size()) {
                    this.f4993i = null;
                    boolean z4 = false;
                    while (!z4) {
                        if (!(this.f4992h < this.f4991g.size())) {
                            break;
                        }
                        List<v.o<File, ?>> list4 = this.f4991g;
                        int i5 = this.f4992h;
                        this.f4992h = i5 + 1;
                        v.o<File, ?> oVar = list4.get(i5);
                        File file = this.f4994j;
                        i<?> iVar2 = this.f4987c;
                        this.f4993i = oVar.a(file, iVar2.f4839e, iVar2.f4840f, iVar2.f4843i);
                        if (this.f4993i != null && this.f4987c.g(this.f4993i.f5514c.a())) {
                            this.f4993i.f5514c.f(this.f4987c.f4849o, this);
                            z4 = true;
                        }
                    }
                    return z4;
                }
            }
            int i6 = this.f4989e + 1;
            this.f4989e = i6;
            if (i6 >= list2.size()) {
                int i7 = this.f4988d + 1;
                this.f4988d = i7;
                if (i7 >= arrayList.size()) {
                    return false;
                }
                this.f4989e = 0;
            }
            p.f fVar = (p.f) arrayList.get(this.f4988d);
            Class<?> cls5 = list2.get(this.f4989e);
            p.l<Z> f5 = this.f4987c.f(cls5);
            i<?> iVar3 = this.f4987c;
            this.f4995k = new y(iVar3.f4837c.f554a, fVar, iVar3.f4848n, iVar3.f4839e, iVar3.f4840f, f5, cls5, iVar3.f4843i);
            File a5 = iVar3.b().a(this.f4995k);
            this.f4994j = a5;
            if (a5 != null) {
                this.f4990f = fVar;
                this.f4991g = this.f4987c.f4837c.f555b.f(a5);
                this.f4992h = 0;
            }
        }
    }
}
