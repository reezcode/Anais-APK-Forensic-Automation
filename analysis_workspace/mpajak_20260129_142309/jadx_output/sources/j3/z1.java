package j3;

import android.view.inputmethod.InputMethodManager;
import com.superbock.ui.custom.InputWordsTpActivity;

/* loaded from: classes24.dex */
public final class z1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3606b;

    public z1(InputWordsTpActivity inputWordsTpActivity) {
        this.f3606b = inputWordsTpActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3606b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f3606b.f1651g, 1);
        }
    }
}
