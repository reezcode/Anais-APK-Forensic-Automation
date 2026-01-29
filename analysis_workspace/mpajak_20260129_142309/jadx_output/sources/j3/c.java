package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes21.dex */
public final class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3457b;

    public c(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3457b = inputWordsBinanceActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsBinanceActivity inputWordsBinanceActivity = this.f3457b;
        InputWordsBinanceActivity.b(inputWordsBinanceActivity, inputWordsBinanceActivity.f1570q.getText().toString());
    }
}
