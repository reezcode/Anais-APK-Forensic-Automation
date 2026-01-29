package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes11.dex */
public final class r implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3553b;

    public r(InputWordsImActivity inputWordsImActivity) {
        this.f3553b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsImActivity inputWordsImActivity = this.f3553b;
        InputWordsImActivity.b(inputWordsImActivity, inputWordsImActivity.f1590o.getText().toString());
    }
}
