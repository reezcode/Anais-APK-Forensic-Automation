package h1;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes19.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f3128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3129c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f3131e;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i5, boolean z4) {
        this.f3131e = bottomAppBar;
        this.f3128b = actionMenuView;
        this.f3129c = i5;
        this.f3130d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3128b.setTranslationX(this.f3131e.c(r0, this.f3129c, this.f3130d));
    }
}
