package z1;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6114a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public static final String f6115b = b.class.getSimpleName();

    @NonNull
    public static ColorStateList a(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 22 && i5 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f6114a, 0)) != 0) {
            Log.w(f6115b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(@NonNull int[] iArr) {
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 : iArr) {
            if (i5 == 16842910) {
                z4 = true;
            } else if (i5 == 16842908 || i5 == 16842919 || i5 == 16843623) {
                z5 = true;
            }
        }
        return z4 && z5;
    }
}
