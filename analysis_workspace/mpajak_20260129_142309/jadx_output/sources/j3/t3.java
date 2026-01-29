package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes25.dex */
public final class t3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3569b;

    public t3(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3569b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTrustActivity inputWordsTrustActivity = this.f3569b;
        InputWordsTrustActivity.b(inputWordsTrustActivity, inputWordsTrustActivity.f1731q.getText().toString());
    }
}
