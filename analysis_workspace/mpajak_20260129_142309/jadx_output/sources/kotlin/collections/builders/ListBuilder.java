package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* loaded from: classes10.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements RandomAccess, Serializable {
    private E[] array;
    private final ListBuilder<E> backing;
    private boolean isReadOnly;
    private int length;
    private int offset;
    private final ListBuilder<E> root;

    /* loaded from: classes20.dex */
    public static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
        private int index;
        private int lastIndex;
        private final ListBuilder<E> list;

        public Itr(ListBuilder<E> list, int i5) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i5;
            this.lastIndex = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e5) {
            ListBuilder<E> listBuilder = this.list;
            int i5 = this.index;
            this.index = i5 + 1;
            listBuilder.add(i5, e5);
            this.lastIndex = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((ListBuilder) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.index >= ((ListBuilder) this.list).length) {
                throw new NoSuchElementException();
            }
            int i5 = this.index;
            this.index = i5 + 1;
            this.lastIndex = i5;
            return (E) ((ListBuilder) this.list).array[((ListBuilder) this.list).offset + this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i5 = this.index;
            if (i5 <= 0) {
                throw new NoSuchElementException();
            }
            int i6 = i5 - 1;
            this.index = i6;
            this.lastIndex = i6;
            return (E) ((ListBuilder) this.list).array[((ListBuilder) this.list).offset + this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i5 = this.lastIndex;
            if (!(i5 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.list.remove(i5);
            this.index = this.lastIndex;
            this.lastIndex = -1;
        }

        @Override // java.util.ListIterator
        public void set(E e5) {
            int i5 = this.lastIndex;
            if (!(i5 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.list.set(i5, e5);
        }
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i5) {
        this(ListBuilderKt.arrayOfUninitializedElements(i5), 0, 0, false, null, null);
    }

    private ListBuilder(E[] eArr, int i5, int i6, boolean z4, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.array = eArr;
        this.offset = i5;
        this.length = i6;
        this.isReadOnly = z4;
        this.backing = listBuilder;
        this.root = listBuilder2;
    }

    private final void addAllInternal(int i5, Collection<? extends E> collection, int i6) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.addAllInternal(i5, collection, i6);
            this.array = this.backing.array;
            this.length += i6;
        } else {
            insertAtInternal(i5, i6);
            Iterator<? extends E> it = collection.iterator();
            for (int i7 = 0; i7 < i6; i7++) {
                this.array[i5 + i7] = it.next();
            }
        }
    }

    private final void addAtInternal(int i5, E e5) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder == null) {
            insertAtInternal(i5, 1);
            this.array[i5] = e5;
        } else {
            listBuilder.addAtInternal(i5, e5);
            this.array = this.backing.array;
            this.length++;
        }
    }

    private final void checkIsMutable() {
        if (isEffectivelyReadOnly()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        boolean subarrayContentEquals;
        subarrayContentEquals = ListBuilderKt.subarrayContentEquals(this.array, this.offset, this.length, list);
        return subarrayContentEquals;
    }

    private final void ensureCapacity(int i5) {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.array;
        if (i5 > eArr.length) {
            this.array = (E[]) ListBuilderKt.copyOfUninitializedElements(this.array, ArrayDeque.Companion.newCapacity$kotlin_stdlib(eArr.length, i5));
        }
    }

    private final void ensureExtraCapacity(int i5) {
        ensureCapacity(this.length + i5);
    }

    private final void insertAtInternal(int i5, int i6) {
        ensureExtraCapacity(i6);
        E[] eArr = this.array;
        ArraysKt.copyInto(eArr, eArr, i5 + i6, i5, this.offset + this.length);
        this.length += i6;
    }

    private final boolean isEffectivelyReadOnly() {
        ListBuilder<E> listBuilder;
        return this.isReadOnly || ((listBuilder = this.root) != null && listBuilder.isReadOnly);
    }

    private final E removeAtInternal(int i5) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            this.length--;
            return listBuilder.removeAtInternal(i5);
        }
        E[] eArr = this.array;
        E e5 = eArr[i5];
        ArraysKt.copyInto(eArr, eArr, i5, i5 + 1, this.offset + this.length);
        ListBuilderKt.resetAt(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e5;
    }

    private final void removeRangeInternal(int i5, int i6) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.removeRangeInternal(i5, i6);
        } else {
            E[] eArr = this.array;
            ArraysKt.copyInto(eArr, eArr, i5, i5 + i6, this.length);
            E[] eArr2 = this.array;
            int i7 = this.length;
            ListBuilderKt.resetRange(eArr2, i7 - i6, i7);
        }
        this.length -= i6;
    }

    private final int retainOrRemoveAllInternal(int i5, int i6, Collection<? extends E> collection, boolean z4) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            int retainOrRemoveAllInternal = listBuilder.retainOrRemoveAllInternal(i5, i6, collection, z4);
            this.length -= retainOrRemoveAllInternal;
            return retainOrRemoveAllInternal;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            int i9 = i5 + i7;
            if (collection.contains(this.array[i9]) == z4) {
                E[] eArr = this.array;
                i7++;
                eArr[i8 + i5] = eArr[i9];
                i8++;
            } else {
                i7++;
            }
        }
        int i10 = i6 - i8;
        E[] eArr2 = this.array;
        ArraysKt.copyInto(eArr2, eArr2, i5 + i8, i6 + i5, this.length);
        E[] eArr3 = this.array;
        int i11 = this.length;
        ListBuilderKt.resetRange(eArr3, i11 - i10, i11);
        this.length -= i10;
        return i10;
    }

    private final Object writeReplace() {
        if (isEffectivelyReadOnly()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i5, E e5) {
        checkIsMutable();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i5, this.length);
        addAtInternal(this.offset + i5, e5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        checkIsMutable();
        addAtInternal(this.offset + this.length, e5);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i5, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i5, this.length);
        int size = elements.size();
        addAllInternal(this.offset + i5, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        int size = elements.size();
        addAllInternal(this.offset + this.length, elements, size);
        return size > 0;
    }

    public final List<E> build() {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        checkIsMutable();
        this.isReadOnly = true;
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && contentEquals((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i5) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i5, this.length);
        return this.array[this.offset + i5];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int subarrayContentHashCode;
        subarrayContentHashCode = ListBuilderKt.subarrayContentHashCode(this.array, this.offset, this.length);
        return subarrayContentHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i5 = 0; i5 < this.length; i5++) {
            if (Intrinsics.areEqual(this.array[this.offset + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new Itr(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i5 = this.length - 1; i5 >= 0; i5--) {
            if (Intrinsics.areEqual(this.array[this.offset + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new Itr(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i5) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i5, this.length);
        return new Itr(this, i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i5) {
        checkIsMutable();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i5, this.length);
        return removeAtInternal(this.offset + i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i5, E e5) {
        checkIsMutable();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i5, this.length);
        E[] eArr = this.array;
        int i6 = this.offset;
        E e6 = eArr[i6 + i5];
        eArr[i6 + i5] = e5;
        return e6;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i5, int i6) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, this.length);
        E[] eArr = this.array;
        int i7 = this.offset + i5;
        int i8 = i6 - i5;
        boolean z4 = this.isReadOnly;
        ListBuilder<E> listBuilder = this.root;
        return new ListBuilder(eArr, i7, i8, z4, this, listBuilder == null ? this : listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        E[] eArr = this.array;
        int i5 = this.offset;
        return ArraysKt.copyOfRange(eArr, i5, this.length + i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        int length = destination.length;
        int i5 = this.length;
        if (length < i5) {
            E[] eArr = this.array;
            int i6 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i6, i5 + i6, destination.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.array;
        int i7 = this.offset;
        ArraysKt.copyInto(eArr2, destination, 0, i7, i5 + i7);
        int length2 = destination.length;
        int i8 = this.length;
        if (length2 > i8) {
            destination[i8] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String subarrayContentToString;
        subarrayContentToString = ListBuilderKt.subarrayContentToString(this.array, this.offset, this.length);
        return subarrayContentToString;
    }
}
