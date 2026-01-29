package androidx.emoji2.text.flatbuffer;

import androidx.activity.d;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    /* loaded from: classes19.dex */
    public static class DecodeUtil {
        public static void handleFourBytes(byte b5, byte b6, byte b7, byte b8, char[] cArr, int i5) {
            if (!isNotTrailingByte(b6)) {
                if ((((b6 + 112) + (b5 << 28)) >> 30) == 0 && !isNotTrailingByte(b7) && !isNotTrailingByte(b8)) {
                    int trailingByteValue = ((b5 & 7) << 18) | (trailingByteValue(b6) << 12) | (trailingByteValue(b7) << 6) | trailingByteValue(b8);
                    cArr[i5] = highSurrogate(trailingByteValue);
                    cArr[i5 + 1] = lowSurrogate(trailingByteValue);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        public static void handleOneByte(byte b5, char[] cArr, int i5) {
            cArr[i5] = (char) b5;
        }

        public static void handleThreeBytes(byte b5, byte b6, byte b7, char[] cArr, int i5) {
            if (isNotTrailingByte(b6) || ((b5 == -32 && b6 < -96) || ((b5 == -19 && b6 >= -96) || isNotTrailingByte(b7)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i5] = (char) (((b5 & 15) << 12) | (trailingByteValue(b6) << 6) | trailingByteValue(b7));
        }

        public static void handleTwoBytes(byte b5, byte b6, char[] cArr, int i5) {
            if (b5 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b6)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i5] = (char) (((b5 & 31) << 6) | trailingByteValue(b6));
        }

        private static char highSurrogate(int i5) {
            return (char) ((i5 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b5) {
            return b5 > -65;
        }

        public static boolean isOneByte(byte b5) {
            return b5 >= 0;
        }

        public static boolean isThreeBytes(byte b5) {
            return b5 < -16;
        }

        public static boolean isTwoBytes(byte b5) {
            return b5 < -32;
        }

        private static char lowSurrogate(int i5) {
            return (char) ((i5 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b5) {
            return b5 & 63;
        }
    }

    /* loaded from: classes12.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i5, int i6) {
            super(d.d("Unpaired surrogate at index ", i5, " of ", i6));
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i5, int i6);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
