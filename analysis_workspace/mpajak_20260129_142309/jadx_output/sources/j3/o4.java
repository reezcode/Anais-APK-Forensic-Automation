package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes10.dex */
public final class o4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3540b;

    public o4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3540b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsWalletActivity inputWordsWalletActivity = this.f3540b;
        InputWordsWalletActivity.b(inputWordsWalletActivity, inputWordsWalletActivity.f1758t.getText().toString());
    }
}
