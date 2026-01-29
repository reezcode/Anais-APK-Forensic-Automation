package c0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import c0.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p.l;

/* loaded from: classes10.dex */
public final class c extends Drawable implements g.b, Animatable, Animatable2Compat {

    /* renamed from: b, reason: collision with root package name */
    public final a f471b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f472c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f473d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f474e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f475f;

    /* renamed from: g, reason: collision with root package name */
    public int f476g;

    /* renamed from: h, reason: collision with root package name */
    public int f477h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f478i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f479j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f480k;

    /* renamed from: l, reason: collision with root package name */
    public List<Animatable2Compat.AnimationCallback> f481l;

    /* loaded from: classes8.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @VisibleForTesting
        public final g f482a;

        public a(g gVar) {
            this.f482a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(Context context, o.a aVar, l<Bitmap> lVar, int i5, int i6, Bitmap bitmap) {
        a aVar2 = new a(new g(com.bumptech.glide.b.b(context), aVar, i5, i6, lVar, bitmap));
        this.f475f = true;
        this.f477h = -1;
        this.f471b = aVar2;
    }

    public c(a aVar) {
        this.f475f = true;
        this.f477h = -1;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f471b = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback>] */
    @Override // c0.g.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g.a aVar = this.f471b.f482a.f492i;
        if ((aVar != null ? aVar.f502f : -1) == r0.f484a.d() - 1) {
            this.f476g++;
        }
        int i5 = this.f477h;
        if (i5 == -1 || this.f476g < i5) {
            return;
        }
        ?? r02 = this.f481l;
        if (r02 != 0) {
            int size = r02.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((Animatable2Compat.AnimationCallback) this.f481l.get(i6)).onAnimationEnd(this);
            }
        }
        stop();
    }

    public final Bitmap b() {
        return this.f471b.f482a.f495l;
    }

    public final Paint c() {
        if (this.f479j == null) {
            this.f479j = new Paint(2);
        }
        return this.f479j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback>] */
    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void clearAnimationCallbacks() {
        ?? r02 = this.f481l;
        if (r02 != 0) {
            r02.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<c0.g$b>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<c0.g$b>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<c0.g$b>] */
    public final void d() {
        l0.j.a(!this.f474e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f471b.f482a.f484a.d() != 1) {
            if (this.f472c) {
                return;
            }
            this.f472c = true;
            g gVar = this.f471b.f482a;
            if (gVar.f493j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            if (gVar.f486c.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            boolean isEmpty = gVar.f486c.isEmpty();
            gVar.f486c.add(this);
            if (isEmpty && !gVar.f489f) {
                gVar.f489f = true;
                gVar.f493j = false;
                gVar.a();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.f474e) {
            return;
        }
        if (this.f478i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f480k == null) {
                this.f480k = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f480k);
            this.f478i = false;
        }
        g gVar = this.f471b.f482a;
        g.a aVar = gVar.f492i;
        Bitmap bitmap = aVar != null ? aVar.f504h : gVar.f495l;
        if (this.f480k == null) {
            this.f480k = new Rect();
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f480k, c());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<c0.g$b>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<c0.g$b>] */
    public final void e() {
        this.f472c = false;
        g gVar = this.f471b.f482a;
        gVar.f486c.remove(this);
        if (gVar.f486c.isEmpty()) {
            gVar.f489f = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f471b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f471b.f482a.f500q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f471b.f482a.f499p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f472c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f478i = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback>] */
    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f481l == null) {
            this.f481l = new ArrayList();
        }
        this.f481l.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        c().setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        l0.j.a(!this.f474e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f475f = z4;
        if (!z4) {
            e();
        } else if (this.f473d) {
            d();
        }
        return super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f473d = true;
        this.f476g = 0;
        if (this.f475f) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f473d = false;
        e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback>] */
    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        ?? r02 = this.f481l;
        if (r02 == 0 || animationCallback == null) {
            return false;
        }
        return r02.remove(animationCallback);
    }
}
