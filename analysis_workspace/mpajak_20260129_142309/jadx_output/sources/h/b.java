package h;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes20.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2985a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2986b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2987c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2988d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2989e;

    public b(InputStream inputStream) {
        int i5;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            i5 = 0;
            if (read == -1) {
                break;
            } else if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        inputStream.close();
        this.f2985a = byteArrayOutputStream.toByteArray();
        int d5 = d(8);
        this.f2986b = new int[d5];
        this.f2987c = new String[d5];
        int i6 = 10;
        int i7 = 1;
        while (i7 < d5) {
            int i8 = i6 + 1;
            this.f2986b[i7] = i8;
            byte b5 = this.f2985a[i6];
            int i9 = 5;
            if (b5 == 1) {
                i9 = d(i8) + 3;
                if (i9 > i5) {
                    i5 = i9;
                }
            } else if (b5 == 15) {
                i9 = 4;
            } else if (b5 != 18 && b5 != 3 && b5 != 4) {
                if (b5 != 5 && b5 != 6) {
                    switch (b5) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            break;
                        default:
                            i9 = 3;
                            break;
                    }
                } else {
                    i9 = 9;
                    i7++;
                }
            }
            i6 += i9;
            i7++;
        }
        this.f2988d = i5;
        this.f2989e = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01de A[LOOP:16: B:111:0x01dc->B:112:0x01de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(h.j r18) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.a(h.j):void");
    }

    public final int b(int i5) {
        byte[] bArr = this.f2985a;
        return (bArr[i5 + 3] & 255) | ((bArr[i5] & 255) << 24) | ((bArr[i5 + 1] & 255) << 16) | ((bArr[i5 + 2] & 255) << 8);
    }

    public final String c(int i5, char[] cArr) {
        int i6;
        int d5 = d(i5);
        String[] strArr = this.f2987c;
        String str = strArr[d5];
        if (str != null) {
            return str;
        }
        int i7 = this.f2986b[d5];
        int i8 = i7 + 2;
        int d6 = d(i7) + i8;
        byte[] bArr = this.f2985a;
        int i9 = 0;
        char c5 = 0;
        char c6 = 0;
        while (i8 < d6) {
            int i10 = i8 + 1;
            byte b5 = bArr[i8];
            if (c5 != 0) {
                if (c5 == 1) {
                    cArr[i9] = (char) ((b5 & 63) | (c6 << 6));
                    i9++;
                    c5 = 0;
                } else if (c5 == 2) {
                    i6 = (b5 & 63) | (c6 << 6);
                    c6 = (char) i6;
                    c5 = 1;
                }
                i8 = i10;
            } else {
                int i11 = b5 & 255;
                if (i11 < 128) {
                    cArr[i9] = (char) i11;
                    i9++;
                } else if (i11 >= 224 || i11 <= 191) {
                    c6 = (char) (i11 & 15);
                    c5 = 2;
                } else {
                    i6 = i11 & 31;
                    c6 = (char) i6;
                    c5 = 1;
                }
                i8 = i10;
            }
        }
        String str2 = new String(cArr, 0, i9);
        strArr[d5] = str2;
        return str2;
    }

    public final int d(int i5) {
        byte[] bArr = this.f2985a;
        return (bArr[i5 + 1] & 255) | ((bArr[i5] & 255) << 8);
    }
}
