package j3;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.superbock.ui.custom.InputWordsTrustActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes19.dex */
public final class g4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3489b;

    public g4(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3489b = inputWordsTrustActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f3489b.getString(R.string.Why_need_ReImport_Wallet_link)));
        this.f3489b.startActivity(intent);
    }
}
