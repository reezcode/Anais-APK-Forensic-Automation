package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes10.dex */
public final class v4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3585b;

    public v4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3585b = inputWordsWalletActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3585b.onBackPressed();
    }
}
