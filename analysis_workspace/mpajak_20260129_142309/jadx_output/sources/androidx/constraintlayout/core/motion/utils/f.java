package androidx.constraintlayout.core.motion.utils;

import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class f {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c5;
        Objects.requireNonNull(str);
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
                return 501;
            case 1:
                return 503;
            case 2:
                return 504;
            case 3:
                return 502;
            case 4:
                return 505;
            case 5:
                return 506;
            case 6:
                return 507;
            default:
                return -1;
        }
    }

    public static int b(int i5) {
        if (i5 == 100) {
            return 2;
        }
        if (i5 == 101) {
            return 8;
        }
        switch (i5) {
            case 501:
            case 502:
                return 8;
            case 503:
            case 504:
            case 505:
            case 506:
            case 507:
                return 4;
            case 508:
                return 2;
            default:
                return -1;
        }
    }
}
