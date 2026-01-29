package r;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import r.h;
import v.o;

/* loaded from: classes15.dex */
public final class e implements h, d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final List<p.f> f4821b;

    /* renamed from: c, reason: collision with root package name */
    public final i<?> f4822c;

    /* renamed from: d, reason: collision with root package name */
    public final h.a f4823d;

    /* renamed from: e, reason: collision with root package name */
    public int f4824e;

    /* renamed from: f, reason: collision with root package name */
    public p.f f4825f;

    /* renamed from: g, reason: collision with root package name */
    public List<v.o<File, ?>> f4826g;

    /* renamed from: h, reason: collision with root package name */
    public int f4827h;

    /* renamed from: i, reason: collision with root package name */
    public volatile o.a<?> f4828i;

    /* renamed from: j, reason: collision with root package name */
    public File f4829j;

    public e(List<p.f> list, i<?> iVar, h.a aVar) {
        this.f4824e = -1;
        this.f4821b = list;
        this.f4822c = iVar;
        this.f4823d = aVar;
    }

    public e(i<?> iVar, h.a aVar) {
        List<p.f> a5 = iVar.a();
        this.f4824e = -1;
        this.f4821b = a5;
        this.f4822c = iVar;
        this.f4823d = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(@NonNull Exception exc) {
        this.f4823d.b(this.f4825f, exc, this.f4828i.f5514c, p.a.DATA_DISK_CACHE);
    }

    @Override // r.h
    public final void cancel() {
        o.a<?> aVar = this.f4828i;
        if (aVar != null) {
            aVar.f5514c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void d(Object obj) {
        this.f4823d.d(this.f4825f, obj, this.f4828i.f5514c, p.a.DATA_DISK_CACHE, this.f4825f);
    }

    @Override // r.h
    public final boolean e() {
        while (true) {
            List<v.o<File, ?>> list = this.f4826g;
            if (list != null) {
                if (this.f4827h < list.size()) {
                    this.f4828i = null;
                    boolean z4 = false;
                    while (!z4) {
                        if (!(this.f4827h < this.f4826g.size())) {
                            break;
                        }
                        List<v.o<File, ?>> list2 = this.f4826g;
                        int i5 = this.f4827h;
                        this.f4827h = i5 + 1;
                        v.o<File, ?> oVar = list2.get(i5);
                        File file = this.f4829j;
                        i<?> iVar = this.f4822c;
                        this.f4828i = oVar.a(file, iVar.f4839e, iVar.f4840f, iVar.f4843i);
                        if (this.f4828i != null && this.f4822c.g(this.f4828i.f5514c.a())) {
                            this.f4828i.f5514c.f(this.f4822c.f4849o, this);
                            z4 = true;
                        }
                    }
                    return z4;
                }
            }
            int i6 = this.f4824e + 1;
            this.f4824e = i6;
            if (i6 >= this.f4821b.size()) {
                return false;
            }
            p.f fVar = this.f4821b.get(this.f4824e);
            i<?> iVar2 = this.f4822c;
            File a5 = iVar2.b().a(new f(fVar, iVar2.f4848n));
            this.f4829j = a5;
            if (a5 != null) {
                this.f4825f = fVar;
                this.f4826g = this.f4822c.f4837c.f555b.f(a5);
                this.f4827h = 0;
            }
        }
    }
}
