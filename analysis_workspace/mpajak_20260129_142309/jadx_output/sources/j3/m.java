package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes10.dex */
public final class m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3523b;

    public m(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3523b = inputWordsBinanceActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3523b.onBackPressed();
    }
}
