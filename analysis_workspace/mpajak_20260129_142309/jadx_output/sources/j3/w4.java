package j3;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes15.dex */
public final class w4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3591b;

    public w4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3591b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f3591b.getString(R.string.Where_can_I_find_this_link)));
        this.f3591b.startActivity(intent);
    }
}
