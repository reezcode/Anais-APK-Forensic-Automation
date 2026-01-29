package l0;

import androidx.annotation.GuardedBy;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes5.dex */
public final class d extends InputStream {

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("POOL")
    public static final Queue<d> f3926d;

    /* renamed from: b, reason: collision with root package name */
    public InputStream f3927b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f3928c;

    static {
        char[] cArr = k.f3942a;
        f3926d = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f3927b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3927b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i5) {
        this.f3927b.mark(i5);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f3927b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f3927b.read();
        } catch (IOException e5) {
            this.f3928c = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f3927b.read(bArr);
        } catch (IOException e5) {
            this.f3928c = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) {
        try {
            return this.f3927b.read(bArr, i5, i6);
        } catch (IOException e5) {
            this.f3928c = e5;
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f3927b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j5) {
        try {
            return this.f3927b.skip(j5);
        } catch (IOException e5) {
            this.f3928c = e5;
            throw e5;
        }
    }
}
