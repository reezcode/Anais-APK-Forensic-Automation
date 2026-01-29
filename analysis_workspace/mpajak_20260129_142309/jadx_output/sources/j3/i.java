package j3;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes12.dex */
public final class i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3496b;

    public i(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3496b = inputWordsBinanceActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.f3496b.f1557d.getWindowVisibleDisplayFrame(rect);
        int height = this.f3496b.f1557d.getRootView().getHeight();
        int i5 = height - rect.bottom;
        InputWordsBinanceActivity inputWordsBinanceActivity = this.f3496b;
        if (inputWordsBinanceActivity.f1575v != i5) {
            if (i5 > height * 0.15d) {
                InputWordsBinanceActivity.a(inputWordsBinanceActivity);
            } else {
                inputWordsBinanceActivity.f1564k.setVisibility(8);
            }
        }
        this.f3496b.f1575v = i5;
    }
}
