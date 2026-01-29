package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import b2.g;
import b2.l;
import f1.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import v1.k;
import y1.d;

/* loaded from: classes13.dex */
public final class a extends g implements Drawable.Callback, k.b {
    public static final int[] I0 = {R.attr.state_enabled};
    public static final ShapeDrawable J0 = new ShapeDrawable(new OvalShape());

    @Nullable
    public ColorStateList A;
    public int[] A0;
    public float B;
    public boolean B0;
    public float C;

    @Nullable
    public ColorStateList C0;

    @Nullable
    public ColorStateList D;

    @NonNull
    public WeakReference<InterfaceC0016a> D0;
    public float E;
    public TextUtils.TruncateAt E0;

    @Nullable
    public ColorStateList F;
    public boolean F0;

    @Nullable
    public CharSequence G;
    public int G0;
    public boolean H;
    public boolean H0;

    @Nullable
    public Drawable I;

    @Nullable
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;

    @Nullable
    public Drawable N;

    @Nullable
    public RippleDrawable O;

    @Nullable
    public ColorStateList P;
    public float Q;

    @Nullable
    public CharSequence R;
    public boolean S;
    public boolean T;

    @Nullable
    public Drawable U;

    @Nullable
    public ColorStateList V;

    @Nullable
    public h W;

    @Nullable
    public h X;
    public float Y;
    public float Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f889a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f890b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f891c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f892d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f893e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f894f0;

    /* renamed from: g0, reason: collision with root package name */
    @NonNull
    public final Context f895g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Paint f896h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Paint.FontMetrics f897i0;

    /* renamed from: j0, reason: collision with root package name */
    public final RectF f898j0;

    /* renamed from: k0, reason: collision with root package name */
    public final PointF f899k0;

    /* renamed from: l0, reason: collision with root package name */
    public final Path f900l0;

    /* renamed from: m0, reason: collision with root package name */
    @NonNull
    public final k f901m0;

    @ColorInt
    public int n0;

    @ColorInt
    public int o0;

    /* renamed from: p0, reason: collision with root package name */
    @ColorInt
    public int f902p0;

    /* renamed from: q0, reason: collision with root package name */
    @ColorInt
    public int f903q0;

    /* renamed from: r0, reason: collision with root package name */
    @ColorInt
    public int f904r0;

    /* renamed from: s0, reason: collision with root package name */
    @ColorInt
    public int f905s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f906t0;

    /* renamed from: u0, reason: collision with root package name */
    @ColorInt
    public int f907u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f908v0;

    /* renamed from: w0, reason: collision with root package name */
    @Nullable
    public ColorFilter f909w0;

    /* renamed from: x0, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f910x0;

    /* renamed from: y0, reason: collision with root package name */
    @Nullable
    public ColorStateList f911y0;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public ColorStateList f912z;

    /* renamed from: z0, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f913z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    /* loaded from: classes21.dex */
    public interface InterfaceC0016a {
        void a();
    }

    public a(@NonNull Context context, AttributeSet attributeSet) {
        super(new b2.k(b2.k.b(context, attributeSet, comeliest.metempsychosis.pokelogan.R.attr.chipStyle, 2131755975)));
        this.C = -1.0f;
        this.f896h0 = new Paint(1);
        this.f897i0 = new Paint.FontMetrics();
        this.f898j0 = new RectF();
        this.f899k0 = new PointF();
        this.f900l0 = new Path();
        this.f908v0 = 255;
        this.f913z0 = PorterDuff.Mode.SRC_IN;
        this.D0 = new WeakReference<>(null);
        m(context);
        this.f895g0 = context;
        k kVar = new k(this);
        this.f901m0 = kVar;
        this.G = "";
        kVar.f5626a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = I0;
        setState(iArr);
        d0(iArr);
        this.F0 = true;
        int[] iArr2 = z1.b.f6114a;
        J0.setTint(-1);
    }

