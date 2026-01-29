package l0;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class h extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f3938b;

    public h(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f3938b = Integer.MIN_VALUE;
    }

    public final long a(long j5) {
        int i5 = this.f3938b;
        if (i5 == 0) {
            return -1L;
        }
        return (i5 == Integer.MIN_VALUE || j5 <= ((long) i5)) ? j5 : i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i5 = this.f3938b;
        return i5 == Integer.MIN_VALUE ? super.available() : Math.min(i5, super.available());
    }

    public final void b(long j5) {
        int i5 = this.f3938b;
        if (i5 == Integer.MIN_VALUE || j5 == -1) {
            return;
        }
        this.f3938b = (int) (i5 - j5);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        super.mark(i5);
        this.f3938b = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i5, int i6) {
        int a5 = (int) a(i6);
        if (a5 == -1) {
            return -1;
        }
        int read = super.read(bArr, i5, a5);
        b(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f3938b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) {
        long a5 = a(j5);
        if (a5 == -1) {
            return 0L;
        }
        long skip = super.skip(a5);
        b(skip);
        return skip;
    }
}
