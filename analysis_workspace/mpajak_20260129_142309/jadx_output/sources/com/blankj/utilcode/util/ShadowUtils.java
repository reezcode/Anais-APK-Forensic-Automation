package com.blankj.utilcode.util;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

/* loaded from: classes15.dex */
public class ShadowUtils {
    private static final int SHADOW_TAG = -16;

    /* loaded from: classes13.dex */
    public static class Config {
        private static final int SHADOW_COLOR_DEFAULT = 1140850688;
        private static final int SHADOW_SIZE = UtilsBridge.dp2px(8.0f);
        private float mShadowRadius = -1.0f;
        private float mShadowSizeNormal = -1.0f;
        private float mShadowSizePressed = -1.0f;
        private float mShadowMaxSizeNormal = -1.0f;
        private float mShadowMaxSizePressed = -1.0f;
        private int mShadowColorNormal = SHADOW_COLOR_DEFAULT;
        private int mShadowColorPressed = SHADOW_COLOR_DEFAULT;
        private boolean isCircle = false;

        private float getShadowMaxSizeNormal() {
            if (this.mShadowMaxSizeNormal == -1.0f) {
                this.mShadowMaxSizeNormal = getShadowSizeNormal();
            }
            return this.mShadowMaxSizeNormal;
        }

        private float getShadowMaxSizePressed() {
            if (this.mShadowMaxSizePressed == -1.0f) {
                this.mShadowMaxSizePressed = getShadowSizePressed();
            }
            return this.mShadowMaxSizePressed;
        }

        private float getShadowRadius() {
            if (this.mShadowRadius < 0.0f) {
                this.mShadowRadius = 0.0f;
            }
            return this.mShadowRadius;
        }

        private float getShadowSizeNormal() {
            if (this.mShadowSizeNormal == -1.0f) {
                this.mShadowSizeNormal = SHADOW_SIZE;
            }
            return this.mShadowSizeNormal;
        }

        private float getShadowSizePressed() {
            if (this.mShadowSizePressed == -1.0f) {
                this.mShadowSizePressed = getShadowSizeNormal();
            }
            return this.mShadowSizePressed;
        }

        public Drawable apply(Drawable drawable) {
            if (drawable == null) {
                drawable = new ColorDrawable(0);
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = drawable;
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ShadowDrawable(drawable2, getShadowRadius(), getShadowSizeNormal(), getShadowMaxSizeNormal(), this.mShadowColorPressed, this.isCircle));
            stateListDrawable.addState(StateSet.WILD_CARD, new ShadowDrawable(drawable2, getShadowRadius(), getShadowSizePressed(), getShadowMaxSizePressed(), this.mShadowColorNormal, this.isCircle));
            return stateListDrawable;
        }

        public Config setCircle() {
            this.isCircle = true;
            if (this.mShadowRadius == -1.0f) {
                return this;
            }
            throw new IllegalArgumentException("Set circle needn't set radius.");
        }

        public Config setShadowColor(int i5) {
            return setShadowColor(i5, i5);
        }

        public Config setShadowColor(int i5, int i6) {
            this.mShadowColorNormal = i5;
            this.mShadowColorPressed = i6;
            return this;
        }

        public Config setShadowMaxSize(int i5) {
            return setShadowMaxSize(i5, i5);
        }

        public Config setShadowMaxSize(int i5, int i6) {
            this.mShadowMaxSizeNormal = i5;
            this.mShadowMaxSizePressed = i6;
            return this;
        }

        public Config setShadowRadius(float f5) {
            this.mShadowRadius = f5;
            if (this.isCircle) {
                throw new IllegalArgumentException("Set circle needn't set radius.");
            }
            return this;
        }

        public Config setShadowSize(int i5) {
            return setShadowSize(i5, i5);
        }

        public Config setShadowSize(int i5, int i6) {
            this.mShadowSizeNormal = i5;
            this.mShadowSizePressed = i6;
            return this;
        }
    }

    /* loaded from: classes17.dex */
    public static class DrawableWrapper extends Drawable implements Drawable.Callback {
        private Drawable mDrawable;

