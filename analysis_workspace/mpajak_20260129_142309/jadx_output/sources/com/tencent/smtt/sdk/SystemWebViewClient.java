package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import com.tencent.smtt.export.external.interfaces.ClientCertRequest;
import com.tencent.smtt.export.external.interfaces.HttpAuthHandler;
import com.tencent.smtt.export.external.interfaces.SslError;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.WebViewClient;
import java.io.InputStream;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Map;

@SuppressLint({"NewApi", "Override"})
/* loaded from: classes12.dex */
class SystemWebViewClient extends android.webkit.WebViewClient {

    /* renamed from: c, reason: collision with root package name */
    private static String f1877c;

    /* renamed from: a, reason: collision with root package name */
    private WebViewClient f1878a;

    /* renamed from: b, reason: collision with root package name */
    private WebView f1879b;

    /* loaded from: classes4.dex */
    public static class a extends ClientCertRequest {

        /* renamed from: a, reason: collision with root package name */
        private android.webkit.ClientCertRequest f1885a;

        public a(android.webkit.ClientCertRequest clientCertRequest) {
            this.f1885a = clientCertRequest;
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public void cancel() {
            this.f1885a.cancel();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public String getHost() {
            return this.f1885a.getHost();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public String[] getKeyTypes() {
            return this.f1885a.getKeyTypes();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public int getPort() {
            return this.f1885a.getPort();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public Principal[] getPrincipals() {
            return this.f1885a.getPrincipals();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public void ignore() {
            this.f1885a.ignore();
        }

        @Override // com.tencent.smtt.export.external.interfaces.ClientCertRequest
        public void proceed(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.f1885a.proceed(privateKey, x509CertificateArr);
        }
    }

    /* loaded from: classes19.dex */
    public static class b implements HttpAuthHandler {

        /* renamed from: a, reason: collision with root package name */
        private android.webkit.HttpAuthHandler f1886a;

        public b(android.webkit.HttpAuthHandler httpAuthHandler) {
            this.f1886a = httpAuthHandler;
        }

        @Override // com.tencent.smtt.export.external.interfaces.HttpAuthHandler
        public void cancel() {
            this.f1886a.cancel();
        }

        @Override // com.tencent.smtt.export.external.interfaces.HttpAuthHandler
        public void proceed(String str, String str2) {
            this.f1886a.proceed(str, str2);
        }

        @Override // com.tencent.smtt.export.external.interfaces.HttpAuthHandler
        public boolean useHttpAuthUsernamePassword() {
            return this.f1886a.useHttpAuthUsernamePassword();
        }
    }

    /* loaded from: classes23.dex */
    public static class c implements SslErrorHandler {

        /* renamed from: a, reason: collision with root package name */
        public android.webkit.SslErrorHandler f1887a;

        public c(android.webkit.SslErrorHandler sslErrorHandler) {
            this.f1887a = sslErrorHandler;
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslErrorHandler
        public void cancel() {
            this.f1887a.cancel();
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslErrorHandler
        public void proceed() {
            this.f1887a.proceed();
        }
    }

    /* loaded from: classes3.dex */
    public static class d implements SslError {

        /* renamed from: a, reason: collision with root package name */
        public android.net.http.SslError f1888a;

        public d(android.net.http.SslError sslError) {
            this.f1888a = sslError;
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public boolean addError(int i5) {
            return this.f1888a.addError(i5);
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public SslCertificate getCertificate() {
            return this.f1888a.getCertificate();
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public int getPrimaryError() {
            return this.f1888a.getPrimaryError();
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public String getUrl() {
            return this.f1888a.getUrl();
        }

        @Override // com.tencent.smtt.export.external.interfaces.SslError
        public boolean hasError(int i5) {
            return this.f1888a.hasError(i5);
        }
    }

    /* loaded from: classes15.dex */
    public static class e implements WebResourceRequest {

        /* renamed from: a, reason: collision with root package name */
        private String f1889a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f1890b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1891c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1892d;

        /* renamed from: e, reason: collision with root package name */
        private String f1893e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f1894f;

        public e(String str, boolean z4, boolean z5, boolean z6, String str2, Map<String, String> map) {
            this.f1889a = str;
            this.f1890b = z4;
            this.f1891c = z5;
            this.f1892d = z6;
            this.f1893e = str2;
            this.f1894f = map;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public String getMethod() {
            return this.f1893e;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Map<String, String> getRequestHeaders() {
            return this.f1894f;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Uri getUrl() {
            return Uri.parse(this.f1889a);
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean hasGesture() {
            return this.f1892d;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean isForMainFrame() {
            return this.f1890b;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean isRedirect() {
            return this.f1891c;
        }
    }

    /* loaded from: classes11.dex */
    public static class f implements WebResourceRequest {

        /* renamed from: a, reason: collision with root package name */
        public android.webkit.WebResourceRequest f1895a;

        public f(android.webkit.WebResourceRequest webResourceRequest) {
            this.f1895a = webResourceRequest;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public String getMethod() {
            return this.f1895a.getMethod();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Map<String, String> getRequestHeaders() {
            return this.f1895a.getRequestHeaders();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public Uri getUrl() {
            return this.f1895a.getUrl();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean hasGesture() {
            return this.f1895a.hasGesture();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean isForMainFrame() {
            return this.f1895a.isForMainFrame();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceRequest
        public boolean isRedirect() {
            if (Build.VERSION.SDK_INT >= 24) {
                Object a5 = com.tencent.smtt.utils.j.a(this.f1895a, "isRedirect");
                if (a5 instanceof Boolean) {
                    return ((Boolean) a5).booleanValue();
                }
            }
            return false;
        }
    }

    /* loaded from: classes18.dex */
    public static class g extends WebResourceResponse {

        /* renamed from: a, reason: collision with root package name */
        public android.webkit.WebResourceResponse f1896a;

        public g(android.webkit.WebResourceResponse webResourceResponse) {
            this.f1896a = webResourceResponse;
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public InputStream getData() {
            return this.f1896a.getData();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public String getEncoding() {
            return this.f1896a.getEncoding();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public String getMimeType() {
            return this.f1896a.getMimeType();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public String getReasonPhrase() {
            return this.f1896a.getReasonPhrase();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public Map<String, String> getResponseHeaders() {
            return this.f1896a.getResponseHeaders();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public int getStatusCode() {
            return this.f1896a.getStatusCode();
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setData(InputStream inputStream) {
            this.f1896a.setData(inputStream);
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setEncoding(String str) {
            this.f1896a.setEncoding(str);
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setMimeType(String str) {
            this.f1896a.setMimeType(str);
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setResponseHeaders(Map<String, String> map) {
            this.f1896a.setResponseHeaders(map);
        }

        @Override // com.tencent.smtt.export.external.interfaces.WebResourceResponse
        public void setStatusCodeAndReasonPhrase(int i5, String str) {
            this.f1896a.setStatusCodeAndReasonPhrase(i5, str);
        }
    }

    public SystemWebViewClient(WebView webView, WebViewClient webViewClient) {
        this.f1879b = webView;
        this.f1878a = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(android.webkit.WebView webView, String str, boolean z4) {
        this.f1879b.a(webView);
        this.f1878a.doUpdateVisitedHistory(this.f1879b, str, z4);
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(android.webkit.WebView webView, Message message, Message message2) {
        this.f1879b.a(webView);
        this.f1878a.onFormResubmission(this.f1879b, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, String str) {
        this.f1879b.a(webView);
        this.f1878a.onLoadResource(this.f1879b, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(android.webkit.WebView webView, String str) {
        this.f1879b.a(webView);
        this.f1878a.onPageCommitVisible(this.f1879b, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, String str) {
        com.tencent.smtt.utils.p a5;
        TbsPrivacyAccess.rmPrivacyItemIfNeeded(webView.getContext().getApplicationContext());
        if (f1877c == null && (a5 = com.tencent.smtt.utils.p.a()) != null) {
            a5.a(true);
            f1877c = Boolean.toString(true);
        }
        this.f1879b.a(webView);
        this.f1879b.f2038a++;
        this.f1878a.onPageFinished(this.f1879b, str);
        WebView.c();
        if (!TbsShareManager.mHasQueried && this.f1879b.getContext() != null && TbsShareManager.isThirdPartyApp(this.f1879b.getContext()) && !QbSdk.d()) {
            TbsShareManager.mHasQueried = true;
            new Thread(new Runnable() { // from class: com.tencent.smtt.sdk.SystemWebViewClient.1
                @Override // java.lang.Runnable
                public void run() {
                    TbsDownloader.needDownload(SystemWebViewClient.this.f1879b.getContext(), false);
                }
            }).start();
        }
        if (this.f1879b.getContext() == null || TbsLogReport.getInstance(this.f1879b.getContext()).getShouldUploadEventReport()) {
            return;
        }
        TbsLogReport.getInstance(this.f1879b.getContext()).setShouldUploadEventReport(true);
        TbsLogReport.getInstance(this.f1879b.getContext()).dailyReport();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, String str, Bitmap bitmap) {
        this.f1879b.a(webView);
        this.f1878a.onPageStarted(this.f1879b, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(android.webkit.WebView webView, android.webkit.ClientCertRequest clientCertRequest) {
        this.f1879b.a(webView);
        this.f1878a.onReceivedClientCertRequest(this.f1879b, new a(clientCertRequest));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, int i5, String str, String str2) {
        this.f1879b.a(webView);
        this.f1878a.onReceivedError(this.f1879b, i5, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        this.f1879b.a(webView);
        this.f1878a.onReceivedError(this.f1879b, webResourceRequest != null ? new f(webResourceRequest) : null, webResourceError != null ? new com.tencent.smtt.export.external.interfaces.WebResourceError() { // from class: com.tencent.smtt.sdk.SystemWebViewClient.2
            @Override // com.tencent.smtt.export.external.interfaces.WebResourceError
            public CharSequence getDescription() {
                return webResourceError.getDescription();
            }

            @Override // com.tencent.smtt.export.external.interfaces.WebResourceError
            public int getErrorCode() {
                return webResourceError.getErrorCode();
            }
        } : null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f1879b.a(webView);
        this.f1878a.onReceivedHttpAuthRequest(this.f1879b, new b(httpAuthHandler), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        this.f1879b.a(webView);
        this.f1878a.onReceivedHttpError(this.f1879b, new f(webResourceRequest), new g(webResourceResponse));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(12)
    public void onReceivedLoginRequest(android.webkit.WebView webView, String str, String str2, String str3) {
        this.f1879b.a(webView);
        this.f1878a.onReceivedLoginRequest(this.f1879b, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(8)
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        this.f1879b.a(webView);
        this.f1878a.onReceivedSslError(this.f1879b, new c(sslErrorHandler), new d(sslError));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, final RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f1879b.a(webView);
        return this.f1878a.onRenderProcessGone(this.f1879b, new WebViewClient.RenderProcessGoneDetail() { // from class: com.tencent.smtt.sdk.SystemWebViewClient.3
            @Override // com.tencent.smtt.sdk.WebViewClient.RenderProcessGoneDetail
            public boolean didCrash() {
                return renderProcessGoneDetail.didCrash();
            }

            @Override // com.tencent.smtt.sdk.WebViewClient.RenderProcessGoneDetail
            public int rendererPriorityAtExit() {
                return renderProcessGoneDetail.rendererPriorityAtExit();
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(android.webkit.WebView webView, float f5, float f6) {
        this.f1879b.a(webView);
        this.f1878a.onScaleChanged(this.f1879b, f5, f6);
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(android.webkit.WebView webView, Message message, Message message2) {
        this.f1879b.a(webView);
        this.f1878a.onTooManyRedirects(this.f1879b, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(android.webkit.WebView webView, KeyEvent keyEvent) {
        this.f1879b.a(webView);
        this.f1878a.onUnhandledKeyEvent(this.f1879b, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r10, android.webkit.WebResourceRequest r11) {
        /*
            r9 = this;
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 0
            if (r11 != 0) goto L6
            return r0
        L6:
            r1 = 0
            r2 = 24
            if (r10 < r2) goto L1d
            java.lang.String r10 = "isRedirect"
            java.lang.Object r10 = com.tencent.smtt.utils.j.a(r11, r10)
            boolean r2 = r10 instanceof java.lang.Boolean
            if (r2 == 0) goto L1d
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r1 = r10.booleanValue()
            r5 = r1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            com.tencent.smtt.sdk.SystemWebViewClient$e r10 = new com.tencent.smtt.sdk.SystemWebViewClient$e
            android.net.Uri r1 = r11.getUrl()
            java.lang.String r3 = r1.toString()
            boolean r4 = r11.isForMainFrame()
            boolean r6 = r11.hasGesture()
            java.lang.String r7 = r11.getMethod()
            java.util.Map r8 = r11.getRequestHeaders()
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.tencent.smtt.sdk.WebViewClient r11 = r9.f1878a
            com.tencent.smtt.sdk.WebView r1 = r9.f1879b
            com.tencent.smtt.export.external.interfaces.WebResourceResponse r10 = r11.shouldInterceptRequest(r1, r10)
            if (r10 != 0) goto L47
            return r0
        L47:
            android.webkit.WebResourceResponse r11 = new android.webkit.WebResourceResponse
            java.lang.String r0 = r10.getMimeType()
            java.lang.String r1 = r10.getEncoding()
            java.io.InputStream r2 = r10.getData()
            r11.<init>(r0, r1, r2)
            java.util.Map r0 = r10.getResponseHeaders()
            r11.setResponseHeaders(r0)
            int r0 = r10.getStatusCode()
            java.lang.String r10 = r10.getReasonPhrase()
            int r1 = r11.getStatusCode()
            if (r0 != r1) goto L79
            if (r10 == 0) goto L7c
            java.lang.String r1 = r11.getReasonPhrase()
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L7c
        L79:
            r11.setStatusCodeAndReasonPhrase(r0, r10)
        L7c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.SystemWebViewClient.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, String str) {
        WebResourceResponse shouldInterceptRequest = this.f1878a.shouldInterceptRequest(this.f1879b, str);
        if (shouldInterceptRequest == null) {
            return null;
        }
        return new android.webkit.WebResourceResponse(shouldInterceptRequest.getMimeType(), shouldInterceptRequest.getEncoding(), shouldInterceptRequest.getData());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(android.webkit.WebView webView, KeyEvent keyEvent) {
        this.f1879b.a(webView);
        return this.f1878a.shouldOverrideKeyEvent(this.f1879b, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        boolean z4;
        String uri = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? null : webResourceRequest.getUrl().toString();
        if (uri == null || this.f1879b.showDebugView(uri)) {
            return true;
        }
        this.f1879b.a(webView);
        if (Build.VERSION.SDK_INT >= 24) {
            Object a5 = com.tencent.smtt.utils.j.a(webResourceRequest, "isRedirect");
            if (a5 instanceof Boolean) {
                z4 = ((Boolean) a5).booleanValue();
                return this.f1878a.shouldOverrideUrlLoading(this.f1879b, new e(webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), z4, webResourceRequest.hasGesture(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders()));
            }
        }
        z4 = false;
        return this.f1878a.shouldOverrideUrlLoading(this.f1879b, new e(webResourceRequest.getUrl().toString(), webResourceRequest.isForMainFrame(), z4, webResourceRequest.hasGesture(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders()));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
        if (str == null || this.f1879b.showDebugView(str)) {
            return true;
        }
        this.f1879b.a(webView);
        return this.f1878a.shouldOverrideUrlLoading(this.f1879b, str);
    }
}
