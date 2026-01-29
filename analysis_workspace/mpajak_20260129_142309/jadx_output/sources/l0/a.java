package l0;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes24.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference<byte[]> f3917a = new AtomicReference<>();

    /* renamed from: l0.a$a, reason: collision with other inner class name */
    /* loaded from: classes14.dex */
    public static class C0044a extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f3918b;

        /* renamed from: c, reason: collision with root package name */
        public int f3919c = -1;

        public C0044a(@NonNull ByteBuffer byteBuffer) {
            this.f3918b = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f3918b.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i5) {
            this.f3919c = this.f3918b.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f3918b.hasRemaining()) {
                return this.f3918b.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(@NonNull byte[] bArr, int i5, int i6) {
            if (!this.f3918b.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i6, available());
            this.f3918b.get(bArr, i5, min);
            return min;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            int i5 = this.f3919c;
            if (i5 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f3918b.position(i5);
        }

        @Override // java.io.InputStream
        public final long skip(long j5) {
            if (!this.f3918b.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j5, available());
            this.f3918b.position((int) (r0.position() + min));
            return min;
        }
    }

    /* loaded from: classes17.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3920a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3921b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f3922c;

        public b(@NonNull byte[] bArr, int i5, int i6) {
            this.f3922c = bArr;
            this.f3920a = i5;
            this.f3921b = i6;
        }
    }

    @NonNull
    public static ByteBuffer a(@NonNull File file) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return load;
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static void b(@NonNull ByteBuffer byteBuffer, @NonNull File file) {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }
}
