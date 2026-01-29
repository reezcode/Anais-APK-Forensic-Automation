package f1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes24.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public long f2781a;

    /* renamed from: b, reason: collision with root package name */
    public long f2782b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public TimeInterpolator f2783c;

    /* renamed from: d, reason: collision with root package name */
    public int f2784d;

    /* renamed from: e, reason: collision with root package name */
    public int f2785e;

    public i(long j5) {
        this.f2783c = null;
        this.f2784d = 0;
        this.f2785e = 1;
        this.f2781a = j5;
        this.f2782b = 150L;
    }

    public i(long j5, long j6, @NonNull TimeInterpolator timeInterpolator) {
        this.f2784d = 0;
        this.f2785e = 1;
        this.f2781a = j5;
        this.f2782b = j6;
        this.f2783c = timeInterpolator;
    }

    public final void a(@NonNull Animator animator) {
        animator.setStartDelay(this.f2781a);
        animator.setDuration(this.f2782b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f2784d);
            valueAnimator.setRepeatMode(this.f2785e);
        }
    }

    @Nullable
    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f2783c;
        return timeInterpolator != null ? timeInterpolator : a.f2768b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f2781a == iVar.f2781a && this.f2782b == iVar.f2782b && this.f2784d == iVar.f2784d && this.f2785e == iVar.f2785e) {
            return b().getClass().equals(iVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f2781a;
        long j6 = this.f2782b;
        return ((((b().getClass().hashCode() + (((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31)) * 31) + this.f2784d) * 31) + this.f2785e;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append(i.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f2781a);
        sb.append(" duration: ");
        sb.append(this.f2782b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f2784d);
        sb.append(" repeatMode: ");
        return androidx.appcompat.view.a.h(sb, this.f2785e, "}\n");
    }
}
