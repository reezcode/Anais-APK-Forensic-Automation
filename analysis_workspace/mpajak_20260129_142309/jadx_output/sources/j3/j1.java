package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsOkxActivity;

/* loaded from: classes5.dex */
public final class j1 implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsOkxActivity f3504b;

    public j1(InputWordsOkxActivity inputWordsOkxActivity) {
        this.f3504b = inputWordsOkxActivity;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            InputWordsOkxActivity inputWordsOkxActivity = this.f3504b;
            inputWordsOkxActivity.f1629g.postDelayed(new h1(inputWordsOkxActivity), 100L);
        }
    }
}
