package v1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import comeliest.metempsychosis.pokelogan.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes25.dex */
public class f extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public int f5593b;

    /* renamed from: c, reason: collision with root package name */
    public int f5594c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5595d;

    /* renamed from: e, reason: collision with root package name */
    public int f5596e;

    public f(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f5595d = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, i.g.f3207m, 0, 0);
        this.f5593b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f5594c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean a() {
        return this.f5595d;
    }

    public int getItemSpacing() {
        return this.f5594c;
    }

    public int getLineSpacing() {
        return this.f5593b;
    }

    public int getRowCount() {
        return this.f5596e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (getChildCount() == 0) {
            this.f5596e = 0;
            return;
        }
        this.f5596e = 1;
        boolean z5 = ViewCompat.getLayoutDirection(this) == 1;
        int paddingRight = z5 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z5 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i11 = (i7 - i5) - paddingLeft;
        int i12 = paddingRight;
        int i13 = paddingTop;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i10 = MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
                    i9 = MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i12 + i10;
                if (!this.f5595d && measuredWidth > i11) {
                    i13 = this.f5593b + paddingTop;
                    this.f5596e++;
                    i12 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f5596e - 1));
                int i15 = i12 + i10;
                int measuredWidth2 = childAt.getMeasuredWidth() + i15;
                int measuredHeight = childAt.getMeasuredHeight() + i13;
                if (z5) {
                    i15 = i11 - measuredWidth2;
                    measuredWidth2 = (i11 - i12) - i10;
                }
                childAt.layout(i15, i13, measuredWidth2, measuredHeight);
                i12 += childAt.getMeasuredWidth() + i10 + i9 + this.f5594c;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        int size = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i6);
        int i9 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i9 - getPaddingRight();
        int i10 = paddingTop;
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i5, i6);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i8 = marginLayoutParams.leftMargin + 0;
                    i7 = marginLayoutParams.rightMargin + 0;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i8 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i10 = paddingTop + this.f5593b;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i8;
                int measuredHeight = childAt.getMeasuredHeight() + i10;
                if (measuredWidth > i11) {
                    i11 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i8 + i7 + this.f5594c + paddingLeft;
                if (i12 == getChildCount() - 1) {
                    i11 += i7;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i11;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(paddingRight2, size);
        } else if (mode != 1073741824) {
            size = paddingRight2;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i5) {
        this.f5594c = i5;
    }

    public void setLineSpacing(int i5) {
        this.f5593b = i5;
    }

    public void setSingleLine(boolean z4) {
        this.f5595d = z4;
    }
}
