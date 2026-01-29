package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes18.dex */
public final class x3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3596b;

    public x3(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3596b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTrustActivity inputWordsTrustActivity = this.f3596b;
        InputWordsTrustActivity.b(inputWordsTrustActivity, inputWordsTrustActivity.f1735u.getText().toString());
    }
}
