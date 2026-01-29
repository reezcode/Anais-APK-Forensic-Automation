package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import v1.g;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes17.dex */
public class NavigationMenuItemView extends g implements MenuView.ItemView {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1117r = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    public int f1118h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1119i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1120j;

    /* renamed from: k, reason: collision with root package name */
    public final CheckedTextView f1121k;

    /* renamed from: l, reason: collision with root package name */
    public FrameLayout f1122l;

    /* renamed from: m, reason: collision with root package name */
    public MenuItemImpl f1123m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f1124n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1125o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f1126p;

    /* renamed from: q, reason: collision with root package name */
    public final a f1127q;

    /* loaded from: classes2.dex */
    public class a extends AccessibilityDelegateCompat {
        public a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCheckable(NavigationMenuItemView.this.f1120j);
        }
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.f1127q = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(comeliest.metempsychosis.pokelogan.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(comeliest.metempsychosis.pokelogan.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(comeliest.metempsychosis.pokelogan.R.id.design_menu_item_text);
        this.f1121k = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(checkedTextView, aVar);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f1122l == null) {
                this.f1122l = (FrameLayout) ((ViewStub) findViewById(comeliest.metempsychosis.pokelogan.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f1122l.removeAllViews();
            this.f1122l.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f1123m;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void initialize(@NonNull MenuItemImpl menuItemImpl, int i5) {
        LinearLayoutCompat.LayoutParams layoutParams;
        int i6;
        StateListDrawable stateListDrawable;
        this.f1123m = menuItemImpl;
        if (menuItemImpl.getItemId() > 0) {
            setId(menuItemImpl.getItemId());
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1117r, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            ViewCompat.setBackground(this, stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        if (this.f1123m.getTitle() == null && this.f1123m.getIcon() == null && this.f1123m.getActionView() != null) {
            this.f1121k.setVisibility(8);
            FrameLayout frameLayout = this.f1122l;
            if (frameLayout == null) {
                return;
            }
            layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
            i6 = -1;
        } else {
            this.f1121k.setVisibility(0);
            FrameLayout frameLayout2 = this.f1122l;
            if (frameLayout2 == null) {
                return;
            }
            layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            i6 = -2;
        }
        ((LinearLayout.LayoutParams) layoutParams).width = i6;
        this.f1122l.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        MenuItemImpl menuItemImpl = this.f1123m;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f1123m.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1117r);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.f1120j != z4) {
            this.f1120j = z4;
            this.f1127q.sendAccessibilityEvent(this.f1121k, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z4) {
        refreshDrawableState();
        this.f1121k.setChecked(z4);
    }

    public void setHorizontalPadding(int i5) {
        setPadding(i5, getPaddingTop(), i5, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f1125o) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                DrawableCompat.setTintList(drawable, this.f1124n);
            }
            int i5 = this.f1118h;
            drawable.setBounds(0, 0, i5, i5);
        } else if (this.f1119i) {
            if (this.f1126p == null) {
                Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), comeliest.metempsychosis.pokelogan.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.f1126p = drawable2;
                if (drawable2 != null) {
                    int i6 = this.f1118h;
                    drawable2.setBounds(0, 0, i6, i6);
                }
            }
            drawable = this.f1126p;
        }
        TextViewCompat.setCompoundDrawablesRelative(this.f1121k, drawable, null, null, null);
    }

    public void setIconPadding(int i5) {
        this.f1121k.setCompoundDrawablePadding(i5);
    }

    public void setIconSize(@Dimension int i5) {
        this.f1118h = i5;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1124n = colorStateList;
        this.f1125o = colorStateList != null;
        MenuItemImpl menuItemImpl = this.f1123m;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i5) {
        this.f1121k.setMaxLines(i5);
    }

    public void setNeedsEmptyIcon(boolean z4) {
        this.f1119i = z4;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void setShortcut(boolean z4, char c5) {
    }

    public void setTextAppearance(int i5) {
        TextViewCompat.setTextAppearance(this.f1121k, i5);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1121k.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        this.f1121k.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean showsIcon() {
        return true;
    }
}
