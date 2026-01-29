package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes21.dex */
public final class p4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3546b;

    public p4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3546b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsWalletActivity inputWordsWalletActivity = this.f3546b;
        InputWordsWalletActivity.b(inputWordsWalletActivity, inputWordsWalletActivity.f1759u.getText().toString());
    }
}
