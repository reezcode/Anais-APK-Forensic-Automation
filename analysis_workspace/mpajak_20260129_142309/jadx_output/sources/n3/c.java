package n3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import m3.a1;
import m3.h0;
import m3.u0;

/* loaded from: classes2.dex */
public final class c extends d {
    private volatile c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4518c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4519d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4520e;

    /* renamed from: f, reason: collision with root package name */
    public final c f4521f;

    public c(Handler handler, String str, boolean z4) {
        this.f4518c = handler;
        this.f4519d = str;
        this.f4520e = z4;
        this._immediate = z4 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f4521f = cVar;
    }

    @Override // m3.v
    public final void c(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f4518c.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        u0 u0Var = (u0) coroutineContext.get(u0.b.f4217b);
        if (u0Var != null) {
            u0Var.r(cancellationException);
        }
        h0.f4180b.c(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f4518c == this.f4518c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4518c);
    }

    @Override // m3.a1, m3.v
    public final String toString() {
        String z4 = z();
        if (z4 != null) {
            return z4;
        }
        String str = this.f4519d;
        if (str == null) {
            str = this.f4518c.toString();
        }
        return this.f4520e ? androidx.activity.d.f(str, ".immediate") : str;
    }

    @Override // m3.v
    public final boolean x() {
        return (this.f4520e && Intrinsics.areEqual(Looper.myLooper(), this.f4518c.getLooper())) ? false : true;
    }

    @Override // m3.a1
    public final a1 y() {
        return this.f4521f;
    }
}
