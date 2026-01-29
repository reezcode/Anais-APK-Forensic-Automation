package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes16.dex */
public final class i4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3501b;

    public i4(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3501b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTrustActivity inputWordsTrustActivity = this.f3501b;
        InputWordsTrustActivity.b(inputWordsTrustActivity, inputWordsTrustActivity.f1728n.getText().toString());
    }
}
