package androidx.appcompat.resources;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class Compatibility {

    @RequiresApi(15)
    /* loaded from: classes15.dex */
    public static class Api15Impl {
        private Api15Impl() {
        }

        @DoNotInline
        public static void getValueForDensity(@NonNull Resources resources, int i5, int i6, @NonNull TypedValue typedValue, boolean z4) {
            resources.getValueForDensity(i5, i6, typedValue, z4);
        }
    }

    @RequiresApi(18)
    /* loaded from: classes17.dex */
    public static class Api18Impl {
        private Api18Impl() {
        }

        @DoNotInline
        public static void setAutoCancel(@NonNull ObjectAnimator objectAnimator, boolean z4) {
            objectAnimator.setAutoCancel(z4);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes24.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @NonNull
        @DoNotInline
        public static Drawable createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        public static int getChangingConfigurations(@NonNull TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        public static void inflate(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    private Compatibility() {
    }
}
