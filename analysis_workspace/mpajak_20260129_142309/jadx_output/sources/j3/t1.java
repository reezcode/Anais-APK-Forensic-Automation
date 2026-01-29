package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTpActivity;

/* loaded from: classes6.dex */
public final class t1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3567b;

    public t1(InputWordsTpActivity inputWordsTpActivity) {
        this.f3567b = inputWordsTpActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTpActivity inputWordsTpActivity = this.f3567b;
        InputWordsTpActivity.b(inputWordsTpActivity, inputWordsTpActivity.f1661q.getText().toString());
    }
}
