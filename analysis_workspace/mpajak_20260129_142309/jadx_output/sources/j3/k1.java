package j3;

import android.text.Editable;
import android.text.TextWatcher;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes4.dex */
public final class k1 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3510b;

    public k1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3510b = inputWordsOkxActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        InputWordsOkxActivity.a(this.f3510b);
    }
}
