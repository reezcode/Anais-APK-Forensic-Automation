package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes20.dex */
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {
    private final int count;
    private final Sequence<T> sequence;

    /* JADX WARN: Multi-variable type inference failed */
    public DropSequence(Sequence<? extends T> sequence, int i5) {
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
        int i6 = this.count + i5;
        return i6 < 0 ? new DropSequence(this, i5) : new DropSequence(this.sequence, i6);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new DropSequence$iterator$1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> take(int i5) {
        int i6 = this.count;
        int i7 = i6 + i5;
        return i7 < 0 ? new TakeSequence(this, i5) : new SubSequence(this.sequence, i6, i7);
    }
}
