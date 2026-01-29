package kotlin.coroutines;

import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class ContinuationKt {
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Continuation<T> Continuation(final CoroutineContext context, final Function1<? super Result<? extends T>, Unit> resumeWith) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resumeWith, "resumeWith");
        return new Continuation<T>() { // from class: kotlin.coroutines.ContinuationKt$Continuation$1
            @Override // kotlin.coroutines.Continuation
            public CoroutineContext getContext() {
                return CoroutineContext.this;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object obj) {
                resumeWith.invoke(Result.m15boximpl(obj));
            }
        };
    }

    @SinceKotlin(version = "1.3")
    public static final <T> Continuation<Unit> createCoroutine(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function1, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    @SinceKotlin(version = "1.3")
    public static final <R, T> Continuation<Unit> createCoroutine(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r4, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, r4, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    private static final CoroutineContext getCoroutineContext() {
        throw new NotImplementedError("Implemented as intrinsic");
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> void resume(Continuation<? super T> continuation, T t4) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m16constructorimpl(t4));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> void resumeWithException(Continuation<? super T> continuation, Throwable exception) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(exception)));
    }

    @SinceKotlin(version = "1.3")
    public static final <T> void startCoroutine(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function1, completion));
        Result.Companion companion = Result.Companion;
        intercepted.resumeWith(Result.m16constructorimpl(Unit.INSTANCE));
    }

    @SinceKotlin(version = "1.3")
    public static final <R, T> void startCoroutine(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r4, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, r4, completion));
        Result.Companion companion = Result.Companion;
        intercepted.resumeWith(Result.m16constructorimpl(Unit.INSTANCE));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object suspendCoroutine(Function1<? super Continuation<? super T>, Unit> function1, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        function1.invoke(safeContinuation);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return orThrow;
    }
}
