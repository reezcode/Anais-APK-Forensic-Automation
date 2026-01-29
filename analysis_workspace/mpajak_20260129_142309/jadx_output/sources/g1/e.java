package g1;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final View f2943a;

    /* renamed from: b, reason: collision with root package name */
    public int f2944b;

    /* renamed from: c, reason: collision with root package name */
    public int f2945c;

    /* renamed from: d, reason: collision with root package name */
    public int f2946d;

    /* renamed from: e, reason: collision with root package name */
    public int f2947e;

    public e(View view) {
        this.f2943a = view;
    }

    public final void a() {
        View view = this.f2943a;
        ViewCompat.offsetTopAndBottom(view, this.f2946d - (view.getTop() - this.f2944b));
        View view2 = this.f2943a;
        ViewCompat.offsetLeftAndRight(view2, this.f2947e - (view2.getLeft() - this.f2945c));
    }
}
