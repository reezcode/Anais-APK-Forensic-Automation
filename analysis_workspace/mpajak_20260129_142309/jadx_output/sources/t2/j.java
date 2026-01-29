package t2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class j<T, ID> extends d<T, ID> implements e {

    /* renamed from: i, reason: collision with root package name */
    public List<T> f5445i;

    public j(g<T, ID> gVar, Object obj, Object obj2, v2.g gVar2, String str, boolean z4) {
        super(gVar, obj, obj2, gVar2, str, z4);
        List<T> k5;
        if (obj2 == null) {
            k5 = new ArrayList<>();
        } else {
            k5 = ((a) gVar).k(r());
        }
        this.f5445i = k5;
    }

    @Override // t2.d, java.util.Collection
    public final boolean add(T t4) {
        if (this.f5445i.add(t4)) {
            return super.add(t4);
        }
        return false;
    }

    @Override // t2.d, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        if (this.f5445i.addAll(collection)) {
            return super.addAll(collection);
        }
        return false;
    }

    @Override // t2.e
    public final f<T> b() {
        return new i(this);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5445i.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f5445i.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f5445i.equals(((j) obj).f5445i);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f5445i.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5445i.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new i(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        g<T, ID> gVar;
        if (!this.f5445i.remove(obj) || (gVar = this.f5431b) == null) {
            return false;
        }
        try {
            return gVar.o(obj) == 1;
        } catch (SQLException e5) {
            throw new IllegalStateException("Could not delete data element from dao", e5);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            if (remove(it.next())) {
                z4 = true;
            }
        }
        return z4;
    }

    @Override // t2.d, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5445i.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f5445i.toArray();
    }

    @Override // java.util.Collection
    public final <E> E[] toArray(E[] eArr) {
        return (E[]) this.f5445i.toArray(eArr);
    }
}
