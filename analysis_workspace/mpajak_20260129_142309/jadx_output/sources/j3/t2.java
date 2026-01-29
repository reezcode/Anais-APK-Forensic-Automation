package j3;

import android.text.Editable;
import android.text.TextWatcher;
import com.superbock.ui.custom.InputWordsTronglobalActivity;

/* loaded from: classes14.dex */
public final class t2 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3568b;

    public t2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3568b = inputWordsTronglobalActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        InputWordsTronglobalActivity.a(this.f3568b);
    }
}
