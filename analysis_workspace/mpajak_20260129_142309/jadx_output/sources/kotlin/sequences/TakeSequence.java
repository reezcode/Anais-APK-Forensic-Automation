package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes10.dex */
public final class TakeSequence<T> implements Sequence<T>, DropTakeSequence<T> {
    private final int count;
    private final Sequence<T> sequence;

    /* JADX WARN: Multi-variable type inference failed */
    public TakeSequence(Sequence<? extends T> sequence, int i5) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.count = i5;
        if (i5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i5 + FilenameUtils.EXTENSION_SEPARATOR).toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> drop(int i5) {
        int i6 = this.count;
        return i5 >= i6 ? SequencesKt__SequencesKt.emptySequence() : new SubSequence(this.sequence, i5, i6);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new TakeSequence$iterator$1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> take(int i5) {
        return i5 >= this.count ? this : new TakeSequence(this.sequence, i5);
    }
}
