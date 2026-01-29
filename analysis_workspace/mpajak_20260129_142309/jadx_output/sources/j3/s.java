package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes5.dex */
public final class s implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3559b;

    public s(InputWordsImActivity inputWordsImActivity) {
        this.f3559b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsImActivity inputWordsImActivity = this.f3559b;
        InputWordsImActivity.b(inputWordsImActivity, inputWordsImActivity.f1591p.getText().toString());
    }
}