    public static boolean G(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean H(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (q0()) {
            float f5 = this.f894f0 + this.f893e0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f6 = rect.right - f5;
                rectF.right = f6;
                rectF.left = f6 - this.Q;
            } else {
                float f7 = rect.left + f5;
                rectF.left = f7;
                rectF.right = f7 + this.Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f8 = this.Q;
            float f9 = exactCenterY - (f8 / 2.0f);
            rectF.top = f9;
            rectF.bottom = f9 + f8;
        }
    }

    public final void B(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (q0()) {
            float f5 = this.f894f0 + this.f893e0 + this.Q + this.f892d0 + this.f891c0;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f6 = rect.right;
                rectF.right = f6;
                rectF.left = f6 - f5;
            } else {
                int i5 = rect.left;
                rectF.left = i5;
                rectF.right = i5 + f5;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public final float C() {
        if (q0()) {
            return this.f892d0 + this.Q + this.f893e0;
        }
        return 0.0f;
    }

    public final float D() {
        return this.H0 ? k() : this.C;
    }

    @Nullable
    public final Drawable E() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public final float F() {
        Drawable drawable = this.f906t0 ? this.U : this.I;
        float f5 = this.K;
        return (f5 > 0.0f || drawable == null) ? f5 : drawable.getIntrinsicWidth();
    }

    public final void I() {
        InterfaceC0016a interfaceC0016a = this.D0.get();
        if (interfaceC0016a != null) {
            interfaceC0016a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(@androidx.annotation.NonNull int[] r9, @androidx.annotation.NonNull int[] r10) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.J(int[], int[]):boolean");
    }

    public final void K(boolean z4) {
        if (this.S != z4) {
            this.S = z4;
            float z5 = z();
            if (!z4 && this.f906t0) {
                this.f906t0 = false;
            }
            float z6 = z();
            invalidateSelf();
            if (z5 != z6) {
                I();
            }
        }
    }

    public final void L(@Nullable Drawable drawable) {
        if (this.U != drawable) {
            float z4 = z();
            this.U = drawable;
            float z5 = z();
            r0(this.U);
            x(this.U);
            invalidateSelf();
            if (z4 != z5) {
                I();
            }
        }
    }

    public final void M(@Nullable ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (this.T && this.U != null && this.S) {
                DrawableCompat.setTintList(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z4) {
        if (this.T != z4) {
            boolean o0 = o0();
            this.T = z4;
            boolean o02 = o0();
            if (o0 != o02) {
                if (o02) {
                    x(this.U);
                } else {
                    r0(this.U);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public final void O(@Nullable ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public final void P(float f5) {
        if (this.C != f5) {
            this.C = f5;
            setShapeAppearanceModel(this.f324b.f347a.e(f5));
        }
    }

    public final void Q(float f5) {
        if (this.f894f0 != f5) {
            this.f894f0 = f5;
            invalidateSelf();
            I();
        }
    }

    public final void R(@Nullable Drawable drawable) {
        Drawable drawable2 = this.I;
        Drawable unwrap = drawable2 != null ? DrawableCompat.unwrap(drawable2) : null;
        if (unwrap != drawable) {
            float z4 = z();
            this.I = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            float z5 = z();
            r0(unwrap);
            if (p0()) {
                x(this.I);
            }
            invalidateSelf();
            if (z4 != z5) {
                I();
            }
        }
    }

    public final void S(float f5) {
        if (this.K != f5) {
            float z4 = z();
            this.K = f5;
            float z5 = z();
            invalidateSelf();
            if (z4 != z5) {
                I();
            }
        }
    }

    public final void T(@Nullable ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (p0()) {
                DrawableCompat.setTintList(this.I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void U(boolean z4) {
        if (this.H != z4) {
            boolean p02 = p0();
            this.H = z4;
            boolean p03 = p0();
            if (p02 != p03) {
                if (p03) {
                    x(this.I);
                } else {
                    r0(this.I);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public final void V(float f5) {
        if (this.B != f5) {
            this.B = f5;
            invalidateSelf();
            I();
        }
    }

    public final void W(float f5) {
        if (this.Y != f5) {
            this.Y = f5;
            invalidateSelf();
            I();
        }
    }

    public final void X(@Nullable ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.H0) {
                s(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(float f5) {
        if (this.E != f5) {
            this.E = f5;
            this.f896h0.setStrokeWidth(f5);
            if (this.H0) {
                t(f5);
            }
            invalidateSelf();
        }
    }

    public final void Z(@Nullable Drawable drawable) {
        Drawable E = E();
        if (E != drawable) {
            float C = C();
            this.N = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            int[] iArr = z1.b.f6114a;
            this.O = new RippleDrawable(z1.b.a(this.F), this.N, J0);
            float C2 = C();
            r0(E);
            if (q0()) {
                x(this.N);
            }
            invalidateSelf();
            if (C != C2) {
                I();
            }
        }
    }

    @Override // v1.k.b
    public final void a() {
        I();
        invalidateSelf();
    }

    public final void a0(float f5) {
        if (this.f893e0 != f5) {
            this.f893e0 = f5;
            invalidateSelf();
            if (q0()) {
                I();
            }
        }
    }

    public final void b0(float f5) {
        if (this.Q != f5) {
            this.Q = f5;
            invalidateSelf();
            if (q0()) {
                I();
            }
        }
    }

    public final void c0(float f5) {
        if (this.f892d0 != f5) {
            this.f892d0 = f5;
            invalidateSelf();
            if (q0()) {
                I();
            }
        }
    }

    public final boolean d0(@NonNull int[] iArr) {
        if (Arrays.equals(this.A0, iArr)) {
            return false;
        }
        this.A0 = iArr;
        if (q0()) {
            return J(getState(), iArr);
        }
        return false;
    }

    @Override // b2.g, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i5 = this.f908v0) == 0) {
            return;
        }
        if (i5 < 255) {
            float f6 = bounds.left;
            float f7 = bounds.top;
            float f8 = bounds.right;
            float f9 = bounds.bottom;
            i6 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f6, f7, f8, f9, i5) : canvas.saveLayerAlpha(f6, f7, f8, f9, i5, 31);
        } else {
            i6 = 0;
        }
        if (!this.H0) {
            this.f896h0.setColor(this.n0);
            this.f896h0.setStyle(Paint.Style.FILL);
            this.f898j0.set(bounds);
            canvas.drawRoundRect(this.f898j0, D(), D(), this.f896h0);
        }
        if (!this.H0) {
            this.f896h0.setColor(this.o0);
            this.f896h0.setStyle(Paint.Style.FILL);
            Paint paint = this.f896h0;
            ColorFilter colorFilter = this.f909w0;
            if (colorFilter == null) {
                colorFilter = this.f910x0;
            }
            paint.setColorFilter(colorFilter);
            this.f898j0.set(bounds);
            canvas.drawRoundRect(this.f898j0, D(), D(), this.f896h0);
        }
        if (this.H0) {
            super.draw(canvas);
        }
        if (this.E > 0.0f && !this.H0) {
            this.f896h0.setColor(this.f903q0);
            this.f896h0.setStyle(Paint.Style.STROKE);
            if (!this.H0) {
                Paint paint2 = this.f896h0;
                ColorFilter colorFilter2 = this.f909w0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f910x0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.f898j0;
            float f10 = bounds.left;
            float f11 = this.E / 2.0f;
            rectF.set(f10 + f11, bounds.top + f11, bounds.right - f11, bounds.bottom - f11);
            float f12 = this.C - (this.E / 2.0f);
            canvas.drawRoundRect(this.f898j0, f12, f12, this.f896h0);
        }
        this.f896h0.setColor(this.f904r0);
        this.f896h0.setStyle(Paint.Style.FILL);
        this.f898j0.set(bounds);
        if (this.H0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.f900l0;
            l lVar = this.f341s;
            g.b bVar = this.f324b;
            lVar.a(bVar.f347a, bVar.f356j, rectF2, this.f340r, path);
            i7 = 0;
            f(canvas, this.f896h0, this.f900l0, this.f324b.f347a, h());
        } else {
            canvas.drawRoundRect(this.f898j0, D(), D(), this.f896h0);
            i7 = 0;
        }
        if (p0()) {
            y(bounds, this.f898j0);
            RectF rectF3 = this.f898j0;
            float f13 = rectF3.left;
            float f14 = rectF3.top;
            canvas.translate(f13, f14);
            this.I.setBounds(i7, i7, (int) this.f898j0.width(), (int) this.f898j0.height());
            this.I.draw(canvas);
            canvas.translate(-f13, -f14);
        }
        if (o0()) {
            y(bounds, this.f898j0);
            RectF rectF4 = this.f898j0;
            float f15 = rectF4.left;
            float f16 = rectF4.top;
            canvas.translate(f15, f16);
            this.U.setBounds(i7, i7, (int) this.f898j0.width(), (int) this.f898j0.height());
            this.U.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (!this.F0 || this.G == null) {
            i8 = i6;
            i9 = 255;
            i10 = 0;
        } else {
            PointF pointF = this.f899k0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.G != null) {
                float z4 = z() + this.Y + this.f890b0;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    pointF.x = bounds.left + z4;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - z4;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                this.f901m0.f5626a.getFontMetrics(this.f897i0);
                Paint.FontMetrics fontMetrics = this.f897i0;
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF5 = this.f898j0;
            rectF5.setEmpty();
            if (this.G != null) {
                float z5 = z() + this.Y + this.f890b0;
                float C = C() + this.f894f0 + this.f891c0;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    rectF5.left = bounds.left + z5;
                    f5 = bounds.right - C;
                } else {
                    rectF5.left = bounds.left + C;
                    f5 = bounds.right - z5;
                }
                rectF5.right = f5;
                rectF5.top = bounds.top;
                rectF5.bottom = bounds.bottom;
            }
            k kVar = this.f901m0;
            if (kVar.f5631f != null) {
                kVar.f5626a.drawableState = getState();
                k kVar2 = this.f901m0;
                kVar2.f5631f.d(this.f895g0, kVar2.f5626a, kVar2.f5627b);
            }
            this.f901m0.f5626a.setTextAlign(align);
            boolean z6 = Math.round(this.f901m0.a(this.G.toString())) > Math.round(this.f898j0.width());
            if (z6) {
                i11 = canvas.save();
                canvas.clipRect(this.f898j0);
            } else {
                i11 = 0;
            }
            CharSequence charSequence = this.G;
            if (z6 && this.E0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f901m0.f5626a, this.f898j0.width(), this.E0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF2 = this.f899k0;
            i10 = 0;
            i9 = 255;
            i8 = i6;
            canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.f901m0.f5626a);
            if (z6) {
                canvas.restoreToCount(i11);
            }
        }
        if (q0()) {
            A(bounds, this.f898j0);
            RectF rectF6 = this.f898j0;
            float f17 = rectF6.left;
            float f18 = rectF6.top;
            canvas.translate(f17, f18);
            this.N.setBounds(i10, i10, (int) this.f898j0.width(), (int) this.f898j0.height());
            int[] iArr = z1.b.f6114a;
            this.O.setBounds(this.N.getBounds());
            this.O.jumpToCurrentState();
            this.O.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (this.f908v0 < i9) {
            canvas.restoreToCount(i8);
        }
    }

    public final void e0(@Nullable ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (q0()) {
                DrawableCompat.setTintList(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void f0(boolean z4) {
        if (this.M != z4) {
            boolean q02 = q0();
            this.M = z4;
            boolean q03 = q0();
            if (q02 != q03) {
                if (q03) {
                    x(this.N);
                } else {
                    r0(this.N);
                }
                invalidateSelf();
                I();
            }
        }
    }

    public final void g0(float f5) {
        if (this.f889a0 != f5) {
            float z4 = z();
            this.f889a0 = f5;
            float z5 = z();
            invalidateSelf();
            if (z4 != z5) {
                I();
            }
        }
    }

    @Override // b2.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f908v0;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final ColorFilter getColorFilter() {
        return this.f909w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(C() + this.f901m0.a(this.G.toString()) + z() + this.Y + this.f890b0 + this.f891c0 + this.f894f0), this.G0);
    }

    @Override // b2.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // b2.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        if (this.H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.B, this.C);
        } else {
            outline.setRoundRect(bounds, this.C);
        }
        outline.setAlpha(this.f908v0 / 255.0f);
    }

    public final void h0(float f5) {
        if (this.Z != f5) {
            float z4 = z();
            this.Z = f5;
            float z5 = z();
            invalidateSelf();
            if (z4 != z5) {
                I();
            }
        }
    }

    public final void i0(@Nullable ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            this.C0 = this.B0 ? z1.b.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // b2.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!G(this.f912z) && !G(this.A) && !G(this.D) && (!this.B0 || !G(this.C0))) {
            d dVar = this.f901m0.f5631f;
            if (!((dVar == null || (colorStateList = dVar.f6060j) == null || !colorStateList.isStateful()) ? false : true)) {
                if (!(this.T && this.U != null && this.S) && !H(this.I) && !H(this.U) && !G(this.f911y0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void j0(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.G, charSequence)) {
            return;
        }
        this.G = charSequence;
        this.f901m0.f5629d = true;
        invalidateSelf();
        I();
    }

    public final void k0(@Nullable d dVar) {
        k kVar = this.f901m0;
        Context context = this.f895g0;
        if (kVar.f5631f != dVar) {
            kVar.f5631f = dVar;
            if (dVar != null) {
                dVar.e(context, kVar.f5626a, kVar.f5627b);
                k.b bVar = kVar.f5630e.get();
                if (bVar != null) {
                    kVar.f5626a.drawableState = bVar.getState();
                }
                dVar.d(context, kVar.f5626a, kVar.f5627b);
                kVar.f5629d = true;
            }
            k.b bVar2 = kVar.f5630e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public final void l0(float f5) {
        if (this.f891c0 != f5) {
            this.f891c0 = f5;
            invalidateSelf();
            I();
        }
    }

    public final void m0(float f5) {
        if (this.f890b0 != f5) {
            this.f890b0 = f5;
            invalidateSelf();
            I();
        }
    }

    public final void n0() {
        if (this.B0) {
            this.B0 = false;
            this.C0 = null;
            onStateChange(getState());
        }
    }

    public final boolean o0() {
        return this.T && this.U != null && this.f906t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i5) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i5);
        if (p0()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.I, i5);
        }
        if (o0()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.U, i5);
        }
        if (q0()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.N, i5);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i5) {
        boolean onLevelChange = super.onLevelChange(i5);
        if (p0()) {
            onLevelChange |= this.I.setLevel(i5);
        }
        if (o0()) {
            onLevelChange |= this.U.setLevel(i5);
        }
        if (q0()) {
            onLevelChange |= this.N.setLevel(i5);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // b2.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(@NonNull int[] iArr) {
        if (this.H0) {
            super.onStateChange(iArr);
        }
        return J(iArr, this.A0);
    }

    public final boolean p0() {
        return this.H && this.I != null;
    }

    public final boolean q0() {
        return this.M && this.N != null;
    }

    public final void r0(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j5) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j5);
        }
    }

    @Override // b2.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        if (this.f908v0 != i5) {
            this.f908v0 = i5;
            invalidateSelf();
        }
    }

    @Override // b2.g, android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.f909w0 != colorFilter) {
            this.f909w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // b2.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.f911y0 != colorStateList) {
            this.f911y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // b2.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f913z0 != mode) {
            this.f913z0 = mode;
            this.f910x0 = r1.a.a(this, this.f911y0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        if (p0()) {
            visible |= this.I.setVisible(z4, z5);
        }
        if (o0()) {
            visible |= this.U.setVisible(z4, z5);
        }
        if (q0()) {
            visible |= this.N.setVisible(z4, z5);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(this.A0);
            }
            DrawableCompat.setTintList(drawable, this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            DrawableCompat.setTintList(drawable2, this.J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void y(@NonNull Rect rect, @NonNull RectF rectF) {
        float f5;
        rectF.setEmpty();
        if (p0() || o0()) {
            float f6 = this.Y + this.Z;
            float F = F();
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f7 = rect.left + f6;
                rectF.left = f7;
                rectF.right = f7 + F;
            } else {
                float f8 = rect.right - f6;
                rectF.right = f8;
                rectF.left = f8 - F;
            }
            Drawable drawable = this.f906t0 ? this.U : this.I;
            float f9 = this.K;
            if (f9 <= 0.0f && drawable != null) {
                f9 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f895g0.getResources().getDisplayMetrics()));
                if (drawable.getIntrinsicHeight() <= f9) {
                    f5 = drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f5;
                }
            }
            f5 = f9;
            float exactCenterY2 = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f5;
        }
    }

    public final float z() {
        if (!p0() && !o0()) {
            return 0.0f;
        }
        return F() + this.Z + this.f889a0;
    }
}
