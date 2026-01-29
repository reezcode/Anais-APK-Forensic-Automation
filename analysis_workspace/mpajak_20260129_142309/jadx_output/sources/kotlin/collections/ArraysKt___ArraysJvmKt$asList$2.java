package kotlin.collections;

import java.util.RandomAccess;

/* loaded from: classes16.dex */
public final class ArraysKt___ArraysJvmKt$asList$2 extends AbstractList<Short> implements RandomAccess {
    public final /* synthetic */ short[] $this_asList;

    public ArraysKt___ArraysJvmKt$asList$2(short[] sArr) {
        this.$this_asList = sArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Short) {
            return contains(((Number) obj).shortValue());
        }
        return false;
    }

    public boolean contains(short s4) {
        return ArraysKt___ArraysKt.contains(this.$this_asList, s4);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Short get(int i5) {
        return Short.valueOf(this.$this_asList[i5]);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.$this_asList.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Short) {
            return indexOf(((Number) obj).shortValue());
        }
        return -1;
    }

    public int indexOf(short s4) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, s4);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.$this_asList.length == 0;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Short) {
            return lastIndexOf(((Number) obj).shortValue());
        }
        return -1;
    }

    public int lastIndexOf(short s4) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, s4);
    }
}
