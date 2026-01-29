package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes14.dex */
public final class l4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3522b;

    public l4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3522b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsWalletActivity inputWordsWalletActivity = this.f3522b;
        InputWordsWalletActivity.b(inputWordsWalletActivity, inputWordsWalletActivity.f1755q.getText().toString());
    }
}
