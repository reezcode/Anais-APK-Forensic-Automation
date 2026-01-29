package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import b2.g;
import b2.k;
import com.google.android.material.textfield.TextInputLayout;
import comeliest.metempsychosis.pokelogan.R;
import java.util.Objects;
import v1.l;

/* loaded from: classes17.dex */
public final class b extends e2.i {

    /* renamed from: e, reason: collision with root package name */
    public final a f1258e;

    /* renamed from: f, reason: collision with root package name */
    public final c f1259f;

    /* renamed from: g, reason: collision with root package name */
    public final d f1260g;

    /* renamed from: h, reason: collision with root package name */
    public final e f1261h;

    /* renamed from: i, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    public final f f1262i;

    /* renamed from: j, reason: collision with root package name */
    public final g f1263j;

    /* renamed from: k, reason: collision with root package name */
    public final h f1264k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1265l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1266m;

    /* renamed from: n, reason: collision with root package name */
    public long f1267n;

    /* renamed from: o, reason: collision with root package name */
    public StateListDrawable f1268o;

    /* renamed from: p, reason: collision with root package name */
    public b2.g f1269p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public AccessibilityManager f1270q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f1271r;

    /* renamed from: s, reason: collision with root package name */
    public ValueAnimator f1272s;

    /* loaded from: classes20.dex */
    public class a extends l {

        /* renamed from: com.google.android.material.textfield.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes18.dex */
        public class RunnableC0021a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f1274b;

            public RunnableC0021a(AutoCompleteTextView autoCompleteTextView) {
                this.f1274b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean isPopupShowing = this.f1274b.isPopupShowing();
                b.f(b.this, isPopupShowing);
                b.this.f1265l = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // v1.l, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AutoCompleteTextView d5 = b.d(b.this.f2545a.getEditText());
            if (b.this.f1270q.isTouchExplorationEnabled() && b.e(d5) && !b.this.f2547c.hasFocus()) {
                d5.dismissDropDown();
            }
            d5.post(new RunnableC0021a(d5));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b, reason: collision with other inner class name */
    /* loaded from: classes11.dex */
    public class C0022b implements ValueAnimator.AnimatorUpdateListener {
        public C0022b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            b.this.f2547c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes18.dex */
    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z4) {
            b.this.f2545a.setEndIconActivated(z4);
            if (z4) {
                return;
            }
            b.f(b.this, false);
            b.this.f1265l = false;
        }
    }

    /* loaded from: classes15.dex */
    public class d extends TextInputLayout.e {
        public d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!b.e(b.this.f2545a.getEditText())) {
                accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
            }
            if (accessibilityNodeInfoCompat.isShowingHintText()) {
                accessibilityNodeInfoCompat.setHintText(null);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView d5 = b.d(b.this.f2545a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.f1270q.isEnabled() && !b.e(b.this.f2545a.getEditText())) {
                b.g(b.this, d5);
                b.h(b.this);
            }
        }
    }

