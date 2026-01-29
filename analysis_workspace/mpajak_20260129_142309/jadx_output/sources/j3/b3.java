package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronlinkActivity;

/* loaded from: classes12.dex */
public final class b3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronlinkActivity f3455b;

    public b3(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        this.f3455b = inputWordsTronlinkActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTronlinkActivity inputWordsTronlinkActivity = this.f3455b;
        InputWordsTronlinkActivity.b(inputWordsTronlinkActivity, inputWordsTronlinkActivity.f1707p.getText().toString());
    }
}
