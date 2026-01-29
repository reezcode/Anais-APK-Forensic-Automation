package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes12.dex */
public final class z4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3609b;

    public z4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3609b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsWalletActivity inputWordsWalletActivity = this.f3609b;
        InputWordsWalletActivity.b(inputWordsWalletActivity, inputWordsWalletActivity.f1752n.getText().toString());
    }
}
