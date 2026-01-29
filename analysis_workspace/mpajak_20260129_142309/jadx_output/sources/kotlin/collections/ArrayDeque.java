package kotlin.collections;

import androidx.appcompat.widget.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
/* loaded from: classes12.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    private static final int defaultMinCapacity = 10;
    private static final int maxArraySize = 2147483639;
    private Object[] elementData;
    private int head;
    private int size;
    public static final Companion Companion = new Companion(null);
    private static final Object[] emptyElementData = new Object[0];

    /* loaded from: classes21.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int newCapacity$kotlin_stdlib(int i5, int i6) {
            int i7 = i5 + (i5 >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - ArrayDeque.maxArraySize <= 0) {
                return i7;
            }
            if (i6 > ArrayDeque.maxArraySize) {
                return Integer.MAX_VALUE;
            }
            return ArrayDeque.maxArraySize;
        }
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(int i5) {
        Object[] objArr;
        if (i5 == 0) {
            objArr = emptyElementData;
        } else {
            if (i5 <= 0) {
                throw new IllegalArgumentException(a.g("Illegal Capacity: ", i5));
            }
            objArr = new Object[i5];
        }
        this.elementData = objArr;
    }

    public ArrayDeque(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    private final void copyCollectionElements(int i5, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.elementData.length;
        while (i5 < length && it.hasNext()) {
            this.elementData[i5] = it.next();
            i5++;
        }
        int i6 = this.head;
        for (int i7 = 0; i7 < i6 && it.hasNext(); i7++) {
            this.elementData[i7] = it.next();
        }
        this.size = collection.size() + size();
    }

    private final void copyElements(int i5) {
        Object[] objArr = new Object[i5];
        Object[] objArr2 = this.elementData;
        ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i6 = this.head;
        ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr, length - i6, 0, i6);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int decremented(int i5) {
        return i5 == 0 ? ArraysKt___ArraysKt.getLastIndex(this.elementData) : i5 - 1;
    }

    private final void ensureCapacity(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (i5 <= objArr.length) {
            return;
        }
        if (objArr == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(i5, 10)];
        } else {
            copyElements(Companion.newCapacity$kotlin_stdlib(objArr.length, i5));
        }
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> function1) {
        int positiveMod;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int positiveMod2 = positiveMod(size() + this.head);
                int i5 = this.head;
                if (i5 < positiveMod2) {
                    positiveMod = i5;
                    while (i5 < positiveMod2) {
                        Object obj = this.elementData[i5];
                        if (function1.invoke(obj).booleanValue()) {
                            this.elementData[positiveMod] = obj;
                            positiveMod++;
                        } else {
                            z4 = true;
                        }
                        i5++;
                    }
                    ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
                } else {
                    int length = this.elementData.length;
                    int i6 = i5;
                    boolean z5 = false;
                    while (i5 < length) {
                        Object[] objArr = this.elementData;
                        Object obj2 = objArr[i5];
                        objArr[i5] = null;
                        if (function1.invoke(obj2).booleanValue()) {
                            this.elementData[i6] = obj2;
                            i6++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    positiveMod = positiveMod(i6);
                    for (int i7 = 0; i7 < positiveMod2; i7++) {
                        Object[] objArr2 = this.elementData;
                        Object obj3 = objArr2[i7];
                        objArr2[i7] = null;
                        if (function1.invoke(obj3).booleanValue()) {
                            this.elementData[positiveMod] = obj3;
                            positiveMod = incremented(positiveMod);
                        } else {
                            z5 = true;
                        }
                    }
                    z4 = z5;
                }
                if (z4) {
                    this.size = negativeMod(positiveMod - this.head);
                }
            }
        }
        return z4;
    }

    private final int incremented(int i5) {
        if (i5 == ArraysKt___ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return i5 + 1;
    }

    @InlineOnly
    private final E internalGet(int i5) {
        return (E) this.elementData[i5];
    }

    @InlineOnly
    private final int internalIndex(int i5) {
        return positiveMod(this.head + i5);
    }

    private final int negativeMod(int i5) {
        return i5 < 0 ? i5 + this.elementData.length : i5;
    }

    private final int positiveMod(int i5) {
        Object[] objArr = this.elementData;
        return i5 >= objArr.length ? i5 - objArr.length : i5;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i5, E e5) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i5, size());
        if (i5 == size()) {
            addLast(e5);
            return;
        }
        if (i5 == 0) {
            addFirst(e5);
            return;
        }
        ensureCapacity(size() + 1);
        int positiveMod = positiveMod(this.head + i5);
        if (i5 < ((size() + 1) >> 1)) {
            int decremented = decremented(positiveMod);
            int decremented2 = decremented(this.head);
            int i6 = this.head;
            if (decremented >= i6) {
                Object[] objArr = this.elementData;
                objArr[decremented2] = objArr[i6];
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i6, i6 + 1, decremented + 1);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i6 - 1, i6, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, 0, 1, decremented + 1);
            }
            this.elementData[decremented] = e5;
            this.head = decremented2;
        } else {
            int positiveMod2 = positiveMod(size() + this.head);
            Object[] objArr4 = this.elementData;
            if (positiveMod < positiveMod2) {
                ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, positiveMod + 1, positiveMod, positiveMod2);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, 1, 0, positiveMod2);
                Object[] objArr5 = this.elementData;
                objArr5[0] = objArr5[objArr5.length - 1];
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, positiveMod + 1, positiveMod, objArr5.length - 1);
            }
            this.elementData[positiveMod] = e5;
        }
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        addLast(e5);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i5, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i5, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i5 == size()) {
            return addAll(elements);
        }
        ensureCapacity(elements.size() + size());
        int positiveMod = positiveMod(size() + this.head);
        int positiveMod2 = positiveMod(this.head + i5);
        int size = elements.size();
        if (i5 < ((size() + 1) >> 1)) {
            int i6 = this.head;
            int i7 = i6 - size;
            if (positiveMod2 < i6) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i7, i6, objArr.length);
                Object[] objArr2 = this.elementData;
                if (size >= positiveMod2) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, positiveMod2);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, 0, size, positiveMod2);
                }
            } else if (i7 >= 0) {
                Object[] objArr4 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr4, objArr4, i7, i6, positiveMod2);
            } else {
                Object[] objArr5 = this.elementData;
                i7 += objArr5.length;
                int i8 = positiveMod2 - i6;
                int length = objArr5.length - i7;
                if (length >= i8) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, i7, i6, positiveMod2);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, i7, i6, i6 + length);
                    Object[] objArr6 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, 0, this.head + length, positiveMod2);
                }
            }
            this.head = i7;
            copyCollectionElements(negativeMod(positiveMod2 - size), elements);
        } else {
            int i9 = positiveMod2 + size;
            if (positiveMod2 < positiveMod) {
                int i10 = size + positiveMod;
                Object[] objArr7 = this.elementData;
                if (i10 > objArr7.length) {
                    if (i9 >= objArr7.length) {
                        i9 -= objArr7.length;
                    } else {
                        int length2 = positiveMod - (i10 - objArr7.length);
                        ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, 0, length2, positiveMod);
                        Object[] objArr8 = this.elementData;
                        ArraysKt___ArraysJvmKt.copyInto(objArr8, objArr8, i9, positiveMod2, length2);
                    }
                }
                ArraysKt___ArraysJvmKt.copyInto(objArr7, objArr7, i9, positiveMod2, positiveMod);
            } else {
                Object[] objArr9 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr9, objArr9, size, 0, positiveMod);
                Object[] objArr10 = this.elementData;
                if (i9 >= objArr10.length) {
                    ArraysKt___ArraysJvmKt.copyInto(objArr10, objArr10, i9 - objArr10.length, positiveMod2, objArr10.length);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.elementData;
                    ArraysKt___ArraysJvmKt.copyInto(objArr11, objArr11, i9, positiveMod2, objArr11.length - size);
                }
            }
            copyCollectionElements(positiveMod2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(elements.size() + size());
        copyCollectionElements(positiveMod(size() + this.head), elements);
        return true;
    }

    public final void addFirst(E e5) {
        ensureCapacity(size() + 1);
        int decremented = decremented(this.head);
        this.head = decremented;
        this.elementData[decremented] = e5;
        this.size = size() + 1;
    }

    public final void addLast(E e5) {
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(size() + this.head)] = e5;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int positiveMod = positiveMod(size() + this.head);
        int i5 = this.head;
        if (i5 < positiveMod) {
            ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, i5, positiveMod);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, this.head, objArr.length);
            ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, 0, positiveMod);
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i5) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i5, size());
        return (E) this.elementData[positiveMod(this.head + i5)];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int positiveMod = positiveMod(size() + this.head);
        int i5 = this.head;
        if (i5 < positiveMod) {
            while (i5 < positiveMod) {
                if (!Intrinsics.areEqual(obj, this.elementData[i5])) {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < positiveMod) {
            return -1;
        }
        int length = this.elementData.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < positiveMod; i6++) {
                    if (Intrinsics.areEqual(obj, this.elementData[i6])) {
                        i5 = i6 + this.elementData.length;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(obj, this.elementData[i5])) {
                break;
            }
            i5++;
        }
        return i5 - this.head;
    }

    public final void internalStructure$kotlin_stdlib(Function2<? super Integer, ? super Object[], Unit> structure) {
        int i5;
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i5 = this.head) < positiveMod(size() + this.head)) ? this.head : i5 - this.elementData.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        int positiveMod = positiveMod(size() + this.head);
        int i5 = this.head;
        if (i5 < positiveMod) {
            lastIndex = positiveMod - 1;
            if (i5 <= lastIndex) {
                while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                    if (lastIndex != i5) {
                        lastIndex--;
                    }
                }
                return lastIndex - this.head;
            }
            return -1;
        }
        if (i5 > positiveMod) {
            int i6 = positiveMod - 1;
            while (true) {
                if (-1 >= i6) {
                    lastIndex = ArraysKt___ArraysKt.getLastIndex(this.elementData);
                    int i7 = this.head;
                    if (i7 <= lastIndex) {
                        while (!Intrinsics.areEqual(obj, this.elementData[lastIndex])) {
                            if (lastIndex != i7) {
                                lastIndex--;
                            }
                        }
                    }
                } else {
                    if (Intrinsics.areEqual(obj, this.elementData[i6])) {
                        lastIndex = i6 + this.elementData.length;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int positiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int positiveMod2 = positiveMod(size() + this.head);
                int i5 = this.head;
                if (i5 < positiveMod2) {
                    positiveMod = i5;
                    while (i5 < positiveMod2) {
                        Object obj = this.elementData[i5];
                        if (!elements.contains(obj)) {
                            this.elementData[positiveMod] = obj;
                            positiveMod++;
                        } else {
                            z4 = true;
                        }
                        i5++;
                    }
                    ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
                } else {
                    int length = this.elementData.length;
                    int i6 = i5;
                    boolean z5 = false;
                    while (i5 < length) {
                        Object[] objArr = this.elementData;
                        Object obj2 = objArr[i5];
                        objArr[i5] = null;
                        if (!elements.contains(obj2)) {
                            this.elementData[i6] = obj2;
                            i6++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    positiveMod = positiveMod(i6);
                    for (int i7 = 0; i7 < positiveMod2; i7++) {
                        Object[] objArr2 = this.elementData;
                        Object obj3 = objArr2[i7];
                        objArr2[i7] = null;
                        if (!elements.contains(obj3)) {
                            this.elementData[positiveMod] = obj3;
                            positiveMod = incremented(positiveMod);
                        } else {
                            z5 = true;
                        }
                    }
                    z4 = z5;
                }
                if (z4) {
                    this.size = negativeMod(positiveMod - this.head);
                }
            }
        }
        return z4;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i5) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i5, size());
        if (i5 == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i5 == 0) {
            return removeFirst();
        }
        int positiveMod = positiveMod(this.head + i5);
        E e5 = (E) this.elementData[positiveMod];
        if (i5 < (size() >> 1)) {
            int i6 = this.head;
            if (positiveMod >= i6) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i6 + 1, i6, positiveMod);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, 1, 0, positiveMod);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i7 = this.head;
                ArraysKt___ArraysJvmKt.copyInto(objArr3, objArr3, i7 + 1, i7, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i8 = this.head;
            objArr4[i8] = null;
            this.head = incremented(i8);
        } else {
            int positiveMod2 = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
            Object[] objArr5 = this.elementData;
            if (positiveMod <= positiveMod2) {
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, positiveMod, positiveMod + 1, positiveMod2 + 1);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(objArr5, objArr5, positiveMod, positiveMod + 1, objArr5.length);
                Object[] objArr6 = this.elementData;
                objArr6[objArr6.length - 1] = objArr6[0];
                ArraysKt___ArraysJvmKt.copyInto(objArr6, objArr6, 0, 1, positiveMod2 + 1);
            }
            this.elementData[positiveMod2] = null;
        }
        this.size = size() - 1;
        return e5;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.elementData;
        int i5 = this.head;
        E e5 = (E) objArr[i5];
        objArr[i5] = null;
        this.head = incremented(i5);
        this.size = size() - 1;
        return e5;
    }

    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int positiveMod = positiveMod(this.head + CollectionsKt__CollectionsKt.getLastIndex(this));
        Object[] objArr = this.elementData;
        E e5 = (E) objArr[positiveMod];
        objArr[positiveMod] = null;
        this.size = size() - 1;
        return e5;
    }

    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int positiveMod;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int positiveMod2 = positiveMod(size() + this.head);
                int i5 = this.head;
                if (i5 < positiveMod2) {
                    positiveMod = i5;
                    while (i5 < positiveMod2) {
                        Object obj = this.elementData[i5];
                        if (elements.contains(obj)) {
                            this.elementData[positiveMod] = obj;
                            positiveMod++;
                        } else {
                            z4 = true;
                        }
                        i5++;
                    }
                    ArraysKt___ArraysJvmKt.fill(this.elementData, (Object) null, positiveMod, positiveMod2);
                } else {
                    int length = this.elementData.length;
                    int i6 = i5;
                    boolean z5 = false;
                    while (i5 < length) {
                        Object[] objArr = this.elementData;
                        Object obj2 = objArr[i5];
                        objArr[i5] = null;
                        if (elements.contains(obj2)) {
                            this.elementData[i6] = obj2;
                            i6++;
                        } else {
                            z5 = true;
                        }
                        i5++;
                    }
                    positiveMod = positiveMod(i6);
                    for (int i7 = 0; i7 < positiveMod2; i7++) {
                        Object[] objArr2 = this.elementData;
                        Object obj3 = objArr2[i7];
                        objArr2[i7] = null;
                        if (elements.contains(obj3)) {
                            this.elementData[positiveMod] = obj3;
                            positiveMod = incremented(positiveMod);
                        } else {
                            z5 = true;
                        }
                    }
                    z4 = z5;
                }
                if (z4) {
                    this.size = negativeMod(positiveMod - this.head);
                }
            }
        }
        return z4;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i5, E e5) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i5, size());
        int positiveMod = positiveMod(this.head + i5);
        Object[] objArr = this.elementData;
        E e6 = (E) objArr[positiveMod];
        objArr[positiveMod] = e5;
        return e6;
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(array, size());
        }
        int positiveMod = positiveMod(size() + this.head);
        int i5 = this.head;
        if (i5 < positiveMod) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.elementData, array, 0, i5, positiveMod, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr, array, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, array, objArr2.length - this.head, 0, positiveMod);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
