package y;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class w extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public volatile byte[] f6033b;

    /* renamed from: c, reason: collision with root package name */
    public int f6034c;

    /* renamed from: d, reason: collision with root package name */
    public int f6035d;

    /* renamed from: e, reason: collision with root package name */
    public int f6036e;

    /* renamed from: f, reason: collision with root package name */
    public int f6037f;

    /* renamed from: g, reason: collision with root package name */
    public final s.b f6038g;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public w(@NonNull InputStream inputStream, @NonNull s.b bVar) {
        super(inputStream);
        this.f6036e = -1;
        this.f6038g = bVar;
        this.f6033b = (byte[]) bVar.b(65536, byte[].class);
    }

    public static IOException c() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i5 = this.f6036e;
        if (i5 != -1) {
            int i6 = this.f6037f - i5;
            int i7 = this.f6035d;
            if (i6 < i7) {
                if (i5 == 0 && i7 > bArr.length && this.f6034c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i7) {
                        i7 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f6038g.b(i7, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f6033b = bArr2;
                    this.f6038g.put(bArr);
                    bArr = bArr2;
                } else if (i5 > 0) {
                    System.arraycopy(bArr, i5, bArr, 0, bArr.length - i5);
                }
                int i8 = this.f6037f - this.f6036e;
                this.f6037f = i8;
                this.f6036e = 0;
                this.f6034c = 0;
                int read = inputStream.read(bArr, i8, bArr.length - i8);
                int i9 = this.f6037f;
                if (read > 0) {
                    i9 += read;
                }
                this.f6034c = i9;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f6036e = -1;
            this.f6037f = 0;
            this.f6034c = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f6033b == null || inputStream == null) {
            c();
            throw null;
        }
        return (this.f6034c - this.f6037f) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f6033b != null) {
            this.f6038g.put(this.f6033b);
            this.f6033b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6033b != null) {
            this.f6038g.put(this.f6033b);
            this.f6033b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        this.f6035d = Math.max(this.f6035d, i5);
        this.f6036e = this.f6037f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f6033b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            c();
            throw null;
        }
        if (this.f6037f >= this.f6034c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f6033b && (bArr = this.f6033b) == null) {
            c();
            throw null;
        }
        int i5 = this.f6034c;
        int i6 = this.f6037f;
        if (i5 - i6 <= 0) {
            return -1;
        }
        this.f6037f = i6 + 1;
        return bArr[i6] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(@NonNull byte[] bArr, int i5, int i6) {
        int i7;
        int i8;
        byte[] bArr2 = this.f6033b;
        if (bArr2 == null) {
            c();
            throw null;
        }
        if (i6 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            c();
            throw null;
        }
        int i9 = this.f6037f;
        int i10 = this.f6034c;
        if (i9 < i10) {
            int i11 = i10 - i9 >= i6 ? i6 : i10 - i9;
            System.arraycopy(bArr2, i9, bArr, i5, i11);
            this.f6037f += i11;
            if (i11 == i6 || inputStream.available() == 0) {
                return i11;
            }
            i5 += i11;
            i7 = i6 - i11;
        } else {
            i7 = i6;
        }
        while (true) {
            if (this.f6036e == -1 && i7 >= bArr2.length) {
                i8 = inputStream.read(bArr, i5, i7);
                if (i8 == -1) {
                    return i7 != i6 ? i6 - i7 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i7 != i6 ? i6 - i7 : -1;
                }
                if (bArr2 != this.f6033b && (bArr2 = this.f6033b) == null) {
                    c();
                    throw null;
                }
                int i12 = this.f6034c;
                int i13 = this.f6037f;
                i8 = i12 - i13 >= i7 ? i7 : i12 - i13;
                System.arraycopy(bArr2, i13, bArr, i5, i8);
                this.f6037f += i8;
            }
            i7 -= i8;
            if (i7 == 0) {
                return i6;
            }
            if (inputStream.available() == 0) {
                return i6 - i7;
            }
            i5 += i8;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f6033b == null) {
            throw new IOException("Stream is closed");
        }
        int i5 = this.f6036e;
        if (-1 == i5) {
            throw new a("Mark has been invalidated, pos: " + this.f6037f + " markLimit: " + this.f6035d);
        }
        this.f6037f = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j5) {
        if (j5 < 1) {
            return 0L;
        }
        byte[] bArr = this.f6033b;
        if (bArr == null) {
            c();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            c();
            throw null;
        }
        int i5 = this.f6034c;
        int i6 = this.f6037f;
        if (i5 - i6 >= j5) {
            this.f6037f = (int) (i6 + j5);
            return j5;
        }
        long j6 = i5 - i6;
        this.f6037f = i5;
        if (this.f6036e == -1 || j5 > this.f6035d) {
            long skip = inputStream.skip(j5 - j6);
            if (skip > 0) {
                this.f6036e = -1;
            }
            return j6 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j6;
        }
        int i7 = this.f6034c;
        int i8 = this.f6037f;
        if (i7 - i8 >= j5 - j6) {
            this.f6037f = (int) ((i8 + j5) - j6);
            return j5;
        }
        long j7 = (j6 + i7) - i8;
        this.f6037f = i7;
        return j7;
    }
}
