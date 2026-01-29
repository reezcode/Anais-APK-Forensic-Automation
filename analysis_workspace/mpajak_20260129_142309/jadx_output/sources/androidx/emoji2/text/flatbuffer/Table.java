package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class Table {
    public ByteBuffer bb;
    public int bb_pos;
    public Utf8 utf8 = Utf8.getDefault();
    private int vtable_size;
    private int vtable_start;

    public static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i5 = 0; i5 < 4; i5++) {
            if (str.charAt(i5) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i5))) {
                return false;
            }
        }
        return true;
    }

    public static int __indirect(int i5, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i5) + i5;
    }

    public static int __offset(int i5, int i6, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i6;
        return byteBuffer.getShort((i5 + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    public static String __string(int i5, ByteBuffer byteBuffer, Utf8 utf8) {
        int i6 = byteBuffer.getInt(i5) + i5;
        return utf8.decodeUtf8(byteBuffer, i6 + 4, byteBuffer.getInt(i6));
    }

    public static Table __union(Table table, int i5, ByteBuffer byteBuffer) {
        table.__reset(__indirect(i5, byteBuffer), byteBuffer);
        return table;
    }

    public static int compareStrings(int i5, int i6, ByteBuffer byteBuffer) {
        int i7 = byteBuffer.getInt(i5) + i5;
        int i8 = byteBuffer.getInt(i6) + i6;
        int i9 = byteBuffer.getInt(i7);
        int i10 = byteBuffer.getInt(i8);
        int i11 = i7 + 4;
        int i12 = i8 + 4;
        int min = Math.min(i9, i10);
        for (int i13 = 0; i13 < min; i13++) {
            int i14 = i13 + i11;
            int i15 = i13 + i12;
            if (byteBuffer.get(i14) != byteBuffer.get(i15)) {
                return byteBuffer.get(i14) - byteBuffer.get(i15);
            }
        }
        return i9 - i10;
    }

    public static int compareStrings(int i5, byte[] bArr, ByteBuffer byteBuffer) {
        int i6 = byteBuffer.getInt(i5) + i5;
        int i7 = byteBuffer.getInt(i6);
        int length = bArr.length;
        int i8 = i6 + 4;
        int min = Math.min(i7, length);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = i9 + i8;
            if (byteBuffer.get(i10) != bArr[i9]) {
                return byteBuffer.get(i10) - bArr[i9];
            }
        }
        return i7 - length;
    }

    public int __indirect(int i5) {
        return this.bb.getInt(i5) + i5;
    }

    public int __offset(int i5) {
        if (i5 < this.vtable_size) {
            return this.bb.getShort(this.vtable_start + i5);
        }
        return 0;
    }

    public void __reset() {
        __reset(0, null);
    }

    public void __reset(int i5, ByteBuffer byteBuffer) {
        short s4;
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i5;
            int i6 = i5 - byteBuffer.getInt(i5);
            this.vtable_start = i6;
            s4 = this.bb.getShort(i6);
        } else {
            s4 = 0;
            this.bb_pos = 0;
            this.vtable_start = 0;
        }
        this.vtable_size = s4;
    }

    public String __string(int i5) {
        return __string(i5, this.bb, this.utf8);
    }

    public Table __union(Table table, int i5) {
        return __union(table, i5, this.bb);
    }

    public int __vector(int i5) {
        int i6 = i5 + this.bb_pos;
        return this.bb.getInt(i6) + i6 + 4;
    }

    public ByteBuffer __vector_as_bytebuffer(int i5, int i6) {
        int __offset = __offset(i5);
        if (__offset == 0) {
            return null;
        }
        ByteBuffer order = this.bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int __vector = __vector(__offset);
        order.position(__vector);
        order.limit((__vector_len(__offset) * i6) + __vector);
        return order;
    }

    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i5, int i6) {
        int __offset = __offset(i5);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(__offset) * i6) + __vector);
        byteBuffer.position(__vector);
        return byteBuffer;
    }

    public int __vector_len(int i5) {
        int i6 = i5 + this.bb_pos;
        return this.bb.getInt(this.bb.getInt(i6) + i6);
    }

    public ByteBuffer getByteBuffer() {
        return this.bb;
    }

    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    public void sortTables(int[] iArr, final ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            numArr[i5] = Integer.valueOf(iArr[i5]);
        }
        Arrays.sort(numArr, new Comparator<Integer>() { // from class: androidx.emoji2.text.flatbuffer.Table.1
            @Override // java.util.Comparator
            public int compare(Integer num, Integer num2) {
                return Table.this.keysCompare(num, num2, byteBuffer);
            }
        });
        for (int i6 = 0; i6 < iArr.length; i6++) {
            iArr[i6] = numArr[i6].intValue();
        }
    }
}
