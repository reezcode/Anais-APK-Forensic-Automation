package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class IndexingSequence<T> implements Sequence<IndexedValue<? extends T>> {
    private final Sequence<T> sequence;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingSequence(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<IndexedValue<T>> iterator() {
        return new IndexingSequence$iterator$1(this);
    }
}
