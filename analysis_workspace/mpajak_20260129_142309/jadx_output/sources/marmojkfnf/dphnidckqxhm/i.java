package marmojkfnf.dphnidckqxhm;

/* loaded from: classes19.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f4336a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f4337b = new char[256];

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f4338c = new char[256];

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f4339d;

    static {
        i0.a("MTIz");
        for (int i5 = 0; i5 < 256; i5++) {
            char[] cArr = f4337b;
            char[] cArr2 = f4336a;
            cArr[i5] = cArr2[(i5 >> 4) & 15];
            f4338c[i5] = cArr2[i5 & 15];
        }
        f4339d = new byte[103];
        for (int i6 = 0; i6 <= 70; i6++) {
            f4339d[i6] = -1;
        }
        for (byte b5 = 0; b5 < 10; b5 = (byte) (b5 + 1)) {
            f4339d[b5 + 48] = b5;
        }
        for (byte b6 = 0; b6 < 6; b6 = (byte) (b6 + 1)) {
            byte[] bArr = f4339d;
            byte b7 = (byte) (b6 + 10);
            bArr[b6 + 65] = b7;
            bArr[b6 + 97] = b7;
        }
    }
}
