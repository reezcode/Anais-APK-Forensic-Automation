package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import b2.k;
import com.google.android.material.internal.CheckableImageButton;
import comeliest.metempsychosis.pokelogan.R;
import e2.i;
import e2.j;
import e2.l;
import e2.n;
import e2.o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import v1.m;
import v1.r;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    @Nullable
    public ColorStateList A;

    @ColorInt
    public int A0;

    @Nullable
    public CharSequence B;

    @ColorInt
    public int B0;

    @NonNull
    public final AppCompatTextView C;
    public boolean C0;
    public boolean D;
    public final v1.d D0;
    public CharSequence E;
    public boolean E0;
    public boolean F;
    public boolean F0;

    @Nullable
    public b2.g G;
    public ValueAnimator G0;

    @Nullable
    public b2.g H;
    public boolean H0;

    @Nullable
    public b2.g I;
    public boolean I0;

    @NonNull
    public k J;
    public boolean K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;

    @ColorInt
    public int R;

    @ColorInt
    public int S;
    public final Rect T;
    public final Rect U;
    public final RectF V;
    public Typeface W;

    /* renamed from: a0, reason: collision with root package name */
    @Nullable
    public ColorDrawable f1185a0;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f1186b;

    /* renamed from: b0, reason: collision with root package name */
    public int f1187b0;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final o f1188c;

    /* renamed from: c0, reason: collision with root package name */
    public final LinkedHashSet<f> f1189c0;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f1190d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1191d0;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f1192e;

    /* renamed from: e0, reason: collision with root package name */
    public final SparseArray<i> f1193e0;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1194f;

    /* renamed from: f0, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f1195f0;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f1196g;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet<g> f1197g0;

    /* renamed from: h, reason: collision with root package name */
    public int f1198h;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f1199h0;

    /* renamed from: i, reason: collision with root package name */
    public int f1200i;

    /* renamed from: i0, reason: collision with root package name */
    public PorterDuff.Mode f1201i0;

    /* renamed from: j, reason: collision with root package name */
    public int f1202j;

    /* renamed from: j0, reason: collision with root package name */
    @Nullable
    public ColorDrawable f1203j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1204k;

    /* renamed from: k0, reason: collision with root package name */
    public int f1205k0;

    /* renamed from: l, reason: collision with root package name */
    public final e2.k f1206l;

    /* renamed from: l0, reason: collision with root package name */
    public Drawable f1207l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1208m;

    /* renamed from: m0, reason: collision with root package name */
    public View.OnLongClickListener f1209m0;

    /* renamed from: n, reason: collision with root package name */
    public int f1210n;
    public View.OnLongClickListener n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1211o;

    @NonNull
    public final CheckableImageButton o0;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f1212p;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f1213p0;

    /* renamed from: q, reason: collision with root package name */
    public int f1214q;

    /* renamed from: q0, reason: collision with root package name */
    public PorterDuff.Mode f1215q0;

    /* renamed from: r, reason: collision with root package name */
    public int f1216r;

    /* renamed from: r0, reason: collision with root package name */
    public ColorStateList f1217r0;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1218s;

    /* renamed from: s0, reason: collision with root package name */
    public ColorStateList f1219s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1220t;

    /* renamed from: t0, reason: collision with root package name */
    @ColorInt
    public int f1221t0;

    /* renamed from: u, reason: collision with root package name */
    public AppCompatTextView f1222u;

    /* renamed from: u0, reason: collision with root package name */
    @ColorInt
    public int f1223u0;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public ColorStateList f1224v;

    /* renamed from: v0, reason: collision with root package name */
    @ColorInt
    public int f1225v0;

    /* renamed from: w, reason: collision with root package name */
    public int f1226w;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f1227w0;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public Fade f1228x;

    /* renamed from: x0, reason: collision with root package name */
    @ColorInt
    public int f1229x0;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public Fade f1230y;

    /* renamed from: y0, reason: collision with root package name */
    @ColorInt
    public int f1231y0;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public ColorStateList f1232z;

    /* renamed from: z0, reason: collision with root package name */
    @ColorInt
    public int f1233z0;

    /* loaded from: classes24.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout.this.A(!r0.I0, false);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f1208m) {
                textInputLayout.t(editable.length());
            }
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f1220t) {
                textInputLayout2.B(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }
    }

    /* loaded from: classes25.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f1195f0.performClick();
            TextInputLayout.this.f1195f0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes22.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f1194f.requestLayout();
        }
    }

    /* loaded from: classes10.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.D0.o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes14.dex */
    public static class e extends AccessibilityDelegateCompat {

        /* renamed from: a, reason: collision with root package name */
        public final TextInputLayout f1238a;

        public e(@NonNull TextInputLayout textInputLayout) {
            this.f1238a = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
        
            if (r2 != null) goto L30;
         */
        @Override // androidx.core.view.AccessibilityDelegateCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull android.view.View r13, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r14) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
        }
    }

    /* loaded from: classes16.dex */
    public interface f {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    /* loaded from: classes23.dex */
    public interface g {
        void a(@NonNull TextInputLayout textInputLayout, int i5);
    }

    /* loaded from: classes9.dex */
    public static class h extends AbsSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public CharSequence f1239b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1240c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public CharSequence f1241d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        public CharSequence f1242e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public CharSequence f1243f;

        /* loaded from: classes13.dex */
        public class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final h createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i5) {
                return new h[i5];
            }
        }

        public h(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1239b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1240c = parcel.readInt() == 1;
            this.f1241d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1242e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1243f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public final String toString() {
            StringBuilder g5 = androidx.activity.d.g("TextInputLayout.SavedState{");
            g5.append(Integer.toHexString(System.identityHashCode(this)));
            g5.append(" error=");
            g5.append((Object) this.f1239b);
            g5.append(" hint=");
            g5.append((Object) this.f1241d);
            g5.append(" helperText=");
            g5.append((Object) this.f1242e);
            g5.append(" placeholderText=");
            g5.append((Object) this.f1243f);
            g5.append("}");
            return g5.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            TextUtils.writeToParcel(this.f1239b, parcel, i5);
            parcel.writeInt(this.f1240c ? 1 : 0);
            TextUtils.writeToParcel(this.f1241d, parcel, i5);
            TextUtils.writeToParcel(this.f1242e, parcel, i5);
            TextUtils.writeToParcel(this.f1243f, parcel, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v64 */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(f2.a.a(context, attributeSet, R.attr.textInputStyle, 2131755803), attributeSet, R.attr.textInputStyle);
        int i5;
        ?? r6;
        int colorForState;
        this.f1198h = -1;
        this.f1200i = -1;
        this.f1202j = -1;
        this.f1204k = -1;
        this.f1206l = new e2.k(this);
        this.T = new Rect();
        this.U = new Rect();
        this.V = new RectF();
        this.f1189c0 = new LinkedHashSet<>();
        this.f1191d0 = 0;
        SparseArray<i> sparseArray = new SparseArray<>();
        this.f1193e0 = sparseArray;
        this.f1197g0 = new LinkedHashSet<>();
        v1.d dVar = new v1.d(this);
        this.D0 = dVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1186b = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f1192e = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f1190d = linearLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.C = appCompatTextView;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        appCompatTextView.setVisibility(8);
        LayoutInflater from = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout, false);
        this.o0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.f1195f0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearInterpolator linearInterpolator = f1.a.f2767a;
        dVar.O = linearInterpolator;
        dVar.k(false);
        dVar.N = linearInterpolator;
        dVar.k(false);
        dVar.m(8388659);
        int[] iArr = i.g.F;
        m.a(context2, attributeSet, R.attr.textInputStyle, 2131755803);
        m.b(context2, attributeSet, iArr, R.attr.textInputStyle, 2131755803, 22, 20, 35, 40, 44);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context2, attributeSet, iArr, R.attr.textInputStyle, 2131755803);
        o oVar = new o(this, obtainStyledAttributes);
        this.f1188c = oVar;
        this.D = obtainStyledAttributes.getBoolean(43, true);
        setHint(obtainStyledAttributes.getText(4));
        this.F0 = obtainStyledAttributes.getBoolean(42, true);
        this.E0 = obtainStyledAttributes.getBoolean(37, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.J = new k(k.b(context2, attributeSet, R.attr.textInputStyle, 2131755803));
        this.L = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.N = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.P = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.Q = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.O = this.P;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        k kVar = this.J;
        Objects.requireNonNull(kVar);
        k.a aVar = new k.a(kVar);
        if (dimension >= 0.0f) {
            aVar.e(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVar.f(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVar.d(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVar.c(dimension4);
        }
        this.J = new k(aVar);
        ColorStateList b5 = y1.c.b(context2, obtainStyledAttributes, 7);
        if (b5 != null) {
            int defaultColor = b5.getDefaultColor();
            this.f1229x0 = defaultColor;
            this.S = defaultColor;
            if (b5.isStateful()) {
                this.f1231y0 = b5.getColorForState(new int[]{-16842910}, -1);
                this.f1233z0 = b5.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                colorForState = b5.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
                i5 = 0;
            } else {
                this.f1233z0 = this.f1229x0;
                ColorStateList colorStateList = AppCompatResources.getColorStateList(context2, R.color.mtrl_filled_background_color);
                i5 = 0;
                this.f1231y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
            this.A0 = colorForState;
        } else {
            i5 = 0;
            this.S = 0;
            this.f1229x0 = 0;
            this.f1231y0 = 0;
            this.f1233z0 = 0;
            this.A0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(1);
            this.f1219s0 = colorStateList2;
            this.f1217r0 = colorStateList2;
        }
        ColorStateList b6 = y1.c.b(context2, obtainStyledAttributes, 14);
        this.f1225v0 = obtainStyledAttributes.getColor(14, i5);
        this.f1221t0 = ContextCompat.getColor(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.B0 = ContextCompat.getColor(context2, R.color.mtrl_textinput_disabled_color);
        this.f1223u0 = ContextCompat.getColor(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b6 != null) {
            setBoxStrokeColorStateList(b6);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(y1.c.b(context2, obtainStyledAttributes, 15));
        }
        if (obtainStyledAttributes.getResourceId(44, -1) != -1) {
            r6 = 0;
            setHintTextAppearance(obtainStyledAttributes.getResourceId(44, 0));
        } else {
            r6 = 0;
        }
        int resourceId = obtainStyledAttributes.getResourceId(35, r6);
        CharSequence text = obtainStyledAttributes.getText(30);
        boolean z4 = obtainStyledAttributes.getBoolean(31, r6);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (y1.c.d(context2)) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r6);
        }
        if (obtainStyledAttributes.hasValue(33)) {
            this.f1213p0 = y1.c.b(context2, obtainStyledAttributes, 33);
        }
        if (obtainStyledAttributes.hasValue(34)) {
            this.f1215q0 = r.b(obtainStyledAttributes.getInt(34, -1), null);
        }
        if (obtainStyledAttributes.hasValue(32)) {
            setErrorIconDrawable(obtainStyledAttributes.getDrawable(32));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int resourceId2 = obtainStyledAttributes.getResourceId(40, 0);
        boolean z5 = obtainStyledAttributes.getBoolean(39, false);
        CharSequence text2 = obtainStyledAttributes.getText(38);
        int resourceId3 = obtainStyledAttributes.getResourceId(52, 0);
        CharSequence text3 = obtainStyledAttributes.getText(51);
        int resourceId4 = obtainStyledAttributes.getResourceId(65, 0);
        CharSequence text4 = obtainStyledAttributes.getText(64);
        boolean z6 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f1216r = obtainStyledAttributes.getResourceId(22, 0);
        this.f1214q = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        if (y1.c.d(context2)) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int resourceId5 = obtainStyledAttributes.getResourceId(26, 0);
        sparseArray.append(-1, new e2.d(this, resourceId5));
        sparseArray.append(0, new n(this));
        sparseArray.append(1, new com.google.android.material.textfield.c(this, resourceId5 == 0 ? obtainStyledAttributes.getResourceId(47, 0) : resourceId5));
        sparseArray.append(2, new com.google.android.material.textfield.a(this, resourceId5));
        sparseArray.append(3, new com.google.android.material.textfield.b(this, resourceId5));
        if (!obtainStyledAttributes.hasValue(48)) {
            if (obtainStyledAttributes.hasValue(28)) {
                this.f1199h0 = y1.c.b(context2, obtainStyledAttributes, 28);
            }
            if (obtainStyledAttributes.hasValue(29)) {
                this.f1201i0 = r.b(obtainStyledAttributes.getInt(29, -1), null);
            }
        }
        if (obtainStyledAttributes.hasValue(27)) {
            setEndIconMode(obtainStyledAttributes.getInt(27, 0));
            if (obtainStyledAttributes.hasValue(25)) {
                setEndIconContentDescription(obtainStyledAttributes.getText(25));
            }
            setEndIconCheckable(obtainStyledAttributes.getBoolean(24, true));
        } else if (obtainStyledAttributes.hasValue(48)) {
            if (obtainStyledAttributes.hasValue(49)) {
                this.f1199h0 = y1.c.b(context2, obtainStyledAttributes, 49);
            }
            if (obtainStyledAttributes.hasValue(50)) {
                this.f1201i0 = r.b(obtainStyledAttributes.getInt(50, -1), null);
            }
            setEndIconMode(obtainStyledAttributes.getBoolean(48, false) ? 1 : 0);
            setEndIconContentDescription(obtainStyledAttributes.getText(46));
        }
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        ViewCompat.setAccessibilityLiveRegion(appCompatTextView, 1);
        setErrorContentDescription(text);
        setCounterOverflowTextAppearance(this.f1214q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1216r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        setSuffixTextAppearance(resourceId4);
        if (obtainStyledAttributes.hasValue(36)) {
            setErrorTextColor(obtainStyledAttributes.getColorStateList(36));
        }
        if (obtainStyledAttributes.hasValue(41)) {
            setHelperTextColor(obtainStyledAttributes.getColorStateList(41));
        }
        if (obtainStyledAttributes.hasValue(45)) {
            setHintTextColor(obtainStyledAttributes.getColorStateList(45));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(obtainStyledAttributes.getColorStateList(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(obtainStyledAttributes.getColorStateList(21));
        }
        if (obtainStyledAttributes.hasValue(53)) {
            setPlaceholderTextColor(obtainStyledAttributes.getColorStateList(53));
        }
        if (obtainStyledAttributes.hasValue(66)) {
            setSuffixTextColor(obtainStyledAttributes.getColorStateList(66));
        }
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        ViewCompat.setImportantForAccessibility(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.setImportantForAutofill(this, 1);
        }
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(oVar);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(z5);
        setErrorEnabled(z4);
        setCounterEnabled(z6);
        setHelperText(text2);
        setSuffixText(text4);
    }

    private i getEndIconDelegate() {
        i iVar = this.f1193e0.get(this.f1191d0);
        return iVar != null ? iVar : this.f1193e0.get(0);
    }

    @Nullable
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.o0.getVisibility() == 0) {
            return this.o0;
        }
        if (i() && k()) {
            return this.f1195f0;
        }
        return null;
    }

    public static void o(@NonNull ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                o((ViewGroup) childAt, z4);
            }
        }
    }

    public static void q(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = ViewCompat.hasOnClickListeners(checkableImageButton);
        boolean z4 = onLongClickListener != null;
        boolean z5 = hasOnClickListeners || z4;
        checkableImageButton.setFocusable(z5);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z4);
        ViewCompat.setImportantForAccessibility(checkableImageButton, z5 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        if (this.f1194f != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f1191d0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1194f = editText;
        int i5 = this.f1198h;
        if (i5 != -1) {
            setMinEms(i5);
        } else {
            setMinWidth(this.f1202j);
        }
        int i6 = this.f1200i;
        if (i6 != -1) {
            setMaxEms(i6);
        } else {
            setMaxWidth(this.f1204k);
        }
        m();
        setTextInputAccessibilityDelegate(new e(this));
        this.D0.q(this.f1194f.getTypeface());
        v1.d dVar = this.D0;
        float textSize = this.f1194f.getTextSize();
        if (dVar.f5573i != textSize) {
            dVar.f5573i = textSize;
            dVar.k(false);
        }
        v1.d dVar2 = this.D0;
        float letterSpacing = this.f1194f.getLetterSpacing();
        if (dVar2.U != letterSpacing) {
            dVar2.U = letterSpacing;
            dVar2.k(false);
        }
        int gravity = this.f1194f.getGravity();
        this.D0.m((gravity & (-113)) | 48);
        v1.d dVar3 = this.D0;
        if (dVar3.f5571g != gravity) {
            dVar3.f5571g = gravity;
            dVar3.k(false);
        }
        this.f1194f.addTextChangedListener(new a());
        if (this.f1217r0 == null) {
            this.f1217r0 = this.f1194f.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.f1194f.getHint();
                this.f1196g = hint;
                setHint(hint);
                this.f1194f.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (this.f1212p != null) {
            t(this.f1194f.getText().length());
        }
        w();
        this.f1206l.b();
        this.f1188c.bringToFront();
        this.f1190d.bringToFront();
        this.f1192e.bringToFront();
        this.o0.bringToFront();
        Iterator<f> it = this.f1189c0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        D();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        A(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        v1.d dVar = this.D0;
        if (charSequence == null || !TextUtils.equals(dVar.A, charSequence)) {
            dVar.A = charSequence;
            dVar.B = null;
            Bitmap bitmap = dVar.D;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.D = null;
            }
            dVar.k(false);
        }
        if (this.C0) {
            return;
        }
        n();
    }

    private void setPlaceholderTextEnabled(boolean z4) {
        if (this.f1220t == z4) {
            return;
        }
        if (z4) {
            AppCompatTextView appCompatTextView = this.f1222u;
            if (appCompatTextView != null) {
                this.f1186b.addView(appCompatTextView);
                this.f1222u.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f1222u;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f1222u = null;
        }
        this.f1220t = z4;
    }

    public final void A(boolean z4, boolean z5) {
        ColorStateList colorStateList;
        v1.d dVar;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1194f;
        boolean z6 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f1194f;
        boolean z7 = editText2 != null && editText2.hasFocus();
        boolean e5 = this.f1206l.e();
        ColorStateList colorStateList2 = this.f1217r0;
        if (colorStateList2 != null) {
            this.D0.l(colorStateList2);
            v1.d dVar2 = this.D0;
            ColorStateList colorStateList3 = this.f1217r0;
            if (dVar2.f5575k != colorStateList3) {
                dVar2.f5575k = colorStateList3;
                dVar2.k(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f1217r0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.B0) : this.B0;
            this.D0.l(ColorStateList.valueOf(colorForState));
            v1.d dVar3 = this.D0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (dVar3.f5575k != valueOf) {
                dVar3.f5575k = valueOf;
                dVar3.k(false);
            }
        } else if (e5) {
            v1.d dVar4 = this.D0;
            AppCompatTextView appCompatTextView2 = this.f1206l.f2560l;
            dVar4.l(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else {
            if (this.f1211o && (appCompatTextView = this.f1212p) != null) {
                dVar = this.D0;
                colorStateList = appCompatTextView.getTextColors();
            } else if (z7 && (colorStateList = this.f1219s0) != null) {
                dVar = this.D0;
            }
            dVar.l(colorStateList);
        }
        if (z6 || !this.E0 || (isEnabled() && z7)) {
            if (z5 || this.C0) {
                ValueAnimator valueAnimator = this.G0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.G0.cancel();
                }
                if (z4 && this.F0) {
                    c(1.0f);
                } else {
                    this.D0.o(1.0f);
                }
                this.C0 = false;
                if (f()) {
                    n();
                }
                EditText editText3 = this.f1194f;
                B(editText3 == null ? 0 : editText3.getText().length());
                o oVar = this.f1188c;
                oVar.f2588i = false;
                oVar.g();
                E();
                return;
            }
            return;
        }
        if (z5 || !this.C0) {
            ValueAnimator valueAnimator2 = this.G0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.G0.cancel();
            }
            if (z4 && this.F0) {
                c(0.0f);
            } else {
                this.D0.o(0.0f);
            }
            if (f() && (!((e2.e) this.G).f2540z.isEmpty()) && f()) {
                ((e2.e) this.G).x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.C0 = true;
            j();
            o oVar2 = this.f1188c;
            oVar2.f2588i = true;
            oVar2.g();
            E();
        }
    }

    public final void B(int i5) {
        if (i5 != 0 || this.C0) {
            j();
            return;
        }
        if (this.f1222u == null || !this.f1220t || TextUtils.isEmpty(this.f1218s)) {
            return;
        }
        this.f1222u.setText(this.f1218s);
        TransitionManager.beginDelayedTransition(this.f1186b, this.f1228x);
        this.f1222u.setVisibility(0);
        this.f1222u.bringToFront();
        announceForAccessibility(this.f1218s);
    }

    public final void C(boolean z4, boolean z5) {
        int defaultColor = this.f1227w0.getDefaultColor();
        int colorForState = this.f1227w0.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1227w0.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z4) {
            this.R = colorForState2;
        } else if (z5) {
            this.R = colorForState;
        } else {
            this.R = defaultColor;
        }
    }

    public final void D() {
        if (this.f1194f == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.C, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.f1194f.getPaddingTop(), (k() || l()) ? 0 : ViewCompat.getPaddingEnd(this.f1194f), this.f1194f.getPaddingBottom());
    }

    public final void E() {
        int visibility = this.C.getVisibility();
        int i5 = (this.B == null || this.C0) ? 8 : 0;
        if (visibility != i5) {
            getEndIconDelegate().c(i5 == 0);
        }
        x();
        this.C.setVisibility(i5);
        v();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.F():void");
    }

    public final void a(@NonNull f fVar) {
        this.f1189c0.add(fVar);
        if (this.f1194f != null) {
            fVar.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i5, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i5, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f1186b.addView(view, layoutParams2);
        this.f1186b.setLayoutParams(layoutParams);
        z();
        setEditText((EditText) view);
    }

    public final void b(@NonNull g gVar) {
        this.f1197g0.add(gVar);
    }

    @VisibleForTesting
    public final void c(float f5) {
        if (this.D0.f5567c == f5) {
            return;
        }
        if (this.G0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.G0 = valueAnimator;
            valueAnimator.setInterpolator(f1.a.f2768b);
            this.G0.setDuration(167L);
            this.G0.addUpdateListener(new d());
        }
        this.G0.setFloatValues(this.D0.f5567c, f5);
        this.G0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r7 = this;
            b2.g r0 = r7.G
            if (r0 != 0) goto L5
            return
        L5:
            b2.g$b r1 = r0.f324b
            b2.k r1 = r1.f347a
            b2.k r2 = r7.J
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r2) goto L4a
            r0.setShapeAppearanceModel(r2)
            int r0 = r7.f1191d0
            if (r0 != r3) goto L4a
            int r0 = r7.M
            if (r0 != r4) goto L4a
            android.util.SparseArray<e2.i> r0 = r7.f1193e0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.textfield.b r0 = (com.google.android.material.textfield.b) r0
            android.widget.EditText r1 = r7.f1194f
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            java.util.Objects.requireNonNull(r0)
            android.text.method.KeyListener r2 = r1.getKeyListener()
            if (r2 == 0) goto L33
            r2 = 1
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 != 0) goto L4a
            com.google.android.material.textfield.TextInputLayout r2 = r0.f2545a
            int r2 = r2.getBoxBackgroundMode()
            if (r2 != r4) goto L4a
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.LayerDrawable
            if (r2 != 0) goto L47
            goto L4a
        L47:
            r0.i(r1)
        L4a:
            int r0 = r7.M
            r1 = -1
            if (r0 != r4) goto L5e
            int r0 = r7.O
            if (r0 <= r1) goto L59
            int r0 = r7.R
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            if (r0 == 0) goto L5e
            r0 = 1
            goto L5f
        L5e:
            r0 = 0
        L5f:
            if (r0 == 0) goto L6b
            b2.g r0 = r7.G
            int r2 = r7.O
            float r2 = (float) r2
            int r4 = r7.R
            r0.q(r2, r4)
        L6b:
            int r0 = r7.S
            int r2 = r7.M
            if (r2 != r6) goto L82
            r0 = 2130903297(0x7f030101, float:1.7413408E38)
            android.content.Context r2 = r7.getContext()
            int r0 = p1.a.a(r2, r0, r5)
            int r2 = r7.S
            int r0 = androidx.core.graphics.ColorUtils.compositeColors(r2, r0)
        L82:
            r7.S = r0
            b2.g r2 = r7.G
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.o(r0)
            int r0 = r7.f1191d0
            if (r0 != r3) goto L9a
            android.widget.EditText r0 = r7.f1194f
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L9a:
            b2.g r0 = r7.H
            if (r0 == 0) goto Ld0
            b2.g r2 = r7.I
            if (r2 != 0) goto La3
            goto Ld0
        La3:
            int r2 = r7.O
            if (r2 <= r1) goto Lac
            int r1 = r7.R
            if (r1 == 0) goto Lac
            r5 = 1
        Lac:
            if (r5 == 0) goto Lcd
            android.widget.EditText r1 = r7.f1194f
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto Lb9
            int r1 = r7.f1221t0
            goto Lbb
        Lb9:
            int r1 = r7.R
        Lbb:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.o(r1)
            b2.g r0 = r7.I
            int r1 = r7.R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.o(r1)
        Lcd:
            r7.invalidate()
        Ld0:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i5) {
        EditText editText = this.f1194f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i5);
            return;
        }
        if (this.f1196g != null) {
            boolean z4 = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.f1194f.setHint(this.f1196g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i5);
                return;
            } finally {
                this.f1194f.setHint(hint);
                this.F = z4;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i5);
        onProvideAutofillVirtualStructure(viewStructure, i5);
        viewStructure.setChildCount(this.f1186b.getChildCount());
        for (int i6 = 0; i6 < this.f1186b.getChildCount(); i6++) {
            View childAt = this.f1186b.getChildAt(i6);
            ViewStructure newChild = viewStructure.newChild(i6);
            childAt.dispatchProvideAutofillStructure(newChild, i5);
            if (childAt == this.f1194f) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.I0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.I0 = false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        b2.g gVar;
        super.draw(canvas);
        if (this.D) {
            v1.d dVar = this.D0;
            Objects.requireNonNull(dVar);
            int save = canvas.save();
            if (dVar.B != null && dVar.f5566b) {
                dVar.L.setTextSize(dVar.F);
                float f5 = dVar.f5581q;
                float f6 = dVar.f5582r;
                float f7 = dVar.E;
                if (f7 != 1.0f) {
                    canvas.scale(f7, f7, f5, f6);
                }
                canvas.translate(f5, f6);
                dVar.W.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.I == null || (gVar = this.H) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f1194f.isFocused()) {
            Rect bounds = this.I.getBounds();
            Rect bounds2 = this.H.getBounds();
            float f8 = this.D0.f5567c;
            int centerX = bounds2.centerX();
            int i5 = bounds2.left;
            LinearInterpolator linearInterpolator = f1.a.f2767a;
            bounds.left = Math.round((i5 - centerX) * f8) + centerX;
            bounds.right = Math.round(f8 * (bounds2.right - centerX)) + centerX;
            this.I.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z4;
        ColorStateList colorStateList;
        boolean z5;
        if (this.H0) {
            return;
        }
        this.H0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        v1.d dVar = this.D0;
        if (dVar != null) {
            dVar.J = drawableState;
            ColorStateList colorStateList2 = dVar.f5576l;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f5575k) != null && colorStateList.isStateful())) {
                dVar.k(false);
                z5 = true;
            } else {
                z5 = false;
            }
            z4 = z5 | false;
        } else {
            z4 = false;
        }
        if (this.f1194f != null) {
            A(ViewCompat.isLaidOut(this) && isEnabled(), false);
        }
        w();
        F();
        if (z4) {
            invalidate();
        }
        this.H0 = false;
    }

    public final int e() {
        float e5;
        if (!this.D) {
            return 0;
        }
        int i5 = this.M;
        if (i5 == 0) {
            e5 = this.D0.e();
        } else {
            if (i5 != 2) {
                return 0;
            }
            e5 = this.D0.e() / 2.0f;
        }
        return (int) e5;
    }

    public final boolean f() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof e2.e);
    }

    public final int g(int i5, boolean z4) {
        int compoundPaddingLeft = this.f1194f.getCompoundPaddingLeft() + i5;
        return (getPrefixText() == null || z4) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1194f;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public b2.g getBoxBackground() {
        int i5 = this.M;
        if (i5 == 1 || i5 == 2) {
            return this.G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.S;
    }

    public int getBoxBackgroundMode() {
        return this.M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (r.a(this) ? this.J.f376h : this.J.f375g).a(this.V);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (r.a(this) ? this.J.f375g : this.J.f376h).a(this.V);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (r.a(this) ? this.J.f373e : this.J.f374f).a(this.V);
    }

    public float getBoxCornerRadiusTopStart() {
        return (r.a(this) ? this.J.f374f : this.J.f373e).a(this.V);
    }

    public int getBoxStrokeColor() {
        return this.f1225v0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1227w0;
    }

    public int getBoxStrokeWidth() {
        return this.P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.Q;
    }

    public int getCounterMaxLength() {
        return this.f1210n;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f1208m && this.f1211o && (appCompatTextView = this.f1212p) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f1232z;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f1232z;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f1217r0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f1194f;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f1195f0.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f1195f0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f1191d0;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f1195f0;
    }

    @Nullable
    public CharSequence getError() {
        e2.k kVar = this.f1206l;
        if (kVar.f2559k) {
            return kVar.f2558j;
        }
        return null;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f1206l.f2561m;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.f1206l.g();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.o0.getDrawable();
    }

    @VisibleForTesting
    public final int getErrorTextCurrentColor() {
        return this.f1206l.g();
    }

    @Nullable
    public CharSequence getHelperText() {
        e2.k kVar = this.f1206l;
        if (kVar.f2565q) {
            return kVar.f2564p;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f1206l.f2566r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.D0.e();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.D0.f();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f1219s0;
    }

    public int getMaxEms() {
        return this.f1200i;
    }

    @Px
    public int getMaxWidth() {
        return this.f1204k;
    }

    public int getMinEms() {
        return this.f1198h;
    }

    @Px
    public int getMinWidth() {
        return this.f1202j;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1195f0.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1195f0.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f1220t) {
            return this.f1218s;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f1226w;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f1224v;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f1188c.f2583d;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f1188c.f2582c.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f1188c.f2582c;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f1188c.f2584e.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f1188c.f2584e.getDrawable();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.B;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.C.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.C;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.W;
    }

    public final int h(int i5, boolean z4) {
        int compoundPaddingRight = i5 - this.f1194f.getCompoundPaddingRight();
        return (getPrefixText() == null || !z4) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final boolean i() {
        return this.f1191d0 != 0;
    }

    public final void j() {
        AppCompatTextView appCompatTextView = this.f1222u;
        if (appCompatTextView == null || !this.f1220t) {
            return;
        }
        appCompatTextView.setText((CharSequence) null);
        TransitionManager.beginDelayedTransition(this.f1186b, this.f1230y);
        this.f1222u.setVisibility(4);
    }

    public final boolean k() {
        return this.f1192e.getVisibility() == 0 && this.f1195f0.getVisibility() == 0;
    }

    public final boolean l() {
        return this.o0.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m():void");
    }

    public final void n() {
        float f5;
        float f6;
        float f7;
        float f8;
        if (f()) {
            RectF rectF = this.V;
            v1.d dVar = this.D0;
            int width = this.f1194f.getWidth();
            int gravity = this.f1194f.getGravity();
            boolean b5 = dVar.b(dVar.A);
            dVar.C = b5;
            if (gravity == 17 || (gravity & 7) == 1) {
                f5 = width / 2.0f;
                f6 = dVar.X / 2.0f;
            } else {
                if ((gravity & GravityCompat.END) == 8388613 || (gravity & 5) == 5 ? b5 : !b5) {
                    f7 = dVar.f5569e.left;
                    rectF.left = f7;
                    Rect rect = dVar.f5569e;
                    float f9 = rect.top;
                    rectF.top = f9;
                    if (gravity != 17 || (gravity & 7) == 1) {
                        f8 = (width / 2.0f) + (dVar.X / 2.0f);
                    } else if ((gravity & GravityCompat.END) == 8388613 || (gravity & 5) == 5) {
                        if (b5) {
                            f8 = dVar.X + f7;
                        }
                        f8 = rect.right;
                    } else {
                        if (!b5) {
                            f8 = dVar.X + f7;
                        }
                        f8 = rect.right;
                    }
                    rectF.right = f8;
                    rectF.bottom = dVar.e() + f9;
                    float f10 = rectF.left;
                    float f11 = this.L;
                    rectF.left = f10 - f11;
                    rectF.right += f11;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.O);
                    e2.e eVar = (e2.e) this.G;
                    Objects.requireNonNull(eVar);
                    eVar.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
                }
                f5 = dVar.f5569e.right;
                f6 = dVar.X;
            }
            f7 = f5 - f6;
            rectF.left = f7;
            Rect rect2 = dVar.f5569e;
            float f92 = rect2.top;
            rectF.top = f92;
            if (gravity != 17) {
            }
            f8 = (width / 2.0f) + (dVar.X / 2.0f);
            rectF.right = f8;
            rectF.bottom = dVar.e() + f92;
            float f102 = rectF.left;
            float f112 = this.L;
            rectF.left = f102 - f112;
            rectF.right += f112;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.O);
            e2.e eVar2 = (e2.e) this.G;
            Objects.requireNonNull(eVar2);
            eVar2.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.D0.i(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        boolean z4;
        EditText editText;
        int max;
        super.onMeasure(i5, i6);
        if (this.f1194f != null && this.f1194f.getMeasuredHeight() < (max = Math.max(this.f1190d.getMeasuredHeight(), this.f1188c.getMeasuredHeight()))) {
            this.f1194f.setMinimumHeight(max);
            z4 = true;
        } else {
            z4 = false;
        }
        boolean v4 = v();
        if (z4 || v4) {
            this.f1194f.post(new c());
        }
        if (this.f1222u != null && (editText = this.f1194f) != null) {
            this.f1222u.setGravity(editText.getGravity());
            this.f1222u.setPadding(this.f1194f.getCompoundPaddingLeft(), this.f1194f.getCompoundPaddingTop(), this.f1194f.getCompoundPaddingRight(), this.f1194f.getCompoundPaddingBottom());
        }
        D();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        setError(hVar.f1239b);
        if (hVar.f1240c) {
            this.f1195f0.post(new b());
        }
        setHint(hVar.f1241d);
        setHelperText(hVar.f1242e);
        setPlaceholderText(hVar.f1243f);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        boolean z4 = false;
        boolean z5 = i5 == 1;
        boolean z6 = this.K;
        if (z5 != z6) {
            if (z5 && !z6) {
                z4 = true;
            }
            float a5 = this.J.f373e.a(this.V);
            float a6 = this.J.f374f.a(this.V);
            float a7 = this.J.f376h.a(this.V);
            float a8 = this.J.f375g.a(this.V);
            float f5 = z4 ? a5 : a6;
            if (z4) {
                a5 = a6;
            }
            float f6 = z4 ? a7 : a8;
            if (z4) {
                a7 = a8;
            }
            boolean a9 = r.a(this);
            this.K = a9;
            float f7 = a9 ? a5 : f5;
            if (!a9) {
                f5 = a5;
            }
            float f8 = a9 ? a7 : f6;
            if (!a9) {
                f6 = a7;
            }
            b2.g gVar = this.G;
            if (gVar != null && gVar.k() == f7) {
                b2.g gVar2 = this.G;
                if (gVar2.f324b.f347a.f374f.a(gVar2.h()) == f5) {
                    b2.g gVar3 = this.G;
                    if (gVar3.f324b.f347a.f376h.a(gVar3.h()) == f8) {
                        b2.g gVar4 = this.G;
                        if (gVar4.f324b.f347a.f375g.a(gVar4.h()) == f6) {
                            return;
                        }
                    }
                }
            }
            k kVar = this.J;
            Objects.requireNonNull(kVar);
            k.a aVar = new k.a(kVar);
            aVar.e(f7);
            aVar.f(f5);
            aVar.c(f8);
            aVar.d(f6);
            this.J = aVar.a();
            d();
        }
    }

    @Override // android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f1206l.e()) {
            hVar.f1239b = getError();
        }
        hVar.f1240c = i() && this.f1195f0.isChecked();
        hVar.f1241d = getHint();
        hVar.f1242e = getHelperText();
        hVar.f1243f = getPlaceholderText();
        return hVar;
    }

    public final void p() {
        j.c(this, this.f1195f0, this.f1199h0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(@androidx.annotation.NonNull android.widget.TextView r3, @androidx.annotation.StyleRes int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.TextViewCompat.setTextAppearance(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L32
            r4 = 2131755400(0x7f100188, float:1.9141678E38)
            androidx.core.widget.TextViewCompat.setTextAppearance(r3, r4)
            android.content.Context r4 = r2.getContext()
            r0 = 2131034253(0x7f05008d, float:1.7679018E38)
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r0)
            r3.setTextColor(r4)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.r(android.widget.TextView, int):void");
    }

    public final void s() {
        if (this.f1212p != null) {
            EditText editText = this.f1194f;
            t(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setBoxBackgroundColor(@ColorInt int i5) {
        if (this.S != i5) {
            this.S = i5;
            this.f1229x0 = i5;
            this.f1233z0 = i5;
            this.A0 = i5;
            d();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i5) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i5));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1229x0 = defaultColor;
        this.S = defaultColor;
        this.f1231y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1233z0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.A0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        d();
    }

    public void setBoxBackgroundMode(int i5) {
        if (i5 == this.M) {
            return;
        }
        this.M = i5;
        if (this.f1194f != null) {
            m();
        }
    }

    public void setBoxCollapsedPaddingTop(int i5) {
        this.N = i5;
    }

    public void setBoxStrokeColor(@ColorInt int i5) {
        if (this.f1225v0 != i5) {
            this.f1225v0 = i5;
            F();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f1225v0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            F();
        } else {
            this.f1221t0 = colorStateList.getDefaultColor();
            this.B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1223u0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        }
        this.f1225v0 = defaultColor;
        F();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f1227w0 != colorStateList) {
            this.f1227w0 = colorStateList;
            F();
        }
    }

    public void setBoxStrokeWidth(int i5) {
        this.P = i5;
        F();
    }

    public void setBoxStrokeWidthFocused(int i5) {
        this.Q = i5;
        F();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i5) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i5));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i5) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i5));
    }

    public void setCounterEnabled(boolean z4) {
        if (this.f1208m != z4) {
            if (z4) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f1212p = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.W;
                if (typeface != null) {
                    this.f1212p.setTypeface(typeface);
                }
                this.f1212p.setMaxLines(1);
                this.f1206l.a(this.f1212p, 2);
                MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.f1212p.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                u();
                s();
            } else {
                this.f1206l.j(this.f1212p, 2);
                this.f1212p = null;
            }
            this.f1208m = z4;
        }
    }

    public void setCounterMaxLength(int i5) {
        if (this.f1210n != i5) {
            if (i5 <= 0) {
                i5 = -1;
            }
            this.f1210n = i5;
            if (this.f1208m) {
                s();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i5) {
        if (this.f1214q != i5) {
            this.f1214q = i5;
            u();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            u();
        }
    }

    public void setCounterTextAppearance(int i5) {
        if (this.f1216r != i5) {
            this.f1216r = i5;
            u();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f1232z != colorStateList) {
            this.f1232z = colorStateList;
            u();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f1217r0 = colorStateList;
        this.f1219s0 = colorStateList;
        if (this.f1194f != null) {
            A(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        o(this, z4);
        super.setEnabled(z4);
    }

    public void setEndIconActivated(boolean z4) {
        this.f1195f0.setActivated(z4);
    }

    public void setEndIconCheckable(boolean z4) {
        this.f1195f0.setCheckable(z4);
    }

    public void setEndIconContentDescription(@StringRes int i5) {
        setEndIconContentDescription(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f1195f0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@DrawableRes int i5) {
        setEndIconDrawable(i5 != 0 ? AppCompatResources.getDrawable(getContext(), i5) : null);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.f1195f0.setImageDrawable(drawable);
        if (drawable != null) {
            j.a(this, this.f1195f0, this.f1199h0, this.f1201i0);
            p();
        }
    }

    public void setEndIconMode(int i5) {
        int i6 = this.f1191d0;
        if (i6 == i5) {
            return;
        }
        this.f1191d0 = i5;
        Iterator<g> it = this.f1197g0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i6);
        }
        setEndIconVisible(i5 != 0);
        if (getEndIconDelegate().b(this.M)) {
            getEndIconDelegate().a();
            j.a(this, this.f1195f0, this.f1199h0, this.f1201i0);
        } else {
            StringBuilder g5 = androidx.activity.d.g("The current box background mode ");
            g5.append(this.M);
            g5.append(" is not supported by the end icon mode ");
            g5.append(i5);
            throw new IllegalStateException(g5.toString());
        }
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f1195f0;
        View.OnLongClickListener onLongClickListener = this.f1209m0;
        checkableImageButton.setOnClickListener(onClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f1209m0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f1195f0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f1199h0 != colorStateList) {
            this.f1199h0 = colorStateList;
            j.a(this, this.f1195f0, colorStateList, this.f1201i0);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f1201i0 != mode) {
            this.f1201i0 = mode;
            j.a(this, this.f1195f0, this.f1199h0, mode);
        }
    }

    public void setEndIconVisible(boolean z4) {
        if (k() != z4) {
            this.f1195f0.setVisibility(z4 ? 0 : 8);
            x();
            D();
            v();
        }
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f1206l.f2559k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f1206l.i();
            return;
        }
        e2.k kVar = this.f1206l;
        kVar.c();
        kVar.f2558j = charSequence;
        kVar.f2560l.setText(charSequence);
        int i5 = kVar.f2556h;
        if (i5 != 1) {
            kVar.f2557i = 1;
        }
        kVar.l(i5, kVar.f2557i, kVar.k(kVar.f2560l, charSequence));
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        e2.k kVar = this.f1206l;
        kVar.f2561m = charSequence;
        AppCompatTextView appCompatTextView = kVar.f2560l;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z4) {
        e2.k kVar = this.f1206l;
        if (kVar.f2559k == z4) {
            return;
        }
        kVar.c();
        if (z4) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(kVar.f2549a);
            kVar.f2560l = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            kVar.f2560l.setTextAlignment(5);
            Typeface typeface = kVar.f2569u;
            if (typeface != null) {
                kVar.f2560l.setTypeface(typeface);
            }
            int i5 = kVar.f2562n;
            kVar.f2562n = i5;
            AppCompatTextView appCompatTextView2 = kVar.f2560l;
            if (appCompatTextView2 != null) {
                kVar.f2550b.r(appCompatTextView2, i5);
            }
            ColorStateList colorStateList = kVar.f2563o;
            kVar.f2563o = colorStateList;
            AppCompatTextView appCompatTextView3 = kVar.f2560l;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = kVar.f2561m;
            kVar.f2561m = charSequence;
            AppCompatTextView appCompatTextView4 = kVar.f2560l;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            kVar.f2560l.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(kVar.f2560l, 1);
            kVar.a(kVar.f2560l, 0);
        } else {
            kVar.i();
            kVar.j(kVar.f2560l, 0);
            kVar.f2560l = null;
            kVar.f2550b.w();
            kVar.f2550b.F();
        }
        kVar.f2559k = z4;
    }

    public void setErrorIconDrawable(@DrawableRes int i5) {
        setErrorIconDrawable(i5 != 0 ? AppCompatResources.getDrawable(getContext(), i5) : null);
        j.c(this, this.o0, this.f1213p0);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.o0.setImageDrawable(drawable);
        y();
        j.a(this, this.o0, this.f1213p0, this.f1215q0);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.o0;
        View.OnLongClickListener onLongClickListener = this.n0;
        checkableImageButton.setOnClickListener(onClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.n0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.o0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f1213p0 != colorStateList) {
            this.f1213p0 = colorStateList;
            j.a(this, this.o0, colorStateList, this.f1215q0);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f1215q0 != mode) {
            this.f1215q0 = mode;
            j.a(this, this.o0, this.f1213p0, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i5) {
        e2.k kVar = this.f1206l;
        kVar.f2562n = i5;
        AppCompatTextView appCompatTextView = kVar.f2560l;
        if (appCompatTextView != null) {
            kVar.f2550b.r(appCompatTextView, i5);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        e2.k kVar = this.f1206l;
        kVar.f2563o = colorStateList;
        AppCompatTextView appCompatTextView = kVar.f2560l;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z4) {
        if (this.E0 != z4) {
            this.E0 = z4;
            A(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f1206l.f2565q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f1206l.f2565q) {
            setHelperTextEnabled(true);
        }
        e2.k kVar = this.f1206l;
        kVar.c();
        kVar.f2564p = charSequence;
        kVar.f2566r.setText(charSequence);
        int i5 = kVar.f2556h;
        if (i5 != 2) {
            kVar.f2557i = 2;
        }
        kVar.l(i5, kVar.f2557i, kVar.k(kVar.f2566r, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        e2.k kVar = this.f1206l;
        kVar.f2568t = colorStateList;
        AppCompatTextView appCompatTextView = kVar.f2566r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z4) {
        e2.k kVar = this.f1206l;
        if (kVar.f2565q == z4) {
            return;
        }
        kVar.c();
        if (z4) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(kVar.f2549a);
            kVar.f2566r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            kVar.f2566r.setTextAlignment(5);
            Typeface typeface = kVar.f2569u;
            if (typeface != null) {
                kVar.f2566r.setTypeface(typeface);
            }
            kVar.f2566r.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(kVar.f2566r, 1);
            int i5 = kVar.f2567s;
            kVar.f2567s = i5;
            AppCompatTextView appCompatTextView2 = kVar.f2566r;
            if (appCompatTextView2 != null) {
                TextViewCompat.setTextAppearance(appCompatTextView2, i5);
            }
            ColorStateList colorStateList = kVar.f2568t;
            kVar.f2568t = colorStateList;
            AppCompatTextView appCompatTextView3 = kVar.f2566r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            kVar.a(kVar.f2566r, 1);
            kVar.f2566r.setAccessibilityDelegate(new l(kVar));
        } else {
            kVar.c();
            int i6 = kVar.f2556h;
            if (i6 == 2) {
                kVar.f2557i = 0;
            }
            kVar.l(i6, kVar.f2557i, kVar.k(kVar.f2566r, ""));
            kVar.j(kVar.f2566r, 1);
            kVar.f2566r = null;
            kVar.f2550b.w();
            kVar.f2550b.F();
        }
        kVar.f2565q = z4;
    }

    public void setHelperTextTextAppearance(@StyleRes int i5) {
        e2.k kVar = this.f1206l;
        kVar.f2567s = i5;
        AppCompatTextView appCompatTextView = kVar.f2566r;
        if (appCompatTextView != null) {
            TextViewCompat.setTextAppearance(appCompatTextView, i5);
        }
    }

    public void setHint(@StringRes int i5) {
        setHint(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z4) {
        this.F0 = z4;
    }

    public void setHintEnabled(boolean z4) {
        if (z4 != this.D) {
            this.D = z4;
            if (z4) {
                CharSequence hint = this.f1194f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.f1194f.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.f1194f.getHint())) {
                    this.f1194f.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.f1194f != null) {
                z();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i5) {
        v1.d dVar = this.D0;
        y1.d dVar2 = new y1.d(dVar.f5565a.getContext(), i5);
        ColorStateList colorStateList = dVar2.f6060j;
        if (colorStateList != null) {
            dVar.f5576l = colorStateList;
        }
        float f5 = dVar2.f6061k;
        if (f5 != 0.0f) {
            dVar.f5574j = f5;
        }
        ColorStateList colorStateList2 = dVar2.f6051a;
        if (colorStateList2 != null) {
            dVar.S = colorStateList2;
        }
        dVar.Q = dVar2.f6055e;
        dVar.R = dVar2.f6056f;
        dVar.P = dVar2.f6057g;
        dVar.T = dVar2.f6059i;
        y1.a aVar = dVar.f5590z;
        if (aVar != null) {
            aVar.f6050c = true;
        }
        v1.c cVar = new v1.c(dVar);
        dVar2.a();
        dVar.f5590z = new y1.a(cVar, dVar2.f6064n);
        dVar2.c(dVar.f5565a.getContext(), dVar.f5590z);
        dVar.k(false);
        this.f1219s0 = this.D0.f5576l;
        if (this.f1194f != null) {
            A(false, false);
            z();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f1219s0 != colorStateList) {
            if (this.f1217r0 == null) {
                this.D0.l(colorStateList);
            }
            this.f1219s0 = colorStateList;
            if (this.f1194f != null) {
                A(false, false);
            }
        }
    }

    public void setMaxEms(int i5) {
        this.f1200i = i5;
        EditText editText = this.f1194f;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMaxEms(i5);
    }

    public void setMaxWidth(@Px int i5) {
        this.f1204k = i5;
        EditText editText = this.f1194f;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMaxWidth(i5);
    }

    public void setMaxWidthResource(@DimenRes int i5) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i5));
    }

    public void setMinEms(int i5) {
        this.f1198h = i5;
        EditText editText = this.f1194f;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMinEms(i5);
    }

    public void setMinWidth(@Px int i5) {
        this.f1202j = i5;
        EditText editText = this.f1194f;
        if (editText == null || i5 == -1) {
            return;
        }
        editText.setMinWidth(i5);
    }

    public void setMinWidthResource(@DimenRes int i5) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i5));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i5) {
        setPasswordVisibilityToggleContentDescription(i5 != 0 ? getResources().getText(i5) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f1195f0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i5) {
        setPasswordVisibilityToggleDrawable(i5 != 0 ? AppCompatResources.getDrawable(getContext(), i5) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f1195f0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z4) {
        if (z4 && this.f1191d0 != 1) {
            setEndIconMode(1);
        } else {
            if (z4) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.f1199h0 = colorStateList;
        j.a(this, this.f1195f0, colorStateList, this.f1201i0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.f1201i0 = mode;
        j.a(this, this.f1195f0, this.f1199h0, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f1222u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f1222u = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.f1222u, 2);
            Fade fade = new Fade();
            fade.setDuration(87L);
            LinearInterpolator linearInterpolator = f1.a.f2767a;
            fade.setInterpolator(linearInterpolator);
            this.f1228x = fade;
            fade.setStartDelay(67L);
            Fade fade2 = new Fade();
            fade2.setDuration(87L);
            fade2.setInterpolator(linearInterpolator);
            this.f1230y = fade2;
            setPlaceholderTextAppearance(this.f1226w);
            setPlaceholderTextColor(this.f1224v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1220t) {
                setPlaceholderTextEnabled(true);
            }
            this.f1218s = charSequence;
        }
        EditText editText = this.f1194f;
        B(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(@StyleRes int i5) {
        this.f1226w = i5;
        AppCompatTextView appCompatTextView = this.f1222u;
        if (appCompatTextView != null) {
            TextViewCompat.setTextAppearance(appCompatTextView, i5);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f1224v != colorStateList) {
            this.f1224v = colorStateList;
            AppCompatTextView appCompatTextView = this.f1222u;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        o oVar = this.f1188c;
        Objects.requireNonNull(oVar);
        oVar.f2583d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        oVar.f2582c.setText(charSequence);
        oVar.g();
    }

    public void setPrefixTextAppearance(@StyleRes int i5) {
        TextViewCompat.setTextAppearance(this.f1188c.f2582c, i5);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f1188c.f2582c.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z4) {
        this.f1188c.f2584e.setCheckable(z4);
    }

    public void setStartIconContentDescription(@StringRes int i5) {
        setStartIconContentDescription(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.f1188c.a(charSequence);
    }

    public void setStartIconDrawable(@DrawableRes int i5) {
        setStartIconDrawable(i5 != 0 ? AppCompatResources.getDrawable(getContext(), i5) : null);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f1188c.b(drawable);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f1188c.c(onClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f1188c.d(onLongClickListener);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        o oVar = this.f1188c;
        if (oVar.f2585f != colorStateList) {
            oVar.f2585f = colorStateList;
            j.a(oVar.f2581b, oVar.f2584e, colorStateList, oVar.f2586g);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        o oVar = this.f1188c;
        if (oVar.f2586g != mode) {
            oVar.f2586g = mode;
            j.a(oVar.f2581b, oVar.f2584e, oVar.f2585f, mode);
        }
    }

    public void setStartIconVisible(boolean z4) {
        this.f1188c.e(z4);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.B = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.C.setText(charSequence);
        E();
    }

    public void setSuffixTextAppearance(@StyleRes int i5) {
        TextViewCompat.setTextAppearance(this.C, i5);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable e eVar) {
        EditText editText = this.f1194f;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, eVar);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.W) {
            this.W = typeface;
            this.D0.q(typeface);
            e2.k kVar = this.f1206l;
            if (typeface != kVar.f2569u) {
                kVar.f2569u = typeface;
                AppCompatTextView appCompatTextView = kVar.f2560l;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = kVar.f2566r;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f1212p;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t(int i5) {
        boolean z4 = this.f1211o;
        int i6 = this.f1210n;
        if (i6 == -1) {
            this.f1212p.setText(String.valueOf(i5));
            this.f1212p.setContentDescription(null);
            this.f1211o = false;
        } else {
            this.f1211o = i5 > i6;
            Context context = getContext();
            this.f1212p.setContentDescription(context.getString(this.f1211o ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i5), Integer.valueOf(this.f1210n)));
            if (z4 != this.f1211o) {
                u();
            }
            this.f1212p.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i5), Integer.valueOf(this.f1210n))));
        }
        if (this.f1194f == null || z4 == this.f1211o) {
            return;
        }
        A(false, false);
        F();
        w();
    }

    public final void u() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f1212p;
        if (appCompatTextView != null) {
            r(appCompatTextView, this.f1211o ? this.f1214q : this.f1216r);
            if (!this.f1211o && (colorStateList2 = this.f1232z) != null) {
                this.f1212p.setTextColor(colorStateList2);
            }
            if (!this.f1211o || (colorStateList = this.A) == null) {
                return;
            }
            this.f1212p.setTextColor(colorStateList);
        }
    }

    public final boolean v() {
        boolean z4;
        if (this.f1194f == null) {
            return false;
        }
        boolean z5 = true;
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f1188c.getMeasuredWidth() > 0) {
            int measuredWidth = this.f1188c.getMeasuredWidth() - this.f1194f.getPaddingLeft();
            if (this.f1185a0 == null || this.f1187b0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f1185a0 = colorDrawable;
                this.f1187b0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.f1194f);
            Drawable drawable = compoundDrawablesRelative[0];
            ColorDrawable colorDrawable2 = this.f1185a0;
            if (drawable != colorDrawable2) {
                TextViewCompat.setCompoundDrawablesRelative(this.f1194f, colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z4 = true;
            }
            z4 = false;
        } else {
            if (this.f1185a0 != null) {
                Drawable[] compoundDrawablesRelative2 = TextViewCompat.getCompoundDrawablesRelative(this.f1194f);
                TextViewCompat.setCompoundDrawablesRelative(this.f1194f, null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f1185a0 = null;
                z4 = true;
            }
            z4 = false;
        }
        if ((this.o0.getVisibility() == 0 || ((i() && k()) || this.B != null)) && this.f1190d.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.C.getMeasuredWidth() - this.f1194f.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = TextViewCompat.getCompoundDrawablesRelative(this.f1194f);
            ColorDrawable colorDrawable3 = this.f1203j0;
            if (colorDrawable3 == null || this.f1205k0 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f1203j0 = colorDrawable4;
                    this.f1205k0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = compoundDrawablesRelative3[2];
                ColorDrawable colorDrawable5 = this.f1203j0;
                if (drawable2 != colorDrawable5) {
                    this.f1207l0 = compoundDrawablesRelative3[2];
                    TextViewCompat.setCompoundDrawablesRelative(this.f1194f, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                } else {
                    z5 = z4;
                }
            } else {
                this.f1205k0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.setCompoundDrawablesRelative(this.f1194f, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1203j0, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.f1203j0 == null) {
                return z4;
            }
            Drawable[] compoundDrawablesRelative4 = TextViewCompat.getCompoundDrawablesRelative(this.f1194f);
            if (compoundDrawablesRelative4[2] == this.f1203j0) {
                TextViewCompat.setCompoundDrawablesRelative(this.f1194f, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f1207l0, compoundDrawablesRelative4[3]);
            } else {
                z5 = z4;
            }
            this.f1203j0 = null;
        }
        return z5;
    }

    public final void w() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        int currentTextColor;
        EditText editText = this.f1194f;
        if (editText == null || this.M != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (this.f1206l.e()) {
            currentTextColor = this.f1206l.g();
        } else {
            if (!this.f1211o || (appCompatTextView = this.f1212p) == null) {
                DrawableCompat.clearColorFilter(background);
                this.f1194f.refreshDrawableState();
                return;
            }
            currentTextColor = appCompatTextView.getCurrentTextColor();
        }
        background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final void x() {
        this.f1192e.setVisibility((this.f1195f0.getVisibility() != 0 || l()) ? 8 : 0);
        this.f1190d.setVisibility(k() || l() || ((this.B == null || this.C0) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getErrorIconDrawable()
            r1 = 0
            if (r0 == 0) goto L15
            e2.k r0 = r3.f1206l
            boolean r2 = r0.f2559k
            if (r2 == 0) goto L15
            boolean r0 = r0.e()
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            com.google.android.material.internal.CheckableImageButton r2 = r3.o0
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 8
        L1d:
            r2.setVisibility(r1)
            r3.x()
            r3.D()
            boolean r0 = r3.i()
            if (r0 != 0) goto L2f
            r3.v()
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.y():void");
    }

    public final void z() {
        if (this.M != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1186b.getLayoutParams();
            int e5 = e();
            if (e5 != layoutParams.topMargin) {
                layoutParams.topMargin = e5;
                this.f1186b.requestLayout();
            }
        }
    }
}
