package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTpActivity;

/* loaded from: classes10.dex */
public final class x1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3594b;

    public x1(InputWordsTpActivity inputWordsTpActivity) {
        this.f3594b = inputWordsTpActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTpActivity inputWordsTpActivity = this.f3594b;
        InputWordsTpActivity.b(inputWordsTpActivity, inputWordsTpActivity.f1665u.getText().toString());
    }
}
