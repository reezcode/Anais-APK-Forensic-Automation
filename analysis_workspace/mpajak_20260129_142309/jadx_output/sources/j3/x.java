package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes15.dex */
public final class x implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3592b;

    public x(InputWordsImActivity inputWordsImActivity) {
        this.f3592b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsImActivity inputWordsImActivity = this.f3592b;
        InputWordsImActivity.b(inputWordsImActivity, inputWordsImActivity.f1596u.getText().toString());
    }
}
