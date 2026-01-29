package androidx.core.graphics;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class PaintKt {
    public static final boolean setBlendMode(Paint paint, BlendModeCompat blendModeCompat) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return PaintCompat.setBlendMode(paint, blendModeCompat);
    }
}
