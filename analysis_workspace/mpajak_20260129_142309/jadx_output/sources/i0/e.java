package i0;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes11.dex */
public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Animatable f3247d;

    public e(ImageView imageView) {
        super(imageView);
    }

    @Override // i0.h
    public final void c(@Nullable Drawable drawable) {
        l(null);
        j(drawable);
    }

    @Override // e0.l
    public final void d() {
        Animatable animatable = this.f3247d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // i0.h
    public final void f(@Nullable Drawable drawable) {
        l(null);
        j(drawable);
    }

    @Override // i0.h
    public final void h(@Nullable Drawable drawable) {
        this.f3251c.a();
        Animatable animatable = this.f3247d;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        j(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i0.h
    public final void i(@NonNull Object obj) {
        l(obj);
    }

    public final void j(Drawable drawable) {
        ((ImageView) this.f3250b).setImageDrawable(drawable);
    }

    public abstract void k(@Nullable Z z4);

    public final void l(@Nullable Z z4) {
        k(z4);
        if (!(z4 instanceof Animatable)) {
            this.f3247d = null;
            return;
        }
        Animatable animatable = (Animatable) z4;
        this.f3247d = animatable;
        animatable.start();
    }

    @Override // e0.l
    public final void onStart() {
        Animatable animatable = this.f3247d;
        if (animatable != null) {
            animatable.start();
        }
    }
}
