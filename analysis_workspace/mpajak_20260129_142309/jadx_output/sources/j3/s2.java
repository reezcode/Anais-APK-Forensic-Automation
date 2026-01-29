package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronglobalActivity;

/* loaded from: classes3.dex */
public final class s2 implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3562b;

    public s2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3562b = inputWordsTronglobalActivity;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            InputWordsTronglobalActivity inputWordsTronglobalActivity = this.f3562b;
            inputWordsTronglobalActivity.f1675g.postDelayed(new q2(inputWordsTronglobalActivity), 100L);
        }
    }
}
