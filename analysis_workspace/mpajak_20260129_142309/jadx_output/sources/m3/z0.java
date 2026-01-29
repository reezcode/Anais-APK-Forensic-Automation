package m3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import m3.u0;
import q3.i;

@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
/* loaded from: classes7.dex */
public class z0 implements u0, k, e1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4225b = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* loaded from: classes5.dex */
    public static final class a extends y0 {

        /* renamed from: f, reason: collision with root package name */
        public final z0 f4226f;

        /* renamed from: g, reason: collision with root package name */
        public final b f4227g;

        /* renamed from: h, reason: collision with root package name */
        public final j f4228h;

        /* renamed from: i, reason: collision with root package name */
        public final Object f4229i;

        public a(z0 z0Var, b bVar, j jVar, Object obj) {
            this.f4226f = z0Var;
            this.f4227g = bVar;
            this.f4228h = jVar;
            this.f4229i = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            k(th);
            return Unit.INSTANCE;
        }

        @Override // m3.p
        public final void k(Throwable th) {
            z0 z0Var = this.f4226f;
            b bVar = this.f4227g;
            j jVar = this.f4228h;
            Object obj = this.f4229i;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0.f4225b;
            j D = z0Var.D(jVar);
            if (D == null || !z0Var.L(bVar, D, obj)) {
                z0Var.g(z0Var.o(bVar, obj));
            }
        }
    }

    /* loaded from: classes13.dex */
    public static final class b implements p0 {
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: b, reason: collision with root package name */
        public final b1 f4230b;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        public b(b1 b1Var, Throwable th) {
            this.f4230b = b1Var;
            this._rootCause = th;
        }

        @Override // m3.p0
        public final b1 a() {
            return this.f4230b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
                return;
            }
            if (th == th2) {
                return;
            }
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = th;
                return;
            }
            if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList<Throwable> c5 = c();
                c5.add(obj);
                c5.add(th);
                this._exceptionsHolder = c5;
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + obj).toString());
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean f() {
            return this._isCompleting;
        }

        public final boolean g() {
            return this._exceptionsHolder == a0.f4160e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final List<Throwable> h(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = c();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> c5 = c();
                c5.add(obj);
                arrayList = c5;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !Intrinsics.areEqual(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = a0.f4160e;
            return arrayList;
        }

        public final void i() {
            this._isCompleting = 1;
        }

        @Override // m3.p0
        public final boolean isActive() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        public final String toString() {
            StringBuilder g5 = androidx.activity.d.g("Finishing[cancelling=");
            g5.append(e());
            g5.append(", completing=");
            g5.append((boolean) this._isCompleting);
            g5.append(", rootCause=");
            g5.append((Throwable) this._rootCause);
            g5.append(", exceptions=");
            g5.append(this._exceptionsHolder);
            g5.append(", list=");
            g5.append(this.f4230b);
            g5.append(']');
            return g5.toString();
        }
    }

    /* loaded from: classes10.dex */
    public static final class c extends i.a {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z0 f4231d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f4232e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q3.i iVar, z0 z0Var, Object obj) {
            super(iVar);
            this.f4231d = z0Var;
            this.f4232e = obj;
        }

        @Override // q3.c
        public final Object c(q3.i iVar) {
            if (this.f4231d.x() == this.f4232e) {
                return null;
            }
            return d1.c.f2476h;
        }
    }

    public z0(boolean z4) {
        this._state = z4 ? a0.f4162g : a0.f4161f;
        this._parentHandle = null;
    }

    public final void A(u0 u0Var) {
        if (u0Var == null) {
            this._parentHandle = c1.f4168b;
            return;
        }
        u0Var.start();
        i e5 = u0Var.e(this);
        this._parentHandle = e5;
        if (!(x() instanceof p0)) {
            e5.c();
            this._parentHandle = c1.f4168b;
        }
    }

    public boolean B() {
        return false;
    }

    public String C() {
        return getClass().getSimpleName();
    }

    public final j D(q3.i iVar) {
        while (iVar.i()) {
            iVar = iVar.h();
        }
        while (true) {
            iVar = iVar.g();
            if (!iVar.i()) {
                if (iVar instanceof j) {
                    return (j) iVar;
                }
                if (iVar instanceof b1) {
                    return null;
                }
            }
        }
    }

    public final void E(b1 b1Var, Throwable th) {
        q qVar = null;
        for (q3.i iVar = (q3.i) b1Var.f(); !Intrinsics.areEqual(iVar, b1Var); iVar = iVar.g()) {
            if (iVar instanceof w0) {
                y0 y0Var = (y0) iVar;
                try {
                    y0Var.k(th);
                } catch (Throwable th2) {
                    if (qVar != null) {
                        ExceptionsKt.addSuppressed(qVar, th2);
                    } else {
                        qVar = new q("Exception in completion handler " + y0Var + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (qVar != null) {
            z(qVar);
        }
        i(th);
    }

    public void F(Object obj) {
    }

    public void G() {
    }

    public final void H(y0 y0Var) {
        b1 b1Var = new b1();
        Objects.requireNonNull(y0Var);
        q3.i.f4774c.lazySet(b1Var, y0Var);
        q3.i.f4773b.lazySet(b1Var, y0Var);
        while (true) {
            boolean z4 = false;
            if (y0Var.f() != y0Var) {
                break;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q3.i.f4773b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(y0Var, y0Var, b1Var)) {
                    z4 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(y0Var) != y0Var) {
                    break;
                }
            }
            if (z4) {
                b1Var.e(y0Var);
                break;
            }
        }
        q3.i g5 = y0Var.g();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4225b;
        while (!atomicReferenceFieldUpdater2.compareAndSet(this, y0Var, g5) && atomicReferenceFieldUpdater2.get(this) == y0Var) {
        }
    }

    public final String I(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof p0 ? ((p0) obj).isActive() ? "Active" : "New" : obj instanceof n ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.e() ? "Cancelling" : bVar.f() ? "Completing" : "Active";
    }

    public final CancellationException J(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = j();
            }
            cancellationException = new v0(str, th, this);
        }
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, java.lang.Throwable] */
    public final Object K(Object obj, Object obj2) {
        boolean z4;
        q3.r rVar;
        if (!(obj instanceof p0)) {
            return a0.f4156a;
        }
        boolean z5 = false;
        if (((obj instanceof j0) || (obj instanceof y0)) && !(obj instanceof j) && !(obj2 instanceof n)) {
            p0 p0Var = (p0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4225b;
            Object q0Var = obj2 instanceof p0 ? new q0((p0) obj2) : obj2;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, p0Var, q0Var)) {
                    z4 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != p0Var) {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                F(obj2);
                k(p0Var, obj2);
                z5 = true;
            }
            return z5 ? obj2 : a0.f4158c;
        }
        p0 p0Var2 = (p0) obj;
        b1 u4 = u(p0Var2);
        if (u4 == null) {
            return a0.f4158c;
        }
        j jVar = null;
        b bVar = p0Var2 instanceof b ? (b) p0Var2 : null;
        if (bVar == null) {
            bVar = new b(u4, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (bVar) {
            if (!bVar.f()) {
                bVar.i();
                if (bVar != p0Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4225b;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, p0Var2, bVar)) {
                            z5 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != p0Var2) {
                            break;
                        }
                    }
                    if (!z5) {
                        rVar = a0.f4158c;
                    }
                }
                boolean e5 = bVar.e();
                n nVar = obj2 instanceof n ? (n) obj2 : null;
                if (nVar != null) {
                    bVar.b(nVar.f4202a);
                }
                ?? d5 = Boolean.valueOf(e5 ^ true).booleanValue() ? bVar.d() : 0;
                objectRef.element = d5;
                Unit unit = Unit.INSTANCE;
                if (d5 != 0) {
                    E(u4, d5);
                }
                j jVar2 = p0Var2 instanceof j ? (j) p0Var2 : null;
                if (jVar2 == null) {
                    b1 a5 = p0Var2.a();
                    if (a5 != null) {
                        jVar = D(a5);
                    }
                } else {
                    jVar = jVar2;
                }
                return (jVar == null || !L(bVar, jVar, obj2)) ? o(bVar, obj2) : a0.f4157b;
            }
            rVar = a0.f4156a;
            return rVar;
        }
    }

    public final boolean L(b bVar, j jVar, Object obj) {
        while (u0.a.a(jVar.f4184f, false, false, new a(this, bVar, jVar, obj), 1, null) == c1.f4168b) {
            jVar = D(jVar);
            if (jVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // m3.u0
    public final i0 a(Function1<? super Throwable, Unit> function1) {
        return n(false, true, function1);
    }

    public final boolean d(Object obj, b1 b1Var, y0 y0Var) {
        boolean z4;
        char c5;
        c cVar = new c(y0Var, this, obj);
        do {
            q3.i h5 = b1Var.h();
            q3.i.f4774c.lazySet(y0Var, h5);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q3.i.f4773b;
            atomicReferenceFieldUpdater.lazySet(y0Var, b1Var);
            cVar.f4777c = b1Var;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(h5, b1Var, cVar)) {
                    z4 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(h5) != b1Var) {
                    z4 = false;
                    break;
                }
            }
            c5 = !z4 ? (char) 0 : cVar.a(h5) == null ? (char) 1 : (char) 2;
            if (c5 == 1) {
                return true;
            }
        } while (c5 != 2);
        return false;
    }

    @Override // m3.u0
    public final i e(k kVar) {
        return (i) u0.a.a(this, true, false, new j(kVar), 2, null);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r4, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r4, function2);
    }

    public void g(Object obj) {
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return u0.b.f4217b;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[EDGE_INSN: B:56:0x00bf->B:57:0x00bf BREAK  A[LOOP:1: B:23:0x003d->B:39:0x003d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.z0.h(java.lang.Object):boolean");
    }

    public final boolean i(Throwable th) {
        if (B()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        i iVar = (i) this._parentHandle;
        return (iVar == null || iVar == c1.f4168b) ? z4 : iVar.d(th) || z4;
    }

    @Override // m3.u0
    public boolean isActive() {
        Object x4 = x();
        return (x4 instanceof p0) && ((p0) x4).isActive();
    }

    public String j() {
        return "Job was cancelled";
    }

    public final void k(p0 p0Var, Object obj) {
        i iVar = (i) this._parentHandle;
        if (iVar != null) {
            iVar.c();
            this._parentHandle = c1.f4168b;
        }
        q qVar = null;
        n nVar = obj instanceof n ? (n) obj : null;
        Throwable th = nVar != null ? nVar.f4202a : null;
        if (p0Var instanceof y0) {
            try {
                ((y0) p0Var).k(th);
                return;
            } catch (Throwable th2) {
                z(new q("Exception in completion handler " + p0Var + " for " + this, th2));
                return;
            }
        }
        b1 a5 = p0Var.a();
        if (a5 != null) {
            for (q3.i iVar2 = (q3.i) a5.f(); !Intrinsics.areEqual(iVar2, a5); iVar2 = iVar2.g()) {
                if (iVar2 instanceof y0) {
                    y0 y0Var = (y0) iVar2;
                    try {
                        y0Var.k(th);
                    } catch (Throwable th3) {
                        if (qVar != null) {
                            ExceptionsKt.addSuppressed(qVar, th3);
                        } else {
                            qVar = new q("Exception in completion handler " + y0Var + " for " + this, th3);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
            }
            if (qVar != null) {
                z(qVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // m3.e1
    public final CancellationException l() {
        CancellationException cancellationException;
        Object x4 = x();
        if (x4 instanceof b) {
            cancellationException = ((b) x4).d();
        } else if (x4 instanceof n) {
            cancellationException = ((n) x4).f4202a;
        } else {
            if (x4 instanceof p0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + x4).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder g5 = androidx.activity.d.g("Parent job is ");
        g5.append(I(x4));
        return new v0(g5.toString(), cancellationException, this);
    }

    public final Throwable m(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new v0(j(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((e1) obj).l();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // m3.u0
    public final i0 n(boolean z4, boolean z5, Function1<? super Throwable, Unit> function1) {
        y0 y0Var;
        boolean z6;
        Throwable th;
        if (z4) {
            y0Var = function1 instanceof w0 ? (w0) function1 : null;
            if (y0Var == null) {
                y0Var = new s0(function1);
            }
        } else {
            y0Var = function1 instanceof y0 ? (y0) function1 : null;
            if (y0Var == null) {
                y0Var = new t0(function1);
            }
        }
        y0Var.f4224e = this;
        while (true) {
            Object x4 = x();
            if (x4 instanceof j0) {
                j0 j0Var = (j0) x4;
                if (j0Var.f4185b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4225b;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, x4, y0Var)) {
                            z6 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != x4) {
                            z6 = false;
                            break;
                        }
                    }
                    if (z6) {
                        return y0Var;
                    }
                } else {
                    b1 b1Var = new b1();
                    Object o0Var = j0Var.f4185b ? b1Var : new o0(b1Var);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4225b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, j0Var, o0Var) && atomicReferenceFieldUpdater2.get(this) == j0Var) {
                    }
                }
            } else {
                if (!(x4 instanceof p0)) {
                    if (z5) {
                        n nVar = x4 instanceof n ? (n) x4 : null;
                        function1.invoke(nVar != null ? nVar.f4202a : null);
                    }
                    return c1.f4168b;
                }
                b1 a5 = ((p0) x4).a();
                if (a5 == null) {
                    Objects.requireNonNull(x4, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    H((y0) x4);
                } else {
                    i0 i0Var = c1.f4168b;
                    if (z4 && (x4 instanceof b)) {
                        synchronized (x4) {
                            th = ((b) x4).d();
                            if (th == null || ((function1 instanceof j) && !((b) x4).f())) {
                                if (d(x4, a5, y0Var)) {
                                    if (th == null) {
                                        return y0Var;
                                    }
                                    i0Var = y0Var;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z5) {
                            function1.invoke(th);
                        }
                        return i0Var;
                    }
                    if (d(x4, a5, y0Var)) {
                        return y0Var;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object o(b bVar, Object obj) {
        Throwable th = null;
        n nVar = obj instanceof n ? (n) obj : null;
        Throwable th2 = nVar != null ? nVar.f4202a : null;
        synchronized (bVar) {
            bVar.e();
            List<Throwable> h5 = bVar.h(th2);
            if (!h5.isEmpty()) {
                Iterator<T> it = h5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = h5.get(0);
                }
            } else if (bVar.e()) {
                th = new v0(j(), null, this);
            }
            if (th != null && h5.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(h5.size()));
                for (Throwable th3 : h5) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        ExceptionsKt.addSuppressed(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new n(th);
        }
        if (th != null) {
            if (i(th) || y(th)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                n.f4201b.compareAndSet((n) obj, 0, 1);
            }
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4225b;
        Object q0Var = obj instanceof p0 ? new q0((p0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, bVar, q0Var) && atomicReferenceFieldUpdater.get(this) == bVar) {
        }
        k(bVar, obj);
        return obj;
    }

    @Override // m3.k
    public final void p(e1 e1Var) {
        h(e1Var);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // m3.u0
    public final CancellationException q() {
        Object x4 = x();
        if (x4 instanceof b) {
            Throwable d5 = ((b) x4).d();
            if (d5 != null) {
                return J(d5, getClass().getSimpleName() + " is cancelling");
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (x4 instanceof p0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (x4 instanceof n) {
            return J(((n) x4).f4202a, null);
        }
        return new v0(getClass().getSimpleName() + " has completed normally", null, this);
    }

    @Override // m3.u0
    public final void r(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new v0(j(), null, this);
        }
        h(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r0 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        G();
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0043, code lost:
    
        if (r0 == false) goto L29;
     */
    @Override // m3.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean start() {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7.x()
            boolean r1 = r0 instanceof m3.j0
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L29
            r1 = r0
            m3.j0 r1 = (m3.j0) r1
            boolean r1 = r1.f4185b
            if (r1 == 0) goto L13
            goto L4b
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m3.z0.f4225b
            m3.j0 r5 = m3.a0.f4162g
        L17:
            boolean r6 = r1.compareAndSet(r7, r0, r5)
            if (r6 == 0) goto L1f
            r0 = 1
            goto L26
        L1f:
            java.lang.Object r6 = r1.get(r7)
            if (r6 == r0) goto L17
            r0 = 0
        L26:
            if (r0 != 0) goto L46
            goto L4c
        L29:
            boolean r1 = r0 instanceof m3.o0
            if (r1 == 0) goto L4b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m3.z0.f4225b
            r5 = r0
            m3.o0 r5 = (m3.o0) r5
            m3.b1 r5 = r5.f4206b
        L34:
            boolean r6 = r1.compareAndSet(r7, r0, r5)
            if (r6 == 0) goto L3c
            r0 = 1
            goto L43
        L3c:
            java.lang.Object r6 = r1.get(r7)
            if (r6 == r0) goto L34
            r0 = 0
        L43:
            if (r0 != 0) goto L46
            goto L4c
        L46:
            r7.G()
            r2 = 1
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 == 0) goto L52
            if (r2 == r4) goto L51
            goto L0
        L51:
            return r4
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.z0.start():boolean");
    }

    public boolean t() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C() + '{' + I(x()) + '}');
        sb.append('@');
        sb.append(a0.b(this));
        return sb.toString();
    }

    public final b1 u(p0 p0Var) {
        b1 a5 = p0Var.a();
        if (a5 != null) {
            return a5;
        }
        if (p0Var instanceof j0) {
            return new b1();
        }
        if (p0Var instanceof y0) {
            H((y0) p0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + p0Var).toString());
    }

    public final i v() {
        return (i) this._parentHandle;
    }

    public final Object x() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof q3.n)) {
                return obj;
            }
            ((q3.n) obj).a(this);
        }
    }

    public boolean y(Throwable th) {
        return false;
    }

    public void z(Throwable th) {
        throw th;
    }
}
