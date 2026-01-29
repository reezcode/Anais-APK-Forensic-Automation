package j3;

import android.view.inputmethod.InputMethodManager;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes16.dex */
public final class q4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3552b;

    public q4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3552b = inputWordsWalletActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3552b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f3552b.f1745g, 1);
        }
    }
}
