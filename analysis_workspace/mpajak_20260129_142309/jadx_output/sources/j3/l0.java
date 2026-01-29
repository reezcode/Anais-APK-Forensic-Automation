package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes2.dex */
public final class l0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3516b;

    public l0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3516b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsMetaActivity inputWordsMetaActivity = this.f3516b;
        InputWordsMetaActivity.b(inputWordsMetaActivity, inputWordsMetaActivity.f1616r.getText().toString());
    }
}
