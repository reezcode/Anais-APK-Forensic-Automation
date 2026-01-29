package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(version = "1.3")
/* loaded from: classes20.dex */
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    private UIntProgressionIterator(int i5, int i6, int i7) {
        this.finalElement = i6;
        boolean z4 = true;
        int uintCompare = UnsignedKt.uintCompare(i5, i6);
        if (i7 <= 0 ? uintCompare < 0 : uintCompare > 0) {
            z4 = false;
        }
        this.hasNext = z4;
        this.step = UInt.m110constructorimpl(i7);
        this.next = this.hasNext ? i5 : i6;
    }

    public /* synthetic */ UIntProgressionIterator(int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, i6, i7);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UInt next() {
        return UInt.m104boximpl(m1248nextpVg5ArA());
    }

    /* renamed from: next-pVg5ArA, reason: not valid java name */
    public int m1248nextpVg5ArA() {
        int i5 = this.next;
        if (i5 != this.finalElement) {
            this.next = UInt.m110constructorimpl(this.step + i5);
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return i5;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
