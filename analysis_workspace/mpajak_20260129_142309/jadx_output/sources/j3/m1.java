package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes6.dex */
public final class m1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3525b;

    public m1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3525b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3525b.onBackPressed();
    }
}
