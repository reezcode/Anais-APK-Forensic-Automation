package c2;

import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes25.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f518b;

    public d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f518b = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f518b.e();
    }
}
