package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes19.dex */
public final class HalfKt {
    @RequiresApi(26)
    public static final Half toHalf(double d5) {
        Half valueOf = Half.valueOf((float) d5);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(float f5) {
        Half valueOf = Half.valueOf(f5);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Half valueOf = Half.valueOf(str);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Half toHalf(short s4) {
        Half valueOf = Half.valueOf(s4);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }
}
