package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronlinkActivity;

/* loaded from: classes21.dex */
public final class p3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronlinkActivity f3545b;

    public p3(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        this.f3545b = inputWordsTronlinkActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTronlinkActivity inputWordsTronlinkActivity = this.f3545b;
        InputWordsTronlinkActivity.b(inputWordsTronlinkActivity, inputWordsTronlinkActivity.f1704m.getText().toString());
    }
}
