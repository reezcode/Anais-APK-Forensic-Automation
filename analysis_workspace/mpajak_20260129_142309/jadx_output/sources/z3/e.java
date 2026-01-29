package z3;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f6204d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f6205e = new e();

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final f4.i f6201a = f4.i.f2861f.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f6202b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f6203c = new String[64];

    static {
        String replace$default;
        String[] strArr = new String[256];
        for (int i5 = 0; i5 < 256; i5++) {
            String binaryString = Integer.toBinaryString(i5);
            Intrinsics.checkNotNullExpressionValue(binaryString, "Integer.toBinaryString(it)");
            replace$default = StringsKt__StringsJVMKt.replace$default(t3.c.j("%8s", binaryString), ' ', '0', false, 4, (Object) null);
            strArr[i5] = replace$default;
        }
        f6204d = strArr;
        String[] strArr2 = f6203c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i6 = 0; i6 < 1; i6++) {
            int i7 = iArr[i6];
            String[] strArr3 = f6203c;
            strArr3[i7 | 8] = Intrinsics.stringPlus(strArr3[i7], "|PADDED");
        }
        String[] strArr4 = f6203c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = iArr2[i8];
            for (int i10 = 0; i10 < 1; i10++) {
                int i11 = iArr[i10];
                String[] strArr5 = f6203c;
                int i12 = i11 | i9;
                strArr5[i12] = strArr5[i11] + "|" + strArr5[i9];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i11]);
                sb.append("|");
                strArr5[i12 | 8] = androidx.appcompat.graphics.drawable.a.c(sb, strArr5[i9], "|PADDED");
            }
        }
        int length = f6203c.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr6 = f6203c;
            if (strArr6[i13] == null) {
                strArr6[i13] = f6204d[i13];
            }
        }
    }

    public final String a(int i5) {
        String[] strArr = f6202b;
        return i5 < strArr.length ? strArr[i5] : t3.c.j("0x%02x", Integer.valueOf(i5));
    }

    public final String b(boolean z4, int i5, int i6, int i7, int i8) {
        String str;
        String str2;
        String str3;
        String str4;
        String a5 = a(i7);
        if (i8 == 0) {
            str = "";
        } else {
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4 || i7 == 6) {
                    str = i8 == 1 ? "ACK" : f6204d[i8];
                } else if (i7 != 7 && i7 != 8) {
                    String[] strArr = f6203c;
                    if (i8 < strArr.length) {
                        str2 = strArr[i8];
                        Intrinsics.checkNotNull(str2);
                    } else {
                        str2 = f6204d[i8];
                    }
                    if (i7 == 5 && (i8 & 4) != 0) {
                        str3 = "HEADERS";
                        str4 = "PUSH_PROMISE";
                    } else if (i7 != 0 || (i8 & 32) == 0) {
                        str = str2;
                    } else {
                        str3 = "PRIORITY";
                        str4 = "COMPRESSED";
                    }
                    str = StringsKt__StringsJVMKt.replace$default(str2, str3, str4, false, 4, (Object) null);
                }
            }
            str = f6204d[i8];
        }
        return t3.c.j("%s 0x%08x %5d %-13s %s", z4 ? "<<" : ">>", Integer.valueOf(i5), Integer.valueOf(i6), a5, str);
    }
}
