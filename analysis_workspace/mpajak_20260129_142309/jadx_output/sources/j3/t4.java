package j3;

import android.text.Editable;
import android.text.TextWatcher;
import com.superbock.ui.custom.InputWordsWalletActivity;

/* loaded from: classes21.dex */
public final class t4 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsWalletActivity f3570b;

    public t4(InputWordsWalletActivity inputWordsWalletActivity) {
        this.f3570b = inputWordsWalletActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        InputWordsWalletActivity.a(this.f3570b);
    }
}
