package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsBinanceActivity;

/* loaded from: classes15.dex */
public final class j implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsBinanceActivity f3502b;

    public j(InputWordsBinanceActivity inputWordsBinanceActivity) {
        this.f3502b = inputWordsBinanceActivity;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            InputWordsBinanceActivity inputWordsBinanceActivity = this.f3502b;
            inputWordsBinanceActivity.f1560g.postDelayed(new h(inputWordsBinanceActivity), 100L);
        }
    }
}
