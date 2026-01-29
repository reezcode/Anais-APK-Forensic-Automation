package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.AppCompatTextView;
import f2.a;
import i.g;
import y1.b;

/* loaded from: classes22.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (b(context2)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = g.f3218x;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int c5 = c(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (c5 != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                a(theme, resourceId);
            }
        }
    }

    public static boolean b(Context context) {
        TypedValue a5 = b.a(context, comeliest.metempsychosis.pokelogan.R.attr.textAppearanceLineHeightEnabled);
        return (a5 != null && a5.type == 18 && a5.data == 0) ? false : true;
    }

    public static int c(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull @StyleableRes int... iArr) {
        int i5 = -1;
        for (int i6 = 0; i6 < iArr.length && i5 < 0; i6++) {
            int i7 = iArr[i6];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i7, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i5 = dimensionPixelSize;
            } else {
                i5 = typedArray.getDimensionPixelSize(i7, -1);
            }
        }
        return i5;
    }

    public final void a(@NonNull Resources.Theme theme, int i5) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i5, g.f3217w);
        int c5 = c(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (c5 >= 0) {
            setLineHeight(c5);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i5) {
        super.setTextAppearance(context, i5);
        if (b(context)) {
            a(context.getTheme(), i5);
        }
    }
}
