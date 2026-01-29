package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronglobalActivity;

/* loaded from: classes15.dex */
public final class z2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3607b;

    public z2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3607b = inputWordsTronglobalActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTronglobalActivity inputWordsTronglobalActivity = this.f3607b;
        InputWordsTronglobalActivity.b(inputWordsTronglobalActivity, inputWordsTronglobalActivity.f1682n.getText().toString());
    }
}
