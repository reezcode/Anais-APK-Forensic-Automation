package k1;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import b2.k;
import b2.n;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes21.dex */
public class a extends CardView implements Checkable, n {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3801c = {R.attr.state_dragged};

    /* renamed from: b, reason: collision with root package name */
    public boolean f3802b;

    /* renamed from: k1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0041a {
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconGravity() {
        throw null;
    }

    @Dimension
    public int getCheckedIconMargin() {
        throw null;
    }

    @Dimension
    public int getCheckedIconSize() {
        throw null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        throw null;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        throw null;
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    @Dimension
    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 3);
        if (this.f3802b) {
            View.mergeDrawableStates(onCreateDrawableState, f3801c);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(false);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i5) {
        ColorStateList.valueOf(i5);
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f5) {
        super.setCardElevation(f5);
        throw null;
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z4) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        throw null;
    }

    public void setCheckedIconGravity(int i5) {
        throw null;
    }

    public void setCheckedIconMargin(@Dimension int i5) {
        throw null;
    }

    public void setCheckedIconMarginResource(@DimenRes int i5) {
        if (i5 == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i5);
        throw null;
    }

    public void setCheckedIconResource(@DrawableRes int i5) {
        AppCompatResources.getDrawable(getContext(), i5);
        throw null;
    }

    public void setCheckedIconSize(@Dimension int i5) {
        throw null;
    }

    public void setCheckedIconSizeResource(@DimenRes int i5) {
        if (i5 == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i5);
        throw null;
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z4) {
        super.setClickable(z4);
    }

    @Override // androidx.cardview.widget.CardView
    public final void setContentPadding(int i5, int i6, int i7, int i8) {
        throw null;
    }

    public void setDragged(boolean z4) {
        if (this.f3802b != z4) {
            this.f3802b = z4;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                throw null;
            }
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f5) {
        super.setMaxCardElevation(f5);
        throw null;
    }

    public void setOnCheckedChangeListener(@Nullable InterfaceC0041a interfaceC0041a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z4) {
        super.setPreventCornerOverlap(z4);
        throw null;
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f5) {
        super.setRadius(f5);
        throw null;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(@ColorRes int i5) {
        AppCompatResources.getColorStateList(getContext(), i5);
        throw null;
    }

    @Override // b2.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        setClipToOutline(kVar.d(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(@ColorInt int i5) {
        setStrokeColor(ColorStateList.valueOf(i5));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(@Dimension int i5) {
        throw null;
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z4) {
        super.setUseCompatPadding(z4);
        throw null;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
    }
}
