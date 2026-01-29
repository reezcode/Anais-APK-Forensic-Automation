package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes9.dex */
public final class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3535b;

    public o(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3535b = inputWordsBinanceActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsBinanceActivity inputWordsBinanceActivity = this.f3535b;
        InputWordsBinanceActivity.b(inputWordsBinanceActivity, inputWordsBinanceActivity.f1565l.getText().toString());
    }
}
