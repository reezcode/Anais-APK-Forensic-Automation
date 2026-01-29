package v1;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.tencent.smtt.sdk.TbsListener;
import v1.j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes11.dex */
public final class d {

    @Nullable
    public CharSequence A;

    @Nullable
    public CharSequence B;
    public boolean C;

    @Nullable
    public Bitmap D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public int[] J;
    public boolean K;

    @NonNull
    public final TextPaint L;

    @NonNull
    public final TextPaint M;
    public TimeInterpolator N;
    public TimeInterpolator O;
    public float P;
    public float Q;
    public float R;
    public ColorStateList S;
    public float T;
    public float U;
    public float V;
    public StaticLayout W;
    public float X;
    public CharSequence Y;

    /* renamed from: a, reason: collision with root package name */
    public final View f5565a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5566b;

    /* renamed from: c, reason: collision with root package name */
    public float f5567c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Rect f5568d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Rect f5569e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RectF f5570f;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f5575k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f5576l;

    /* renamed from: m, reason: collision with root package name */
    public float f5577m;

    /* renamed from: n, reason: collision with root package name */
    public float f5578n;

    /* renamed from: o, reason: collision with root package name */
    public float f5579o;

    /* renamed from: p, reason: collision with root package name */
    public float f5580p;

    /* renamed from: q, reason: collision with root package name */
    public float f5581q;

    /* renamed from: r, reason: collision with root package name */
    public float f5582r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f5583s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f5584t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f5585u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f5586v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f5587w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f5588x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f5589y;

    /* renamed from: z, reason: collision with root package name */
    public y1.a f5590z;

    /* renamed from: g, reason: collision with root package name */
    public int f5571g = 16;

    /* renamed from: h, reason: collision with root package name */
    public int f5572h = 16;

    /* renamed from: i, reason: collision with root package name */
    public float f5573i = 15.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f5574j = 15.0f;
    public int Z = j.f5610m;

    public d(View view) {
        this.f5565a = view;
        TextPaint textPaint = new TextPaint(TbsListener.ErrorCode.RENAME_NO_NEED_SENDREQUEST);
        this.L = textPaint;
        this.M = new TextPaint(textPaint);
        this.f5569e = new Rect();
        this.f5568d = new Rect();
        this.f5570f = new RectF();
        i(view.getContext().getResources().getConfiguration());
    }

    @ColorInt
    public static int a(@ColorInt int i5, @ColorInt int i6, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        float f6 = 1.0f - f5;
        return Color.argb(Math.round((Color.alpha(i6) * f5) + (Color.alpha(i5) * f6)), Math.round((Color.red(i6) * f5) + (Color.red(i5) * f6)), Math.round((Color.green(i6) * f5) + (Color.green(i5) * f6)), Math.round((Color.blue(i6) * f5) + (Color.blue(i5) * f6)));
    }

