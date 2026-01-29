package j3;

import android.view.inputmethod.InputMethodManager;
import com.superbock.ui.custom.InputWordsTronglobalActivity;

/* loaded from: classes4.dex */
public final class q2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3550b;

    public q2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3550b = inputWordsTronglobalActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3550b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f3550b.f1675g, 1);
        }
    }
}
