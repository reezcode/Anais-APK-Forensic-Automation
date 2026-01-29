package j3;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.superbock.ui.custom.InputWordsTpActivity;

/* loaded from: classes19.dex */
public final class a2 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3448b;

    public a2(InputWordsTpActivity inputWordsTpActivity) {
        this.f3448b = inputWordsTpActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.f3448b.f1648d.getWindowVisibleDisplayFrame(rect);
        int height = this.f3448b.f1648d.getRootView().getHeight();
        int i5 = height - rect.bottom;
        InputWordsTpActivity inputWordsTpActivity = this.f3448b;
        if (inputWordsTpActivity.f1667w != i5) {
            if (i5 > height * 0.15d) {
                InputWordsTpActivity.a(inputWordsTpActivity);
            } else {
                inputWordsTpActivity.f1656l.setVisibility(8);
            }
        }
        this.f3448b.f1667w = i5;
    }
}
