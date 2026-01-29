package v1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes23.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5636b;

    public o(View view) {
        this.f5636b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InputMethodManager) this.f5636b.getContext().getSystemService("input_method")).showSoftInput(this.f5636b, 1);
    }
}
