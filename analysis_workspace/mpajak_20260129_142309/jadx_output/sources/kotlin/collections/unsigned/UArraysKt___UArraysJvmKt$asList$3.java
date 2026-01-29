package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

/* loaded from: classes17.dex */
public final class UArraysKt___UArraysJvmKt$asList$3 extends AbstractList<UByte> implements RandomAccess {
    public final /* synthetic */ byte[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$3(byte[] bArr) {
        this.$this_asList = bArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return m527contains7apg3OU(((UByte) obj).m83unboximpl());
        }
        return false;
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m527contains7apg3OU(byte b5) {
        return UByteArray.m87contains7apg3OU(this.$this_asList, b5);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i5) {
        return UByte.m28boximpl(m528getw2LRezQ(i5));
    }

    /* renamed from: get-w2LRezQ, reason: not valid java name */
    public byte m528getw2LRezQ(int i5) {
        return UByteArray.m91getw2LRezQ(this.$this_asList, i5);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return UByteArray.m92getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UByte) {
            return m529indexOf7apg3OU(((UByte) obj).m83unboximpl());
        }
        return -1;
    }

    /* renamed from: indexOf-7apg3OU, reason: not valid java name */
    public int m529indexOf7apg3OU(byte b5) {
        return ArraysKt.indexOf(this.$this_asList, b5);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UByteArray.m94isEmptyimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UByte) {
            return m530lastIndexOf7apg3OU(((UByte) obj).m83unboximpl());
        }
        return -1;
    }

    /* renamed from: lastIndexOf-7apg3OU, reason: not valid java name */
    public int m530lastIndexOf7apg3OU(byte b5) {
        return ArraysKt.lastIndexOf(this.$this_asList, b5);
    }
}
