package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes13.dex */
public final class SizeKt {
    @RequiresApi(21)
    public static final float component1(SizeF sizeF) {
        Intrinsics.checkNotNullParameter(sizeF, "<this>");
        return sizeF.getWidth();
    }

    public static final float component1(SizeFCompat sizeFCompat) {
        Intrinsics.checkNotNullParameter(sizeFCompat, "<this>");
        return sizeFCompat.getWidth();
    }

    @RequiresApi(21)
    public static final int component1(Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return size.getWidth();
    }

    @RequiresApi(21)
    public static final float component2(SizeF sizeF) {
        Intrinsics.checkNotNullParameter(sizeF, "<this>");
        return sizeF.getHeight();
    }

    public static final float component2(SizeFCompat sizeFCompat) {
        Intrinsics.checkNotNullParameter(sizeFCompat, "<this>");
        return sizeFCompat.getHeight();
    }

    @RequiresApi(21)
    public static final int component2(Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return size.getHeight();
    }
}
