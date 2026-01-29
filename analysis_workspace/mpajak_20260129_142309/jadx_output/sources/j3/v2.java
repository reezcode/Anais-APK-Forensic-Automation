package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronglobalActivity;

/* loaded from: classes18.dex */
public final class v2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3583b;

    public v2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3583b = inputWordsTronglobalActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3583b.onBackPressed();
    }
}
