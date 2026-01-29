package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

/* loaded from: classes11.dex */
public final class UArraysKt___UArraysJvmKt$asList$1 extends AbstractList<UInt> implements RandomAccess {
    public final /* synthetic */ int[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$1(int[] iArr) {
        this.$this_asList = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return m519containsWZ4Q5Ns(((UInt) obj).m161unboximpl());
        }
        return false;
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m519containsWZ4Q5Ns(int i5) {
        return UIntArray.m165containsWZ4Q5Ns(this.$this_asList, i5);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i5) {
        return UInt.m104boximpl(m520getpVg5ArA(i5));
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public int m520getpVg5ArA(int i5) {
        return UIntArray.m169getpVg5ArA(this.$this_asList, i5);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return UIntArray.m170getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UInt) {
            return m521indexOfWZ4Q5Ns(((UInt) obj).m161unboximpl());
        }
        return -1;
    }

    /* renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
    public int m521indexOfWZ4Q5Ns(int i5) {
        return ArraysKt.indexOf(this.$this_asList, i5);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UIntArray.m172isEmptyimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UInt) {
            return m522lastIndexOfWZ4Q5Ns(((UInt) obj).m161unboximpl());
        }
        return -1;
    }

    /* renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
    public int m522lastIndexOfWZ4Q5Ns(int i5) {
        return ArraysKt.lastIndexOf(this.$this_asList, i5);
    }
}
