package com.blankj.utilcode.util;

import android.R;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.util.Log;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.ShadowUtils;

/* loaded from: classes15.dex */
public class ClickUtils {
    private static final long DEBOUNCING_DEFAULT_VALUE = 1000;
    private static final float PRESSED_BG_ALPHA_DEFAULT_VALUE = 0.9f;
    private static final int PRESSED_BG_ALPHA_STYLE = 4;
    private static final float PRESSED_BG_DARK_DEFAULT_VALUE = 0.9f;
    private static final int PRESSED_BG_DARK_STYLE = 5;
    private static final float PRESSED_VIEW_ALPHA_DEFAULT_VALUE = 0.8f;
    private static final int PRESSED_VIEW_ALPHA_SRC_TAG = -3;
    private static final int PRESSED_VIEW_ALPHA_TAG = -2;
    private static final float PRESSED_VIEW_SCALE_DEFAULT_VALUE = -0.06f;
    private static final int PRESSED_VIEW_SCALE_TAG = -1;
    private static final long TIP_DURATION = 2000;
    private static int sClickCount;
    private static long sLastClickMillis;

    /* loaded from: classes2.dex */
    public interface Back2HomeFriendlyListener {
        public static final Back2HomeFriendlyListener DEFAULT = new Back2HomeFriendlyListener() { // from class: com.blankj.utilcode.util.ClickUtils.Back2HomeFriendlyListener.1
            @Override // com.blankj.utilcode.util.ClickUtils.Back2HomeFriendlyListener
            public void dismiss() {
                UtilsBridge.toastCancel();
            }

            @Override // com.blankj.utilcode.util.ClickUtils.Back2HomeFriendlyListener
            public void show(CharSequence charSequence, long j5) {
                UtilsBridge.toastShowShort(charSequence);
            }
        };

        void dismiss();

        void show(CharSequence charSequence, long j5);
    }

    /* loaded from: classes20.dex */
    public static class ClickDrawableWrapper extends ShadowUtils.DrawableWrapper {
        private BitmapDrawable mBitmapDrawable;
        private Paint mColorPaint;

