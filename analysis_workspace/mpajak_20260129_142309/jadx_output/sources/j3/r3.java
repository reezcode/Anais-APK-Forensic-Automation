package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes23.dex */
public final class r3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3557b;

    public r3(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3557b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTrustActivity inputWordsTrustActivity = this.f3557b;
        InputWordsTrustActivity.b(inputWordsTrustActivity, inputWordsTrustActivity.f1729o.getText().toString());
    }
}
