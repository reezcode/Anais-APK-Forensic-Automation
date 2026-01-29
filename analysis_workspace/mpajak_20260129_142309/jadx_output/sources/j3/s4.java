package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes16.dex */
public final class s4 implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3564b;

    public s4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3564b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            InputWordsWalletActivity inputWordsWalletActivity = this.f3564b;
            inputWordsWalletActivity.f1745g.postDelayed(new q4(inputWordsWalletActivity), 100L);
        }
    }
}
