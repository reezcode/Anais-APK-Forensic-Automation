package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsVirtualMachine;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class X5JsCore {

    /* renamed from: a, reason: collision with root package name */
    private static a f2102a;

    /* renamed from: b, reason: collision with root package name */
    private static a f2103b;

    /* renamed from: c, reason: collision with root package name */
    private static a f2104c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f2105d;

    /* renamed from: e, reason: collision with root package name */
    private Object f2106e;

    /* renamed from: f, reason: collision with root package name */
    private WebView f2107f;

    /* loaded from: classes21.dex */
    public enum a {
        UNINITIALIZED,
        UNAVAILABLE,
        AVAILABLE
    }

    static {
        a aVar = a.UNINITIALIZED;
        f2102a = aVar;
        f2103b = aVar;
        f2104c = aVar;
    }

    @Deprecated
    public X5JsCore(Context context) {
        Object a5;
        this.f2106e = null;
        this.f2107f = null;
        this.f2105d = context;
        if (canUseX5JsCore(context) && (a5 = a("createX5JavaBridge", new Class[]{Context.class}, context)) != null) {
            this.f2106e = a5;
            return;
        }
        Log.e("X5JsCore", "X5JsCore create X5JavaBridge failure, use fallback!");
        WebView webView = new WebView(context);
        this.f2107f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
    }

    public static IX5JsVirtualMachine a(Context context, Looper looper) {
        Object a5;
        if (canUseX5JsCore(context) && (a5 = a("createX5JsVirtualMachine", new Class[]{Context.class, Looper.class}, context, looper)) != null) {
            return (IX5JsVirtualMachine) a5;
        }
        Log.e("X5JsCore", "X5JsCore#createVirtualMachine failure!");
        return null;
    }

    public static Object a() {
        return a("currentContextData", new Class[0], new Object[0]);
    }

    private static Object a(String str, Class<?>[] clsArr, Object... objArr) {
        try {
            u a5 = u.a();
            if (a5 != null && a5.b()) {
                return a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", str, clsArr, objArr);
            }
            Log.e("X5JsCore", "X5Jscore#" + str + " - x5CoreEngine is null or is not x5core.");
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static boolean canUseX5JsCore(Context context) {
        if (f2102a != a.UNINITIALIZED) {
            return f2102a == a.AVAILABLE;
        }
        f2102a = a.UNAVAILABLE;
        Object a5 = a("canUseX5JsCore", new Class[]{Context.class}, context);
        if (a5 == null || !(a5 instanceof Boolean) || !((Boolean) a5).booleanValue()) {
            return false;
        }
        a("setJsValueFactory", new Class[]{Object.class}, JsValue.a());
        f2102a = a.AVAILABLE;
        return true;
    }

    public static boolean canUseX5JsCoreNewAPI(Context context) {
        if (f2104c != a.UNINITIALIZED) {
            return f2104c == a.AVAILABLE;
        }
        f2104c = a.UNAVAILABLE;
        Object a5 = a("canUseX5JsCoreNewAPI", new Class[]{Context.class}, context);
        if (a5 == null || !(a5 instanceof Boolean) || !((Boolean) a5).booleanValue()) {
            return false;
        }
        f2104c = a.AVAILABLE;
        return true;
    }

    public static boolean canX5JsCoreUseNativeBuffer(Context context) {
        Object a5;
        if (f2103b != a.UNINITIALIZED) {
            return f2103b == a.AVAILABLE;
        }
        f2103b = a.UNAVAILABLE;
        if (!canUseX5JsCore(context) || (a5 = a("canX5JsCoreUseBuffer", new Class[]{Context.class}, context)) == null || !(a5 instanceof Boolean) || !((Boolean) a5).booleanValue()) {
            return false;
        }
        f2103b = a.AVAILABLE;
        return true;
    }

    @Deprecated
    public void addJavascriptInterface(Object obj, String str) {
        Object obj2 = this.f2106e;
        if (obj2 != null) {
            a("addJavascriptInterface", new Class[]{Object.class, String.class, Object.class}, obj, str, obj2);
            return;
        }
        WebView webView = this.f2107f;
        if (webView != null) {
            webView.addJavascriptInterface(obj, str);
            this.f2107f.loadUrl("about:blank");
        }
    }

    @Deprecated
    public void destroy() {
        Object obj = this.f2106e;
        if (obj != null) {
            a("destroyX5JsCore", new Class[]{Object.class}, obj);
            this.f2106e = null;
            return;
        }
        WebView webView = this.f2107f;
        if (webView != null) {
            webView.clearHistory();
            this.f2107f.clearCache(true);
            this.f2107f.loadUrl("about:blank");
            this.f2107f.freeMemory();
            this.f2107f.pauseTimers();
            this.f2107f.destroy();
            this.f2107f = null;
        }
    }

    @Deprecated
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        Object obj = this.f2106e;
        if (obj != null) {
            a("evaluateJavascript", new Class[]{String.class, android.webkit.ValueCallback.class, Object.class}, str, valueCallback, obj);
            return;
        }
        WebView webView = this.f2107f;
        if (webView != null) {
            webView.evaluateJavascript(str, valueCallback);
        }
    }

    @Deprecated
    public ByteBuffer getNativeBuffer(int i5) {
        Object a5;
        if (this.f2106e == null || !canX5JsCoreUseNativeBuffer(this.f2105d) || (a5 = a("getNativeBuffer", new Class[]{Object.class, Integer.TYPE}, this.f2106e, Integer.valueOf(i5))) == null || !(a5 instanceof ByteBuffer)) {
            return null;
        }
        return (ByteBuffer) a5;
    }

    @Deprecated
    public int getNativeBufferId() {
        Object a5;
        if (this.f2106e == null || !canX5JsCoreUseNativeBuffer(this.f2105d) || (a5 = a("getNativeBufferId", new Class[]{Object.class}, this.f2106e)) == null || !(a5 instanceof Integer)) {
            return -1;
        }
        return ((Integer) a5).intValue();
    }

    @Deprecated
    public void pause() {
        Object obj = this.f2106e;
        if (obj != null) {
            a("pause", new Class[]{Object.class}, obj);
        }
    }

    @Deprecated
    public void pauseTimers() {
        Object obj = this.f2106e;
        if (obj != null) {
            a("pauseTimers", new Class[]{Object.class}, obj);
        }
    }

    @Deprecated
    public void removeJavascriptInterface(String str) {
        Object obj = this.f2106e;
        if (obj != null) {
            a("removeJavascriptInterface", new Class[]{String.class, Object.class}, str, obj);
            return;
        }
        WebView webView = this.f2107f;
        if (webView != null) {
            webView.removeJavascriptInterface(str);
        }
    }

    @Deprecated
    public void resume() {
        Object obj = this.f2106e;
        if (obj != null) {
            a("resume", new Class[]{Object.class}, obj);
        }
    }

    @Deprecated
    public void resumeTimers() {
        Object obj = this.f2106e;
        if (obj != null) {
            a("resumeTimers", new Class[]{Object.class}, obj);
        }
    }

    @Deprecated
    public void setNativeBuffer(int i5, ByteBuffer byteBuffer) {
        if (this.f2106e == null || !canX5JsCoreUseNativeBuffer(this.f2105d)) {
            return;
        }
        a("setNativeBuffer", new Class[]{Object.class, Integer.TYPE, ByteBuffer.class}, this.f2106e, Integer.valueOf(i5), byteBuffer);
    }
}
