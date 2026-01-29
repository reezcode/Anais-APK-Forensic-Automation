package v1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f5603a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public b f5604b = null;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public ValueAnimator f5605c = null;

    /* renamed from: d, reason: collision with root package name */
    public final a f5606d = new a();

    /* loaded from: classes25.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f5605c == animator) {
                iVar.f5605c = null;
            }
        }
    }

    /* loaded from: classes15.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f5608a;

        /* renamed from: b, reason: collision with root package name */
        public final ValueAnimator f5609b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f5608a = iArr;
            this.f5609b = valueAnimator;
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f5606d);
        this.f5603a.add(bVar);
    }
}
