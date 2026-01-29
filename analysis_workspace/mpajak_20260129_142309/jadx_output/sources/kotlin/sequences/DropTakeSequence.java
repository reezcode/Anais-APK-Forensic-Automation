package kotlin.sequences;

/* loaded from: classes11.dex */
public interface DropTakeSequence<T> extends Sequence<T> {
    Sequence<T> drop(int i5);

    Sequence<T> take(int i5);
}
