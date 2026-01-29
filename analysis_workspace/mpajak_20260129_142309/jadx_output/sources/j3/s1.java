package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTpActivity;

/* loaded from: classes22.dex */
public final class s1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3561b;

    public s1(InputWordsTpActivity inputWordsTpActivity) {
        this.f3561b = inputWordsTpActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTpActivity inputWordsTpActivity = this.f3561b;
        InputWordsTpActivity.b(inputWordsTpActivity, inputWordsTpActivity.f1660p.getText().toString());
    }
}
