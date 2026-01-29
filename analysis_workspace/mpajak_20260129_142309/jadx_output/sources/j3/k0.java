package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes24.dex */
public final class k0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3509b;

    public k0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3509b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsMetaActivity inputWordsMetaActivity = this.f3509b;
        InputWordsMetaActivity.b(inputWordsMetaActivity, inputWordsMetaActivity.f1615q.getText().toString());
    }
}
