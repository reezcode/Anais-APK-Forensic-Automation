package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes7.dex */
public final class j4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3507b;

    public j4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3507b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsWalletActivity inputWordsWalletActivity = this.f3507b;
        InputWordsWalletActivity.b(inputWordsWalletActivity, inputWordsWalletActivity.f1753o.getText().toString());
    }
}
