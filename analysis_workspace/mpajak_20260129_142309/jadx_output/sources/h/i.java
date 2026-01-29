package h;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/* loaded from: classes17.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f3037e = new i(0, null, 1443168256, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final i f3038f = new i(1, null, 1509950721, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final i f3039g = new i(2, null, 1124075009, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final i f3040h = new i(3, null, 1107297537, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final i f3041i = new i(4, null, 1392510721, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final i f3042j = new i(5, null, 1224736769, 1);

    /* renamed from: k, reason: collision with root package name */
    public static final i f3043k = new i(6, null, 1174536705, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final i f3044l = new i(7, null, 1241579778, 1);

    /* renamed from: m, reason: collision with root package name */
    public static final i f3045m = new i(8, null, 1141048066, 1);

    /* renamed from: a, reason: collision with root package name */
    public final int f3046a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f3047b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3048c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3049d;

    public i(int i5, char[] cArr, int i6, int i7) {
        this.f3046a = i5;
        this.f3047b = cArr;
        this.f3048c = i6;
        this.f3049d = i7;
    }

    public static i b(String str) {
        return c(str.toCharArray(), 0);
    }

    public static i c(char[] cArr, int i5) {
        int i6;
        char c5 = cArr[i5];
        if (c5 == 'F') {
            return f3043k;
        }
        if (c5 == 'S') {
            return f3041i;
        }
        if (c5 == 'V') {
            return f3037e;
        }
        if (c5 == 'I') {
            return f3042j;
        }
        if (c5 == 'J') {
            return f3044l;
        }
        if (c5 == 'Z') {
            return f3038f;
        }
        if (c5 != '[') {
            switch (c5) {
                case 'B':
                    return f3040h;
                case 'C':
                    return f3039g;
                case 'D':
                    return f3045m;
                default:
                    int i7 = 1;
                    while (cArr[i5 + i7] != ';') {
                        i7++;
                    }
                    return new i(10, cArr, i5 + 1, i7 - 1);
            }
        }
        int i8 = 1;
        while (true) {
            i6 = i5 + i8;
            if (cArr[i6] != '[') {
                break;
            }
            i8++;
        }
        if (cArr[i6] == 'L') {
            do {
                i8++;
            } while (cArr[i5 + i8] != ';');
        }
        return new i(9, cArr, i5, i8 + 1);
    }

    public final String a() {
        switch (this.f3046a) {
            case 0:
                return "void";
            case 1:
                return TypedValues.Custom.S_BOOLEAN;
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return TypedValues.Custom.S_FLOAT;
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                char[] cArr = this.f3047b;
                int i5 = this.f3048c;
                int i6 = 1;
                int i7 = 1;
                while (this.f3047b[this.f3048c + i7] == '[') {
                    i7++;
                }
                StringBuffer stringBuffer = new StringBuffer(c(cArr, i5 + i7).a());
                while (this.f3047b[this.f3048c + i6] == '[') {
                    i6++;
                }
                while (i6 > 0) {
                    stringBuffer.append("[]");
                    i6--;
                }
                return stringBuffer.toString();
            default:
                return new String(this.f3047b, this.f3048c, this.f3049d).replace(IOUtils.DIR_SEPARATOR_UNIX, FilenameUtils.EXTENSION_SEPARATOR);
        }
    }
}
