package j3;

import android.view.inputmethod.InputMethodManager;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes6.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3490b;

    public h(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3490b = inputWordsBinanceActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3490b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f3490b.f1560g, 1);
        }
    }
}
