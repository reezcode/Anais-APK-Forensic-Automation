package g1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes20.dex */
public abstract class b<V extends View> extends d<V> {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public a f2927c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f2928d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2929e;

    /* renamed from: f, reason: collision with root package name */
    public int f2930f;

    /* renamed from: g, reason: collision with root package name */
    public int f2931g;

    /* renamed from: h, reason: collision with root package name */
    public int f2932h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public VelocityTracker f2933i;

    /* loaded from: classes19.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final CoordinatorLayout f2934b;

        /* renamed from: c, reason: collision with root package name */
        public final V f2935c;

        public a(CoordinatorLayout coordinatorLayout, V v4) {
            this.f2934b = coordinatorLayout;
            this.f2935c = v4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller;
            if (this.f2935c == null || (overScroller = b.this.f2928d) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                b.this.h(this.f2934b, this.f2935c);
                return;
            }
            b bVar = b.this;
            bVar.j(this.f2934b, this.f2935c, bVar.f2928d.getCurrY());
            ViewCompat.postOnAnimation(this.f2935c, this);
        }
    }

    public b() {
        this.f2930f = -1;
        this.f2932h = -1;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2930f = -1;
        this.f2932h = -1;
    }

    public boolean d(V v4) {
        return false;
    }

    public int e(@NonNull V v4) {
        return -v4.getHeight();
    }

    public int f(@NonNull V v4) {
        return v4.getHeight();
    }

    public int g() {
        return a();
    }

    public void h(CoordinatorLayout coordinatorLayout, V v4) {
    }

    public final int i(CoordinatorLayout coordinatorLayout, V v4, int i5, int i6, int i7) {
        return k(coordinatorLayout, v4, g() - i5, i6, i7);
    }

    public final int j(CoordinatorLayout coordinatorLayout, V v4, int i5) {
        return k(coordinatorLayout, v4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int k(CoordinatorLayout coordinatorLayout, V v4, int i5, int i6, int i7) {
        int clamp;
        int a5 = a();
        if (i6 == 0 || a5 < i6 || a5 > i7 || a5 == (clamp = MathUtils.clamp(i5, i6, i7))) {
            return 0;
        }
        c(clamp);
        return a5 - clamp;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f2932h < 0) {
            this.f2932h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2929e) {
            int i5 = this.f2930f;
            if (i5 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i5)) == -1) {
                return false;
            }
            int y4 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y4 - this.f2931g) > this.f2932h) {
                this.f2931g = y4;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f2930f = -1;
            int x4 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            boolean z4 = d(v4) && coordinatorLayout.isPointInChildBounds(v4, x4, y5);
            this.f2929e = z4;
            if (z4) {
                this.f2931g = y5;
                this.f2930f = motionEvent.getPointerId(0);
                if (this.f2933i == null) {
                    this.f2933i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f2928d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f2928d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f2933i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r20, @androidx.annotation.NonNull V r21, @androidx.annotation.NonNull android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.b.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
