package m3;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import m3.u0;

/* loaded from: classes18.dex */
public abstract class g0<T> extends r3.g {

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public int f4177d;

    public g0(int i5) {
        this.f4177d = i5;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract Continuation<T> b();

    public Throwable d(Object obj) {
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null) {
            return nVar.f4202a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        d1.d.g(b().getContext(), new z("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        Object m16constructorimpl;
        u0 u0Var;
        Object m16constructorimpl2;
        Object m16constructorimpl3;
        r3.h hVar = this.f5065c;
        try {
            q3.e eVar = (q3.e) b();
            Continuation<T> continuation = eVar.f4763f;
            Object obj = eVar.f4765h;
            CoroutineContext context = continuation.getContext();
            Object b5 = q3.t.b(context, obj);
            j1 o4 = b5 != q3.t.f4791a ? d1.d.o(continuation, context, b5) : null;
            try {
                CoroutineContext context2 = continuation.getContext();
                Object g5 = g();
                Throwable d5 = d(g5);
                if (d5 == null && d1.d.i(this.f4177d)) {
                    int i5 = u0.f4216a;
                    u0Var = (u0) context2.get(u0.b.f4217b);
                } else {
                    u0Var = null;
                }
                if (u0Var != null && !u0Var.isActive()) {
                    CancellationException q4 = u0Var.q();
                    a(g5, q4);
                    Result.Companion companion = Result.Companion;
                    m16constructorimpl2 = Result.m16constructorimpl(ResultKt.createFailure(q4));
                } else if (d5 != null) {
                    Result.Companion companion2 = Result.Companion;
                    m16constructorimpl2 = Result.m16constructorimpl(ResultKt.createFailure(d5));
                } else {
                    Result.Companion companion3 = Result.Companion;
                    m16constructorimpl2 = Result.m16constructorimpl(e(g5));
                }
                continuation.resumeWith(m16constructorimpl2);
                Unit unit = Unit.INSTANCE;
                if (o4 != null) {
                    throw null;
                }
                q3.t.a(context, b5);
                try {
                    Result.Companion companion4 = Result.Companion;
                    hVar.a();
                    m16constructorimpl3 = Result.m16constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Companion companion5 = Result.Companion;
                    m16constructorimpl3 = Result.m16constructorimpl(ResultKt.createFailure(th));
                }
                f(null, Result.m19exceptionOrNullimpl(m16constructorimpl3));
            } catch (Throwable th2) {
                if (o4 != null) {
                    throw null;
                }
                q3.t.a(context, b5);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.Companion companion6 = Result.Companion;
                hVar.a();
                m16constructorimpl = Result.m16constructorimpl(Unit.INSTANCE);
            } catch (Throwable th4) {
                Result.Companion companion7 = Result.Companion;
                m16constructorimpl = Result.m16constructorimpl(ResultKt.createFailure(th4));
            }
            f(th3, Result.m19exceptionOrNullimpl(m16constructorimpl));
        }
    }
}
