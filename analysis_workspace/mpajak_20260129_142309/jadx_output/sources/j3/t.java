package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes13.dex */
public final class t implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3565b;

    public t(InputWordsImActivity inputWordsImActivity) {
        this.f3565b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsImActivity inputWordsImActivity = this.f3565b;
        InputWordsImActivity.b(inputWordsImActivity, inputWordsImActivity.f1592q.getText().toString());
    }
}
