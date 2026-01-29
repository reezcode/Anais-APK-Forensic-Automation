package org.apache.commons.io.output;

import androidx.work.impl.model.a;
import i4.b;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;

/* loaded from: classes9.dex */
public class ThresholdingOutputStream extends OutputStream {
    private static final IOFunction<ThresholdingOutputStream, OutputStream> NOOP_OS_GETTER = a.f304c;
    private final IOFunction<ThresholdingOutputStream, OutputStream> outputStreamGetter;
    private final int threshold;
    private final IOConsumer<ThresholdingOutputStream> thresholdConsumer;
    private boolean thresholdExceeded;
    private long written;

    public ThresholdingOutputStream(int i5) {
        this(i5, b.d(), NOOP_OS_GETTER);
    }

    public ThresholdingOutputStream(int i5, IOConsumer<ThresholdingOutputStream> iOConsumer, IOFunction<ThresholdingOutputStream, OutputStream> iOFunction) {
        this.threshold = i5;
        this.thresholdConsumer = iOConsumer == null ? b.d() : iOConsumer;
        this.outputStreamGetter = iOFunction == null ? NOOP_OS_GETTER : iOFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OutputStream lambda$static$0(ThresholdingOutputStream thresholdingOutputStream) {
        return NullOutputStream.NULL_OUTPUT_STREAM;
    }

    public void checkThreshold(int i5) {
        if (this.thresholdExceeded || this.written + i5 <= this.threshold) {
            return;
        }
        this.thresholdExceeded = true;
        thresholdReached();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
        getStream().close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        getStream().flush();
    }

    public long getByteCount() {
        return this.written;
    }

    public OutputStream getStream() {
        return this.outputStreamGetter.apply(this);
    }

    public int getThreshold() {
        return this.threshold;
    }

    public boolean isThresholdExceeded() {
        return this.written > ((long) this.threshold);
    }

    public void resetByteCount() {
        this.thresholdExceeded = false;
        this.written = 0L;
    }

    public void setByteCount(long j5) {
        this.written = j5;
    }

    public void thresholdReached() {
        this.thresholdConsumer.accept(this);
    }

    @Override // java.io.OutputStream
    public void write(int i5) {
        checkThreshold(1);
        getStream().write(i5);
        this.written++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        checkThreshold(bArr.length);
        getStream().write(bArr);
        this.written += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) {
        checkThreshold(i6);
        getStream().write(bArr, i5, i6);
        this.written += i6;
    }
}
