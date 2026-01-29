package j3;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.superbock.ui.custom.InputWordsMetaActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes3.dex */
public final class x0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsMetaActivity f3593b;

    public x0(InputWordsMetaActivity inputWordsMetaActivity) {
        this.f3593b = inputWordsMetaActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f3593b.getString(R.string.agree_Terms_and_Conditions_Link)));
        this.f3593b.startActivity(intent);
    }
}
