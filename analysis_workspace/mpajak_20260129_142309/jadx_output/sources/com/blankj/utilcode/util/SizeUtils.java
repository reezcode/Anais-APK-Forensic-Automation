package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes8.dex */
public final class SizeUtils {

    /* loaded from: classes23.dex */
    public interface OnGetSizeListener {
        void onGetSize(View view);
    }

    private SizeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static float applyDimension(float f5, int i5) {
        float f6;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (i5 == 0) {
            return f5;
        }
        if (i5 == 1) {
            f6 = displayMetrics.density;
        } else if (i5 == 2) {
            f6 = displayMetrics.scaledDensity;
        } else if (i5 == 3) {
            f5 *= displayMetrics.xdpi;
            f6 = 0.013888889f;
        } else if (i5 == 4) {
            f6 = displayMetrics.xdpi;
        } else {
            if (i5 != 5) {
                return 0.0f;
            }
            f5 *= displayMetrics.xdpi;
            f6 = 0.03937008f;
        }
        return f5 * f6;
    }

    public static int dp2px(float f5) {
        return (int) ((f5 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void forceGetViewSize(final View view, final OnGetSizeListener onGetSizeListener) {
        view.post(new Runnable() { // from class: com.blankj.utilcode.util.SizeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                OnGetSizeListener onGetSizeListener2 = OnGetSizeListener.this;
                if (onGetSizeListener2 != null) {
                    onGetSizeListener2.onGetSize(view);
                }
            }
        });
    }

    public static int getMeasuredHeight(View view) {
        return measureView(view)[1];
    }

    public static int getMeasuredWidth(View view) {
        return measureView(view)[0];
    }

    public static int[] measureView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i5 = layoutParams.height;
        view.measure(childMeasureSpec, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    public static int px2dp(float f5) {
        return (int) ((f5 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(float f5) {
        return (int) ((f5 / Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int sp2px(float f5) {
        return (int) ((f5 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
