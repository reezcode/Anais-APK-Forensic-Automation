package y1;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class g {
    @Nullable
    public static Typeface a(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        int i5;
        if (Build.VERSION.SDK_INT < 31 || (i5 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i5 == 0) {
            return null;
        }
        return Typeface.create(typeface, MathUtils.clamp(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
