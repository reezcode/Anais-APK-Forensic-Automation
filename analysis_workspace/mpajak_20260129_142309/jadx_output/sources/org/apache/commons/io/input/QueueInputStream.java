package org.apache.commons.io.input;

import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.io.output.QueueOutputStream;

/* loaded from: classes21.dex */
public class QueueInputStream extends InputStream {
    private final BlockingQueue<Integer> blockingQueue;

    public QueueInputStream() {
        this(new LinkedBlockingQueue());
    }

    public QueueInputStream(BlockingQueue<Integer> blockingQueue) {
        Objects.requireNonNull(blockingQueue, "blockingQueue");
        this.blockingQueue = blockingQueue;
    }

    public QueueOutputStream newQueueOutputStream() {
        return new QueueOutputStream(this.blockingQueue);
    }

    @Override // java.io.InputStream
    public int read() {
        Integer poll = this.blockingQueue.poll();
        if (poll == null) {
            return -1;
        }
        return poll.intValue() & 255;
    }
}
