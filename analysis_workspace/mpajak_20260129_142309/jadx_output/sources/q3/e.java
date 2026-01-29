package q3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import m3.a0;
import m3.g0;
import m3.h1;
import m3.k0;

/* loaded from: classes2.dex */
public final class e<T> extends g0<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4761i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public final m3.v f4762e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public final Continuation<T> f4763f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public Object f4764g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public final Object f4765h;

    /* JADX WARN: Multi-variable type inference failed */
    public e(m3.v vVar, Continuation<? super T> continuation) {
        super(-1);
        this.f4762e = vVar;
        this.f4763f = continuation;
        this.f4764g = f.f4766a;
        Object fold = getContext().fold(0, t.f4792b);
        Intrinsics.checkNotNull(fold);
        this.f4765h = fold;
        this._reusableCancellableContinuation = null;
    }

    @Override // m3.g0
    public final void a(Object obj, Throwable th) {
        if (obj instanceof m3.o) {
            ((m3.o) obj).f4205b.invoke(th);
        }
    }

    @Override // m3.g0
    public final Continuation<T> b() {
        return this;
    }

    @Override // m3.g0
    public final Object g() {
        Object obj = this.f4764g;
        this.f4764g = f.f4766a;
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f4763f;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f4763f.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean h() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean i(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r rVar = f.f4767b;
            boolean z4 = false;
            boolean z5 = true;
            if (Intrinsics.areEqual(obj, rVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4761i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, th)) {
                        z4 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
                        break;
                    }
                }
                if (z4) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4761i;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z5 = false;
                        break;
                    }
                }
                if (z5) {
                    return false;
                }
            }
        }
    }

    public final void j() {
        Object obj = this._reusableCancellableContinuation;
        m3.f fVar = obj instanceof m3.f ? (m3.f) obj : null;
        if (fVar != null) {
            fVar.k();
        }
    }

    public final Throwable k(m3.e<?> eVar) {
        boolean z4;
        do {
            Object obj = this._reusableCancellableContinuation;
            r rVar = f.f4767b;
            z4 = false;
            if (obj != rVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4761i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        z4 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z4) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4761i;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, rVar, eVar)) {
                    z4 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(this) != rVar) {
                    break;
                }
            }
        } while (!z4);
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        CoroutineContext context = this.f4763f.getContext();
        Object H = i.g.H(obj, null);
        if (this.f4762e.x()) {
            this.f4764g = H;
            this.f4177d = 0;
            this.f4762e.c(context, this);
            return;
        }
        h1 h1Var = h1.f4181a;
        k0 a5 = h1.a();
        if (a5.H()) {
            this.f4764g = H;
            this.f4177d = 0;
            a5.A(this);
            return;
        }
        a5.E(true);
        try {
            CoroutineContext context2 = getContext();
            Object b5 = t.b(context2, this.f4765h);
            try {
                this.f4763f.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                while (a5.I()) {
                }
            } finally {
                t.a(context2, b5);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("DispatchedContinuation[");
        g5.append(this.f4762e);
        g5.append(", ");
        g5.append(a0.c(this.f4763f));
        g5.append(']');
        return g5.toString();
    }
}
