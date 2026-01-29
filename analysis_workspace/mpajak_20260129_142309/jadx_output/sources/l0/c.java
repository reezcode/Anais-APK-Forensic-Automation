package l0;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class c extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final long f3924b;

    /* renamed from: c, reason: collision with root package name */
    public int f3925c;

    public c(@NonNull InputStream inputStream, long j5) {
        super(inputStream);
        this.f3924b = j5;
    }

    public final int a(int i5) {
        if (i5 >= 0) {
            this.f3925c += i5;
        } else if (this.f3924b - this.f3925c > 0) {
            StringBuilder g5 = androidx.activity.d.g("Failed to read all expected data, expected: ");
            g5.append(this.f3924b);
            g5.append(", but read: ");
            g5.append(this.f3925c);
            throw new IOException(g5.toString());
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f3924b - this.f3925c, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i5, int i6) {
        int read;
        read = super.read(bArr, i5, i6);
        a(read);
        return read;
    }
}
