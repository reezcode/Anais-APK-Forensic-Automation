package q3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import m3.a0;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4773b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4774c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4775d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    @PublishedApi
    /* loaded from: classes16.dex */
    public static abstract class a extends c<i> {

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public final i f4776b;

        /* renamed from: c, reason: collision with root package name */
        @JvmField
        public i f4777c;

        public a(i iVar) {
            this.f4776b = iVar;
        }

        @Override // q3.c
        public final void b(i iVar, Object obj) {
            i iVar2 = iVar;
            boolean z4 = false;
            boolean z5 = obj == null;
            i iVar3 = z5 ? this.f4776b : this.f4777c;
            if (iVar3 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i.f4773b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(iVar2, this, iVar3)) {
                        z4 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(iVar2) != this) {
                        break;
                    }
                }
                if (z4 && z5) {
                    i iVar4 = this.f4776b;
                    i iVar5 = this.f4777c;
                    Intrinsics.checkNotNull(iVar5);
                    iVar4.e(iVar5);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r7 = q3.i.f4773b;
        r4 = ((q3.o) r4).f4788a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r7.compareAndSet(r3, r2, r4) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r7.get(r3) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r5 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004a, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q3.i b() {
        /*
            r10 = this;
        L0:
            java.lang.Object r0 = r10._prev
            q3.i r0 = (q3.i) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L24
            if (r0 != r2) goto L10
            return r2
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = q3.i.f4774c
        L12:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L1a
            r5 = 1
            goto L20
        L1a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L12
        L20:
            if (r5 != 0) goto L23
            goto L0
        L23:
            return r2
        L24:
            boolean r7 = r10.i()
            if (r7 == 0) goto L2b
            return r1
        L2b:
            if (r4 != 0) goto L2e
            return r2
        L2e:
            boolean r7 = r4 instanceof q3.n
            if (r7 == 0) goto L38
            q3.n r4 = (q3.n) r4
            r4.a(r2)
            goto L0
        L38:
            boolean r7 = r4 instanceof q3.o
            if (r7 == 0) goto L5c
            if (r3 == 0) goto L57
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = q3.i.f4773b
            q3.o r4 = (q3.o) r4
            q3.i r4 = r4.f4788a
        L44:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L4c
            r5 = 1
            goto L52
        L4c:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L44
        L52:
            if (r5 != 0) goto L55
            goto L0
        L55:
            r2 = r3
            goto L6
        L57:
            java.lang.Object r2 = r2._prev
            q3.i r2 = (q3.i) r2
            goto L7
        L5c:
            r3 = r4
            q3.i r3 = (q3.i) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.i.b():q3.i");
    }

    public final void e(i iVar) {
        boolean z4;
        do {
            i iVar2 = (i) iVar._prev;
            if (f() != iVar) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4774c;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                    z4 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(iVar) != iVar2) {
                    z4 = false;
                    break;
                }
            }
        } while (!z4);
        if (i()) {
            iVar.b();
        }
    }

    public final Object f() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public final i g() {
        i iVar;
        Object f5 = f();
        o oVar = f5 instanceof o ? (o) f5 : null;
        return (oVar == null || (iVar = oVar.f4788a) == null) ? (i) f5 : iVar;
    }

    public final i h() {
        i b5 = b();
        if (b5 == null) {
            Object obj = this._prev;
            while (true) {
                b5 = (i) obj;
                if (!b5.i()) {
                    break;
                }
                obj = b5._prev;
            }
        }
        return b5;
    }

    public boolean i() {
        return f() instanceof o;
    }

    public final boolean j() {
        i iVar;
        boolean z4;
        while (true) {
            Object f5 = f();
            if (f5 instanceof o) {
                iVar = ((o) f5).f4788a;
                break;
            }
            if (f5 == this) {
                iVar = (i) f5;
                break;
            }
            i iVar2 = (i) f5;
            o oVar = (o) iVar2._removedRef;
            if (oVar == null) {
                oVar = new o(iVar2);
                f4775d.lazySet(iVar2, oVar);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4773b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, f5, oVar)) {
                    z4 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != f5) {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                iVar = null;
                iVar2.b();
                break;
            }
        }
        return iVar == null;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: q3.i.b
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return a0.a(this.receiver);
            }
        } + '@' + a0.b(this);
    }
}
