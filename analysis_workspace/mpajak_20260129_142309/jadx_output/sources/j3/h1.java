package j3;

import android.view.inputmethod.InputMethodManager;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes14.dex */
public final class h1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3492b;

    public h1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3492b = inputWordsOkxActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3492b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f3492b.f1629g, 1);
        }
    }
}
