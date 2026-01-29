package j3;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.superbock.ui.custom.InputWordsImActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes4.dex */
public final class e0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsImActivity f3473b;

    public e0(InputWordsImActivity inputWordsImActivity) {
        this.f3473b = inputWordsImActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f3473b.getString(R.string.Learn_about_Mnemonic_Link)));
        this.f3473b.startActivity(intent);
    }
}
