package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Objects;

/* loaded from: classes8.dex */
public final /* synthetic */ class d {
    public static int a(String str) {
        Objects.requireNonNull(str);
        if (str.equals(TypedValues.MotionScene.S_DEFAULT_DURATION)) {
            return 600;
        }
        return !str.equals(TypedValues.MotionScene.S_LAYOUT_DURING_TRANSITION) ? -1 : 601;
    }

    public static int b(int i5) {
        if (i5 != 600) {
            return i5 != 601 ? -1 : 1;
        }
        return 2;
    }
}
