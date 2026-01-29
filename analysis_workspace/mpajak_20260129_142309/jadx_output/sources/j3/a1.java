package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes3.dex */
public final class a1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3447b;

    public a1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3447b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsOkxActivity inputWordsOkxActivity = this.f3447b;
        InputWordsOkxActivity.b(inputWordsOkxActivity, inputWordsOkxActivity.f1637o.getText().toString());
    }
}
