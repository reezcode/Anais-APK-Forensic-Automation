package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class MovingSubList<E> extends AbstractList<E> implements RandomAccess {
    private int _size;
    private int fromIndex;
    private final List<E> list;

    /* JADX WARN: Multi-variable type inference failed */
    public MovingSubList(List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
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

    public final void move(int i5, int i6) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, this.list.size());
        this.fromIndex = i5;
        this._size = i6 - i5;
    }
}
