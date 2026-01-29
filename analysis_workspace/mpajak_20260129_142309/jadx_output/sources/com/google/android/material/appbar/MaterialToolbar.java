package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import b2.h;
import comeliest.metempsychosis.pokelogan.R;
import i.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v1.m;
import v1.n;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: g, reason: collision with root package name */
    public static final ImageView.ScaleType[] f725g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f726b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f727c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f728d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public ImageView.ScaleType f729e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Boolean f730f;

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(f2.a.a(context, attributeSet, R.attr.toolbarStyle, 2131756060), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        TypedArray d5 = m.d(context2, attributeSet, g.f3219y, R.attr.toolbarStyle, 2131756060, new int[0]);
        if (d5.hasValue(2)) {
            setNavigationIconTint(d5.getColor(2, -1));
        }
        this.f727c = d5.getBoolean(4, false);
        this.f728d = d5.getBoolean(3, false);
        int i6 = d5.getInt(1, -1);
        if (i6 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f725g;
            if (i6 < scaleTypeArr.length) {
                this.f729e = scaleTypeArr[i6];
            }
        }
        if (d5.hasValue(0)) {
            this.f730f = Boolean.valueOf(d5.getBoolean(0, false));
        }
        d5.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            b2.g gVar = new b2.g();
            gVar.o(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.m(context2);
            gVar.n(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, gVar);
        }
    }

    public final void a(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i5 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i6 = measuredWidth2 + i5;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i5, 0), Math.max(i6 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i5 += max;
            i6 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i6 - i5, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i5, view.getTop(), i6, view.getBottom());
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.f729e;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.f726b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof b2.g) {
            h.b(this, (b2.g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z4, i5, i6, i7, i8);
        int i9 = 0;
        ImageView imageView2 = null;
        if (this.f727c || this.f728d) {
            List<TextView> a5 = n.a(this, getTitle());
            TextView textView = ((ArrayList) a5).isEmpty() ? null : (TextView) Collections.min(a5, n.f5635a);
            List<TextView> a6 = n.a(this, getSubtitle());
            TextView textView2 = ((ArrayList) a6).isEmpty() ? null : (TextView) Collections.max(a6, n.f5635a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i10 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f727c && textView != null) {
                    a(textView, pair);
                }
                if (this.f728d && textView2 != null) {
                    a(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i9 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i9);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i9++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f730f;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f729e;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f5) {
        super.setElevation(f5);
        Drawable background = getBackground();
        if (background instanceof b2.g) {
            ((b2.g) background).n(f5);
        }
    }

    public void setLogoAdjustViewBounds(boolean z4) {
        Boolean bool = this.f730f;
        if (bool == null || bool.booleanValue() != z4) {
            this.f730f = Boolean.valueOf(z4);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f729e != scaleType) {
            this.f729e = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f726b != null) {
            drawable = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(drawable, this.f726b.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i5) {
        this.f726b = Integer.valueOf(i5);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z4) {
        if (this.f728d != z4) {
            this.f728d = z4;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z4) {
        if (this.f727c != z4) {
            this.f727c = z4;
            requestLayout();
        }
    }
}
