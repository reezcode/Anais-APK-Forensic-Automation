package h;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2983a;

    /* renamed from: b, reason: collision with root package name */
    public int f2984b;

    public a() {
        this.f2983a = new byte[64];
    }

    public a(int i5) {
        this.f2983a = new byte[i5];
    }

    public final void a(int i5) {
        byte[] bArr = this.f2983a;
        int length = bArr.length * 2;
        int i6 = this.f2984b;
        int i7 = i5 + i6;
        if (length <= i7) {
            length = i7;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i6);
        this.f2983a = bArr2;
    }

    public final a b(int i5, int i6) {
        int i7 = this.f2984b;
        if (i7 + 2 > this.f2983a.length) {
            a(2);
        }
        byte[] bArr = this.f2983a;
        int i8 = i7 + 1;
        bArr[i7] = (byte) i5;
        bArr[i8] = (byte) i6;
        this.f2984b = i8 + 1;
        return this;
    }

    public final a c(int i5, int i6) {
        int i7 = this.f2984b;
        if (i7 + 3 > this.f2983a.length) {
            a(3);
        }
        byte[] bArr = this.f2983a;
        int i8 = i7 + 1;
        bArr[i7] = (byte) i5;
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i6 >>> 8);
        bArr[i9] = (byte) i6;
        this.f2984b = i9 + 1;
        return this;
    }

    public final a d(int i5) {
        int i6 = this.f2984b;
        int i7 = i6 + 1;
        if (i7 > this.f2983a.length) {
            a(1);
        }
        this.f2983a[i6] = (byte) i5;
        this.f2984b = i7;
        return this;
    }

    public final a e(byte[] bArr, int i5) {
        if (this.f2984b + i5 > this.f2983a.length) {
            a(i5);
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f2983a, this.f2984b, i5);
        }
        this.f2984b += i5;
        return this;
    }

    public final a f(int i5) {
        int i6 = this.f2984b;
        if (i6 + 4 > this.f2983a.length) {
            a(4);
        }
        byte[] bArr = this.f2983a;
        int i7 = i6 + 1;
        bArr[i6] = (byte) (i5 >>> 24);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (i5 >>> 16);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i5 >>> 8);
        bArr[i9] = (byte) i5;
        this.f2984b = i9 + 1;
        return this;
    }

    public final a g(int i5) {
        int i6 = this.f2984b;
        if (i6 + 2 > this.f2983a.length) {
            a(2);
        }
        byte[] bArr = this.f2983a;
        int i7 = i6 + 1;
        bArr[i6] = (byte) (i5 >>> 8);
        bArr[i7] = (byte) i5;
        this.f2984b = i7 + 1;
        return this;
    }
}
