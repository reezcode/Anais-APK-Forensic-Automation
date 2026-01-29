package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes25.dex */
public final class p0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3542b;

    public p0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3542b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsMetaActivity inputWordsMetaActivity = this.f3542b;
        InputWordsMetaActivity.b(inputWordsMetaActivity, inputWordsMetaActivity.f1620v.getText().toString());
    }
}
