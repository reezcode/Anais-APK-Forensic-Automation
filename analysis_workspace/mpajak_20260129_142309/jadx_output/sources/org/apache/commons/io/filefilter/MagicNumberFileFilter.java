package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import org.apache.commons.io.IOUtils;

/* loaded from: classes21.dex */
public class MagicNumberFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    private final long byteOffset;
    private final byte[] magicNumbers;

    public MagicNumberFileFilter(String str) {
        this(str, 0L);
    }

    public MagicNumberFileFilter(String str, long j5) {
        if (str == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (j5 < 0) {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        this.magicNumbers = str.getBytes(Charset.defaultCharset());
        this.byteOffset = j5;
    }

    public MagicNumberFileFilter(byte[] bArr) {
        this(bArr, 0L);
    }

    public MagicNumberFileFilter(byte[] bArr, long j5) {
        if (bArr == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (j5 < 0) {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        byte[] byteArray = IOUtils.byteArray(bArr.length);
        this.magicNumbers = byteArray;
        System.arraycopy(bArr, 0, byteArray, 0, bArr.length);
        this.byteOffset = j5;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        if (path != null && Files.isRegularFile(path, new LinkOption[0]) && Files.isReadable(path)) {
            try {
                FileChannel open = FileChannel.open(path, new OpenOption[0]);
                try {
                    ByteBuffer allocate = ByteBuffer.allocate(this.magicNumbers.length);
                    int read = open.read(allocate);
                    byte[] bArr = this.magicNumbers;
                    if (read != bArr.length) {
                        FileVisitResult fileVisitResult = FileVisitResult.TERMINATE;
                        open.close();
                        return fileVisitResult;
                    }
                    FileVisitResult fileVisitResult2 = AbstractFileFilter.toFileVisitResult(Arrays.equals(bArr, allocate.array()), path);
                    open.close();
                    return fileVisitResult2;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return FileVisitResult.TERMINATE;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        if (file != null && file.isFile() && file.canRead()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    byte[] byteArray = IOUtils.byteArray(this.magicNumbers.length);
                    randomAccessFile.seek(this.byteOffset);
                    int read = randomAccessFile.read(byteArray);
                    byte[] bArr = this.magicNumbers;
                    if (read != bArr.length) {
                        randomAccessFile.close();
                        return false;
                    }
                    boolean equals = Arrays.equals(bArr, byteArray);
                    randomAccessFile.close();
                    return equals;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        return super.toString() + "(" + new String(this.magicNumbers, Charset.defaultCharset()) + "," + this.byteOffset + ")";
    }
}
