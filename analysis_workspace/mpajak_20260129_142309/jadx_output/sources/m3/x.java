package m3;

import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.SequencesKt;

/* loaded from: classes23.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final List<w> f4222a = SequencesKt.toList(SequencesKt.asSequence(androidx.appcompat.widget.a.l()));

    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        Throwable runtimeException;
        Iterator<w> it = f4222a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    ExceptionsKt.addSuppressed(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            Result.Companion companion = Result.Companion;
            ExceptionsKt.addSuppressed(th, new e0(coroutineContext));
            Result.m16constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.Companion;
            Result.m16constructorimpl(ResultKt.createFailure(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
