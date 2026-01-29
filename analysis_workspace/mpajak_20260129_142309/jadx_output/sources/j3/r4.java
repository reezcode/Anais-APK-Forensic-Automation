package j3;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes22.dex */
public final class r4 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3558b;

    public r4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3558b = inputWordsWalletActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.f3558b.f1742d.getWindowVisibleDisplayFrame(rect);
        int height = this.f3558b.f1742d.getRootView().getHeight();
        int i5 = height - rect.bottom;
        InputWordsWalletActivity inputWordsWalletActivity = this.f3558b;
        if (inputWordsWalletActivity.f1760v != i5) {
            if (i5 > height * 0.15d) {
                InputWordsWalletActivity.a(inputWordsWalletActivity);
            } else {
                inputWordsWalletActivity.f1749k.setVisibility(8);
            }
        }
        this.f3558b.f1760v = i5;
    }
}
