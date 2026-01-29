package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes10.dex */
public final class v3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3584b;

    public v3(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3584b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTrustActivity inputWordsTrustActivity = this.f3584b;
        InputWordsTrustActivity.b(inputWordsTrustActivity, inputWordsTrustActivity.f1733s.getText().toString());
    }
}
