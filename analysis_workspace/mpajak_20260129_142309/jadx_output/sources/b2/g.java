package b2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import b2.l;
import b2.m;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes17.dex */
public class g extends Drawable implements TintAwareDrawable, n {

    /* renamed from: x, reason: collision with root package name */
    public static final String f322x = g.class.getSimpleName();

    /* renamed from: y, reason: collision with root package name */
    public static final Paint f323y;

    /* renamed from: b, reason: collision with root package name */
    public b f324b;

    /* renamed from: c, reason: collision with root package name */
    public final m.g[] f325c;

    /* renamed from: d, reason: collision with root package name */
    public final m.g[] f326d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f327e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f328f;

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f329g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f330h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f331i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f332j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f333k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f334l;

    /* renamed from: m, reason: collision with root package name */
    public final Region f335m;

    /* renamed from: n, reason: collision with root package name */
    public k f336n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f337o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f338p;

    /* renamed from: q, reason: collision with root package name */
    public final a2.a f339q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final a f340r;

    /* renamed from: s, reason: collision with root package name */
    public final l f341s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f342t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f343u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final RectF f344v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f345w;

    /* loaded from: classes11.dex */
    public class a implements l.b {
        public a() {
        }
    }

    /* loaded from: classes19.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public k f347a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public s1.a f348b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public ColorStateList f349c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public ColorStateList f350d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        public ColorStateList f351e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public ColorStateList f352f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        public PorterDuff.Mode f353g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        public Rect f354h;

        /* renamed from: i, reason: collision with root package name */
        public float f355i;

        /* renamed from: j, reason: collision with root package name */
        public float f356j;

        /* renamed from: k, reason: collision with root package name */
        public float f357k;

        /* renamed from: l, reason: collision with root package name */
        public int f358l;

        /* renamed from: m, reason: collision with root package name */
        public float f359m;

        /* renamed from: n, reason: collision with root package name */
        public float f360n;

        /* renamed from: o, reason: collision with root package name */
        public float f361o;

        /* renamed from: p, reason: collision with root package name */
        public int f362p;

        /* renamed from: q, reason: collision with root package name */
        public int f363q;

        /* renamed from: r, reason: collision with root package name */
        public int f364r;

        /* renamed from: s, reason: collision with root package name */
        public int f365s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f366t;

        /* renamed from: u, reason: collision with root package name */
        public Paint.Style f367u;

        public b(@NonNull b bVar) {
            this.f349c = null;
            this.f350d = null;
            this.f351e = null;
            this.f352f = null;
            this.f353g = PorterDuff.Mode.SRC_IN;
            this.f354h = null;
            this.f355i = 1.0f;
            this.f356j = 1.0f;
            this.f358l = 255;
            this.f359m = 0.0f;
            this.f360n = 0.0f;
            this.f361o = 0.0f;
            this.f362p = 0;
            this.f363q = 0;
            this.f364r = 0;
            this.f365s = 0;
            this.f366t = false;
            this.f367u = Paint.Style.FILL_AND_STROKE;
            this.f347a = bVar.f347a;
            this.f348b = bVar.f348b;
            this.f357k = bVar.f357k;
            this.f349c = bVar.f349c;
            this.f350d = bVar.f350d;
            this.f353g = bVar.f353g;
            this.f352f = bVar.f352f;
            this.f358l = bVar.f358l;
            this.f355i = bVar.f355i;
            this.f364r = bVar.f364r;
            this.f362p = bVar.f362p;
            this.f366t = bVar.f366t;
            this.f356j = bVar.f356j;
            this.f359m = bVar.f359m;
            this.f360n = bVar.f360n;
            this.f361o = bVar.f361o;
            this.f363q = bVar.f363q;
            this.f365s = bVar.f365s;
            this.f351e = bVar.f351e;
            this.f367u = bVar.f367u;
            if (bVar.f354h != null) {
                this.f354h = new Rect(bVar.f354h);
            }
        }

