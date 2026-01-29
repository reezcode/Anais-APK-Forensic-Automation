package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronlinkActivity;

/* loaded from: classes10.dex */
public final class g3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronlinkActivity f3488b;

    public g3(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        this.f3488b = inputWordsTronlinkActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTronlinkActivity inputWordsTronlinkActivity = this.f3488b;
        InputWordsTronlinkActivity.b(inputWordsTronlinkActivity, inputWordsTronlinkActivity.f1712u.getText().toString());
    }
}
