package com.tencent.smtt.export.external.extension.interfaces;

import java.util.List;
import java.util.Map;

/* loaded from: classes21.dex */
public interface IX5WebSettingsExtension {
    public static final int PicModel_NORMAL = 1;
    public static final int PicModel_NetNoPic = 3;
    public static final int PicModel_NoPic = 2;

    void customDiskCachePathEnabled(boolean z4, String str);

    boolean getBlockLocalAddressEnable();

    boolean getPageSolarEnableFlag();

    boolean isFitScreen();

    boolean isReadModeWebView();

    boolean isWapSitePreferred();

    boolean isWebViewInBackground();

    void setARModeEnable(boolean z4);

    void setAcceptCookie(boolean z4);

    void setAdditionalHttpHeaders(Map<String, String> map);

    void setAutoDetectToOpenFitScreenEnabled(boolean z4);

    void setAutoRecoredAndRestoreScaleEnabled(boolean z4);

    void setBlockLocalAddressEnable(boolean z4);

    void setContentCacheEnable(boolean z4);

    void setDayOrNight(boolean z4);

    void setDisplayCutoutEnable(boolean z4);

    void setEnableUnderLine(boolean z4);

    void setFirstScreenDetect(boolean z4);

    void setFirstScreenSoftwareTextureDraw(boolean z4);

    void setFitScreen(boolean z4);

    void setForcePinchScaleEnabled(boolean z4);

    void setFramePerformanceRecordEnable(boolean z4);

    boolean setHttpDnsDomains(List<String> list);

    void setImageScanEnable(boolean z4);

    void setImgAsDownloadFile(boolean z4);

    void setIsViewSourceMode(boolean z4);

    void setJSPerformanceRecordEnable(boolean z4);

    void setJavaScriptOpenWindowsBlockedNotifyEnabled(boolean z4);

    void setOnContextMenuEnable(boolean z4);

    void setOnlyDomTreeBuild(boolean z4);

    void setPageCacheCapacity(int i5);

    void setPageSolarEnableFlag(boolean z4);

    void setPicModel(int i5);

    void setPreFectch(boolean z4);

    void setPreFectchEnableWhenHasMedia(boolean z4);

    void setReadModeWebView(boolean z4);

    void setRecordRequestEnabled(boolean z4);

    void setRememberScaleValue(boolean z4);

    void setSelectionColorEnabled(boolean z4);

    void setShouldRequestFavicon(boolean z4);

    void setShouldTrackVisitedLinks(boolean z4);

    void setSmartFullScreenEnabled(boolean z4);

    void setTbsARShareType(int i5);

    void setTextDecorationUnlineEnabled(boolean z4);

    void setUseQProxy(boolean z4);

    void setWapSitePreferred(boolean z4);

    void setWebViewInBackground(boolean z4);
}
