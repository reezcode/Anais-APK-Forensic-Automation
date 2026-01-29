package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.PathParser;
import androidx.core.util.Preconditions;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import b2.k;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes24.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public k f1071a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1072b;

    /* renamed from: d, reason: collision with root package name */
    public float f1074d;

    /* renamed from: e, reason: collision with root package name */
    public float f1075e;

    /* renamed from: f, reason: collision with root package name */
    public float f1076f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final v1.i f1077g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public Animator f1078h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public f1.h f1079i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public f1.h f1080j;

    /* renamed from: k, reason: collision with root package name */
    public float f1081k;

    /* renamed from: m, reason: collision with root package name */
    public int f1083m;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f1085o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f1086p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<f> f1087q;

    /* renamed from: r, reason: collision with root package name */
    public final FloatingActionButton f1088r;

    /* renamed from: s, reason: collision with root package name */
    public final a2.b f1089s;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public u1.b f1094x;

    /* renamed from: y, reason: collision with root package name */
    public static final FastOutLinearInInterpolator f1069y = f1.a.f2769c;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f1070z = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] A = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] B = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] C = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] D = {R.attr.state_enabled};
    public static final int[] E = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public boolean f1073c = true;

    /* renamed from: l, reason: collision with root package name */
    public float f1082l = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public int f1084n = 0;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f1090t = new Rect();

    /* renamed from: u, reason: collision with root package name */
    public final RectF f1091u = new RectF();

    /* renamed from: v, reason: collision with root package name */
    public final RectF f1092v = new RectF();

    /* renamed from: w, reason: collision with root package name */
    public final Matrix f1093w = new Matrix();

    /* loaded from: classes11.dex */
    public class a extends f1.g {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f5, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            d.this.f1082l = f5;
            matrix.getValues(this.f2776a);
            matrix2.getValues(this.f2777b);
            for (int i5 = 0; i5 < 9; i5++) {
                float[] fArr = this.f2777b;
                float f6 = fArr[i5];
                float[] fArr2 = this.f2776a;
                fArr[i5] = ((f6 - fArr2[i5]) * f5) + fArr2[i5];
            }
            this.f2778c.setValues(this.f2777b);
            return this.f2778c;
        }
    }

    /* loaded from: classes25.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f1096a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f1097b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f1098c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f1099d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f1100e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f1101f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f1102g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Matrix f1103h;

        public b(float f5, float f6, float f7, float f8, float f9, float f10, float f11, Matrix matrix) {
            this.f1096a = f5;
            this.f1097b = f6;
            this.f1098c = f7;
            this.f1099d = f8;
            this.f1100e = f9;
            this.f1101f = f10;
            this.f1102g = f11;
            this.f1103h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f1088r.setAlpha(f1.a.a(this.f1096a, this.f1097b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = d.this.f1088r;
            float f5 = this.f1098c;
            floatingActionButton.setScaleX(((this.f1099d - f5) * floatValue) + f5);
            FloatingActionButton floatingActionButton2 = d.this.f1088r;
            float f6 = this.f1100e;
            floatingActionButton2.setScaleY(((this.f1099d - f6) * floatValue) + f6);
            d dVar = d.this;
            float f7 = this.f1101f;
            float f8 = this.f1102g;
            dVar.f1082l = androidx.appcompat.graphics.drawable.a.a(f8, f7, floatValue, f7);
            dVar.a(androidx.appcompat.graphics.drawable.a.a(f8, f7, floatValue, f7), this.f1103h);
            d.this.f1088r.setImageMatrix(this.f1103h);
        }
    }

    /* loaded from: classes13.dex */
    public class c extends i {
        public c(d dVar) {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C0018d extends i {
        public C0018d() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = d.this;
            return dVar.f1074d + dVar.f1075e;
        }
    }

    /* loaded from: classes10.dex */
    public class e extends i {
        public e() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = d.this;
            return dVar.f1074d + dVar.f1076f;
        }
    }

    /* loaded from: classes20.dex */
    public interface f {
        void a();

        void b();
    }

    /* loaded from: classes19.dex */
    public interface g {
    }

    /* loaded from: classes17.dex */
    public class h extends i {
        public h() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return d.this.f1074d;
        }
    }

    /* loaded from: classes16.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1108a;

        public i() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(d.this);
            this.f1108a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f1108a) {
                Objects.requireNonNull(d.this);
                a();
                this.f1108a = true;
            }
            d dVar = d.this;
            valueAnimator.getAnimatedFraction();
            Objects.requireNonNull(dVar);
        }
    }

    public d(FloatingActionButton floatingActionButton, a2.b bVar) {
        this.f1088r = floatingActionButton;
        this.f1089s = bVar;
        v1.i iVar = new v1.i();
        this.f1077g = iVar;
        iVar.a(f1070z, d(new e()));
        iVar.a(A, d(new C0018d()));
        iVar.a(B, d(new C0018d()));
        iVar.a(C, d(new C0018d()));
        iVar.a(D, d(new h()));
        iVar.a(E, d(new c(this)));
        this.f1081k = floatingActionButton.getRotation();
    }

    public final void a(float f5, @NonNull Matrix matrix) {
        matrix.reset();
        if (this.f1088r.getDrawable() == null || this.f1083m == 0) {
            return;
        }
        RectF rectF = this.f1091u;
        RectF rectF2 = this.f1092v;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i5 = this.f1083m;
        rectF2.set(0.0f, 0.0f, i5, i5);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i6 = this.f1083m;
        matrix.postScale(f5, f5, i6 / 2.0f, i6 / 2.0f);
    }

    @NonNull
    public final AnimatorSet b(@NonNull f1.h hVar, float f5, float f6, float f7) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f1088r, (Property<FloatingActionButton, Float>) View.ALPHA, f5);
        hVar.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f1088r, (Property<FloatingActionButton, Float>) View.SCALE_X, f6);
        hVar.c("scale").a(ofFloat2);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 == 26) {
            ofFloat2.setEvaluator(new u1.a());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f1088r, (Property<FloatingActionButton, Float>) View.SCALE_Y, f6);
        hVar.c("scale").a(ofFloat3);
        if (i5 == 26) {
            ofFloat3.setEvaluator(new u1.a());
        }
        arrayList.add(ofFloat3);
        a(f7, this.f1093w);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f1088r, new f1.f(), new a(), new Matrix(this.f1093w));
        hVar.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        f1.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f5, float f6, float f7) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this.f1088r.getAlpha(), f5, this.f1088r.getScaleX(), f6, this.f1088r.getScaleY(), this.f1082l, f7, new Matrix(this.f1093w)));
        arrayList.add(ofFloat);
        f1.b.a(animatorSet, arrayList);
        Context context = this.f1088r.getContext();
        int integer = this.f1088r.getContext().getResources().getInteger(comeliest.metempsychosis.pokelogan.R.integer.material_motion_duration_long_1);
        TypedValue a5 = y1.b.a(context, comeliest.metempsychosis.pokelogan.R.attr.motionDurationLong1);
        if (a5 != null && a5.type == 16) {
            integer = a5.data;
        }
        animatorSet.setDuration(integer);
        Context context2 = this.f1088r.getContext();
        TimeInterpolator timeInterpolator = f1.a.f2768b;
        TypedValue typedValue = new TypedValue();
        if (context2.getTheme().resolveAttribute(comeliest.metempsychosis.pokelogan.R.attr.motionEasingStandard, typedValue, true)) {
            if (typedValue.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be a string");
            }
            String valueOf = String.valueOf(typedValue.string);
            if (w1.a.b(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length != 4) {
                    StringBuilder g5 = androidx.activity.d.g("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                    g5.append(split.length);
                    throw new IllegalArgumentException(g5.toString());
                }
                timeInterpolator = PathInterpolatorCompat.create(w1.a.a(split, 0), w1.a.a(split, 1), w1.a.a(split, 2), w1.a.a(split, 3));
            } else {
                if (!w1.a.b(valueOf, "path")) {
                    throw new IllegalArgumentException(androidx.activity.d.f("Invalid motion easing type: ", valueOf));
                }
                timeInterpolator = PathInterpolatorCompat.create(PathParser.createPathFromPathData(valueOf.substring(5, valueOf.length() - 1)));
            }
        }
        animatorSet.setInterpolator(timeInterpolator);
        return animatorSet;
    }

    @NonNull
    public final ValueAnimator d(@NonNull i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1069y);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float e() {
        throw null;
    }

    public void f(@NonNull Rect rect) {
        int sizeDimension = this.f1072b ? (0 - this.f1088r.getSizeDimension()) / 2 : 0;
        int max = Math.max(sizeDimension, (int) Math.ceil(this.f1073c ? e() + this.f1076f : 0.0f));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(r0 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public final boolean g() {
        return this.f1088r.getVisibility() == 0 ? this.f1084n == 1 : this.f1084n != 2;
    }

    public final boolean h() {
        return this.f1088r.getVisibility() != 0 ? this.f1084n == 2 : this.f1084n != 1;
    }

    public void i() {
        throw null;
    }

    public void j() {
        throw null;
    }

    public void k(int[] iArr) {
        throw null;
    }

    public void l(float f5, float f6, float f7) {
        throw null;
    }

    public final void m() {
        ArrayList<f> arrayList = this.f1087q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public final void n() {
        ArrayList<f> arrayList = this.f1087q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void o(float f5) {
        this.f1082l = f5;
        Matrix matrix = this.f1093w;
        a(f5, matrix);
        this.f1088r.setImageMatrix(matrix);
    }

    public void p() {
        throw null;
    }

    public boolean q() {
        throw null;
    }

    public void r() {
        throw null;
    }

    public final void s() {
        Rect rect = this.f1090t;
        f(rect);
        Preconditions.checkNotNull(null, "Didn't initialize content background");
        if (q()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.f1089s;
            Objects.requireNonNull(bVar);
            super/*android.view.View*/.setBackgroundDrawable(insetDrawable);
        } else {
            Objects.requireNonNull(this.f1089s);
        }
        a2.b bVar2 = this.f1089s;
        int i5 = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}
