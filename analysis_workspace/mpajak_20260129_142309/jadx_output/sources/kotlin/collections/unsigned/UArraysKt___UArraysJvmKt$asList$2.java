package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

/* loaded from: classes23.dex */
public final class UArraysKt___UArraysJvmKt$asList$2 extends AbstractList<ULong> implements RandomAccess {
    public final /* synthetic */ long[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$2(long[] jArr) {
        this.$this_asList = jArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m523containsVKZWuLQ(((ULong) obj).m239unboximpl());
        }
        return false;
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m523containsVKZWuLQ(long j5) {
        return ULongArray.m243containsVKZWuLQ(this.$this_asList, j5);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i5) {
        return ULong.m182boximpl(m524getsVKNKU(i5));
    }

    /* renamed from: get-s-VKNKU, reason: not valid java name */
    public long m524getsVKNKU(int i5) {
        return ULongArray.m247getsVKNKU(this.$this_asList, i5);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return ULongArray.m248getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ULong) {
            return m525indexOfVKZWuLQ(((ULong) obj).m239unboximpl());
        }
        return -1;
    }

    /* renamed from: indexOf-VKZWuLQ, reason: not valid java name */
    public int m525indexOfVKZWuLQ(long j5) {
        return ArraysKt.indexOf(this.$this_asList, j5);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return ULongArray.m250isEmptyimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ULong) {
            return m526lastIndexOfVKZWuLQ(((ULong) obj).m239unboximpl());
        }
        return -1;
    }

    /* renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
    public int m526lastIndexOfVKZWuLQ(long j5) {
        return ArraysKt.lastIndexOf(this.$this_asList, j5);
    }
}
