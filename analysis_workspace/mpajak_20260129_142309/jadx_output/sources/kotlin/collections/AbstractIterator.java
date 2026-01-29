package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes7.dex */
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {
    private T nextValue;
    private State state = State.NotReady;

    /* loaded from: classes23.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean tryToComputeNext() {
        this.state = State.Failed;
        computeNext();
        return this.state == State.Ready;
    }

    public abstract void computeNext();

    public final void done() {
        this.state = State.Done;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        State state = this.state;
        if (!(state != State.Failed)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i5 == 1) {
            return false;
        }
        if (i5 != 2) {
            return tryToComputeNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = State.NotReady;
        return this.nextValue;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNext(T t4) {
        this.nextValue = t4;
        this.state = State.Ready;
    }
}
