package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes11.dex */
public final class h0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3491b;

    public h0(InputWordsImActivity inputWordsImActivity) {
        this.f3491b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsImActivity inputWordsImActivity = this.f3491b;
        InputWordsImActivity.b(inputWordsImActivity, inputWordsImActivity.f1589n.getText().toString());
    }
}
