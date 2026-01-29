package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronlinkActivity;

/* loaded from: classes5.dex */
public final class j3 implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronlinkActivity f3506b;

    public j3(InputWordsTronlinkActivity inputWordsTronlinkActivity) {
        this.f3506b = inputWordsTronlinkActivity;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        if (z4) {
            InputWordsTronlinkActivity inputWordsTronlinkActivity = this.f3506b;
            inputWordsTronlinkActivity.f1698g.postDelayed(new h3(inputWordsTronlinkActivity), 100L);
        }
    }
}
