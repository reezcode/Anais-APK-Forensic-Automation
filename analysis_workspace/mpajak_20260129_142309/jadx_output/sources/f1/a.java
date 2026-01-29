package f1;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes23.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f2767a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final FastOutSlowInInterpolator f2768b = new FastOutSlowInInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final FastOutLinearInInterpolator f2769c = new FastOutLinearInInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public static final LinearOutSlowInInterpolator f2770d = new LinearOutSlowInInterpolator();

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f2771e = new DecelerateInterpolator();

    public static float a(float f5, float f6, @FloatRange(from = 0.0d, to = 1.0d) float f7, @FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9) {
        return f9 < f7 ? f5 : f9 > f8 ? f6 : androidx.appcompat.graphics.drawable.a.a(f6, f5, (f9 - f7) / (f8 - f7), f5);
    }
}
