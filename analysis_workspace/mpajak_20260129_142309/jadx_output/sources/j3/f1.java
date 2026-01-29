package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes16.dex */
public final class f1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3480b;

    public f1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3480b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsOkxActivity inputWordsOkxActivity = this.f3480b;
        InputWordsOkxActivity.b(inputWordsOkxActivity, inputWordsOkxActivity.f1642t.getText().toString());
    }
}
