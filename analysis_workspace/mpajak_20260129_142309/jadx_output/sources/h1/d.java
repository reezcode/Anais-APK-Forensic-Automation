package h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f3124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3125c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f3127e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i5, boolean z4) {
        this.f3127e = bottomAppBar;
        this.f3124b = actionMenuView;
        this.f3125c = i5;
        this.f3126d = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3123a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3123a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f3127e;
        int i5 = bottomAppBar.f768h;
        boolean z4 = i5 != 0;
        if (i5 != 0) {
            bottomAppBar.f768h = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.inflateMenu(i5);
        }
        BottomAppBar bottomAppBar2 = this.f3127e;
        ActionMenuView actionMenuView = this.f3124b;
        int i6 = this.f3125c;
        boolean z5 = this.f3126d;
        Objects.requireNonNull(bottomAppBar2);
        e eVar = new e(bottomAppBar2, actionMenuView, i6, z5);
        if (z4) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }
}
