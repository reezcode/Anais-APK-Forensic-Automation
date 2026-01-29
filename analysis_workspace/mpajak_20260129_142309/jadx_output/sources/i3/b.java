package i3;

import android.view.View;
import com.superbock.ui.AdWebActivity;
import com.tencent.smtt.sdk.WebView;

/* loaded from: classes21.dex */
public final class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdWebActivity f3314b;

    public b(AdWebActivity adWebActivity) {
        this.f3314b = adWebActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        AdWebActivity adWebActivity = this.f3314b;
        if (adWebActivity.f1517o && (webView = adWebActivity.f1511i) != null && webView.canGoBack()) {
            this.f3314b.f1511i.goBack();
            return;
        }
        if (this.f3314b.f1506d.getFeedBack() == 0) {
            this.f3314b.f1506d.setFeedBack(3);
        }
        this.f3314b.finish();
    }
}
