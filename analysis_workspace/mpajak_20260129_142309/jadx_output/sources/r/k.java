package r;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import r.j;
import v.o;

/* loaded from: classes7.dex */
public final class k<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<DataType> f4886a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends p.j<DataType, ResourceType>> f4887b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.e<ResourceType, Transcode> f4888c;

    /* renamed from: d, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f4889d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4890e;

    /* loaded from: classes11.dex */
    public interface a<ResourceType> {
    }

    public k(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends p.j<DataType, ResourceType>> list, d0.e<ResourceType, Transcode> eVar, Pools.Pool<List<Throwable>> pool) {
        this.f4886a = cls;
        this.f4887b = list;
        this.f4888c = eVar;
        this.f4889d = pool;
        StringBuilder g5 = androidx.activity.d.g("Failed DecodePath{");
        g5.append(cls.getSimpleName());
        g5.append("->");
        g5.append(cls2.getSimpleName());
        g5.append("->");
        g5.append(cls3.getSimpleName());
        g5.append("}");
        this.f4890e = g5.toString();
    }

    public final w<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i5, int i6, @NonNull p.h hVar, a<ResourceType> aVar) {
        w<ResourceType> wVar;
        p.l lVar;
        p.c cVar;
        p.f fVar;
        List<Throwable> acquire = this.f4889d.acquire();
        Objects.requireNonNull(acquire, "Argument must not be null");
        List<Throwable> list = acquire;
        try {
            w<ResourceType> b5 = b(eVar, i5, i6, hVar, list);
            this.f4889d.release(list);
            j.b bVar = (j.b) aVar;
            j jVar = j.this;
            p.a aVar2 = bVar.f4878a;
            Objects.requireNonNull(jVar);
            Class<?> cls = b5.get().getClass();
            p.k kVar = null;
            if (aVar2 != p.a.RESOURCE_DISK_CACHE) {
                p.l f5 = jVar.f4853b.f(cls);
                lVar = f5;
                wVar = f5.b(jVar.f4860i, b5, jVar.f4864m, jVar.f4865n);
            } else {
                wVar = b5;
                lVar = null;
            }
            if (!b5.equals(wVar)) {
                b5.recycle();
            }
            boolean z4 = false;
            if (jVar.f4853b.f4837c.f555b.f574d.a(wVar.b()) != null) {
                kVar = jVar.f4853b.f4837c.f555b.f574d.a(wVar.b());
                if (kVar == null) {
                    throw new g.d(wVar.b());
                }
                cVar = kVar.b(jVar.f4867p);
            } else {
                cVar = p.c.NONE;
            }
            p.k kVar2 = kVar;
            i<R> iVar = jVar.f4853b;
            p.f fVar2 = jVar.f4876y;
            ArrayList arrayList = (ArrayList) iVar.c();
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                if (((o.a) arrayList.get(i7)).f5512a.equals(fVar2)) {
                    z4 = true;
                    break;
                }
                i7++;
            }
            w<ResourceType> wVar2 = wVar;
            if (jVar.f4866o.d(!z4, aVar2, cVar)) {
                if (kVar2 == null) {
                    throw new g.d(wVar.get().getClass());
                }
                int ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    fVar = new f(jVar.f4876y, jVar.f4861j);
                } else {
                    if (ordinal != 1) {
                        throw new IllegalArgumentException("Unknown strategy: " + cVar);
                    }
                    fVar = new y(jVar.f4853b.f4837c.f554a, jVar.f4876y, jVar.f4861j, jVar.f4864m, jVar.f4865n, lVar, cls, jVar.f4867p);
                }
                v<Z> a5 = v.a(wVar);
                j.c<?> cVar2 = jVar.f4858g;
                cVar2.f4880a = fVar;
                cVar2.f4881b = kVar2;
                cVar2.f4882c = a5;
                wVar2 = a5;
            }
            return this.f4888c.a(wVar2, hVar);
        } catch (Throwable th) {
            this.f4889d.release(list);
            throw th;
        }
    }

    @NonNull
    public final w<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i5, int i6, @NonNull p.h hVar, List<Throwable> list) {
        int size = this.f4887b.size();
        w<ResourceType> wVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            p.j<DataType, ResourceType> jVar = this.f4887b.get(i7);
            try {
                if (jVar.a(eVar.a(), hVar)) {
                    wVar = jVar.b(eVar.a(), i5, i6, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e5) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e5);
                }
                list.add(e5);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new r(this.f4890e, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("DecodePath{ dataClass=");
        g5.append(this.f4886a);
        g5.append(", decoders=");
        g5.append(this.f4887b);
        g5.append(", transcoder=");
        g5.append(this.f4888c);
        g5.append('}');
        return g5.toString();
    }
}
