package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Objects;

/* loaded from: classes14.dex */
public final /* synthetic */ class b {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c5;
        Objects.requireNonNull(str);
        switch (str.hashCode()) {
            case -1095013018:
                if (str.equals(TypedValues.Custom.S_DIMENSION)) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -891985903:
                if (str.equals(TypedValues.Custom.S_STRING)) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -710953590:
                if (str.equals(TypedValues.Custom.S_REFERENCE)) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 64711720:
                if (str.equals(TypedValues.Custom.S_BOOLEAN)) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 94842723:
                if (str.equals(TypedValues.Custom.S_COLOR)) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case 97526364:
                if (str.equals(TypedValues.Custom.S_FLOAT)) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case 1958052158:
                if (str.equals(TypedValues.Custom.S_INT)) {
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
                return TypedValues.Custom.TYPE_DIMENSION;
            case 1:
                return TypedValues.Custom.TYPE_STRING;
            case 2:
                return TypedValues.Custom.TYPE_REFERENCE;
            case 3:
                return TypedValues.Custom.TYPE_BOOLEAN;
            case 4:
                return 902;
            case 5:
                return 901;
            case 6:
                return 900;
            default:
                return -1;
        }
    }
}
