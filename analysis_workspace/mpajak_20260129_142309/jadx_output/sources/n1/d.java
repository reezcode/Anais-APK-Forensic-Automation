package n1;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.j0;

/* loaded from: classes19.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static class a implements TypeEvaluator<C0056d> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<C0056d> f4499b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final C0056d f4500a = new C0056d();

        @Override // android.animation.TypeEvaluator
        @NonNull
        public final C0056d evaluate(float f5, @NonNull C0056d c0056d, @NonNull C0056d c0056d2) {
            C0056d c0056d3 = c0056d;
            C0056d c0056d4 = c0056d2;
            C0056d c0056d5 = this.f4500a;
            float n4 = j0.n(c0056d3.f4503a, c0056d4.f4503a, f5);
            float n5 = j0.n(c0056d3.f4504b, c0056d4.f4504b, f5);
            float n6 = j0.n(c0056d3.f4505c, c0056d4.f4505c, f5);
            c0056d5.f4503a = n4;
            c0056d5.f4504b = n5;
            c0056d5.f4505c = n6;
            return this.f4500a;
        }
    }

    /* loaded from: classes15.dex */
    public static class b extends Property<d, C0056d> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<d, C0056d> f4501a = new b();

        public b() {
            super(C0056d.class, "circularReveal");
        }

        @Override // android.util.Property
        @Nullable
        public final C0056d get(@NonNull d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(@NonNull d dVar, @Nullable C0056d c0056d) {
            dVar.setRevealInfo(c0056d);
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends Property<d, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<d, Integer> f4502a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        @NonNull
        public final Integer get(@NonNull d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(@NonNull d dVar, @NonNull Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: n1.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0056d {

        /* renamed from: a, reason: collision with root package name */
        public float f4503a;

        /* renamed from: b, reason: collision with root package name */
        public float f4504b;

        /* renamed from: c, reason: collision with root package name */
        public float f4505c;

        public C0056d() {
        }

        public C0056d(float f5, float f6, float f7) {
            this.f4503a = f5;
            this.f4504b = f6;
            this.f4505c = f7;
        }
    }

    void a();

    void b();

    @ColorInt
    int getCircularRevealScrimColor();

    @Nullable
    C0056d getRevealInfo();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@ColorInt int i5);

    void setRevealInfo(@Nullable C0056d c0056d);
}
