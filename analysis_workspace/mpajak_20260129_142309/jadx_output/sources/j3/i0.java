package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes8.dex */
public final class i0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3497b;

    public i0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3497b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsMetaActivity inputWordsMetaActivity = this.f3497b;
        InputWordsMetaActivity.b(inputWordsMetaActivity, inputWordsMetaActivity.f1613o.getText().toString());
    }
}
