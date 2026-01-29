package com.tencent.smtt.utils;

/* loaded from: classes17.dex */
public class ByteUtils {
    public static void Word2Byte(byte[] bArr, int i5, short s4) {
        bArr[i5] = (byte) (s4 >> 8);
        bArr[i5 + 1] = (byte) s4;
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (int i5 = 0; i5 < bArr.length; i5++) {
            if ((bArr[i5] & 255) < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Long.toString(bArr[i5] & 255, 16));
        }
        return stringBuffer.toString();
    }

    public static byte[] subByte(byte[] bArr, int i5, int i6) {
        int length = bArr.length;
        if (i5 < 0 || i5 + i6 > length) {
            return null;
        }
        if (i6 < 0) {
            i6 = bArr.length - i5;
        }
        byte[] bArr2 = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            bArr2[i7] = bArr[i7 + i5];
        }
        return bArr2;
    }
}