    public static float h(float f5, float f6, float f7, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f7 = timeInterpolator.getInterpolation(f7);
        }
        LinearInterpolator linearInterpolator = f1.a.f2767a;
        return androidx.appcompat.graphics.drawable.a.a(f6, f5, f7, f5);
    }

    public final boolean b(@NonNull CharSequence charSequence) {
        return (ViewCompat.getLayoutDirection(this.f5565a) == 1 ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    public final void c(float f5) {
        TextPaint textPaint;
        int f6;
        this.f5570f.left = h(this.f5568d.left, this.f5569e.left, f5, this.N);
        this.f5570f.top = h(this.f5577m, this.f5578n, f5, this.N);
        this.f5570f.right = h(this.f5568d.right, this.f5569e.right, f5, this.N);
        this.f5570f.bottom = h(this.f5568d.bottom, this.f5569e.bottom, f5, this.N);
        this.f5581q = h(this.f5579o, this.f5580p, f5, this.N);
        this.f5582r = h(this.f5577m, this.f5578n, f5, this.N);
        p(f5);
        FastOutSlowInInterpolator fastOutSlowInInterpolator = f1.a.f2768b;
        h(0.0f, 1.0f, 1.0f - f5, fastOutSlowInInterpolator);
        ViewCompat.postInvalidateOnAnimation(this.f5565a);
        h(1.0f, 0.0f, f5, fastOutSlowInInterpolator);
        ViewCompat.postInvalidateOnAnimation(this.f5565a);
        ColorStateList colorStateList = this.f5576l;
        ColorStateList colorStateList2 = this.f5575k;
        if (colorStateList != colorStateList2) {
            textPaint = this.L;
            f6 = a(g(colorStateList2), f(), f5);
        } else {
            textPaint = this.L;
            f6 = f();
        }
        textPaint.setColor(f6);
        float f7 = this.T;
        float f8 = this.U;
        if (f7 != f8) {
            this.L.setLetterSpacing(h(f8, f7, f5, fastOutSlowInInterpolator));
        } else {
            this.L.setLetterSpacing(f7);
        }
        this.G = h(0.0f, this.P, f5, null);
        this.H = h(0.0f, this.Q, f5, null);
        this.I = h(0.0f, this.R, f5, null);
        this.L.setShadowLayer(this.G, this.H, this.I, a(g(null), g(this.S), f5));
        ViewCompat.postInvalidateOnAnimation(this.f5565a);
    }

    public final void d(float f5, boolean z4) {
        boolean z5;
        float f6;
        float f7;
        StaticLayout staticLayout;
        if (this.A == null) {
            return;
        }
        float width = this.f5569e.width();
        float width2 = this.f5568d.width();
        if (Math.abs(f5 - 1.0f) < 1.0E-5f) {
            f6 = this.f5574j;
            f7 = this.T;
            this.E = 1.0f;
            Typeface typeface = this.f5589y;
            Typeface typeface2 = this.f5583s;
            if (typeface != typeface2) {
                this.f5589y = typeface2;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            float f8 = this.f5573i;
            float f9 = this.U;
            Typeface typeface3 = this.f5589y;
            Typeface typeface4 = this.f5586v;
            if (typeface3 != typeface4) {
                this.f5589y = typeface4;
                z5 = true;
            } else {
                z5 = false;
            }
            if (Math.abs(f5 - 0.0f) < 1.0E-5f) {
                this.E = 1.0f;
            } else {
                this.E = h(this.f5573i, this.f5574j, f5, this.O) / this.f5573i;
            }
            float f10 = this.f5574j / this.f5573i;
            width = (!z4 && width2 * f10 > width) ? Math.min(width / f10, width2) : width2;
            f6 = f8;
            f7 = f9;
        }
        if (width > 0.0f) {
            z5 = ((this.F > f6 ? 1 : (this.F == f6 ? 0 : -1)) != 0) || ((this.V > f7 ? 1 : (this.V == f7 ? 0 : -1)) != 0) || this.K || z5;
            this.F = f6;
            this.V = f7;
            this.K = false;
        }
        if (this.B == null || z5) {
            this.L.setTextSize(this.F);
            this.L.setTypeface(this.f5589y);
            this.L.setLetterSpacing(this.V);
            this.L.setLinearText(this.E != 1.0f);
            boolean b5 = b(this.A);
            this.C = b5;
            try {
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                j jVar = new j(this.A, this.L, (int) width);
                jVar.f5625l = TextUtils.TruncateAt.END;
                jVar.f5624k = b5;
                jVar.f5618e = alignment;
                jVar.f5623j = false;
                jVar.f5619f = 1;
                jVar.f5620g = 0.0f;
                jVar.f5621h = 1.0f;
                jVar.f5622i = this.Z;
                staticLayout = jVar.a();
            } catch (j.a e5) {
                Log.e("CollapsingTextHelper", e5.getCause().getMessage(), e5);
                staticLayout = null;
            }
            StaticLayout staticLayout2 = (StaticLayout) Preconditions.checkNotNull(staticLayout);
            this.W = staticLayout2;
            this.B = staticLayout2.getText();
        }
    }

    public final float e() {
        TextPaint textPaint = this.M;
        textPaint.setTextSize(this.f5574j);
        textPaint.setTypeface(this.f5583s);
        textPaint.setLetterSpacing(this.T);
        return -this.M.ascent();
    }

    @ColorInt
    public final int f() {
        return g(this.f5576l);
    }

    @ColorInt
    public final int g(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.J;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f5585u;
            if (typeface != null) {
                this.f5584t = y1.g.a(configuration, typeface);
            }
            Typeface typeface2 = this.f5588x;
            if (typeface2 != null) {
                this.f5587w = y1.g.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f5584t;
            if (typeface3 == null) {
                typeface3 = this.f5585u;
            }
            this.f5583s = typeface3;
            Typeface typeface4 = this.f5587w;
            if (typeface4 == null) {
                typeface4 = this.f5588x;
            }
            this.f5586v = typeface4;
            k(true);
        }
    }

    public final void j() {
        this.f5566b = this.f5569e.width() > 0 && this.f5569e.height() > 0 && this.f5568d.width() > 0 && this.f5568d.height() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(boolean r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.d.k(boolean):void");
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f5576l != colorStateList) {
            this.f5576l = colorStateList;
            k(false);
        }
    }

    public final void m(int i5) {
        if (this.f5572h != i5) {
            this.f5572h = i5;
            k(false);
        }
    }

    public final boolean n(Typeface typeface) {
        y1.a aVar = this.f5590z;
        if (aVar != null) {
            aVar.f6050c = true;
        }
        if (this.f5585u == typeface) {
            return false;
        }
        this.f5585u = typeface;
        Typeface a5 = y1.g.a(this.f5565a.getContext().getResources().getConfiguration(), typeface);
        this.f5584t = a5;
        if (a5 == null) {
            a5 = this.f5585u;
        }
        this.f5583s = a5;
        return true;
    }

    public final void o(float f5) {
        float clamp = MathUtils.clamp(f5, 0.0f, 1.0f);
        if (clamp != this.f5567c) {
            this.f5567c = clamp;
            c(clamp);
        }
    }

    public final void p(float f5) {
        d(f5, false);
        ViewCompat.postInvalidateOnAnimation(this.f5565a);
    }

    public final void q(Typeface typeface) {
        boolean z4;
        boolean n4 = n(typeface);
        if (this.f5588x != typeface) {
            this.f5588x = typeface;
            Typeface a5 = y1.g.a(this.f5565a.getContext().getResources().getConfiguration(), typeface);
            this.f5587w = a5;
            if (a5 == null) {
                a5 = this.f5588x;
            }
            this.f5586v = a5;
            z4 = true;
        } else {
            z4 = false;
        }
        if (n4 || z4) {
            k(false);
        }
    }
}
