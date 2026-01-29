package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import b2.h;
import b2.k;
import b2.n;
import i.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v1.m;
import v1.r;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, n {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f819o = {R.attr.state_checkable};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f820p = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final j1.a f821b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<a> f822c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public b f823d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f824e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public ColorStateList f825f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public Drawable f826g;

    /* renamed from: h, reason: collision with root package name */
    @Px
    public int f827h;

    /* renamed from: i, reason: collision with root package name */
    @Px
    public int f828i;

    /* renamed from: j, reason: collision with root package name */
    @Px
    public int f829j;

    /* renamed from: k, reason: collision with root package name */
    @Px
    public int f830k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f831l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f832m;

    /* renamed from: n, reason: collision with root package name */
    public int f833n;

    /* loaded from: classes16.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes11.dex */
    public interface b {
    }

    /* loaded from: classes20.dex */
    public static class c extends AbsSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public boolean f834b;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final c createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i5) {
                return new c[i5];
            }
        }

        public c(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f834b = parcel.readInt() == 1;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f834b ? 1 : 0);
        }
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, comeliest.metempsychosis.pokelogan.R.attr.materialButtonStyle);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(f2.a.a(context, attributeSet, comeliest.metempsychosis.pokelogan.R.attr.materialButtonStyle, 2131755961), attributeSet, comeliest.metempsychosis.pokelogan.R.attr.materialButtonStyle);
        this.f822c = new LinkedHashSet<>();
        this.f831l = false;
        this.f832m = false;
        Context context2 = getContext();
        TypedArray d5 = m.d(context2, attributeSet, g.f3210p, comeliest.metempsychosis.pokelogan.R.attr.materialButtonStyle, 2131755961, new int[0]);
        this.f830k = d5.getDimensionPixelSize(12, 0);
        this.f824e = r.b(d5.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f825f = y1.c.a(getContext(), d5, 14);
        this.f826g = y1.c.c(getContext(), d5, 10);
        this.f833n = d5.getInteger(11, 1);
        this.f827h = d5.getDimensionPixelSize(13, 0);
        j1.a aVar = new j1.a(this, new k(k.b(context2, attributeSet, comeliest.metempsychosis.pokelogan.R.attr.materialButtonStyle, 2131755961)));
        this.f821b = aVar;
        aVar.f3428c = d5.getDimensionPixelOffset(1, 0);
        aVar.f3429d = d5.getDimensionPixelOffset(2, 0);
        aVar.f3430e = d5.getDimensionPixelOffset(3, 0);
        aVar.f3431f = d5.getDimensionPixelOffset(4, 0);
        if (d5.hasValue(8)) {
            int dimensionPixelSize = d5.getDimensionPixelSize(8, -1);
            aVar.f3432g = dimensionPixelSize;
            aVar.c(aVar.f3427b.e(dimensionPixelSize));
            aVar.f3441p = true;
        }
        aVar.f3433h = d5.getDimensionPixelSize(20, 0);
        aVar.f3434i = r.b(d5.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f3435j = y1.c.a(getContext(), d5, 6);
        aVar.f3436k = y1.c.a(getContext(), d5, 19);
        aVar.f3437l = y1.c.a(getContext(), d5, 16);
        aVar.f3442q = d5.getBoolean(5, false);
        aVar.f3444s = d5.getDimensionPixelSize(9, 0);
        int paddingStart = ViewCompat.getPaddingStart(this);
        int paddingTop = getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this);
        int paddingBottom = getPaddingBottom();
        if (d5.hasValue(0)) {
            aVar.f3440o = true;
            setSupportBackgroundTintList(aVar.f3435j);
            setSupportBackgroundTintMode(aVar.f3434i);
        } else {
            aVar.e();
        }
        ViewCompat.setPaddingRelative(this, paddingStart + aVar.f3428c, paddingTop + aVar.f3430e, paddingEnd + aVar.f3429d, paddingBottom + aVar.f3431f);
        d5.recycle();
        setCompoundDrawablePadding(this.f830k);
        g(this.f826g != null);
    }

    @NonNull
    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        j1.a aVar = this.f821b;
        return aVar != null && aVar.f3442q;
    }

    public final boolean b() {
        int i5 = this.f833n;
        return i5 == 3 || i5 == 4;
    }

    public final boolean c() {
        int i5 = this.f833n;
        return i5 == 1 || i5 == 2;
    }

    public final boolean d() {
        int i5 = this.f833n;
        return i5 == 16 || i5 == 32;
    }

    public final boolean e() {
        j1.a aVar = this.f821b;
        return (aVar == null || aVar.f3440o) ? false : true;
    }

    public final void f() {
        if (c()) {
            TextViewCompat.setCompoundDrawablesRelative(this, this.f826g, null, null, null);
        } else if (b()) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, null, this.f826g, null);
        } else if (d()) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, this.f826g, null, null);
        }
    }

    public final void g(boolean z4) {
        Drawable drawable = this.f826g;
        boolean z5 = true;
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f826g = mutate;
            DrawableCompat.setTintList(mutate, this.f825f);
            PorterDuff.Mode mode = this.f824e;
            if (mode != null) {
                DrawableCompat.setTintMode(this.f826g, mode);
            }
            int i5 = this.f827h;
            if (i5 == 0) {
                i5 = this.f826g.getIntrinsicWidth();
            }
            int i6 = this.f827h;
            if (i6 == 0) {
                i6 = this.f826g.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f826g;
            int i7 = this.f828i;
            int i8 = this.f829j;
            drawable2.setBounds(i7, i8, i5 + i7, i6 + i8);
            this.f826g.setVisible(true, z4);
        }
        if (z4) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!c() || drawable3 == this.f826g) && ((!b() || drawable5 == this.f826g) && (!d() || drawable4 == this.f826g))) {
            z5 = false;
        }
        if (z5) {
            f();
        }
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (e()) {
            return this.f821b.f3432g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f826g;
    }

    public int getIconGravity() {
        return this.f833n;
    }

    @Px
    public int getIconPadding() {
        return this.f830k;
    }

    @Px
    public int getIconSize() {
        return this.f827h;
    }

    public ColorStateList getIconTint() {
        return this.f825f;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f824e;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f821b.f3431f;
    }

    @Dimension
    public int getInsetTop() {
        return this.f821b.f3430e;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f821b.f3437l;
        }
        return null;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        if (e()) {
            return this.f821b.f3427b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f821b.f3436k;
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (e()) {
            return this.f821b.f3433h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f821b.f3435j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f821b.f3434i : super.getSupportBackgroundTintMode();
    }

    public final void h(int i5, int i6) {
        if (this.f826g == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f828i = 0;
                if (this.f833n == 16) {
                    this.f829j = 0;
                    g(false);
                    return;
                }
                int i7 = this.f827h;
                if (i7 == 0) {
                    i7 = this.f826g.getIntrinsicHeight();
                }
                int textHeight = (((((i6 - getTextHeight()) - getPaddingTop()) - i7) - this.f830k) - getPaddingBottom()) / 2;
                if (this.f829j != textHeight) {
                    this.f829j = textHeight;
                    g(false);
                }
                return;
            }
            return;
        }
        this.f829j = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i8 = this.f833n;
        if (i8 == 1 || i8 == 3 || ((i8 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i8 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f828i = 0;
            g(false);
            return;
        }
        int i9 = this.f827h;
        if (i9 == 0) {
            i9 = this.f826g.getIntrinsicWidth();
        }
        int textWidth = ((((i5 - getTextWidth()) - ViewCompat.getPaddingEnd(this)) - i9) - this.f830k) - ViewCompat.getPaddingStart(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textWidth /= 2;
        }
        if ((ViewCompat.getLayoutDirection(this) == 1) != (this.f833n == 4)) {
            textWidth = -textWidth;
        }
        if (this.f828i != textWidth) {
            this.f828i = textWidth;
            g(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f831l;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            h.b(this, this.f821b.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f819o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f820p);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        j1.a aVar;
        super.onLayout(z4, i5, i6, i7, i8);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f821b) != null) {
            int i9 = i8 - i6;
            int i10 = i7 - i5;
            Drawable drawable = aVar.f3438m;
            if (drawable != null) {
                drawable.setBounds(aVar.f3428c, aVar.f3430e, i10 - aVar.f3429d, i9 - aVar.f3431f);
            }
        }
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setChecked(cVar.f834b);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f834b = this.f831l;
        return cVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        super.onTextChanged(charSequence, i5, i6, i7);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f826g != null) {
            if (this.f826g.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i5) {
        if (!e()) {
            super.setBackgroundColor(i5);
            return;
        }
        j1.a aVar = this.f821b;
        if (aVar.b(false) != null) {
            aVar.b(false).setTint(i5);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (e()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            j1.a aVar = this.f821b;
            aVar.f3440o = true;
            aVar.f3426a.setSupportBackgroundTintList(aVar.f3435j);
            aVar.f3426a.setSupportBackgroundTintMode(aVar.f3434i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i5) {
        setBackgroundDrawable(i5 != 0 ? AppCompatResources.getDrawable(getContext(), i5) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z4) {
        if (e()) {
            this.f821b.f3442q = z4;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (a() && isEnabled() && this.f831l != z4) {
            this.f831l = z4;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z5 = this.f831l;
                if (!materialButtonToggleGroup.f841g) {
                    materialButtonToggleGroup.b(getId(), z5);
                }
            }
            if (this.f832m) {
                return;
            }
            this.f832m = true;
            Iterator<a> it = this.f822c.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f832m = false;
        }
    }

    public void setCornerRadius(@Px int i5) {
        if (e()) {
            j1.a aVar = this.f821b;
            if (aVar.f3441p && aVar.f3432g == i5) {
                return;
            }
            aVar.f3432g = i5;
            aVar.f3441p = true;
            aVar.c(aVar.f3427b.e(i5));
        }
    }

    public void setCornerRadiusResource(@DimenRes int i5) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i5));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f5) {
        super.setElevation(f5);
        if (e()) {
            this.f821b.b(false).n(f5);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f826g != drawable) {
            this.f826g = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i5) {
        if (this.f833n != i5) {
            this.f833n = i5;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i5) {
        if (this.f830k != i5) {
            this.f830k = i5;
            setCompoundDrawablePadding(i5);
        }
    }

    public void setIconResource(@DrawableRes int i5) {
        setIcon(i5 != 0 ? AppCompatResources.getDrawable(getContext(), i5) : null);
    }

    public void setIconSize(@Px int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f827h != i5) {
            this.f827h = i5;
            g(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f825f != colorStateList) {
            this.f825f = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f824e != mode) {
            this.f824e = mode;
            g(false);
        }
    }

    public void setIconTintResource(@ColorRes int i5) {
        setIconTint(AppCompatResources.getColorStateList(getContext(), i5));
    }

    public void setInsetBottom(@Dimension int i5) {
        j1.a aVar = this.f821b;
        aVar.d(aVar.f3430e, i5);
    }

    public void setInsetTop(@Dimension int i5) {
        j1.a aVar = this.f821b;
        aVar.d(i5, aVar.f3431f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable b bVar) {
        this.f823d = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        b bVar = this.f823d;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z4);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (e()) {
            j1.a aVar = this.f821b;
            if (aVar.f3437l != colorStateList) {
                aVar.f3437l = colorStateList;
                boolean z4 = j1.a.f3424t;
                if (z4 && (aVar.f3426a.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) aVar.f3426a.getBackground()).setColor(z1.b.a(colorStateList));
                } else {
                    if (z4 || !(aVar.f3426a.getBackground() instanceof z1.a)) {
                        return;
                    }
                    ((z1.a) aVar.f3426a.getBackground()).setTintList(z1.b.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int i5) {
        if (e()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i5));
        }
    }

    @Override // b2.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f821b.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z4) {
        if (e()) {
            j1.a aVar = this.f821b;
            aVar.f3439n = z4;
            aVar.f();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (e()) {
            j1.a aVar = this.f821b;
            if (aVar.f3436k != colorStateList) {
                aVar.f3436k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i5) {
        if (e()) {
            setStrokeColor(AppCompatResources.getColorStateList(getContext(), i5));
        }
    }

    public void setStrokeWidth(@Px int i5) {
        if (e()) {
            j1.a aVar = this.f821b;
            if (aVar.f3433h != i5) {
                aVar.f3433h = i5;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i5) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i5));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        j1.a aVar = this.f821b;
        if (aVar.f3435j != colorStateList) {
            aVar.f3435j = colorStateList;
            if (aVar.b(false) != null) {
                DrawableCompat.setTintList(aVar.b(false), aVar.f3435j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        j1.a aVar = this.f821b;
        if (aVar.f3434i != mode) {
            aVar.f3434i = mode;
            if (aVar.b(false) == null || aVar.f3434i == null) {
                return;
            }
            DrawableCompat.setTintMode(aVar.b(false), aVar.f3434i);
        }
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i5) {
        super.setTextAlignment(i5);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f831l);
    }
}
