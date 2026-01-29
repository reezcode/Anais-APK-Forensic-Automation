package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public class ReadAheadInputStream extends InputStream {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ThreadLocal<byte[]> oneByte = ThreadLocal.withInitial(org.apache.commons.io.c.f4585c);
    private ByteBuffer activeBuffer;
    private final Condition asyncReadComplete;
    private boolean endOfStream;
    private final ExecutorService executorService;
    private boolean isClosed;
    private boolean isReading;
    private boolean isUnderlyingInputStreamBeingClosed;
    private final AtomicBoolean isWaiting;
    private boolean readAborted;
    private ByteBuffer readAheadBuffer;
    private Throwable readException;
    private boolean readInProgress;
    private final boolean shutdownExecutorService;
    private final ReentrantLock stateChangeLock;
    private final InputStream underlyingInputStream;

    public ReadAheadInputStream(InputStream inputStream, int i5) {
        this(inputStream, i5, newExecutorService(), true);
    }

    public ReadAheadInputStream(InputStream inputStream, int i5, ExecutorService executorService) {
        this(inputStream, i5, executorService, false);
    }

    private ReadAheadInputStream(InputStream inputStream, int i5, ExecutorService executorService, boolean z4) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.stateChangeLock = reentrantLock;
        this.isWaiting = new AtomicBoolean(false);
        this.asyncReadComplete = reentrantLock.newCondition();
        if (i5 <= 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("bufferSizeInBytes should be greater than 0, but the value is ", i5));
        }
        Objects.requireNonNull(executorService, "executorService");
        this.executorService = executorService;
        Objects.requireNonNull(inputStream, "inputStream");
        this.underlyingInputStream = inputStream;
        this.shutdownExecutorService = z4;
        this.activeBuffer = ByteBuffer.allocate(i5);
        this.readAheadBuffer = ByteBuffer.allocate(i5);
        this.activeBuffer.flip();
        this.readAheadBuffer.flip();
    }

    private void checkReadException() {
        if (this.readAborted) {
            Throwable th = this.readException;
            if (!(th instanceof IOException)) {
                throw new IOException(this.readException);
            }
            throw ((IOException) th);
        }
    }

    private void closeUnderlyingInputStreamIfNecessary() {
        this.stateChangeLock.lock();
        boolean z4 = false;
        try {
            this.isReading = false;
            if (this.isClosed) {
                if (!this.isUnderlyingInputStreamBeingClosed) {
                    z4 = true;
                }
            }
            if (z4) {
                try {
                    this.underlyingInputStream.close();
                } catch (IOException unused) {
                }
            }
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    private boolean isEndOfStream() {
        return (this.activeBuffer.hasRemaining() || this.readAheadBuffer.hasRemaining() || !this.endOfStream) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readAsync$1(byte[] bArr) {
        this.stateChangeLock.lock();
        try {
            if (this.isClosed) {
                this.readInProgress = false;
                return;
            }
            this.isReading = true;
            this.stateChangeLock.unlock();
            int length = bArr.length;
            int i5 = 0;
            int i6 = 0;
            do {
                try {
                    i6 = this.underlyingInputStream.read(bArr, i5, length);
                    if (i6 > 0) {
                        i5 += i6;
                        length -= i6;
                        if (length <= 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    try {
                        if (th instanceof Error) {
                            throw th;
                        }
                        this.stateChangeLock.lock();
                        try {
                            this.readAheadBuffer.limit(i5);
                            if (i6 >= 0 && !(th instanceof EOFException)) {
                                this.readAborted = true;
                                this.readException = th;
                                this.readInProgress = false;
                                signalAsyncReadComplete();
                            }
                            this.endOfStream = true;
                            this.readInProgress = false;
                            signalAsyncReadComplete();
                        } finally {
                        }
                    } catch (Throwable th2) {
                        this.stateChangeLock.lock();
                        try {
                            this.readAheadBuffer.limit(i5);
                            if (i6 < 0 || (th instanceof EOFException)) {
                                this.endOfStream = true;
                            } else {
                                this.readAborted = true;
                                this.readException = th;
                            }
                            this.readInProgress = false;
                            signalAsyncReadComplete();
                            this.stateChangeLock.unlock();
                            closeUnderlyingInputStreamIfNecessary();
                            throw th2;
                        } finally {
                        }
                    }
                }
            } while (!this.isWaiting.get());
            this.stateChangeLock.lock();
            try {
                this.readAheadBuffer.limit(i5);
                if (i6 < 0) {
                    this.endOfStream = true;
                }
                this.readInProgress = false;
                signalAsyncReadComplete();
                this.stateChangeLock.unlock();
                closeUnderlyingInputStreamIfNecessary();
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$static$0() {
        return new byte[1];
    }

    private static ExecutorService newExecutorService() {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: org.apache.commons.io.input.f
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread newThread;
                newThread = ReadAheadInputStream.newThread(runnable);
                return newThread;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "commons-io-read-ahead");
        thread.setDaemon(true);
        return thread;
    }

    private void readAsync() {
        this.stateChangeLock.lock();
        try {
            final byte[] array = this.readAheadBuffer.array();
            if (!this.endOfStream && !this.readInProgress) {
                checkReadException();
                this.readAheadBuffer.position(0);
                this.readAheadBuffer.flip();
                this.readInProgress = true;
                this.stateChangeLock.unlock();
                this.executorService.execute(new Runnable() { // from class: org.apache.commons.io.input.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReadAheadInputStream.this.lambda$readAsync$1(array);
                    }
                });
            }
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    private void signalAsyncReadComplete() {
        this.stateChangeLock.lock();
        try {
            this.asyncReadComplete.signalAll();
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    private long skipInternal(long j5) {
        waitForAsyncReadComplete();
        if (isEndOfStream()) {
            return 0L;
        }
        if (available() >= j5) {
            int remaining = ((int) j5) - this.activeBuffer.remaining();
            this.activeBuffer.position(0);
            this.activeBuffer.flip();
            ByteBuffer byteBuffer = this.readAheadBuffer;
            byteBuffer.position(byteBuffer.position() + remaining);
            swapBuffers();
            readAsync();
            return j5;
        }
        long available = available();
        this.activeBuffer.position(0);
        this.activeBuffer.flip();
        this.readAheadBuffer.position(0);
        this.readAheadBuffer.flip();
        long skip = this.underlyingInputStream.skip(j5 - available);
        readAsync();
        return available + skip;
    }

    private void swapBuffers() {
        ByteBuffer byteBuffer = this.activeBuffer;
        this.activeBuffer = this.readAheadBuffer;
        this.readAheadBuffer = byteBuffer;
    }

    private void waitForAsyncReadComplete() {
        this.stateChangeLock.lock();
        try {
            try {
                this.isWaiting.set(true);
                while (this.readInProgress) {
                    this.asyncReadComplete.await();
                }
                this.isWaiting.set(false);
                this.stateChangeLock.unlock();
                checkReadException();
            } catch (InterruptedException e5) {
                InterruptedIOException interruptedIOException = new InterruptedIOException(e5.getMessage());
                interruptedIOException.initCause(e5);
                throw interruptedIOException;
            }
        } catch (Throwable th) {
            this.isWaiting.set(false);
            this.stateChangeLock.unlock();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        this.stateChangeLock.lock();
        try {
            return (int) Math.min(2147483647L, this.activeBuffer.remaining() + this.readAheadBuffer.remaining());
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stateChangeLock.lock();
        try {
            if (this.isClosed) {
                return;
            }
            boolean z4 = true;
            this.isClosed = true;
            if (this.isReading) {
                z4 = false;
            } else {
                this.isUnderlyingInputStreamBeingClosed = true;
            }
            this.stateChangeLock.unlock();
            if (this.shutdownExecutorService) {
                try {
                    try {
                        this.executorService.shutdownNow();
                        this.executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
                    } catch (InterruptedException e5) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException(e5.getMessage());
                        interruptedIOException.initCause(e5);
                        throw interruptedIOException;
                    }
                } finally {
                    if (z4) {
                        this.underlyingInputStream.close();
                    }
                }
            }
        } finally {
            this.stateChangeLock.unlock();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.activeBuffer.hasRemaining()) {
            return this.activeBuffer.get() & 255;
        }
        byte[] bArr = oneByte.get();
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        if (i5 < 0 || i6 < 0 || i6 > bArr.length - i5) {
            throw new IndexOutOfBoundsException();
        }
        if (i6 == 0) {
            return 0;
        }
        if (!this.activeBuffer.hasRemaining()) {
            this.stateChangeLock.lock();
            try {
                waitForAsyncReadComplete();
                if (!this.readAheadBuffer.hasRemaining()) {
                    readAsync();
                    waitForAsyncReadComplete();
                    if (isEndOfStream()) {
                        return -1;
                    }
                }
                swapBuffers();
                readAsync();
            } finally {
                this.stateChangeLock.unlock();
            }
        }
        int min = Math.min(i6, this.activeBuffer.remaining());
        this.activeBuffer.get(bArr, i5, min);
        return min;
    }

    @Override // java.io.InputStream
    public long skip(long j5) {
        if (j5 <= 0) {
            return 0L;
        }
        if (j5 <= this.activeBuffer.remaining()) {
            ByteBuffer byteBuffer = this.activeBuffer;
            byteBuffer.position(byteBuffer.position() + ((int) j5));
            return j5;
        }
        this.stateChangeLock.lock();
        try {
            return skipInternal(j5);
        } finally {
            this.stateChangeLock.unlock();
        }
    }
}
