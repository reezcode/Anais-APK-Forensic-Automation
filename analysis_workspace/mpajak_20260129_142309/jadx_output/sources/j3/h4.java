package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes11.dex */
public final class h4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3495b;

    public h4(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3495b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTrustActivity inputWordsTrustActivity = this.f3495b;
        InputWordsTrustActivity.b(inputWordsTrustActivity, inputWordsTrustActivity.f1727m.getText().toString());
    }
}
