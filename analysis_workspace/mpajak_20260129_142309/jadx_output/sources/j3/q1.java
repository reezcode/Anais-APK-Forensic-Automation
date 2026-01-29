package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes17.dex */
public final class q1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3549b;

    public q1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3549b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsOkxActivity inputWordsOkxActivity = this.f3549b;
        InputWordsOkxActivity.b(inputWordsOkxActivity, inputWordsOkxActivity.f1636n.getText().toString());
    }
}
