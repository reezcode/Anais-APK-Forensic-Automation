package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes9.dex */
public final class p implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3541b;

    public p(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3541b = inputWordsBinanceActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsBinanceActivity inputWordsBinanceActivity = this.f3541b;
        InputWordsBinanceActivity.b(inputWordsBinanceActivity, inputWordsBinanceActivity.f1566m.getText().toString());
    }
}
