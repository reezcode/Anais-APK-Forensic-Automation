package kotlin.collections;

import androidx.activity.d;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes10.dex */
public final class SlidingWindowKt {
    public static final void checkWindowSizeStep(int i5, int i6) {
        String c5;
        if (i5 > 0 && i6 > 0) {
            return;
        }
        if (i5 != i6) {
            c5 = "Both size " + i5 + " and step " + i6 + " must be greater than zero.";
        } else {
            c5 = d.c("size ", i5, " must be greater than zero.");
        }
        throw new IllegalArgumentException(c5.toString());
    }

    public static final <T> Iterator<List<T>> windowedIterator(Iterator<? extends T> iterator, int i5, int i6, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? EmptyIterator.INSTANCE : SequencesKt.iterator(new SlidingWindowKt$windowedIterator$1(i5, i6, iterator, z5, z4, null));
    }

    public static final <T> Sequence<List<T>> windowedSequence(final Sequence<? extends T> sequence, final int i5, final int i6, final boolean z4, final boolean z5) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        checkWindowSizeStep(i5, i6);
        return new Sequence<List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<List<? extends T>> iterator() {
                return SlidingWindowKt.windowedIterator(Sequence.this.iterator(), i5, i6, z4, z5);
            }
        };
    }
}