        public DrawableWrapper(Drawable drawable) {
            setWrappedDrawable(drawable);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            this.mDrawable.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getChangingConfigurations() {
            return this.mDrawable.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable
        public Drawable getCurrent() {
            return this.mDrawable.getCurrent();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.mDrawable.getIntrinsicHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.mDrawable.getIntrinsicWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return this.mDrawable.getMinimumHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return this.mDrawable.getMinimumWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return this.mDrawable.getOpacity();
        }

        @Override // android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return this.mDrawable.getPadding(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public int[] getState() {
            return this.mDrawable.getState();
        }

        @Override // android.graphics.drawable.Drawable
        public Region getTransparentRegion() {
            return this.mDrawable.getTransparentRegion();
        }

        public Drawable getWrappedDrawable() {
            return this.mDrawable;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isAutoMirrored() {
            return DrawableCompat.isAutoMirrored(this.mDrawable);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isStateful() {
            return this.mDrawable.isStateful();
        }

        @Override // android.graphics.drawable.Drawable
        public void jumpToCurrentState() {
            DrawableCompat.jumpToCurrentState(this.mDrawable);
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            this.mDrawable.setBounds(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean onLevelChange(int i5) {
            return this.mDrawable.setLevel(i5);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
            scheduleSelf(runnable, j5);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i5) {
            this.mDrawable.setAlpha(i5);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAutoMirrored(boolean z4) {
            DrawableCompat.setAutoMirrored(this.mDrawable, z4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setChangingConfigurations(int i5) {
            this.mDrawable.setChangingConfigurations(i5);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.mDrawable.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable
        public void setDither(boolean z4) {
            this.mDrawable.setDither(z4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setFilterBitmap(boolean z4) {
            this.mDrawable.setFilterBitmap(z4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspot(float f5, float f6) {
            DrawableCompat.setHotspot(this.mDrawable, f5, f6);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspotBounds(int i5, int i6, int i7, int i8) {
            DrawableCompat.setHotspotBounds(this.mDrawable, i5, i6, i7, i8);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            return this.mDrawable.setState(iArr);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTint(int i5) {
            DrawableCompat.setTint(this.mDrawable, i5);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTintList(ColorStateList colorStateList) {
            DrawableCompat.setTintList(this.mDrawable, colorStateList);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTintMode(PorterDuff.Mode mode) {
            DrawableCompat.setTintMode(this.mDrawable, mode);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setVisible(boolean z4, boolean z5) {
            return super.setVisible(z4, z5) || this.mDrawable.setVisible(z4, z5);
        }

        public void setWrappedDrawable(Drawable drawable) {
            Drawable drawable2 = this.mDrawable;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.mDrawable = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes3.dex */
    public static class ShadowDrawable extends DrawableWrapper {
        private static final double COS_45 = Math.cos(Math.toRadians(45.0d));
        private boolean isCircle;
        private boolean mAddPaddingForCorners;
        private RectF mContentBounds;
        private float mCornerRadius;
        private Paint mCornerShadowPaint;
        private Path mCornerShadowPath;
        private boolean mDirty;
        private Paint mEdgeShadowPaint;
        private float mMaxShadowSize;
        private float mRawMaxShadowSize;
        private float mRawShadowSize;
        private float mRotation;
        private float mShadowBottomScale;
        private final int mShadowEndColor;
        private float mShadowHorizScale;
        private float mShadowMultiplier;
        private float mShadowSize;
        private final int mShadowStartColor;
        private float mShadowTopScale;

        public ShadowDrawable(Drawable drawable, float f5, float f6, float f7, int i5, boolean z4) {
            super(drawable);
            this.mShadowMultiplier = 1.0f;
            this.mShadowTopScale = 1.0f;
            this.mShadowHorizScale = 1.0f;
            this.mShadowBottomScale = 1.0f;
            this.mDirty = true;
            this.mAddPaddingForCorners = false;
            this.mShadowStartColor = i5;
            this.mShadowEndColor = i5 & ViewCompat.MEASURED_SIZE_MASK;
            this.isCircle = z4;
            if (z4) {
                this.mShadowMultiplier = 1.0f;
                this.mShadowTopScale = 1.0f;
                this.mShadowHorizScale = 1.0f;
                this.mShadowBottomScale = 1.0f;
            }
            Paint paint = new Paint(5);
            this.mCornerShadowPaint = paint;
            paint.setStyle(Paint.Style.FILL);
            this.mCornerRadius = Math.round(f5);
            this.mContentBounds = new RectF();
            Paint paint2 = new Paint(this.mCornerShadowPaint);
            this.mEdgeShadowPaint = paint2;
            paint2.setAntiAlias(false);
            setShadowSize(f6, f7);
        }

        private void buildComponents(Rect rect) {
            if (this.isCircle) {
                this.mCornerRadius = rect.width() / 2;
            }
            float f5 = this.mRawMaxShadowSize;
            float f6 = this.mShadowMultiplier * f5;
            this.mContentBounds.set(rect.left + f5, rect.top + f6, rect.right - f5, rect.bottom - f6);
            Drawable wrappedDrawable = getWrappedDrawable();
            RectF rectF = this.mContentBounds;
            wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            buildShadowCorners();
        }

        private void buildShadowCorners() {
            if (!this.isCircle) {
                float f5 = this.mCornerRadius;
                RectF rectF = new RectF(-f5, -f5, f5, f5);
                RectF rectF2 = new RectF(rectF);
                float f6 = this.mShadowSize;
                rectF2.inset(-f6, -f6);
                Path path = this.mCornerShadowPath;
                if (path == null) {
                    this.mCornerShadowPath = new Path();
                } else {
                    path.reset();
                }
                this.mCornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
                this.mCornerShadowPath.moveTo(-this.mCornerRadius, 0.0f);
                this.mCornerShadowPath.rLineTo(-this.mShadowSize, 0.0f);
                this.mCornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
                this.mCornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
                this.mCornerShadowPath.close();
                float f7 = -rectF2.top;
                if (f7 > 0.0f) {
                    this.mCornerShadowPaint.setShader(new RadialGradient(0.0f, 0.0f, f7, new int[]{0, this.mShadowStartColor, this.mShadowEndColor}, new float[]{0.0f, this.mCornerRadius / f7, 1.0f}, Shader.TileMode.CLAMP));
                }
                this.mEdgeShadowPaint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, this.mShadowStartColor, this.mShadowEndColor, Shader.TileMode.CLAMP));
                this.mEdgeShadowPaint.setAntiAlias(false);
                return;
            }
            float width = (this.mContentBounds.width() / 2.0f) - 1.0f;
            float f8 = -width;
            RectF rectF3 = new RectF(f8, f8, width, width);
            RectF rectF4 = new RectF(rectF3);
            float f9 = this.mShadowSize;
            rectF4.inset(-f9, -f9);
            Path path2 = this.mCornerShadowPath;
            if (path2 == null) {
                this.mCornerShadowPath = new Path();
            } else {
                path2.reset();
            }
            this.mCornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
            this.mCornerShadowPath.moveTo(f8, 0.0f);
            this.mCornerShadowPath.rLineTo(-this.mShadowSize, 0.0f);
            this.mCornerShadowPath.arcTo(rectF4, 180.0f, 180.0f, false);
            this.mCornerShadowPath.arcTo(rectF4, 0.0f, 180.0f, false);
            this.mCornerShadowPath.arcTo(rectF3, 180.0f, 180.0f, false);
            this.mCornerShadowPath.arcTo(rectF3, 0.0f, 180.0f, false);
            this.mCornerShadowPath.close();
            float f10 = -rectF4.top;
            if (f10 > 0.0f) {
                this.mCornerShadowPaint.setShader(new RadialGradient(0.0f, 0.0f, f10, new int[]{0, this.mShadowStartColor, this.mShadowEndColor}, new float[]{0.0f, width / f10, 1.0f}, Shader.TileMode.CLAMP));
            }
        }

        private static float calculateHorizontalPadding(float f5, float f6, boolean z4) {
            if (!z4) {
                return f5;
            }
            return (float) (((1.0d - COS_45) * f6) + f5);
        }

        private float calculateVerticalPadding(float f5, float f6, boolean z4) {
            if (!z4) {
                return f5 * this.mShadowMultiplier;
            }
            return (float) (((1.0d - COS_45) * f6) + (f5 * this.mShadowMultiplier));
        }

        private void drawShadow(Canvas canvas) {
            int i5;
            float f5;
            int i6;
            float f6;
            float f7;
            float f8;
            int i7;
            if (this.isCircle) {
                i7 = canvas.save();
                canvas.translate(this.mContentBounds.centerX(), this.mContentBounds.centerY());
                canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
            } else {
                int save = canvas.save();
                canvas.rotate(this.mRotation, this.mContentBounds.centerX(), this.mContentBounds.centerY());
                float f9 = this.mCornerRadius;
                float f10 = (-f9) - this.mShadowSize;
                float f11 = f9 * 2.0f;
                boolean z4 = this.mContentBounds.width() - f11 > 0.0f;
                boolean z5 = this.mContentBounds.height() - f11 > 0.0f;
                float f12 = this.mRawShadowSize;
                float f13 = f12 - (this.mShadowTopScale * f12);
                float f14 = f12 - (this.mShadowHorizScale * f12);
                float f15 = f12 - (this.mShadowBottomScale * f12);
                float f16 = f9 == 0.0f ? 1.0f : f9 / (f14 + f9);
                float f17 = f9 == 0.0f ? 1.0f : f9 / (f13 + f9);
                float f18 = f9 == 0.0f ? 1.0f : f9 / (f15 + f9);
                int save2 = canvas.save();
                RectF rectF = this.mContentBounds;
                canvas.translate(rectF.left + f9, rectF.top + f9);
                canvas.scale(f16, f17);
                canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
                if (z4) {
                    canvas.scale(1.0f / f16, 1.0f);
                    i5 = save2;
                    f5 = f18;
                    i6 = save;
                    f6 = f17;
                    canvas.drawRect(0.0f, f10, this.mContentBounds.width() - f11, -this.mCornerRadius, this.mEdgeShadowPaint);
                } else {
                    i5 = save2;
                    f5 = f18;
                    i6 = save;
                    f6 = f17;
                }
                canvas.restoreToCount(i5);
                int save3 = canvas.save();
                RectF rectF2 = this.mContentBounds;
                canvas.translate(rectF2.right - f9, rectF2.bottom - f9);
                float f19 = f5;
                canvas.scale(f16, f19);
                canvas.rotate(180.0f);
                canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
                if (z4) {
                    canvas.scale(1.0f / f16, 1.0f);
                    f7 = f6;
                    f8 = f19;
                    canvas.drawRect(0.0f, f10, this.mContentBounds.width() - f11, -this.mCornerRadius, this.mEdgeShadowPaint);
                } else {
                    f7 = f6;
                    f8 = f19;
                }
                canvas.restoreToCount(save3);
                int save4 = canvas.save();
                RectF rectF3 = this.mContentBounds;
                canvas.translate(rectF3.left + f9, rectF3.bottom - f9);
                canvas.scale(f16, f8);
                canvas.rotate(270.0f);
                canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
                if (z5) {
                    canvas.scale(1.0f / f8, 1.0f);
                    canvas.drawRect(0.0f, f10, this.mContentBounds.height() - f11, -this.mCornerRadius, this.mEdgeShadowPaint);
                }
                canvas.restoreToCount(save4);
                int save5 = canvas.save();
                RectF rectF4 = this.mContentBounds;
                canvas.translate(rectF4.right - f9, rectF4.top + f9);
                float f20 = f7;
                canvas.scale(f16, f20);
                canvas.rotate(90.0f);
                canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
                if (z5) {
                    canvas.scale(1.0f / f20, 1.0f);
                    canvas.drawRect(0.0f, f10, this.mContentBounds.height() - f11, -this.mCornerRadius, this.mEdgeShadowPaint);
                }
                canvas.restoreToCount(save5);
                i7 = i6;
            }
            canvas.restoreToCount(i7);
        }

        private static int toEven(float f5) {
            int round = Math.round(f5);
            return round % 2 == 1 ? round - 1 : round;
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.mDirty) {
                buildComponents(getBounds());
                this.mDirty = false;
            }
            drawShadow(canvas);
            super.draw(canvas);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getChangingConfigurations() {
            return super.getChangingConfigurations();
        }

        public float getCornerRadius() {
            return this.mCornerRadius;
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ Drawable getCurrent() {
            return super.getCurrent();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
            return super.getIntrinsicHeight();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
            return super.getIntrinsicWidth();
        }

        public float getMaxShadowSize() {
            return this.mRawMaxShadowSize;
        }

        public float getMinHeight() {
            float f5 = this.mRawMaxShadowSize;
            return (this.mRawMaxShadowSize * this.mShadowMultiplier * 2.0f) + (Math.max(f5, ((this.mShadowMultiplier * f5) / 2.0f) + this.mCornerRadius) * 2.0f);
        }

        public float getMinWidth() {
            float f5 = this.mRawMaxShadowSize;
            return (this.mRawMaxShadowSize * 2.0f) + (Math.max(f5, (f5 / 2.0f) + this.mCornerRadius) * 2.0f);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getMinimumHeight() {
            return super.getMinimumHeight();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getMinimumWidth() {
            return super.getMinimumWidth();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            int ceil = (int) Math.ceil(calculateVerticalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
            int ceil2 = (int) Math.ceil(calculateHorizontalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
            rect.set(ceil2, ceil, ceil2, ceil);
            return true;
        }

        public float getShadowSize() {
            return this.mRawShadowSize;
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int[] getState() {
            return super.getState();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ Region getTransparentRegion() {
            return super.getTransparentRegion();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper
        public /* bridge */ /* synthetic */ Drawable getWrappedDrawable() {
            return super.getWrappedDrawable();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
            super.invalidateDrawable(drawable);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
            return super.isAutoMirrored();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean isStateful() {
            return super.isStateful();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void jumpToCurrentState() {
            super.jumpToCurrentState();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            this.mDirty = true;
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
            super.scheduleDrawable(drawable, runnable, j5);
        }

        public void setAddPaddingForCorners(boolean z4) {
            this.mAddPaddingForCorners = z4;
            invalidateSelf();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public void setAlpha(int i5) {
            super.setAlpha(i5);
            this.mCornerShadowPaint.setAlpha(i5);
            this.mEdgeShadowPaint.setAlpha(i5);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z4) {
            super.setAutoMirrored(z4);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setChangingConfigurations(int i5) {
            super.setChangingConfigurations(i5);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
            super.setColorFilter(colorFilter);
        }

        public void setCornerRadius(float f5) {
            float round = Math.round(f5);
            if (this.mCornerRadius == round) {
                return;
            }
            this.mCornerRadius = round;
            this.mDirty = true;
            invalidateSelf();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setDither(boolean z4) {
            super.setDither(z4);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z4) {
            super.setFilterBitmap(z4);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspot(float f5, float f6) {
            super.setHotspot(f5, f6);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspotBounds(int i5, int i6, int i7, int i8) {
            super.setHotspotBounds(i5, i6, i7, i8);
        }

        public void setMaxShadowSize(float f5) {
            setShadowSize(this.mRawShadowSize, f5);
        }

        public final void setRotation(float f5) {
            if (this.mRotation != f5) {
                this.mRotation = f5;
                invalidateSelf();
            }
        }

        public void setShadowSize(float f5) {
            setShadowSize(f5, this.mRawMaxShadowSize);
        }

        public void setShadowSize(float f5, float f6) {
            if (f5 < 0.0f || f6 < 0.0f) {
                throw new IllegalArgumentException("invalid shadow size");
            }
            float even = toEven(f5);
            float even2 = toEven(f6);
            if (even > even2) {
                even = even2;
            }
            if (this.mRawShadowSize == even && this.mRawMaxShadowSize == even2) {
                return;
            }
            this.mRawShadowSize = even;
            this.mRawMaxShadowSize = even2;
            this.mShadowSize = Math.round(even * this.mShadowMultiplier);
            this.mMaxShadowSize = even2;
            this.mDirty = true;
            invalidateSelf();
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
            return super.setState(iArr);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTint(int i5) {
            super.setTint(i5);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
            super.setTintList(colorStateList);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
            super.setTintMode(mode);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean setVisible(boolean z4, boolean z5) {
            return super.setVisible(z4, z5);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper
        public /* bridge */ /* synthetic */ void setWrappedDrawable(Drawable drawable) {
            super.setWrappedDrawable(drawable);
        }

        @Override // com.blankj.utilcode.util.ShadowUtils.DrawableWrapper, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            super.unscheduleDrawable(drawable, runnable);
        }
    }

    public static void apply(View view, Config config) {
        if (view == null || config == null) {
            return;
        }
        Drawable background = view.getBackground();
        Object tag = view.getTag(-16);
        if (tag instanceof Drawable) {
            ViewCompat.setBackground(view, (Drawable) tag);
            return;
        }
        Drawable apply = config.apply(background);
        ViewCompat.setBackground(view, apply);
        view.setTag(-16, apply);
    }

    public static void apply(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            apply(view, new Config());
        }
    }
}
