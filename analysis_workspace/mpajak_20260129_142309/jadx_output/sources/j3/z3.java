package j3;

import android.view.inputmethod.InputMethodManager;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes13.dex */
public final class z3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3608b;

    public z3(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3608b = inputWordsTrustActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3608b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f3608b.f1721g, 1);
        }
    }
}
