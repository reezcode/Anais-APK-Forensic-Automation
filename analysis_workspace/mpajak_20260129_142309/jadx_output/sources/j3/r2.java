package j3;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.superbock.ui.custom.InputWordsTronglobalActivity;

/* loaded from: classes17.dex */
public final class r2 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3556b;

    public r2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3556b = inputWordsTronglobalActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.f3556b.f1672d.getWindowVisibleDisplayFrame(rect);
        int height = this.f3556b.f1672d.getRootView().getHeight();
        int i5 = height - rect.bottom;
        InputWordsTronglobalActivity inputWordsTronglobalActivity = this.f3556b;
        if (inputWordsTronglobalActivity.f1690v != i5) {
            if (i5 > height * 0.15d) {
                InputWordsTronglobalActivity.a(inputWordsTronglobalActivity);
            } else {
                inputWordsTronglobalActivity.f1679k.setVisibility(8);
            }
        }
        this.f3556b.f1690v = i5;
    }
}
