package t2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes20.dex */
public final class l<T, ID> extends d<T, ID> {
    public l(g<T, ID> gVar, Object obj, Object obj2, v2.g gVar2, String str, boolean z4) {
        super(gVar, obj, obj2, gVar2, str, z4);
    }

    @Override // t2.e
    public final f<T> b() {
        return s();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        f s4 = s();
        do {
            try {
                if (!s4.hasNext()) {
                    try {
                        s4.close();
                    } catch (SQLException unused) {
                    }
                    return false;
                }
            } finally {
                try {
                    s4.close();
                } catch (SQLException unused2) {
                }
            }
        } while (!s4.next().equals(obj));
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        HashSet hashSet = new HashSet(collection);
        f s4 = s();
        while (s4.hasNext()) {
            try {
                hashSet.remove(s4.next());
            } finally {
                try {
                    s4.close();
                } catch (SQLException unused) {
                }
            }
        }
        return hashSet.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        f s4 = s();
        try {
            return !s4.hasNext();
        } finally {
            try {
                s4.close();
            } catch (SQLException unused) {
            }
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return s();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f s4 = s();
        do {
            try {
                if (!s4.hasNext()) {
                    try {
                        s4.close();
                    } catch (SQLException unused) {
                    }
                    return false;
                }
            } finally {
                try {
                    s4.close();
                } catch (SQLException unused2) {
                }
            }
        } while (!s4.next().equals(obj));
        s4.remove();
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        f s4 = s();
        boolean z4 = false;
        while (s4.hasNext()) {
            try {
                if (collection.contains(s4.next())) {
                    s4.remove();
                    z4 = true;
                }
            } finally {
                try {
                    s4.close();
                } catch (SQLException unused) {
                }
            }
        }
        return z4;
    }

    public final f s() {
        try {
            g<T, ID> gVar = this.f5431b;
            if (gVar != null) {
                return gVar.q(r());
            }
            throw new IllegalStateException("Internal DAO object is null.  Lazy collections cannot be used if they have been deserialized.");
        } catch (SQLException e5) {
            StringBuilder g5 = androidx.activity.d.g("Could not build lazy iterator for ");
            g5.append(this.f5431b.a());
            throw new IllegalStateException(g5.toString(), e5);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        f s4 = s();
        int i5 = 0;
        while (s4.hasNext()) {
            try {
                s4.moveToNext();
                i5++;
            } finally {
                try {
                    s4.close();
                } catch (SQLException unused) {
                }
            }
        }
        return i5;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        ArrayList arrayList = new ArrayList();
        f s4 = s();
        while (s4.hasNext()) {
            try {
                arrayList.add(s4.next());
            } finally {
                try {
                    s4.close();
                } catch (SQLException unused) {
                }
            }
        }
        return arrayList.toArray();
    }

    @Override // java.util.Collection
    public final <E> E[] toArray(E[] eArr) {
        f s4 = s();
        ArrayList arrayList = null;
        int i5 = 0;
        while (s4.hasNext()) {
            try {
                T next = s4.next();
                if (i5 >= eArr.length) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        for (E e5 : eArr) {
                            arrayList.add(e5);
                        }
                    }
                    arrayList.add(next);
                } else {
                    eArr[i5] = next;
                }
                i5++;
            } finally {
                try {
                    s4.close();
                } catch (SQLException unused) {
                }
            }
        }
        if (arrayList != null) {
            return (E[]) arrayList.toArray(eArr);
        }
        if (i5 < eArr.length - 1) {
            eArr[i5] = 0;
        }
        return eArr;
    }
}
