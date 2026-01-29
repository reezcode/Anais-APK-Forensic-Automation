package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes21.dex */
public final class o0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3536b;

    public o0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3536b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsMetaActivity inputWordsMetaActivity = this.f3536b;
        InputWordsMetaActivity.b(inputWordsMetaActivity, inputWordsMetaActivity.f1619u.getText().toString());
    }
}
