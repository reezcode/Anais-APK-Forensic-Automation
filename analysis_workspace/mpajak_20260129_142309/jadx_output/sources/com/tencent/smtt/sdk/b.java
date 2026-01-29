package com.tencent.smtt.sdk;

/* loaded from: classes5.dex */
class b implements com.tencent.smtt.export.external.interfaces.DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    private DownloadListener f2114a;

    /* renamed from: b, reason: collision with root package name */
    private WebView f2115b;

    public b(WebView webView, DownloadListener downloadListener, boolean z4) {
        this.f2114a = downloadListener;
        this.f2115b = webView;
    }

    @Override // com.tencent.smtt.export.external.interfaces.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j5) {
        onDownloadStart(str, null, null, str2, str3, str4, j5, null, null);
    }

    @Override // com.tencent.smtt.export.external.interfaces.DownloadListener
    public void onDownloadStart(String str, String str2, byte[] bArr, String str3, String str4, String str5, long j5, String str6, String str7) {
        DownloadListener downloadListener = this.f2114a;
        if (downloadListener == null) {
            return;
        }
        downloadListener.onDownloadStart(str, str3, str4, str5, j5);
    }

    @Override // com.tencent.smtt.export.external.interfaces.DownloadListener
    public void onDownloadVideo(String str, long j5, int i5) {
    }
}
