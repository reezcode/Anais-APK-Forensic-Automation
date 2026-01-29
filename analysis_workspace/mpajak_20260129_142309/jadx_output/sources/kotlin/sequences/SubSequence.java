package kotlin.sequences;

import androidx.activity.d;
import androidx.appcompat.widget.a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {
    private final int endIndex;
    private final Sequence<T> sequence;
    private final int startIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(Sequence<? extends T> sequence, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.startIndex = i5;
        this.endIndex = i6;
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(a.g("startIndex should be non-negative, but is ", i5).toString());
        }
        if (!(i6 >= 0)) {
            throw new IllegalArgumentException(a.g("endIndex should be non-negative, but is ", i6).toString());
        }
        if (!(i6 >= i5)) {
            throw new IllegalArgumentException(d.d("endIndex should be not less than startIndex, but was ", i6, " < ", i5).toString());
        }
    }

    private final int getCount() {
        return this.endIndex - this.startIndex;
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> drop(int i5) {
        return i5 >= getCount() ? SequencesKt__SequencesKt.emptySequence() : new SubSequence(this.sequence, this.startIndex + i5, this.endIndex);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new SubSequence$iterator$1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public Sequence<T> take(int i5) {
        if (i5 >= getCount()) {
            return this;
        }
        Sequence<T> sequence = this.sequence;
        int i6 = this.startIndex;
        return new SubSequence(sequence, i6, i5 + i6);
    }
}
