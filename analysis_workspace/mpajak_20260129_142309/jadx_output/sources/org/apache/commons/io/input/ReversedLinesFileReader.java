package org.apache.commons.io.input;

import java.io.Closeable;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.StandardLineSeparator;

/* loaded from: classes12.dex */
public class ReversedLinesFileReader implements Closeable {
    private static final int DEFAULT_BLOCK_SIZE = 8192;
    private static final String EMPTY_STRING = "";
    private final int avoidNewlineSplitBufferSize;
    private final int blockSize;
    private final int byteDecrement;
    private final SeekableByteChannel channel;
    private final Charset charset;
    private FilePart currentFilePart;
    private final byte[][] newLineSequences;
    private final long totalBlockCount;
    private final long totalByteLength;
    private boolean trailingNewlineOfFileSkipped;

    /* loaded from: classes14.dex */
    public class FilePart {
        private int currentLastBytePos;
        private final byte[] data;
        private byte[] leftOver;
        private final long no;

        private FilePart(long j5, int i5, byte[] bArr) {
            this.no = j5;
            byte[] bArr2 = new byte[(bArr != null ? bArr.length : 0) + i5];
            this.data = bArr2;
            long j6 = (j5 - 1) * ReversedLinesFileReader.this.blockSize;
            if (j5 > 0) {
                ReversedLinesFileReader.this.channel.position(j6);
                if (ReversedLinesFileReader.this.channel.read(ByteBuffer.wrap(bArr2, 0, i5)) != i5) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i5, bArr.length);
            }
            this.currentLastBytePos = bArr2.length - 1;
            this.leftOver = null;
        }

        private void createLeftOver() {
            int i5 = this.currentLastBytePos + 1;
            if (i5 > 0) {
                byte[] byteArray = IOUtils.byteArray(i5);
                this.leftOver = byteArray;
                System.arraycopy(this.data, 0, byteArray, 0, i5);
            } else {
                this.leftOver = null;
            }
            this.currentLastBytePos = -1;
        }

        private int getNewLineMatchByteCount(byte[] bArr, int i5) {
            for (byte[] bArr2 : ReversedLinesFileReader.this.newLineSequences) {
                boolean z4 = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i5 + length) - (bArr2.length - 1);
                    z4 &= length2 >= 0 && bArr[length2] == bArr2[length];
                }
                if (z4) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String readLine() {
            String str;
            byte[] bArr;
            boolean z4 = this.no == 1;
            int i5 = this.currentLastBytePos;
            while (i5 > -1) {
                if (z4 || i5 >= ReversedLinesFileReader.this.avoidNewlineSplitBufferSize) {
                    int newLineMatchByteCount = getNewLineMatchByteCount(this.data, i5);
                    if (newLineMatchByteCount > 0) {
                        int i6 = i5 + 1;
                        int i7 = (this.currentLastBytePos - i6) + 1;
                        if (i7 < 0) {
                            throw new IllegalStateException(androidx.appcompat.widget.a.g("Unexpected negative line length=", i7));
                        }
                        byte[] byteArray = IOUtils.byteArray(i7);
                        System.arraycopy(this.data, i6, byteArray, 0, i7);
                        str = new String(byteArray, ReversedLinesFileReader.this.charset);
                        this.currentLastBytePos = i5 - newLineMatchByteCount;
                        if (!z4 && (bArr = this.leftOver) != null) {
                            String str2 = new String(bArr, ReversedLinesFileReader.this.charset);
                            this.leftOver = null;
                            return str2;
                        }
                    }
                    i5 -= ReversedLinesFileReader.this.byteDecrement;
                    if (i5 < 0) {
                    }
                }
                createLeftOver();
            }
            str = null;
            return !z4 ? str : str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FilePart rollOver() {
            if (this.currentLastBytePos > -1) {
                StringBuilder g5 = androidx.activity.d.g("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=");
                g5.append(this.currentLastBytePos);
                throw new IllegalStateException(g5.toString());
            }
            long j5 = this.no;
            if (j5 > 1) {
                ReversedLinesFileReader reversedLinesFileReader = ReversedLinesFileReader.this;
                return reversedLinesFileReader.new FilePart(j5 - 1, reversedLinesFileReader.blockSize, this.leftOver);
            }
            if (this.leftOver == null) {
                return null;
            }
            StringBuilder g6 = androidx.activity.d.g("Unexpected leftover of the last block: leftOverOfThisFilePart=");
            g6.append(new String(this.leftOver, ReversedLinesFileReader.this.charset));
            throw new IllegalStateException(g6.toString());
        }
    }

