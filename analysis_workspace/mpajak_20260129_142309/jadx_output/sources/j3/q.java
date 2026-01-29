package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes23.dex */
public final class q implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3547b;

    public q(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3547b = inputWordsBinanceActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsBinanceActivity inputWordsBinanceActivity = this.f3547b;
        InputWordsBinanceActivity.b(inputWordsBinanceActivity, inputWordsBinanceActivity.f1567n.getText().toString());
    }
}
