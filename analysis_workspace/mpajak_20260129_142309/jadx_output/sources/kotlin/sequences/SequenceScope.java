package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@SinceKotlin(version = "1.3")
@RestrictsSuspension
/* loaded from: classes4.dex */
public abstract class SequenceScope<T> {
    public abstract Object yield(T t4, Continuation<? super Unit> continuation);

    public final Object yieldAll(Iterable<? extends T> iterable, Continuation<? super Unit> continuation) {
        Object yieldAll;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (yieldAll = yieldAll(iterable.iterator(), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? yieldAll : Unit.INSTANCE;
    }

    public abstract Object yieldAll(Iterator<? extends T> it, Continuation<? super Unit> continuation);

    public final Object yieldAll(Sequence<? extends T> sequence, Continuation<? super Unit> continuation) {
        Object yieldAll = yieldAll(sequence.iterator(), continuation);
        return yieldAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? yieldAll : Unit.INSTANCE;
    }
}
