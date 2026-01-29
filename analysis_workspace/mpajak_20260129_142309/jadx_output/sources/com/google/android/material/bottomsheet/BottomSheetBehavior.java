package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import b2.g;
import b2.k;
import comeliest.metempsychosis.pokelogan.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes18.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public int A;
    public int B;
    public int C;
    public float D;
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;

    @Nullable
    public ViewDragHelper K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;

    @Nullable
    public WeakReference<V> R;

    @Nullable
    public WeakReference<View> S;

    @NonNull
    public final ArrayList<c> T;

    @Nullable
    public VelocityTracker U;
    public int V;
    public int W;
    public boolean X;

    @Nullable
    public Map<View, Integer> Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f778a;

    /* renamed from: a0, reason: collision with root package name */
    public final b f779a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f780b;

    /* renamed from: c, reason: collision with root package name */
    public float f781c;

    /* renamed from: d, reason: collision with root package name */
    public int f782d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f783e;

    /* renamed from: f, reason: collision with root package name */
    public int f784f;

    /* renamed from: g, reason: collision with root package name */
    public int f785g;

    /* renamed from: h, reason: collision with root package name */
    public g f786h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public ColorStateList f787i;

    /* renamed from: j, reason: collision with root package name */
    public int f788j;

    /* renamed from: k, reason: collision with root package name */
    public int f789k;

    /* renamed from: l, reason: collision with root package name */
    public int f790l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f791m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f792n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f793o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f794p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f795q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f796r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f797s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f798t;

    /* renamed from: u, reason: collision with root package name */
    public int f799u;

    /* renamed from: v, reason: collision with root package name */
    public int f800v;

    /* renamed from: w, reason: collision with root package name */
    public k f801w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f802x;

    /* renamed from: y, reason: collision with root package name */
    public final BottomSheetBehavior<V>.e f803y;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public ValueAnimator f804z;

    /* loaded from: classes24.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f805b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f806c;

        public a(View view, int i5) {
            this.f805b = view;
            this.f806c = i5;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.m(this.f805b, this.f806c, false);
        }
    }

    /* loaded from: classes13.dex */
    public class b extends ViewDragHelper.Callback {
        public b() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(@NonNull View view, int i5, int i6) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(@NonNull View view, int i5, int i6) {
            int f5 = BottomSheetBehavior.this.f();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return MathUtils.clamp(i5, f5, bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewVerticalDragRange(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i5) {
            if (i5 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.I) {
                    bottomSheetBehavior.k(1);
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(@NonNull View view, int i5, int i6, int i7, int i8) {
            BottomSheetBehavior.this.c(i6);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        
            if (r9 > r7.f808a.C) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f808a.f()) < java.lang.Math.abs(r8.getTop() - r7.f808a.C)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f808a.C) < java.lang.Math.abs(r9 - r7.f808a.E)) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
        
            if (java.lang.Math.abs(r9 - r10.B) < java.lang.Math.abs(r9 - r7.f808a.E)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
        
            if (r9 < java.lang.Math.abs(r9 - r10.E)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
        
            if (java.lang.Math.abs(r9 - r1) < java.lang.Math.abs(r9 - r7.f808a.E)) goto L40;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onViewReleased(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.onViewReleased(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(@NonNull View view, int i5) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i6 = bottomSheetBehavior.J;
            if (i6 == 1 || bottomSheetBehavior.X) {
                return false;
            }
            if (i6 == 3 && bottomSheetBehavior.V == i5) {
                WeakReference<View> weakReference = bottomSheetBehavior.S;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.R;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* loaded from: classes20.dex */
    public static abstract class c {
        public abstract void a();

        public abstract void b();
    }

    /* loaded from: classes12.dex */
    public static class d extends AbsSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f809b;

        /* renamed from: c, reason: collision with root package name */
        public int f810c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f811d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f812e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f813f;

        /* loaded from: classes17.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final d createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i5) {
                return new d[i5];
            }
        }

        public d(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f809b = parcel.readInt();
            this.f810c = parcel.readInt();
            this.f811d = parcel.readInt() == 1;
            this.f812e = parcel.readInt() == 1;
            this.f813f = parcel.readInt() == 1;
        }

        public d(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f809b = bottomSheetBehavior.J;
            this.f810c = bottomSheetBehavior.f782d;
            this.f811d = bottomSheetBehavior.f780b;
            this.f812e = bottomSheetBehavior.G;
            this.f813f = bottomSheetBehavior.H;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f809b);
            parcel.writeInt(this.f810c);
            parcel.writeInt(this.f811d ? 1 : 0);
            parcel.writeInt(this.f812e ? 1 : 0);
            parcel.writeInt(this.f813f ? 1 : 0);
        }
    }

    /* loaded from: classes24.dex */
    public class e {

        /* renamed from: a, reason: collision with root package name */
        public int f814a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f815b;

        /* renamed from: c, reason: collision with root package name */
        public final a f816c = new a();

        /* loaded from: classes12.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f815b = false;
                ViewDragHelper viewDragHelper = BottomSheetBehavior.this.K;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    e eVar2 = e.this;
                    eVar2.a(eVar2.f814a);
                    return;
                }
                e eVar3 = e.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.J == 2) {
                    bottomSheetBehavior.k(eVar3.f814a);
                }
            }
        }

        public e() {
        }

        public final void a(int i5) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.R;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f814a = i5;
            if (this.f815b) {
                return;
            }
            ViewCompat.postOnAnimation(BottomSheetBehavior.this.R.get(), this.f816c);
            this.f815b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f778a = 0;
        this.f780b = true;
        this.f788j = -1;
        this.f789k = -1;
        this.f803y = new e();
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<>();
        this.Z = -1;
        this.f779a0 = new b();
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        int i5;
        this.f778a = 0;
        this.f780b = true;
        this.f788j = -1;
        this.f789k = -1;
        this.f803y = new e();
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<>();
        this.Z = -1;
        this.f779a0 = new b();
        this.f785g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.g.f3200f);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f787i = y1.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.f801w = new k(k.b(context, attributeSet, R.attr.bottomSheetStyle, 2131755795));
        }
        if (this.f801w != null) {
            g gVar = new g(this.f801w);
            this.f786h = gVar;
            gVar.m(context);
            ColorStateList colorStateList = this.f787i;
            if (colorStateList != null) {
                this.f786h.o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f786h.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f804z = ofFloat;
        ofFloat.setDuration(500L);
        this.f804z.addUpdateListener(new i1.a(this));
        this.F = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f788j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f789k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i5 = peekValue.data) != -1) {
            i(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            i(i5);
        }
        boolean z4 = obtainStyledAttributes.getBoolean(8, false);
        if (this.G != z4) {
            this.G = z4;
            if (!z4 && this.J == 5) {
                j(4);
            }
            n();
        }
        this.f791m = obtainStyledAttributes.getBoolean(12, false);
        boolean z5 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f780b != z5) {
            this.f780b = z5;
            if (this.R != null) {
                a();
            }
            k((this.f780b && this.J == 6) ? 3 : this.J);
            n();
        }
        this.H = obtainStyledAttributes.getBoolean(11, false);
        this.I = obtainStyledAttributes.getBoolean(4, true);
        this.f778a = obtainStyledAttributes.getInt(10, 0);
        float f5 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f5 <= 0.0f || f5 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.D = f5;
        if (this.R != null) {
            this.C = (int) ((1.0f - f5) * this.Q);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            dimensionPixelOffset = peekValue2.data;
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.A = dimensionPixelOffset;
        this.f792n = obtainStyledAttributes.getBoolean(16, false);
        this.f793o = obtainStyledAttributes.getBoolean(17, false);
        this.f794p = obtainStyledAttributes.getBoolean(18, false);
        this.f795q = obtainStyledAttributes.getBoolean(19, true);
        this.f796r = obtainStyledAttributes.getBoolean(13, false);
        this.f797s = obtainStyledAttributes.getBoolean(14, false);
        this.f798t = obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.recycle();
        this.f781c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void a() {
        int b5 = b();
        if (this.f780b) {
            this.E = Math.max(this.Q - b5, this.B);
        } else {
            this.E = this.Q - b5;
        }
    }

    public final int b() {
        int i5;
        return this.f783e ? Math.min(Math.max(this.f784f, this.Q - ((this.P * 9) / 16)), this.O) + this.f799u : (this.f791m || this.f792n || (i5 = this.f790l) <= 0) ? this.f782d + this.f799u : Math.max(this.f782d, i5 + this.f785g);
    }

    public final void c(int i5) {
        if (this.R.get() == null || this.T.isEmpty()) {
            return;
        }
        int i6 = this.E;
        if (i5 <= i6 && i6 != f()) {
            f();
        }
        for (int i7 = 0; i7 < this.T.size(); i7++) {
            this.T.get(i7).a();
        }
    }

    @Nullable
    @VisibleForTesting
    public final View d(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View d5 = d(viewGroup.getChildAt(i5));
            if (d5 != null) {
                return d5;
            }
        }
        return null;
    }

    public final int e(int i5, int i6, int i7, int i8) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, i6, i8);
        if (i7 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i7), 1073741824);
        }
        if (size != 0) {
            i7 = Math.min(size, i7);
        }
        return View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
    }

    public final int f() {
        if (this.f780b) {
            return this.B;
        }
        return Math.max(this.A, this.f795q ? 0 : this.f800v);
    }

    public final int g(int i5) {
        if (i5 == 3) {
            return f();
        }
        if (i5 == 4) {
            return this.E;
        }
        if (i5 == 5) {
            return this.Q;
        }
        if (i5 == 6) {
            return this.C;
        }
        throw new IllegalArgumentException(androidx.appcompat.widget.a.g("Invalid state to get top offset: ", i5));
    }

    public final void h(V v4, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i5) {
        ViewCompat.replaceAccessibilityAction(v4, accessibilityActionCompat, null, new i1.c(this, i5));
    }

    public final void i(int i5) {
        boolean z4 = false;
        if (i5 == -1) {
            if (!this.f783e) {
                this.f783e = true;
                z4 = true;
            }
        } else if (this.f783e || this.f782d != i5) {
            this.f783e = false;
            this.f782d = Math.max(0, i5);
            z4 = true;
        }
        if (z4) {
            q();
        }
    }

    public final void j(int i5) {
        if (i5 == 1 || i5 == 2) {
            throw new IllegalArgumentException(androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("STATE_"), i5 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.G && i5 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i5);
            return;
        }
        int i6 = (i5 == 6 && this.f780b && g(i5) <= this.B) ? 3 : i5;
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || weakReference.get() == null) {
            k(i5);
            return;
        }
        V v4 = this.R.get();
        a aVar = new a(v4, i6);
        ViewParent parent = v4.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v4)) {
            v4.post(aVar);
        } else {
            aVar.run();
        }
    }

    public final void k(int i5) {
        if (this.J == i5) {
            return;
        }
        this.J = i5;
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (i5 == 3) {
            p(true);
        } else if (i5 == 6 || i5 == 5 || i5 == 4) {
            p(false);
        }
        o(i5);
        for (int i6 = 0; i6 < this.T.size(); i6++) {
            this.T.get(i6).b();
        }
        n();
    }

    public final boolean l(@NonNull View view, float f5) {
        if (this.H) {
            return true;
        }
        if (view.getTop() < this.E) {
            return false;
        }
        return Math.abs(((f5 * 0.1f) + ((float) view.getTop())) - ((float) this.E)) / ((float) b()) > 0.5f;
    }

    public final void m(View view, int i5, boolean z4) {
        int g5 = g(i5);
        ViewDragHelper viewDragHelper = this.K;
        if (!(viewDragHelper != null && (!z4 ? !viewDragHelper.smoothSlideViewTo(view, view.getLeft(), g5) : !viewDragHelper.settleCapturedViewAt(view.getLeft(), g5)))) {
            k(i5);
            return;
        }
        k(2);
        o(i5);
        this.f803y.a(i5);
    }

    public final void n() {
        V v4;
        int i5;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || (v4 = weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(v4, 524288);
        ViewCompat.removeAccessibilityAction(v4, 262144);
        ViewCompat.removeAccessibilityAction(v4, 1048576);
        int i6 = this.Z;
        if (i6 != -1) {
            ViewCompat.removeAccessibilityAction(v4, i6);
        }
        if (!this.f780b && this.J != 6) {
            this.Z = ViewCompat.addAccessibilityAction(v4, v4.getResources().getString(R.string.bottomsheet_action_expand_halfway), new i1.c(this, 6));
        }
        if (this.G && this.J != 5) {
            h(v4, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        int i7 = this.J;
        if (i7 == 3) {
            i5 = this.f780b ? 4 : 6;
            accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE;
        } else {
            if (i7 != 4) {
                if (i7 != 6) {
                    return;
                }
                h(v4, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
                h(v4, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
                return;
            }
            i5 = this.f780b ? 3 : 6;
            accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND;
        }
        h(v4, accessibilityActionCompat, i5);
    }

    public final void o(int i5) {
        ValueAnimator valueAnimator;
        if (i5 == 2) {
            return;
        }
        boolean z4 = i5 == 3;
        if (this.f802x != z4) {
            this.f802x = z4;
            if (this.f786h == null || (valueAnimator = this.f804z) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f804z.reverse();
                return;
            }
            float f5 = z4 ? 0.0f : 1.0f;
            this.f804z.setFloatValues(1.0f - f5, f5);
            this.f804z.start();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.R = null;
        this.K = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.R = null;
        this.K = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!v4.isShown() || !this.I) {
            this.L = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = -1;
            VelocityTracker velocityTracker = this.U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.U = null;
            }
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x4 = (int) motionEvent.getX();
            this.W = (int) motionEvent.getY();
            if (this.J != 2) {
                WeakReference<View> weakReference = this.S;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x4, this.W)) {
                    this.V = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.X = true;
                }
            }
            this.L = this.V == -1 && !coordinatorLayout.isPointInChildBounds(v4, x4, this.W);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.X = false;
            this.V = -1;
            if (this.L) {
                this.L = false;
                return false;
            }
        }
        if (!this.L && (viewDragHelper = this.K) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.S;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.L || this.J == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.K == null || Math.abs(((float) this.W) - motionEvent.getY()) <= ((float) this.K.getTouchSlop())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x015d A[LOOP:0: B:67:0x0155->B:69:0x015d, LOOP_END] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onLayoutChild(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r11, @androidx.annotation.NonNull V r12, int r13) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v4.getLayoutParams();
        v4.measure(e(i5, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, this.f788j, marginLayoutParams.width), e(i7, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i8, this.f789k, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull View view, float f5, float f6) {
        WeakReference<View> weakReference = this.S;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.J != 3 || super.onNestedPreFling(coordinatorLayout, v4, view, f5, f6);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull View view, int i5, int i6, @NonNull int[] iArr, int i7) {
        int i8;
        if (i7 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.S;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v4.getTop();
        int i9 = top - i6;
        if (i6 > 0) {
            if (i9 < f()) {
                iArr[1] = top - f();
                ViewCompat.offsetTopAndBottom(v4, -iArr[1]);
                i8 = 3;
                k(i8);
            } else {
                if (!this.I) {
                    return;
                }
                iArr[1] = i6;
                ViewCompat.offsetTopAndBottom(v4, -i6);
                k(1);
            }
        } else if (i6 < 0 && !view.canScrollVertically(-1)) {
            int i10 = this.E;
            if (i9 > i10 && !this.G) {
                iArr[1] = top - i10;
                ViewCompat.offsetTopAndBottom(v4, -iArr[1]);
                i8 = 4;
                k(i8);
            } else {
                if (!this.I) {
                    return;
                }
                iArr[1] = i6;
                ViewCompat.offsetTopAndBottom(v4, -i6);
                k(1);
            }
        }
        c(v4.getTop());
        this.M = i6;
        this.N = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull View view, int i5, int i6, int i7, int i8, int i9, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v4, dVar.getSuperState());
        int i5 = this.f778a;
        if (i5 != 0) {
            if (i5 == -1 || (i5 & 1) == 1) {
                this.f782d = dVar.f810c;
            }
            if (i5 == -1 || (i5 & 2) == 2) {
                this.f780b = dVar.f811d;
            }
            if (i5 == -1 || (i5 & 4) == 4) {
                this.G = dVar.f812e;
            }
            if (i5 == -1 || (i5 & 8) == 8) {
                this.H = dVar.f813f;
            }
        }
        int i6 = dVar.f809b;
        if (i6 == 1 || i6 == 2) {
            this.J = 4;
        } else {
            this.J = i6;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public final Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4) {
        return new d(super.onSaveInstanceState(coordinatorLayout, v4), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull View view, @NonNull View view2, int i5, int i6) {
        this.M = 0;
        this.N = false;
        return (i5 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r3.getTop() <= r1.C) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (java.lang.Math.abs(r2 - r1.B) < java.lang.Math.abs(r2 - r1.E)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r2 < java.lang.Math.abs(r2 - r1.E)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.E)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (java.lang.Math.abs(r2 - r1.C) < java.lang.Math.abs(r2 - r1.E)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull V r3, @androidx.annotation.NonNull android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.f()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.k(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.S
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.N
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.M
            if (r2 <= 0) goto L33
            boolean r2 = r1.f780b
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.C
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.G
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.U
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f781c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.U
            int r4 = r1.V
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.l(r3, r2)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.M
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.f780b
            if (r4 == 0) goto L72
            int r4 = r1.B
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.C
            if (r2 >= r4) goto L81
            int r4 = r1.E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.f780b
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.C
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.m(r3, r0, r2)
            r1.N = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull MotionEvent motionEvent) {
        boolean z4 = false;
        if (!v4.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i5 = this.J;
        if (i5 == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.K;
        if (viewDragHelper != null && (this.I || i5 == 1)) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.V = -1;
            VelocityTracker velocityTracker = this.U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.U = null;
            }
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (this.K != null && (this.I || this.J == 1)) {
            z4 = true;
        }
        if (z4 && actionMasked == 2 && !this.L && Math.abs(this.W - motionEvent.getY()) > this.K.getTouchSlop()) {
            this.K.captureChildView(v4, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.L;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<android.view.View, java.lang.Integer>] */
    public final void p(boolean z4) {
        WeakReference<V> weakReference = this.R;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.Y != null) {
                    return;
                } else {
                    this.Y = new HashMap(childCount);
                }
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if (childAt != this.R.get() && z4) {
                    this.Y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z4) {
                return;
            }
            this.Y = null;
        }
    }

    public final void q() {
        V v4;
        if (this.R != null) {
            a();
            if (this.J != 4 || (v4 = this.R.get()) == null) {
                return;
            }
            v4.requestLayout();
        }
    }
}
