package m2;

import androidx.activity.d;
import java.util.TimeZone;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f4154a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i5, char c5) {
        return i5 < str.length() && str.charAt(i5) == c5;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:38:0x009c, B:40:0x00a2, B:44:0x00af, B:47:0x00b6, B:52:0x00db, B:54:0x00e1, B:56:0x00e8, B:57:0x0197, B:63:0x00f4, B:64:0x010f, B:65:0x0110, B:68:0x012c, B:70:0x0139, B:73:0x0142, B:75:0x0161, B:78:0x0170, B:79:0x0192, B:81:0x0195, B:82:0x011b, B:83:0x01c8, B:84:0x01cf, B:85:0x00c6, B:86:0x00c9, B:89:0x00b2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:38:0x009c, B:40:0x00a2, B:44:0x00af, B:47:0x00b6, B:52:0x00db, B:54:0x00e1, B:56:0x00e8, B:57:0x0197, B:63:0x00f4, B:64:0x010f, B:65:0x0110, B:68:0x012c, B:70:0x0139, B:73:0x0142, B:75:0x0161, B:78:0x0170, B:79:0x0192, B:81:0x0195, B:82:0x011b, B:83:0x01c8, B:84:0x01cf, B:85:0x00c6, B:86:0x00c9, B:89:0x00b2), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(String str, int i5, int i6) {
        int i7;
        int i8;
        if (i5 < 0 || i6 > str.length() || i5 > i6) {
            throw new NumberFormatException(str);
        }
        if (i5 < i6) {
            i8 = i5 + 1;
            int digit = Character.digit(str.charAt(i5), 10);
            if (digit < 0) {
                StringBuilder g5 = d.g("Invalid number: ");
                g5.append(str.substring(i5, i6));
                throw new NumberFormatException(g5.toString());
            }
            i7 = -digit;
        } else {
            i7 = 0;
            i8 = i5;
        }
        while (i8 < i6) {
            int i9 = i8 + 1;
            int digit2 = Character.digit(str.charAt(i8), 10);
            if (digit2 < 0) {
                StringBuilder g6 = d.g("Invalid number: ");
                g6.append(str.substring(i5, i6));
                throw new NumberFormatException(g6.toString());
            }
            i7 = (i7 * 10) - digit2;
            i8 = i9;
        }
        return -i7;
    }
}
