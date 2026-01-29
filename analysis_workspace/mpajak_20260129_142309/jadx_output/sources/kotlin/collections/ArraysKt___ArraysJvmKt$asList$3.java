package kotlin.collections;

import java.util.RandomAccess;

/* loaded from: classes13.dex */
public final class ArraysKt___ArraysJvmKt$asList$3 extends AbstractList<Integer> implements RandomAccess {
    public final /* synthetic */ int[] $this_asList;

    public ArraysKt___ArraysJvmKt$asList$3(int[] iArr) {
        this.$this_asList = iArr;
    }

    public boolean contains(int i5) {
        return ArraysKt___ArraysKt.contains(this.$this_asList, i5);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return contains(((Number) obj).intValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Integer get(int i5) {
        return Integer.valueOf(this.$this_asList[i5]);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.$this_asList.length;
    }

    public int indexOf(int i5) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, i5);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Integer) {
            return indexOf(((Number) obj).intValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.$this_asList.length == 0;
    }

    public int lastIndexOf(int i5) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, i5);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            return lastIndexOf(((Number) obj).intValue());
        }
        return -1;
    }
}
