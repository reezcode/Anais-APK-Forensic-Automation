package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes4.dex */
public final class j0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3503b;

    public j0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3503b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsMetaActivity inputWordsMetaActivity = this.f3503b;
        InputWordsMetaActivity.b(inputWordsMetaActivity, inputWordsMetaActivity.f1614p.getText().toString());
    }
}
