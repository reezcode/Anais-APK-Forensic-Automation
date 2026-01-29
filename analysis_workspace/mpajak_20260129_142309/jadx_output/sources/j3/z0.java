package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes20.dex */
public final class z0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3605b;

    public z0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3605b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsMetaActivity inputWordsMetaActivity = this.f3605b;
        InputWordsMetaActivity.b(inputWordsMetaActivity, inputWordsMetaActivity.f1612n.getText().toString());
    }
}
