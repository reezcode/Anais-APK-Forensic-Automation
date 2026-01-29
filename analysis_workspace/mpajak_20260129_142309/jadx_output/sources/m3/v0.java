package m3;

import java.util.concurrent.CancellationException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class v0 extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public final transient u0 f4220b;

    public v0(String str, Throwable th, u0 u0Var) {
        super(str);
        this.f4220b = u0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof v0) {
                v0 v0Var = (v0) obj;
                if (!Intrinsics.areEqual(v0Var.getMessage(), getMessage()) || !Intrinsics.areEqual(v0Var.f4220b, this.f4220b) || !Intrinsics.areEqual(v0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int hashCode = (this.f4220b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f4220b;
    }
}
