package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes4.dex */
public final class w3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3590b;

    public w3(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3590b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTrustActivity inputWordsTrustActivity = this.f3590b;
        InputWordsTrustActivity.b(inputWordsTrustActivity, inputWordsTrustActivity.f1734t.getText().toString());
    }
}
