package com.tencent.smtt.sdk;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.tencent.smtt.export.external.TbsCoreSettings;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebSettingsExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.extension.proxy.X5ProxyWebViewClientExtension;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.stat.MttLoader;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedWriter;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class WebView extends FrameLayout implements View.OnLongClickListener {
    public static int NIGHT_MODE_ALPHA = 153;
    public static final int NIGHT_MODE_COLOR = -16777216;
    public static final int NORMAL_MODE_ALPHA = 255;
    public static final String SCHEME_GEO = "geo:0,0?q=";
    public static final String SCHEME_MAILTO = "mailto:";
    public static final String SCHEME_TEL = "tel:";

    /* renamed from: i, reason: collision with root package name */
    private static Context f2033i = null;

    /* renamed from: l, reason: collision with root package name */
    private static Method f2034l = null;
    public static boolean mSysWebviewCreated = false;
    public static boolean mWebViewCreated = false;

    /* renamed from: o, reason: collision with root package name */
    private static String f2035o = null;

    /* renamed from: u, reason: collision with root package name */
    private static Paint f2036u = null;

    /* renamed from: v, reason: collision with root package name */
    private static boolean f2037v = true;

    /* renamed from: a, reason: collision with root package name */
    public volatile int f2038a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2039b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2040c;

    /* renamed from: d, reason: collision with root package name */
    private IX5WebViewBase f2041d;

    /* renamed from: e, reason: collision with root package name */
    private a f2042e;

    /* renamed from: f, reason: collision with root package name */
    private WebSettings f2043f;

    /* renamed from: g, reason: collision with root package name */
    private Context f2044g;

    /* renamed from: h, reason: collision with root package name */
    private TbsWebViewPerformanceRecorder f2045h;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f2046j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2047k;

    /* renamed from: m, reason: collision with root package name */
    private WebViewClient f2048m;
    public WebViewCallbackClient mWebViewCallbackClient;

    /* renamed from: n, reason: collision with root package name */
    private WebChromeClient f2049n;

    /* renamed from: p, reason: collision with root package name */
    private final int f2050p;

    /* renamed from: q, reason: collision with root package name */
    private final int f2051q;

    /* renamed from: r, reason: collision with root package name */
    private final int f2052r;

    /* renamed from: s, reason: collision with root package name */
    private final String f2053s;

    /* renamed from: t, reason: collision with root package name */
    private final String f2054t;

    /* renamed from: w, reason: collision with root package name */
    private Object f2055w;

    /* renamed from: x, reason: collision with root package name */
    private View.OnLongClickListener f2056x;

    /* loaded from: classes6.dex */
    public static class HitTestResult {

        @Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;

        @Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;

        /* renamed from: a, reason: collision with root package name */
        private IX5WebViewBase.HitTestResult f2068a;

        /* renamed from: b, reason: collision with root package name */
        private WebView.HitTestResult f2069b;

        public HitTestResult() {
            this.f2068a = null;
            this.f2069b = null;
        }

        public HitTestResult(WebView.HitTestResult hitTestResult) {
            this.f2068a = null;
            this.f2069b = hitTestResult;
        }

        public HitTestResult(IX5WebViewBase.HitTestResult hitTestResult) {
            this.f2068a = hitTestResult;
            this.f2069b = null;
        }

        public String getExtra() {
            IX5WebViewBase.HitTestResult hitTestResult = this.f2068a;
            if (hitTestResult != null) {
                return hitTestResult.getExtra();
            }
            WebView.HitTestResult hitTestResult2 = this.f2069b;
            return hitTestResult2 != null ? hitTestResult2.getExtra() : "";
        }

        public int getType() {
            IX5WebViewBase.HitTestResult hitTestResult = this.f2068a;
            if (hitTestResult != null) {
                return hitTestResult.getType();
            }
            WebView.HitTestResult hitTestResult2 = this.f2069b;
            if (hitTestResult2 != null) {
                return hitTestResult2.getType();
            }
            return 0;
        }
    }

    @Deprecated
    /* loaded from: classes9.dex */
    public interface PictureListener {
        @Deprecated
        void onNewPicture(WebView webView, Picture picture);
    }

    /* loaded from: classes10.dex */
    public class WebViewTransport {

        /* renamed from: b, reason: collision with root package name */
        private WebView f2071b;

        public WebViewTransport() {
        }

        public synchronized WebView getWebView() {
            return this.f2071b;
        }

        public synchronized void setWebView(WebView webView) {
            this.f2071b = webView;
        }
    }

    /* loaded from: classes17.dex */
    public class a extends android.webkit.WebView {
        public a(WebView webView, Context context) {
            this(context, null);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(WebView.this.c(context), attributeSet);
            WebView.mSysWebviewCreated = true;
            if (QbSdk.getIsSysWebViewForcedByOuter() && TbsShareManager.isThirdPartyApp(context)) {
                return;
            }
            CookieSyncManager.createInstance(WebView.this.f2044g).startSync();
            try {
                Method declaredMethod = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", new Class[0]);
                declaredMethod.setAccessible(true);
                ((Handler) declaredMethod.invoke(null, new Object[0])).getLooper().getThread().setUncaughtExceptionHandler(new g());
            } catch (Exception unused) {
            }
        }

        public void a() {
            super.computeScroll();
        }

        public void a(int i5, int i6, int i7, int i8) {
            super.onScrollChanged(i5, i6, i7, i8);
        }

        @TargetApi(9)
        public void a(int i5, int i6, boolean z4, boolean z5) {
            super.onOverScrolled(i5, i6, z4, z5);
        }

        @TargetApi(9)
        public boolean a(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z4) {
            return super.overScrollBy(i5, i6, i7, i8, i9, i10, i11, i12, z4);
        }

        public boolean a(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public boolean b(MotionEvent motionEvent) {
            return super.dispatchTouchEvent(motionEvent);
        }

        public boolean c(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        public void computeScroll() {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.computeScroll(this);
            } else {
                super.computeScroll();
            }
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            try {
                super.dispatchDraw(canvas);
                if (WebView.f2037v || WebView.f2036u == null) {
                    return;
                }
                canvas.save();
                canvas.drawPaint(WebView.f2036u);
                canvas.restore();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            return webViewCallbackClient != null ? webViewCallbackClient.dispatchTouchEvent(motionEvent, this) : super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView
        public android.webkit.WebSettings getSettings() {
            try {
                return super.getSettings();
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }

        @Override // android.view.View
        public void invalidate() {
            super.invalidate();
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.invalidate();
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            return webViewCallbackClient != null ? webViewCallbackClient.onInterceptTouchEvent(motionEvent, this) : super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        @TargetApi(9)
        public void onOverScrolled(int i5, int i6, boolean z4, boolean z5) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.onOverScrolled(i5, i6, z4, z5, this);
            } else {
                super.onOverScrolled(i5, i6, z4, z5);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(int i5, int i6, int i7, int i8) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.onScrollChanged(i5, i6, i7, i8, this);
            } else {
                super.onScrollChanged(i5, i6, i7, i8);
                WebView.this.onScrollChanged(i5, i6, i7, i8);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!hasFocus()) {
                requestFocus();
            }
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                return webViewCallbackClient.onTouchEvent(motionEvent, this);
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }

        @Override // android.view.View
        @TargetApi(9)
        public boolean overScrollBy(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z4) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            return webViewCallbackClient != null ? webViewCallbackClient.overScrollBy(i5, i6, i7, i8, i9, i10, i11, i12, z4, this) : super.overScrollBy(i5, i6, i7, i8, i9, i10, i11, i12, z4);
        }

        @Override // android.webkit.WebView, android.view.View
        public void setOverScrollMode(int i5) {
            try {
                super.setOverScrollMode(i5);
            } catch (Exception unused) {
            }
        }
    }

    public WebView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WebView(Context context, AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, false);
    }

    @TargetApi(11)
    public WebView(Context context, AttributeSet attributeSet, int i5, Map<String, Object> map, boolean z4) {
        super(context, attributeSet, i5);
        this.f2039b = "WebView";
        this.f2040c = false;
        this.f2043f = null;
        this.f2044g = null;
        this.f2045h = new TbsWebViewPerformanceRecorder();
        this.f2038a = 0;
        this.f2046j = false;
        this.f2047k = false;
        this.f2048m = null;
        this.f2049n = null;
        this.f2050p = 1;
        this.f2051q = 2;
        this.f2052r = 3;
        this.f2053s = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        this.f2054t = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        this.f2055w = null;
        this.f2056x = null;
        long currentTimeMillis = System.currentTimeMillis();
        mWebViewCreated = true;
        if (QbSdk.getIsSysWebViewForcedByOuter() && TbsShareManager.isThirdPartyApp(context)) {
            this.f2044g = context;
            this.f2041d = null;
            this.f2040c = false;
            QbSdk.a(context, "failed to createTBSWebview!");
            this.f2042e = new a(context, attributeSet);
            CookieSyncManager.createInstance(this.f2044g).startSync();
            try {
                Method declaredMethod = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", new Class[0]);
                declaredMethod.setAccessible(true);
                ((Handler) declaredMethod.invoke(null, new Object[0])).getLooper().getThread().setUncaughtExceptionHandler(new g());
            } catch (Exception unused) {
            }
            CookieManager.getInstance().a();
            this.f2042e.setFocusableInTouchMode(true);
            addView(this.f2042e, new FrameLayout.LayoutParams(-1, -1));
            TbsLog.i("WebView", "SystemWebView Created Success! #3, SysWebViewForcedByOuter.");
            TbsLog.e("WebView", "sys WebView: IsSysWebViewForcedByOuter = true", true);
        } else {
            if (TbsShareManager.isThirdPartyApp(context)) {
                StringBuilder g5 = androidx.activity.d.g("new WebView, thread is ");
                g5.append(Thread.currentThread());
                g5.append("stack: ");
                g5.append(Log.getStackTraceString(new Throwable("new WebView Detect")));
                TbsLog.i("webview", g5.toString());
            }
            TbsLog.initIfNeed(context);
            if (context == null) {
                throw new IllegalArgumentException("Invalid context argument");
            }
            b(context);
            this.f2044g = context;
            f2033i = context.getApplicationContext();
            if (!this.f2040c || QbSdk.f1808a) {
                this.f2041d = null;
                if (TbsShareManager.isThirdPartyApp(this.f2044g)) {
                    this.f2042e = new a(context, attributeSet);
                } else {
                    this.f2042e = new a(this, context);
                }
                TbsLog.i("WebView", "SystemWebView Created Success! #2");
                CookieManager.getInstance().a();
                this.f2042e.setFocusableInTouchMode(true);
                addView(this.f2042e, new FrameLayout.LayoutParams(-1, -1));
                setDownloadListener(null);
                TbsLog.writeLogToDisk();
                m.a(context);
            } else {
                IX5WebViewBase a5 = u.a().a(true).a(context);
                this.f2041d = a5;
                if (a5 == null || a5.getView() == null) {
                    TbsLog.e("WebView", "sys WebView: failed to createTBSWebview", true);
                    this.f2041d = null;
                    this.f2040c = false;
                    QbSdk.a(context, "failed to createTBSWebview!");
                    b(context);
                    if (TbsShareManager.isThirdPartyApp(this.f2044g)) {
                        this.f2042e = new a(context, attributeSet);
                    } else {
                        this.f2042e = new a(this, context);
                    }
                    TbsLog.i("WebView", "SystemWebView Created Success! #1");
                    CookieManager.getInstance().a();
                    this.f2042e.setFocusableInTouchMode(true);
                    addView(this.f2042e, new FrameLayout.LayoutParams(-1, -1));
                    try {
                        removeJavascriptInterface("searchBoxJavaBridge_");
                        removeJavascriptInterface("accessibility");
                        removeJavascriptInterface("accessibilityTraversal");
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    TbsLog.writeLogToDisk();
                    m.a(context);
                } else {
                    TbsLog.i("WebView", "X5 WebView Created Success!!");
                    this.f2041d.getView().setFocusableInTouchMode(true);
                    a(attributeSet);
                    addView(this.f2041d.getView(), new FrameLayout.LayoutParams(-1, -1));
                    this.f2041d.setDownloadListener(new b(this, null, this.f2040c));
                    this.f2041d.getX5WebViewExtension().setWebViewClientExtension(new X5ProxyWebViewClientExtension(u.a().a(true).k()) { // from class: com.tencent.smtt.sdk.WebView.1
                        @Override // com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension, com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
                        public void invalidate() {
                        }

                        @Override // com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension, com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
                        public void onScrollChanged(int i6, int i7, int i8, int i9) {
                            super.onScrollChanged(i6, i7, i8, i9);
                            WebView.this.onScrollChanged(i8, i9, i6, i7);
                        }
                    });
                }
            }
            try {
                removeJavascriptInterface("searchBoxJavaBridge_");
                removeJavascriptInterface("accessibility");
                removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            if ((TbsConfig.APP_QQ.equals(this.f2044g.getApplicationInfo().packageName) || TbsConfig.APP_WX.equals(this.f2044g.getApplicationInfo().packageName)) && f.a(true).i()) {
                setLayerType(1, null);
            }
            if (this.f2041d != null) {
                TbsLog.writeLogToDisk();
            }
        }
        this.f2045h.a(System.currentTimeMillis() - currentTimeMillis);
    }

    @Deprecated
    public WebView(Context context, AttributeSet attributeSet, int i5, boolean z4) {
        this(context, attributeSet, i5, null, z4);
    }

    @Deprecated
    public WebView(Context context, boolean z4) {
        super(context);
        this.f2039b = "WebView";
        this.f2040c = false;
        this.f2043f = null;
        this.f2044g = null;
        this.f2045h = new TbsWebViewPerformanceRecorder();
        this.f2038a = 0;
        this.f2046j = false;
        this.f2047k = false;
        this.f2048m = null;
        this.f2049n = null;
        this.f2050p = 1;
        this.f2051q = 2;
        this.f2052r = 3;
        this.f2053s = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        this.f2054t = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        this.f2055w = null;
        this.f2056x = null;
    }

    private void a(AttributeSet attributeSet) {
        View view;
        if (attributeSet != null) {
            try {
                int attributeCount = attributeSet.getAttributeCount();
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    if (attributeSet.getAttributeName(i5).equalsIgnoreCase("scrollbars")) {
                        int[] intArray = getResources().getIntArray(R.attr.scrollbars);
                        int attributeIntValue = attributeSet.getAttributeIntValue(i5, -1);
                        if (attributeIntValue == intArray[1]) {
                            this.f2041d.getView().setVerticalScrollBarEnabled(false);
                            view = this.f2041d.getView();
                        } else if (attributeIntValue == intArray[2]) {
                            this.f2041d.getView().setVerticalScrollBarEnabled(false);
                        } else if (attributeIntValue == intArray[3]) {
                            view = this.f2041d.getView();
                        }
                        view.setHorizontalScrollBarEnabled(false);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z4) {
        if (!this.f2046j && this.f2038a != 0) {
            j();
        }
        if (!this.f2040c) {
            try {
                Class<?> cls = Class.forName("android.webkit.WebViewClassic");
                Method method = cls.getMethod("fromWebView", android.webkit.WebView.class);
                method.setAccessible(true);
                Object invoke = method.invoke(null, this.f2042e);
                if (invoke != null) {
                    Field declaredField = cls.getDeclaredField("mListBoxDialog");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(invoke);
                    if (obj != null) {
                        Dialog dialog = (Dialog) obj;
                        dialog.setOnCancelListener(null);
                        Class<?> cls2 = Class.forName("android.app.Dialog");
                        Field declaredField2 = cls2.getDeclaredField("CANCEL");
                        declaredField2.setAccessible(true);
                        int intValue = ((Integer) declaredField2.get(dialog)).intValue();
                        Field declaredField3 = cls2.getDeclaredField("mListenersHandler");
                        declaredField3.setAccessible(true);
                        ((Handler) declaredField3.get(dialog)).removeMessages(intValue);
                    }
                }
            } catch (Exception unused) {
            }
            if (z4) {
                this.f2042e.destroy();
            }
            try {
                TbsLog.i("sdkreport", "webview.tbsWebviewDestroy mQQMusicCrashFix is " + this.f2047k);
                if (this.f2047k) {
                    return;
                }
                Field declaredField4 = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
                declaredField4.setAccessible(true);
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) declaredField4.get(null);
                if (componentCallbacks != null) {
                    declaredField4.set(null, null);
                    Field declaredField5 = Class.forName("android.view.ViewRoot").getDeclaredField("sConfigCallbacks");
                    declaredField5.setAccessible(true);
                    Object obj2 = declaredField5.get(null);
                    if (obj2 != null) {
                        List list = (List) obj2;
                        synchronized (list) {
                            list.remove(componentCallbacks);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        } else if (z4) {
            this.f2041d.destroy();
        }
        StringBuilder g5 = androidx.activity.d.g("X5 GUID = ");
        g5.append(QbSdk.b());
        TbsLog.i("WebView", g5.toString());
    }

    private boolean a(Context context) {
        try {
            return context.getPackageName().indexOf(TbsConfig.APP_QQ) >= 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private boolean a(View view) {
        Object a5;
        Context context = this.f2044g;
        if ((context == null || getTbsCoreVersion(context) <= 36200) && (a5 = com.tencent.smtt.utils.j.a(this.f2055w, "onLongClick", (Class<?>[]) new Class[]{View.class}, view)) != null) {
            return ((Boolean) a5).booleanValue();
        }
        return false;
    }

    private boolean a(WebChromeClient webChromeClient) {
        if (webChromeClient == null) {
            return false;
        }
        boolean z4 = false;
        boolean z5 = false;
        for (Class<?> cls = webChromeClient.getClass(); cls != WebChromeClient.class && (!z4 || !z5); cls = cls.getSuperclass()) {
            if (!z4) {
                try {
                    cls.getDeclaredMethod("onShowCustomView", View.class, IX5WebChromeClient.CustomViewCallback.class);
                    z4 = true;
                } catch (NoSuchMethodException unused) {
                }
            }
            if (!z5) {
                try {
                    cls.getDeclaredMethod("onHideCustomView", new Class[0]);
                    z5 = true;
                } catch (NoSuchMethodException unused2) {
                }
            }
        }
        return z4 && z5;
    }

    private void b(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        u a5 = u.a();
        a5.a(context);
        this.f2045h.b(System.currentTimeMillis() - currentTimeMillis);
        this.f2040c = a5.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context c(Context context) {
        return Build.VERSION.SDK_INT <= 22 ? context.createConfigurationContext(new Configuration()) : context;
    }

    public static void c() {
        try {
            new Thread(new Runnable() { // from class: com.tencent.smtt.sdk.WebView.8
                @Override // java.lang.Runnable
                public void run() {
                    if (WebView.f2033i == null) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--mAppContext == null");
                        return;
                    }
                    f a5 = f.a(true);
                    if (f.f2122b) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--needReboot = true");
                        return;
                    }
                    l a6 = l.a(WebView.f2033i);
                    int c5 = a6.c();
                    TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--installStatus = " + c5);
                    if (c5 == 2) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--install setTbsNeedReboot true");
                        a5.a(String.valueOf(a6.b()));
                        a5.b(true);
                        return;
                    }
                    int b5 = a6.b("copy_status");
                    TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copyStatus = " + b5);
                    if (b5 == 1) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copy setTbsNeedReboot true");
                        a5.a(String.valueOf(a6.c("copy_core_ver")));
                        a5.b(true);
                    } else {
                        if (u.a().b()) {
                            return;
                        }
                        if (c5 == 3 || b5 == 3) {
                            TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--setTbsNeedReboot true");
                            a5.a(String.valueOf(f.d()));
                            a5.b(true);
                        }
                    }
                }
            }).start();
        } catch (Throwable th) {
            TbsLog.e("webview", "updateRebootStatus excpetion: " + th);
        }
    }

    @Deprecated
    public static void disablePlatformNotifications() {
        if (u.a().b()) {
            return;
        }
        com.tencent.smtt.utils.j.a("android.webkit.WebView", "disablePlatformNotifications");
    }

    @Deprecated
    public static void enablePlatformNotifications() {
        if (u.a().b()) {
            return;
        }
        com.tencent.smtt.utils.j.a("android.webkit.WebView", "enablePlatformNotifications");
    }

    @Deprecated
    public static String findAddress(String str) {
        if (u.a().b()) {
            return null;
        }
        return android.webkit.WebView.findAddress(str);
    }

    private void g() {
        if (!this.f2046j && this.f2038a != 0) {
            j();
        }
        if (this.f2040c) {
            this.f2041d.destroy();
            return;
        }
        this.f2042e.destroy();
        try {
            TbsLog.i("sdkreport", "webview.destroyImplNow mQQMusicCrashFix is " + this.f2047k);
            if (this.f2047k) {
                return;
            }
            Field declaredField = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
            declaredField.setAccessible(true);
            ComponentCallbacks componentCallbacks = (ComponentCallbacks) declaredField.get(null);
            if (componentCallbacks != null) {
                declaredField.set(null, null);
                Field declaredField2 = Class.forName("android.view.ViewRoot").getDeclaredField("sConfigCallbacks");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(null);
                if (obj != null) {
                    List list = (List) obj;
                    synchronized (list) {
                        list.remove(componentCallbacks);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static String getCrashExtraCacheInfo(Context context) {
        Map<String, Object> map;
        if (context == null) {
            return "";
        }
        StringBuilder g5 = androidx.activity.d.g("tbs_core_version:");
        g5.append(QbSdk.getTbsVersionForCrash(context));
        g5.append(";");
        g5.append("tbs_sdk_version:");
        g5.append(44286);
        g5.append(";");
        String sb = g5.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.a(true).f());
        sb2.append("\n");
        sb2.append(sb);
        if (!TbsShareManager.isThirdPartyApp(context) && (map = QbSdk.f1822o) != null && map.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY) && QbSdk.f1822o.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY)) {
            StringBuilder g6 = androidx.activity.d.g("weapp_id:");
            g6.append(QbSdk.f1822o.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY));
            g6.append(";");
            g6.append(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY);
            g6.append(":");
            g6.append(QbSdk.f1822o.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY));
            g6.append(";");
            String sb3 = g6.toString();
            sb2.append("\n");
            sb2.append(sb3);
        }
        return sb2.length() > 8192 ? sb2.substring(sb2.length() - 8192) : sb2.toString();
    }

    public static String getCrashExtraMessage(Context context) {
        Map<String, Object> map;
        if (context == null) {
            return "";
        }
        StringBuilder g5 = androidx.activity.d.g("tbs_core_version:");
        g5.append(QbSdk.getTbsVersionForCrash(context));
        g5.append(";");
        g5.append("tbs_sdk_version:");
        g5.append(44286);
        g5.append(";");
        String sb = g5.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.a(true).e());
        sb2.append("\n");
        sb2.append(sb);
        if (!TbsShareManager.isThirdPartyApp(context) && (map = QbSdk.f1822o) != null && map.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY) && QbSdk.f1822o.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY)) {
            StringBuilder g6 = androidx.activity.d.g("weapp_id:");
            g6.append(QbSdk.f1822o.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY));
            g6.append(";");
            g6.append(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY);
            g6.append(":");
            g6.append(QbSdk.f1822o.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY));
            g6.append(";");
            String sb3 = g6.toString();
            sb2.append("\n");
            sb2.append(sb3);
        }
        return sb2.length() > 8192 ? sb2.substring(sb2.length() - 8192) : sb2.toString();
    }

    public static PackageInfo getCurrentWebViewPackage() {
        if (u.a().b() || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            return (PackageInfo) com.tencent.smtt.utils.j.a("android.webkit.WebView", "getCurrentWebViewPackage");
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public static synchronized Object getPluginList() {
        synchronized (WebView.class) {
            if (u.a().b()) {
                return null;
            }
            return com.tencent.smtt.utils.j.a("android.webkit.WebView", "getPluginList");
        }
    }

    public static int getTbsCoreVersion(Context context) {
        return QbSdk.getTbsVersion(context);
    }

    public static boolean getTbsNeedReboot() {
        c();
        return f.a(true).g();
    }

    public static int getTbsSDKVersion(Context context) {
        return 44286;
    }

    private void h() {
        try {
            if ("com.xunmeng.pinduoduo".equals(this.f2044g.getApplicationInfo().packageName)) {
                new Thread("WebviewDestroy") { // from class: com.tencent.smtt.sdk.WebView.2
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        WebView.this.a(false);
                    }
                }.start();
                if (this.f2040c) {
                    this.f2041d.destroy();
                } else {
                    this.f2042e.destroy();
                }
            } else {
                a(true);
            }
        } catch (Throwable unused) {
            a(true);
        }
    }

    public static boolean hasCreatedSysWebViewInstance() {
        return mSysWebviewCreated;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long i() {
        long j5;
        synchronized (QbSdk.f1815h) {
            if (QbSdk.f1812e) {
                QbSdk.f1814g = (System.currentTimeMillis() - QbSdk.f1813f) + QbSdk.f1814g;
                TbsLog.d("sdkreport", "pv report, WebView.getWifiConnectedTime QbSdk.sWifiConnectedTime=" + QbSdk.f1814g);
            }
            j5 = QbSdk.f1814g / 1000;
            QbSdk.f1814g = 0L;
            QbSdk.f1813f = System.currentTimeMillis();
        }
        return j5;
    }

    private void j() {
        Runnable runnable = new Runnable() { // from class: com.tencent.smtt.sdk.WebView.7
            @Override // java.lang.Runnable
            public void run() {
                boolean z4;
                Bundle sdkQBStatisticsInfo;
                if (WebView.this.f2046j || WebView.this.f2038a == 0) {
                    return;
                }
                synchronized (WebView.this) {
                    if (!WebView.this.f2046j && WebView.this.f2038a != 0) {
                        WebView.this.f2046j = true;
                        String str = "";
                        String str2 = "";
                        String str3 = "";
                        if (WebView.this.f2040c && (sdkQBStatisticsInfo = WebView.this.f2041d.getX5WebViewExtension().getSdkQBStatisticsInfo()) != null) {
                            str = sdkQBStatisticsInfo.getString("guid");
                            str2 = sdkQBStatisticsInfo.getString("qua2");
                            str3 = sdkQBStatisticsInfo.getString("lc");
                        }
                        String str4 = str2;
                        String str5 = str3;
                        String str6 = str;
                        try {
                            z4 = WebView.this.f2041d.getX5WebViewExtension().isX5CoreSandboxMode();
                        } catch (Throwable th) {
                            TbsLog.w("onVisibilityChanged", "exception: " + th);
                            z4 = false;
                        }
                        com.tencent.smtt.sdk.stat.b.a(WebView.this.f2044g, str6, str4, str5, WebView.this.f2038a, WebView.this.f2040c, WebView.this.i(), z4);
                        WebView.this.f2038a = 0;
                        WebView.this.f2046j = false;
                    }
                }
            }
        };
        Handler tbsLogHandler = TbsLog.getTbsLogHandler();
        if (tbsLogHandler != null) {
            Message obtain = Message.obtain(tbsLogHandler, 501);
            obtain.obj = runnable;
            obtain.sendToTarget();
        } else {
            Thread thread = new Thread(runnable);
            thread.setName("TbsPV");
            thread.start();
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                com.tencent.smtt.utils.j.a(Class.forName("android.webkit.WebView"), "setDataDirectorySuffix", (Class<?>[]) new Class[]{String.class}, str);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data_directory_suffix", str);
        QbSdk.initTbsSettings(hashMap);
    }

    public static synchronized void setSysDayOrNight(boolean z4) {
        int i5;
        Paint paint;
        synchronized (WebView.class) {
            if (z4 == f2037v) {
                return;
            }
            f2037v = z4;
            if (f2036u == null) {
                Paint paint2 = new Paint();
                f2036u = paint2;
                paint2.setColor(-16777216);
            }
            if (z4) {
                i5 = 255;
                if (f2036u.getAlpha() != 255) {
                    paint = f2036u;
                    paint.setAlpha(i5);
                }
                return;
            }
            int alpha = f2036u.getAlpha();
            i5 = NIGHT_MODE_ALPHA;
            if (alpha != i5) {
                paint = f2036u;
                paint.setAlpha(i5);
            }
            return;
        }
    }

    public static void setWebContentsDebuggingEnabled(boolean z4) {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            a5.c().a(z4);
            return;
        }
        try {
            Method declaredMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("setWebContentsDebuggingEnabled", Boolean.TYPE);
            f2034l = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                f2034l.invoke(null, Boolean.valueOf(z4));
            }
        } catch (Exception e5) {
            StringBuilder g5 = androidx.activity.d.g("Exception:");
            g5.append(e5.getStackTrace());
            TbsLog.e("QbSdk", g5.toString());
            e5.printStackTrace();
        }
    }

    public android.webkit.WebView a() {
        if (this.f2040c) {
            return null;
        }
        return this.f2042e;
    }

    public void a(android.webkit.WebView webView) {
    }

    public void a(IX5WebViewBase iX5WebViewBase) {
        this.f2041d = iX5WebViewBase;
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (this.f2040c) {
            this.f2041d.addJavascriptInterface(obj, str);
        } else {
            this.f2042e.addJavascriptInterface(obj, str);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (!this.f2040c) {
            this.f2042e.addView(view);
            return;
        }
        View view2 = this.f2041d.getView();
        try {
            Method a5 = com.tencent.smtt.utils.j.a(view2, "addView", View.class);
            a5.setAccessible(true);
            a5.invoke(view2, view);
        } catch (Throwable unused) {
        }
    }

    public IX5WebViewBase b() {
        return this.f2041d;
    }

    public boolean canGoBack() {
        return !this.f2040c ? this.f2042e.canGoBack() : this.f2041d.canGoBack();
    }

    public boolean canGoBackOrForward(int i5) {
        return !this.f2040c ? this.f2042e.canGoBackOrForward(i5) : this.f2041d.canGoBackOrForward(i5);
    }

    public boolean canGoForward() {
        return !this.f2040c ? this.f2042e.canGoForward() : this.f2041d.canGoForward();
    }

    @Deprecated
    public boolean canZoomIn() {
        if (this.f2040c) {
            return this.f2041d.canZoomIn();
        }
        Object a5 = com.tencent.smtt.utils.j.a(this.f2042e, "canZoomIn");
        if (a5 == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    @Deprecated
    public boolean canZoomOut() {
        if (this.f2040c) {
            return this.f2041d.canZoomOut();
        }
        Object a5 = com.tencent.smtt.utils.j.a(this.f2042e, "canZoomOut");
        if (a5 == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    @Deprecated
    public Picture capturePicture() {
        if (this.f2040c) {
            return this.f2041d.capturePicture();
        }
        Object a5 = com.tencent.smtt.utils.j.a(this.f2042e, "capturePicture");
        if (a5 == null) {
            return null;
        }
        return (Picture) a5;
    }

    public void clearCache(boolean z4) {
        if (this.f2040c) {
            this.f2041d.clearCache(z4);
        } else {
            this.f2042e.clearCache(z4);
        }
    }

    public void clearFormData() {
        if (this.f2040c) {
            this.f2041d.clearFormData();
        } else {
            this.f2042e.clearFormData();
        }
    }

    public void clearHistory() {
        if (this.f2040c) {
            this.f2041d.clearHistory();
        } else {
            this.f2042e.clearHistory();
        }
    }

    @TargetApi(3)
    public void clearMatches() {
        if (this.f2040c) {
            this.f2041d.clearMatches();
        } else {
            this.f2042e.clearMatches();
        }
    }

    public void clearSslPreferences() {
        if (this.f2040c) {
            this.f2041d.clearSslPreferences();
        } else {
            this.f2042e.clearSslPreferences();
        }
    }

    @Deprecated
    public void clearView() {
        if (this.f2040c) {
            this.f2041d.clearView();
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "clearView");
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        try {
            if (this.f2040c) {
                Method a5 = com.tencent.smtt.utils.j.a(this.f2041d.getView(), "computeHorizontalScrollExtent", new Class[0]);
                a5.setAccessible(true);
                return ((Integer) a5.invoke(this.f2041d.getView(), new Object[0])).intValue();
            }
            Method a6 = com.tencent.smtt.utils.j.a(this.f2042e, "computeHorizontalScrollExtent", new Class[0]);
            a6.setAccessible(true);
            return ((Integer) a6.invoke(this.f2042e, new Object[0])).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        try {
            if (this.f2040c) {
                Method a5 = com.tencent.smtt.utils.j.a(this.f2041d.getView(), "computeHorizontalScrollOffset", new Class[0]);
                a5.setAccessible(true);
                return ((Integer) a5.invoke(this.f2041d.getView(), new Object[0])).intValue();
            }
            Method a6 = com.tencent.smtt.utils.j.a(this.f2042e, "computeHorizontalScrollOffset", new Class[0]);
            a6.setAccessible(true);
            return ((Integer) a6.invoke(this.f2042e, new Object[0])).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        try {
            if (this.f2040c) {
                return ((Integer) com.tencent.smtt.utils.j.a(this.f2041d.getView(), "computeHorizontalScrollRange", (Class<?>[]) new Class[0], new Object[0])).intValue();
            }
            Method a5 = com.tencent.smtt.utils.j.a(this.f2042e, "computeHorizontalScrollRange", new Class[0]);
            a5.setAccessible(true);
            return ((Integer) a5.invoke(this.f2042e, new Object[0])).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f2040c) {
            this.f2041d.computeScroll();
        } else {
            this.f2042e.computeScroll();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        try {
            if (this.f2040c) {
                Method a5 = com.tencent.smtt.utils.j.a(this.f2041d.getView(), "computeVerticalScrollExtent", new Class[0]);
                a5.setAccessible(true);
                return ((Integer) a5.invoke(this.f2041d.getView(), new Object[0])).intValue();
            }
            Method a6 = com.tencent.smtt.utils.j.a(this.f2042e, "computeVerticalScrollExtent", new Class[0]);
            a6.setAccessible(true);
            return ((Integer) a6.invoke(this.f2042e, new Object[0])).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        try {
            if (this.f2040c) {
                Method a5 = com.tencent.smtt.utils.j.a(this.f2041d.getView(), "computeVerticalScrollOffset", new Class[0]);
                a5.setAccessible(true);
                return ((Integer) a5.invoke(this.f2041d.getView(), new Object[0])).intValue();
            }
            Method a6 = com.tencent.smtt.utils.j.a(this.f2042e, "computeVerticalScrollOffset", new Class[0]);
            a6.setAccessible(true);
            return ((Integer) a6.invoke(this.f2042e, new Object[0])).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        try {
            if (this.f2040c) {
                return ((Integer) com.tencent.smtt.utils.j.a(this.f2041d.getView(), "computeVerticalScrollRange", (Class<?>[]) new Class[0], new Object[0])).intValue();
            }
            Method a5 = com.tencent.smtt.utils.j.a(this.f2042e, "computeVerticalScrollRange", new Class[0]);
            a5.setAccessible(true);
            return ((Integer) a5.invoke(this.f2042e, new Object[0])).intValue();
        } catch (Exception e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public WebBackForwardList copyBackForwardList() {
        return this.f2040c ? WebBackForwardList.a(this.f2041d.copyBackForwardList()) : WebBackForwardList.a(this.f2042e.copyBackForwardList());
    }

    public Object createPrintDocumentAdapter(String str) {
        if (!this.f2040c) {
            return com.tencent.smtt.utils.j.a(this.f2042e, "createPrintDocumentAdapter", (Class<?>[]) new Class[]{String.class}, str);
        }
        try {
            return this.f2041d.createPrintDocumentAdapter(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void customDiskCachePathEnabled(boolean z4, String str) {
        if (!this.f2040c || getX5WebViewExtension() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabled", z4);
        bundle.putString("path", str);
        getX5WebViewExtension().invokeMiscMethod("customDiskCachePathEnabled", bundle);
    }

    public void destroy() {
        int i5;
        boolean z4 = false;
        this.f2047k = false;
        try {
            if (this.f2044g.getApplicationInfo().packageName.contains("com.tencent.qqmusic") && ((i5 = Build.VERSION.SDK_INT) == 21 || i5 == 22)) {
                this.f2047k = true;
                z4 = true;
            }
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("stack is ");
            g5.append(Log.getStackTraceString(th));
            TbsLog.i("webview", g5.toString());
        }
        TbsLog.i("webview", "destroy forceDestoyOld is " + z4);
        if (z4) {
            h();
        } else {
            g();
        }
    }

    public void documentHasImages(Message message) {
        if (this.f2040c) {
            this.f2041d.documentHasImages(message);
        } else {
            this.f2042e.documentHasImages(message);
        }
    }

    public void dumpViewHierarchyWithProperties(BufferedWriter bufferedWriter, int i5) {
        if (this.f2040c) {
            this.f2041d.dumpViewHierarchyWithProperties(bufferedWriter, i5);
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "dumpViewHierarchyWithProperties", (Class<?>[]) new Class[]{BufferedWriter.class, Integer.TYPE}, bufferedWriter, Integer.valueOf(i5));
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.f2040c) {
            try {
                Method declaredMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("evaluateJavascript", String.class, android.webkit.ValueCallback.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.f2042e, str, valueCallback);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        try {
            Method a5 = com.tencent.smtt.utils.j.a(this.f2041d.getView(), "evaluateJavascript", String.class, android.webkit.ValueCallback.class);
            a5.setAccessible(true);
            a5.invoke(this.f2041d.getView(), str, valueCallback);
        } catch (Exception e6) {
            e6.printStackTrace();
            loadUrl(str);
        }
    }

    @Deprecated
    public int findAll(String str) {
        if (this.f2040c) {
            return this.f2041d.findAll(str);
        }
        Object a5 = com.tencent.smtt.utils.j.a(this.f2042e, "findAll", (Class<?>[]) new Class[]{String.class}, str);
        if (a5 == null) {
            return 0;
        }
        return ((Integer) a5).intValue();
    }

    @TargetApi(16)
    public void findAllAsync(String str) {
        if (this.f2040c) {
            this.f2041d.findAllAsync(str);
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "findAllAsync", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    public View findHierarchyView(String str, int i5) {
        return !this.f2040c ? (View) com.tencent.smtt.utils.j.a(this.f2042e, "findHierarchyView", (Class<?>[]) new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(i5)) : this.f2041d.findHierarchyView(str, i5);
    }

    @TargetApi(3)
    public void findNext(boolean z4) {
        if (this.f2040c) {
            this.f2041d.findNext(z4);
        } else {
            this.f2042e.findNext(z4);
        }
    }

    public void flingScroll(int i5, int i6) {
        if (this.f2040c) {
            this.f2041d.flingScroll(i5, i6);
        } else {
            this.f2042e.flingScroll(i5, i6);
        }
    }

    @Deprecated
    public void freeMemory() {
        if (this.f2040c) {
            this.f2041d.freeMemory();
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "freeMemory");
        }
    }

    public SslCertificate getCertificate() {
        return !this.f2040c ? this.f2042e.getCertificate() : this.f2041d.getCertificate();
    }

    public int getContentHeight() {
        return !this.f2040c ? this.f2042e.getContentHeight() : this.f2041d.getContentHeight();
    }

    public int getContentWidth() {
        if (this.f2040c) {
            return this.f2041d.getContentWidth();
        }
        Object a5 = com.tencent.smtt.utils.j.a(this.f2042e, "getContentWidth");
        if (a5 == null) {
            return 0;
        }
        return ((Integer) a5).intValue();
    }

    public Bitmap getFavicon() {
        return !this.f2040c ? this.f2042e.getFavicon() : this.f2041d.getFavicon();
    }

    public HitTestResult getHitTestResult() {
        return !this.f2040c ? new HitTestResult(this.f2042e.getHitTestResult()) : new HitTestResult(this.f2041d.getHitTestResult());
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return !this.f2040c ? this.f2042e.getHttpAuthUsernamePassword(str, str2) : this.f2041d.getHttpAuthUsernamePassword(str, str2);
    }

    public boolean getIsX5Core() {
        return this.f2040c;
    }

    @TargetApi(3)
    public String getOriginalUrl() {
        return !this.f2040c ? this.f2042e.getOriginalUrl() : this.f2041d.getOriginalUrl();
    }

    public TbsWebViewPerformanceRecorder getPerformanceRecorder() {
        return this.f2045h;
    }

    public int getProgress() {
        return !this.f2040c ? this.f2042e.getProgress() : this.f2041d.getProgress();
    }

    public boolean getRendererPriorityWaivedWhenNotVisible() {
        Object a5;
        try {
            if (!this.f2040c && Build.VERSION.SDK_INT >= 26 && (a5 = com.tencent.smtt.utils.j.a(this.f2042e, "getRendererPriorityWaivedWhenNotVisible")) != null) {
                return ((Boolean) a5).booleanValue();
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public int getRendererRequestedPriority() {
        Object a5;
        try {
            if (!this.f2040c && Build.VERSION.SDK_INT >= 26 && (a5 = com.tencent.smtt.utils.j.a(this.f2042e, "getRendererRequestedPriority")) != null) {
                return ((Integer) a5).intValue();
            }
            return 0;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    @Deprecated
    public float getScale() {
        if (this.f2040c) {
            return this.f2041d.getScale();
        }
        Object a5 = com.tencent.smtt.utils.j.a(this.f2042e, "getScale");
        if (a5 == null) {
            return 0.0f;
        }
        return ((Float) a5).floatValue();
    }

    @Override // android.view.View
    public int getScrollBarDefaultDelayBeforeFade() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarDefaultDelayBeforeFade();
    }

    @Override // android.view.View
    public int getScrollBarFadeDuration() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarFadeDuration();
    }

    @Override // android.view.View
    public int getScrollBarSize() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarSize();
    }

    @Override // android.view.View
    public int getScrollBarStyle() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarStyle();
    }

    public WebSettings getSettings() {
        WebSettings webSettings = this.f2043f;
        if (webSettings != null) {
            return webSettings;
        }
        WebSettings webSettings2 = this.f2040c ? new WebSettings(this.f2041d.getSettings()) : new WebSettings(this.f2042e.getSettings());
        this.f2043f = webSettings2;
        return webSettings2;
    }

    public IX5WebSettingsExtension getSettingsExtension() {
        if (this.f2040c) {
            return this.f2041d.getX5WebViewExtension().getSettingsExtension();
        }
        return null;
    }

    public int getSysNightModeAlpha() {
        return NIGHT_MODE_ALPHA;
    }

    public String getTitle() {
        return !this.f2040c ? this.f2042e.getTitle() : this.f2041d.getTitle();
    }

    public String getUrl() {
        return !this.f2040c ? this.f2042e.getUrl() : this.f2041d.getUrl();
    }

    public View getView() {
        return !this.f2040c ? this.f2042e : this.f2041d.getView();
    }

    public int getVisibleTitleHeight() {
        if (this.f2040c) {
            return this.f2041d.getVisibleTitleHeight();
        }
        Object a5 = com.tencent.smtt.utils.j.a(this.f2042e, "getVisibleTitleHeight");
        if (a5 == null) {
            return 0;
        }
        return ((Integer) a5).intValue();
    }

    public WebChromeClient getWebChromeClient() {
        return this.f2049n;
    }

    public IX5WebChromeClientExtension getWebChromeClientExtension() {
        if (this.f2040c) {
            return this.f2041d.getX5WebViewExtension().getWebChromeClientExtension();
        }
        return null;
    }

    public int getWebScrollX() {
        return (this.f2040c ? this.f2041d.getView() : this.f2042e).getScrollX();
    }

    public int getWebScrollY() {
        return (this.f2040c ? this.f2041d.getView() : this.f2042e).getScrollY();
    }

    public WebViewClient getWebViewClient() {
        return this.f2048m;
    }

    public IX5WebViewClientExtension getWebViewClientExtension() {
        if (this.f2040c) {
            return this.f2041d.getX5WebViewExtension().getWebViewClientExtension();
        }
        return null;
    }

    public IX5WebViewBase.HitTestResult getX5HitTestResult() {
        if (this.f2040c) {
            return this.f2041d.getHitTestResult();
        }
        return null;
    }

    public IX5WebViewExtension getX5WebViewExtension() {
        if (this.f2040c) {
            return this.f2041d.getX5WebViewExtension();
        }
        return null;
    }

    @Deprecated
    public View getZoomControls() {
        return !this.f2040c ? (View) com.tencent.smtt.utils.j.a(this.f2042e, "getZoomControls") : this.f2041d.getZoomControls();
    }

    public void goBack() {
        if (this.f2040c) {
            this.f2041d.goBack();
        } else {
            this.f2042e.goBack();
        }
    }

    public void goBackOrForward(int i5) {
        if (this.f2040c) {
            this.f2041d.goBackOrForward(i5);
        } else {
            this.f2042e.goBackOrForward(i5);
        }
    }

    public void goForward() {
        if (this.f2040c) {
            this.f2041d.goForward();
        } else {
            this.f2042e.goForward();
        }
    }

    public void invokeZoomPicker() {
        if (this.f2040c) {
            this.f2041d.invokeZoomPicker();
        } else {
            this.f2042e.invokeZoomPicker();
        }
    }

    public boolean isDayMode() {
        return f2037v;
    }

    public boolean isPrivateBrowsingEnabled() {
        if (this.f2040c) {
            return this.f2041d.isPrivateBrowsingEnable();
        }
        Object a5 = com.tencent.smtt.utils.j.a(this.f2042e, "isPrivateBrowsingEnabled");
        if (a5 == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    public void loadData(String str, String str2, String str3) {
        if (this.f2040c) {
            this.f2041d.loadData(str, str2, str3);
        } else {
            this.f2042e.loadData(str, str2, str3);
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.f2040c) {
            this.f2041d.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            this.f2042e.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    public void loadUrl(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null || showDebugView(str)) {
            return;
        }
        if (this.f2040c) {
            this.f2041d.loadUrl(str);
        } else {
            this.f2042e.loadUrl(str);
        }
        this.f2045h.a(System.currentTimeMillis() - currentTimeMillis, str);
    }

    @TargetApi(8)
    public void loadUrl(String str, Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null || showDebugView(str)) {
            return;
        }
        if (this.f2040c) {
            this.f2041d.loadUrl(str, map);
        } else {
            this.f2042e.loadUrl(str, map);
        }
        this.f2045h.a(System.currentTimeMillis() - currentTimeMillis, str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2046j || this.f2038a == 0) {
            return;
        }
        j();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.f2056x;
        if (onLongClickListener == null || !onLongClickListener.onLongClick(view)) {
            return a(view);
        }
        return true;
    }

    public void onPause() {
        if (this.f2040c) {
            this.f2041d.onPause();
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "onPause");
        }
    }

    public void onResume() {
        if (this.f2040c) {
            this.f2041d.onResume();
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "onResume");
        }
    }

    @Override // android.view.View
    @TargetApi(11)
    public void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        if (!a(this.f2044g) || !isHardwareAccelerated() || i5 <= 0 || i6 <= 0) {
            return;
        }
        getLayerType();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i5) {
        Context context = this.f2044g;
        if (context == null) {
            super.onVisibilityChanged(view, i5);
            return;
        }
        if (f2035o == null) {
            f2035o = context.getApplicationInfo().packageName;
        }
        String str = f2035o;
        if (str != null && (str.equals(TbsConfig.APP_WX) || f2035o.equals(TbsConfig.APP_QQ))) {
            super.onVisibilityChanged(view, i5);
            return;
        }
        if (i5 != 0 && !this.f2046j && this.f2038a != 0) {
            j();
        }
        super.onVisibilityChanged(view, i5);
    }

    public boolean overlayHorizontalScrollbar() {
        return !this.f2040c ? this.f2042e.overlayHorizontalScrollbar() : this.f2041d.overlayHorizontalScrollbar();
    }

    public boolean overlayVerticalScrollbar() {
        return this.f2040c ? this.f2041d.overlayVerticalScrollbar() : this.f2042e.overlayVerticalScrollbar();
    }

    public boolean pageDown(boolean z4) {
        return !this.f2040c ? this.f2042e.pageDown(z4) : this.f2041d.pageDown(z4, -1);
    }

    public boolean pageUp(boolean z4) {
        return !this.f2040c ? this.f2042e.pageUp(z4) : this.f2041d.pageUp(z4, -1);
    }

    public void pauseTimers() {
        if (this.f2040c) {
            this.f2041d.pauseTimers();
        } else {
            this.f2042e.pauseTimers();
        }
    }

    @TargetApi(5)
    public void postUrl(String str, byte[] bArr) {
        if (this.f2040c) {
            this.f2041d.postUrl(str, bArr);
        } else {
            this.f2042e.postUrl(str, bArr);
        }
    }

    @Deprecated
    public void refreshPlugins(boolean z4) {
        if (this.f2040c) {
            this.f2041d.refreshPlugins(z4);
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "refreshPlugins", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    public void reload() {
        if (this.f2040c) {
            this.f2041d.reload();
        } else {
            this.f2042e.reload();
        }
    }

    @TargetApi(11)
    public void removeJavascriptInterface(String str) {
        if (this.f2040c) {
            this.f2041d.removeJavascriptInterface(str);
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "removeJavascriptInterface", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (!this.f2040c) {
            this.f2042e.removeView(view);
            return;
        }
        View view2 = this.f2041d.getView();
        try {
            Method a5 = com.tencent.smtt.utils.j.a(view2, "removeView", View.class);
            a5.setAccessible(true);
            a5.invoke(view2, view);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public JSONObject reportInitPerformance(long j5, int i5, long j6, long j7) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        if (!this.f2040c) {
            a aVar = this.f2042e;
            if (view == this) {
                view = aVar;
            }
            return aVar.requestChildRectangleOnScreen(view, rect, z4);
        }
        View view2 = this.f2041d.getView();
        if (!(view2 instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        if (view == this) {
            view = view2;
        }
        return viewGroup.requestChildRectangleOnScreen(view, rect, z4);
    }

    public void requestFocusNodeHref(Message message) {
        if (this.f2040c) {
            this.f2041d.requestFocusNodeHref(message);
        } else {
            this.f2042e.requestFocusNodeHref(message);
        }
    }

    public void requestImageRef(Message message) {
        if (this.f2040c) {
            this.f2041d.requestImageRef(message);
        } else {
            this.f2042e.requestImageRef(message);
        }
    }

    @Deprecated
    public boolean restorePicture(Bundle bundle, File file) {
        if (this.f2040c) {
            return this.f2041d.restorePicture(bundle, file);
        }
        Object a5 = com.tencent.smtt.utils.j.a(this.f2042e, "restorePicture", (Class<?>[]) new Class[]{Bundle.class, File.class}, bundle, file);
        if (a5 == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        return !this.f2040c ? WebBackForwardList.a(this.f2042e.restoreState(bundle)) : WebBackForwardList.a(this.f2041d.restoreState(bundle));
    }

    public void resumeTimers() {
        if (this.f2040c) {
            this.f2041d.resumeTimers();
        } else {
            this.f2042e.resumeTimers();
        }
    }

    @Deprecated
    public void savePassword(String str, String str2, String str3) {
        if (this.f2040c) {
            this.f2041d.savePassword(str, str2, str3);
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "savePassword", (Class<?>[]) new Class[]{String.class, String.class, String.class}, str, str2, str3);
        }
    }

    @Deprecated
    public boolean savePicture(Bundle bundle, File file) {
        if (this.f2040c) {
            return this.f2041d.savePicture(bundle, file);
        }
        Object a5 = com.tencent.smtt.utils.j.a(this.f2042e, "savePicture", (Class<?>[]) new Class[]{Bundle.class, File.class}, bundle, file);
        if (a5 == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return !this.f2040c ? WebBackForwardList.a(this.f2042e.saveState(bundle)) : WebBackForwardList.a(this.f2041d.saveState(bundle));
    }

    @TargetApi(11)
    public void saveWebArchive(String str) {
        if (this.f2040c) {
            this.f2041d.saveWebArchive(str);
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "saveWebArchive", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    @TargetApi(11)
    public void saveWebArchive(String str, boolean z4, ValueCallback<String> valueCallback) {
        if (this.f2040c) {
            this.f2041d.saveWebArchive(str, z4, valueCallback);
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "saveWebArchive", (Class<?>[]) new Class[]{String.class, Boolean.TYPE, android.webkit.ValueCallback.class}, str, Boolean.valueOf(z4), valueCallback);
        }
    }

    public void setARModeEnable(boolean z4) {
        try {
            if (this.f2040c) {
                getSettingsExtension().setARModeEnable(z4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        if (this.f2040c) {
            this.f2041d.setBackgroundColor(i5);
        } else {
            this.f2042e.setBackgroundColor(i5);
        }
        super.setBackgroundColor(i5);
    }

    @Deprecated
    public void setCertificate(SslCertificate sslCertificate) {
        if (this.f2040c) {
            this.f2041d.setCertificate(sslCertificate);
        } else {
            this.f2042e.setCertificate(sslCertificate);
        }
    }

    public void setDayOrNight(boolean z4) {
        try {
            if (this.f2040c) {
                getSettingsExtension().setDayOrNight(z4);
            }
            setSysDayOrNight(z4);
            getView().postInvalidate();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setDownloadListener(final DownloadListener downloadListener) {
        boolean z4 = this.f2040c;
        if (z4) {
            this.f2041d.setDownloadListener(new b(this, downloadListener, z4));
        } else {
            this.f2042e.setDownloadListener(new android.webkit.DownloadListener() { // from class: com.tencent.smtt.sdk.WebView.4
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j5) {
                    DownloadListener downloadListener2 = downloadListener;
                    if (downloadListener2 != null) {
                        downloadListener2.onDownloadStart(str, str2, str3, str4, j5);
                        return;
                    }
                    ApplicationInfo applicationInfo = WebView.this.f2044g == null ? null : WebView.this.f2044g.getApplicationInfo();
                    if (applicationInfo == null || !TbsConfig.APP_WX.equals(applicationInfo.packageName)) {
                        MttLoader.loadUrl(WebView.this.f2044g, str, null, null);
                    }
                }
            });
        }
    }

    @TargetApi(16)
    public void setFindListener(final IX5WebViewBase.FindListener findListener) {
        if (this.f2040c) {
            this.f2041d.setFindListener(findListener);
        } else {
            this.f2042e.setFindListener(new WebView.FindListener() { // from class: com.tencent.smtt.sdk.WebView.3
                @Override // android.webkit.WebView.FindListener
                public void onFindResultReceived(int i5, int i6, boolean z4) {
                    findListener.onFindResultReceived(i5, i6, z4);
                }
            });
        }
    }

    public void setHorizontalScrollbarOverlay(boolean z4) {
        if (this.f2040c) {
            this.f2041d.setHorizontalScrollbarOverlay(z4);
        } else {
            this.f2042e.setHorizontalScrollbarOverlay(z4);
        }
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        if (this.f2040c) {
            this.f2041d.setHttpAuthUsernamePassword(str, str2, str3, str4);
        } else {
            this.f2042e.setHttpAuthUsernamePassword(str, str2, str3, str4);
        }
    }

    public void setInitialScale(int i5) {
        if (this.f2040c) {
            this.f2041d.setInitialScale(i5);
        } else {
            this.f2042e.setInitialScale(i5);
        }
    }

    @Deprecated
    public void setMapTrackballToArrowKeys(boolean z4) {
        if (this.f2040c) {
            this.f2041d.setMapTrackballToArrowKeys(z4);
        } else {
            com.tencent.smtt.utils.j.a(this.f2042e, "setMapTrackballToArrowKeys", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    public void setNetworkAvailable(boolean z4) {
        if (this.f2040c) {
            this.f2041d.setNetworkAvailable(z4);
        } else {
            this.f2042e.setNetworkAvailable(z4);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        if (!this.f2040c) {
            this.f2042e.setOnLongClickListener(onLongClickListener);
            return;
        }
        View view = this.f2041d.getView();
        try {
            if (this.f2055w == null) {
                Method a5 = com.tencent.smtt.utils.j.a(view, "getListenerInfo", new Class[0]);
                a5.setAccessible(true);
                Object invoke = a5.invoke(view, null);
                Field declaredField = invoke.getClass().getDeclaredField("mOnLongClickListener");
                declaredField.setAccessible(true);
                this.f2055w = declaredField.get(invoke);
            }
            this.f2056x = onLongClickListener;
            getView().setOnLongClickListener(this);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        getView().setOnTouchListener(onTouchListener);
    }

    @Deprecated
    public void setPictureListener(final PictureListener pictureListener) {
        if (this.f2040c) {
            if (pictureListener == null) {
                this.f2041d.setPictureListener(null);
                return;
            } else {
                this.f2041d.setPictureListener(new IX5WebViewBase.PictureListener() { // from class: com.tencent.smtt.sdk.WebView.6
                    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener
                    public void onNewPicture(IX5WebViewBase iX5WebViewBase, Picture picture, boolean z4) {
                        WebView.this.a(iX5WebViewBase);
                        pictureListener.onNewPicture(WebView.this, picture);
                    }

                    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener
                    public void onNewPictureIfHaveContent(IX5WebViewBase iX5WebViewBase, Picture picture) {
                    }
                });
                return;
            }
        }
        if (pictureListener == null) {
            this.f2042e.setPictureListener(null);
        } else {
            this.f2042e.setPictureListener(new WebView.PictureListener() { // from class: com.tencent.smtt.sdk.WebView.5
                @Override // android.webkit.WebView.PictureListener
                public void onNewPicture(android.webkit.WebView webView, Picture picture) {
                    WebView.this.a(webView);
                    pictureListener.onNewPicture(WebView.this, picture);
                }
            });
        }
    }

    public void setRendererPriorityPolicy(int i5, boolean z4) {
        try {
            if (this.f2040c || Build.VERSION.SDK_INT < 26) {
                return;
            }
            com.tencent.smtt.utils.j.a(this.f2042e, "setRendererPriorityPolicy", (Class<?>[]) new Class[]{Integer.TYPE, Boolean.TYPE}, Integer.valueOf(i5), Boolean.valueOf(z4));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.view.View
    public void setScrollBarStyle(int i5) {
        if (this.f2040c) {
            this.f2041d.getView().setScrollBarStyle(i5);
        } else {
            this.f2042e.setScrollBarStyle(i5);
        }
    }

    public void setSysNightModeAlpha(int i5) {
        NIGHT_MODE_ALPHA = i5;
    }

    public void setVerticalScrollbarOverlay(boolean z4) {
        if (this.f2040c) {
            this.f2041d.setVerticalScrollbarOverlay(z4);
        } else {
            this.f2042e.setVerticalScrollbarOverlay(z4);
        }
    }

    public boolean setVideoFullScreen(Context context, boolean z4) {
        if (!context.getApplicationInfo().processName.contains("com.tencent.android.qqdownloader") || this.f2041d == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        if (z4) {
            bundle.putInt("DefaultVideoScreen", 2);
        } else {
            bundle.putInt("DefaultVideoScreen", 1);
        }
        this.f2041d.getX5WebViewExtension().invokeMiscMethod("setVideoParams", bundle);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        if (getView() == null) {
            return;
        }
        getView().setVisibility(i5);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        a aVar;
        android.webkit.WebChromeClient webChromeClient2 = null;
        if (this.f2040c) {
            this.f2041d.setWebChromeClient(webChromeClient != null ? new h(u.a().a(true).i(), this, webChromeClient) : null);
        } else {
            if (webChromeClient == null) {
                aVar = this.f2042e;
            } else if (a(webChromeClient)) {
                aVar = this.f2042e;
                webChromeClient2 = new c(this, webChromeClient);
            } else {
                aVar = this.f2042e;
                webChromeClient2 = new SystemWebChromeClient(this, webChromeClient);
            }
            aVar.setWebChromeClient(webChromeClient2);
        }
        this.f2049n = webChromeClient;
    }

    public void setWebChromeClientExtension(IX5WebChromeClientExtension iX5WebChromeClientExtension) {
        if (this.f2040c) {
            this.f2041d.getX5WebViewExtension().setWebChromeClientExtension(iX5WebChromeClientExtension);
        }
    }

    public void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient) {
        this.mWebViewCallbackClient = webViewCallbackClient;
        if (!this.f2040c || getX5WebViewExtension() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("flag", true);
        getX5WebViewExtension().invokeMiscMethod("setWebViewCallbackClientFlag", bundle);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (this.f2040c) {
            this.f2041d.setWebViewClient(webViewClient != null ? new i(u.a().a(true).j(), this, webViewClient) : null);
        } else {
            this.f2042e.setWebViewClient(webViewClient != null ? new SystemWebViewClient(this, webViewClient) : null);
        }
        this.f2048m = webViewClient;
    }

    public void setWebViewClientExtension(IX5WebViewClientExtension iX5WebViewClientExtension) {
        if (this.f2040c) {
            this.f2041d.getX5WebViewExtension().setWebViewClientExtension(iX5WebViewClientExtension);
        }
    }

    @SuppressLint({"NewApi"})
    public boolean showDebugView(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("https://debugtbs.qq.com")) {
            getView().setVisibility(4);
            com.tencent.smtt.utils.d.a(this.f2044g).a(lowerCase, this, this.f2044g, TbsHandlerThread.getInstance().getLooper());
            return true;
        }
        if (!lowerCase.startsWith("https://debugx5.qq.com") || this.f2040c) {
            return false;
        }
        loadDataWithBaseURL(null, "<!DOCTYPE html><html><body><head><title>无法打开debugx5</title><meta name=\"viewport\" content=\"width=device-width, user-scalable=no\" /></head><br/><br /><h2>debugx5页面仅在使用了X5内核时有效，由于当前没有使用X5内核，无法打开debugx5！</h2><br />尝试<a href=\"https://debugtbs.qq.com?10000\">进入DebugTbs安装或打开X5内核</a></body></html>", "text/html", "utf-8", null);
        return true;
    }

    public boolean showFindDialog(String str, boolean z4) {
        return false;
    }

    public void stopLoading() {
        if (this.f2040c) {
            this.f2041d.stopLoading();
        } else {
            this.f2042e.stopLoading();
        }
    }

    public void super_computeScroll() {
        if (!this.f2040c) {
            this.f2042e.a();
            return;
        }
        try {
            com.tencent.smtt.utils.j.a(this.f2041d.getView(), "super_computeScroll");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean super_dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f2040c) {
            return this.f2042e.b(motionEvent);
        }
        try {
            Object a5 = com.tencent.smtt.utils.j.a(this.f2041d.getView(), "super_dispatchTouchEvent", (Class<?>[]) new Class[]{MotionEvent.class}, motionEvent);
            if (a5 == null) {
                return false;
            }
            return ((Boolean) a5).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean super_onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f2040c) {
            return this.f2042e.c(motionEvent);
        }
        try {
            Object a5 = com.tencent.smtt.utils.j.a(this.f2041d.getView(), "super_onInterceptTouchEvent", (Class<?>[]) new Class[]{MotionEvent.class}, motionEvent);
            if (a5 == null) {
                return false;
            }
            return ((Boolean) a5).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void super_onOverScrolled(int i5, int i6, boolean z4, boolean z5) {
        if (!this.f2040c) {
            this.f2042e.a(i5, i6, z4, z5);
            return;
        }
        View view = this.f2041d.getView();
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            com.tencent.smtt.utils.j.a(view, "super_onOverScrolled", (Class<?>[]) new Class[]{cls, cls, cls2, cls2}, Integer.valueOf(i5), Integer.valueOf(i6), Boolean.valueOf(z4), Boolean.valueOf(z5));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void super_onScrollChanged(int i5, int i6, int i7, int i8) {
        if (!this.f2040c) {
            this.f2042e.a(i5, i6, i7, i8);
            return;
        }
        View view = this.f2041d.getView();
        try {
            Class cls = Integer.TYPE;
            com.tencent.smtt.utils.j.a(view, "super_onScrollChanged", (Class<?>[]) new Class[]{cls, cls, cls, cls}, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean super_onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2040c) {
            return this.f2042e.a(motionEvent);
        }
        try {
            Object a5 = com.tencent.smtt.utils.j.a(this.f2041d.getView(), "super_onTouchEvent", (Class<?>[]) new Class[]{MotionEvent.class}, motionEvent);
            if (a5 == null) {
                return false;
            }
            return ((Boolean) a5).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean super_overScrollBy(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z4) {
        if (!this.f2040c) {
            return this.f2042e.a(i5, i6, i7, i8, i9, i10, i11, i12, z4);
        }
        View view = this.f2041d.getView();
        try {
            Class cls = Integer.TYPE;
            Object a5 = com.tencent.smtt.utils.j.a(view, "super_overScrollBy", (Class<?>[]) new Class[]{cls, cls, cls, cls, cls, cls, cls, cls, Boolean.TYPE}, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z4));
            if (a5 == null) {
                return false;
            }
            return ((Boolean) a5).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void switchNightMode(boolean z4) {
        String str;
        if (z4 == f2037v) {
            return;
        }
        f2037v = z4;
        if (z4) {
            TbsLog.e("QB_SDK", "deleteNightMode");
            str = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        } else {
            TbsLog.e("QB_SDK", "nightMode");
            str = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        }
        loadUrl(str);
    }

    public void switchToNightMode() {
        TbsLog.e("QB_SDK", "switchToNightMode 01");
        if (f2037v) {
            return;
        }
        TbsLog.e("QB_SDK", "switchToNightMode");
        loadUrl("javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);");
    }

    public boolean zoomIn() {
        return !this.f2040c ? this.f2042e.zoomIn() : this.f2041d.zoomIn();
    }

    public boolean zoomOut() {
        return !this.f2040c ? this.f2042e.zoomOut() : this.f2041d.zoomOut();
    }
}
