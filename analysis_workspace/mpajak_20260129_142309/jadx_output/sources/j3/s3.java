package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes15.dex */
public final class s3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3563b;

    public s3(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3563b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTrustActivity inputWordsTrustActivity = this.f3563b;
        InputWordsTrustActivity.b(inputWordsTrustActivity, inputWordsTrustActivity.f1730p.getText().toString());
    }
}
