package org.apache.commons.io.output;

import androidx.activity.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;

/* loaded from: classes25.dex */
public class LockableFileWriter extends Writer {
    private static final String LCK = ".lck";
    private final File lockFile;
    private final Writer out;

    public LockableFileWriter(File file) {
        this(file, false, (String) null);
    }

    public LockableFileWriter(File file, String str) {
        this(file, str, false, (String) null);
    }

    public LockableFileWriter(File file, String str, boolean z4, String str2) {
        this(file, Charsets.toCharset(str), z4, str2);
    }

    public LockableFileWriter(File file, Charset charset) {
        this(file, charset, false, (String) null);
    }

    public LockableFileWriter(File file, Charset charset, boolean z4, String str) {
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.getParentFile() != null) {
            FileUtils.forceMkdir(absoluteFile.getParentFile());
        }
        if (absoluteFile.isDirectory()) {
            throw new IOException("File specified is a directory");
        }
        File file2 = new File(str == null ? System.getProperty("java.io.tmpdir") : str);
        FileUtils.forceMkdir(file2);
        testLockDir(file2);
        this.lockFile = new File(file2, absoluteFile.getName() + LCK);
        createLock();
        this.out = initWriter(absoluteFile, charset, z4);
    }

    public LockableFileWriter(File file, boolean z4) {
        this(file, z4, (String) null);
    }

    @Deprecated
    public LockableFileWriter(File file, boolean z4, String str) {
        this(file, Charset.defaultCharset(), z4, str);
    }

    public LockableFileWriter(String str) {
        this(str, false, (String) null);
    }

    public LockableFileWriter(String str, boolean z4) {
        this(str, z4, (String) null);
    }

    public LockableFileWriter(String str, boolean z4, String str2) {
        this(new File(str), z4, str2);
    }

    private void createLock() {
        synchronized (LockableFileWriter.class) {
            if (!this.lockFile.createNewFile()) {
                throw new IOException("Can't write file, lock " + this.lockFile.getAbsolutePath() + " exists");
            }
            this.lockFile.deleteOnExit();
        }
    }

    private Writer initWriter(File file, Charset charset, boolean z4) {
        boolean exists = file.exists();
        try {
            return new OutputStreamWriter(new FileOutputStream(file.getAbsolutePath(), z4), Charsets.toCharset(charset));
        } catch (IOException | RuntimeException e5) {
            FileUtils.deleteQuietly(this.lockFile);
            if (!exists) {
                FileUtils.deleteQuietly(file);
            }
            throw e5;
        }
    }

    private void testLockDir(File file) {
        if (!file.exists()) {
            StringBuilder g5 = d.g("Could not find lockDir: ");
            g5.append(file.getAbsolutePath());
            throw new IOException(g5.toString());
        }
        if (file.canWrite()) {
            return;
        }
        StringBuilder g6 = d.g("Could not write to lockDir: ");
        g6.append(file.getAbsolutePath());
        throw new IOException(g6.toString());
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.out.close();
        } finally {
            FileUtils.delete(this.lockFile);
        }
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
