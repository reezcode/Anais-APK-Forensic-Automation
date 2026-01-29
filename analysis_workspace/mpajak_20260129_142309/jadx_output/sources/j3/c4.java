package j3;

import android.text.Editable;
import android.text.TextWatcher;
import com.superbock.ui.custom.InputWordsTrustActivity;

/* loaded from: classes24.dex */
public final class c4 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTrustActivity f3463b;

    public c4(InputWordsTrustActivity inputWordsTrustActivity) {
        this.f3463b = inputWordsTrustActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        InputWordsTrustActivity.a(this.f3463b);
    }
}
