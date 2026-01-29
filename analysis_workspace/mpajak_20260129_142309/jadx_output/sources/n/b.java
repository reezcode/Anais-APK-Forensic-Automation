package n;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes8.dex */
public final class b implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f4491b;

    /* renamed from: c, reason: collision with root package name */
    public final Charset f4492c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4493d;

    /* renamed from: e, reason: collision with root package name */
    public int f4494e;

    /* renamed from: f, reason: collision with root package name */
    public int f4495f;

    /* loaded from: classes12.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i5) {
            super(i5);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i5 = ((ByteArrayOutputStream) this).count;
            if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
                i5--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i5, b.this.f4492c.name());
            } catch (UnsupportedEncodingException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(c.f4497a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f4491b = inputStream;
        this.f4492c = charset;
        this.f4493d = new byte[8192];
    }

    public final void a() {
        InputStream inputStream = this.f4491b;
        byte[] bArr = this.f4493d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f4494e = 0;
        this.f4495f = read;
    }

    public final String b() {
        int i5;
        byte[] bArr;
        int i6;
        synchronized (this.f4491b) {
            if (this.f4493d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f4494e >= this.f4495f) {
                a();
            }
            for (int i7 = this.f4494e; i7 != this.f4495f; i7++) {
                byte[] bArr2 = this.f4493d;
                if (bArr2[i7] == 10) {
                    int i8 = this.f4494e;
                    if (i7 != i8) {
                        i6 = i7 - 1;
                        if (bArr2[i6] == 13) {
                            String str = new String(bArr2, i8, i6 - i8, this.f4492c.name());
                            this.f4494e = i7 + 1;
                            return str;
                        }
                    }
                    i6 = i7;
                    String str2 = new String(bArr2, i8, i6 - i8, this.f4492c.name());
                    this.f4494e = i7 + 1;
                    return str2;
                }
            }
            a aVar = new a((this.f4495f - this.f4494e) + 80);
            loop1: while (true) {
                byte[] bArr3 = this.f4493d;
                int i9 = this.f4494e;
                aVar.write(bArr3, i9, this.f4495f - i9);
                this.f4495f = -1;
                a();
                i5 = this.f4494e;
                while (i5 != this.f4495f) {
                    bArr = this.f4493d;
                    if (bArr[i5] == 10) {
                        break loop1;
                    }
                    i5++;
                }
            }
            int i10 = this.f4494e;
            if (i5 != i10) {
                aVar.write(bArr, i10, i5 - i10);
            }
            this.f4494e = i5 + 1;
            return aVar.toString();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f4491b) {
            if (this.f4493d != null) {
                this.f4493d = null;
                this.f4491b.close();
            }
        }
    }
}
