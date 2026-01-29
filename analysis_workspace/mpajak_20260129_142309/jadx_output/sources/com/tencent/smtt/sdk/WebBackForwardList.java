package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.interfaces.IX5WebBackForwardList;

/* loaded from: classes19.dex */
public class WebBackForwardList {

    /* renamed from: a, reason: collision with root package name */
    private IX5WebBackForwardList f2020a = null;

    /* renamed from: b, reason: collision with root package name */
    private android.webkit.WebBackForwardList f2021b = null;

    public static WebBackForwardList a(android.webkit.WebBackForwardList webBackForwardList) {
        if (webBackForwardList == null) {
            return null;
        }
        WebBackForwardList webBackForwardList2 = new WebBackForwardList();
        webBackForwardList2.f2021b = webBackForwardList;
        return webBackForwardList2;
    }

    public static WebBackForwardList a(IX5WebBackForwardList iX5WebBackForwardList) {
        if (iX5WebBackForwardList == null) {
            return null;
        }
        WebBackForwardList webBackForwardList = new WebBackForwardList();
        webBackForwardList.f2020a = iX5WebBackForwardList;
        return webBackForwardList;
    }

    public int getCurrentIndex() {
        IX5WebBackForwardList iX5WebBackForwardList = this.f2020a;
        return iX5WebBackForwardList != null ? iX5WebBackForwardList.getCurrentIndex() : this.f2021b.getCurrentIndex();
    }

    public WebHistoryItem getCurrentItem() {
        IX5WebBackForwardList iX5WebBackForwardList = this.f2020a;
        return iX5WebBackForwardList != null ? WebHistoryItem.a(iX5WebBackForwardList.getCurrentItem()) : WebHistoryItem.a(this.f2021b.getCurrentItem());
    }

    public WebHistoryItem getItemAtIndex(int i5) {
        IX5WebBackForwardList iX5WebBackForwardList = this.f2020a;
        return iX5WebBackForwardList != null ? WebHistoryItem.a(iX5WebBackForwardList.getItemAtIndex(i5)) : WebHistoryItem.a(this.f2021b.getItemAtIndex(i5));
    }

    public int getSize() {
        IX5WebBackForwardList iX5WebBackForwardList = this.f2020a;
        return iX5WebBackForwardList != null ? iX5WebBackForwardList.getSize() : this.f2021b.getSize();
    }
}
