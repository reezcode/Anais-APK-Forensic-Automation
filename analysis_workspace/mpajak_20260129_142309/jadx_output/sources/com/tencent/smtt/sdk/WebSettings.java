package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings;
import com.tencent.smtt.sdk.TbsListener;

/* loaded from: classes22.dex */
public class WebSettings {
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int LOAD_DEFAULT = -1;
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_NO_CACHE = 2;

    /* renamed from: a, reason: collision with root package name */
    private IX5WebSettings f2029a;

    /* renamed from: b, reason: collision with root package name */
    private android.webkit.WebSettings f2030b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2031c;

    /* loaded from: classes12.dex */
    public enum LayoutAlgorithm {
        NORMAL,
        SINGLE_COLUMN,
        NARROW_COLUMNS
    }

    /* loaded from: classes7.dex */
    public enum PluginState {
        ON,
        ON_DEMAND,
        OFF
    }

    public enum RenderPriority {
        NORMAL,
        HIGH,
        LOW
    }

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

    /* loaded from: classes19.dex */
    public enum ZoomDensity {
        FAR(TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO),
        MEDIUM(100),
        CLOSE(75);

        public int value;

        ZoomDensity(int i5) {
            this.value = i5;
        }
    }

    public WebSettings(android.webkit.WebSettings webSettings) {
        this.f2029a = null;
        this.f2030b = webSettings;
        this.f2031c = false;
    }

    public WebSettings(IX5WebSettings iX5WebSettings) {
        this.f2029a = iX5WebSettings;
        this.f2030b = null;
        this.f2031c = true;
    }

    @TargetApi(17)
    public static String getDefaultUserAgent(Context context) {
        if (u.a().b()) {
            return u.a().c().i(context);
        }
        Object a5 = com.tencent.smtt.utils.j.a((Class<?>) android.webkit.WebSettings.class, "getDefaultUserAgent", (Class<?>[]) new Class[]{Context.class}, context);
        if (a5 == null) {
            return null;
        }
        return (String) a5;
    }

    @Deprecated
    public boolean enableSmoothTransition() {
        android.webkit.WebSettings webSettings;
        Object a5;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.enableSmoothTransition();
        }
        if (z4 || (webSettings = this.f2030b) == null || (a5 = com.tencent.smtt.utils.j.a(webSettings, "enableSmoothTransition")) == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    @TargetApi(11)
    public boolean getAllowContentAccess() {
        android.webkit.WebSettings webSettings;
        Object a5;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getAllowContentAccess();
        }
        if (z4 || (webSettings = this.f2030b) == null || (a5 = com.tencent.smtt.utils.j.a(webSettings, "getAllowContentAccess")) == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    @TargetApi(3)
    public boolean getAllowFileAccess() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getAllowFileAccess();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getAllowFileAccess();
    }

    public synchronized boolean getBlockNetworkImage() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getBlockNetworkImage();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getBlockNetworkImage();
    }

