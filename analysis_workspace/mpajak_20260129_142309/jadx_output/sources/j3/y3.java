package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes12.dex */
public final class y3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3602b;

    public y3(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3602b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTrustActivity inputWordsTrustActivity = this.f3602b;
        InputWordsTrustActivity.b(inputWordsTrustActivity, inputWordsTrustActivity.f1736v.getText().toString());
    }
}
