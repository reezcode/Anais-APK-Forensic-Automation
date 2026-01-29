package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes7.dex */
public final class PathInterpolatorCompat {

    @RequiresApi(21)
    /* loaded from: classes9.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static PathInterpolator createPathInterpolator(float f5, float f6) {
            return new PathInterpolator(f5, f6);
        }

        @DoNotInline
        public static PathInterpolator createPathInterpolator(float f5, float f6, float f7, float f8) {
            return new PathInterpolator(f5, f6, f7, f8);
        }

        @DoNotInline
        public static PathInterpolator createPathInterpolator(Path path) {
            return new PathInterpolator(path);
        }
    }

    private PathInterpolatorCompat() {
    }

    @NonNull
    public static Interpolator create(float f5, float f6) {
        return Api21Impl.createPathInterpolator(f5, f6);
    }

    @NonNull
    public static Interpolator create(float f5, float f6, float f7, float f8) {
        return Api21Impl.createPathInterpolator(f5, f6, f7, f8);
    }

    @NonNull
    public static Interpolator create(@NonNull Path path) {
        return Api21Impl.createPathInterpolator(path);
    }
}
