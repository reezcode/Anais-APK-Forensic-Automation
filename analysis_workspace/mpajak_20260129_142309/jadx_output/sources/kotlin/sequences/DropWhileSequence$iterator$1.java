package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class DropWhileSequence$iterator$1<T> implements Iterator<T>, KMappedMarker {
    private int dropState;
    private final Iterator<T> iterator;
    private T nextItem;
    public final /* synthetic */ DropWhileSequence<T> this$0;

    public DropWhileSequence$iterator$1(DropWhileSequence<T> dropWhileSequence) {
        Sequence sequence;
        this.this$0 = dropWhileSequence;
        sequence = ((DropWhileSequence) dropWhileSequence).sequence;
        this.iterator = sequence.iterator();
        this.dropState = -1;
    }

    private final void drop() {
        int i5;
        Function1 function1;
        while (true) {
            if (!this.iterator.hasNext()) {
                i5 = 0;
                break;
            }
            T next = this.iterator.next();
            function1 = ((DropWhileSequence) this.this$0).predicate;
            if (!((Boolean) function1.invoke(next)).booleanValue()) {
                this.nextItem = next;
                i5 = 1;
                break;
            }
        }
        this.dropState = i5;
    }

    public final int getDropState() {
        return this.dropState;
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final T getNextItem() {
        return this.nextItem;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.dropState == -1) {
            drop();
        }
        return this.dropState == 1 || this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.dropState == -1) {
            drop();
        }
        if (this.dropState != 1) {
            return this.iterator.next();
        }
        T t4 = this.nextItem;
        this.nextItem = null;
        this.dropState = 0;
        return t4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setDropState(int i5) {
        this.dropState = i5;
    }

    public final void setNextItem(T t4) {
        this.nextItem = t4;
    }
}
