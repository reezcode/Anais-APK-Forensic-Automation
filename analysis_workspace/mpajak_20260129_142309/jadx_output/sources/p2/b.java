package p2;

import androidx.activity.d;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes14.dex */
public class b implements Closeable, Flushable {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f4662k = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f4663l = new String[128];

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f4664m;

    /* renamed from: b, reason: collision with root package name */
    public final Writer f4665b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f4666c = new int[32];

    /* renamed from: d, reason: collision with root package name */
    public int f4667d = 0;

    /* renamed from: e, reason: collision with root package name */
    public String f4668e;

    /* renamed from: f, reason: collision with root package name */
    public String f4669f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4670g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4671h;

    /* renamed from: i, reason: collision with root package name */
    public String f4672i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4673j;

    static {
        for (int i5 = 0; i5 <= 31; i5++) {
            f4663l[i5] = String.format("\\u%04x", Integer.valueOf(i5));
        }
        String[] strArr = f4663l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4664m = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        s(6);
        this.f4669f = ":";
        this.f4673j = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4665b = writer;
    }

    public b A(Number number) {
        if (number == null) {
            return q();
        }
        I();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!(cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) && !f4662k.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f4670g) {
            throw new IllegalArgumentException(d.f("Numeric values must be finite, but was ", obj));
        }
        a();
        this.f4665b.append((CharSequence) obj);
        return this;
    }

    public b E(String str) {
        if (str == null) {
            return q();
        }
        I();
        a();
        x(str);
        return this;
    }

    public b H(boolean z4) {
        I();
        a();
        this.f4665b.write(z4 ? "true" : "false");
        return this;
    }

    public final void I() {
        if (this.f4672i != null) {
            int r4 = r();
            if (r4 == 5) {
                this.f4665b.write(44);
            } else if (r4 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            p();
            w(4);
            x(this.f4672i);
            this.f4672i = null;
        }
    }

    public final void a() {
        int r4 = r();
        if (r4 == 1) {
            w(2);
        } else {
            if (r4 != 2) {
                if (r4 == 4) {
                    this.f4665b.append((CharSequence) this.f4669f);
                    w(5);
                    return;
                }
                if (r4 != 6) {
                    if (r4 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f4670g) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                w(7);
                return;
            }
            this.f4665b.append(',');
        }
        p();
    }

    public b b() {
        I();
        a();
        s(1);
        this.f4665b.write(91);
        return this;
    }

    public b c() {
        I();
        a();
        s(3);
        this.f4665b.write(123);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4665b.close();
        int i5 = this.f4667d;
        if (i5 > 1 || (i5 == 1 && this.f4666c[i5 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4667d = 0;
    }

    public final b e(int i5, int i6, char c5) {
        int r4 = r();
        if (r4 != i6 && r4 != i5) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4672i != null) {
            StringBuilder g5 = d.g("Dangling name: ");
            g5.append(this.f4672i);
            throw new IllegalStateException(g5.toString());
        }
        this.f4667d--;
        if (r4 == i6) {
            p();
        }
        this.f4665b.write(c5);
        return this;
    }

    public b f() {
        e(1, 2, ']');
        return this;
    }

    public void flush() {
        if (this.f4667d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4665b.flush();
    }

    public b l() {
        e(3, 5, '}');
        return this;
    }

    public b n(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4672i != null) {
            throw new IllegalStateException();
        }
        if (this.f4667d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4672i = str;
        return this;
    }

    public final void p() {
        if (this.f4668e == null) {
            return;
        }
        this.f4665b.write(10);
        int i5 = this.f4667d;
        for (int i6 = 1; i6 < i5; i6++) {
            this.f4665b.write(this.f4668e);
        }
    }

    public b q() {
        if (this.f4672i != null) {
            if (!this.f4673j) {
                this.f4672i = null;
                return this;
            }
            I();
        }
        a();
        this.f4665b.write("null");
        return this;
    }

    public final int r() {
        int i5 = this.f4667d;
        if (i5 != 0) {
            return this.f4666c[i5 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void s(int i5) {
        int i6 = this.f4667d;
        int[] iArr = this.f4666c;
        if (i6 == iArr.length) {
            this.f4666c = Arrays.copyOf(iArr, i6 * 2);
        }
        int[] iArr2 = this.f4666c;
        int i7 = this.f4667d;
        this.f4667d = i7 + 1;
        iArr2[i7] = i5;
    }

    public final void w(int i5) {
        this.f4666c[this.f4667d - 1] = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f4671h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p2.b.f4664m
            goto L9
        L7:
            java.lang.String[] r0 = p2.b.f4663l
        L9:
            java.io.Writer r1 = r8.f4665b
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f4665b
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f4665b
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f4665b
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f4665b
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.b.x(java.lang.String):void");
    }

    public b y(long j5) {
        I();
        a();
        this.f4665b.write(Long.toString(j5));
        return this;
    }

    public b z(Boolean bool) {
        if (bool == null) {
            return q();
        }
        I();
        a();
        this.f4665b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }
}
