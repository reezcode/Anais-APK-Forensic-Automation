package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes17.dex */
public final class m4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3528b;

    public m4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3528b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsWalletActivity inputWordsWalletActivity = this.f3528b;
        InputWordsWalletActivity.b(inputWordsWalletActivity, inputWordsWalletActivity.f1756r.getText().toString());
    }
}
