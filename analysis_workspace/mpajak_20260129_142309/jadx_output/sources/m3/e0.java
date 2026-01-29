package m3;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes7.dex */
public final class e0 extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f4169b;

    public e0(CoroutineContext coroutineContext) {
        this.f4169b = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f4169b.toString();
    }
}
