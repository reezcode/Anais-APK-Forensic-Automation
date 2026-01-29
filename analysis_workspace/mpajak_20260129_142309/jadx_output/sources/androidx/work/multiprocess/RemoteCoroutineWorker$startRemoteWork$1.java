package androidx.work.multiprocess;

import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import m3.y;

@DebugMetadata(c = "androidx.work.multiprocess.RemoteCoroutineWorker$startRemoteWork$1", f = "RemoteCoroutineWorker.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes23.dex */
public final class RemoteCoroutineWorker$startRemoteWork$1 extends SuspendLambda implements Function2<y, Continuation<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ RemoteCoroutineWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCoroutineWorker$startRemoteWork$1(RemoteCoroutineWorker remoteCoroutineWorker, Continuation<? super RemoteCoroutineWorker$startRemoteWork$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteCoroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteCoroutineWorker$startRemoteWork$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(y yVar, Continuation<? super Unit> continuation) {
        return ((RemoteCoroutineWorker$startRemoteWork$1) create(yVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SettableFuture settableFuture;
        SettableFuture settableFuture2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                RemoteCoroutineWorker remoteCoroutineWorker = this.this$0;
                this.label = 1;
                obj = remoteCoroutineWorker.doRemoteWork(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            settableFuture2 = this.this$0.future;
            settableFuture2.set((ListenableWorker.Result) obj);
        } catch (Throwable th) {
            settableFuture = this.this$0.future;
            settableFuture.setException(th);
        }
        return Unit.INSTANCE;
    }
}
