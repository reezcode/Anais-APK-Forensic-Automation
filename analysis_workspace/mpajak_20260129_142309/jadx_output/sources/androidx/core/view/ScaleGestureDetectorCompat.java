package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes14.dex */
public final class ScaleGestureDetectorCompat {

    @RequiresApi(19)
    /* loaded from: classes17.dex */
    public static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        public static boolean isQuickScaleEnabled(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @DoNotInline
        public static void setQuickScaleEnabled(ScaleGestureDetector scaleGestureDetector, boolean z4) {
            scaleGestureDetector.setQuickScaleEnabled(z4);
        }
    }

    private ScaleGestureDetectorCompat() {
    }

    public static boolean isQuickScaleEnabled(@NonNull ScaleGestureDetector scaleGestureDetector) {
        return Api19Impl.isQuickScaleEnabled(scaleGestureDetector);
    }

    @Deprecated
    public static boolean isQuickScaleEnabled(Object obj) {
        return isQuickScaleEnabled((ScaleGestureDetector) obj);
    }

    public static void setQuickScaleEnabled(@NonNull ScaleGestureDetector scaleGestureDetector, boolean z4) {
        Api19Impl.setQuickScaleEnabled(scaleGestureDetector, z4);
    }

    @Deprecated
    public static void setQuickScaleEnabled(Object obj, boolean z4) {
        setQuickScaleEnabled((ScaleGestureDetector) obj, z4);
    }
}
