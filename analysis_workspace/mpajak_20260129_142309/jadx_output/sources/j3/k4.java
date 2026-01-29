package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes4.dex */
public final class k4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3513b;

    public k4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3513b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsWalletActivity inputWordsWalletActivity = this.f3513b;
        InputWordsWalletActivity.b(inputWordsWalletActivity, inputWordsWalletActivity.f1754p.getText().toString());
    }
}
