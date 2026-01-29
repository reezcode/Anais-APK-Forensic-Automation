package com.tencent.smtt.sdk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceError;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.export.external.proxy.X5ProxyWebViewClient;
import com.tencent.smtt.sdk.WebViewClient;

/* loaded from: classes15.dex */
class i extends X5ProxyWebViewClient {

    /* renamed from: c, reason: collision with root package name */
    private static String f2146c;

    /* renamed from: a, reason: collision with root package name */
    private WebViewClient f2147a;

    /* renamed from: b, reason: collision with root package name */
    private WebView f2148b;

    public i(IX5WebViewClient iX5WebViewClient, WebView webView, WebViewClient webViewClient) {
        super(iX5WebViewClient);
        this.f2148b = webView;
        this.f2147a = webViewClient;
        webViewClient.mX5Client = this;
    }

    public void a(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(this.f2148b.b(), 0, 0, str, bitmap);
    }

    public void a(String str) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(str));
        intent.addFlags(268435456);
        try {
            if (this.f2148b.getContext() != null) {
                this.f2148b.getContext().startActivity(intent);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient
    public void countPVContentCacheCallBack(String str) {
        this.f2148b.f2038a++;
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void doUpdateVisitedHistory(IX5WebViewBase iX5WebViewBase, String str, boolean z4) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.doUpdateVisitedHistory(this.f2148b, str, z4);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onDetectedBlankScreen(IX5WebViewBase iX5WebViewBase, String str, int i5) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onDetectedBlankScreen(str, i5);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onFormResubmission(IX5WebViewBase iX5WebViewBase, Message message, Message message2) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onFormResubmission(this.f2148b, message, message2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onLoadResource(IX5WebViewBase iX5WebViewBase, String str) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onLoadResource(this.f2148b, str);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageCommitVisible(IX5WebViewBase iX5WebViewBase, String str) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onPageCommitVisible(this.f2148b, str);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageFinished(IX5WebViewBase iX5WebViewBase, int i5, int i6, String str) {
        com.tencent.smtt.utils.p a5;
        TbsPrivacyAccess.rmPrivacyItemIfNeeded(iX5WebViewBase.getView().getContext().getApplicationContext());
        if (f2146c == null && (a5 = com.tencent.smtt.utils.p.a()) != null) {
            a5.a(false);
            f2146c = Boolean.toString(false);
        }
        this.f2148b.a(iX5WebViewBase);
        this.f2148b.f2038a++;
        this.f2147a.onPageFinished(this.f2148b, str);
        try {
            super.onPageFinished(iX5WebViewBase, i5, i6, str);
        } catch (Exception unused) {
        }
        WebView.c();
        if (!TbsShareManager.mHasQueried && this.f2148b.getContext() != null && TbsShareManager.isThirdPartyApp(this.f2148b.getContext()) && !QbSdk.d()) {
            TbsShareManager.mHasQueried = true;
            new Thread(new Runnable() { // from class: com.tencent.smtt.sdk.i.1
                @Override // java.lang.Runnable
                public void run() {
                    TbsDownloader.needDownload(i.this.f2148b.getContext(), false);
                }
            }).start();
        }
        if (this.f2148b.getContext() == null || TbsLogReport.getInstance(this.f2148b.getContext()).getShouldUploadEventReport()) {
            return;
        }
        TbsLogReport.getInstance(this.f2148b.getContext()).setShouldUploadEventReport(true);
        TbsLogReport.getInstance(this.f2148b.getContext()).dailyReport();
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageFinished(IX5WebViewBase iX5WebViewBase, String str) {
        onPageFinished(iX5WebViewBase, 0, 0, str);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageStarted(IX5WebViewBase iX5WebViewBase, int i5, int i6, String str, Bitmap bitmap) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onPageStarted(this.f2148b, str, bitmap);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onPageStarted(IX5WebViewBase iX5WebViewBase, String str, Bitmap bitmap) {
        onPageStarted(iX5WebViewBase, 0, 0, str, bitmap);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedClientCertRequest(IX5WebViewBase iX5WebViewBase, ClientCertRequest clientCertRequest) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onReceivedClientCertRequest(this.f2148b, clientCertRequest);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedError(IX5WebViewBase iX5WebViewBase, int i5, String str, String str2) {
        if (i5 < -15) {
            if (i5 != -17) {
                return;
            } else {
                i5 = -1;
            }
        }
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onReceivedError(this.f2148b, i5, str, str2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedError(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onReceivedError(this.f2148b, webResourceRequest, webResourceError);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedHttpAuthRequest(IX5WebViewBase iX5WebViewBase, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onReceivedHttpAuthRequest(this.f2148b, httpAuthHandler, str, str2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedHttpError(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onReceivedHttpError(this.f2148b, webResourceRequest, webResourceResponse);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedLoginRequest(IX5WebViewBase iX5WebViewBase, String str, String str2, String str3) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onReceivedLoginRequest(this.f2148b, str, str2, str3);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onReceivedSslError(IX5WebViewBase iX5WebViewBase, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onReceivedSslError(this.f2148b, sslErrorHandler, sslError);
    }

    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean onRenderProcessGone(IX5WebViewBase iX5WebViewBase, final boolean z4, final int i5) {
        return this.f2147a.onRenderProcessGone(this.f2148b, new WebViewClient.RenderProcessGoneDetail() { // from class: com.tencent.smtt.sdk.i.2
            @Override // com.tencent.smtt.sdk.WebViewClient.RenderProcessGoneDetail
            public boolean didCrash() {
                return z4;
            }

            @Override // com.tencent.smtt.sdk.WebViewClient.RenderProcessGoneDetail
            public int rendererPriorityAtExit() {
                return i5;
            }
        });
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onScaleChanged(IX5WebViewBase iX5WebViewBase, float f5, float f6) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onScaleChanged(this.f2148b, f5, f6);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onTooManyRedirects(IX5WebViewBase iX5WebViewBase, Message message, Message message2) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onTooManyRedirects(this.f2148b, message, message2);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public void onUnhandledKeyEvent(IX5WebViewBase iX5WebViewBase, KeyEvent keyEvent) {
        this.f2148b.a(iX5WebViewBase);
        this.f2147a.onUnhandledKeyEvent(this.f2148b, keyEvent);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest) {
        this.f2148b.a(iX5WebViewBase);
        return this.f2147a.shouldInterceptRequest(this.f2148b, webResourceRequest);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest, Bundle bundle) {
        this.f2148b.a(iX5WebViewBase);
        return this.f2147a.shouldInterceptRequest(this.f2148b, webResourceRequest, bundle);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public WebResourceResponse shouldInterceptRequest(IX5WebViewBase iX5WebViewBase, String str) {
        this.f2148b.a(iX5WebViewBase);
        return this.f2147a.shouldInterceptRequest(this.f2148b, str);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideKeyEvent(IX5WebViewBase iX5WebViewBase, KeyEvent keyEvent) {
        this.f2148b.a(iX5WebViewBase);
        return this.f2147a.shouldOverrideKeyEvent(this.f2148b, keyEvent);
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideUrlLoading(IX5WebViewBase iX5WebViewBase, WebResourceRequest webResourceRequest) {
        String uri = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? null : webResourceRequest.getUrl().toString();
        if (uri == null || this.f2148b.showDebugView(uri)) {
            return true;
        }
        this.f2148b.a(iX5WebViewBase);
        boolean shouldOverrideUrlLoading = this.f2147a.shouldOverrideUrlLoading(this.f2148b, webResourceRequest);
        if (!shouldOverrideUrlLoading) {
            if (uri.startsWith("wtai://wp/mc;")) {
                StringBuilder g5 = androidx.activity.d.g(WebView.SCHEME_TEL);
                g5.append(uri.substring(13));
                this.f2148b.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(g5.toString())));
                return true;
            }
            if (uri.startsWith(WebView.SCHEME_TEL)) {
                a(uri);
                return true;
            }
        }
        return shouldOverrideUrlLoading;
    }

    @Override // com.tencent.smtt.export.external.proxy.ProxyWebViewClient, com.tencent.smtt.export.external.interfaces.IX5WebViewClient
    public boolean shouldOverrideUrlLoading(IX5WebViewBase iX5WebViewBase, String str) {
        if (str == null || this.f2148b.showDebugView(str)) {
            return true;
        }
        this.f2148b.a(iX5WebViewBase);
        boolean shouldOverrideUrlLoading = this.f2147a.shouldOverrideUrlLoading(this.f2148b, str);
        if (!shouldOverrideUrlLoading) {
            if (str.startsWith("wtai://wp/mc;")) {
                StringBuilder g5 = androidx.activity.d.g(WebView.SCHEME_TEL);
                g5.append(str.substring(13));
                this.f2148b.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(g5.toString())));
                return true;
            }
            if (str.startsWith(WebView.SCHEME_TEL)) {
                a(str);
                return true;
            }
        }
        return shouldOverrideUrlLoading;
    }
}
