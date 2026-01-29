package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTpActivity;

/* loaded from: classes15.dex */
public final class h2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3493b;

    public h2(InputWordsTpActivity inputWordsTpActivity) {
        this.f3493b = inputWordsTpActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTpActivity inputWordsTpActivity = this.f3493b;
        InputWordsTpActivity.b(inputWordsTpActivity, inputWordsTpActivity.f1657m.getText().toString());
    }
}
