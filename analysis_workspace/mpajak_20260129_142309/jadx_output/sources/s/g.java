package s;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s.l;

/* loaded from: classes20.dex */
public final class g<K extends l, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a<K, V> f5082a = new a<>(null);

    /* renamed from: b, reason: collision with root package name */
    public final Map<K, a<K, V>> f5083b = new HashMap();

    /* loaded from: classes14.dex */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f5084a;

        /* renamed from: b, reason: collision with root package name */
        public List<V> f5085b;

        /* renamed from: c, reason: collision with root package name */
        public a<K, V> f5086c;

        /* renamed from: d, reason: collision with root package name */
        public a<K, V> f5087d;

        public a() {
            this(null);
        }

        public a(K k5) {
            this.f5087d = this;
            this.f5086c = this;
            this.f5084a = k5;
        }

        @Nullable
        public final V a() {
            List<V> list = this.f5085b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return (V) this.f5085b.remove(size - 1);
            }
            return null;
        }
    }

    public static <K, V> void c(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f5087d;
        aVar2.f5086c = aVar.f5086c;
        aVar.f5086c.f5087d = aVar2;
    }

    @Nullable
    public final V a(K k5) {
        a aVar;
        a aVar2 = (a) this.f5083b.get(k5);
        if (aVar2 == null) {
            a aVar3 = new a(k5);
            this.f5083b.put(k5, aVar3);
            aVar = aVar3;
        } else {
            k5.a();
            aVar = aVar2;
        }
        c(aVar);
        a<K, V> aVar4 = this.f5082a;
        aVar.f5087d = aVar4;
        a<K, V> aVar5 = aVar4.f5086c;
        aVar.f5086c = aVar5;
        aVar5.f5087d = aVar;
        aVar.f5087d.f5086c = aVar;
        return (V) aVar.a();
    }

    public final void b(K k5, V v4) {
        a aVar = (a) this.f5083b.get(k5);
        if (aVar == null) {
            aVar = new a(k5);
            c(aVar);
            a<K, V> aVar2 = this.f5082a;
            aVar.f5087d = aVar2.f5087d;
            aVar.f5086c = aVar2;
            aVar2.f5087d = aVar;
            aVar.f5087d.f5086c = aVar;
            this.f5083b.put(k5, aVar);
        } else {
            k5.a();
        }
        if (aVar.f5085b == null) {
            aVar.f5085b = new ArrayList();
        }
        aVar.f5085b.add(v4);
    }

    @Nullable
    public final V d() {
        a aVar = this.f5082a;
        while (true) {
            aVar = aVar.f5087d;
            if (aVar.equals(this.f5082a)) {
                return null;
            }
            V v4 = (V) aVar.a();
            if (v4 != null) {
                return v4;
            }
            c(aVar);
            this.f5083b.remove(aVar.f5084a);
            ((l) aVar.f5084a).a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z4 = false;
        for (a aVar = this.f5082a.f5086c; !aVar.equals(this.f5082a); aVar = aVar.f5086c) {
            z4 = true;
            sb.append('{');
            sb.append(aVar.f5084a);
            sb.append(':');
            List<V> list = aVar.f5085b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z4) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
