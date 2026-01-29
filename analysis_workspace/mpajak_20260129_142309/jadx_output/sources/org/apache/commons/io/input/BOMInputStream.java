package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.IOUtils;

/* loaded from: classes11.dex */
public class BOMInputStream extends ProxyInputStream {
    private static final Comparator<ByteOrderMark> ByteOrderMarkLengthComparator = new Comparator() { // from class: org.apache.commons.io.input.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int lambda$static$0;
            lambda$static$0 = BOMInputStream.lambda$static$0((ByteOrderMark) obj, (ByteOrderMark) obj2);
            return lambda$static$0;
        }
    };
    private final List<ByteOrderMark> boms;
    private ByteOrderMark byteOrderMark;
    private int fbIndex;
    private int fbLength;
    private int[] firstBytes;
    private final boolean include;
    private int markFbIndex;
    private boolean markedAtStart;

    public BOMInputStream(InputStream inputStream) {
        this(inputStream, false, ByteOrderMark.UTF_8);
    }

    public BOMInputStream(InputStream inputStream, boolean z4) {
        this(inputStream, z4, ByteOrderMark.UTF_8);
    }

    public BOMInputStream(InputStream inputStream, boolean z4, ByteOrderMark... byteOrderMarkArr) {
        super(inputStream);
        if (IOUtils.length(byteOrderMarkArr) == 0) {
            throw new IllegalArgumentException("No BOMs specified");
        }
        this.include = z4;
        List<ByteOrderMark> asList = Arrays.asList(byteOrderMarkArr);
        asList.sort(ByteOrderMarkLengthComparator);
        this.boms = asList;
    }

    public BOMInputStream(InputStream inputStream, ByteOrderMark... byteOrderMarkArr) {
        this(inputStream, false, byteOrderMarkArr);
    }

    private ByteOrderMark find() {
        for (ByteOrderMark byteOrderMark : this.boms) {
            if (matches(byteOrderMark)) {
                return byteOrderMark;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(ByteOrderMark byteOrderMark, ByteOrderMark byteOrderMark2) {
        return Integer.compare(byteOrderMark2.length(), byteOrderMark.length());
    }

    private boolean matches(ByteOrderMark byteOrderMark) {
        for (int i5 = 0; i5 < byteOrderMark.length(); i5++) {
            if (byteOrderMark.get(i5) != this.firstBytes[i5]) {
                return false;
            }
        }
        return true;
    }

    private int readFirstBytes() {
        getBOM();
        int i5 = this.fbIndex;
        if (i5 >= this.fbLength) {
            return -1;
        }
        int[] iArr = this.firstBytes;
        this.fbIndex = i5 + 1;
        return iArr[i5];
    }

    public ByteOrderMark getBOM() {
        if (this.firstBytes == null) {
            this.fbLength = 0;
            this.firstBytes = new int[this.boms.get(0).length()];
            int i5 = 0;
            while (true) {
                int[] iArr = this.firstBytes;
                if (i5 >= iArr.length) {
                    break;
                }
                iArr[i5] = ((FilterInputStream) this).in.read();
                this.fbLength++;
                if (this.firstBytes[i5] < 0) {
                    break;
                }
                i5++;
            }
            ByteOrderMark find = find();
            this.byteOrderMark = find;
            if (find != null && !this.include) {
                if (find.length() < this.firstBytes.length) {
                    this.fbIndex = this.byteOrderMark.length();
                } else {
                    this.fbLength = 0;
                }
            }
        }
        return this.byteOrderMark;
    }

    public String getBOMCharsetName() {
        getBOM();
        ByteOrderMark byteOrderMark = this.byteOrderMark;
        if (byteOrderMark == null) {
            return null;
        }
        return byteOrderMark.getCharsetName();
    }

    public boolean hasBOM() {
        return getBOM() != null;
    }

    public boolean hasBOM(ByteOrderMark byteOrderMark) {
        if (this.boms.contains(byteOrderMark)) {
            getBOM();
            ByteOrderMark byteOrderMark2 = this.byteOrderMark;
            return byteOrderMark2 != null && byteOrderMark2.equals(byteOrderMark);
        }
        throw new IllegalArgumentException("Stream not configure to detect " + byteOrderMark);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i5) {
        this.markFbIndex = this.fbIndex;
        this.markedAtStart = this.firstBytes == null;
        ((FilterInputStream) this).in.mark(i5);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int readFirstBytes = readFirstBytes();
        return readFirstBytes >= 0 ? readFirstBytes : ((FilterInputStream) this).in.read();
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        int i7 = 0;
        int i8 = 0;
        while (i6 > 0 && i7 >= 0) {
            i7 = readFirstBytes();
            if (i7 >= 0) {
                bArr[i5] = (byte) (i7 & 255);
                i6--;
                i8++;
                i5++;
            }
        }
        int read = ((FilterInputStream) this).in.read(bArr, i5, i6);
        if (read >= 0) {
            return i8 + read;
        }
        if (i8 > 0) {
            return i8;
        }
        return -1;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        this.fbIndex = this.markFbIndex;
        if (this.markedAtStart) {
            this.firstBytes = null;
        }
        ((FilterInputStream) this).in.reset();
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j5) {
        long j6;
        int i5 = 0;
        while (true) {
            j6 = i5;
            if (j5 <= j6 || readFirstBytes() < 0) {
                break;
            }
            i5++;
        }
        return ((FilterInputStream) this).in.skip(j5 - j6) + j6;
    }
}
