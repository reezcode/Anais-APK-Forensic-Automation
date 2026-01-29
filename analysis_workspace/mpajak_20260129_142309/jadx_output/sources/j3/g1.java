package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes16.dex */
public final class g1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3486b;

    public g1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3486b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsOkxActivity inputWordsOkxActivity = this.f3486b;
        InputWordsOkxActivity.b(inputWordsOkxActivity, inputWordsOkxActivity.f1643u.getText().toString());
    }
}
