package v1;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes8.dex */
public class g extends LinearLayoutCompat {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Drawable f5597b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f5598c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f5599d;

    /* renamed from: e, reason: collision with root package name */
    public int f5600e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5601f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5602g;

    public g(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, 0);
        this.f5598c = new Rect();
        this.f5599d = new Rect();
        this.f5600e = 119;
        this.f5601f = true;
        this.f5602g = false;
        TypedArray d5 = m.d(context, attributeSet, i.g.f3208n, 0, 0, new int[0]);
        this.f5600e = d5.getInt(1, this.f5600e);
        Drawable drawable = d5.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f5601f = d5.getBoolean(2, true);
        d5.recycle();
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f5597b;
        if (drawable != null) {
            if (this.f5602g) {
                this.f5602g = false;
                Rect rect = this.f5598c;
                Rect rect2 = this.f5599d;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f5601f) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f5600e, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    @TargetApi(21)
    public final void drawableHotspotChanged(float f5, float f6) {
        super.drawableHotspotChanged(f5, f6);
        Drawable drawable = this.f5597b;
        if (drawable != null) {
            drawable.setHotspot(f5, f6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5597b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f5597b.setState(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f5597b;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f5600e;
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(11)
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5597b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        this.f5602g = z4 | this.f5602g;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        this.f5602g = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f5597b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f5597b);
            }
            this.f5597b = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f5600e == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i5) {
        if (this.f5600e != i5) {
            if ((8388615 & i5) == 0) {
                i5 |= GravityCompat.START;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            this.f5600e = i5;
            if (i5 == 119 && this.f5597b != null) {
                this.f5597b.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5597b;
    }
}
