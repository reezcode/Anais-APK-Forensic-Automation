package i3;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.animation.DecelerateInterpolator;
import com.superbock.ui.WebActivity;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;

/* loaded from: classes18.dex */
public final class a0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebActivity f3313a;

    public a0(WebActivity webActivity) {
        this.f3313a = webActivity;
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final void onProgressChanged(WebView webView, int i5) {
        WebActivity webActivity = this.f3313a;
        webActivity.f1549f = webActivity.f1546c.getProgress();
        if (i5 >= 100) {
            WebActivity webActivity2 = this.f3313a;
            if (!webActivity2.f1548e) {
                webActivity2.f1548e = true;
                webActivity2.f1546c.setProgress(i5);
                WebActivity webActivity3 = this.f3313a;
                int progress = webActivity3.f1546c.getProgress();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(webActivity3.f1546c, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(1500L);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.addUpdateListener(new c0(webActivity3, progress));
                ofFloat.addListener(new d0(webActivity3));
                ofFloat.start();
                return;
            }
        }
        WebActivity webActivity4 = this.f3313a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(webActivity4.f1546c, "progress", webActivity4.f1549f, i5);
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        this.f3313a.f1545b.setText(str);
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        WebActivity webActivity = this.f3313a;
        webActivity.f1554k = valueCallback;
        WebActivity.c(webActivity);
        return true;
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        WebActivity webActivity = this.f3313a;
        webActivity.f1553j = valueCallback;
        WebActivity.c(webActivity);
    }
}