    @Deprecated
    public ReversedLinesFileReader(File file) {
        this(file, 8192, Charset.defaultCharset());
    }

    public ReversedLinesFileReader(File file, int i5, String str) {
        this(file.toPath(), i5, str);
    }

    public ReversedLinesFileReader(File file, int i5, Charset charset) {
        this(file.toPath(), i5, charset);
    }

    public ReversedLinesFileReader(File file, Charset charset) {
        this(file.toPath(), charset);
    }

    public ReversedLinesFileReader(Path path, int i5, String str) {
        this(path, i5, Charsets.toCharset(str));
    }

    public ReversedLinesFileReader(Path path, int i5, Charset charset) {
        int i6;
        this.blockSize = i5;
        Charset charset2 = Charsets.toCharset(charset);
        this.charset = charset2;
        if (charset2.newEncoder().maxBytesPerChar() == 1.0f || charset2 == StandardCharsets.UTF_8 || charset2 == Charset.forName("Shift_JIS") || charset2 == Charset.forName("windows-31j") || charset2 == Charset.forName("x-windows-949") || charset2 == Charset.forName("gbk") || charset2 == Charset.forName("x-windows-950")) {
            this.byteDecrement = 1;
        } else {
            if (charset2 != StandardCharsets.UTF_16BE && charset2 != StandardCharsets.UTF_16LE) {
                if (charset2 == StandardCharsets.UTF_16) {
                    throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
                }
                throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
            }
            this.byteDecrement = 2;
        }
        byte[][] bArr = {StandardLineSeparator.CRLF.getBytes(charset2), StandardLineSeparator.LF.getBytes(charset2), StandardLineSeparator.CR.getBytes(charset2)};
        this.newLineSequences = bArr;
        this.avoidNewlineSplitBufferSize = bArr[0].length;
        SeekableByteChannel newByteChannel = Files.newByteChannel(path, StandardOpenOption.READ);
        this.channel = newByteChannel;
        long size = newByteChannel.size();
        this.totalByteLength = size;
        long j5 = i5;
        int i7 = (int) (size % j5);
        if (i7 > 0) {
            this.totalBlockCount = (size / j5) + 1;
        } else {
            this.totalBlockCount = size / j5;
            if (size > 0) {
                i6 = i5;
                this.currentFilePart = new FilePart(this.totalBlockCount, i6, null);
            }
        }
        i6 = i7;
        this.currentFilePart = new FilePart(this.totalBlockCount, i6, null);
    }

    public ReversedLinesFileReader(Path path, Charset charset) {
        this(path, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.channel.close();
    }

    public String readLine() {
        String readLine = this.currentFilePart.readLine();
        while (readLine == null) {
            FilePart rollOver = this.currentFilePart.rollOver();
            this.currentFilePart = rollOver;
            if (rollOver == null) {
                break;
            }
            readLine = rollOver.readLine();
        }
        if (!"".equals(readLine) || this.trailingNewlineOfFileSkipped) {
            return readLine;
        }
        this.trailingNewlineOfFileSkipped = true;
        return readLine();
    }

    public List<String> readLines(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("lineCount < 0");
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            String readLine = readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
        return arrayList;
    }

    public String toString(int i5) {
        List<String> readLines = readLines(i5);
        Collections.reverse(readLines);
        if (readLines.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String lineSeparator = System.lineSeparator();
        Objects.requireNonNull(lineSeparator, "delimiter");
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = readLines.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) lineSeparator);
            }
        }
        sb.append(sb2.toString());
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
