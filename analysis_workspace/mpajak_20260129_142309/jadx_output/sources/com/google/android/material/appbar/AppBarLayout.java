package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import b2.h;
import comeliest.metempsychosis.pokelogan.R;
import i.g;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes17.dex */
public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: b, reason: collision with root package name */
    public int f692b;

    /* renamed from: c, reason: collision with root package name */
    public int f693c;

    /* renamed from: d, reason: collision with root package name */
    public int f694d;

    /* renamed from: e, reason: collision with root package name */
    public int f695e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f696f;

    /* renamed from: g, reason: collision with root package name */
    public int f697g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f698h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f699i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f700j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f701k;

    /* renamed from: l, reason: collision with root package name */
    @IdRes
    public int f702l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f703m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public ValueAnimator f704n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f705o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public Drawable f706p;

    /* renamed from: q, reason: collision with root package name */
    public Behavior f707q;

    /* loaded from: classes5.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends g1.b<T> {

        /* renamed from: j, reason: collision with root package name */
        public int f708j;

        /* renamed from: k, reason: collision with root package name */
        public int f709k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f710l;

        /* renamed from: m, reason: collision with root package name */
        public b f711m;

        /* renamed from: n, reason: collision with root package name */
        @Nullable
        public WeakReference<View> f712n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f713o;

        /* loaded from: classes13.dex */
        public class a extends AccessibilityDelegateCompat {
            public a() {
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setScrollable(BaseBehavior.this.f713o);
                accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            }
        }

        /* loaded from: classes4.dex */
        public static class b extends AbsSavedState {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public boolean f715b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f716c;

            /* renamed from: d, reason: collision with root package name */
            public int f717d;

            /* renamed from: e, reason: collision with root package name */
            public float f718e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f719f;

            /* loaded from: classes8.dex */
            public class a implements Parcelable.ClassLoaderCreator<b> {
                @Override // android.os.Parcelable.Creator
                @Nullable
                public final Object createFromParcel(@NonNull Parcel parcel) {
                    return new b(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                public final b createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @NonNull
                public final Object[] newArray(int i5) {
                    return new b[i5];
                }
            }

            public b(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f715b = parcel.readByte() != 0;
                this.f716c = parcel.readByte() != 0;
                this.f717d = parcel.readInt();
                this.f718e = parcel.readFloat();
                this.f719f = parcel.readByte() != 0;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(@NonNull Parcel parcel, int i5) {
                super.writeToParcel(parcel, i5);
                parcel.writeByte(this.f715b ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f716c ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f717d);
                parcel.writeFloat(this.f718e);
                parcel.writeByte(this.f719f ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static boolean m(int i5, int i6) {
            return (i5 & i6) == i6;
        }

        @Override // g1.b
        public final boolean d(View view) {
            WeakReference<View> weakReference = this.f712n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // g1.b
        public final int e(@NonNull View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // g1.b
        public final int f(@NonNull View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // g1.b
        public final int g() {
            return a() + this.f708j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // g1.b
        public final void h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            q(coordinatorLayout, appBarLayout);
            if (appBarLayout.f701k) {
                appBarLayout.c(appBarLayout.d(n(coordinatorLayout)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // g1.b
        public final int k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5, int i6, int i7) {
            int i8;
            int i9;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int g5 = g();
            int i10 = 0;
            if (i6 == 0 || g5 < i6 || g5 > i7) {
                this.f708j = 0;
            } else {
                int clamp = MathUtils.clamp(i5, i6, i7);
                if (g5 != clamp) {
                    if (appBarLayout.f696f) {
                        int abs = Math.abs(clamp);
                        int childCount = appBarLayout.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i11);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f724c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i11++;
                            } else if (interpolator != null) {
                                int i12 = cVar.f722a;
                                if ((i12 & 1) != 0) {
                                    i9 = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + 0;
                                    if ((i12 & 2) != 0) {
                                        i9 -= ViewCompat.getMinimumHeight(childAt);
                                    }
                                } else {
                                    i9 = 0;
                                }
                                if (ViewCompat.getFitsSystemWindows(childAt)) {
                                    i9 -= appBarLayout.getTopInset();
                                }
                                if (i9 > 0) {
                                    float f5 = i9;
                                    i8 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f5) * f5)) * Integer.signum(clamp);
                                }
                            }
                        }
                    }
                    i8 = clamp;
                    boolean c5 = c(i8);
                    int i13 = g5 - clamp;
                    this.f708j = clamp - i8;
                    if (c5) {
                        for (int i14 = 0; i14 < appBarLayout.getChildCount(); i14++) {
                            c cVar2 = (c) appBarLayout.getChildAt(i14).getLayoutParams();
                            a aVar = cVar2.f723b;
                            if (aVar != null && (cVar2.f722a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i14);
                                float a5 = a();
                                b bVar = (b) aVar;
                                Rect rect = bVar.f720a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = bVar.f720a.top - Math.abs(a5);
                                if (abs2 <= 0.0f) {
                                    float clamp2 = 1.0f - MathUtils.clamp(Math.abs(abs2 / bVar.f720a.height()), 0.0f, 1.0f);
                                    float height = (-abs2) - ((bVar.f720a.height() * 0.3f) * (1.0f - (clamp2 * clamp2)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(bVar.f721b);
                                    bVar.f721b.offset(0, (int) (-height));
                                    ViewCompat.setClipBounds(childAt2, bVar.f721b);
                                } else {
                                    ViewCompat.setClipBounds(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!c5 && appBarLayout.f696f) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.f692b = a();
                    if (!appBarLayout.willNotDraw()) {
                        ViewCompat.postInvalidateOnAnimation(appBarLayout);
                    }
                    s(coordinatorLayout, appBarLayout, clamp, clamp < g5 ? -1 : 1, false);
                    i10 = i13;
                }
            }
            r(coordinatorLayout, appBarLayout);
            return i10;
        }

        public final void l(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i5) {
            int abs = Math.abs(g() - i5);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int g5 = g();
            if (g5 == i5) {
                ValueAnimator valueAnimator = this.f710l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f710l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f710l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f710l = valueAnimator3;
                valueAnimator3.setInterpolator(f1.a.f2771e);
                this.f710l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f710l.setDuration(Math.min(round, 600));
            this.f710l.setIntValues(g5, i5);
            this.f710l.start();
        }

        @Nullable
        public final View n(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final void o(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i5, int[] iArr) {
            int i6;
            int i7;
            if (i5 != 0) {
                if (i5 < 0) {
                    int i8 = -appBarLayout.getTotalScrollRange();
                    i6 = i8;
                    i7 = appBarLayout.getDownNestedPreScrollRange() + i8;
                } else {
                    i6 = -appBarLayout.getUpNestedPreScrollRange();
                    i7 = 0;
                }
                if (i6 != i7) {
                    iArr[1] = i(coordinatorLayout, appBarLayout, i5, i6, i7);
                }
            }
            if (appBarLayout.f701k) {
                appBarLayout.c(appBarLayout.d(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // g1.d, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5) {
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i5);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.f711m;
            if (bVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z4 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        i6 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z4) {
                            l(coordinatorLayout, appBarLayout, i6);
                        }
                        j(coordinatorLayout, appBarLayout, i6);
                    } else if ((pendingAction & 1) != 0) {
                        if (z4) {
                            l(coordinatorLayout, appBarLayout, 0);
                        }
                        j(coordinatorLayout, appBarLayout, 0);
                    }
                }
            } else if (bVar.f715b) {
                i6 = -appBarLayout.getTotalScrollRange();
                j(coordinatorLayout, appBarLayout, i6);
            } else {
                if (!bVar.f716c) {
                    View childAt = appBarLayout.getChildAt(bVar.f717d);
                    int i7 = -childAt.getBottom();
                    j(coordinatorLayout, appBarLayout, this.f711m.f719f ? appBarLayout.getTopInset() + ViewCompat.getMinimumHeight(childAt) + i7 : Math.round(childAt.getHeight() * this.f711m.f718e) + i7);
                }
                j(coordinatorLayout, appBarLayout, 0);
            }
            appBarLayout.f697g = 0;
            this.f711m = null;
            c(MathUtils.clamp(a(), -appBarLayout.getTotalScrollRange(), 0));
            s(coordinatorLayout, appBarLayout, a(), 0, true);
            appBarLayout.f692b = a();
            if (!appBarLayout.willNotDraw()) {
                ViewCompat.postInvalidateOnAnimation(appBarLayout);
            }
            r(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5, int i6, int i7, int i8) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i5, i6, i7, i8);
            }
            coordinatorLayout.onMeasureChild(appBarLayout, i5, i6, View.MeasureSpec.makeMeasureSpec(0, 0), i8);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i5, int i6, int[] iArr, int i7) {
            o(coordinatorLayout, (AppBarLayout) view, view2, i6, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i8 < 0) {
                iArr[1] = i(coordinatorLayout, appBarLayout, i8, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i8 == 0) {
                r(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!(parcelable instanceof b)) {
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
                this.f711m = null;
            } else {
                b bVar = (b) parcelable;
                this.f711m = bVar;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, bVar.getSuperState());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            b p4 = p(onSaveInstanceState, appBarLayout);
            return p4 == null ? onSaveInstanceState : p4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L18;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onStartNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r2, @androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.f701k
                if (r5 != 0) goto L2d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = 1
                goto L15
            L14:
                r5 = 0
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = 1
                goto L29
            L28:
                r2 = 0
            L29:
                if (r2 == 0) goto L2c
                goto L2d
            L2c:
                r6 = 0
            L2d:
                if (r6 == 0) goto L36
                android.animation.ValueAnimator r2 = r1.f710l
                if (r2 == 0) goto L36
                r2.cancel()
            L36:
                r2 = 0
                r1.f712n = r2
                r1.f709k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f709k == 0 || i5 == 1) {
                q(coordinatorLayout, appBarLayout);
                if (appBarLayout.f701k) {
                    appBarLayout.c(appBarLayout.d(view2));
                }
            }
            this.f712n = new WeakReference<>(view2);
        }

        @Nullable
        public final b p(@Nullable Parcelable parcelable, @NonNull T t4) {
            int a5 = a();
            int childCount = t4.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = t4.getChildAt(i5);
                int bottom = childAt.getBottom() + a5;
                if (childAt.getTop() + a5 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    b bVar = new b(parcelable);
                    boolean z4 = a5 == 0;
                    bVar.f716c = z4;
                    bVar.f715b = !z4 && (-a5) >= t4.getTotalScrollRange();
                    bVar.f717d = i5;
                    bVar.f719f = bottom == t4.getTopInset() + ViewCompat.getMinimumHeight(childAt);
                    bVar.f718e = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void q(CoordinatorLayout coordinatorLayout, @NonNull T t4) {
            int paddingTop = t4.getPaddingTop() + t4.getTopInset();
            int g5 = g() - paddingTop;
            int childCount = t4.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    i5 = -1;
                    break;
                }
                View childAt = t4.getChildAt(i5);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (m(cVar.f722a, 32)) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i6 = -g5;
                if (top <= i6 && bottom >= i6) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 >= 0) {
                View childAt2 = t4.getChildAt(i5);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i7 = cVar2.f722a;
                if ((i7 & 17) == 17) {
                    int i8 = -childAt2.getTop();
                    int i9 = -childAt2.getBottom();
                    if (i5 == 0 && ViewCompat.getFitsSystemWindows(t4) && ViewCompat.getFitsSystemWindows(childAt2)) {
                        i8 -= t4.getTopInset();
                    }
                    if (m(i7, 2)) {
                        i9 += ViewCompat.getMinimumHeight(childAt2);
                    } else if (m(i7, 5)) {
                        int minimumHeight = ViewCompat.getMinimumHeight(childAt2) + i9;
                        if (g5 < minimumHeight) {
                            i8 = minimumHeight;
                        } else {
                            i9 = minimumHeight;
                        }
                    }
                    if (m(i7, 32)) {
                        i8 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        i9 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (g5 < (i9 + i8) / 2) {
                        i8 = i9;
                    }
                    l(coordinatorLayout, t4, MathUtils.clamp(i8 + paddingTop, -t4.getTotalScrollRange(), 0));
                }
            }
        }

        public final void r(CoordinatorLayout coordinatorLayout, @NonNull T t4) {
            View view;
            boolean z4;
            boolean z5;
            ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
            ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
            if (t4.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            boolean z6 = false;
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    view = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(i5);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    view = childAt;
                    break;
                }
                i5++;
            }
            if (view == null) {
                return;
            }
            int childCount2 = t4.getChildCount();
            int i6 = 0;
            while (true) {
                z4 = true;
                if (i6 >= childCount2) {
                    z5 = false;
                    break;
                } else {
                    if (((c) t4.getChildAt(i6).getLayoutParams()).f722a != 0) {
                        z5 = true;
                        break;
                    }
                    i6++;
                }
            }
            if (z5) {
                if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                    ViewCompat.setAccessibilityDelegate(coordinatorLayout, new a());
                }
                if (g() != (-t4.getTotalScrollRange())) {
                    ViewCompat.replaceAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD, null, new com.google.android.material.appbar.c(t4, false));
                    z6 = true;
                }
                if (g() != 0) {
                    if (view.canScrollVertically(-1)) {
                        int i7 = -t4.getDownNestedPreScrollRange();
                        if (i7 != 0) {
                            ViewCompat.replaceAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, null, new com.google.android.material.appbar.b(this, coordinatorLayout, t4, view, i7));
                        }
                    } else {
                        ViewCompat.replaceAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD, null, new com.google.android.material.appbar.c(t4, true));
                    }
                    this.f713o = z4;
                }
                z4 = z6;
                this.f713o = z4;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void s(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r7, @androidx.annotation.NonNull T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                r0 = 1
                if (r4 == 0) goto L49
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f722a
                r3 = r1 & 1
                if (r3 == 0) goto L49
                int r3 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
                if (r10 <= 0) goto L4b
                r10 = r1 & 12
                if (r10 == 0) goto L4b
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L49
            L47:
                r9 = 1
                goto L5d
            L49:
                r9 = 0
                goto L5d
            L4b:
                r10 = r1 & 2
                if (r10 == 0) goto L49
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L49
                goto L47
            L5d:
                boolean r10 = r8.f701k
                if (r10 == 0) goto L69
                android.view.View r9 = r6.n(r7)
                boolean r9 = r8.d(r9)
            L69:
                boolean r9 = r8.c(r9)
                if (r11 != 0) goto L9d
                if (r9 == 0) goto La0
                java.util.List r7 = r7.getDependents(r8)
                int r9 = r7.size()
                r10 = 0
            L7a:
                if (r10 >= r9) goto L9b
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r11 = r11.getBehavior()
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L98
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f2940f
                if (r7 == 0) goto L9b
                r2 = 1
                goto L9b
            L98:
                int r10 = r10 + 1
                goto L7a
            L9b:
                if (r2 == 0) goto La0
            L9d:
                r8.jumpDrawablesToCurrentState()
            La0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.s(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }
    }

    /* loaded from: classes20.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes23.dex */
    public static class ScrollingViewBehavior extends g1.c {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.A);
            this.f2940f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // g1.c
        public final float f(View view) {
            int i5;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
                int g5 = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).g() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + g5 > downNestedPreScrollRange) && (i5 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (g5 / i5) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // g1.c
        public final int g(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // g1.c
        @Nullable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final AppBarLayout d(@NonNull List<View> list) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = list.get(i5);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f708j) + this.f2939e) - e(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f701k) {
                return false;
            }
            appBarLayout.c(appBarLayout.d(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD.getId());
                ViewCompat.removeAccessibilityAction(coordinatorLayout, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD.getId());
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z4) {
            AppBarLayout d5 = d(coordinatorLayout.getDependencies(view));
            if (d5 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f2937c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    d5.f697g = 2 | (z4 ^ true ? 4 : 0) | 8;
                    d5.requestLayout();
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes25.dex */
    public static abstract class a {
    }

    /* loaded from: classes21.dex */
    public static class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f720a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        public final Rect f721b = new Rect();
    }

    /* loaded from: classes23.dex */
    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f722a;

        /* renamed from: b, reason: collision with root package name */
        public a f723b;

        /* renamed from: c, reason: collision with root package name */
        public Interpolator f724c;

        public c() {
            super(-1, -2);
            this.f722a = 1;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f722a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3199e);
            this.f722a = obtainStyledAttributes.getInt(1, 0);
            this.f723b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f724c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f722a = 1;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f722a = 1;
        }

        @RequiresApi(19)
        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f722a = 1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void b() {
        Behavior behavior = this.f707q;
        BaseBehavior.b p4 = (behavior == null || this.f693c == -1 || this.f697g != 0) ? null : behavior.p(AbsSavedState.EMPTY_STATE, this);
        this.f693c = -1;
        this.f694d = -1;
        this.f695e = -1;
        if (p4 != null) {
            Behavior behavior2 = this.f707q;
            if (behavior2.f711m != null) {
                return;
            }
            behavior2.f711m = p4;
        }
    }

    public final boolean c(boolean z4) {
        if (!(!this.f698h) || this.f700j == z4) {
            return false;
        }
        this.f700j = z4;
        refreshDrawableState();
        if (!this.f701k || !(getBackground() instanceof b2.g)) {
            return true;
        }
        b2.g gVar = (b2.g) getBackground();
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        float f5 = z4 ? 0.0f : dimension;
        if (!z4) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f704n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, dimension);
        this.f704n = ofFloat;
        ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.f704n.setInterpolator(f1.a.f2767a);
        this.f704n.addUpdateListener(new g1.a(this, gVar));
        this.f704n.start();
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(@Nullable View view) {
        int i5;
        if (this.f703m == null && (i5 = this.f702l) != -1) {
            View findViewById = view != null ? view.findViewById(i5) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f702l);
            }
            if (findViewById != null) {
                this.f703m = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f703m;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f706p != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f692b);
            this.f706p.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f706p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || ViewCompat.getFitsSystemWindows(childAt)) ? false : true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f707q = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i5;
        int minimumHeight;
        int i6 = this.f694d;
        if (i6 != -1) {
            return i6;
        }
        int i7 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i8 = cVar.f722a;
            if ((i8 & 5) != 5) {
                if (i7 > 0) {
                    break;
                }
            } else {
                int i9 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                if ((i8 & 8) != 0) {
                    minimumHeight = ViewCompat.getMinimumHeight(childAt);
                } else if ((i8 & 2) != 0) {
                    minimumHeight = measuredHeight - ViewCompat.getMinimumHeight(childAt);
                } else {
                    i5 = i9 + measuredHeight;
                    if (childCount == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                        i5 = Math.min(i5, measuredHeight - getTopInset());
                    }
                    i7 += i5;
                }
                i5 = minimumHeight + i9;
                if (childCount == 0) {
                    i5 = Math.min(i5, measuredHeight - getTopInset());
                }
                i7 += i5;
            }
        }
        int max = Math.max(0, i7);
        this.f694d = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i5 = this.f695e;
        if (i5 != -1) {
            return i5;
        }
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
            int i8 = cVar.f722a;
            if ((i8 & 1) == 0) {
                break;
            }
            i7 += measuredHeight;
            if ((i8 & 2) != 0) {
                i7 -= ViewCompat.getMinimumHeight(childAt);
                break;
            }
            i6++;
        }
        int max = Math.max(0, i7);
        this.f695e = max;
        return max;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f702l;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? ViewCompat.getMinimumHeight(getChildAt(childCount - 1)) : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f697g;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f706p;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i5 = this.f693c;
        if (i5 != -1) {
            return i5;
        }
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i8 = cVar.f722a;
            if ((i8 & 1) == 0) {
                break;
            }
            int i9 = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i7;
            if (i6 == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                i9 -= getTopInset();
            }
            i7 = i9;
            if ((i8 & 2) != 0) {
                i7 -= ViewCompat.getMinimumHeight(childAt);
                break;
            }
            i6++;
        }
        int max = Math.max(0, i7);
        this.f693c = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof b2.g) {
            h.b(this, (b2.g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        if (this.f705o == null) {
            this.f705o = new int[4];
        }
        int[] iArr = this.f705o;
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + iArr.length);
        boolean z4 = this.f699i;
        iArr[0] = z4 ? R.attr.state_liftable : -2130903939;
        iArr[1] = (z4 && this.f700j) ? R.attr.state_lifted : -2130903940;
        iArr[2] = z4 ? R.attr.state_collapsible : -2130903937;
        iArr[3] = (z4 && this.f700j) ? R.attr.state_collapsed : -2130903936;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f703m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f703m = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        boolean z5;
        super.onLayout(z4, i5, i6, i7, i8);
        boolean z6 = true;
        if (ViewCompat.getFitsSystemWindows(this) && e()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
            }
        }
        b();
        this.f696f = false;
        int childCount2 = getChildCount();
        int i9 = 0;
        while (true) {
            if (i9 >= childCount2) {
                break;
            }
            if (((c) getChildAt(i9).getLayoutParams()).f724c != null) {
                this.f696f = true;
                break;
            }
            i9++;
        }
        Drawable drawable = this.f706p;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f698h) {
            return;
        }
        if (!this.f701k) {
            int childCount3 = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount3) {
                    z5 = false;
                    break;
                }
                int i11 = ((c) getChildAt(i10).getLayoutParams()).f722a;
                if ((i11 & 1) == 1 && (i11 & 10) != 0) {
                    z5 = true;
                    break;
                }
                i10++;
            }
            if (!z5) {
                z6 = false;
            }
        }
        if (this.f699i != z6) {
            this.f699i = z6;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i6);
        if (mode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && e()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = MathUtils.clamp(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i6));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        b();
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

    public void setExpanded(boolean z4) {
        this.f697g = (z4 ? 1 : 2) | (ViewCompat.isLaidOut(this) ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z4) {
        this.f701k = z4;
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i5) {
        this.f702l = i5;
        WeakReference<View> weakReference = this.f703m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f703m = null;
    }

    public void setLiftableOverrideEnabled(boolean z4) {
        this.f698h = z4;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i5) {
        if (i5 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i5);
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f706p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f706p = mutate;
            boolean z4 = false;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f706p.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f706p, ViewCompat.getLayoutDirection(this));
                this.f706p.setVisible(getVisibility() == 0, false);
                this.f706p.setCallback(this);
            }
            if (this.f706p != null && getTopInset() > 0) {
                z4 = true;
            }
            setWillNotDraw(!z4);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i5) {
        setStatusBarForeground(new ColorDrawable(i5));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i5) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i5));
    }

    @Deprecated
    public void setTargetElevation(float f5) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j5 = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -2130903940}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j5));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", f5).setDuration(j5));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z4 = i5 == 0;
        Drawable drawable = this.f706p;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f706p;
    }
}
