package p1;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import y1.b;

/* loaded from: classes21.dex */
public final class a {
    @ColorInt
    public static int a(@NonNull Context context, @AttrRes int i5, @ColorInt int i6) {
        TypedValue a5 = b.a(context, i5);
        return a5 != null ? a5.data : i6;
    }

    @ColorInt
    public static int b(@NonNull View view, @AttrRes int i5) {
        return b.b(view.getContext(), i5, view.getClass().getCanonicalName());
    }

    public static boolean c(@ColorInt int i5) {
        return i5 != 0 && ColorUtils.calculateLuminance(i5) > 0.5d;
    }

    @ColorInt
    public static int d(@ColorInt int i5, @ColorInt int i6, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i6, Math.round(Color.alpha(i6) * f5)), i5);
    }
}
