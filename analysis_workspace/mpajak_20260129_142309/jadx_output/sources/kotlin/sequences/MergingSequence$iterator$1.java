package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes3.dex */
public final class MergingSequence$iterator$1<V> implements Iterator<V>, KMappedMarker {
    private final Iterator<T1> iterator1;
    private final Iterator<T2> iterator2;
    public final /* synthetic */ MergingSequence<T1, T2, V> this$0;

    public MergingSequence$iterator$1(MergingSequence<T1, T2, V> mergingSequence) {
        Sequence sequence;
        Sequence sequence2;
        this.this$0 = mergingSequence;
        sequence = ((MergingSequence) mergingSequence).sequence1;
        this.iterator1 = sequence.iterator();
        sequence2 = ((MergingSequence) mergingSequence).sequence2;
        this.iterator2 = sequence2.iterator();
    }

    public final Iterator<T1> getIterator1() {
        return this.iterator1;
    }

    public final Iterator<T2> getIterator2() {
        return this.iterator2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator1.hasNext() && this.iterator2.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        Function2 function2;
        function2 = ((MergingSequence) this.this$0).transform;
        return (V) function2.invoke(this.iterator1.next(), this.iterator2.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