    @TargetApi(8)
    public synchronized boolean getBlockNetworkLoads() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getBlockNetworkLoads();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getBlockNetworkLoads();
    }

    @TargetApi(3)
    public boolean getBuiltInZoomControls() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getBuiltInZoomControls();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getBuiltInZoomControls();
    }

    public int getCacheMode() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getCacheMode();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return 0;
        }
        return webSettings.getCacheMode();
    }

    public synchronized String getCursiveFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || (webSettings = this.f2030b) == null) ? "" : webSettings.getCursiveFontFamily() : iX5WebSettings.getCursiveFontFamily();
    }

    @TargetApi(5)
    public synchronized boolean getDatabaseEnabled() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getDatabaseEnabled();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getDatabaseEnabled();
    }

    @TargetApi(5)
    @Deprecated
    public synchronized String getDatabasePath() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || (webSettings = this.f2030b) == null) ? "" : webSettings.getDatabasePath() : iX5WebSettings.getDatabasePath();
    }

    public synchronized int getDefaultFixedFontSize() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getDefaultFixedFontSize();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return 0;
        }
        return webSettings.getDefaultFixedFontSize();
    }

    public synchronized int getDefaultFontSize() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getDefaultFontSize();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return 0;
        }
        return webSettings.getDefaultFontSize();
    }

    public synchronized String getDefaultTextEncodingName() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || (webSettings = this.f2030b) == null) ? "" : webSettings.getDefaultTextEncodingName() : iX5WebSettings.getDefaultTextEncodingName();
    }

    @TargetApi(7)
    @Deprecated
    public ZoomDensity getDefaultZoom() {
        android.webkit.WebSettings webSettings;
        Enum defaultZoom;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            defaultZoom = iX5WebSettings.getDefaultZoom();
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return null;
            }
            defaultZoom = webSettings.getDefaultZoom();
        }
        return ZoomDensity.valueOf(defaultZoom.name());
    }

    @TargetApi(11)
    public boolean getDisplayZoomControls() {
        android.webkit.WebSettings webSettings;
        Object a5;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getDisplayZoomControls();
        }
        if (z4 || (webSettings = this.f2030b) == null || (a5 = com.tencent.smtt.utils.j.a(webSettings, "getDisplayZoomControls")) == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    @TargetApi(7)
    public synchronized boolean getDomStorageEnabled() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getDomStorageEnabled();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getDomStorageEnabled();
    }

    public synchronized String getFantasyFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || (webSettings = this.f2030b) == null) ? "" : webSettings.getFantasyFontFamily() : iX5WebSettings.getFantasyFontFamily();
    }

    public synchronized String getFixedFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || (webSettings = this.f2030b) == null) ? "" : webSettings.getFixedFontFamily() : iX5WebSettings.getFixedFontFamily();
    }

    public synchronized boolean getJavaScriptCanOpenWindowsAutomatically() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getJavaScriptCanOpenWindowsAutomatically();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getJavaScriptCanOpenWindowsAutomatically();
    }

    public synchronized boolean getJavaScriptEnabled() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getJavaScriptEnabled();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getJavaScriptEnabled();
    }

    public synchronized LayoutAlgorithm getLayoutAlgorithm() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return LayoutAlgorithm.valueOf(iX5WebSettings.getLayoutAlgorithm().name());
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return null;
        }
        return LayoutAlgorithm.valueOf(webSettings.getLayoutAlgorithm().name());
    }

    @Deprecated
    public boolean getLightTouchEnabled() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getLightTouchEnabled();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getLightTouchEnabled();
    }

    @TargetApi(7)
    public boolean getLoadWithOverviewMode() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getLoadWithOverviewMode();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getLoadWithOverviewMode();
    }

    public synchronized boolean getLoadsImagesAutomatically() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getLoadsImagesAutomatically();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getLoadsImagesAutomatically();
    }

    @TargetApi(17)
    public boolean getMediaPlaybackRequiresUserGesture() {
        android.webkit.WebSettings webSettings;
        Object a5;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getMediaPlaybackRequiresUserGesture();
        }
        if (z4 || (webSettings = this.f2030b) == null || (a5 = com.tencent.smtt.utils.j.a(webSettings, "getMediaPlaybackRequiresUserGesture")) == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    public synchronized int getMinimumFontSize() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getMinimumFontSize();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return 0;
        }
        return webSettings.getMinimumFontSize();
    }

    public synchronized int getMinimumLogicalFontSize() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getMinimumLogicalFontSize();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return 0;
        }
        return webSettings.getMinimumLogicalFontSize();
    }

    public synchronized int getMixedContentMode() {
        IX5WebSettings iX5WebSettings;
        int i5 = -1;
        if (!this.f2031c || (iX5WebSettings = this.f2029a) == null) {
            Object a5 = com.tencent.smtt.utils.j.a(this.f2030b, "getMixedContentMode", (Class<?>[]) new Class[0], new Object[0]);
            if (a5 != null) {
                i5 = ((Integer) a5).intValue();
            }
            return i5;
        }
        try {
            return iX5WebSettings.getMixedContentMode();
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    @Deprecated
    public boolean getNavDump() {
        android.webkit.WebSettings webSettings;
        Object a5;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getNavDump();
        }
        if (z4 || (webSettings = this.f2030b) == null || (a5 = com.tencent.smtt.utils.j.a(webSettings, "getNavDump")) == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    @TargetApi(8)
    @Deprecated
    public synchronized PluginState getPluginState() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return PluginState.valueOf(iX5WebSettings.getPluginState().name());
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return null;
        }
        Object a5 = com.tencent.smtt.utils.j.a(webSettings, "getPluginState");
        if (a5 == null) {
            return null;
        }
        return PluginState.valueOf(((WebSettings.PluginState) a5).name());
    }

    @TargetApi(8)
    @Deprecated
    public synchronized boolean getPluginsEnabled() {
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || this.f2030b == null) ? false : false : iX5WebSettings.getPluginsEnabled();
    }

    @Deprecated
    public synchronized String getPluginsPath() {
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || this.f2030b == null) ? "" : "" : iX5WebSettings.getPluginsPath();
    }

    public boolean getSafeBrowsingEnabled() {
        IX5WebSettings iX5WebSettings;
        android.webkit.WebSettings webSettings;
        boolean z4 = this.f2031c;
        if (!z4 && (webSettings = this.f2030b) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                return webSettings.getSafeBrowsingEnabled();
            }
            return false;
        }
        if (!z4 || (iX5WebSettings = this.f2029a) == null) {
            return false;
        }
        try {
            return iX5WebSettings.getSafeBrowsingEnabled();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public synchronized String getSansSerifFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || (webSettings = this.f2030b) == null) ? "" : webSettings.getSansSerifFontFamily() : iX5WebSettings.getSansSerifFontFamily();
    }

    @Deprecated
    public boolean getSaveFormData() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getSaveFormData();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getSaveFormData();
    }

    @Deprecated
    public boolean getSavePassword() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getSavePassword();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getSavePassword();
    }

    public synchronized String getSerifFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || (webSettings = this.f2030b) == null) ? "" : webSettings.getSerifFontFamily() : iX5WebSettings.getSerifFontFamily();
    }

    public synchronized String getStandardFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || (webSettings = this.f2030b) == null) ? "" : webSettings.getStandardFontFamily() : iX5WebSettings.getStandardFontFamily();
    }

    @Deprecated
    public TextSize getTextSize() {
        android.webkit.WebSettings webSettings;
        Enum textSize;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            textSize = iX5WebSettings.getTextSize();
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return null;
            }
            textSize = webSettings.getTextSize();
        }
        return TextSize.valueOf(textSize.name());
    }

    @TargetApi(14)
    public synchronized int getTextZoom() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getTextZoom();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return 0;
        }
        try {
            return webSettings.getTextZoom();
        } catch (Exception unused) {
            Object a5 = com.tencent.smtt.utils.j.a(this.f2030b, "getTextZoom");
            if (a5 == null) {
                return 0;
            }
            return ((Integer) a5).intValue();
        }
    }

    @Deprecated
    public boolean getUseWebViewBackgroundForOverscrollBackground() {
        android.webkit.WebSettings webSettings;
        Object a5;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getUseWebViewBackgroundForOverscrollBackground();
        }
        if (z4 || (webSettings = this.f2030b) == null || (a5 = com.tencent.smtt.utils.j.a(webSettings, "getUseWebViewBackgroundForOverscrollBackground")) == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    public synchronized boolean getUseWideViewPort() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.getUseWideViewPort();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.getUseWideViewPort();
    }

    @TargetApi(3)
    public String getUserAgentString() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        return (!z4 || (iX5WebSettings = this.f2029a) == null) ? (z4 || (webSettings = this.f2030b) == null) ? "" : webSettings.getUserAgentString() : iX5WebSettings.getUserAgentString();
    }

    @TargetApi(11)
    public void setAllowContentAccess(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setAllowContentAccess(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            com.tencent.smtt.utils.j.a(webSettings, "setAllowContentAccess", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    @TargetApi(3)
    public void setAllowFileAccess(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setAllowFileAccess(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setAllowFileAccess(z4);
        }
    }

    @TargetApi(16)
    public void setAllowFileAccessFromFileURLs(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setAllowFileAccessFromFileURLs(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            com.tencent.smtt.utils.j.a(webSettings, "setAllowFileAccessFromFileURLs", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    @TargetApi(16)
    public void setAllowUniversalAccessFromFileURLs(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setAllowUniversalAccessFromFileURLs(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            com.tencent.smtt.utils.j.a(webSettings, "setAllowUniversalAccessFromFileURLs", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    @TargetApi(7)
    public void setAppCacheEnabled(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setAppCacheEnabled(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setAppCacheEnabled(z4);
        }
    }

    @TargetApi(7)
    @Deprecated
    public void setAppCacheMaxSize(long j5) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setAppCacheMaxSize(j5);
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setAppCacheMaxSize(j5);
        }
    }

    @TargetApi(7)
    public void setAppCachePath(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setAppCachePath(str);
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setAppCachePath(str);
        }
    }

    public void setBlockNetworkImage(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setBlockNetworkImage(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setBlockNetworkImage(z4);
        }
    }

    @TargetApi(8)
    public synchronized void setBlockNetworkLoads(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setBlockNetworkLoads(z4);
        } else if (z5 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setBlockNetworkLoads(z4);
        }
    }

    @TargetApi(3)
    public void setBuiltInZoomControls(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setBuiltInZoomControls(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setBuiltInZoomControls(z4);
        }
    }

    public void setCacheMode(int i5) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setCacheMode(i5);
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setCacheMode(i5);
        }
    }

    public synchronized void setCursiveFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setCursiveFontFamily(str);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setCursiveFontFamily(str);
        }
    }

    @TargetApi(5)
    public void setDatabaseEnabled(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setDatabaseEnabled(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setDatabaseEnabled(z4);
        }
    }

    @TargetApi(5)
    @Deprecated
    public void setDatabasePath(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setDatabasePath(str);
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            com.tencent.smtt.utils.j.a(webSettings, "setDatabasePath", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    public synchronized void setDefaultFixedFontSize(int i5) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setDefaultFixedFontSize(i5);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setDefaultFixedFontSize(i5);
        }
    }

    public synchronized void setDefaultFontSize(int i5) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setDefaultFontSize(i5);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setDefaultFontSize(i5);
        }
    }

    public synchronized void setDefaultTextEncodingName(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setDefaultTextEncodingName(str);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setDefaultTextEncodingName(str);
        }
    }

    @TargetApi(7)
    @Deprecated
    public void setDefaultZoom(ZoomDensity zoomDensity) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setDefaultZoom(IX5WebSettings.ZoomDensity.valueOf(zoomDensity.name()));
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.valueOf(zoomDensity.name()));
        }
    }

    @TargetApi(11)
    public void setDisplayZoomControls(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setDisplayZoomControls(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            com.tencent.smtt.utils.j.a(webSettings, "setDisplayZoomControls", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    @TargetApi(7)
    public void setDomStorageEnabled(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setDomStorageEnabled(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setDomStorageEnabled(z4);
        }
    }

    @TargetApi(11)
    @Deprecated
    public void setEnableSmoothTransition(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setEnableSmoothTransition(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            com.tencent.smtt.utils.j.a(webSettings, "setEnableSmoothTransition", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    public synchronized void setFantasyFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setFantasyFontFamily(str);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setFantasyFontFamily(str);
        }
    }

    public synchronized void setFixedFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setFixedFontFamily(str);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setFixedFontFamily(str);
        }
    }

    @TargetApi(5)
    @Deprecated
    public void setGeolocationDatabasePath(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setGeolocationDatabasePath(str);
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setGeolocationDatabasePath(str);
        }
    }

    @TargetApi(5)
    public void setGeolocationEnabled(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setGeolocationEnabled(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setGeolocationEnabled(z4);
        }
    }

    public synchronized void setJavaScriptCanOpenWindowsAutomatically(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setJavaScriptCanOpenWindowsAutomatically(z4);
        } else if (z5 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setJavaScriptCanOpenWindowsAutomatically(z4);
        }
    }

    @Deprecated
    public void setJavaScriptEnabled(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z5 = this.f2031c;
            if (z5 && (iX5WebSettings = this.f2029a) != null) {
                iX5WebSettings.setJavaScriptEnabled(z4);
            } else if (z5 || (webSettings = this.f2030b) == null) {
            } else {
                webSettings.setJavaScriptEnabled(z4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setLayoutAlgorithm(IX5WebSettings.LayoutAlgorithm.valueOf(layoutAlgorithm.name()));
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.valueOf(layoutAlgorithm.name()));
        }
    }

    @Deprecated
    public void setLightTouchEnabled(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setLightTouchEnabled(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setLightTouchEnabled(z4);
        }
    }

    @TargetApi(7)
    public void setLoadWithOverviewMode(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setLoadWithOverviewMode(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setLoadWithOverviewMode(z4);
        }
    }

    public void setLoadsImagesAutomatically(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setLoadsImagesAutomatically(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setLoadsImagesAutomatically(z4);
        }
    }

    @TargetApi(17)
    public void setMediaPlaybackRequiresUserGesture(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setMediaPlaybackRequiresUserGesture(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            com.tencent.smtt.utils.j.a(webSettings, "setMediaPlaybackRequiresUserGesture", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    public synchronized void setMinimumFontSize(int i5) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setMinimumFontSize(i5);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setMinimumFontSize(i5);
        }
    }

    public synchronized void setMinimumLogicalFontSize(int i5) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setMinimumLogicalFontSize(i5);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setMinimumLogicalFontSize(i5);
        }
    }

    @TargetApi(21)
    public void setMixedContentMode(int i5) {
        android.webkit.WebSettings webSettings;
        boolean z4 = this.f2031c;
        if ((z4 && this.f2029a != null) || z4 || (webSettings = this.f2030b) == null) {
            return;
        }
        com.tencent.smtt.utils.j.a(webSettings, "setMixedContentMode", (Class<?>[]) new Class[]{Integer.TYPE}, Integer.valueOf(i5));
    }

    @Deprecated
    public void setNavDump(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setNavDump(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            com.tencent.smtt.utils.j.a(webSettings, "setNavDump", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    public void setNeedInitialFocus(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setNeedInitialFocus(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setNeedInitialFocus(z4);
        }
    }

    @TargetApi(8)
    @Deprecated
    public synchronized void setPluginState(PluginState pluginState) {
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setPluginState(IX5WebSettings.PluginState.valueOf(pluginState.name()));
        } else if (z4 || this.f2030b == null) {
        } else {
            com.tencent.smtt.utils.j.a(this.f2030b, "setPluginState", (Class<?>[]) new Class[]{WebSettings.PluginState.class}, WebSettings.PluginState.valueOf(pluginState.name()));
        }
    }

    @Deprecated
    public void setPluginsEnabled(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setPluginsEnabled(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            com.tencent.smtt.utils.j.a(webSettings, "setPluginsEnabled", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    @Deprecated
    public synchronized void setPluginsPath(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setPluginsPath(str);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            com.tencent.smtt.utils.j.a(webSettings, "setPluginsPath", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    @Deprecated
    public void setRenderPriority(RenderPriority renderPriority) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setRenderPriority(IX5WebSettings.RenderPriority.valueOf(renderPriority.name()));
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setRenderPriority(WebSettings.RenderPriority.valueOf(renderPriority.name()));
        }
    }

    public void setSafeBrowsingEnabled(boolean z4) {
        IX5WebSettings iX5WebSettings;
        android.webkit.WebSettings webSettings;
        boolean z5 = this.f2031c;
        if (!z5 && (webSettings = this.f2030b) != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                webSettings.setSafeBrowsingEnabled(z4);
            }
        } else {
            if (!z5 || (iX5WebSettings = this.f2029a) == null) {
                return;
            }
            try {
                iX5WebSettings.setSafeBrowsingEnabled(z4);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public synchronized void setSansSerifFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setSansSerifFontFamily(str);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setSansSerifFontFamily(str);
        }
    }

    @Deprecated
    public void setSaveFormData(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setSaveFormData(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setSaveFormData(z4);
        }
    }

    @Deprecated
    public void setSavePassword(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setSavePassword(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setSavePassword(z4);
        }
    }

    public synchronized void setSerifFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setSerifFontFamily(str);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setSerifFontFamily(str);
        }
    }

    public synchronized void setStandardFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setStandardFontFamily(str);
        } else if (z4 || (webSettings = this.f2030b) == null) {
        } else {
            webSettings.setStandardFontFamily(str);
        }
    }

    public void setSupportMultipleWindows(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setSupportMultipleWindows(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setSupportMultipleWindows(z4);
        }
    }

    public void setSupportZoom(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setSupportZoom(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setSupportZoom(z4);
        }
    }

    @Deprecated
    public void setTextSize(TextSize textSize) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setTextSize(IX5WebSettings.TextSize.valueOf(textSize.name()));
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setTextSize(WebSettings.TextSize.valueOf(textSize.name()));
        }
    }

    @TargetApi(14)
    public synchronized void setTextZoom(int i5) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setTextZoom(i5);
        } else if (!z4 && (webSettings = this.f2030b) != null) {
            try {
                webSettings.setTextZoom(i5);
            } catch (Exception unused) {
                com.tencent.smtt.utils.j.a(this.f2030b, "setTextZoom", (Class<?>[]) new Class[]{Integer.TYPE}, Integer.valueOf(i5));
            }
        }
    }

    @Deprecated
    public void setUseWebViewBackgroundForOverscrollBackground(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setUseWebViewBackgroundForOverscrollBackground(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            com.tencent.smtt.utils.j.a(webSettings, "setUseWebViewBackgroundForOverscrollBackground", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    public void setUseWideViewPort(boolean z4) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z5 = this.f2031c;
        if (z5 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setUseWideViewPort(z4);
        } else {
            if (z5 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setUseWideViewPort(z4);
        }
    }

    public void setUserAgent(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setUserAgent(str);
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setUserAgentString(str);
        }
    }

    @TargetApi(3)
    public void setUserAgentString(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            iX5WebSettings.setUserAgentString(str);
        } else {
            if (z4 || (webSettings = this.f2030b) == null) {
                return;
            }
            webSettings.setUserAgentString(str);
        }
    }

    public synchronized boolean supportMultipleWindows() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.supportMultipleWindows();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.supportMultipleWindows();
    }

    public boolean supportZoom() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z4 = this.f2031c;
        if (z4 && (iX5WebSettings = this.f2029a) != null) {
            return iX5WebSettings.supportZoom();
        }
        if (z4 || (webSettings = this.f2030b) == null) {
            return false;
        }
        return webSettings.supportZoom();
    }
}
