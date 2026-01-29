package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronlinkActivity;

/* loaded from: classes24.dex */
public final class e3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronlinkActivity f3476b;

    public e3(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        this.f3476b = inputWordsTronlinkActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTronlinkActivity inputWordsTronlinkActivity = this.f3476b;
        InputWordsTronlinkActivity.b(inputWordsTronlinkActivity, inputWordsTronlinkActivity.f1710s.getText().toString());
    }
}
