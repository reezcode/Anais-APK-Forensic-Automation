package i3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.superbock.ui.AdWebActivity;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
import java.util.HashMap;

/* loaded from: classes20.dex */
public final class g extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdWebActivity f3325a;

    public g(AdWebActivity adWebActivity) {
        this.f3325a = adWebActivity;
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f3325a.f1510h.setVisibility(0);
        this.f3325a.f1510h.setAlpha(1.0f);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        super.onReceivedError(webView, i5, str, str2);
    }

    @Override // com.tencent.smtt.sdk.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith(WebView.SCHEME_TEL) && !str.startsWith("mailto:") && !str.startsWith("https://t.me/") && !str.startsWith("https://wa.me/") && !str.startsWith("https://api.whatsapp.com/send") && !str.startsWith("whatsapp:") && !str.contains("adLinkFlag=1")) {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", this.f3325a.f1515m);
            webView.loadUrl(str, hashMap);
            return true;
        }
        if (str.contains("adLinkFlag=1")) {
            StringBuilder g5 = androidx.activity.d.g(str);
            g5.append(str.contains("?") ? "&" : "?");
            g5.append("reid=");
            g5.append(this.f3325a.f1506d.getReceiptId());
            str = g5.toString();
        }
        try {
            this.f3325a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            this.f3325a.f1506d.setUrl(str);
        } catch (Exception unused) {
        }
        this.f3325a.f1506d.setFeedBack(2);
        this.f3325a.finish();
        return true;
    }
}
