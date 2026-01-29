package i3;

import android.view.View;
import com.superbock.ui.AdWebActivity;

/* loaded from: classes24.dex */
public final class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdWebActivity f3319b;

    public d(AdWebActivity adWebActivity) {
        this.f3319b = adWebActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f3319b.f1506d.getFeedBack() == 0) {
            this.f3319b.f1506d.setFeedBack(3);
        }
        this.f3319b.finish();
    }
}
