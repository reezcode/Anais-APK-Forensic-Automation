package q3;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import m3.h1;
import m3.j1;
import m3.k0;
import m3.u0;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final r f4766a = new r("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final r f4767b = new r("REUSABLE_CLAIMED");

    public static final <T> void a(Continuation<? super T> continuation, Object obj, Function1<? super Throwable, Unit> function1) {
        if (!(continuation instanceof e)) {
            continuation.resumeWith(obj);
            return;
        }
        e eVar = (e) continuation;
        Object H = i.g.H(obj, function1);
        m3.v vVar = eVar.f4762e;
        eVar.getContext();
        boolean z4 = true;
        if (vVar.x()) {
            eVar.f4764g = H;
            eVar.f4177d = 1;
            eVar.f4762e.c(eVar.getContext(), eVar);
            return;
        }
        h1 h1Var = h1.f4181a;
        k0 a5 = h1.a();
        if (a5.H()) {
            eVar.f4764g = H;
            eVar.f4177d = 1;
            a5.A(eVar);
            return;
        }
        a5.E(true);
        try {
            u0 u0Var = (u0) eVar.getContext().get(u0.b.f4217b);
            if (u0Var == null || u0Var.isActive()) {
                z4 = false;
            } else {
                CancellationException q4 = u0Var.q();
                if (H instanceof m3.o) {
                    ((m3.o) H).f4205b.invoke(q4);
                }
                Result.Companion companion = Result.Companion;
                eVar.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(q4)));
            }
            if (!z4) {
                Continuation<T> continuation2 = eVar.f4763f;
                Object obj2 = eVar.f4765h;
                CoroutineContext context = continuation2.getContext();
                Object b5 = t.b(context, obj2);
                j1 o4 = b5 != t.f4791a ? d1.d.o(continuation2, context, b5) : null;
                try {
                    eVar.f4763f.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                    if (o4 != null) {
                        throw null;
                    }
                    t.a(context, b5);
                } catch (Throwable th) {
                    if (o4 != null) {
                        throw null;
                    }
                    t.a(context, b5);
                    throw th;
                }
            }
            while (a5.I()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
