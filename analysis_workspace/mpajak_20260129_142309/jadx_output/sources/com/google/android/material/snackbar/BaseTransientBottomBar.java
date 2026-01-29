package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.g;
import comeliest.metempsychosis.pokelogan.R;
import java.util.List;
import java.util.Objects;
import v1.m;
import v1.r;

/* loaded from: classes18.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: p, reason: collision with root package name */
    public static final String f1131p = "BaseTransientBottomBar";

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ViewGroup f1132a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1133b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final g f1134c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final c2.f f1135d;

    /* renamed from: e, reason: collision with root package name */
    public int f1136e;

    /* renamed from: g, reason: collision with root package name */
    public int f1138g;

    /* renamed from: h, reason: collision with root package name */
    public int f1139h;

    /* renamed from: i, reason: collision with root package name */
    public int f1140i;

    /* renamed from: j, reason: collision with root package name */
    public int f1141j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1142k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f1143l;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f1130o = {R.attr.snackbarStyle};

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public static final Handler f1129n = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: f, reason: collision with root package name */
    @RequiresApi(29)
    public final b f1137f = new b();

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public e f1144m = new e();

    /* loaded from: classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i, reason: collision with root package name */
        @NonNull
        public final f f1145i = new f(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean a(View view) {
            Objects.requireNonNull(this.f1145i);
            return view instanceof g;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            f fVar = this.f1145i;
            Objects.requireNonNull(fVar);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.g.b().f(fVar.f1150a);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.google.android.material.snackbar.g.b().e(fVar.f1150a);
            }
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes8.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            int i5 = message.what;
            if (i5 != 0) {
                if (i5 != 1) {
                    return false;
                }
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                int i6 = message.arg1;
                if (!baseTransientBottomBar.g() || baseTransientBottomBar.f1134c.getVisibility() != 0) {
                    baseTransientBottomBar.e();
                } else if (baseTransientBottomBar.f1134c.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.setInterpolator(f1.a.f2767a);
                    ofFloat.addUpdateListener(new com.google.android.material.snackbar.a(baseTransientBottomBar));
                    ofFloat.setDuration(75L);
                    ofFloat.addListener(new c2.a(baseTransientBottomBar, i6));
                    ofFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(0, baseTransientBottomBar.c());
                    valueAnimator.setInterpolator(f1.a.f2768b);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new c2.c(baseTransientBottomBar, i6));
                    valueAnimator.addUpdateListener(new com.google.android.material.snackbar.d(baseTransientBottomBar));
                    valueAnimator.start();
                }
                return true;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            if (baseTransientBottomBar2.f1134c.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.f1134c.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                    CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                    Behavior behavior = new Behavior();
                    f fVar = behavior.f1145i;
                    Objects.requireNonNull(fVar);
                    fVar.f1150a = baseTransientBottomBar2.f1144m;
                    behavior.f747b = new com.google.android.material.snackbar.e(baseTransientBottomBar2);
                    layoutParams2.setBehavior(behavior);
                    layoutParams2.insetEdge = 80;
                }
                g gVar = baseTransientBottomBar2.f1134c;
                ViewGroup viewGroup = baseTransientBottomBar2.f1132a;
                gVar.f1161k = true;
                viewGroup.addView(gVar);
                gVar.f1161k = false;
                baseTransientBottomBar2.i();
                baseTransientBottomBar2.f1134c.setVisibility(4);
            }
            if (ViewCompat.isLaidOut(baseTransientBottomBar2.f1134c)) {
                baseTransientBottomBar2.h();
            } else {
                baseTransientBottomBar2.f1142k = true;
            }
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f1134c == null || (context = baseTransientBottomBar.f1133b) == null) {
                return;
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i5 = displayMetrics.heightPixels;
            BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
            int[] iArr = new int[2];
            baseTransientBottomBar2.f1134c.getLocationOnScreen(iArr);
            int height = (i5 - (baseTransientBottomBar2.f1134c.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.f1134c.getTranslationY());
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            if (height >= baseTransientBottomBar3.f1141j) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.f1134c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Handler handler = BaseTransientBottomBar.f1129n;
                Log.w(BaseTransientBottomBar.f1131p, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i6 = marginLayoutParams.bottomMargin;
            BaseTransientBottomBar baseTransientBottomBar4 = BaseTransientBottomBar.this;
            marginLayoutParams.bottomMargin = (baseTransientBottomBar4.f1141j - height) + i6;
            baseTransientBottomBar4.f1134c.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements OnApplyWindowInsetsListener {
        public c() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        @NonNull
        public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f1138g = windowInsetsCompat.getSystemWindowInsetBottom();
            BaseTransientBottomBar.this.f1139h = windowInsetsCompat.getSystemWindowInsetLeft();
            BaseTransientBottomBar.this.f1140i = windowInsetsCompat.getSystemWindowInsetRight();
            BaseTransientBottomBar.this.i();
            return windowInsetsCompat;
        }
    }

    /* loaded from: classes2.dex */
    public class d extends AccessibilityDelegateCompat {
        public d() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
            if (i5 != 1048576) {
                return super.performAccessibilityAction(view, i5, bundle);
            }
            BaseTransientBottomBar.this.a();
            return true;
        }
    }

    /* loaded from: classes15.dex */
    public class e implements g.b {
        public e() {
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void a(int i5) {
            Handler handler = BaseTransientBottomBar.f1129n;
            handler.sendMessage(handler.obtainMessage(1, i5, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void show() {
            Handler handler = BaseTransientBottomBar.f1129n;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes21.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public e f1150a;

        public f(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            Objects.requireNonNull(swipeDismissBehavior);
            swipeDismissBehavior.f751f = SwipeDismissBehavior.b(0.1f);
            swipeDismissBehavior.f752g = SwipeDismissBehavior.b(0.6f);
            swipeDismissBehavior.f749d = 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes13.dex */
    public static class g extends FrameLayout {

        /* renamed from: l, reason: collision with root package name */
        public static final a f1151l = new a();

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public BaseTransientBottomBar<?> f1152b;

        /* renamed from: c, reason: collision with root package name */
        public int f1153c;

        /* renamed from: d, reason: collision with root package name */
        public final float f1154d;

        /* renamed from: e, reason: collision with root package name */
        public final float f1155e;

        /* renamed from: f, reason: collision with root package name */
        public final int f1156f;

        /* renamed from: g, reason: collision with root package name */
        public final int f1157g;

        /* renamed from: h, reason: collision with root package name */
        public ColorStateList f1158h;

        /* renamed from: i, reason: collision with root package name */
        public PorterDuff.Mode f1159i;

        /* renamed from: j, reason: collision with root package name */
        @Nullable
        public Rect f1160j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f1161k;

        /* loaded from: classes6.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public g(@NonNull Context context, AttributeSet attributeSet) {
            super(f2.a.a(context, attributeSet, 0, 0), attributeSet);
            Drawable wrap;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, i.g.C);
            if (obtainStyledAttributes.hasValue(6)) {
                ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f1153c = obtainStyledAttributes.getInt(2, 0);
            this.f1154d = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(y1.c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(r.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f1155e = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f1156f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f1157g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f1151l);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(p1.a.d(p1.a.b(this, R.attr.colorSurface), p1.a.b(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
                if (this.f1158h != null) {
                    wrap = DrawableCompat.wrap(gradientDrawable);
                    DrawableCompat.setTintList(wrap, this.f1158h);
                } else {
                    wrap = DrawableCompat.wrap(gradientDrawable);
                }
                ViewCompat.setBackground(this, wrap);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f1152b = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f1155e;
        }

        public int getAnimationMode() {
            return this.f1153c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f1154d;
        }

        public int getMaxInlineActionWidth() {
            return this.f1157g;
        }

        public int getMaxWidth() {
            return this.f1156f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1152b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.d();
            }
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z4;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1152b;
            if (baseTransientBottomBar != null) {
                com.google.android.material.snackbar.g b5 = com.google.android.material.snackbar.g.b();
                e eVar = baseTransientBottomBar.f1144m;
                synchronized (b5.f1175a) {
                    z4 = b5.c(eVar) || b5.d(eVar);
                }
                if (z4) {
                    BaseTransientBottomBar.f1129n.post(new c2.d(baseTransientBottomBar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
            super.onLayout(z4, i5, i6, i7, i8);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1152b;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f1142k) {
                return;
            }
            baseTransientBottomBar.h();
            baseTransientBottomBar.f1142k = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i5, int i6) {
            super.onMeasure(i5, i6);
            if (this.f1156f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i7 = this.f1156f;
                if (measuredWidth > i7) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), i6);
                }
            }
        }

        public void setAnimationMode(int i5) {
            this.f1153c = i5;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f1158h != null) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.f1158h);
                DrawableCompat.setTintMode(drawable, this.f1159i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f1158h = colorStateList;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintList(wrap, colorStateList);
                DrawableCompat.setTintMode(wrap, this.f1159i);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f1159i = mode;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintMode(wrap, mode);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f1161k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f1160j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1152b;
            if (baseTransientBottomBar != null) {
                Handler handler = BaseTransientBottomBar.f1129n;
                baseTransientBottomBar.i();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f1151l);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull c2.f fVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (fVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f1132a = viewGroup;
        this.f1135d = fVar;
        this.f1133b = context;
        m.c(context, m.f5633a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1130o);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        g gVar = (g) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f1134c = gVar;
        gVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = gVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f1166c.setTextColor(p1.a.d(p1.a.b(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f1166c.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout.setMaxInlineActionWidth(gVar.getMaxInlineActionWidth());
        }
        gVar.addView(view);
        ViewCompat.setAccessibilityLiveRegion(gVar, 1);
        ViewCompat.setImportantForAccessibility(gVar, 1);
        ViewCompat.setFitsSystemWindows(gVar, true);
        ViewCompat.setOnApplyWindowInsetsListener(gVar, new c());
        ViewCompat.setAccessibilityDelegate(gVar, new d());
        this.f1143l = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public void a() {
        b(3);
    }

    public final void b(int i5) {
        g.c cVar;
        com.google.android.material.snackbar.g b5 = com.google.android.material.snackbar.g.b();
        e eVar = this.f1144m;
        synchronized (b5.f1175a) {
            if (b5.c(eVar)) {
                cVar = b5.f1177c;
            } else if (b5.d(eVar)) {
                cVar = b5.f1178d;
            }
            b5.a(cVar, i5);
        }
    }

    public final int c() {
        int height = this.f1134c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f1134c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final void d() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f1134c.getRootWindowInsets()) == null) {
            return;
        }
        this.f1141j = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        i();
    }

    public final void e() {
        com.google.android.material.snackbar.g b5 = com.google.android.material.snackbar.g.b();
        e eVar = this.f1144m;
        synchronized (b5.f1175a) {
            if (b5.c(eVar)) {
                b5.f1177c = null;
                if (b5.f1178d != null) {
                    b5.h();
                }
            }
        }
        ViewParent parent = this.f1134c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f1134c);
        }
    }

    public final void f() {
        com.google.android.material.snackbar.g b5 = com.google.android.material.snackbar.g.b();
        e eVar = this.f1144m;
        synchronized (b5.f1175a) {
            if (b5.c(eVar)) {
                b5.g(b5.f1177c);
            }
        }
    }

    public final boolean g() {
        AccessibilityManager accessibilityManager = this.f1143l;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void h() {
        if (g()) {
            this.f1134c.post(new com.google.android.material.snackbar.f(this));
            return;
        }
        if (this.f1134c.getParent() != null) {
            this.f1134c.setVisibility(0);
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (((r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) && (((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0).getBehavior() instanceof com.google.android.material.behavior.SwipeDismissBehavior)) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r5 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$g r0 = r5.f1134c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L72
            com.google.android.material.snackbar.BaseTransientBottomBar$g r1 = r5.f1134c
            android.graphics.Rect r2 = r1.f1160j
            if (r2 != 0) goto L11
            goto L72
        L11:
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L18
            return
        L18:
            int r1 = r5.f1138g
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            com.google.android.material.snackbar.BaseTransientBottomBar$g r2 = r5.f1134c
            android.graphics.Rect r3 = r2.f1160j
            int r4 = r3.bottom
            int r4 = r4 + r1
            r0.bottomMargin = r4
            int r1 = r3.left
            int r4 = r5.f1139h
            int r1 = r1 + r4
            r0.leftMargin = r1
            int r1 = r3.right
            int r4 = r5.f1140i
            int r1 = r1 + r4
            r0.rightMargin = r1
            int r1 = r3.top
            r0.topMargin = r1
            r2.requestLayout()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L71
            int r0 = r5.f1141j
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L60
            com.google.android.material.snackbar.BaseTransientBottomBar$g r0 = r5.f1134c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r3 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r3 == 0) goto L5c
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.getBehavior()
            boolean r0 = r0 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r0 == 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r0 == 0) goto L60
            goto L61
        L60:
            r1 = 0
        L61:
            if (r1 == 0) goto L71
            com.google.android.material.snackbar.BaseTransientBottomBar$g r0 = r5.f1134c
            com.google.android.material.snackbar.BaseTransientBottomBar$b r1 = r5.f1137f
            r0.removeCallbacks(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$g r0 = r5.f1134c
            com.google.android.material.snackbar.BaseTransientBottomBar$b r1 = r5.f1137f
            r0.post(r1)
        L71:
            return
        L72:
            java.lang.String r0 = com.google.android.material.snackbar.BaseTransientBottomBar.f1131p
            java.lang.String r1 = "Unable to update margins because layout params are not MarginLayoutParams"
            android.util.Log.w(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.i():void");
    }
}
