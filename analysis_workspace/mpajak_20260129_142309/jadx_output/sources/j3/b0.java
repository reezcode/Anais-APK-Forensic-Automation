package j3;

import android.text.Editable;
import android.text.TextWatcher;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes8.dex */
public final class b0 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3452b;

    public b0(InputWordsImActivity inputWordsImActivity) {
        this.f3452b = inputWordsImActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        InputWordsImActivity.a(this.f3452b);
    }
}
