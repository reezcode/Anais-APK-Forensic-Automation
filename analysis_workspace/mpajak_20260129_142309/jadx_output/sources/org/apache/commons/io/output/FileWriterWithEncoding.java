package org.apache.commons.io.output;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/* loaded from: classes21.dex */
public class FileWriterWithEncoding extends Writer {
    private final Writer out;

    public FileWriterWithEncoding(File file, String str) {
        this(file, str, false);
    }

    public FileWriterWithEncoding(File file, String str, boolean z4) {
        this.out = initWriter(file, str, z4);
    }

    public FileWriterWithEncoding(File file, Charset charset) {
        this(file, charset, false);
    }

    public FileWriterWithEncoding(File file, Charset charset, boolean z4) {
        this.out = initWriter(file, charset, z4);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) {
        this(file, charsetEncoder, false);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z4) {
        this.out = initWriter(file, charsetEncoder, z4);
    }

    public FileWriterWithEncoding(String str, String str2) {
        this(new File(str), str2, false);
    }

    public FileWriterWithEncoding(String str, String str2, boolean z4) {
        this(new File(str), str2, z4);
    }

    public FileWriterWithEncoding(String str, Charset charset) {
        this(new File(str), charset, false);
    }

    public FileWriterWithEncoding(String str, Charset charset, boolean z4) {
        this(new File(str), charset, z4);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) {
        this(new File(str), charsetEncoder, false);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z4) {
        this(new File(str), charsetEncoder, z4);
    }

    private static Writer initWriter(File file, Object obj, boolean z4) {
        Objects.requireNonNull(file, "file");
        Objects.requireNonNull(obj, "encoding");
        boolean exists = file.exists();
        try {
            Path path = file.toPath();
            OpenOption[] openOptionArr = new OpenOption[1];
            openOptionArr[0] = z4 ? StandardOpenOption.APPEND : StandardOpenOption.CREATE;
            OutputStream newOutputStream = Files.newOutputStream(path, openOptionArr);
            return obj instanceof Charset ? new OutputStreamWriter(newOutputStream, (Charset) obj) : obj instanceof CharsetEncoder ? new OutputStreamWriter(newOutputStream, (CharsetEncoder) obj) : new OutputStreamWriter(newOutputStream, (String) obj);
        } catch (IOException | RuntimeException e5) {
            try {
                IOUtils.close((Closeable) null);
            } catch (IOException e6) {
                e5.addSuppressed(e6);
            }
            if (exists) {
                throw e5;
            }
            FileUtils.deleteQuietly(file);
            throw e5;
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // java.io.Writer
    public void write(int i5) {
        this.out.write(i5);
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.out.write(str);
    }

    @Override // java.io.Writer
    public void write(String str, int i5, int i6) {
        this.out.write(str, i5, i6);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.out.write(cArr);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        this.out.write(cArr, i5, i6);
    }
}
