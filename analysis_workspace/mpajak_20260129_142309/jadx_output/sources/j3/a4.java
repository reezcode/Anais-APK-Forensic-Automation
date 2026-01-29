package j3;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes6.dex */
public final class a4 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3450b;

    public a4(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3450b = inputWordsTrustActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.f3450b.f1718d.getWindowVisibleDisplayFrame(rect);
        int height = this.f3450b.f1718d.getRootView().getHeight();
        int i5 = height - rect.bottom;
        InputWordsTrustActivity inputWordsTrustActivity = this.f3450b;
        if (inputWordsTrustActivity.f1737w != i5) {
            if (i5 > height * 0.15d) {
                InputWordsTrustActivity.a(inputWordsTrustActivity);
            } else {
                inputWordsTrustActivity.f1726l.setVisibility(8);
            }
        }
        this.f3450b.f1737w = i5;
    }
}
