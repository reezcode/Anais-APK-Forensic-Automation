package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Objects;

/* loaded from: classes25.dex */
public final /* synthetic */ class c {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c5;
        Objects.requireNonNull(str);
        switch (str.hashCode()) {
            case -1310311125:
                if (str.equals("easing")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c5 = 11;
                    break;
                }
                c5 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = '\f';
                    break;
                }
                c5 = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c5 = '\r';
                    break;
                }
                c5 = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c5 = 14;
                    break;
                }
                c5 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c5 = 15;
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
                return TypedValues.CycleType.TYPE_EASING;
            case 1:
                return 308;
            case 2:
                return 309;
            case 3:
                return 310;
            case 4:
                return 304;
            case 5:
                return 305;
            case 6:
                return 306;
            case 7:
                return 315;
            case '\b':
                return 313;
            case '\t':
                return 314;
            case '\n':
                return 311;
            case 11:
                return 312;
            case '\f':
                return 403;
            case '\r':
                return 401;
            case 14:
                return 416;
            case 15:
                return 402;
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
        if (i5 == 416) {
            return 4;
        }
        if (i5 == 420 || i5 == 421) {
            return 8;
        }
        switch (i5) {
            case 304:
            case 305:
            case 306:
            case 307:
            case 308:
            case 309:
            case 310:
            case 311:
            case 312:
            case 313:
            case 314:
            case 315:
                return 4;
            default:
                switch (i5) {
                    case 401:
                    case 402:
                        return 2;
                    case 403:
                        return 4;
                    default:
                        switch (i5) {
                            case TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
                            case TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                            case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                                return 4;
                            default:
                                return -1;
                        }
                }
        }
    }
}
