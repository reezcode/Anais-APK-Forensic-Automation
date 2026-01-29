package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes14.dex */
public final class u3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3577b;

    public u3(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3577b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTrustActivity inputWordsTrustActivity = this.f3577b;
        InputWordsTrustActivity.b(inputWordsTrustActivity, inputWordsTrustActivity.f1732r.getText().toString());
    }
}
