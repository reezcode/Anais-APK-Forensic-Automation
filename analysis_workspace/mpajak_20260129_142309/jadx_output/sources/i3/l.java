package i3;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.animation.DecelerateInterpolator;
import com.superbock.ui.AdWebSmallActivity;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;

/* loaded from: classes8.dex */
public final class l extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdWebSmallActivity f3331a;

    public l(AdWebSmallActivity adWebSmallActivity) {
        this.f3331a = adWebSmallActivity;
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final void onProgressChanged(WebView webView, int i5) {
        AdWebSmallActivity adWebSmallActivity = this.f3331a;
        adWebSmallActivity.f1527i = adWebSmallActivity.f1524f.getProgress();
        if (i5 >= 100) {
            AdWebSmallActivity adWebSmallActivity2 = this.f3331a;
            if (!adWebSmallActivity2.f1526h) {
                adWebSmallActivity2.f1526h = true;
                adWebSmallActivity2.f1524f.setProgress(i5);
                AdWebSmallActivity adWebSmallActivity3 = this.f3331a;
                int progress = adWebSmallActivity3.f1524f.getProgress();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adWebSmallActivity3.f1524f, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(1500L);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.addUpdateListener(new n(adWebSmallActivity3, progress));
                ofFloat.addListener(new o(adWebSmallActivity3));
                ofFloat.start();
                return;
            }
        }
        AdWebSmallActivity adWebSmallActivity4 = this.f3331a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(adWebSmallActivity4.f1524f, "progress", adWebSmallActivity4.f1527i, i5);
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
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AdWebSmallActivity adWebSmallActivity = this.f3331a;
        adWebSmallActivity.f1531m = valueCallback;
        AdWebSmallActivity.a(adWebSmallActivity);
        return true;
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        AdWebSmallActivity adWebSmallActivity = this.f3331a;
        adWebSmallActivity.f1530l = valueCallback;
        AdWebSmallActivity.a(adWebSmallActivity);
    }
}
