package q3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.JvmField;
import org.apache.commons.io.FileUtils;

/* loaded from: classes19.dex */
public final class k<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f4782a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4783b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4784c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f4785d;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final r f4781g = new r("REMOVE_FROZEN");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4779e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4780f = AtomicLongFieldUpdater.newUpdater(k.class, "_state");

    /* loaded from: classes23.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @JvmField
        public final int f4786a;

        public a(int i5) {
            this.f4786a = i5;
        }
    }

    public k(int i5, boolean z4) {
        this.f4782a = i5;
        this.f4783b = z4;
        int i6 = i5 - 1;
        this.f4784c = i6;
        this.f4785d = new AtomicReferenceArray(i5);
        if (!(i6 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i5 & i6) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(E r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
        L3:
            long r2 = r6._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r8 = 0
            r4 = 1
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 == 0) goto L18
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L17
            r4 = 2
        L17:
            return r4
        L18:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r10 = 0
            long r0 = r0 >> r10
            int r1 = (int) r0
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r11 = r11 & r2
            r0 = 30
            long r11 = r11 >> r0
            int r12 = (int) r11
            int r11 = r6.f4784c
            int r5 = r12 + 2
            r5 = r5 & r11
            r13 = r1 & r11
            if (r5 != r13) goto L33
            return r4
        L33:
            boolean r5 = r6.f4783b
            r13 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r6.f4785d
            r14 = r12 & r11
            java.lang.Object r5 = r5.get(r14)
            if (r5 == 0) goto L52
            int r0 = r6.f4782a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L51
            int r12 = r12 - r1
            r1 = r12 & r13
            int r0 = r0 >> 1
            if (r1 <= r0) goto L3
        L51:
            return r4
        L52:
            int r1 = r12 + 1
            r1 = r1 & r13
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = q3.k.f4780f
            r13 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r13 = r13 & r2
            long r8 = (long) r1
            long r0 = r8 << r0
            long r8 = r13 | r0
            r0 = r4
            r1 = r15
            r4 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f4785d
            r1 = r12 & r11
            r0.set(r1, r7)
            r0 = r6
        L73:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto La1
            q3.k r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f4785d
            int r2 = r0.f4784c
            r2 = r2 & r12
            java.lang.Object r1 = r1.get(r2)
            boolean r2 = r1 instanceof q3.k.a
            if (r2 == 0) goto L9e
            q3.k$a r1 = (q3.k.a) r1
            int r1 = r1.f4786a
            if (r1 != r12) goto L9e
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f4785d
            int r2 = r0.f4784c
            r2 = r2 & r12
            r1.set(r2, r7)
            goto L9f
        L9e:
            r0 = 0
        L9f:
            if (r0 != 0) goto L73
        La1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.k.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j5;
        do {
            j5 = this._state;
            if ((j5 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((FileUtils.ONE_EB & j5) != 0) {
                return false;
            }
        } while (!f4780f.compareAndSet(this, j5, j5 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j5 = this._state;
        return 1073741823 & (((int) ((j5 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j5) >> 0)));
    }

    public final boolean d() {
        long j5 = this._state;
        return ((int) ((1073741823 & j5) >> 0)) == ((int) ((j5 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k<E> e() {
        long j5;
        while (true) {
            j5 = this._state;
            if ((j5 & FileUtils.ONE_EB) != 0) {
                break;
            }
            long j6 = j5 | FileUtils.ONE_EB;
            if (f4780f.compareAndSet(this, j5, j6)) {
                j5 = j6;
                break;
            }
        }
        while (true) {
            k<E> kVar = (k) this._next;
            if (kVar != null) {
                return kVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4779e;
            k kVar2 = new k(this.f4782a * 2, this.f4783b);
            int i5 = (int) ((1073741823 & j5) >> 0);
            int i6 = (int) ((1152921503533105152L & j5) >> 30);
            while (true) {
                int i7 = this.f4784c;
                int i8 = i5 & i7;
                if (i8 == (i7 & i6)) {
                    break;
                }
                Object obj = this.f4785d.get(i8);
                if (obj == null) {
                    obj = new a(i5);
                }
                kVar2.f4785d.set(kVar2.f4784c & i5, obj);
                i5++;
            }
            kVar2._state = (-1152921504606846977L) & j5;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, kVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        while (true) {
            long j5 = this._state;
            if ((j5 & FileUtils.ONE_EB) != 0) {
                return f4781g;
            }
            int i5 = (int) ((j5 & 1073741823) >> 0);
            int i6 = (int) ((1152921503533105152L & j5) >> 30);
            int i7 = this.f4784c;
            if ((i6 & i7) == (i5 & i7)) {
                return null;
            }
            Object obj = this.f4785d.get(i7 & i5);
            if (obj == null) {
                if (this.f4783b) {
                    return null;
                }
            } else {
                if (obj instanceof a) {
                    return null;
                }
                long j6 = ((i5 + 1) & 1073741823) << 0;
                if (f4780f.compareAndSet(this, j5, (j5 & (-1073741824)) | j6)) {
                    this.f4785d.set(this.f4784c & i5, null);
                    return obj;
                }
                if (this.f4783b) {
                    k<E> kVar = this;
                    while (true) {
                        long j7 = kVar._state;
                        int i8 = (int) ((j7 & 1073741823) >> 0);
                        if ((j7 & FileUtils.ONE_EB) != 0) {
                            kVar = kVar.e();
                        } else {
                            if (f4780f.compareAndSet(kVar, j7, (j7 & (-1073741824)) | j6)) {
                                kVar.f4785d.set(kVar.f4784c & i8, null);
                                kVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (kVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
