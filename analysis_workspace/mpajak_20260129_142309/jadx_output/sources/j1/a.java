package j1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import b2.g;
import b2.k;
import b2.n;
import com.google.android.material.button.MaterialButton;
import comeliest.metempsychosis.pokelogan.R;
import z1.b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: t, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean f3424t;

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f3425u;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3426a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public k f3427b;

    /* renamed from: c, reason: collision with root package name */
    public int f3428c;

    /* renamed from: d, reason: collision with root package name */
    public int f3429d;

    /* renamed from: e, reason: collision with root package name */
    public int f3430e;

    /* renamed from: f, reason: collision with root package name */
    public int f3431f;

    /* renamed from: g, reason: collision with root package name */
    public int f3432g;

    /* renamed from: h, reason: collision with root package name */
    public int f3433h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f3434i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public ColorStateList f3435j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public ColorStateList f3436k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public ColorStateList f3437l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public Drawable f3438m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3439n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3440o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3441p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3442q;

    /* renamed from: r, reason: collision with root package name */
    public LayerDrawable f3443r;

    /* renamed from: s, reason: collision with root package name */
    public int f3444s;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f3424t = true;
        f3425u = i5 <= 22;
    }

    public a(MaterialButton materialButton, @NonNull k kVar) {
        this.f3426a = materialButton;
        this.f3427b = kVar;
    }

    @Nullable
    public final n a() {
        LayerDrawable layerDrawable = this.f3443r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.f3443r.getNumberOfLayers() > 2 ? this.f3443r.getDrawable(2) : this.f3443r.getDrawable(1));
    }

    @Nullable
    public final g b(boolean z4) {
        LayerDrawable layerDrawable = this.f3443r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f3424t ? (LayerDrawable) ((InsetDrawable) this.f3443r.getDrawable(0)).getDrawable() : this.f3443r).getDrawable(!z4 ? 1 : 0);
    }

    public final void c(@NonNull k kVar) {
        this.f3427b = kVar;
        if (f3425u && !this.f3440o) {
            int paddingStart = ViewCompat.getPaddingStart(this.f3426a);
            int paddingTop = this.f3426a.getPaddingTop();
            int paddingEnd = ViewCompat.getPaddingEnd(this.f3426a);
            int paddingBottom = this.f3426a.getPaddingBottom();
            e();
            ViewCompat.setPaddingRelative(this.f3426a, paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(@Dimension int i5, @Dimension int i6) {
        int paddingStart = ViewCompat.getPaddingStart(this.f3426a);
        int paddingTop = this.f3426a.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.f3426a);
        int paddingBottom = this.f3426a.getPaddingBottom();
        int i7 = this.f3430e;
        int i8 = this.f3431f;
        this.f3431f = i6;
        this.f3430e = i5;
        if (!this.f3440o) {
            e();
        }
        ViewCompat.setPaddingRelative(this.f3426a, paddingStart, (paddingTop + i5) - i7, paddingEnd, (paddingBottom + i6) - i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void e() {
        InsetDrawable insetDrawable;
        MaterialButton materialButton = this.f3426a;
        g gVar = new g(this.f3427b);
        gVar.m(this.f3426a.getContext());
        DrawableCompat.setTintList(gVar, this.f3435j);
        PorterDuff.Mode mode = this.f3434i;
        if (mode != null) {
            DrawableCompat.setTintMode(gVar, mode);
        }
        gVar.r(this.f3433h, this.f3436k);
        g gVar2 = new g(this.f3427b);
        gVar2.setTint(0);
        gVar2.q(this.f3433h, this.f3439n ? p1.a.b(this.f3426a, R.attr.colorSurface) : 0);
        if (f3424t) {
            g gVar3 = new g(this.f3427b);
            this.f3438m = gVar3;
            DrawableCompat.setTint(gVar3, -1);
            ?? rippleDrawable = new RippleDrawable(b.a(this.f3437l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f3428c, this.f3430e, this.f3429d, this.f3431f), this.f3438m);
            this.f3443r = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            z1.a aVar = new z1.a(this.f3427b);
            this.f3438m = aVar;
            DrawableCompat.setTintList(aVar, b.a(this.f3437l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f3438m});
            this.f3443r = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f3428c, this.f3430e, this.f3429d, this.f3431f);
        }
        materialButton.setInternalBackground(insetDrawable);
        g b5 = b(false);
        if (b5 != null) {
            b5.n(this.f3444s);
        }
    }

    public final void f() {
        g b5 = b(false);
        g b6 = b(true);
        if (b5 != null) {
            b5.r(this.f3433h, this.f3436k);
            if (b6 != null) {
                b6.q(this.f3433h, this.f3439n ? p1.a.b(this.f3426a, R.attr.colorSurface) : 0);
            }
        }
    }
}
