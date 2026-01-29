package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public abstract class ViewOscillator extends KeyCycleOscillator {
    private static final String TAG = "ViewOscillator";

    /* loaded from: classes25.dex */
    public static class AlphaSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setAlpha(get(f5));
        }
    }

    /* loaded from: classes14.dex */
    public static class CustomSet extends ViewOscillator {
        public ConstraintAttribute mCustom;
        public float[] value = new float[1];

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setCustom(Object obj) {
            this.mCustom = (ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            this.value[0] = get(f5);
            CustomSupport.setInterpolatedValue(this.mCustom, view, this.value);
        }
    }

    /* loaded from: classes23.dex */
    public static class ElevationSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setElevation(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    public static class PathRotateSet extends ViewOscillator {
        public void setPathRotate(View view, float f5, double d5, double d6) {
            view.setRotation(get(f5) + ((float) Math.toDegrees(Math.atan2(d6, d5))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
        }
    }

    /* loaded from: classes16.dex */
    public static class ProgressSet extends ViewOscillator {
        public boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f5));
                return;
            }
            if (this.mNoMethod) {
                return;
            }
            Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.mNoMethod = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(f5)));
                } catch (IllegalAccessException | InvocationTargetException e5) {
                    Log.e(ViewOscillator.TAG, "unable to setProgress", e5);
                }
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class RotationSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setRotation(get(f5));
        }
    }

    /* loaded from: classes13.dex */
    public static class RotationXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setRotationX(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    public static class RotationYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setRotationY(get(f5));
        }
    }

    /* loaded from: classes15.dex */
    public static class ScaleXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setScaleX(get(f5));
        }
    }

    /* loaded from: classes18.dex */
    public static class ScaleYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setScaleY(get(f5));
        }
    }

    /* loaded from: classes25.dex */
    public static class TranslationXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setTranslationX(get(f5));
        }
    }

    /* loaded from: classes22.dex */
    public static class TranslationYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setTranslationY(get(f5));
        }
    }

    /* loaded from: classes5.dex */
    public static class TranslationZset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setTranslationZ(get(f5));
        }
    }

    public static ViewOscillator makeSpline(String str) {
        if (str.startsWith("CUSTOM")) {
            return new CustomSet();
        }
        switch (str) {
            case "rotationX":
                return new RotationXset();
            case "rotationY":
                return new RotationYset();
            case "translationX":
                return new TranslationXset();
            case "translationY":
                return new TranslationYset();
            case "translationZ":
                return new TranslationZset();
            case "progress":
                return new ProgressSet();
            case "scaleX":
                return new ScaleXset();
            case "scaleY":
                return new ScaleYset();
            case "waveVariesBy":
                return new AlphaSet();
            case "rotation":
                return new RotationSet();
            case "elevation":
                return new ElevationSet();
            case "transitionPathRotate":
                return new PathRotateSet();
            case "alpha":
                return new AlphaSet();
            case "waveOffset":
                return new AlphaSet();
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float f5);
}
