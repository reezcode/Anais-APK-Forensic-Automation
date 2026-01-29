package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTpActivity;

/* loaded from: classes11.dex */
public final class e2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTpActivity f3475b;

    public e2(InputWordsTpActivity inputWordsTpActivity) {
        this.f3475b = inputWordsTpActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3475b.onBackPressed();
    }
}
