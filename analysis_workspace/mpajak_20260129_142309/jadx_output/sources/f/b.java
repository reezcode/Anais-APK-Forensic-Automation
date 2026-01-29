package f;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public final class b extends a implements List<Object>, Cloneable, RandomAccess, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public final List<Object> f2685i;

    /* renamed from: j, reason: collision with root package name */
    public transient Object f2686j;

    /* renamed from: k, reason: collision with root package name */
    public transient Type f2687k;

    public b() {
        this.f2685i = new ArrayList();
    }

    public b(int i5) {
        this.f2685i = new ArrayList(i5);
    }

    public b(List<Object> list) {
        this.f2685i = list;
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        this.f2685i.add(i5, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f2685i.add(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection<? extends Object> collection) {
        return this.f2685i.addAll(i5, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        return this.f2685i.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f2685i.clear();
    }

    public final Object clone() {
        return new b(new ArrayList(this.f2685i));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2685i.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f2685i.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f2685i.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        return this.f2685i.get(i5);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f2685i.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f2685i.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f2685i.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f2685i.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f2685i.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator() {
        return this.f2685i.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator(int i5) {
        return this.f2685i.listIterator(i5);
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        return this.f2685i.remove(i5);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f2685i.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.f2685i.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.f2685i.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        if (i5 != -1) {
            if (this.f2685i.size() > i5) {
                return this.f2685i.set(i5, obj);
            }
            for (int size = this.f2685i.size(); size < i5; size++) {
                this.f2685i.add(null);
            }
        }
        this.f2685i.add(obj);
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f2685i.size();
    }

    @Override // java.util.List
    public final List<Object> subList(int i5, int i6) {
        return this.f2685i.subList(i5, i6);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f2685i.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f2685i.toArray(tArr);
    }
}
