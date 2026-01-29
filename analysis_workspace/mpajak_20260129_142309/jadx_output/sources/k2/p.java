package k2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes20.dex */
public final class p<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final Comparator<Comparable> f3834i = new a();

    /* renamed from: b, reason: collision with root package name */
    public Comparator<? super K> f3835b;

    /* renamed from: c, reason: collision with root package name */
    public e<K, V> f3836c;

    /* renamed from: d, reason: collision with root package name */
    public int f3837d;

    /* renamed from: e, reason: collision with root package name */
    public int f3838e;

    /* renamed from: f, reason: collision with root package name */
    public final e<K, V> f3839f;

    /* renamed from: g, reason: collision with root package name */
    public p<K, V>.b f3840g;

    /* renamed from: h, reason: collision with root package name */
    public p<K, V>.c f3841h;

    /* loaded from: classes23.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes11.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes22.dex */
        public class a extends p<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && p.this.b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e<K, V> b5;
            if (!(obj instanceof Map.Entry) || (b5 = p.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            p.this.e(b5, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return p.this.f3837d;
        }
    }

    /* loaded from: classes16.dex */
    public final class c extends AbstractSet<K> {

        /* loaded from: classes20.dex */
        public class a extends p<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return a().f3853g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return p.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            p pVar = p.this;
            e<K, V> c5 = pVar.c(obj);
            if (c5 != null) {
                pVar.e(c5, true);
            }
            return c5 != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return p.this.f3837d;
        }
    }

    /* loaded from: classes13.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f3844b;

        /* renamed from: c, reason: collision with root package name */
        public e<K, V> f3845c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f3846d;

        public d() {
            this.f3844b = p.this.f3839f.f3851e;
            this.f3846d = p.this.f3838e;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f3844b;
            p pVar = p.this;
            if (eVar == pVar.f3839f) {
                throw new NoSuchElementException();
            }
            if (pVar.f3838e != this.f3846d) {
                throw new ConcurrentModificationException();
            }
            this.f3844b = eVar.f3851e;
            this.f3845c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3844b != p.this.f3839f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f3845c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            p.this.e(eVar, true);
            this.f3845c = null;
            this.f3846d = p.this.f3838e;
        }
    }

    /* loaded from: classes18.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f3848b;

        /* renamed from: c, reason: collision with root package name */
        public e<K, V> f3849c;

        /* renamed from: d, reason: collision with root package name */
        public e<K, V> f3850d;

        /* renamed from: e, reason: collision with root package name */
        public e<K, V> f3851e;

        /* renamed from: f, reason: collision with root package name */
        public e<K, V> f3852f;

        /* renamed from: g, reason: collision with root package name */
        public final K f3853g;

        /* renamed from: h, reason: collision with root package name */
        public V f3854h;

        /* renamed from: i, reason: collision with root package name */
        public int f3855i;

        public e() {
            this.f3853g = null;
            this.f3852f = this;
            this.f3851e = this;
        }

        public e(e<K, V> eVar, K k5, e<K, V> eVar2, e<K, V> eVar3) {
            this.f3848b = eVar;
            this.f3853g = k5;
            this.f3855i = 1;
            this.f3851e = eVar2;
            this.f3852f = eVar3;
            eVar3.f3851e = this;
            eVar2.f3852f = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k5 = this.f3853g;
            if (k5 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k5.equals(entry.getKey())) {
                return false;
            }
            V v4 = this.f3854h;
            Object value = entry.getValue();
            if (v4 == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v4.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f3853g;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f3854h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k5 = this.f3853g;
            int hashCode = k5 == null ? 0 : k5.hashCode();
            V v4 = this.f3854h;
            return hashCode ^ (v4 != null ? v4.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v4) {
            V v5 = this.f3854h;
            this.f3854h = v4;
            return v5;
        }

        public final String toString() {
            return this.f3853g + "=" + this.f3854h;
        }
    }

    public p() {
        Comparator<Comparable> comparator = f3834i;
        this.f3837d = 0;
        this.f3838e = 0;
        this.f3839f = new e<>();
        this.f3835b = comparator;
    }

    public final e<K, V> a(K k5, boolean z4) {
        int i5;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f3835b;
        e<K, V> eVar2 = this.f3836c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f3834i ? (Comparable) k5 : null;
            while (true) {
                K k6 = eVar2.f3853g;
                i5 = comparable != null ? comparable.compareTo(k6) : comparator.compare(k5, k6);
                if (i5 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i5 < 0 ? eVar2.f3849c : eVar2.f3850d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i5 = 0;
        }
        if (!z4) {
            return null;
        }
        e<K, V> eVar4 = this.f3839f;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k5, eVar4, eVar4.f3852f);
            if (i5 < 0) {
                eVar2.f3849c = eVar;
            } else {
                eVar2.f3850d = eVar;
            }
            d(eVar2, true);
        } else {
            if (comparator == f3834i && !(k5 instanceof Comparable)) {
                throw new ClassCastException(k5.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k5, eVar4, eVar4.f3852f);
            this.f3836c = eVar;
        }
        this.f3837d++;
        this.f3838e++;
        return eVar;
    }

    public final e<K, V> b(Map.Entry<?, ?> entry) {
        e<K, V> c5 = c(entry.getKey());
        boolean z4 = false;
        if (c5 != null) {
            V v4 = c5.f3854h;
            Object value = entry.getValue();
            if (v4 == value || (v4 != null && v4.equals(value))) {
                z4 = true;
            }
        }
        if (z4) {
            return c5;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e<K, V> c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f3836c = null;
        this.f3837d = 0;
        this.f3838e++;
        e<K, V> eVar = this.f3839f;
        eVar.f3852f = eVar;
        eVar.f3851e = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(e<K, V> eVar, boolean z4) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f3849c;
            e<K, V> eVar3 = eVar.f3850d;
            int i5 = eVar2 != null ? eVar2.f3855i : 0;
            int i6 = eVar3 != null ? eVar3.f3855i : 0;
            int i7 = i5 - i6;
            if (i7 == -2) {
                e<K, V> eVar4 = eVar3.f3849c;
                e<K, V> eVar5 = eVar3.f3850d;
                int i8 = (eVar4 != null ? eVar4.f3855i : 0) - (eVar5 != null ? eVar5.f3855i : 0);
                if (i8 != -1 && (i8 != 0 || z4)) {
                    h(eVar3);
                }
                g(eVar);
                if (z4) {
                    return;
                }
            } else if (i7 == 2) {
                e<K, V> eVar6 = eVar2.f3849c;
                e<K, V> eVar7 = eVar2.f3850d;
                int i9 = (eVar6 != null ? eVar6.f3855i : 0) - (eVar7 != null ? eVar7.f3855i : 0);
                if (i9 != 1 && (i9 != 0 || z4)) {
                    g(eVar2);
                }
                h(eVar);
                if (z4) {
                    return;
                }
            } else if (i7 == 0) {
                eVar.f3855i = i5 + 1;
                if (z4) {
                    return;
                }
            } else {
                eVar.f3855i = Math.max(i5, i6) + 1;
                if (!z4) {
                    return;
                }
            }
            eVar = eVar.f3848b;
        }
    }

    public final void e(e<K, V> eVar, boolean z4) {
        int i5;
        if (z4) {
            e<K, V> eVar2 = eVar.f3852f;
            eVar2.f3851e = eVar.f3851e;
            eVar.f3851e.f3852f = eVar2;
        }
        e<K, V> eVar3 = eVar.f3849c;
        e<K, V> eVar4 = eVar.f3850d;
        e<K, V> eVar5 = eVar.f3848b;
        int i6 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                f(eVar, eVar3);
                eVar.f3849c = null;
            } else if (eVar4 != null) {
                f(eVar, eVar4);
                eVar.f3850d = null;
            } else {
                f(eVar, null);
            }
            d(eVar5, false);
            this.f3837d--;
            this.f3838e++;
            return;
        }
        if (eVar3.f3855i > eVar4.f3855i) {
            while (true) {
                e<K, V> eVar6 = eVar3.f3850d;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar3 = eVar6;
                }
            }
        } else {
            while (true) {
                e<K, V> eVar7 = eVar4.f3849c;
                if (eVar7 == null) {
                    break;
                } else {
                    eVar4 = eVar7;
                }
            }
            eVar3 = eVar4;
        }
        e(eVar3, false);
        e<K, V> eVar8 = eVar.f3849c;
        if (eVar8 != null) {
            i5 = eVar8.f3855i;
            eVar3.f3849c = eVar8;
            eVar8.f3848b = eVar3;
            eVar.f3849c = null;
        } else {
            i5 = 0;
        }
        e<K, V> eVar9 = eVar.f3850d;
        if (eVar9 != null) {
            i6 = eVar9.f3855i;
            eVar3.f3850d = eVar9;
            eVar9.f3848b = eVar3;
            eVar.f3850d = null;
        }
        eVar3.f3855i = Math.max(i5, i6) + 1;
        f(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        p<K, V>.b bVar = this.f3840g;
        if (bVar != null) {
            return bVar;
        }
        p<K, V>.b bVar2 = new b();
        this.f3840g = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f3848b;
        eVar.f3848b = null;
        if (eVar2 != null) {
            eVar2.f3848b = eVar3;
        }
        if (eVar3 == null) {
            this.f3836c = eVar2;
        } else if (eVar3.f3849c == eVar) {
            eVar3.f3849c = eVar2;
        } else {
            eVar3.f3850d = eVar2;
        }
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f3849c;
        e<K, V> eVar3 = eVar.f3850d;
        e<K, V> eVar4 = eVar3.f3849c;
        e<K, V> eVar5 = eVar3.f3850d;
        eVar.f3850d = eVar4;
        if (eVar4 != null) {
            eVar4.f3848b = eVar;
        }
        f(eVar, eVar3);
        eVar3.f3849c = eVar;
        eVar.f3848b = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f3855i : 0, eVar4 != null ? eVar4.f3855i : 0) + 1;
        eVar.f3855i = max;
        eVar3.f3855i = Math.max(max, eVar5 != null ? eVar5.f3855i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        e<K, V> c5 = c(obj);
        if (c5 != null) {
            return c5.f3854h;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f3849c;
        e<K, V> eVar3 = eVar.f3850d;
        e<K, V> eVar4 = eVar2.f3849c;
        e<K, V> eVar5 = eVar2.f3850d;
        eVar.f3849c = eVar5;
        if (eVar5 != null) {
            eVar5.f3848b = eVar;
        }
        f(eVar, eVar2);
        eVar2.f3850d = eVar;
        eVar.f3848b = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f3855i : 0, eVar5 != null ? eVar5.f3855i : 0) + 1;
        eVar.f3855i = max;
        eVar2.f3855i = Math.max(max, eVar4 != null ? eVar4.f3855i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        p<K, V>.c cVar = this.f3841h;
        if (cVar != null) {
            return cVar;
        }
        p<K, V>.c cVar2 = new c();
        this.f3841h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k5, V v4) {
        Objects.requireNonNull(k5, "key == null");
        e<K, V> a5 = a(k5, true);
        V v5 = a5.f3854h;
        a5.f3854h = v4;
        return v5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e<K, V> c5 = c(obj);
        if (c5 != null) {
            e(c5, true);
        }
        if (c5 != null) {
            return c5.f3854h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3837d;
    }
}
