package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes9.dex */
public final class c1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3460b;

    public c1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3460b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsOkxActivity inputWordsOkxActivity = this.f3460b;
        InputWordsOkxActivity.b(inputWordsOkxActivity, inputWordsOkxActivity.f1639q.getText().toString());
    }
}
