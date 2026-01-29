package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTpActivity;

/* loaded from: classes16.dex */
public final class i2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3499b;

    public i2(InputWordsTpActivity inputWordsTpActivity) {
        this.f3499b = inputWordsTpActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTpActivity inputWordsTpActivity = this.f3499b;
        InputWordsTpActivity.b(inputWordsTpActivity, inputWordsTpActivity.f1658n.getText().toString());
    }
}
