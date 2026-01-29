package kotlin.collections;

import java.util.RandomAccess;

/* loaded from: classes7.dex */
public final class ArraysKt___ArraysJvmKt$asList$7 extends AbstractList<Boolean> implements RandomAccess {
    public final /* synthetic */ boolean[] $this_asList;

    public ArraysKt___ArraysJvmKt$asList$7(boolean[] zArr) {
        this.$this_asList = zArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Boolean) {
            return contains(((Boolean) obj).booleanValue());
        }
        return false;
    }

    public boolean contains(boolean z4) {
        return ArraysKt___ArraysKt.contains(this.$this_asList, z4);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Boolean get(int i5) {
        return Boolean.valueOf(this.$this_asList[i5]);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.$this_asList.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            return indexOf(((Boolean) obj).booleanValue());
        }
        return -1;
    }

    public int indexOf(boolean z4) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, z4);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.$this_asList.length == 0;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Boolean) {
            return lastIndexOf(((Boolean) obj).booleanValue());
        }
        return -1;
    }

    public int lastIndexOf(boolean z4) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, z4);
    }
}
