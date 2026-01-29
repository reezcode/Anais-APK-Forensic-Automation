package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes25.dex */
public final class w implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3586b;

    public w(InputWordsImActivity inputWordsImActivity) {
        this.f3586b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsImActivity inputWordsImActivity = this.f3586b;
        InputWordsImActivity.b(inputWordsImActivity, inputWordsImActivity.f1595t.getText().toString());
    }
}
