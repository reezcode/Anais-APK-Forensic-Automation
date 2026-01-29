package j3;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.superbock.ui.custom.InputWordsTpActivity;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes9.dex */
public final class g2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3487b;

    public g2(InputWordsTpActivity inputWordsTpActivity) {
        this.f3487b = inputWordsTpActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f3487b.getString(R.string.Read_agree_with_link)));
        this.f3487b.startActivity(intent);
    }
}