        public ClickDrawableWrapper(Drawable drawable) {
            super(drawable);
            this.mBitmapDrawable = null;
            this.mColorPaint = null;
            if (drawable instanceof ColorDrawable) {
                Paint paint = new Paint(5);
                this.mColorPaint = paint;
                paint.setColor(((ColorDrawable) drawable).getColor());
            }
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.mBitmapDrawable == null) {
                Bitmap createBitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                if (this.mColorPaint != null) {
                    canvas2.drawRect(getBounds(), this.mColorPaint);
                } else {
                    super.draw(canvas2);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), createBitmap);
                this.mBitmapDrawable = bitmapDrawable;
                bitmapDrawable.setBounds(getBounds());
            }
            this.mBitmapDrawable.draw(canvas);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void setAlpha(int i5) {
            super.setAlpha(i5);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            super.setColorFilter(colorFilter);
        }
    }

    public static abstract class OnDebouncingClickListener implements View.OnClickListener {
        private static final Runnable ENABLE_AGAIN = new Runnable() { // from class: com.blankj.utilcode.util.ClickUtils.OnDebouncingClickListener.1
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = OnDebouncingClickListener.mEnabled = true;
            }
        };
        private static boolean mEnabled = true;
        private long mDuration;
        private boolean mIsGlobal;

        public OnDebouncingClickListener() {
            this(true, ClickUtils.DEBOUNCING_DEFAULT_VALUE);
        }

        public OnDebouncingClickListener(long j5) {
            this(true, j5);
        }

        public OnDebouncingClickListener(boolean z4) {
            this(z4, ClickUtils.DEBOUNCING_DEFAULT_VALUE);
        }

        public OnDebouncingClickListener(boolean z4, long j5) {
            this.mIsGlobal = z4;
            this.mDuration = j5;
        }

        private static boolean isValid(@NonNull View view, long j5) {
            return UtilsBridge.isValid(view, j5);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (this.mIsGlobal) {
                if (!mEnabled) {
                    return;
                }
                mEnabled = false;
                view.postDelayed(ENABLE_AGAIN, this.mDuration);
            } else if (!isValid(view, this.mDuration)) {
                return;
            }
            onDebouncingClick(view);
        }

        public abstract void onDebouncingClick(View view);
    }

    /* loaded from: classes25.dex */
    public static abstract class OnMultiClickListener implements View.OnClickListener {
        private static final long INTERVAL_DEFAULT_VALUE = 666;
        private int mClickCount;
        private final long mClickInterval;
        private long mLastClickTime;
        private final int mTriggerClickCount;

        public OnMultiClickListener(int i5) {
            this(i5, INTERVAL_DEFAULT_VALUE);
        }

        public OnMultiClickListener(int i5, long j5) {
            this.mTriggerClickCount = i5;
            this.mClickInterval = j5;
        }

        public abstract void onBeforeTriggerClick(View view, int i5);

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.mTriggerClickCount <= 1) {
                onTriggerClick(view);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastClickTime < this.mClickInterval) {
                int i5 = this.mClickCount + 1;
                this.mClickCount = i5;
                int i6 = this.mTriggerClickCount;
                if (i5 == i6) {
                    onTriggerClick(view);
                } else if (i5 < i6) {
                    onBeforeTriggerClick(view, i5);
                }
                this.mLastClickTime = currentTimeMillis;
            }
            this.mClickCount = 1;
            onBeforeTriggerClick(view, 1);
            this.mLastClickTime = currentTimeMillis;
        }

        public abstract void onTriggerClick(View view);
    }

    /* loaded from: classes10.dex */
    public static class OnUtilsTouchListener implements View.OnTouchListener {

        /* loaded from: classes16.dex */
        public static class LazyHolder {
            private static final OnUtilsTouchListener INSTANCE = new OnUtilsTouchListener();

            private LazyHolder() {
            }
        }

        private OnUtilsTouchListener() {
        }

        public static OnUtilsTouchListener getInstance() {
            return LazyHolder.INSTANCE;
        }

        private void processAlpha(View view, boolean z4) {
            Object tag = view.getTag(z4 ? -2 : -3);
            if (tag instanceof Float) {
                view.setAlpha(((Float) tag).floatValue());
            }
        }

        private void processScale(View view, boolean z4) {
            Object tag = view.getTag(-1);
            if (tag instanceof Float) {
                float floatValue = z4 ? 1.0f + ((Float) tag).floatValue() : 1.0f;
                view.animate().scaleX(floatValue).scaleY(floatValue).setDuration(200L).start();
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                processScale(view, true);
                processAlpha(view, true);
            } else if (action == 1 || action == 3) {
                processScale(view, false);
                processAlpha(view, false);
            }
            return false;
        }
    }

    private ClickUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void applyDebouncing(View[] viewArr, boolean z4, @IntRange(from = 0) long j5, final View.OnClickListener onClickListener) {
        if (viewArr == null || viewArr.length == 0 || onClickListener == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setOnClickListener(new OnDebouncingClickListener(z4, j5) { // from class: com.blankj.utilcode.util.ClickUtils.1
                    @Override // com.blankj.utilcode.util.ClickUtils.OnDebouncingClickListener
                    public void onDebouncingClick(View view2) {
                        onClickListener.onClick(view2);
                    }
                });
            }
        }
    }

    public static void applyGlobalDebouncing(View view, @IntRange(from = 0) long j5, View.OnClickListener onClickListener) {
        applyGlobalDebouncing(new View[]{view}, j5, onClickListener);
    }

    public static void applyGlobalDebouncing(View view, View.OnClickListener onClickListener) {
        applyGlobalDebouncing(new View[]{view}, onClickListener);
    }

    public static void applyGlobalDebouncing(View[] viewArr, @IntRange(from = 0) long j5, View.OnClickListener onClickListener) {
        applyDebouncing(viewArr, true, j5, onClickListener);
    }

    public static void applyGlobalDebouncing(View[] viewArr, View.OnClickListener onClickListener) {
        applyGlobalDebouncing(viewArr, DEBOUNCING_DEFAULT_VALUE, onClickListener);
    }

    public static void applyPressedBgAlpha(View view) {
        applyPressedBgAlpha(view, 0.9f);
    }

    public static void applyPressedBgAlpha(View view, float f5) {
        applyPressedBgStyle(view, 4, f5);
    }

    public static void applyPressedBgDark(View view) {
        applyPressedBgDark(view, 0.9f);
    }

    public static void applyPressedBgDark(View view, float f5) {
        applyPressedBgStyle(view, 5, f5);
    }

    private static void applyPressedBgStyle(View view, int i5, float f5) {
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        int i6 = -i5;
        Object tag = view.getTag(i6);
        if (tag instanceof Drawable) {
            ViewCompat.setBackground(view, (Drawable) tag);
            return;
        }
        Drawable createStyleDrawable = createStyleDrawable(background, i5, f5);
        ViewCompat.setBackground(view, createStyleDrawable);
        view.setTag(i6, createStyleDrawable);
    }

    public static void applyPressedViewAlpha(View view, float f5) {
        if (view == null) {
            return;
        }
        view.setTag(-2, Float.valueOf(f5));
        view.setTag(-3, Float.valueOf(view.getAlpha()));
        view.setClickable(true);
        view.setOnTouchListener(OnUtilsTouchListener.getInstance());
    }

    public static void applyPressedViewAlpha(View... viewArr) {
        applyPressedViewAlpha(viewArr, (float[]) null);
    }

    public static void applyPressedViewAlpha(View[] viewArr, float[] fArr) {
        View view;
        float f5;
        if (viewArr == null || viewArr.length == 0) {
            return;
        }
        for (int i5 = 0; i5 < viewArr.length; i5++) {
            if (fArr == null || i5 >= fArr.length) {
                view = viewArr[i5];
                f5 = PRESSED_VIEW_ALPHA_DEFAULT_VALUE;
            } else {
                view = viewArr[i5];
                f5 = fArr[i5];
            }
            applyPressedViewAlpha(view, f5);
        }
    }

    public static void applyPressedViewScale(View view, float f5) {
        if (view == null) {
            return;
        }
        view.setTag(-1, Float.valueOf(f5));
        view.setClickable(true);
        view.setOnTouchListener(OnUtilsTouchListener.getInstance());
    }

    public static void applyPressedViewScale(View... viewArr) {
        applyPressedViewScale(viewArr, (float[]) null);
    }

    public static void applyPressedViewScale(View[] viewArr, float[] fArr) {
        View view;
        float f5;
        if (viewArr == null || viewArr.length == 0) {
            return;
        }
        for (int i5 = 0; i5 < viewArr.length; i5++) {
            if (fArr == null || i5 >= fArr.length) {
                view = viewArr[i5];
                f5 = PRESSED_VIEW_SCALE_DEFAULT_VALUE;
            } else {
                view = viewArr[i5];
                f5 = fArr[i5];
            }
            applyPressedViewScale(view, f5);
        }
    }

    public static void applySingleDebouncing(View view, @IntRange(from = 0) long j5, View.OnClickListener onClickListener) {
        applySingleDebouncing(new View[]{view}, j5, onClickListener);
    }

    public static void applySingleDebouncing(View view, View.OnClickListener onClickListener) {
        applySingleDebouncing(new View[]{view}, onClickListener);
    }

    public static void applySingleDebouncing(View[] viewArr, @IntRange(from = 0) long j5, View.OnClickListener onClickListener) {
        applyDebouncing(viewArr, false, j5, onClickListener);
    }

    public static void applySingleDebouncing(View[] viewArr, View.OnClickListener onClickListener) {
        applySingleDebouncing(viewArr, DEBOUNCING_DEFAULT_VALUE, onClickListener);
    }

    public static void back2HomeFriendly(CharSequence charSequence) {
        back2HomeFriendly(charSequence, TIP_DURATION, Back2HomeFriendlyListener.DEFAULT);
    }

    public static void back2HomeFriendly(@NonNull CharSequence charSequence, long j5, @NonNull Back2HomeFriendlyListener back2HomeFriendlyListener) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(elapsedRealtime - sLastClickMillis) >= j5) {
            sClickCount = 1;
            back2HomeFriendlyListener.show(charSequence, j5);
            sLastClickMillis = elapsedRealtime;
            return;
        }
        int i5 = sClickCount + 1;
        sClickCount = i5;
        if (i5 == 2) {
            UtilsBridge.startHomeActivity();
            back2HomeFriendlyListener.dismiss();
            sLastClickMillis = 0L;
        }
    }

    private static Drawable createAlphaDrawable(Drawable drawable, float f5) {
        ClickDrawableWrapper clickDrawableWrapper = new ClickDrawableWrapper(drawable);
        clickDrawableWrapper.setAlpha((int) (f5 * 255.0f));
        return clickDrawableWrapper;
    }

    private static Drawable createDarkDrawable(Drawable drawable, float f5) {
        ClickDrawableWrapper clickDrawableWrapper = new ClickDrawableWrapper(drawable);
        clickDrawableWrapper.setColorFilter(getDarkColorFilter(f5));
        return clickDrawableWrapper;
    }

    private static Drawable createStyleDrawable(Drawable drawable, int i5, float f5) {
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        if (drawable.getConstantState() == null) {
            return drawable;
        }
        Drawable mutate = drawable.getConstantState().newDrawable().mutate();
        if (i5 == 4) {
            mutate = createAlphaDrawable(mutate, f5);
        } else if (i5 == 5) {
            mutate = createDarkDrawable(mutate, f5);
        }
        Drawable createAlphaDrawable = createAlphaDrawable(drawable.getConstantState().newDrawable().mutate(), 0.5f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, mutate);
        stateListDrawable.addState(new int[]{-16842910}, createAlphaDrawable);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        return stateListDrawable;
    }

    public static void expandClickArea(@NonNull View view, int i5) {
        expandClickArea(view, i5, i5, i5, i5);
    }

    public static void expandClickArea(@NonNull final View view, final int i5, final int i6, final int i7, final int i8) {
        final View view2 = (View) view.getParent();
        if (view2 == null) {
            Log.e("ClickUtils", "expandClickArea must have parent view.");
        } else {
            view2.post(new Runnable() { // from class: com.blankj.utilcode.util.ClickUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    rect.top -= i5;
                    rect.bottom += i8;
                    rect.left -= i6;
                    rect.right += i7;
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
            });
        }
    }

    private static ColorMatrixColorFilter getDarkColorFilter(float f5) {
        return new ColorMatrixColorFilter(new ColorMatrix(new float[]{f5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f}));
    }
}
