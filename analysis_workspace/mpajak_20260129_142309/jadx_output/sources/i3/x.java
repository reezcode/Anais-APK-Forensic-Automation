package i3;

import android.view.View;
import com.superbock.ui.WebActivity;
import com.tencent.smtt.sdk.WebView;

/* loaded from: classes15.dex */
public final class x implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebActivity f3342b;

    public x(WebActivity webActivity) {
        this.f3342b = webActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView = this.f3342b.f1547d;
        if (webView == null || !webView.canGoBack()) {
            this.f3342b.finish();
        } else {
            this.f3342b.f1547d.goBack();
        }
    }
}
