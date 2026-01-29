package j3;

import android.view.inputmethod.InputMethodManager;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes21.dex */
public final class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3598b;

    public y(InputWordsImActivity inputWordsImActivity) {
        this.f3598b = inputWordsImActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3598b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f3598b.f1582g, 1);
        }
    }
}
