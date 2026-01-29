package androidx.work;

import androidx.annotation.RestrictTo;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.InlineMarker;
import m3.f;

/* loaded from: classes4.dex */
public final class ListenableFutureKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <R> Object await(h2.a<R> aVar, Continuation<? super R> continuation) {
        if (aVar.isDone()) {
            try {
                return aVar.get();
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                if (cause == null) {
                    throw e5;
                }
                throw cause;
            }
        }
        f fVar = new f(IntrinsicsKt.intercepted(continuation));
        fVar.o();
        aVar.addListener(new ListenableFutureKt$await$2$1(fVar, aVar), DirectExecutor.INSTANCE);
        fVar.q(new ListenableFutureKt$await$2$2(aVar));
        Object n4 = fVar.n();
        if (n4 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return n4;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static final <R> Object await$$forInline(h2.a<R> aVar, Continuation<? super R> continuation) {
        if (aVar.isDone()) {
            try {
                return aVar.get();
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e5;
            }
        }
        InlineMarker.mark(0);
        f fVar = new f(IntrinsicsKt.intercepted(continuation));
        fVar.o();
        aVar.addListener(new ListenableFutureKt$await$2$1(fVar, aVar), DirectExecutor.INSTANCE);
        fVar.q(new ListenableFutureKt$await$2$2(aVar));
        Unit unit = Unit.INSTANCE;
        Object n4 = fVar.n();
        if (n4 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return n4;
    }
}
