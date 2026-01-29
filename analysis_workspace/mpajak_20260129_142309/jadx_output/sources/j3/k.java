package j3;

import android.text.Editable;
import android.text.TextWatcher;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes19.dex */
public final class k implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3508b;

    public k(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3508b = inputWordsBinanceActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        InputWordsBinanceActivity.a(this.f3508b);
    }
}
