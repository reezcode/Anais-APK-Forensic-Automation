package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronglobalActivity;

/* loaded from: classes24.dex */
public final class k2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3511b;

    public k2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3511b = inputWordsTronglobalActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTronglobalActivity inputWordsTronglobalActivity = this.f3511b;
        InputWordsTronglobalActivity.b(inputWordsTronglobalActivity, inputWordsTronglobalActivity.f1684p.getText().toString());
    }
}
