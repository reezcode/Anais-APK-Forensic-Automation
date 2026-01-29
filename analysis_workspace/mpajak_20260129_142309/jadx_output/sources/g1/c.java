package g1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class c extends d<View> {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2937c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2938d;

    /* renamed from: e, reason: collision with root package name */
    public int f2939e;

    /* renamed from: f, reason: collision with root package name */
    public int f2940f;

    public c() {
        this.f2937c = new Rect();
        this.f2938d = new Rect();
        this.f2939e = 0;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2937c = new Rect();
        this.f2938d = new Rect();
        this.f2939e = 0;
    }

    @Override // g1.d
    public final void b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5) {
        int i6;
        View d5 = d(coordinatorLayout.getDependencies(view));
        if (d5 != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.f2937c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, d5.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((d5.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left = lastWindowInsets.getSystemWindowInsetLeft() + rect.left;
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.f2938d;
            int i7 = layoutParams.gravity;
            GravityCompat.apply(i7 == 0 ? 8388659 : i7, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i5);
            int e5 = e(d5);
            view.layout(rect2.left, rect2.top - e5, rect2.right, rect2.bottom - e5);
            i6 = rect2.top - d5.getBottom();
        } else {
            coordinatorLayout.onLayoutChild(view, i5);
            i6 = 0;
        }
        this.f2939e = i6;
    }

    @Nullable
    public abstract View d(List<View> list);

    public final int e(View view) {
        if (this.f2940f == 0) {
            return 0;
        }
        float f5 = f(view);
        int i5 = this.f2940f;
        return MathUtils.clamp((int) (f5 * i5), 0, i5);
    }

    public float f(View view) {
        return 1.0f;
    }

    public int g(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5, int i6, int i7, int i8) {
        View d5;
        WindowInsetsCompat lastWindowInsets;
        int i9 = view.getLayoutParams().height;
        if ((i9 != -1 && i9 != -2) || (d5 = d(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.getFitsSystemWindows(d5) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size = lastWindowInsets.getSystemWindowInsetBottom() + lastWindowInsets.getSystemWindowInsetTop() + size;
        }
        coordinatorLayout.onMeasureChild(view, i5, i6, View.MeasureSpec.makeMeasureSpec((g(d5) + size) - d5.getMeasuredHeight(), i9 == -1 ? 1073741824 : Integer.MIN_VALUE), i8);
        return true;
    }
}
