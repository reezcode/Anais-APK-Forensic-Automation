package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;

/* loaded from: classes15.dex */
public final class v0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3581b;

    public v0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3581b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3581b.onBackPressed();
    }
}
