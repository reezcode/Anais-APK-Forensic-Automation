package org.apache.commons.io.output;

import i4.b;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.output.ProxyOutputStream;

/* loaded from: classes20.dex */
public class ProxyOutputStream extends FilterOutputStream {
    public ProxyOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public void afterWrite(int i5) {
    }

    public void beforeWrite(int i5) {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.close(((FilterOutputStream) this).out, new IOConsumer() { // from class: j4.a
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) {
                ProxyOutputStream.this.handleIOException((IOException) obj);
            }

            @Override // org.apache.commons.io.function.IOConsumer
            public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return b.a(this, iOConsumer);
            }
        });
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    public void handleIOException(IOException iOException) {
        throw iOException;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i5) {
        try {
            beforeWrite(1);
            ((FilterOutputStream) this).out.write(i5);
            afterWrite(1);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            int length = IOUtils.length(bArr);
            beforeWrite(length);
            ((FilterOutputStream) this).out.write(bArr);
            afterWrite(length);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) {
        try {
            beforeWrite(i6);
            ((FilterOutputStream) this).out.write(bArr, i5, i6);
            afterWrite(i6);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }
}
