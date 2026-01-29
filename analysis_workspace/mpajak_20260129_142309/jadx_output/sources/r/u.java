package r;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import r.k;

/* loaded from: classes11.dex */
public final class u<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f4978a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends k<Data, ResourceType, Transcode>> f4979b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4980c;

    public u(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<k<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f4978a = pool;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f4979b = list;
        StringBuilder g5 = androidx.activity.d.g("Failed LoadPath{");
        g5.append(cls.getSimpleName());
        g5.append("->");
        g5.append(cls2.getSimpleName());
        g5.append("->");
        g5.append(cls3.getSimpleName());
        g5.append("}");
        this.f4980c = g5.toString();
    }

    public final w<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, @NonNull p.h hVar, int i5, int i6, k.a<ResourceType> aVar) {
        List<Throwable> acquire = this.f4978a.acquire();
        Objects.requireNonNull(acquire, "Argument must not be null");
        List<Throwable> list = acquire;
        try {
            int size = this.f4979b.size();
            w<Transcode> wVar = null;
            for (int i7 = 0; i7 < size; i7++) {
                try {
                    wVar = this.f4979b.get(i7).a(eVar, i5, i6, hVar, aVar);
                } catch (r e5) {
                    list.add(e5);
                }
                if (wVar != null) {
                    break;
                }
            }
            if (wVar != null) {
                return wVar;
            }
            throw new r(this.f4980c, new ArrayList(list));
        } finally {
            this.f4978a.release(list);
        }
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("LoadPath{decodePaths=");
        g5.append(Arrays.toString(this.f4979b.toArray()));
        g5.append('}');
        return g5.toString();
    }
}
