package j3;

import android.view.inputmethod.InputMethodManager;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes14.dex */
public final class q0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3548b;

    public q0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3548b = inputWordsMetaActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3548b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f3548b.f1605g, 1);
        }
    }
}
