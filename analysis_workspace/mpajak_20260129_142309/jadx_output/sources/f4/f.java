package f4;

import androidx.work.WorkRequest;
import com.tencent.smtt.sdk.TbsListener;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Typography;

/* loaded from: classes8.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public v f2851b;

    /* renamed from: c, reason: collision with root package name */
    public long f2852c;

    /* loaded from: classes21.dex */
    public static final class a implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public f f2853b;

        /* renamed from: c, reason: collision with root package name */
        @JvmField
        public boolean f2854c;

        /* renamed from: d, reason: collision with root package name */
        public v f2855d;

        /* renamed from: f, reason: collision with root package name */
        @JvmField
        public byte[] f2857f;

        /* renamed from: e, reason: collision with root package name */
        @JvmField
        public long f2856e = -1;

        /* renamed from: g, reason: collision with root package name */
        @JvmField
        public int f2858g = -1;

        /* renamed from: h, reason: collision with root package name */
        @JvmField
        public int f2859h = -1;

        public final long a(long j5) {
            f fVar = this.f2853b;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f2854c) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long j6 = fVar.f2852c;
            int i5 = 1;
            if (j5 <= j6) {
                if (!(j5 >= 0)) {
                    throw new IllegalArgumentException(androidx.activity.result.a.d("newSize < 0: ", j5).toString());
                }
                long j7 = j6 - j5;
                while (true) {
                    if (j7 <= 0) {
                        break;
                    }
                    v vVar = fVar.f2851b;
                    Intrinsics.checkNotNull(vVar);
                    v vVar2 = vVar.f2900g;
                    Intrinsics.checkNotNull(vVar2);
                    int i6 = vVar2.f2896c;
                    long j8 = i6 - vVar2.f2895b;
                    if (j8 > j7) {
                        vVar2.f2896c = i6 - ((int) j7);
                        break;
                    }
                    fVar.f2851b = vVar2.a();
                    w.b(vVar2);
                    j7 -= j8;
                }
                this.f2855d = null;
                this.f2856e = j5;
                this.f2857f = null;
                this.f2858g = -1;
                this.f2859h = -1;
            } else if (j5 > j6) {
                long j9 = j5 - j6;
                boolean z4 = true;
                while (j9 > 0) {
                    v w4 = fVar.w(i5);
                    int min = (int) Math.min(j9, 8192 - w4.f2896c);
                    int i7 = w4.f2896c + min;
                    w4.f2896c = i7;
                    j9 -= min;
                    if (z4) {
                        this.f2855d = w4;
                        this.f2856e = j6;
                        this.f2857f = w4.f2894a;
                        this.f2858g = i7 - min;
                        this.f2859h = i7;
                        z4 = false;
                    }
                    i5 = 1;
                }
            }
            fVar.f2852c = j5;
            return j6;
        }

        public final int b(long j5) {
            long j6;
            v vVar;
            f fVar = this.f2853b;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j5 >= -1) {
                long j7 = fVar.f2852c;
                if (j5 <= j7) {
                    if (j5 == -1 || j5 == j7) {
                        this.f2855d = null;
                        this.f2856e = j5;
                        this.f2857f = null;
                        this.f2858g = -1;
                        this.f2859h = -1;
                        return -1;
                    }
                    v vVar2 = fVar.f2851b;
                    v vVar3 = this.f2855d;
                    if (vVar3 != null) {
                        long j8 = this.f2856e;
                        int i5 = this.f2858g;
                        Intrinsics.checkNotNull(vVar3);
                        j6 = j8 - (i5 - vVar3.f2895b);
                        if (j6 > j5) {
                            vVar = vVar2;
                            vVar2 = this.f2855d;
                            j7 = j6;
                            j6 = 0;
                        } else {
                            vVar = this.f2855d;
                        }
                    } else {
                        j6 = 0;
                        vVar = vVar2;
                    }
                    if (j7 - j5 > j5 - j6) {
                        while (true) {
                            Intrinsics.checkNotNull(vVar);
                            int i6 = vVar.f2896c;
                            int i7 = vVar.f2895b;
                            if (j5 < (i6 - i7) + j6) {
                                break;
                            }
                            j6 += i6 - i7;
                            vVar = vVar.f2899f;
                        }
                    } else {
                        while (j7 > j5) {
                            Intrinsics.checkNotNull(vVar2);
                            vVar2 = vVar2.f2900g;
                            Intrinsics.checkNotNull(vVar2);
                            j7 -= vVar2.f2896c - vVar2.f2895b;
                        }
                        vVar = vVar2;
                        j6 = j7;
                    }
                    if (this.f2854c) {
                        Intrinsics.checkNotNull(vVar);
                        if (vVar.f2897d) {
                            byte[] bArr = vVar.f2894a;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                            v vVar4 = new v(copyOf, vVar.f2895b, vVar.f2896c, false, true);
                            if (fVar.f2851b == vVar) {
                                fVar.f2851b = vVar4;
                            }
                            vVar.b(vVar4);
                            v vVar5 = vVar4.f2900g;
                            Intrinsics.checkNotNull(vVar5);
                            vVar5.a();
                            vVar = vVar4;
                        }
                    }
                    this.f2855d = vVar;
                    this.f2856e = j5;
                    Intrinsics.checkNotNull(vVar);
                    this.f2857f = vVar.f2894a;
                    int i8 = vVar.f2895b + ((int) (j5 - j6));
                    this.f2858g = i8;
                    int i9 = vVar.f2896c;
                    this.f2859h = i9;
                    return i9 - i8;
                }
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(fVar.f2852c)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            throw new ArrayIndexOutOfBoundsException(format);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!(this.f2853b != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f2853b = null;
            this.f2855d = null;
            this.f2856e = -1L;
            this.f2857f = null;
            this.f2858g = -1;
            this.f2859h = -1;
        }
    }

    public final f A(int i5) {
        v w4 = w(1);
        byte[] bArr = w4.f2894a;
        int i6 = w4.f2896c;
        w4.f2896c = i6 + 1;
        bArr[i6] = (byte) i5;
        this.f2852c++;
        return this;
    }

    @Override // f4.h
    public final boolean B() {
        return this.f2852c == 0;
    }

    @Override // f4.g
    public final /* bridge */ /* synthetic */ g C(int i5) {
        A(i5);
        return this;
    }

    @Override // f4.h
    public final byte[] D(long j5) {
        if (!(j5 >= 0 && j5 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount: ", j5).toString());
        }
        if (this.f2852c < j5) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j5];
        readFully(bArr);
        return bArr;
    }

    @Override // f4.g
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final f e0(long j5) {
        if (j5 == 0) {
            A(48);
        } else {
            boolean z4 = false;
            int i5 = 1;
            if (j5 < 0) {
                j5 = -j5;
                if (j5 < 0) {
                    K("-9223372036854775808");
                } else {
                    z4 = true;
                }
            }
            if (j5 >= 100000000) {
                i5 = j5 < 1000000000000L ? j5 < 10000000000L ? j5 < 1000000000 ? 9 : 10 : j5 < 100000000000L ? 11 : 12 : j5 < 1000000000000000L ? j5 < 10000000000000L ? 13 : j5 < 100000000000000L ? 14 : 15 : j5 < 100000000000000000L ? j5 < 10000000000000000L ? 16 : 17 : j5 < 1000000000000000000L ? 18 : 19;
            } else if (j5 >= WorkRequest.MIN_BACKOFF_MILLIS) {
                i5 = j5 < 1000000 ? j5 < 100000 ? 5 : 6 : j5 < 10000000 ? 7 : 8;
            } else if (j5 >= 100) {
                i5 = j5 < 1000 ? 3 : 4;
            } else if (j5 >= 10) {
                i5 = 2;
            }
            if (z4) {
                i5++;
            }
            v w4 = w(i5);
            byte[] bArr = w4.f2894a;
            int i6 = w4.f2896c + i5;
            while (j5 != 0) {
                long j6 = 10;
                i6--;
                bArr[i6] = g4.a.f2982a[(int) (j5 % j6)];
                j5 /= j6;
            }
            if (z4) {
                bArr[i6 - 1] = (byte) 45;
            }
            w4.f2896c += i5;
            this.f2852c += i5;
        }
        return this;
    }

    @Override // f4.h
    public final void F(f sink, long j5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j6 = this.f2852c;
        if (j6 >= j5) {
            sink.T(this, j5);
        } else {
            sink.T(this, j6);
            throw new EOFException();
        }
    }

    @Override // f4.g
    public final /* bridge */ /* synthetic */ g G(byte[] bArr) {
        y(bArr);
        return this;
    }

    @Override // f4.g
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final f k(long j5) {
        if (j5 == 0) {
            A(48);
        } else {
            long j6 = (j5 >>> 1) | j5;
            long j7 = j6 | (j6 >>> 2);
            long j8 = j7 | (j7 >>> 4);
            long j9 = j8 | (j8 >>> 8);
            long j10 = j9 | (j9 >>> 16);
            long j11 = j10 | (j10 >>> 32);
            long j12 = j11 - ((j11 >>> 1) & 6148914691236517205L);
            long j13 = ((j12 >>> 2) & 3689348814741910323L) + (j12 & 3689348814741910323L);
            long j14 = ((j13 >>> 4) + j13) & 1085102592571150095L;
            long j15 = j14 + (j14 >>> 8);
            long j16 = j15 + (j15 >>> 16);
            int i5 = (int) ((((j16 & 63) + ((j16 >>> 32) & 63)) + 3) / 4);
            v w4 = w(i5);
            byte[] bArr = w4.f2894a;
            int i6 = w4.f2896c;
            for (int i7 = (i6 + i5) - 1; i7 >= i6; i7--) {
                bArr[i7] = g4.a.f2982a[(int) (15 & j5)];
                j5 >>>= 4;
            }
            w4.f2896c += i5;
            this.f2852c += i5;
        }
        return this;
    }

    public final f I(int i5) {
        v w4 = w(4);
        byte[] bArr = w4.f2894a;
        int i6 = w4.f2896c;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i5 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i5 >>> 8) & 255);
        bArr[i9] = (byte) (i5 & 255);
        w4.f2896c = i9 + 1;
        this.f2852c += 4;
        return this;
    }

    public final f J(int i5) {
        v w4 = w(2);
        byte[] bArr = w4.f2894a;
        int i6 = w4.f2896c;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 8) & 255);
        bArr[i7] = (byte) (i5 & 255);
        w4.f2896c = i7 + 1;
        this.f2852c += 2;
        return this;
    }

    public final f K(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        M(string, 0, string.length());
        return this;
    }

    @Override // f4.g
    public final g L() {
        return this;
    }

    public final f M(String string, int i5, int i6) {
        char charAt;
        long j5;
        long j6;
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("beginIndex < 0: ", i5).toString());
        }
        if (!(i6 >= i5)) {
            throw new IllegalArgumentException(androidx.activity.d.d("endIndex < beginIndex: ", i6, " < ", i5).toString());
        }
        if (!(i6 <= string.length())) {
            StringBuilder e5 = androidx.appcompat.graphics.drawable.a.e("endIndex > string.length: ", i6, " > ");
            e5.append(string.length());
            throw new IllegalArgumentException(e5.toString().toString());
        }
        while (i5 < i6) {
            char charAt2 = string.charAt(i5);
            if (charAt2 < 128) {
                v w4 = w(1);
                byte[] bArr = w4.f2894a;
                int i7 = w4.f2896c - i5;
                int min = Math.min(i6, 8192 - i7);
                int i8 = i5 + 1;
                bArr[i5 + i7] = (byte) charAt2;
                while (true) {
                    i5 = i8;
                    if (i5 >= min || (charAt = string.charAt(i5)) >= 128) {
                        break;
                    }
                    i8 = i5 + 1;
                    bArr[i5 + i7] = (byte) charAt;
                }
                int i9 = w4.f2896c;
                int i10 = (i7 + i5) - i9;
                w4.f2896c = i9 + i10;
                this.f2852c += i10;
            } else {
                if (charAt2 < 2048) {
                    v w5 = w(2);
                    byte[] bArr2 = w5.f2894a;
                    int i11 = w5.f2896c;
                    bArr2[i11] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i11 + 1] = (byte) ((charAt2 & '?') | 128);
                    w5.f2896c = i11 + 2;
                    j5 = this.f2852c;
                    j6 = 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    v w6 = w(3);
                    byte[] bArr3 = w6.f2894a;
                    int i12 = w6.f2896c;
                    bArr3[i12] = (byte) ((charAt2 >> '\f') | TbsListener.ErrorCode.EXCEED_INCR_UPDATE);
                    bArr3[i12 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i12 + 2] = (byte) ((charAt2 & '?') | 128);
                    w6.f2896c = i12 + 3;
                    j5 = this.f2852c;
                    j6 = 3;
                } else {
                    int i13 = i5 + 1;
                    char charAt3 = i13 < i6 ? string.charAt(i13) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        A(63);
                        i5 = i13;
                    } else {
                        int i14 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        v w7 = w(4);
                        byte[] bArr4 = w7.f2894a;
                        int i15 = w7.f2896c;
                        bArr4[i15] = (byte) ((i14 >> 18) | TbsListener.ErrorCode.TPATCH_VERSION_FAILED);
                        bArr4[i15 + 1] = (byte) (((i14 >> 12) & 63) | 128);
                        bArr4[i15 + 2] = (byte) (((i14 >> 6) & 63) | 128);
                        bArr4[i15 + 3] = (byte) ((i14 & 63) | 128);
                        w7.f2896c = i15 + 4;
                        this.f2852c += 4;
                        i5 += 2;
                    }
                }
                this.f2852c = j5 + j6;
                i5++;
            }
        }
        return this;
    }

    public final f N(int i5) {
        String str;
        long j5;
        long j6;
        if (i5 < 128) {
            A(i5);
        } else {
            if (i5 < 2048) {
                v w4 = w(2);
                byte[] bArr = w4.f2894a;
                int i6 = w4.f2896c;
                bArr[i6] = (byte) ((i5 >> 6) | 192);
                bArr[i6 + 1] = (byte) ((i5 & 63) | 128);
                w4.f2896c = i6 + 2;
                j5 = this.f2852c;
                j6 = 2;
            } else if (55296 <= i5 && 57343 >= i5) {
                A(63);
            } else if (i5 < 65536) {
                v w5 = w(3);
                byte[] bArr2 = w5.f2894a;
                int i7 = w5.f2896c;
                bArr2[i7] = (byte) ((i5 >> 12) | TbsListener.ErrorCode.EXCEED_INCR_UPDATE);
                bArr2[i7 + 1] = (byte) (((i5 >> 6) & 63) | 128);
                bArr2[i7 + 2] = (byte) ((i5 & 63) | 128);
                w5.f2896c = i7 + 3;
                j5 = this.f2852c;
                j6 = 3;
            } else {
                if (i5 > 1114111) {
                    StringBuilder g5 = androidx.activity.d.g("Unexpected code point: 0x");
                    if (i5 != 0) {
                        char[] cArr = f1.j.f2786e;
                        int i8 = 0;
                        char[] cArr2 = {cArr[(i5 >> 28) & 15], cArr[(i5 >> 24) & 15], cArr[(i5 >> 20) & 15], cArr[(i5 >> 16) & 15], cArr[(i5 >> 12) & 15], cArr[(i5 >> 8) & 15], cArr[(i5 >> 4) & 15], cArr[i5 & 15]};
                        while (i8 < 8 && cArr2[i8] == '0') {
                            i8++;
                        }
                        str = new String(cArr2, i8, 8 - i8);
                    } else {
                        str = "0";
                    }
                    g5.append(str);
                    throw new IllegalArgumentException(g5.toString());
                }
                v w6 = w(4);
                byte[] bArr3 = w6.f2894a;
                int i9 = w6.f2896c;
                bArr3[i9] = (byte) ((i5 >> 18) | TbsListener.ErrorCode.TPATCH_VERSION_FAILED);
                bArr3[i9 + 1] = (byte) (((i5 >> 12) & 63) | 128);
                bArr3[i9 + 2] = (byte) (((i5 >> 6) & 63) | 128);
                bArr3[i9 + 3] = (byte) ((i5 & 63) | 128);
                w6.f2896c = i9 + 4;
                j5 = this.f2852c;
                j6 = 4;
            }
            this.f2852c = j5 + j6;
        }
        return this;
    }

    @Override // f4.h
    public final String O(long j5) {
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("limit < 0: ", j5).toString());
        }
        long j6 = j5 != Long.MAX_VALUE ? j5 + 1 : Long.MAX_VALUE;
        byte b5 = (byte) 10;
        long e5 = e(b5, 0L, j6);
        if (e5 != -1) {
            return g4.a.a(this, e5);
        }
        if (j6 < this.f2852c && c(j6 - 1) == ((byte) 13) && c(j6) == b5) {
            return g4.a.a(this, j6);
        }
        f fVar = new f();
        b(fVar, 0L, Math.min(32, this.f2852c));
        StringBuilder g5 = androidx.activity.d.g("\\n not found: limit=");
        g5.append(Math.min(this.f2852c, j5));
        g5.append(" content=");
        g5.append(fVar.l().d());
        g5.append(Typography.ellipsis);
        throw new EOFException(g5.toString());
    }

    @Override // f4.y
    public final void T(f source, long j5) {
        int i5;
        v vVar;
        v c5;
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        b.b(source.f2852c, 0L, j5);
        while (j5 > 0) {
            v vVar2 = source.f2851b;
            Intrinsics.checkNotNull(vVar2);
            int i6 = vVar2.f2896c;
            Intrinsics.checkNotNull(source.f2851b);
            if (j5 < i6 - r3.f2895b) {
                v vVar3 = this.f2851b;
                if (vVar3 != null) {
                    Intrinsics.checkNotNull(vVar3);
                    vVar = vVar3.f2900g;
                } else {
                    vVar = null;
                }
                if (vVar != null && vVar.f2898e) {
                    if ((vVar.f2896c + j5) - (vVar.f2897d ? 0 : vVar.f2895b) <= 8192) {
                        v vVar4 = source.f2851b;
                        Intrinsics.checkNotNull(vVar4);
                        vVar4.d(vVar, (int) j5);
                        source.f2852c -= j5;
                        this.f2852c += j5;
                        return;
                    }
                }
                v vVar5 = source.f2851b;
                Intrinsics.checkNotNull(vVar5);
                int i7 = (int) j5;
                Objects.requireNonNull(vVar5);
                if (!(i7 > 0 && i7 <= vVar5.f2896c - vVar5.f2895b)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i7 >= 1024) {
                    c5 = vVar5.c();
                } else {
                    c5 = w.c();
                    byte[] bArr = vVar5.f2894a;
                    byte[] bArr2 = c5.f2894a;
                    int i8 = vVar5.f2895b;
                    ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr2, 0, i8, i8 + i7, 2, (Object) null);
                }
                c5.f2896c = c5.f2895b + i7;
                vVar5.f2895b += i7;
                v vVar6 = vVar5.f2900g;
                Intrinsics.checkNotNull(vVar6);
                vVar6.b(c5);
                source.f2851b = c5;
            }
            v vVar7 = source.f2851b;
            Intrinsics.checkNotNull(vVar7);
            long j6 = vVar7.f2896c - vVar7.f2895b;
            source.f2851b = vVar7.a();
            v vVar8 = this.f2851b;
            if (vVar8 == null) {
                this.f2851b = vVar7;
                vVar7.f2900g = vVar7;
                vVar7.f2899f = vVar7;
            } else {
                Intrinsics.checkNotNull(vVar8);
                v vVar9 = vVar8.f2900g;
                Intrinsics.checkNotNull(vVar9);
                vVar9.b(vVar7);
                v vVar10 = vVar7.f2900g;
                if (!(vVar10 != vVar7)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                Intrinsics.checkNotNull(vVar10);
                if (vVar10.f2898e) {
                    int i9 = vVar7.f2896c - vVar7.f2895b;
                    v vVar11 = vVar7.f2900g;
                    Intrinsics.checkNotNull(vVar11);
                    int i10 = 8192 - vVar11.f2896c;
                    v vVar12 = vVar7.f2900g;
                    Intrinsics.checkNotNull(vVar12);
                    if (vVar12.f2897d) {
                        i5 = 0;
                    } else {
                        v vVar13 = vVar7.f2900g;
                        Intrinsics.checkNotNull(vVar13);
                        i5 = vVar13.f2895b;
                    }
                    if (i9 <= i10 + i5) {
                        v vVar14 = vVar7.f2900g;
                        Intrinsics.checkNotNull(vVar14);
                        vVar7.d(vVar14, i9);
                        vVar7.a();
                        w.b(vVar7);
                    }
                }
            }
            source.f2852c -= j6;
            this.f2852c += j6;
            j5 -= j6;
        }
    }

    @Override // f4.g
    public final /* bridge */ /* synthetic */ g X(i iVar) {
        x(iVar);
        return this;
    }

    public final void a() {
        skip(this.f2852c);
    }

    public final f b(f out, long j5, long j6) {
        Intrinsics.checkNotNullParameter(out, "out");
        b.b(this.f2852c, j5, j6);
        if (j6 != 0) {
            out.f2852c += j6;
            v vVar = this.f2851b;
            while (true) {
                Intrinsics.checkNotNull(vVar);
                int i5 = vVar.f2896c;
                int i6 = vVar.f2895b;
                if (j5 < i5 - i6) {
                    break;
                }
                j5 -= i5 - i6;
                vVar = vVar.f2899f;
            }
            while (j6 > 0) {
                Intrinsics.checkNotNull(vVar);
                v c5 = vVar.c();
                int i7 = c5.f2895b + ((int) j5);
                c5.f2895b = i7;
                c5.f2896c = Math.min(i7 + ((int) j6), c5.f2896c);
                v vVar2 = out.f2851b;
                if (vVar2 == null) {
                    c5.f2900g = c5;
                    c5.f2899f = c5;
                    out.f2851b = c5;
                } else {
                    Intrinsics.checkNotNull(vVar2);
                    v vVar3 = vVar2.f2900g;
                    Intrinsics.checkNotNull(vVar3);
                    vVar3.b(c5);
                }
                j6 -= c5.f2896c - c5.f2895b;
                vVar = vVar.f2899f;
                j5 = 0;
            }
        }
        return this;
    }

    @Override // f4.g
    public final long b0(a0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j5 = 0;
        while (true) {
            long u4 = source.u(this, 8192);
            if (u4 == -1) {
                return j5;
            }
            j5 += u4;
        }
    }

    @JvmName(name = "getByte")
    public final byte c(long j5) {
        b.b(this.f2852c, j5, 1L);
        v vVar = this.f2851b;
        if (vVar == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j6 = this.f2852c;
        if (j6 - j5 < j5) {
            while (j6 > j5) {
                vVar = vVar.f2900g;
                Intrinsics.checkNotNull(vVar);
                j6 -= vVar.f2896c - vVar.f2895b;
            }
            Intrinsics.checkNotNull(vVar);
            return vVar.f2894a[(int) ((vVar.f2895b + j5) - j6)];
        }
        long j7 = 0;
        while (true) {
            long j8 = (vVar.f2896c - vVar.f2895b) + j7;
            if (j8 > j5) {
                Intrinsics.checkNotNull(vVar);
                return vVar.f2894a[(int) ((vVar.f2895b + j5) - j7)];
            }
            vVar = vVar.f2899f;
            Intrinsics.checkNotNull(vVar);
            j7 = j8;
        }
    }

    @Override // f4.h
    public final void c0(long j5) {
        if (this.f2852c < j5) {
            throw new EOFException();
        }
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f2852c != 0) {
            v vVar = this.f2851b;
            Intrinsics.checkNotNull(vVar);
            v c5 = vVar.c();
            fVar.f2851b = c5;
            c5.f2900g = c5;
            c5.f2899f = c5;
            for (v vVar2 = vVar.f2899f; vVar2 != vVar; vVar2 = vVar2.f2899f) {
                v vVar3 = c5.f2900g;
                Intrinsics.checkNotNull(vVar3);
                Intrinsics.checkNotNull(vVar2);
                vVar3.b(vVar2.c());
            }
            fVar.f2852c = this.f2852c;
        }
        return fVar;
    }

    @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // f4.h
    public final i d(long j5) {
        if (!(j5 >= 0 && j5 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount: ", j5).toString());
        }
        if (this.f2852c < j5) {
            throw new EOFException();
        }
        if (j5 < 4096) {
            return new i(D(j5));
        }
        i s4 = s((int) j5);
        skip(j5);
        return s4;
    }

    @Override // f4.g
    public final /* bridge */ /* synthetic */ g d0(String str) {
        K(str);
        return this;
    }

    public final long e(byte b5, long j5, long j6) {
        v vVar;
        long j7 = 0;
        if (!(0 <= j5 && j6 >= j5)) {
            StringBuilder g5 = androidx.activity.d.g("size=");
            g5.append(this.f2852c);
            g5.append(" fromIndex=");
            g5.append(j5);
            g5.append(" toIndex=");
            g5.append(j6);
            throw new IllegalArgumentException(g5.toString().toString());
        }
        long j8 = this.f2852c;
        if (j6 > j8) {
            j6 = j8;
        }
        if (j5 != j6 && (vVar = this.f2851b) != null) {
            if (j8 - j5 < j5) {
                while (j8 > j5) {
                    vVar = vVar.f2900g;
                    Intrinsics.checkNotNull(vVar);
                    j8 -= vVar.f2896c - vVar.f2895b;
                }
                while (j8 < j6) {
                    byte[] bArr = vVar.f2894a;
                    int min = (int) Math.min(vVar.f2896c, (vVar.f2895b + j6) - j8);
                    for (int i5 = (int) ((vVar.f2895b + j5) - j8); i5 < min; i5++) {
                        if (bArr[i5] == b5) {
                            return (i5 - vVar.f2895b) + j8;
                        }
                    }
                    j8 += vVar.f2896c - vVar.f2895b;
                    vVar = vVar.f2899f;
                    Intrinsics.checkNotNull(vVar);
                    j5 = j8;
                }
            } else {
                while (true) {
                    long j9 = (vVar.f2896c - vVar.f2895b) + j7;
                    if (j9 > j5) {
                        break;
                    }
                    vVar = vVar.f2899f;
                    Intrinsics.checkNotNull(vVar);
                    j7 = j9;
                }
                while (j7 < j6) {
                    byte[] bArr2 = vVar.f2894a;
                    int min2 = (int) Math.min(vVar.f2896c, (vVar.f2895b + j6) - j7);
                    for (int i6 = (int) ((vVar.f2895b + j5) - j7); i6 < min2; i6++) {
                        if (bArr2[i6] == b5) {
                            return (i6 - vVar.f2895b) + j7;
                        }
                    }
                    j7 += vVar.f2896c - vVar.f2895b;
                    vVar = vVar.f2899f;
                    Intrinsics.checkNotNull(vVar);
                    j5 = j7;
                }
            }
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            long j5 = this.f2852c;
            f fVar = (f) obj;
            if (j5 != fVar.f2852c) {
                return false;
            }
            if (j5 != 0) {
                v vVar = this.f2851b;
                Intrinsics.checkNotNull(vVar);
                v vVar2 = fVar.f2851b;
                Intrinsics.checkNotNull(vVar2);
                int i5 = vVar.f2895b;
                int i6 = vVar2.f2895b;
                long j6 = 0;
                while (j6 < this.f2852c) {
                    long min = Math.min(vVar.f2896c - i5, vVar2.f2896c - i6);
                    long j7 = 0;
                    while (j7 < min) {
                        int i7 = i5 + 1;
                        int i8 = i6 + 1;
                        if (vVar.f2894a[i5] != vVar2.f2894a[i6]) {
                            return false;
                        }
                        j7++;
                        i5 = i7;
                        i6 = i8;
                    }
                    if (i5 == vVar.f2896c) {
                        vVar = vVar.f2899f;
                        Intrinsics.checkNotNull(vVar);
                        i5 = vVar.f2895b;
                    }
                    if (i6 == vVar2.f2896c) {
                        vVar2 = vVar2.f2899f;
                        Intrinsics.checkNotNull(vVar2);
                        i6 = vVar2.f2895b;
                    }
                    j6 += min;
                }
            }
        }
        return true;
    }

    @JvmOverloads
    public final a f(a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (!(unsafeCursor.f2853b == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.f2853b = this;
        unsafeCursor.f2854c = true;
        return unsafeCursor;
    }

    @Override // f4.g, f4.y, java.io.Flushable
    public final void flush() {
    }

    @Override // f4.h
    public final int g(r options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int b5 = g4.a.b(this, options, false);
        if (b5 == -1) {
            return -1;
        }
        skip(options.f2884b[b5].c());
        return b5;
    }

    @Override // f4.h, f4.g
    public final f h() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[EDGE_INSN: B:40:0x00ba->B:37:0x00ba BREAK  A[LOOP:0: B:4:0x000e->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    @Override // f4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h0() {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.f.h0():long");
    }

    public final int hashCode() {
        v vVar = this.f2851b;
        if (vVar == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i6 = vVar.f2896c;
            for (int i7 = vVar.f2895b; i7 < i6; i7++) {
                i5 = (i5 * 31) + vVar.f2894a[i7];
            }
            vVar = vVar.f2899f;
            Intrinsics.checkNotNull(vVar);
        } while (vVar != this.f2851b);
        return i5;
    }

    @Override // f4.a0
    public final b0 i() {
        return b0.f2836d;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // f4.g
    public final /* bridge */ /* synthetic */ g j(byte[] bArr, int i5, int i6) {
        z(bArr, i5, i6);
        return this;
    }

    @Override // f4.h
    public final String j0(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return p(this.f2852c, charset);
    }

    public final i l() {
        return d(this.f2852c);
    }

    @Override // f4.g
    public final g m() {
        return this;
    }

    public final short n() {
        int readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // f4.g
    public final /* bridge */ /* synthetic */ g o(int i5) {
        J(i5);
        return this;
    }

    public final String p(long j5, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(j5 >= 0 && j5 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount: ", j5).toString());
        }
        if (this.f2852c < j5) {
            throw new EOFException();
        }
        if (j5 == 0) {
            return "";
        }
        v vVar = this.f2851b;
        Intrinsics.checkNotNull(vVar);
        int i5 = vVar.f2895b;
        if (i5 + j5 > vVar.f2896c) {
            return new String(D(j5), charset);
        }
        int i6 = (int) j5;
        String str = new String(vVar.f2894a, i5, i6, charset);
        int i7 = vVar.f2895b + i6;
        vVar.f2895b = i7;
        this.f2852c -= j5;
        if (i7 == vVar.f2896c) {
            this.f2851b = vVar.a();
            w.b(vVar);
        }
        return str;
    }

    public final String q() {
        return p(this.f2852c, Charsets.UTF_8);
    }

    public final String r(long j5) {
        return p(j5, Charsets.UTF_8);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        v vVar = this.f2851b;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), vVar.f2896c - vVar.f2895b);
        sink.put(vVar.f2894a, vVar.f2895b, min);
        int i5 = vVar.f2895b + min;
        vVar.f2895b = i5;
        this.f2852c -= min;
        if (i5 == vVar.f2896c) {
            this.f2851b = vVar.a();
            w.b(vVar);
        }
        return min;
    }

    public final int read(byte[] sink, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        b.b(sink.length, i5, i6);
        v vVar = this.f2851b;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i6, vVar.f2896c - vVar.f2895b);
        byte[] bArr = vVar.f2894a;
        int i7 = vVar.f2895b;
        ArraysKt.copyInto(bArr, sink, i5, i7, i7 + min);
        int i8 = vVar.f2895b + min;
        vVar.f2895b = i8;
        this.f2852c -= min;
        if (i8 != vVar.f2896c) {
            return min;
        }
        this.f2851b = vVar.a();
        w.b(vVar);
        return min;
    }

    @Override // f4.h
    public final byte readByte() {
        if (this.f2852c == 0) {
            throw new EOFException();
        }
        v vVar = this.f2851b;
        Intrinsics.checkNotNull(vVar);
        int i5 = vVar.f2895b;
        int i6 = vVar.f2896c;
        int i7 = i5 + 1;
        byte b5 = vVar.f2894a[i5];
        this.f2852c--;
        if (i7 == i6) {
            this.f2851b = vVar.a();
            w.b(vVar);
        } else {
            vVar.f2895b = i7;
        }
        return b5;
    }

    @Override // f4.h
    public final void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i5 = 0;
        while (i5 < sink.length) {
            int read = read(sink, i5, sink.length - i5);
            if (read == -1) {
                throw new EOFException();
            }
            i5 += read;
        }
    }

    @Override // f4.h
    public final int readInt() {
        if (this.f2852c < 4) {
            throw new EOFException();
        }
        v vVar = this.f2851b;
        Intrinsics.checkNotNull(vVar);
        int i5 = vVar.f2895b;
        int i6 = vVar.f2896c;
        if (i6 - i5 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = vVar.f2894a;
        int i7 = i5 + 1;
        int i8 = i7 + 1;
        int i9 = ((bArr[i5] & 255) << 24) | ((bArr[i7] & 255) << 16);
        int i10 = i8 + 1;
        int i11 = i9 | ((bArr[i8] & 255) << 8);
        int i12 = i10 + 1;
        int i13 = i11 | (bArr[i10] & 255);
        this.f2852c -= 4;
        if (i12 == i6) {
            this.f2851b = vVar.a();
            w.b(vVar);
        } else {
            vVar.f2895b = i12;
        }
        return i13;
    }

    @Override // f4.h
    public final long readLong() {
        if (this.f2852c < 8) {
            throw new EOFException();
        }
        v vVar = this.f2851b;
        Intrinsics.checkNotNull(vVar);
        int i5 = vVar.f2895b;
        int i6 = vVar.f2896c;
        if (i6 - i5 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = vVar.f2894a;
        long j5 = (bArr[i5] & 255) << 56;
        long j6 = j5 | ((bArr[r6] & 255) << 48);
        long j7 = j6 | ((bArr[r1] & 255) << 40);
        int i7 = i5 + 1 + 1 + 1 + 1;
        long j8 = ((bArr[r6] & 255) << 32) | j7;
        long j9 = j8 | ((bArr[i7] & 255) << 24);
        long j10 = j9 | ((bArr[r8] & 255) << 16);
        long j11 = j10 | ((bArr[r1] & 255) << 8);
        int i8 = i7 + 1 + 1 + 1 + 1;
        long j12 = j11 | (bArr[r8] & 255);
        this.f2852c -= 8;
        if (i8 == i6) {
            this.f2851b = vVar.a();
            w.b(vVar);
        } else {
            vVar.f2895b = i8;
        }
        return j12;
    }

    @Override // f4.h
    public final short readShort() {
        if (this.f2852c < 2) {
            throw new EOFException();
        }
        v vVar = this.f2851b;
        Intrinsics.checkNotNull(vVar);
        int i5 = vVar.f2895b;
        int i6 = vVar.f2896c;
        if (i6 - i5 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = vVar.f2894a;
        int i7 = i5 + 1;
        int i8 = i7 + 1;
        int i9 = ((bArr[i5] & 255) << 8) | (bArr[i7] & 255);
        this.f2852c -= 2;
        if (i8 == i6) {
            this.f2851b = vVar.a();
            w.b(vVar);
        } else {
            vVar.f2895b = i8;
        }
        return (short) i9;
    }

    public final i s(int i5) {
        if (i5 == 0) {
            return i.f2860e;
        }
        b.b(this.f2852c, 0L, i5);
        v vVar = this.f2851b;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            Intrinsics.checkNotNull(vVar);
            int i9 = vVar.f2896c;
            int i10 = vVar.f2895b;
            if (i9 == i10) {
                throw new AssertionError("s.limit == s.pos");
            }
            i7 += i9 - i10;
            i8++;
            vVar = vVar.f2899f;
        }
        byte[][] bArr = new byte[i8][];
        int[] iArr = new int[i8 * 2];
        v vVar2 = this.f2851b;
        int i11 = 0;
        while (i6 < i5) {
            Intrinsics.checkNotNull(vVar2);
            bArr[i11] = vVar2.f2894a;
            i6 += vVar2.f2896c - vVar2.f2895b;
            iArr[i11] = Math.min(i6, i5);
            iArr[i11 + i8] = vVar2.f2895b;
            vVar2.f2897d = true;
            i11++;
            vVar2 = vVar2.f2899f;
        }
        return new x(bArr, iArr);
    }

    @Override // f4.h
    public final void skip(long j5) {
        while (j5 > 0) {
            v vVar = this.f2851b;
            if (vVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j5, vVar.f2896c - vVar.f2895b);
            long j6 = min;
            this.f2852c -= j6;
            j5 -= j6;
            int i5 = vVar.f2895b + min;
            vVar.f2895b = i5;
            if (i5 == vVar.f2896c) {
                this.f2851b = vVar.a();
                w.b(vVar);
            }
        }
    }

    @Override // f4.g
    public final /* bridge */ /* synthetic */ g t(int i5) {
        I(i5);
        return this;
    }

    public final String toString() {
        long j5 = this.f2852c;
        if (j5 <= ((long) Integer.MAX_VALUE)) {
            return s((int) j5).toString();
        }
        StringBuilder g5 = androidx.activity.d.g("size > Int.MAX_VALUE: ");
        g5.append(this.f2852c);
        throw new IllegalStateException(g5.toString().toString());
    }

    @Override // f4.a0
    public final long u(f sink, long j5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount < 0: ", j5).toString());
        }
        long j6 = this.f2852c;
        if (j6 == 0) {
            return -1L;
        }
        if (j5 > j6) {
            j5 = j6;
        }
        sink.T(this, j5);
        return j5;
    }

    @Override // f4.h
    public final String v() {
        return O(Long.MAX_VALUE);
    }

    public final v w(int i5) {
        if (!(i5 >= 1 && i5 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        v vVar = this.f2851b;
        if (vVar == null) {
            v c5 = w.c();
            this.f2851b = c5;
            c5.f2900g = c5;
            c5.f2899f = c5;
            return c5;
        }
        Intrinsics.checkNotNull(vVar);
        v vVar2 = vVar.f2900g;
        Intrinsics.checkNotNull(vVar2);
        if (vVar2.f2896c + i5 <= 8192 && vVar2.f2898e) {
            return vVar2;
        }
        v c6 = w.c();
        vVar2.b(c6);
        return c6;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i5 = remaining;
        while (i5 > 0) {
            v w4 = w(1);
            int min = Math.min(i5, 8192 - w4.f2896c);
            source.get(w4.f2894a, w4.f2896c, min);
            i5 -= min;
            w4.f2896c += min;
        }
        this.f2852c += remaining;
        return remaining;
    }

    public final f x(i byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.l(this, byteString.c());
        return this;
    }

    public final f y(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        z(source, 0, source.length);
        return this;
    }

    public final f z(byte[] source, int i5, int i6) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j5 = i6;
        b.b(source.length, i5, j5);
        int i7 = i6 + i5;
        while (i5 < i7) {
            v w4 = w(1);
            int min = Math.min(i7 - i5, 8192 - w4.f2896c);
            int i8 = i5 + min;
            ArraysKt.copyInto(source, w4.f2894a, w4.f2896c, i5, i8);
            w4.f2896c += min;
            i5 = i8;
        }
        this.f2852c += j5;
        return this;
    }
}
