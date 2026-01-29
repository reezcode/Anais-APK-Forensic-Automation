package kotlin.collections;

import java.util.RandomAccess;

/* loaded from: classes13.dex */
public final class ArraysKt___ArraysJvmKt$asList$5 extends AbstractList<Float> implements RandomAccess {
    public final /* synthetic */ float[] $this_asList;

    public ArraysKt___ArraysJvmKt$asList$5(float[] fArr) {
        this.$this_asList = fArr;
    }

    public boolean contains(float f5) {
        for (float f6 : this.$this_asList) {
            if (Float.floatToIntBits(f6) == Float.floatToIntBits(f5)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Float) {
            return contains(((Number) obj).floatValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Float get(int i5) {
        return Float.valueOf(this.$this_asList[i5]);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.$this_asList.length;
    }

    public int indexOf(float f5) {
        float[] fArr = this.$this_asList;
        int length = fArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (Float.floatToIntBits(fArr[i5]) == Float.floatToIntBits(f5)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Float) {
            return indexOf(((Number) obj).floatValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.$this_asList.length == 0;
    }

    public int lastIndexOf(float f5) {
        float[] fArr = this.$this_asList;
        int length = fArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i5 = length - 1;
            if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f5)) {
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
        if (obj instanceof Float) {
            return lastIndexOf(((Number) obj).floatValue());
        }
        return -1;
    }
}
