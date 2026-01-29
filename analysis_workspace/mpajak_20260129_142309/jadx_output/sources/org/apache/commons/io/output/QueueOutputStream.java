package org.apache.commons.io.output;

import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.io.input.QueueInputStream;

/* loaded from: classes20.dex */
public class QueueOutputStream extends OutputStream {
    private final BlockingQueue<Integer> blockingQueue;

    public QueueOutputStream() {
        this(new LinkedBlockingQueue());
    }

    public QueueOutputStream(BlockingQueue<Integer> blockingQueue) {
        Objects.requireNonNull(blockingQueue, "blockingQueue");
        this.blockingQueue = blockingQueue;
    }

    public QueueInputStream newQueueInputStream() {
        return new QueueInputStream(this.blockingQueue);
    }

    @Override // java.io.OutputStream
    public void write(int i5) {
        try {
            this.blockingQueue.put(Integer.valueOf(i5 & 255));
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e5);
            throw interruptedIOException;
        }
    }
}
