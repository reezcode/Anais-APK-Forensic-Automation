package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes6.dex */
public final class n0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3530b;

    public n0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3530b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsMetaActivity inputWordsMetaActivity = this.f3530b;
        InputWordsMetaActivity.b(inputWordsMetaActivity, inputWordsMetaActivity.f1618t.getText().toString());
    }
}
