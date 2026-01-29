package kotlin.collections;

import java.util.RandomAccess;

/* loaded from: classes21.dex */
public final class ArraysKt___ArraysJvmKt$asList$6 extends AbstractList<Double> implements RandomAccess {
    public final /* synthetic */ double[] $this_asList;

    public ArraysKt___ArraysJvmKt$asList$6(double[] dArr) {
        this.$this_asList = dArr;
    }

    public boolean contains(double d5) {
        for (double d6 : this.$this_asList) {
            if (Double.doubleToLongBits(d6) == Double.doubleToLongBits(d5)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Double) {
            return contains(((Number) obj).doubleValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Double get(int i5) {
        return Double.valueOf(this.$this_asList[i5]);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.$this_asList.length;
    }

    public int indexOf(double d5) {
        double[] dArr = this.$this_asList;
        int length = dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (Double.doubleToLongBits(dArr[i5]) == Double.doubleToLongBits(d5)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Double) {
            return indexOf(((Number) obj).doubleValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.$this_asList.length == 0;
    }

    public int lastIndexOf(double d5) {
        double[] dArr = this.$this_asList;
        int length = dArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i5 = length - 1;
            if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d5)) {
                return length;
            }
            if (i5 < 0) {
                return -1;
            }
            length = i5;
        }
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Double) {
            return lastIndexOf(((Number) obj).doubleValue());
        }
        return -1;
    }
}
