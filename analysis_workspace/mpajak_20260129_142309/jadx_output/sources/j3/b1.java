package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes21.dex */
public final class b1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3453b;

    public b1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3453b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsOkxActivity inputWordsOkxActivity = this.f3453b;
        InputWordsOkxActivity.b(inputWordsOkxActivity, inputWordsOkxActivity.f1638p.getText().toString());
    }
}
