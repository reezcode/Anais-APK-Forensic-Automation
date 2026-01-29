package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

/* loaded from: classes11.dex */
public final class UArraysKt___UArraysJvmKt$asList$4 extends AbstractList<UShort> implements RandomAccess {
    public final /* synthetic */ short[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$4(short[] sArr) {
        this.$this_asList = sArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UShort) {
            return m531containsxj2QHRw(((UShort) obj).m343unboximpl());
        }
        return false;
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m531containsxj2QHRw(short s4) {
        return UShortArray.m347containsxj2QHRw(this.$this_asList, s4);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i5) {
        return UShort.m288boximpl(m532getMh2AYeg(i5));
    }

    /* renamed from: get-Mh2AYeg, reason: not valid java name */
    public short m532getMh2AYeg(int i5) {
        return UShortArray.m351getMh2AYeg(this.$this_asList, i5);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return UShortArray.m352getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UShort) {
            return m533indexOfxj2QHRw(((UShort) obj).m343unboximpl());
        }
        return -1;
    }

    /* renamed from: indexOf-xj2QHRw, reason: not valid java name */
    public int m533indexOfxj2QHRw(short s4) {
        return ArraysKt.indexOf(this.$this_asList, s4);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UShortArray.m354isEmptyimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UShort) {
            return m534lastIndexOfxj2QHRw(((UShort) obj).m343unboximpl());
        }
        return -1;
    }

    /* renamed from: lastIndexOf-xj2QHRw, reason: not valid java name */
    public int m534lastIndexOfxj2QHRw(short s4) {
        return ArraysKt.lastIndexOf(this.$this_asList, s4);
    }
}
