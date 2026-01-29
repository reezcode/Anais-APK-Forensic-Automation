package i3;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.animation.DecelerateInterpolator;
import com.superbock.ui.AdWebActivity;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebView;

/* loaded from: classes8.dex */
public final class h extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdWebActivity f3326a;

    public h(AdWebActivity adWebActivity) {
        this.f3326a = adWebActivity;
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final void onProgressChanged(WebView webView, int i5) {
        AdWebActivity adWebActivity = this.f3326a;
        adWebActivity.f1513k = adWebActivity.f1510h.getProgress();
        if (i5 >= 100) {
            AdWebActivity adWebActivity2 = this.f3326a;
            if (!adWebActivity2.f1512j) {
                adWebActivity2.f1512j = true;
                adWebActivity2.f1510h.setProgress(i5);
                AdWebActivity adWebActivity3 = this.f3326a;
                int progress = adWebActivity3.f1510h.getProgress();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adWebActivity3.f1510h, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(1500L);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.addUpdateListener(new j(adWebActivity3, progress));
                ofFloat.addListener(new a(adWebActivity3));
                ofFloat.start();
                return;
            }
        }
        AdWebActivity adWebActivity4 = this.f3326a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(adWebActivity4.f1510h, "progress", adWebActivity4.f1513k, i5);
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
        this.f3326a.f1508f.setText(str);
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AdWebActivity adWebActivity = this.f3326a;
        adWebActivity.f1519q = valueCallback;
        AdWebActivity.c(adWebActivity);
        return true;
    }

    @Override // com.tencent.smtt.sdk.WebChromeClient
    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        AdWebActivity adWebActivity = this.f3326a;
        adWebActivity.f1518p = valueCallback;
        AdWebActivity.c(adWebActivity);
    }
}
