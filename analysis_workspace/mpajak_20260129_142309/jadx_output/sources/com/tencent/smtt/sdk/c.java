package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.view.View;
import android.webkit.WebChromeClient;
import com.tencent.smtt.sdk.SystemWebChromeClient;

/* loaded from: classes14.dex */
class c extends SystemWebChromeClient {
    public c(WebView webView, WebChromeClient webChromeClient) {
        super(webView, webChromeClient);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onHideCustomView() {
        this.f1846a.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(14)
    @Deprecated
    public void onShowCustomView(View view, int i5, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f1846a.onShowCustomView(view, i5, new SystemWebChromeClient.b(customViewCallback));
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f1846a.onShowCustomView(view, new SystemWebChromeClient.b(customViewCallback));
    }
}
