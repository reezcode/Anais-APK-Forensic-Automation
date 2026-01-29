package l2;

import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import k2.p;
import kotlin.text.Typography;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes5.dex */
public final class f extends p2.a {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f3963u;

    /* renamed from: q, reason: collision with root package name */
    public Object[] f3964q;

    /* renamed from: r, reason: collision with root package name */
    public int f3965r;

    /* renamed from: s, reason: collision with root package name */
    public String[] f3966s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f3967t;

    /* loaded from: classes23.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i5, int i6) {
            throw new AssertionError();
        }
    }

    static {
        new a();
        f3963u = new Object();
    }

    private String p(boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.dollar);
        int i5 = 0;
        while (true) {
            int i6 = this.f3965r;
            if (i5 >= i6) {
                return sb.toString();
            }
            Object[] objArr = this.f3964q;
            if (objArr[i5] instanceof i2.l) {
                i5++;
                if (i5 < i6 && (objArr[i5] instanceof Iterator)) {
                    int i7 = this.f3967t[i5];
                    if (z4 && i7 > 0 && (i5 == i6 - 1 || i5 == i6 - 2)) {
                        i7--;
                    }
                    sb.append('[');
                    sb.append(i7);
                    sb.append(']');
                }
            } else if ((objArr[i5] instanceof i2.q) && (i5 = i5 + 1) < i6 && (objArr[i5] instanceof Iterator)) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                String[] strArr = this.f3966s;
                if (strArr[i5] != null) {
                    sb.append(strArr[i5]);
                }
            }
            i5++;
        }
    }

    private String w() {
        StringBuilder g5 = androidx.activity.d.g(" at path ");
        g5.append(p(false));
        return g5.toString();
    }

    @Override // p2.a
    public final long A() {
        int N = N();
        if (N != 7 && N != 6) {
            StringBuilder g5 = androidx.activity.d.g("Expected ");
            g5.append(androidx.activity.result.a.j(7));
            g5.append(" but was ");
            g5.append(androidx.activity.result.a.j(N));
            g5.append(w());
            throw new IllegalStateException(g5.toString());
        }
        i2.s sVar = (i2.s) Y();
        long longValue = sVar.f3302a instanceof Number ? sVar.s().longValue() : Long.parseLong(sVar.t());
        Z();
        int i5 = this.f3965r;
        if (i5 > 0) {
            int[] iArr = this.f3967t;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
        return longValue;
    }

    @Override // p2.a
    public final String E() {
        W(5);
        Map.Entry entry = (Map.Entry) ((Iterator) Y()).next();
        String str = (String) entry.getKey();
        this.f3966s[this.f3965r - 1] = str;
        a0(entry.getValue());
        return str;
    }

    @Override // p2.a
    public final void I() {
        W(9);
        Z();
        int i5 = this.f3965r;
        if (i5 > 0) {
            int[] iArr = this.f3967t;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
    }

    @Override // p2.a
    public final String K() {
        int N = N();
        if (N != 6 && N != 7) {
            StringBuilder g5 = androidx.activity.d.g("Expected ");
            g5.append(androidx.activity.result.a.j(6));
            g5.append(" but was ");
            g5.append(androidx.activity.result.a.j(N));
            g5.append(w());
            throw new IllegalStateException(g5.toString());
        }
        String t4 = ((i2.s) Z()).t();
        int i5 = this.f3965r;
        if (i5 > 0) {
            int[] iArr = this.f3967t;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
        return t4;
    }

    @Override // p2.a
    public final int N() {
        if (this.f3965r == 0) {
            return 10;
        }
        Object Y = Y();
        if (Y instanceof Iterator) {
            boolean z4 = this.f3964q[this.f3965r - 2] instanceof i2.q;
            Iterator it = (Iterator) Y;
            if (!it.hasNext()) {
                return z4 ? 4 : 2;
            }
            if (z4) {
                return 5;
            }
            a0(it.next());
            return N();
        }
        if (Y instanceof i2.q) {
            return 3;
        }
        if (Y instanceof i2.l) {
            return 1;
        }
        if (!(Y instanceof i2.s)) {
            if (Y instanceof i2.p) {
                return 9;
            }
            if (Y == f3963u) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Serializable serializable = ((i2.s) Y).f3302a;
        if (serializable instanceof String) {
            return 6;
        }
        if (serializable instanceof Boolean) {
            return 8;
        }
        if (serializable instanceof Number) {
            return 7;
        }
        throw new AssertionError();
    }

    @Override // p2.a
    public final void U() {
        if (N() == 5) {
            E();
            this.f3966s[this.f3965r - 2] = "null";
        } else {
            Z();
            int i5 = this.f3965r;
            if (i5 > 0) {
                this.f3966s[i5 - 1] = "null";
            }
        }
        int i6 = this.f3965r;
        if (i6 > 0) {
            int[] iArr = this.f3967t;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
        }
    }

    public final void W(int i5) {
        if (N() == i5) {
            return;
        }
        StringBuilder g5 = androidx.activity.d.g("Expected ");
        g5.append(androidx.activity.result.a.j(i5));
        g5.append(" but was ");
        g5.append(androidx.activity.result.a.j(N()));
        g5.append(w());
        throw new IllegalStateException(g5.toString());
    }

    public final Object Y() {
        return this.f3964q[this.f3965r - 1];
    }

    public final Object Z() {
        Object[] objArr = this.f3964q;
        int i5 = this.f3965r - 1;
        this.f3965r = i5;
        Object obj = objArr[i5];
        objArr[i5] = null;
        return obj;
    }

    @Override // p2.a
    public final void a() {
        W(1);
        a0(((i2.l) Y()).iterator());
        this.f3967t[this.f3965r - 1] = 0;
    }

    public final void a0(Object obj) {
        int i5 = this.f3965r;
        Object[] objArr = this.f3964q;
        if (i5 == objArr.length) {
            int i6 = i5 * 2;
            this.f3964q = Arrays.copyOf(objArr, i6);
            this.f3967t = Arrays.copyOf(this.f3967t, i6);
            this.f3966s = (String[]) Arrays.copyOf(this.f3966s, i6);
        }
        Object[] objArr2 = this.f3964q;
        int i7 = this.f3965r;
        this.f3965r = i7 + 1;
        objArr2[i7] = obj;
    }

    @Override // p2.a
    public final void b() {
        W(3);
        a0(new p.b.a((p.b) ((i2.q) Y()).f3301a.entrySet()));
    }

    @Override // p2.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3964q = new Object[]{f3963u};
        this.f3965r = 1;
    }

    @Override // p2.a
    public final void f() {
        W(2);
        Z();
        Z();
        int i5 = this.f3965r;
        if (i5 > 0) {
            int[] iArr = this.f3967t;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
    }

    @Override // p2.a
    public final String getPath() {
        return p(false);
    }

    @Override // p2.a
    public final void l() {
        W(4);
        Z();
        Z();
        int i5 = this.f3965r;
        if (i5 > 0) {
            int[] iArr = this.f3967t;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
    }

    @Override // p2.a
    public final String q() {
        return p(true);
    }

    @Override // p2.a
    public final boolean r() {
        int N = N();
        return (N == 4 || N == 2 || N == 10) ? false : true;
    }

    @Override // p2.a
    public final String toString() {
        return f.class.getSimpleName() + w();
    }

    @Override // p2.a
    public final boolean x() {
        W(8);
        boolean r4 = ((i2.s) Z()).r();
        int i5 = this.f3965r;
        if (i5 > 0) {
            int[] iArr = this.f3967t;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
        return r4;
    }

    @Override // p2.a
    public final double y() {
        int N = N();
        if (N != 7 && N != 6) {
            StringBuilder g5 = androidx.activity.d.g("Expected ");
            g5.append(androidx.activity.result.a.j(7));
            g5.append(" but was ");
            g5.append(androidx.activity.result.a.j(N));
            g5.append(w());
            throw new IllegalStateException(g5.toString());
        }
        i2.s sVar = (i2.s) Y();
        double doubleValue = sVar.f3302a instanceof Number ? sVar.s().doubleValue() : Double.parseDouble(sVar.t());
        if (!this.f4648c && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        Z();
        int i5 = this.f3965r;
        if (i5 > 0) {
            int[] iArr = this.f3967t;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
        return doubleValue;
    }

    @Override // p2.a
    public final int z() {
        int N = N();
        if (N != 7 && N != 6) {
            StringBuilder g5 = androidx.activity.d.g("Expected ");
            g5.append(androidx.activity.result.a.j(7));
            g5.append(" but was ");
            g5.append(androidx.activity.result.a.j(N));
            g5.append(w());
            throw new IllegalStateException(g5.toString());
        }
        i2.s sVar = (i2.s) Y();
        int intValue = sVar.f3302a instanceof Number ? sVar.s().intValue() : Integer.parseInt(sVar.t());
        Z();
        int i5 = this.f3965r;
        if (i5 > 0) {
            int[] iArr = this.f3967t;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
        }
        return intValue;
    }
}
