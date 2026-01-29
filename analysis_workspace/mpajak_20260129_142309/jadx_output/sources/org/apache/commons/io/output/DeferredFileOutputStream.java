package org.apache.commons.io.output;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/* loaded from: classes20.dex */
public class DeferredFileOutputStream extends ThresholdingOutputStream {
    private boolean closed;
    private OutputStream currentOutputStream;
    private final File directory;
    private ByteArrayOutputStream memoryOutputStream;
    private File outputFile;
    private final String prefix;
    private final String suffix;

    public DeferredFileOutputStream(int i5, int i6, File file) {
        this(i5, file, null, null, null, i6);
        if (i6 < 0) {
            throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }

    public DeferredFileOutputStream(int i5, int i6, String str, String str2, File file) {
        this(i5, null, str, str2, file, i6);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("Initial buffer size must be atleast 0.");
        }
    }

    public DeferredFileOutputStream(int i5, File file) {
        this(i5, file, null, null, null, 1024);
    }

    private DeferredFileOutputStream(int i5, File file, String str, String str2, File file2, int i6) {
        super(i5);
        this.outputFile = file;
        this.prefix = str;
        this.suffix = str2;
        this.directory = file2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i6);
        this.memoryOutputStream = byteArrayOutputStream;
        this.currentOutputStream = byteArrayOutputStream;
    }

    public DeferredFileOutputStream(int i5, String str, String str2, File file) {
        this(i5, null, str, str2, file, 1024);
        if (str == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.closed = true;
    }

    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.memoryOutputStream;
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public File getFile() {
        return this.outputFile;
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream
    public OutputStream getStream() {
        return this.currentOutputStream;
    }

    public boolean isInMemory() {
        return !isThresholdExceeded();
    }

    @Override // org.apache.commons.io.output.ThresholdingOutputStream
    public void thresholdReached() {
        String str = this.prefix;
        if (str != null) {
            this.outputFile = File.createTempFile(str, this.suffix, this.directory);
        }
        FileUtils.forceMkdirParent(this.outputFile);
        OutputStream newOutputStream = Files.newOutputStream(this.outputFile.toPath(), new OpenOption[0]);
        try {
            this.memoryOutputStream.writeTo(newOutputStream);
            this.currentOutputStream = newOutputStream;
            this.memoryOutputStream = null;
        } catch (IOException e5) {
            newOutputStream.close();
            throw e5;
        }
    }

    public InputStream toInputStream() {
        if (this.closed) {
            return isInMemory() ? this.memoryOutputStream.toInputStream() : Files.newInputStream(this.outputFile.toPath(), new OpenOption[0]);
        }
        throw new IOException("Stream not closed");
    }

    public void writeTo(OutputStream outputStream) {
        if (!this.closed) {
            throw new IOException("Stream not closed");
        }
        if (isInMemory()) {
            this.memoryOutputStream.writeTo(outputStream);
            return;
        }
        InputStream newInputStream = Files.newInputStream(this.outputFile.toPath(), new OpenOption[0]);
        try {
            IOUtils.copy(newInputStream, outputStream);
            if (newInputStream != null) {
                newInputStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newInputStream != null) {
                    try {
                        newInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}
