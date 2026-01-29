package j3;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.superbock.ui.custom.InputWordsTronlinkActivity;

/* loaded from: classes5.dex */
public final class i3 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronlinkActivity f3500b;

    public i3(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        this.f3500b = inputWordsTronlinkActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.f3500b.f1695d.getWindowVisibleDisplayFrame(rect);
        int height = this.f3500b.f1695d.getRootView().getHeight();
        int i5 = height - rect.bottom;
        InputWordsTronlinkActivity inputWordsTronlinkActivity = this.f3500b;
        if (inputWordsTronlinkActivity.f1713v != i5) {
            if (i5 > height * 0.15d) {
                InputWordsTronlinkActivity.a(inputWordsTronlinkActivity);
            } else {
                inputWordsTronlinkActivity.f1702k.setVisibility(8);
            }
        }
        this.f3500b.f1713v = i5;
    }
}
