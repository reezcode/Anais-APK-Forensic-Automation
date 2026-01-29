package m;

import androidx.room.RoomDatabase;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Properties;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;

/* loaded from: classes23.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Properties f4081a = new Properties();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f4082b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean[] f4083c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean[] f4084d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4085e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f4086f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean[] f4087g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean[] f4088h;

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f4089i;

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f4090j;

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f4091k;

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f4092l;

    /* renamed from: m, reason: collision with root package name */
    public static final char[] f4093m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f4094n;

    /* renamed from: o, reason: collision with root package name */
    public static final char[] f4095o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f4096p;

    static {
        Charset.forName("UTF-8");
        f4082b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        f4083c = new boolean[256];
        char c5 = 0;
        while (true) {
            boolean[] zArr = f4083c;
            if (c5 >= zArr.length) {
                break;
            }
            if (c5 >= 'A' && c5 <= 'Z') {
                zArr[c5] = true;
            } else if (c5 >= 'a' && c5 <= 'z') {
                zArr[c5] = true;
            } else if (c5 == '_' || c5 == '$') {
                zArr[c5] = true;
            }
            c5 = (char) (c5 + 1);
        }
        f4084d = new boolean[256];
        char c6 = 0;
        while (true) {
            boolean[] zArr2 = f4084d;
            if (c6 < zArr2.length) {
                if (c6 >= 'A' && c6 <= 'Z') {
                    zArr2[c6] = true;
                } else if (c6 >= 'a' && c6 <= 'z') {
                    zArr2[c6] = true;
                } else if (c6 == '_') {
                    zArr2[c6] = true;
                } else if (c6 >= '0' && c6 <= '9') {
                    zArr2[c6] = true;
                }
                c6 = (char) (c6 + 1);
            } else {
                try {
                    break;
                } catch (Throwable unused) {
                }
            }
        }
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new d());
        if (inputStream != null) {
            f4081a.load(inputStream);
            inputStream.close();
        }
        byte[] bArr = new byte[161];
        f4085e = bArr;
        byte[] bArr2 = new byte[161];
        f4086f = bArr2;
        f4087g = new boolean[161];
        f4088h = new boolean[161];
        f4089i = new char[93];
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i5 = 14; i5 <= 31; i5++) {
            f4085e[i5] = 4;
            f4086f[i5] = 4;
        }
        for (int i6 = 127; i6 < 160; i6++) {
            f4085e[i6] = 4;
            f4086f[i6] = 4;
        }
        for (int i7 = 0; i7 < 161; i7++) {
            f4087g[i7] = f4085e[i7] != 0;
            f4088h[i7] = f4086f[i7] != 0;
        }
        char[] cArr = f4089i;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[11] = 'v';
        cArr[12] = 'f';
        cArr[13] = 'r';
        cArr[34] = Typography.quote;
        cArr[39] = '\'';
        cArr[47] = IOUtils.DIR_SEPARATOR_UNIX;
        cArr[92] = IOUtils.DIR_SEPARATOR_WINDOWS;
        f4090j = new char[]{'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2', 'F'};
        f4091k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f4092l = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
        f4093m = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        f4094n = new int[]{9, 99, RoomDatabase.MAX_BIND_PARAMETER_CNT, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f4095o = charArray;
        int[] iArr = new int[256];
        f4096p = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i8 = 0; i8 < length; i8++) {
            f4096p[f4095o[i8]] = i8;
        }
        f4096p[61] = 0;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void b(int i5, int i6, char[] cArr) {
        char c5;
        if (i5 < 0) {
            c5 = '-';
            i5 = -i5;
        } else {
            c5 = 0;
        }
        while (i5 >= 65536) {
            int i7 = i5 / 100;
            int i8 = i5 - (((i7 << 6) + (i7 << 5)) + (i7 << 2));
            int i9 = i6 - 1;
            cArr[i9] = f4093m[i8];
            i6 = i9 - 1;
            cArr[i6] = f4092l[i8];
            i5 = i7;
        }
        while (true) {
            int i10 = (52429 * i5) >>> 19;
            i6--;
            cArr[i6] = f4091k[i5 - ((i10 << 3) + (i10 << 1))];
            if (i10 == 0) {
                break;
            } else {
                i5 = i10;
            }
        }
        if (c5 != 0) {
            cArr[i6 - 1] = c5;
        }
    }

    public static void c(long j5, int i5, char[] cArr) {
        char c5;
        if (j5 < 0) {
            c5 = '-';
            j5 = -j5;
        } else {
            c5 = 0;
        }
        while (j5 > 2147483647L) {
            long j6 = j5 / 100;
            int i6 = (int) (j5 - (((j6 << 6) + (j6 << 5)) + (j6 << 2)));
            int i7 = i5 - 1;
            cArr[i7] = f4093m[i6];
            i5 = i7 - 1;
            cArr[i5] = f4092l[i6];
            j5 = j6;
        }
        int i8 = (int) j5;
        while (i8 >= 65536) {
            int i9 = i8 / 100;
            int i10 = i8 - (((i9 << 6) + (i9 << 5)) + (i9 << 2));
            int i11 = i5 - 1;
            cArr[i11] = f4093m[i10];
            i5 = i11 - 1;
            cArr[i5] = f4092l[i10];
            i8 = i9;
        }
        while (true) {
            int i12 = (52429 * i8) >>> 19;
            i5--;
            cArr[i5] = f4091k[i8 - ((i12 << 3) + (i12 << 1))];
            if (i12 == 0) {
                break;
            } else {
                i8 = i12;
            }
        }
        if (c5 != 0) {
            cArr[i5 - 1] = c5;
        }
    }

    public static String d(String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        return str2 == null ? f4081a.getProperty(str) : str2;
    }

    public static int e(int i5) {
        int i6;
        int i7 = 0;
        do {
            i6 = f4094n[i7];
            i7++;
        } while (i5 > i6);
        return i7;
    }

    public static int f(long j5) {
        long j6 = 10;
        for (int i5 = 1; i5 < 19; i5++) {
            if (j5 < j6) {
                return i5;
            }
            j6 *= 10;
        }
        return 19;
    }
}
