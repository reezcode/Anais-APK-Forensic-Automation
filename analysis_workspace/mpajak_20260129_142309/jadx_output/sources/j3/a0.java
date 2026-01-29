package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;

/* loaded from: classes4.dex */
public final class a0 implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3446b;

    public a0(InputWordsImActivity inputWordsImActivity) {
        this.f3446b = inputWordsImActivity;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            InputWordsImActivity inputWordsImActivity = this.f3446b;
            inputWordsImActivity.f1582g.postDelayed(new y(inputWordsImActivity), 100L);
        }
    }
}
