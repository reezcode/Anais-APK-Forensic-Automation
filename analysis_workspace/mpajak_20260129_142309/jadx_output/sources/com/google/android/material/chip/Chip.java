package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import b2.k;
import b2.n;
import com.google.android.material.chip.a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import v1.h;
import y1.d;
import y1.f;

/* loaded from: classes6.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0016a, n, h<Chip> {

    /* renamed from: u, reason: collision with root package name */
    public static final Rect f854u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f855v = {R.attr.state_selected};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f856w = {R.attr.state_checkable};

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public com.google.android.material.chip.a f857b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public InsetDrawable f858c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public RippleDrawable f859d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public View.OnClickListener f860e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f861f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public h.a<Chip> f862g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f863h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f864i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f865j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f866k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f867l;

    /* renamed from: m, reason: collision with root package name */
    public int f868m;

    /* renamed from: n, reason: collision with root package name */
    @Dimension(unit = 1)
    public int f869n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public CharSequence f870o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final c f871p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f872q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f873r;

    /* renamed from: s, reason: collision with root package name */
    public final RectF f874s;

    /* renamed from: t, reason: collision with root package name */
    public final a f875t;

    /* loaded from: classes3.dex */
    public class a extends f {
        public a() {
        }

        @Override // y1.f
        public final void a(int i5) {
        }

        @Override // y1.f
        public final void b(@NonNull Typeface typeface, boolean z4) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f857b;
            chip.setText(aVar.F0 ? aVar.G : chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        
            if (r1.f5558a.a(r0) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        
            r1.f5558a.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            if (r2.e(r0, r2.f5563e) != false) goto L11;
         */
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCheckedChanged(android.widget.CompoundButton r5, boolean r6) {
            /*
                r4 = this;
                com.google.android.material.chip.Chip r0 = com.google.android.material.chip.Chip.this
                v1.h$a<com.google.android.material.chip.Chip> r1 = r0.f862g
                if (r1 == 0) goto L25
                v1.a r1 = (v1.a) r1
                java.util.Objects.requireNonNull(r1)
                if (r6 == 0) goto L16
                v1.b r2 = r1.f5558a
                boolean r0 = r2.a(r0)
                if (r0 == 0) goto L25
                goto L20
            L16:
                v1.b r2 = r1.f5558a
                boolean r3 = r2.f5563e
                boolean r0 = r2.e(r0, r3)
                if (r0 == 0) goto L25
            L20:
                v1.b r0 = r1.f5558a
                r0.d()
            L25:
                com.google.android.material.chip.Chip r0 = com.google.android.material.chip.Chip.this
                android.widget.CompoundButton$OnCheckedChangeListener r0 = r0.f861f
                if (r0 == 0) goto L2e
                r0.onCheckedChanged(r5, r6)
            L2e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.b.onCheckedChanged(android.widget.CompoundButton, boolean):void");
        }
    }

    /* loaded from: classes2.dex */
    public class c extends ExploreByTouchHelper {
        public c(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final int getVirtualViewAt(float f5, float f6) {
            Chip chip = Chip.this;
            Rect rect = Chip.f854u;
            return (chip.e() && Chip.this.getCloseIconTouchBounds().contains(f5, f6)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void getVisibleVirtualViews(@NonNull List<Integer> list) {
            boolean z4 = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.f854u;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                com.google.android.material.chip.a aVar = chip2.f857b;
                if (aVar != null && aVar.M) {
                    z4 = true;
                }
                if (!z4 || chip2.f860e == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final boolean onPerformActionForVirtualView(int i5, int i6, Bundle bundle) {
            if (i6 != 16) {
                return false;
            }
            if (i5 == 0) {
                return Chip.this.performClick();
            }
            if (i5 == 1) {
                return Chip.this.g();
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setCheckable(Chip.this.f());
            accessibilityNodeInfoCompat.setClickable(Chip.this.isClickable());
            accessibilityNodeInfoCompat.setClassName(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityNodeInfoCompat.setText(text);
            } else {
                accessibilityNodeInfoCompat.setContentDescription(text);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void onPopulateNodeForVirtualView(int i5, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i5 != 1) {
                accessibilityNodeInfoCompat.setContentDescription("");
                accessibilityNodeInfoCompat.setBoundsInParent(Chip.f854u);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                closeIconContentDescription = context.getString(comeliest.metempsychosis.pokelogan.R.string.mtrl_chip_close_icon_content_description, objArr).trim();
            }
            accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
            accessibilityNodeInfoCompat.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            accessibilityNodeInfoCompat.setEnabled(Chip.this.isEnabled());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void onVirtualViewKeyboardFocusChanged(int i5, boolean z4) {
            if (i5 == 1) {
                Chip chip = Chip.this;
                chip.f866k = z4;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, comeliest.metempsychosis.pokelogan.R.attr.chipStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f874s.setEmpty();
        if (e() && this.f860e != null) {
            com.google.android.material.chip.a aVar = this.f857b;
            aVar.B(aVar.getBounds(), this.f874s);
        }
        return this.f874s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f873r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f873r;
    }

    @Nullable
    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.f901m0.f5631f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z4) {
        if (this.f865j != z4) {
            this.f865j = z4;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z4) {
        if (this.f864i != z4) {
            this.f864i = z4;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0016a
    public final void a() {
        d(this.f869n);
        requestLayout();
        invalidateOutline();
    }

    public final boolean d(@Dimension int i5) {
        this.f869n = i5;
        if (!this.f867l) {
            if (this.f858c != null) {
                h();
            } else {
                j();
            }
            return false;
        }
        int max = Math.max(0, i5 - ((int) this.f857b.B));
        int max2 = Math.max(0, i5 - this.f857b.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f858c != null) {
                h();
            } else {
                j();
            }
            return false;
        }
        int i6 = max2 > 0 ? max2 / 2 : 0;
        int i7 = max > 0 ? max / 2 : 0;
        if (this.f858c != null) {
            Rect rect = new Rect();
            this.f858c.getPadding(rect);
            if (rect.top == i7 && rect.bottom == i7 && rect.left == i6 && rect.right == i6) {
                j();
                return true;
            }
        }
        if (getMinHeight() != i5) {
            setMinHeight(i5);
        }
        if (getMinWidth() != i5) {
            setMinWidth(i5);
        }
        this.f858c = new InsetDrawable((Drawable) this.f857b, i6, i7, i6, i7);
        j();
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return !this.f872q ? super.dispatchHoverEvent(motionEvent) : this.f871p.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f872q) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f871p.dispatchKeyEvent(keyEvent) || this.f871p.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f857b;
        boolean z4 = false;
        int i5 = 0;
        z4 = false;
        if (aVar != null && com.google.android.material.chip.a.H(aVar.N)) {
            com.google.android.material.chip.a aVar2 = this.f857b;
            ?? isEnabled = isEnabled();
            int i6 = isEnabled;
            if (this.f866k) {
                i6 = isEnabled + 1;
            }
            int i7 = i6;
            if (this.f865j) {
                i7 = i6 + 1;
            }
            int i8 = i7;
            if (this.f864i) {
                i8 = i7 + 1;
            }
            int i9 = i8;
            if (isChecked()) {
                i9 = i8 + 1;
            }
            int[] iArr = new int[i9];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i5 = 1;
            }
            if (this.f866k) {
                iArr[i5] = 16842908;
                i5++;
            }
            if (this.f865j) {
                iArr[i5] = 16843623;
                i5++;
            }
            if (this.f864i) {
                iArr[i5] = 16842919;
                i5++;
            }
            if (isChecked()) {
                iArr[i5] = 16842913;
            }
            z4 = aVar2.d0(iArr);
        }
        if (z4) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.f857b;
        return (aVar == null || aVar.E() == null) ? false : true;
    }

    public final boolean f() {
        com.google.android.material.chip.a aVar = this.f857b;
        return aVar != null && aVar.S;
    }

    @CallSuper
    public final boolean g() {
        boolean z4 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f860e;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z4 = true;
        }
        if (this.f872q) {
            this.f871p.sendEventForVirtualView(1, 1);
        }
        return z4;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f870o)) {
            return this.f870o;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f882i.f5562d) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f858c;
        return insetDrawable == null ? this.f857b : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.U;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return Math.max(0.0f, aVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f857b;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.f894f0;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar == null || (drawable = aVar.I) == null) {
            return null;
        }
        return DrawableCompat.unwrap(drawable);
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.K;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.J;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.Y;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.E();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.f893e0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.f892d0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.P;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.E0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(@NonNull Rect rect) {
        if (this.f872q && (this.f871p.getKeyboardFocusedVirtualViewId() == 1 || this.f871p.getAccessibilityFocusedVirtualViewId() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @Nullable
    public f1.h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.X;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.f889a0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.Z;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.F;
        }
        return null;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f857b.f324b.f347a;
    }

    @Nullable
    public f1.h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.W;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.f891c0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            return aVar.f890b0;
        }
        return 0.0f;
    }

    public final void h() {
        if (this.f858c != null) {
            this.f858c = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            j();
        }
    }

    public final void i() {
        if (e()) {
            com.google.android.material.chip.a aVar = this.f857b;
            if ((aVar != null && aVar.M) && this.f860e != null) {
                ViewCompat.setAccessibilityDelegate(this, this.f871p);
                this.f872q = true;
                return;
            }
        }
        ViewCompat.setAccessibilityDelegate(this, null);
        this.f872q = false;
    }

    public final void j() {
        int[] iArr = z1.b.f6114a;
        k();
    }

    public final void k() {
        this.f859d = new RippleDrawable(z1.b.a(this.f857b.F), getBackgroundDrawable(), null);
        this.f857b.n0();
        ViewCompat.setBackground(this, this.f859d);
        l();
    }

    public final void l() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f857b) == null) {
            return;
        }
        int C = (int) (aVar.C() + aVar.f894f0 + aVar.f891c0);
        com.google.android.material.chip.a aVar2 = this.f857b;
        int z4 = (int) (aVar2.z() + aVar2.Y + aVar2.f890b0);
        if (this.f858c != null) {
            Rect rect = new Rect();
            this.f858c.getPadding(rect);
            z4 += rect.left;
            C += rect.right;
        }
        ViewCompat.setPaddingRelative(this, z4, getPaddingTop(), C, getPaddingBottom());
    }

    public final void m() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.f875t);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b2.h.b(this, this.f857b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f855v);
        }
        if (f()) {
            View.mergeDrawableStates(onCreateDrawableState, f856w);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i5, Rect rect) {
        super.onFocusChanged(z4, i5, rect);
        if (this.f872q) {
            this.f871p.onFocusChanged(z4, i5, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i5;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            if (chipGroup.f5595d) {
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i6 >= chipGroup.getChildCount()) {
                        i7 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i6) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i6)) == this) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    i6++;
                }
                i5 = i7;
            } else {
                i5 = -1;
            }
            Object tag = getTag(comeliest.metempsychosis.pokelogan.R.id.row_index_key);
            wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i5, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i5) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), PointerIconCompat.TYPE_HAND);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        if (this.f868m != i5) {
            this.f868m = i5;
            l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f864i
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f864i
            if (r0 == 0) goto L34
            r5.g()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f870o = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f859d) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f859d) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i5) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z4) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.K(z4);
        }
    }

    public void setCheckableResource(@BoolRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.K(aVar.f895g0.getResources().getBoolean(i5));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar == null) {
            this.f863h = z4;
        } else if (aVar.S) {
            super.setChecked(z4);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.L(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z4) {
        setCheckedIconVisible(z4);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i5) {
        setCheckedIconVisible(i5);
    }

    public void setCheckedIconResource(@DrawableRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.L(AppCompatResources.getDrawable(aVar.f895g0, i5));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.M(AppCompatResources.getColorStateList(aVar.f895g0, i5));
        }
    }

    public void setCheckedIconVisible(@BoolRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.N(aVar.f895g0.getResources().getBoolean(i5));
        }
    }

    public void setCheckedIconVisible(boolean z4) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.N(z4);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.O(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.O(AppCompatResources.getColorStateList(aVar.f895g0, i5));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.P(f5);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.P(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f857b;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.D0 = new WeakReference<>(null);
            }
            this.f857b = aVar;
            aVar.F0 = false;
            Objects.requireNonNull(aVar);
            aVar.D0 = new WeakReference<>(this);
            d(this.f869n);
        }
    }

    public void setChipEndPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.Q(f5);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.Q(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.R(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z4) {
        setChipIconVisible(z4);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i5) {
        setChipIconVisible(i5);
    }

    public void setChipIconResource(@DrawableRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.R(AppCompatResources.getDrawable(aVar.f895g0, i5));
        }
    }

    public void setChipIconSize(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.S(f5);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.S(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.T(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.T(AppCompatResources.getColorStateList(aVar.f895g0, i5));
        }
    }

    public void setChipIconVisible(@BoolRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.U(aVar.f895g0.getResources().getBoolean(i5));
        }
    }

    public void setChipIconVisible(boolean z4) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.U(z4);
        }
    }

    public void setChipMinHeight(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.V(f5);
        }
    }

    public void setChipMinHeightResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.V(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    public void setChipStartPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.W(f5);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.W(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.X(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.X(AppCompatResources.getColorStateList(aVar.f895g0, i5));
        }
    }

    public void setChipStrokeWidth(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.Y(f5);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.Y(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i5) {
        setText(getResources().getString(i5));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.Z(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar == null || aVar.R == charSequence) {
            return;
        }
        aVar.R = BidiFormatter.getInstance().unicodeWrap(charSequence);
        aVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z4) {
        setCloseIconVisible(z4);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i5) {
        setCloseIconVisible(i5);
    }

    public void setCloseIconEndPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.a0(f5);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.a0(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    public void setCloseIconResource(@DrawableRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.Z(AppCompatResources.getDrawable(aVar.f895g0, i5));
        }
        i();
    }

    public void setCloseIconSize(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.b0(f5);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.b0(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    public void setCloseIconStartPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.c0(f5);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.c0(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.e0(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.e0(AppCompatResources.getColorStateList(aVar.f895g0, i5));
        }
    }

    public void setCloseIconVisible(@BoolRes int i5) {
        setCloseIconVisible(getResources().getBoolean(i5));
    }

    public void setCloseIconVisible(boolean z4) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.f0(z4);
        }
        i();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i5, i6, i7, i8);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i5, i6, i7, i8);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f5) {
        super.setElevation(f5);
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.n(f5);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f857b == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.E0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        this.f867l = z4;
        d(this.f869n);
    }

    @Override // android.widget.TextView
    public void setGravity(int i5) {
        if (i5 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i5);
        }
    }

    public void setHideMotionSpec(@Nullable f1.h hVar) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.X = hVar;
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.X = f1.h.a(aVar.f895g0, i5);
        }
    }

    public void setIconEndPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.g0(f5);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.g0(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    public void setIconStartPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.h0(f5);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.h0(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    @Override // v1.h
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable h.a<Chip> aVar) {
        this.f862g = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
        if (this.f857b == null) {
            return;
        }
        super.setLayoutDirection(i5);
    }

    @Override // android.widget.TextView
    public void setLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i5);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i5);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i5) {
        super.setMaxWidth(i5);
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.G0 = i5;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i5) {
        if (i5 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i5);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f861f = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f860e = onClickListener;
        i();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.i0(colorStateList);
        }
        if (this.f857b.B0) {
            return;
        }
        k();
    }

    public void setRippleColorResource(@ColorRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.i0(AppCompatResources.getColorStateList(aVar.f895g0, i5));
            if (this.f857b.B0) {
                return;
            }
            k();
        }
    }

    @Override // b2.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f857b.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(@Nullable f1.h hVar) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.W = hVar;
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.W = f1.h.a(aVar.f895g0, i5);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        if (!z4) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z4);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.F0 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f857b;
        if (aVar2 != null) {
            aVar2.j0(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i5) {
        super.setTextAppearance(i5);
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.k0(new d(aVar.f895g0, i5));
        }
        m();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.k0(new d(aVar.f895g0, i5));
        }
        m();
    }

    public void setTextAppearance(@Nullable d dVar) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.k0(dVar);
        }
        m();
    }

    public void setTextAppearanceResource(@StyleRes int i5) {
        setTextAppearance(getContext(), i5);
    }

    public void setTextEndPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.l0(f5);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.l0(aVar.f895g0.getResources().getDimension(i5));
        }
    }

    public void setTextStartPadding(float f5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.m0(f5);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i5) {
        com.google.android.material.chip.a aVar = this.f857b;
        if (aVar != null) {
            aVar.m0(aVar.f895g0.getResources().getDimension(i5));
        }
    }
}