        public b(k kVar) {
            this.f349c = null;
            this.f350d = null;
            this.f351e = null;
            this.f352f = null;
            this.f353g = PorterDuff.Mode.SRC_IN;
            this.f354h = null;
            this.f355i = 1.0f;
            this.f356j = 1.0f;
            this.f358l = 255;
            this.f359m = 0.0f;
            this.f360n = 0.0f;
            this.f361o = 0.0f;
            this.f362p = 0;
            this.f363q = 0;
            this.f364r = 0;
            this.f365s = 0;
            this.f366t = false;
            this.f367u = Paint.Style.FILL_AND_STROKE;
            this.f347a = kVar;
            this.f348b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f328f = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f323y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public g(@NonNull b bVar) {
        this.f325c = new m.g[4];
        this.f326d = new m.g[4];
        this.f327e = new BitSet(8);
        this.f329g = new Matrix();
        this.f330h = new Path();
        this.f331i = new Path();
        this.f332j = new RectF();
        this.f333k = new RectF();
        this.f334l = new Region();
        this.f335m = new Region();
        Paint paint = new Paint(1);
        this.f337o = paint;
        Paint paint2 = new Paint(1);
        this.f338p = paint2;
        this.f339q = new a2.a();
        this.f341s = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.a.f405a : new l();
        this.f344v = new RectF();
        this.f345w = true;
        this.f324b = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        u(getState());
        this.f340r = new a();
    }

    public g(@NonNull k kVar) {
        this(new b(kVar));
    }

    public final void b(@NonNull RectF rectF, @NonNull Path path) {
        l lVar = this.f341s;
        b bVar = this.f324b;
        lVar.a(bVar.f347a, bVar.f356j, rectF, this.f340r, path);
        if (this.f324b.f355i != 1.0f) {
            this.f329g.reset();
            Matrix matrix = this.f329g;
            float f5 = this.f324b.f355i;
            matrix.setScale(f5, f5, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f329g);
        }
        path.computeBounds(this.f344v, true);
    }

    @NonNull
    public final PorterDuffColorFilter c(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z4) {
        int color;
        int d5;
        if (colorStateList == null || mode == null) {
            return (!z4 || (d5 = d((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(d5, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z4) {
            colorForState = d(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int d(@ColorInt int i5) {
        int i6;
        b bVar = this.f324b;
        float f5 = bVar.f360n + bVar.f361o + bVar.f359m;
        s1.a aVar = bVar.f348b;
        if (aVar == null || !aVar.f5131a) {
            return i5;
        }
        if (!(ColorUtils.setAlphaComponent(i5, 255) == aVar.f5134d)) {
            return i5;
        }
        float min = (aVar.f5135e <= 0.0f || f5 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f5 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i5);
        int d5 = p1.a.d(ColorUtils.setAlphaComponent(i5, 255), aVar.f5132b, min);
        if (min > 0.0f && (i6 = aVar.f5133c) != 0) {
            d5 = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i6, s1.a.f5130f), d5);
        }
        return ColorUtils.setAlphaComponent(d5, alpha);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ee, code lost:
    
        if (((r2.f347a.d(h()) || r12.f330h.isConvex() || android.os.Build.VERSION.SDK_INT >= 29) ? false : true) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bd  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.g.draw(android.graphics.Canvas):void");
    }

    public final void e(@NonNull Canvas canvas) {
        if (this.f327e.cardinality() > 0) {
            Log.w(f322x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f324b.f364r != 0) {
            canvas.drawPath(this.f330h, this.f339q.f56a);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            m.g gVar = this.f325c[i5];
            a2.a aVar = this.f339q;
            int i6 = this.f324b.f363q;
            Matrix matrix = m.g.f430a;
            gVar.a(matrix, aVar, i6, canvas);
            this.f326d[i5].a(matrix, this.f339q, this.f324b.f363q, canvas);
        }
        if (this.f345w) {
            b bVar = this.f324b;
            int sin = (int) (Math.sin(Math.toRadians(bVar.f365s)) * bVar.f364r);
            int j5 = j();
            canvas.translate(-sin, -j5);
            canvas.drawPath(this.f330h, f323y);
            canvas.translate(sin, j5);
        }
    }

    public final void f(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull k kVar, @NonNull RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a5 = kVar.f374f.a(rectF) * this.f324b.f356j;
            canvas.drawRoundRect(rectF, a5, a5, paint);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void g(@NonNull Canvas canvas) {
        f(canvas, this.f338p, this.f331i, this.f336n, i());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f324b.f358l;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.f324b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        b bVar = this.f324b;
        if (bVar.f362p == 2) {
            return;
        }
        if (bVar.f347a.d(h())) {
            outline.setRoundRect(getBounds(), k() * this.f324b.f356j);
            return;
        }
        b(h(), this.f330h);
        if (this.f330h.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f330h);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f324b.f354h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.f334l.set(getBounds());
        b(h(), this.f330h);
        this.f335m.setPath(this.f330h, this.f334l);
        this.f334l.op(this.f335m, Region.Op.DIFFERENCE);
        return this.f334l;
    }

    @NonNull
    public final RectF h() {
        this.f332j.set(getBounds());
        return this.f332j;
    }

    @NonNull
    public final RectF i() {
        this.f333k.set(h());
        float strokeWidth = l() ? this.f338p.getStrokeWidth() / 2.0f : 0.0f;
        this.f333k.inset(strokeWidth, strokeWidth);
        return this.f333k;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f328f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f324b.f352f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f324b.f351e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f324b.f350d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f324b.f349c) != null && colorStateList4.isStateful())));
    }

    public final int j() {
        b bVar = this.f324b;
        return (int) (Math.cos(Math.toRadians(bVar.f365s)) * bVar.f364r);
    }

    public final float k() {
        return this.f324b.f347a.f373e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.f324b.f367u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f338p.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.f324b.f348b = new s1.a(context);
        w();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        this.f324b = new b(this.f324b);
        return this;
    }

    public final void n(float f5) {
        b bVar = this.f324b;
        if (bVar.f360n != f5) {
            bVar.f360n = f5;
            w();
        }
    }

    public final void o(@Nullable ColorStateList colorStateList) {
        b bVar = this.f324b;
        if (bVar.f349c != colorStateList) {
            bVar.f349c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f328f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z4 = u(iArr) || v();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    public final void p(float f5) {
        b bVar = this.f324b;
        if (bVar.f356j != f5) {
            bVar.f356j = f5;
            this.f328f = true;
            invalidateSelf();
        }
    }

    public final void q(float f5, @ColorInt int i5) {
        t(f5);
        s(ColorStateList.valueOf(i5));
    }

    public final void r(float f5, @Nullable ColorStateList colorStateList) {
        t(f5);
        s(colorStateList);
    }

    public final void s(@Nullable ColorStateList colorStateList) {
        b bVar = this.f324b;
        if (bVar.f350d != colorStateList) {
            bVar.f350d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i5) {
        b bVar = this.f324b;
        if (bVar.f358l != i5) {
            bVar.f358l = i5;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Objects.requireNonNull(this.f324b);
        super.invalidateSelf();
    }

    @Override // b2.n
    public final void setShapeAppearanceModel(@NonNull k kVar) {
        this.f324b.f347a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTint(@ColorInt int i5) {
        setTintList(ColorStateList.valueOf(i5));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f324b.f352f = colorStateList;
        v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        b bVar = this.f324b;
        if (bVar.f353g != mode) {
            bVar.f353g = mode;
            v();
            super.invalidateSelf();
        }
    }

    public final void t(float f5) {
        this.f324b.f357k = f5;
        invalidateSelf();
    }

    public final boolean u(int[] iArr) {
        boolean z4;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f324b.f349c == null || color2 == (colorForState2 = this.f324b.f349c.getColorForState(iArr, (color2 = this.f337o.getColor())))) {
            z4 = false;
        } else {
            this.f337o.setColor(colorForState2);
            z4 = true;
        }
        if (this.f324b.f350d == null || color == (colorForState = this.f324b.f350d.getColorForState(iArr, (color = this.f338p.getColor())))) {
            return z4;
        }
        this.f338p.setColor(colorForState);
        return true;
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter = this.f342t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f343u;
        b bVar = this.f324b;
        this.f342t = c(bVar.f352f, bVar.f353g, this.f337o, true);
        b bVar2 = this.f324b;
        this.f343u = c(bVar2.f351e, bVar2.f353g, this.f338p, false);
        b bVar3 = this.f324b;
        if (bVar3.f366t) {
            this.f339q.a(bVar3.f352f.getColorForState(getState(), 0));
        }
        return (ObjectsCompat.equals(porterDuffColorFilter, this.f342t) && ObjectsCompat.equals(porterDuffColorFilter2, this.f343u)) ? false : true;
    }

    public final void w() {
        b bVar = this.f324b;
        float f5 = bVar.f360n + bVar.f361o;
        bVar.f363q = (int) Math.ceil(0.75f * f5);
        this.f324b.f364r = (int) Math.ceil(f5 * 0.25f);
        v();
        super.invalidateSelf();
    }
}
