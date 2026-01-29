package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes15.dex */
public final class y0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3599b;

    public y0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3599b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsMetaActivity inputWordsMetaActivity = this.f3599b;
        InputWordsMetaActivity.b(inputWordsMetaActivity, inputWordsMetaActivity.f1611m.getText().toString());
    }
}
