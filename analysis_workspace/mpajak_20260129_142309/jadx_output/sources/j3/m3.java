package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronlinkActivity;

/* loaded from: classes5.dex */
public final class m3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronlinkActivity f3527b;

    public m3(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        this.f3527b = inputWordsTronlinkActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3527b.onBackPressed();
    }
}
