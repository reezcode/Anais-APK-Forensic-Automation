package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTpActivity;

/* loaded from: classes25.dex */
public final class b2 implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3454b;

    public b2(InputWordsTpActivity inputWordsTpActivity) {
        this.f3454b = inputWordsTpActivity;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            InputWordsTpActivity inputWordsTpActivity = this.f3454b;
            inputWordsTpActivity.f1651g.postDelayed(new z1(inputWordsTpActivity), 100L);
        }
    }
}
