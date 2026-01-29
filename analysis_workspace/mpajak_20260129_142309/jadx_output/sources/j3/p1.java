package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes23.dex */
public final class p1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3543b;

    public p1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3543b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsOkxActivity inputWordsOkxActivity = this.f3543b;
        InputWordsOkxActivity.b(inputWordsOkxActivity, inputWordsOkxActivity.f1635m.getText().toString());
    }
}
