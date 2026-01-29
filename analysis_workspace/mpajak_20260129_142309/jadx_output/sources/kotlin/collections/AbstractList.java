package kotlin.collections;

import androidx.activity.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(version = "1.1")
/* loaded from: classes10.dex */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int i5, int i6, int i7) {
            if (i5 >= 0 && i6 <= i7) {
                if (i5 > i6) {
                    throw new IllegalArgumentException(d.d("startIndex: ", i5, " > endIndex: ", i6));
                }
                return;
            }
            throw new IndexOutOfBoundsException("startIndex: " + i5 + ", endIndex: " + i6 + ", size: " + i7);
        }

        public final void checkElementIndex$kotlin_stdlib(int i5, int i6) {
            if (i5 < 0 || i5 >= i6) {
                throw new IndexOutOfBoundsException(d.d("index: ", i5, ", size: ", i6));
            }
        }

        public final void checkPositionIndex$kotlin_stdlib(int i5, int i6) {
            if (i5 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException(d.d("index: ", i5, ", size: ", i6));
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int i5, int i6, int i7) {
            if (i5 >= 0 && i6 <= i7) {
                if (i5 > i6) {
                    throw new IllegalArgumentException(d.d("fromIndex: ", i5, " > toIndex: ", i6));
                }
                return;
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i5 + ", toIndex: " + i6 + ", size: " + i7);
        }

        public final boolean orderedEquals$kotlin_stdlib(Collection<?> c5, Collection<?> other) {
            Intrinsics.checkNotNullParameter(c5, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c5.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c5.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.areEqual(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int orderedHashCode$kotlin_stdlib(Collection<?> c5) {
            Intrinsics.checkNotNullParameter(c5, "c");
            Iterator<?> it = c5.iterator();
            int i5 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i5 = (i5 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i5;
        }
    }

    /* loaded from: classes16.dex */
    public class IteratorImpl implements Iterator<E>, KMappedMarker {
        private int index;

        public IteratorImpl() {
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            int i5 = this.index;
            this.index = i5 + 1;
            return abstractList.get(i5);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i5) {
            this.index = i5;
        }
    }

    /* loaded from: classes25.dex */
    public class ListIteratorImpl extends AbstractList<E>.IteratorImpl implements ListIterator<E> {
        public ListIteratorImpl(int i5) {
            super();
            AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i5, AbstractList.this.size());
            setIndex(i5);
        }

        @Override // java.util.ListIterator
        public void add(E e5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return getIndex() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return getIndex();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            setIndex(getIndex() - 1);
            return abstractList.get(getIndex());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return getIndex() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes13.dex */
    public static final class SubList<E> extends AbstractList<E> implements RandomAccess {
        private int _size;
        private final int fromIndex;
        private final AbstractList<E> list;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(AbstractList<? extends E> list, int i5, int i6) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.fromIndex = i5;
            AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, list.size());
            this._size = i6 - i5;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i5) {
            AbstractList.Companion.checkElementIndex$kotlin_stdlib(i5, this._size);
            return this.list.get(this.fromIndex + i5);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this._size;
        }
    }

    @Override // java.util.List
    public void add(int i5, E e5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i5, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.orderedEquals$kotlin_stdlib(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i5);

    @Override // kotlin.collections.AbstractCollection
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.orderedHashCode$kotlin_stdlib(this);
    }

    public int indexOf(E e5) {
        Iterator<E> it = iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), e5)) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new IteratorImpl();
    }

    public int lastIndexOf(E e5) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.areEqual(listIterator.previous(), e5)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new ListIteratorImpl(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i5) {
        return new ListIteratorImpl(i5);
    }

    @Override // java.util.List
    public E remove(int i5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i5, E e5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i5, int i6) {
        return new SubList(this, i5, i6);
    }
}
