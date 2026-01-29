package l2;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g extends p2.b {

    /* renamed from: q, reason: collision with root package name */
    public static final a f3968q = new a();

    /* renamed from: r, reason: collision with root package name */
    public static final i2.s f3969r = new i2.s("closed");

    /* renamed from: n, reason: collision with root package name */
    public final List<i2.n> f3970n;

    /* renamed from: o, reason: collision with root package name */
    public String f3971o;

    /* renamed from: p, reason: collision with root package name */
    public i2.n f3972p;

    /* loaded from: classes21.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i5, int i6) {
            throw new AssertionError();
        }
    }

    public g() {
        super(f3968q);
        this.f3970n = new ArrayList();
        this.f3972p = i2.p.f3300a;
    }

    @Override // p2.b
    public final p2.b A(Number number) {
        if (number == null) {
            K(i2.p.f3300a);
            return this;
        }
        if (!this.f4670g) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        K(new i2.s(number));
        return this;
    }

    @Override // p2.b
    public final p2.b E(String str) {
        if (str == null) {
            K(i2.p.f3300a);
            return this;
        }
        K(new i2.s(str));
        return this;
    }

    @Override // p2.b
    public final p2.b H(boolean z4) {
        K(new i2.s(Boolean.valueOf(z4)));
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<i2.n>] */
    public final i2.n J() {
        return (i2.n) this.f3970n.get(r0.size() - 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<i2.n>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<i2.n>] */
    public final void K(i2.n nVar) {
        if (this.f3971o != null) {
            if (!(nVar instanceof i2.p) || this.f4673j) {
                i2.q qVar = (i2.q) J();
                qVar.f3301a.put(this.f3971o, nVar);
            }
            this.f3971o = null;
            return;
        }
        if (this.f3970n.isEmpty()) {
            this.f3972p = nVar;
            return;
        }
        i2.n J = J();
        if (!(J instanceof i2.l)) {
            throw new IllegalStateException();
        }
        ((i2.l) J).f3299b.add(nVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<i2.n>] */
    @Override // p2.b
    public final p2.b b() {
        i2.l lVar = new i2.l();
        K(lVar);
        this.f3970n.add(lVar);
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<i2.n>] */
    @Override // p2.b
    public final p2.b c() {
        i2.q qVar = new i2.q();
        K(qVar);
        this.f3970n.add(qVar);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<i2.n>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<i2.n>] */
    @Override // p2.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f3970n.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f3970n.add(f3969r);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<i2.n>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<i2.n>] */
    @Override // p2.b
    public final p2.b f() {
        if (this.f3970n.isEmpty() || this.f3971o != null) {
            throw new IllegalStateException();
        }
        if (!(J() instanceof i2.l)) {
            throw new IllegalStateException();
        }
        this.f3970n.remove(r0.size() - 1);
        return this;
    }

    @Override // p2.b, java.io.Flushable
    public final void flush() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<i2.n>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<i2.n>] */
    @Override // p2.b
    public final p2.b l() {
        if (this.f3970n.isEmpty() || this.f3971o != null) {
            throw new IllegalStateException();
        }
        if (!(J() instanceof i2.q)) {
            throw new IllegalStateException();
        }
        this.f3970n.remove(r0.size() - 1);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<i2.n>] */
    @Override // p2.b
    public final p2.b n(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f3970n.isEmpty() || this.f3971o != null) {
            throw new IllegalStateException();
        }
        if (!(J() instanceof i2.q)) {
            throw new IllegalStateException();
        }
        this.f3971o = str;
        return this;
    }

    @Override // p2.b
    public final p2.b q() {
        K(i2.p.f3300a);
        return this;
    }

    @Override // p2.b
    public final p2.b y(long j5) {
        K(new i2.s(Long.valueOf(j5)));
        return this;
    }

    @Override // p2.b
    public final p2.b z(Boolean bool) {
        if (bool == null) {
            K(i2.p.f3300a);
            return this;
        }
        K(new i2.s(bool));
        return this;
    }
}
