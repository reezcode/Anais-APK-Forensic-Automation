package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes24.dex */
public final class DrawableCompat {
    private static final String TAG = "DrawableCompat";
    private static Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    @RequiresApi(19)
    /* loaded from: classes21.dex */
    public static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        public static int getAlpha(Drawable drawable) {
            return drawable.getAlpha();
        }

        @DoNotInline
        public static Drawable getChild(DrawableContainer.DrawableContainerState drawableContainerState, int i5) {
            return drawableContainerState.getChild(i5);
        }

        @DoNotInline
        public static Drawable getDrawable(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @DoNotInline
        public static boolean isAutoMirrored(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @DoNotInline
        public static void setAutoMirrored(Drawable drawable, boolean z4) {
            drawable.setAutoMirrored(z4);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes14.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static void applyTheme(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        public static boolean canApplyTheme(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        public static ColorFilter getColorFilter(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        public static void setHotspot(Drawable drawable, float f5, float f6) {
            drawable.setHotspot(f5, f6);
        }

        @DoNotInline
        public static void setHotspotBounds(Drawable drawable, int i5, int i6, int i7, int i8) {
            drawable.setHotspotBounds(i5, i6, i7, i8);
        }

        @DoNotInline
        public static void setTint(Drawable drawable, int i5) {
            drawable.setTint(i5);
        }

        @DoNotInline
        public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @DoNotInline
        public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @RequiresApi(23)
    /* loaded from: classes13.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static int getLayoutDirection(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        public static boolean setLayoutDirection(Drawable drawable, int i5) {
            return drawable.setLayoutDirection(i5);
        }
    }

    private DrawableCompat() {
    }

    public static void applyTheme(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        Api21Impl.applyTheme(drawable, theme);
    }

    public static boolean canApplyTheme(@NonNull Drawable drawable) {
        return Api21Impl.canApplyTheme(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void clearColorFilter(@NonNull Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable wrappedDrawable;
        int i5 = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (i5 >= 23) {
            return;
        }
        if (drawable instanceof InsetDrawable) {
            wrappedDrawable = Api19Impl.getDrawable((InsetDrawable) drawable);
        } else {
            if (!(drawable instanceof WrappedDrawable)) {
                if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                    return;
                }
                int childCount = drawableContainerState.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    Drawable child = Api19Impl.getChild(drawableContainerState, i6);
                    if (child != null) {
                        clearColorFilter(child);
                    }
                }
                return;
            }
            wrappedDrawable = ((WrappedDrawable) drawable).getWrappedDrawable();
        }
        clearColorFilter(wrappedDrawable);
    }

    public static int getAlpha(@NonNull Drawable drawable) {
        return Api19Impl.getAlpha(drawable);
    }

    @Nullable
    public static ColorFilter getColorFilter(@NonNull Drawable drawable) {
        return Api21Impl.getColorFilter(drawable);
    }

    public static int getLayoutDirection(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getLayoutDirection(drawable);
        }
        if (!sGetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                sGetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e5) {
                Log.i(TAG, "Failed to retrieve getLayoutDirection() method", e5);
            }
            sGetLayoutDirectionMethodFetched = true;
        }
        Method method = sGetLayoutDirectionMethod;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e6) {
                Log.i(TAG, "Failed to invoke getLayoutDirection() via reflection", e6);
                sGetLayoutDirectionMethod = null;
            }
        }
        return 0;
    }

    public static void inflate(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
        Api21Impl.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean isAutoMirrored(@NonNull Drawable drawable) {
        return Api19Impl.isAutoMirrored(drawable);
    }

    @Deprecated
    public static void jumpToCurrentState(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(@NonNull Drawable drawable, boolean z4) {
        Api19Impl.setAutoMirrored(drawable, z4);
    }

    public static void setHotspot(@NonNull Drawable drawable, float f5, float f6) {
        Api21Impl.setHotspot(drawable, f5, f6);
    }

    public static void setHotspotBounds(@NonNull Drawable drawable, int i5, int i6, int i7, int i8) {
        Api21Impl.setHotspotBounds(drawable, i5, i6, i7, i8);
    }

    public static boolean setLayoutDirection(@NonNull Drawable drawable, int i5) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.setLayoutDirection(drawable, i5);
        }
        if (!sSetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                sSetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e5) {
                Log.i(TAG, "Failed to retrieve setLayoutDirection(int) method", e5);
            }
            sSetLayoutDirectionMethodFetched = true;
        }
        Method method = sSetLayoutDirectionMethod;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i5));
                return true;
            } catch (Exception e6) {
                Log.i(TAG, "Failed to invoke setLayoutDirection(int) via reflection", e6);
                sSetLayoutDirectionMethod = null;
            }
        }
        return false;
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i5) {
        Api21Impl.setTint(drawable, i5);
    }

    public static void setTintList(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        Api21Impl.setTintList(drawable, colorStateList);
    }

    public static void setTintMode(@NonNull Drawable drawable, @NonNull PorterDuff.Mode mode) {
        Api21Impl.setTintMode(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(@NonNull Drawable drawable) {
        return drawable instanceof WrappedDrawable ? (T) ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    @NonNull
    public static Drawable wrap(@NonNull Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof TintAwareDrawable)) ? new WrappedDrawableApi21(drawable) : drawable;
    }
}
