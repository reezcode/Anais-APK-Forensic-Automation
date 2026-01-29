package org.apache.commons.io;

import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class HexDump {
    public static final String EOL = System.getProperty("line.separator");
    private static final char[] _hexcodes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final int[] _shifts = {28, 24, 20, 16, 12, 8, 4, 0};

    private static StringBuilder dump(StringBuilder sb, byte b5) {
        for (int i5 = 0; i5 < 2; i5++) {
            sb.append(_hexcodes[(b5 >> _shifts[i5 + 6]) & 15]);
        }
        return sb;
    }

    private static StringBuilder dump(StringBuilder sb, long j5) {
        for (int i5 = 0; i5 < 8; i5++) {
            sb.append(_hexcodes[((int) (j5 >> _shifts[i5])) & 15]);
        }
        return sb;
    }

    public static void dump(byte[] bArr, long j5, OutputStream outputStream, int i5) {
        if (i5 < 0 || i5 >= bArr.length) {
            StringBuilder e5 = androidx.appcompat.graphics.drawable.a.e("illegal index: ", i5, " into array of length ");
            e5.append(bArr.length);
            throw new ArrayIndexOutOfBoundsException(e5.toString());
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("cannot write to nullstream");
        }
        long j6 = j5 + i5;
        StringBuilder sb = new StringBuilder(74);
        while (i5 < bArr.length) {
            int length = bArr.length - i5;
            if (length > 16) {
                length = 16;
            }
            dump(sb, j6).append(' ');
            for (int i6 = 0; i6 < 16; i6++) {
                if (i6 < length) {
                    dump(sb, bArr[i6 + i5]);
                } else {
                    sb.append("  ");
                }
                sb.append(' ');
            }
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = i7 + i5;
                sb.append((bArr[i8] < 32 || bArr[i8] >= Byte.MAX_VALUE) ? FilenameUtils.EXTENSION_SEPARATOR : (char) bArr[i8]);
            }
            sb.append(EOL);
            outputStream.write(sb.toString().getBytes(Charset.defaultCharset()));
            outputStream.flush();
            sb.setLength(0);
            j6 += length;
            i5 += 16;
        }
    }
}
