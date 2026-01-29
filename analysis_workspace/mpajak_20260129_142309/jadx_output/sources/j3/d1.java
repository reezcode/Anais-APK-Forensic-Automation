package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes2.dex */
public final class d1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3466b;

    public d1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3466b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsOkxActivity inputWordsOkxActivity = this.f3466b;
        InputWordsOkxActivity.b(inputWordsOkxActivity, inputWordsOkxActivity.f1640r.getText().toString());
    }
}