    /* loaded from: classes10.dex */
    public class e implements TextInputLayout.f {
        public e() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x005c  */
        @Override // com.google.android.material.textfield.TextInputLayout.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(@androidx.annotation.NonNull com.google.android.material.textfield.TextInputLayout r6) {
            /*
                r5 = this;
                android.widget.EditText r0 = r6.getEditText()
                android.widget.AutoCompleteTextView r0 = com.google.android.material.textfield.b.d(r0)
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.TextInputLayout r2 = r1.f2545a
                int r2 = r2.getBoxBackgroundMode()
                r3 = 1
                r4 = 2
                if (r2 != r4) goto L17
                b2.g r1 = r1.f1269p
                goto L1b
            L17:
                if (r2 != r3) goto L1e
                android.graphics.drawable.StateListDrawable r1 = r1.f1268o
            L1b:
                r0.setDropDownBackgroundDrawable(r1)
            L1e:
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                r1.i(r0)
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                java.util.Objects.requireNonNull(r1)
                e2.h r2 = new e2.h
                r2.<init>(r1, r0)
                r0.setOnTouchListener(r2)
                com.google.android.material.textfield.b$c r2 = r1.f1259f
                r0.setOnFocusChangeListener(r2)
                e2.f r2 = new e2.f
                r2.<init>(r1)
                r0.setOnDismissListener(r2)
                r1 = 0
                r0.setThreshold(r1)
                com.google.android.material.textfield.b r2 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.b$a r2 = r2.f1258e
                r0.removeTextChangedListener(r2)
                com.google.android.material.textfield.b r2 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.b$a r2 = r2.f1258e
                r0.addTextChangedListener(r2)
                r6.setEndIconCheckable(r3)
                r2 = 0
                r6.setErrorIconDrawable(r2)
                android.text.method.KeyListener r0 = r0.getKeyListener()
                if (r0 == 0) goto L5d
                r1 = 1
            L5d:
                if (r1 != 0) goto L70
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                android.view.accessibility.AccessibilityManager r0 = r0.f1270q
                boolean r0 = r0.isTouchExplorationEnabled()
                if (r0 == 0) goto L70
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                com.google.android.material.internal.CheckableImageButton r0 = r0.f2547c
                androidx.core.view.ViewCompat.setImportantForAccessibility(r0, r4)
            L70:
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.b$d r0 = r0.f1260g
                r6.setTextInputAccessibilityDelegate(r0)
                r6.setEndIconVisible(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.b.e.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* loaded from: classes22.dex */
    public class f implements TextInputLayout.g {

        /* loaded from: classes9.dex */
        public class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f1281b;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f1281b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1281b.removeTextChangedListener(b.this.f1258e);
            }
        }

