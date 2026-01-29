package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes20.dex */
public final class f0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3479b;

    public f0(InputWordsImActivity inputWordsImActivity) {
        this.f3479b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsImActivity inputWordsImActivity = this.f3479b;
        InputWordsImActivity.b(inputWordsImActivity, inputWordsImActivity.f1587l.getText().toString());
    }
}
