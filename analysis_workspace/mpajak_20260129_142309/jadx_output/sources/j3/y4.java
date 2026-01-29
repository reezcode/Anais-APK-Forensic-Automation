package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes8.dex */
public final class y4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3603b;

    public y4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3603b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsWalletActivity inputWordsWalletActivity = this.f3603b;
        InputWordsWalletActivity.b(inputWordsWalletActivity, inputWordsWalletActivity.f1751m.getText().toString());
    }
}
