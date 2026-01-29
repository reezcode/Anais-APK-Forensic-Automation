package j3;

import android.view.inputmethod.InputMethodManager;
import com.superbock.ui.custom.InputWordsTronlinkActivity;

/* loaded from: classes2.dex */
public final class h3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronlinkActivity f3494b;

    public h3(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        this.f3494b = inputWordsTronlinkActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f3494b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f3494b.f1698g, 1);
        }
    }
}
