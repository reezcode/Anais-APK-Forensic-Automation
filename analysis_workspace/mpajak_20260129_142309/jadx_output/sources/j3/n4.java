package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes14.dex */
public final class n4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3534b;

    public n4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3534b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsWalletActivity inputWordsWalletActivity = this.f3534b;
        InputWordsWalletActivity.b(inputWordsWalletActivity, inputWordsWalletActivity.f1757s.getText().toString());
    }
}
