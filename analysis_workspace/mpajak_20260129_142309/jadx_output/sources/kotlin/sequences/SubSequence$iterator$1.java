package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes18.dex */
public final class SubSequence$iterator$1<T> implements Iterator<T>, KMappedMarker {
    private final Iterator<T> iterator;
    private int position;
    public final /* synthetic */ SubSequence<T> this$0;

    public SubSequence$iterator$1(SubSequence<T> subSequence) {
        Sequence sequence;
        this.this$0 = subSequence;
        sequence = ((SubSequence) subSequence).sequence;
        this.iterator = sequence.iterator();
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drop() {
        /*
            r2 = this;
        L0:
            int r0 = r2.position
            kotlin.sequences.SubSequence<T> r1 = r2.this$0
            int r1 = kotlin.sequences.SubSequence.access$getStartIndex$p(r1)
            if (r0 >= r1) goto L1e
            java.util.Iterator<T> r0 = r2.iterator
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1e
            java.util.Iterator<T> r0 = r2.iterator
            r0.next()
            int r0 = r2.position
            int r0 = r0 + 1
            r2.position = r0
            goto L0
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SubSequence$iterator$1.drop():void");
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getPosition() {
        return this.position;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i5;
        drop();
        int i6 = this.position;
        i5 = ((SubSequence) this.this$0).endIndex;
        return i6 < i5 && this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        int i5;
        drop();
        int i6 = this.position;
        i5 = ((SubSequence) this.this$0).endIndex;
        if (i6 >= i5) {
            throw new NoSuchElementException();
        }
        this.position++;
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPosition(int i5) {
        this.position = i5;
    }
}
