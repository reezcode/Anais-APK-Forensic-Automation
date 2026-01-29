package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes15.dex */
public final class e1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3474b;

    public e1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3474b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsOkxActivity inputWordsOkxActivity = this.f3474b;
        InputWordsOkxActivity.b(inputWordsOkxActivity, inputWordsOkxActivity.f1641s.getText().toString());
    }
}
