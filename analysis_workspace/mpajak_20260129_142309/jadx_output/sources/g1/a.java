package g1;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import b2.g;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f2925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f2926b;

    public a(AppBarLayout appBarLayout, g gVar) {
        this.f2926b = appBarLayout;
        this.f2925a = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f2925a.n(floatValue);
        Drawable drawable = this.f2926b.f706p;
        if (drawable instanceof g) {
            ((g) drawable).n(floatValue);
        }
        Objects.requireNonNull(this.f2926b);
        throw null;
    }
}
