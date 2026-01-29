package j3;

import android.view.View;
import com.superbock.ui.custom.InputWordsTronglobalActivity;

/* loaded from: classes4.dex */
public final class x2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputWordsTronglobalActivity f3595b;

    public x2(InputWordsTronglobalActivity inputWordsTronglobalActivity) {
        this.f3595b = inputWordsTronglobalActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InputWordsTronglobalActivity inputWordsTronglobalActivity = this.f3595b;
        InputWordsTronglobalActivity.b(inputWordsTronglobalActivity, inputWordsTronglobalActivity.f1680l.getText().toString());
    }
}
