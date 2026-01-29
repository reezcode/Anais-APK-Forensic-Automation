package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes2.dex */
public final class TransformingIndexedSequence$iterator$1<R> implements Iterator<R>, KMappedMarker {
    private int index;
    private final Iterator<T> iterator;
    public final /* synthetic */ TransformingIndexedSequence<T, R> this$0;

    public TransformingIndexedSequence$iterator$1(TransformingIndexedSequence<T, R> transformingIndexedSequence) {
        Sequence sequence;
        this.this$0 = transformingIndexedSequence;
        sequence = ((TransformingIndexedSequence) transformingIndexedSequence).sequence;
        this.iterator = sequence.iterator();
    }

    public final int getIndex() {
        return this.index;
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public R next() {
        Function2 function2;
        function2 = ((TransformingIndexedSequence) this.this$0).transformer;
        int i5 = this.index;
        this.index = i5 + 1;
        if (i5 < 0) {
            CollectionsKt.throwIndexOverflow();
        }
        return (R) function2.invoke(Integer.valueOf(i5), this.iterator.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i5) {
        this.index = i5;
    }
}
