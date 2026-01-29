package i3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.superbock.ui.WebActivity;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class z extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebActivity f3344a;

    public z(WebActivity webActivity) {
        this.f3344a = webActivity;
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f3344a.f1546c.setVisibility(0);
        this.f3344a.f1546c.setAlpha(1.0f);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        super.onReceivedError(webView, i5, str, str2);
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(WebView.SCHEME_TEL) || str.startsWith("mailto:") || str.startsWith("https://t.me/") || str.startsWith("https://wa.me/") || str.startsWith("https://api.whatsapp.com/send") || str.startsWith("whatsapp:") || str.contains("adLinkFlag=1")) {
            try {
                this.f3344a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused) {
            }
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", this.f3344a.f1552i);
        webView.loadUrl(str, hashMap);
        return true;
    }
}
