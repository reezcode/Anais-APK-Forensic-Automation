package marmojkfnf.dphnidckqxhm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes6.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4287a = $d2j$hex$71661c95$decode_I("ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff3e000000ffffffffffffffffffffffff3f0000003400000035000000360000003700000038000000390000003a0000003b0000003c0000003d000000fffffffffffffffffffffffffeffffffffffffffffffffffffffffff000000000100000002000000030000000400000005000000060000000700000008000000090000000a0000000b0000000c0000000d0000000e0000000f00000010000000110000001200000013000000140000001500000016000000170000001800000019000000ffffffffffffffffffffffffffffffffffffffffffffffff1a0000001b0000001c0000001d0000001e0000001f000000200000002100000022000000230000002400000025000000260000002700000028000000290000002a0000002b0000002c0000002d0000002e0000002f00000030000000310000003200000033000000ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4288b = $d2j$hex$71661c95$decode_I("ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff3e000000ffffffffffffffff3400000035000000360000003700000038000000390000003a0000003b0000003c0000003d000000fffffffffffffffffffffffffeffffffffffffffffffffffffffffff000000000100000002000000030000000400000005000000060000000700000008000000090000000a0000000b0000000c0000000d0000000e0000000f00000010000000110000001200000013000000140000001500000016000000170000001800000019000000ffffffffffffffffffffffffffffffff3f000000ffffffff1a0000001b0000001c0000001d0000001e0000001f000000200000002100000022000000230000002400000025000000260000002700000028000000290000002a0000002b0000002c0000002d0000002e0000002f00000030000000310000003200000033000000ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");

    private static byte[] $d2j$hex$71661c95$decode_B(String str) {
        int i5;
        int i6;
        int i7;
        int i8;
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 * 2;
            char c5 = charArray[i10];
            char c6 = charArray[i10 + 1];
            if (c5 < '0' || c5 > '9') {
                if (c5 >= 'a' && c5 <= 'f') {
                    i5 = c5 - 'a';
                } else {
                    if (c5 < 'A' || c5 > 'F') {
                        throw new RuntimeException();
                    }
                    i5 = c5 - 'A';
                }
                i6 = i5 + 10;
            } else {
                i6 = c5 - '0';
            }
            if (c6 < '0' || c6 > '9') {
                if (c6 >= 'a' && c6 <= 'f') {
                    i7 = c6 - 'a';
                } else {
                    if (c6 < 'A' || c6 > 'F') {
                        throw new RuntimeException();
                    }
                    i7 = c6 - 'A';
                }
                i8 = i7 + 10;
            } else {
                i8 = c6 - '0';
            }
            bArr[i9] = (byte) (i8 | (i6 << 4));
        }
        return bArr;
    }

    private static int[] $d2j$hex$71661c95$decode_I(String str) {
        byte[] $d2j$hex$71661c95$decode_B = $d2j$hex$71661c95$decode_B(str);
        ByteBuffer wrap = ByteBuffer.wrap($d2j$hex$71661c95$decode_B);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer asIntBuffer = wrap.asIntBuffer();
        int[] iArr = new int[$d2j$hex$71661c95$decode_B.length / 4];
        asIntBuffer.get(iArr);
        return iArr;
    }

    private static long[] $d2j$hex$71661c95$decode_J(String str) {
        byte[] $d2j$hex$71661c95$decode_B = $d2j$hex$71661c95$decode_B(str);
        ByteBuffer wrap = ByteBuffer.wrap($d2j$hex$71661c95$decode_B);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer asLongBuffer = wrap.asLongBuffer();
        long[] jArr = new long[$d2j$hex$71661c95$decode_B.length / 8];
        asLongBuffer.get(jArr);
        return jArr;
    }

    private static short[] $d2j$hex$71661c95$decode_S(String str) {
        byte[] $d2j$hex$71661c95$decode_B = $d2j$hex$71661c95$decode_B(str);
        ByteBuffer wrap = ByteBuffer.wrap($d2j$hex$71661c95$decode_B);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer asShortBuffer = wrap.asShortBuffer();
        short[] sArr = new short[$d2j$hex$71661c95$decode_B.length / 2];
        asShortBuffer.get(sArr);
        return sArr;
    }
}
