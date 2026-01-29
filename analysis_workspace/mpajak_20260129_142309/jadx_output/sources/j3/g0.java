package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes10.dex */
public final class g0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3485b;

    public g0(InputWordsImActivity inputWordsImActivity) {
        this.f3485b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsImActivity inputWordsImActivity = this.f3485b;
        InputWordsImActivity.b(inputWordsImActivity, inputWordsImActivity.f1588m.getText().toString());
    }
}
