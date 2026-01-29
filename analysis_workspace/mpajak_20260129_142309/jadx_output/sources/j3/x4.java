package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes7.dex */
public final class x4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3597b;

    public x4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3597b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsWalletActivity inputWordsWalletActivity = this.f3597b;
        InputWordsWalletActivity.b(inputWordsWalletActivity, inputWordsWalletActivity.f1750l.getText().toString());
    }
}
