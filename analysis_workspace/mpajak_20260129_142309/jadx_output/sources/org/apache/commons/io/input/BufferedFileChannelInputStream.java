package org.apache.commons.io.input;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

/* loaded from: classes25.dex */
public final class BufferedFileChannelInputStream extends InputStream {
    private static final Class<?> DIRECT_BUFFER_CLASS = getDirectBufferClass();
    private final ByteBuffer byteBuffer;
    private final FileChannel fileChannel;

    public BufferedFileChannelInputStream(File file) {
        this(file, 8192);
    }

    public BufferedFileChannelInputStream(File file, int i5) {
        this(file.toPath(), i5);
    }

    public BufferedFileChannelInputStream(Path path) {
        this(path, 8192);
    }

    public BufferedFileChannelInputStream(Path path, int i5) {
        Objects.requireNonNull(path, "path");
        this.fileChannel = FileChannel.open(path, StandardOpenOption.READ);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i5);
        this.byteBuffer = allocateDirect;
        allocateDirect.flip();
    }

    private void clean(ByteBuffer byteBuffer) {
        if (isDirectBuffer(byteBuffer)) {
            cleanDirectBuffer(byteBuffer);
        }
    }

    private void cleanDirectBuffer(ByteBuffer byteBuffer) {
        if ("1.8".equals(System.getProperty("java.specification.version"))) {
            try {
                Class<?> cls = Class.forName("sun.misc.Cleaner");
                Object invoke = DIRECT_BUFFER_CLASS.getMethod("cleaner", new Class[0]).invoke(byteBuffer, new Object[0]);
                if (invoke != null) {
                    cls.getMethod("clean", new Class[0]).invoke(invoke, new Object[0]);
                    return;
                }
                return;
            } catch (ReflectiveOperationException e5) {
                throw new IllegalStateException(e5);
            }
        }
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Method method = cls2.getMethod("invokeCleaner", ByteBuffer.class);
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            method.invoke(declaredField.get(null), byteBuffer);
        } catch (ReflectiveOperationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    private static Class<?> getDirectBufferClass() {
        try {
            return Class.forName("sun.nio.ch.DirectBuffer");
        } catch (ClassNotFoundException | IllegalAccessError unused) {
            return null;
        }
    }

    private static boolean isDirectBuffer(Object obj) {
        Class<?> cls = DIRECT_BUFFER_CLASS;
        return cls != null && cls.isInstance(obj);
    }

    private boolean refill() {
        if (this.byteBuffer.hasRemaining()) {
            return true;
        }
        this.byteBuffer.clear();
        int i5 = 0;
        while (i5 == 0) {
            i5 = this.fileChannel.read(this.byteBuffer);
        }
        this.byteBuffer.flip();
        return i5 >= 0;
    }

    private long skipFromFileChannel(long j5) {
        long position = this.fileChannel.position();
        long size = this.fileChannel.size();
        long j6 = size - position;
        if (j5 > j6) {
            this.fileChannel.position(size);
            return j6;
        }
        this.fileChannel.position(position + j5);
        return j5;
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        return this.byteBuffer.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.fileChannel.close();
        } finally {
            clean(this.byteBuffer);
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        return !refill() ? -1 : this.byteBuffer.get() & 255;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i5, int i6) {
        int i7;
        if (i5 >= 0 && i6 >= 0 && (i7 = i5 + i6) >= 0) {
            if (i7 <= bArr.length) {
                if (!refill()) {
                    return -1;
                }
                int min = Math.min(i6, this.byteBuffer.remaining());
                this.byteBuffer.get(bArr, i5, min);
                return min;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public synchronized long skip(long j5) {
        if (j5 <= 0) {
            return 0L;
        }
        if (this.byteBuffer.remaining() >= j5) {
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.position(byteBuffer.position() + ((int) j5));
            return j5;
        }
        long remaining = this.byteBuffer.remaining();
        this.byteBuffer.position(0);
        this.byteBuffer.flip();
        return remaining + skipFromFileChannel(j5 - remaining);
    }
}
