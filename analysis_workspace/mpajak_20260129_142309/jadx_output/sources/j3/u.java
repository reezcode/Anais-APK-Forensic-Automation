package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes19.dex */
public final class u implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3571b;

    public u(InputWordsImActivity inputWordsImActivity) {
        this.f3571b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsImActivity inputWordsImActivity = this.f3571b;
        InputWordsImActivity.b(inputWordsImActivity, inputWordsImActivity.f1593r.getText().toString());
    }
}
