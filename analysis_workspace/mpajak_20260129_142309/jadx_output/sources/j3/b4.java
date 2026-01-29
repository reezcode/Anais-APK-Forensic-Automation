package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes24.dex */
public final class b4 implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3456b;

    public b4(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3456b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            InputWordsTrustActivity inputWordsTrustActivity = this.f3456b;
            inputWordsTrustActivity.f1721g.postDelayed(new z3(inputWordsTrustActivity), 100L);
        }
    }
}