        public f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(@NonNull TextInputLayout textInputLayout, int i5) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i5 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f1259f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                autoCompleteTextView.setOnDismissListener(null);
            }
            if (i5 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(b.this.f1263j);
                b bVar = b.this;
                AccessibilityManager accessibilityManager = bVar.f1270q;
                if (accessibilityManager != null) {
                    AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, bVar.f1264k);
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public class g implements View.OnAttachStateChangeListener {
        public g() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            b.this.j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            AccessibilityManager accessibilityManager = bVar.f1270q;
            if (accessibilityManager != null) {
                AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, bVar.f1264k);
            }
        }
    }

    /* loaded from: classes6.dex */
    public class h implements AccessibilityManagerCompat.TouchExplorationStateChangeListener {
        public h() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z4) {
            AutoCompleteTextView autoCompleteTextView;
            TextInputLayout textInputLayout = b.this.f2545a;
            if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null) {
                return;
            }
            if (autoCompleteTextView.getKeyListener() != null) {
                return;
            }
            ViewCompat.setImportantForAccessibility(b.this.f2547c, z4 ? 2 : 1);
        }
    }

    /* loaded from: classes2.dex */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.g(b.this, (AutoCompleteTextView) b.this.f2545a.getEditText());
        }
    }

    public b(@NonNull TextInputLayout textInputLayout, @DrawableRes int i5) {
        super(textInputLayout, i5);
        this.f1258e = new a();
        this.f1259f = new c();
        this.f1260g = new d(this.f2545a);
        this.f1261h = new e();
        this.f1262i = new f();
        this.f1263j = new g();
        this.f1264k = new h();
        this.f1265l = false;
        this.f1266m = false;
        this.f1267n = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void f(b bVar, boolean z4) {
        if (bVar.f1266m != z4) {
            bVar.f1266m = z4;
            bVar.f1272s.cancel();
            bVar.f1271r.start();
        }
    }

    public static void g(b bVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(bVar);
        if (autoCompleteTextView == null) {
            return;
        }
        if (bVar.m()) {
            bVar.f1265l = false;
        }
        if (bVar.f1265l) {
            bVar.f1265l = false;
            return;
        }
        boolean z4 = bVar.f1266m;
        boolean z5 = !z4;
        if (z4 != z5) {
            bVar.f1266m = z5;
            bVar.f1272s.cancel();
            bVar.f1271r.start();
        }
        if (!bVar.f1266m) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    public static void h(b bVar) {
        bVar.f1265l = true;
        bVar.f1267n = System.currentTimeMillis();
    }

    @Override // e2.i
    public final void a() {
        float dimensionPixelOffset = this.f2546b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f2546b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f2546b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        b2.g l5 = l(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        b2.g l6 = l(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f1269p = l5;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f1268o = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, l5);
        this.f1268o.addState(new int[0], l6);
        int i5 = this.f2548d;
        if (i5 == 0) {
            i5 = R.drawable.mtrl_dropdown_arrow;
        }
        this.f2545a.setEndIconDrawable(i5);
        TextInputLayout textInputLayout = this.f2545a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f2545a.setEndIconOnClickListener(new i());
        this.f2545a.a(this.f1261h);
        this.f2545a.b(this.f1262i);
        this.f1272s = k(67, 0.0f, 1.0f);
        ValueAnimator k5 = k(50, 1.0f, 0.0f);
        this.f1271r = k5;
        k5.addListener(new e2.g(this));
        this.f1270q = (AccessibilityManager) this.f2546b.getSystemService("accessibility");
        this.f2545a.addOnAttachStateChangeListener(this.f1263j);
        j();
    }

    @Override // e2.i
    public final boolean b(int i5) {
        return i5 != 0;
    }

    public final void i(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f2545a.getBoxBackgroundMode();
        b2.g boxBackground = this.f2545a.getBoxBackground();
        int b5 = p1.a.b(autoCompleteTextView, R.attr.colorControlHighlight);
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode != 2) {
            if (boxBackgroundMode == 1) {
                int boxBackgroundColor = this.f2545a.getBoxBackgroundColor();
                ViewCompat.setBackground(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, new int[]{p1.a.d(b5, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground));
                return;
            }
            return;
        }
        int b6 = p1.a.b(autoCompleteTextView, R.attr.colorSurface);
        b2.g gVar = new b2.g(boxBackground.f324b.f347a);
        int d5 = p1.a.d(b5, b6, 0.1f);
        gVar.o(new ColorStateList(iArr, new int[]{d5, 0}));
        gVar.setTint(b6);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{d5, b6});
        b2.g gVar2 = new b2.g(boxBackground.f324b.f347a);
        gVar2.setTint(-1);
        ViewCompat.setBackground(autoCompleteTextView, new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar, gVar2), boxBackground}));
    }

    public final void j() {
        TextInputLayout textInputLayout;
        if (this.f1270q == null || (textInputLayout = this.f2545a) == null || !ViewCompat.isAttachedToWindow(textInputLayout)) {
            return;
        }
        AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.f1270q, this.f1264k);
    }

    public final ValueAnimator k(int i5, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(f1.a.f2767a);
        ofFloat.setDuration(i5);
        ofFloat.addUpdateListener(new C0022b());
        return ofFloat;
    }

    public final b2.g l(float f5, float f6, float f7, int i5) {
        k.a aVar = new k.a();
        aVar.e(f5);
        aVar.f(f5);
        aVar.c(f6);
        aVar.d(f6);
        k a5 = aVar.a();
        Context context = this.f2546b;
        String str = b2.g.f322x;
        int b5 = y1.b.b(context, R.attr.colorSurface, b2.g.class.getSimpleName());
        b2.g gVar = new b2.g();
        gVar.m(context);
        gVar.o(ColorStateList.valueOf(b5));
        gVar.n(f7);
        gVar.setShapeAppearanceModel(a5);
        g.b bVar = gVar.f324b;
        if (bVar.f354h == null) {
            bVar.f354h = new Rect();
        }
        gVar.f324b.f354h.set(0, i5, 0, i5);
        gVar.invalidateSelf();
        return gVar;
    }

    public final boolean m() {
        long currentTimeMillis = System.currentTimeMillis() - this.f1267n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
