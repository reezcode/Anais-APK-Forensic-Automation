package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes6.dex */
public final class FilteringSequence$iterator$1<T> implements Iterator<T>, KMappedMarker {
    private final Iterator<T> iterator;
    private T nextItem;
    private int nextState;
    public final /* synthetic */ FilteringSequence<T> this$0;

    public FilteringSequence$iterator$1(FilteringSequence<T> filteringSequence) {
        Sequence sequence;
        this.this$0 = filteringSequence;
        sequence = ((FilteringSequence) filteringSequence).sequence;
        this.iterator = sequence.iterator();
        this.nextState = -1;
    }

    private final void calcNext() {
        int i5;
        Function1 function1;
        boolean z4;
        while (true) {
            if (!this.iterator.hasNext()) {
                i5 = 0;
                break;
            }
            T next = this.iterator.next();
            function1 = ((FilteringSequence) this.this$0).predicate;
            boolean booleanValue = ((Boolean) function1.invoke(next)).booleanValue();
            z4 = ((FilteringSequence) this.this$0).sendWhen;
            if (booleanValue == z4) {
                this.nextItem = next;
                i5 = 1;
                break;
            }
        }
        this.nextState = i5;
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final T getNextItem() {
        return this.nextItem;
    }

    public final int getNextState() {
        return this.nextState;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.nextState == -1) {
            calcNext();
        }
        return this.nextState == 1;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.nextState == -1) {
            calcNext();
        }
        if (this.nextState == 0) {
            throw new NoSuchElementException();
        }
        T t4 = this.nextItem;
        this.nextItem = null;
        this.nextState = -1;
        return t4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNextItem(T t4) {
        this.nextItem = t4;
    }

    public final void setNextState(int i5) {
        this.nextState = i5;
    }
}
