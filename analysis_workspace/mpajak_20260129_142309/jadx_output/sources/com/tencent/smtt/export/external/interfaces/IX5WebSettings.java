package com.tencent.smtt.export.external.interfaces;

import com.tencent.smtt.sdk.TbsListener;

/* loaded from: classes25.dex */
public interface IX5WebSettings {
    public static final int DEFAULT_CACHE_CAPACITY = 15;
    public static final int LOAD_CACHE_AD = 100;
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int LOAD_DEFAULT = -1;
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_NO_CACHE = 2;

    /* loaded from: classes18.dex */
    public enum LayoutAlgorithm {
        NORMAL,
        SINGLE_COLUMN,
        NARROW_COLUMNS
    }

    /* loaded from: classes23.dex */
    public enum PluginState {
        ON,
        ON_DEMAND,
        OFF
    }

    /* loaded from: classes4.dex */
    public enum RenderPriority {
        NORMAL,
        HIGH,
        LOW
    }

    /* loaded from: classes12.dex */
    public enum TextSize {
        SMALLEST(50),
        SMALLER(75),
        NORMAL(100),
        LARGER(125),
        LARGEST(TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO);

        public int value;

        TextSize(int i5) {
            this.value = i5;
        }
    }

    /* loaded from: classes16.dex */
    public enum ZoomDensity {
        FAR(TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO),
        MEDIUM(100),
        CLOSE(75);

        public int value;

        ZoomDensity(int i5) {
            this.value = i5;
        }
    }

    boolean enableSmoothTransition();

    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkImage();

    boolean getBlockNetworkLoads();

    boolean getBuiltInZoomControls();

    int getCacheMode();

    String getCursiveFontFamily();

    boolean getDatabaseEnabled();

    String getDatabasePath();

    int getDefaultFixedFontSize();

    int getDefaultFontSize();

    String getDefaultTextEncodingName();

    ZoomDensity getDefaultZoom();

    boolean getDisplayZoomControls();

    boolean getDomStorageEnabled();

    String getFantasyFontFamily();

    String getFixedFontFamily();

    boolean getJavaScriptCanOpenWindowsAutomatically();

    boolean getJavaScriptEnabled();

    LayoutAlgorithm getLayoutAlgorithm();

    boolean getLightTouchEnabled();

    boolean getLoadWithOverviewMode();

    boolean getLoadsImagesAutomatically();

    boolean getMediaPlaybackRequiresUserGesture();

    int getMinimumFontSize();

    int getMinimumLogicalFontSize();

    int getMixedContentMode();

    boolean getNavDump();

    PluginState getPluginState();

    boolean getPluginsEnabled();

    String getPluginsPath();

    boolean getSafeBrowsingEnabled();

    String getSansSerifFontFamily();

    boolean getSaveFormData();

    boolean getSavePassword();

    String getSerifFontFamily();

    String getStandardFontFamily();

    TextSize getTextSize();

    int getTextZoom();

    boolean getUseWebViewBackgroundForOverscrollBackground();

    boolean getUseWideViewPort();

    String getUserAgent();

    String getUserAgentString();

    void setAllowContentAccess(boolean z4);

    void setAllowFileAccess(boolean z4);

    void setAllowFileAccessFromFileURLs(boolean z4);

    void setAllowUniversalAccessFromFileURLs(boolean z4);

    void setAppCacheEnabled(boolean z4);

    void setAppCacheMaxSize(long j5);

    void setAppCachePath(String str);

    void setBlockNetworkImage(boolean z4);

    void setBlockNetworkLoads(boolean z4);

    void setBuiltInZoomControls(boolean z4);

    void setCacheMode(int i5);

    void setCursiveFontFamily(String str);

    void setDatabaseEnabled(boolean z4);

    void setDatabasePath(String str);

    void setDefaultDatabasePath(boolean z4);

    void setDefaultFixedFontSize(int i5);

    void setDefaultFontSize(int i5);

    void setDefaultTextEncodingName(String str);

    void setDefaultZoom(ZoomDensity zoomDensity);

    void setDisplayZoomControls(boolean z4);

    void setDomStorageEnabled(boolean z4);

    void setEnableSmoothTransition(boolean z4);

    void setFantasyFontFamily(String str);

    void setFixedFontFamily(String str);

    void setGeolocationDatabasePath(String str);

    void setGeolocationEnabled(boolean z4);

    void setJavaScriptCanOpenWindowsAutomatically(boolean z4);

    void setJavaScriptEnabled(boolean z4);

    void setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm);

    void setLightTouchEnabled(boolean z4);

    void setLoadWithOverviewMode(boolean z4);

    void setLoadsImagesAutomatically(boolean z4);

    void setMediaPlaybackRequiresUserGesture(boolean z4);

    void setMinimumFontSize(int i5);

    void setMinimumLogicalFontSize(int i5);

    void setNavDump(boolean z4);

    void setNeedInitialFocus(boolean z4);

    void setPluginEnabled(boolean z4);

    void setPluginState(PluginState pluginState);

    void setPluginsEnabled(boolean z4);

    void setPluginsPath(String str);

    void setRenderPriority(RenderPriority renderPriority);

    void setSafeBrowsingEnabled(boolean z4);

    void setSansSerifFontFamily(String str);

    void setSaveFormData(boolean z4);

    void setSavePassword(boolean z4);

    void setSerifFontFamily(String str);

    void setStandardFontFamily(String str);

    void setSupportMultipleWindows(boolean z4);

    void setSupportZoom(boolean z4);

    void setTextSize(TextSize textSize);

    void setTextZoom(int i5);

    void setUseWebViewBackgroundForOverscrollBackground(boolean z4);

    void setUseWideViewPort(boolean z4);

    void setUserAgent(String str);

    void setUserAgent(String str, boolean z4);

    void setUserAgentString(String str);

    boolean supportMultipleWindows();

    boolean supportZoom();
}
