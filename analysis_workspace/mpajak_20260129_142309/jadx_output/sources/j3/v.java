package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes12.dex */
public final class v implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3580b;

    public v(InputWordsImActivity inputWordsImActivity) {
        this.f3580b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsImActivity inputWordsImActivity = this.f3580b;
        InputWordsImActivity.b(inputWordsImActivity, inputWordsImActivity.f1594s.getText().toString());
    }
}
