package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronglobalActivity;

/* loaded from: classes20.dex */
public final class p2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3544b;

    public p2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3544b = inputWordsTronglobalActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTronglobalActivity inputWordsTronglobalActivity = this.f3544b;
        InputWordsTronglobalActivity.b(inputWordsTronglobalActivity, inputWordsTronglobalActivity.f1689u.getText().toString());
    }
}
