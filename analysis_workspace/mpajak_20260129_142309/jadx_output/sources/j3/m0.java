package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes18.dex */
public final class m0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3524b;

    public m0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3524b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsMetaActivity inputWordsMetaActivity = this.f3524b;
        InputWordsMetaActivity.b(inputWordsMetaActivity, inputWordsMetaActivity.f1617s.getText().toString());
    }
}
