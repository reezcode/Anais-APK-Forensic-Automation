package kotlin.collections;

import java.util.RandomAccess;

/* loaded from: classes21.dex */
public final class ArraysKt___ArraysJvmKt$asList$4 extends AbstractList<Long> implements RandomAccess {
    public final /* synthetic */ long[] $this_asList;

    public ArraysKt___ArraysJvmKt$asList$4(long[] jArr) {
        this.$this_asList = jArr;
    }

    public boolean contains(long j5) {
        return ArraysKt___ArraysKt.contains(this.$this_asList, j5);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Long) {
            return contains(((Number) obj).longValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Long get(int i5) {
        return Long.valueOf(this.$this_asList[i5]);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.$this_asList.length;
    }

    public int indexOf(long j5) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, j5);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Long) {
            return indexOf(((Number) obj).longValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.$this_asList.length == 0;
    }

    public int lastIndexOf(long j5) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, j5);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            return lastIndexOf(((Number) obj).longValue());
        }
        return -1;
    }
}
