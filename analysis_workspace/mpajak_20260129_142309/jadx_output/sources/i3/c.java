package i3;

import android.view.View;
import com.superbock.ui.AdWebActivity;

/* loaded from: classes22.dex */
public final class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdWebActivity f3316b;

    public c(AdWebActivity adWebActivity) {
        this.f3316b = adWebActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f3316b.f1506d.getFeedBack() == 0) {
            this.f3316b.f1506d.setFeedBack(3);
        }
        this.f3316b.finish();
    }
}
