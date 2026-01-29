package m3;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import m3.u0;

@PublishedApi
/* loaded from: classes8.dex */
public final class f<T> extends g0<T> implements e<T>, CoroutineStackFrame {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4170h = AtomicIntegerFieldUpdater.newUpdater(f.class, "_decision");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4171i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: e, reason: collision with root package name */
    public final Continuation<T> f4172e;

    /* renamed from: f, reason: collision with root package name */
    public final CoroutineContext f4173f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f4174g;

    public f(Continuation continuation) {
        super(1);
        this.f4172e = continuation;
        this.f4173f = continuation.getContext();
        this._decision = 0;
        this._state = b.f4163b;
    }

    @Override // m3.g0
    public final void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof d1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof n) {
                return;
            }
            boolean z4 = false;
            if (obj2 instanceof m) {
                m mVar = (m) obj2;
                if (!(!(mVar.f4200e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                m a5 = m.a(mVar, null, th, 15);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4171i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a5)) {
                        z4 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (z4) {
                    d dVar = mVar.f4197b;
                    if (dVar != null) {
                        i(dVar, th);
                    }
                    Function1<Throwable, Unit> function1 = mVar.f4198c;
                    if (function1 != null) {
                        j(function1, th);
                        return;
                    }
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4171i;
                m mVar2 = new m(obj2, (d) null, (Function1) null, th, 14);
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, mVar2)) {
                        z4 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                if (z4) {
                    return;
                }
            }
        }
    }

    @Override // m3.g0
    public final Continuation<T> b() {
        return this.f4172e;
    }

    @Override // m3.e
    public final boolean c(Throwable th) {
        Object obj;
        boolean z4;
        boolean z5;
        do {
            obj = this._state;
            z4 = false;
            if (!(obj instanceof d1)) {
                return false;
            }
            z5 = obj instanceof d;
            g gVar = new g(this, th, z5);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4171i;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, gVar)) {
                    z4 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        } while (!z4);
        d dVar = z5 ? (d) obj : null;
        if (dVar != null) {
            i(dVar, th);
        }
        l();
        m(this.f4177d);
        return true;
    }

    @Override // m3.g0
    public final Throwable d(Object obj) {
        Throwable d5 = super.d(obj);
        if (d5 != null) {
            return d5;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m3.g0
    public final <T> T e(Object obj) {
        return obj instanceof m ? (T) ((m) obj).f4196a : obj;
    }

    @Override // m3.g0
    public final Object g() {
        return this._state;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f4172e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f4173f;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void h(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            d1.d.g(this.f4173f, new q("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void i(d dVar, Throwable th) {
        try {
            dVar.a(th);
        } catch (Throwable th2) {
            d1.d.g(this.f4173f, new q("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void j(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            d1.d.g(this.f4173f, new q("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void k() {
        i0 i0Var = this.f4174g;
        if (i0Var == null) {
            return;
        }
        i0Var.c();
        this.f4174g = c1.f4168b;
    }

    public final void l() {
        if (r()) {
            return;
        }
        k();
    }

    /* JADX WARN: Finally extract failed */
    public final void m(int i5) {
        boolean z4;
        while (true) {
            int i6 = this._decision;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                z4 = false;
            } else if (f4170h.compareAndSet(this, 0, 2)) {
                z4 = true;
                break;
            }
        }
        if (z4) {
            return;
        }
        Continuation<T> continuation = this.f4172e;
        boolean z5 = i5 == 4;
        if (z5 || !(continuation instanceof q3.e) || d1.d.i(i5) != d1.d.i(this.f4177d)) {
            d1.d.l(this, continuation, z5);
            return;
        }
        v vVar = ((q3.e) continuation).f4762e;
        CoroutineContext context = continuation.getContext();
        if (vVar.x()) {
            vVar.c(context, this);
            return;
        }
        h1 h1Var = h1.f4181a;
        k0 a5 = h1.a();
        if (a5.H()) {
            a5.A(this);
            return;
        }
        a5.E(true);
        try {
            d1.d.l(this, this.f4172e, true);
            do {
            } while (a5.I());
        } catch (Throwable th) {
            try {
                f(th, null);
            } finally {
                a5.y();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r4.f4174g != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        r0 = r4._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if ((r0 instanceof m3.n) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (d1.d.i(r4.f4177d) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        r1 = r4.f4173f;
        r2 = m3.u0.f4216a;
        r1 = (m3.u0) r1.get(m3.u0.b.f4217b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r1.isActive() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        r1 = r1.q();
        a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        return e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        throw ((m3.n) r0).f4202a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r2 == false) goto L21;
     */
    @kotlin.PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n() {
        /*
            r4 = this;
            boolean r0 = r4.r()
        L4:
            int r1 = r4._decision
            r2 = 0
            if (r1 == 0) goto L19
            r3 = 2
            if (r1 != r3) goto Ld
            goto L23
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = m3.f.f4170h
            r3 = 1
            boolean r1 = r1.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L4
            r2 = 1
        L23:
            if (r2 == 0) goto L36
            m3.i0 r1 = r4.f4174g
            if (r1 != 0) goto L2c
            r4.p()
        L2c:
            if (r0 == 0) goto L31
            r4.t()
        L31:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
        L36:
            if (r0 == 0) goto L3b
            r4.t()
        L3b:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof m3.n
            if (r1 != 0) goto L6b
            int r1 = r4.f4177d
            boolean r1 = d1.d.i(r1)
            if (r1 == 0) goto L66
            kotlin.coroutines.CoroutineContext r1 = r4.f4173f
            int r2 = m3.u0.f4216a
            m3.u0$b r2 = m3.u0.b.f4217b
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            m3.u0 r1 = (m3.u0) r1
            if (r1 == 0) goto L66
            boolean r2 = r1.isActive()
            if (r2 == 0) goto L5e
            goto L66
        L5e:
            java.util.concurrent.CancellationException r1 = r1.q()
            r4.a(r0, r1)
            throw r1
        L66:
            java.lang.Object r0 = r4.e(r0)
            return r0
        L6b:
            m3.n r0 = (m3.n) r0
            java.lang.Throwable r0 = r0.f4202a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.f.n():java.lang.Object");
    }

    public final void o() {
        i0 p4 = p();
        if (p4 != null && (!(this._state instanceof d1))) {
            p4.c();
            this.f4174g = c1.f4168b;
        }
    }

    public final i0 p() {
        CoroutineContext coroutineContext = this.f4173f;
        int i5 = u0.f4216a;
        u0 u0Var = (u0) coroutineContext.get(u0.b.f4217b);
        if (u0Var == null) {
            return null;
        }
        i0 a5 = u0.a.a(u0Var, true, false, new h(this), 2, null);
        this.f4174g = a5;
        return a5;
    }

    public final void q(Function1<? super Throwable, Unit> function1) {
        d r0Var = function1 instanceof d ? (d) function1 : new r0(function1);
        while (true) {
            Object obj = this._state;
            boolean z4 = false;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4171i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
                        z4 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z4) {
                    return;
                }
            } else {
                if (obj instanceof d) {
                    s(function1, obj);
                    throw null;
                }
                boolean z5 = obj instanceof n;
                if (z5) {
                    n nVar = (n) obj;
                    Objects.requireNonNull(nVar);
                    if (!n.f4201b.compareAndSet(nVar, 0, 1)) {
                        s(function1, obj);
                        throw null;
                    }
                    if (obj instanceof g) {
                        if (!z5) {
                            nVar = null;
                        }
                        h(function1, nVar != null ? nVar.f4202a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof m) {
                    m mVar = (m) obj;
                    if (mVar.f4197b != null) {
                        s(function1, obj);
                        throw null;
                    }
                    Throwable th = mVar.f4200e;
                    if (th != null) {
                        h(function1, th);
                        return;
                    }
                    m a5 = m.a(mVar, r0Var, null, 29);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4171i;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a5)) {
                            z4 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                    if (z4) {
                        return;
                    }
                } else {
                    m mVar2 = new m(obj, r0Var, (Function1) null, (Throwable) null, 28);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f4171i;
                    while (true) {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, mVar2)) {
                            z4 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                            break;
                        }
                    }
                    if (z4) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean r() {
        return (this.f4177d == 2) && ((q3.e) this.f4172e).h();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        boolean z4;
        Object obj2;
        boolean z5;
        Throwable m19exceptionOrNullimpl = Result.m19exceptionOrNullimpl(obj);
        if (m19exceptionOrNullimpl != null) {
            obj = new n(m19exceptionOrNullimpl);
        }
        int i5 = this.f4177d;
        do {
            Object obj3 = this._state;
            z4 = true;
            if (!(obj3 instanceof d1)) {
                if (obj3 instanceof g) {
                    g gVar = (g) obj3;
                    Objects.requireNonNull(gVar);
                    if (g.f4176c.compareAndSet(gVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            d1 d1Var = (d1) obj3;
            if (!(obj instanceof n) && d1.d.i(i5) && ((z5 = d1Var instanceof d))) {
                obj2 = new m(obj, z5 ? (d) d1Var : null, (Function1) null, (Throwable) null, 16);
            } else {
                obj2 = obj;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4171i;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj2)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    z4 = false;
                    break;
                }
            }
        } while (!z4);
        l();
        m(i5);
    }

    public final void s(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    public final void t() {
        Throwable k5;
        Continuation<T> continuation = this.f4172e;
        q3.e eVar = continuation instanceof q3.e ? (q3.e) continuation : null;
        if (eVar == null || (k5 = eVar.k(this)) == null) {
            return;
        }
        k();
        c(k5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation");
        sb.append('(');
        sb.append(a0.c(this.f4172e));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof d1 ? "Active" : obj instanceof g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(a0.b(this));
        return sb.toString();
    }
}
