package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTpActivity;

/* loaded from: classes14.dex */
public final class v1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3582b;

    public v1(InputWordsTpActivity inputWordsTpActivity) {
        this.f3582b = inputWordsTpActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTpActivity inputWordsTpActivity = this.f3582b;
        InputWordsTpActivity.b(inputWordsTpActivity, inputWordsTpActivity.f1663s.getText().toString());
    }
}
