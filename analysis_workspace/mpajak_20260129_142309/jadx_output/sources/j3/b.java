package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes4.dex */
public final class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3451b;

    public b(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3451b = inputWordsBinanceActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsBinanceActivity inputWordsBinanceActivity = this.f3451b;
        InputWordsBinanceActivity.b(inputWordsBinanceActivity, inputWordsBinanceActivity.f1569p.getText().toString());
    }
}
