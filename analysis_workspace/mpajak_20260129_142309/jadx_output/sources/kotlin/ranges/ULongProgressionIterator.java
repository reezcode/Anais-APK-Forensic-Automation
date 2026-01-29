package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(version = "1.3")
/* loaded from: classes16.dex */
final class ULongProgressionIterator implements Iterator<ULong>, KMappedMarker {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    private ULongProgressionIterator(long j5, long j6, long j7) {
        this.finalElement = j6;
        boolean z4 = true;
        int ulongCompare = UnsignedKt.ulongCompare(j5, j6);
        if (j7 <= 0 ? ulongCompare < 0 : ulongCompare > 0) {
            z4 = false;
        }
        this.hasNext = z4;
        this.step = ULong.m188constructorimpl(j7);
        this.next = this.hasNext ? j5 : j6;
    }

    public /* synthetic */ ULongProgressionIterator(long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j5, j6, j7);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ ULong next() {
        return ULong.m182boximpl(m1257nextsVKNKU());
    }

    /* renamed from: next-s-VKNKU, reason: not valid java name */
    public long m1257nextsVKNKU() {
        long j5 = this.next;
        if (j5 != this.finalElement) {
            this.next = ULong.m188constructorimpl(this.step + j5);
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return j5;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
