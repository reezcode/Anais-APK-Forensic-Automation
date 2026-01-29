package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes2.dex */
public final class o1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3537b;

    public o1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3537b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsOkxActivity inputWordsOkxActivity = this.f3537b;
        InputWordsOkxActivity.b(inputWordsOkxActivity, inputWordsOkxActivity.f1634l.getText().toString());
    }
}
