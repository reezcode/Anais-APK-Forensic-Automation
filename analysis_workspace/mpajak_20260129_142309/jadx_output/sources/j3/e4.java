package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes3.dex */
public final class e4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3477b;

    public e4(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3477b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3477b.onBackPressed();
    }
}
