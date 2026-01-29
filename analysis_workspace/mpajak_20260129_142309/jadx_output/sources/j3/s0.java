package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes6.dex */
public final class s0 implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3560b;

    public s0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3560b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            InputWordsMetaActivity inputWordsMetaActivity = this.f3560b;
            inputWordsMetaActivity.f1605g.postDelayed(new q0(inputWordsMetaActivity), 100L);
        }
    }
}
