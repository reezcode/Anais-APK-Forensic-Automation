package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsError;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue;
import java.net.URL;

/* loaded from: classes7.dex */
public final class JsContext {

    /* renamed from: a, reason: collision with root package name */
    private final JsVirtualMachine f1782a;

    /* renamed from: b, reason: collision with root package name */
    private final IX5JsContext f1783b;

    /* renamed from: c, reason: collision with root package name */
    private ExceptionHandler f1784c;

    /* renamed from: d, reason: collision with root package name */
    private String f1785d;

    /* loaded from: classes12.dex */
    public interface ExceptionHandler {
        void handleException(JsContext jsContext, JsError jsError);
    }

    public JsContext(Context context) {
        this(new JsVirtualMachine(context));
    }

    public JsContext(JsVirtualMachine jsVirtualMachine) {
        if (jsVirtualMachine == null) {
            throw new IllegalArgumentException("The virtualMachine value can not be null");
        }
        this.f1782a = jsVirtualMachine;
        IX5JsContext a5 = jsVirtualMachine.a();
        this.f1783b = a5;
        try {
            a5.setPerContextData(this);
        } catch (AbstractMethodError unused) {
        }
    }

    public static JsContext current() {
        return (JsContext) X5JsCore.a();
    }

    public void addJavascriptInterface(Object obj, String str) {
        this.f1783b.addJavascriptInterface(obj, str);
    }

    public void destroy() {
        this.f1783b.destroy();
    }

    public void evaluateJavascript(String str, android.webkit.ValueCallback<String> valueCallback) {
        evaluateJavascript(str, valueCallback, null);
    }

    public void evaluateJavascript(String str, android.webkit.ValueCallback<String> valueCallback, URL url) {
        this.f1783b.evaluateJavascript(str, valueCallback, url);
    }

    public JsValue evaluateScript(String str) {
        return evaluateScript(str, null);
    }

    public JsValue evaluateScript(String str, URL url) {
        IX5JsValue evaluateScript = this.f1783b.evaluateScript(str, url);
        if (evaluateScript == null) {
            return null;
        }
        return new JsValue(this, evaluateScript);
    }

    public void evaluateScriptAsync(String str, final android.webkit.ValueCallback<JsValue> valueCallback, URL url) {
        this.f1783b.evaluateScriptAsync(str, valueCallback == null ? null : new android.webkit.ValueCallback<IX5JsValue>() { // from class: com.tencent.smtt.sdk.JsContext.1
            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(IX5JsValue iX5JsValue) {
                valueCallback.onReceiveValue(iX5JsValue == null ? null : new JsValue(JsContext.this, iX5JsValue));
            }
        }, url);
    }

    public ExceptionHandler exceptionHandler() {
        return this.f1784c;
    }

    public byte[] getNativeBuffer(int i5) {
        return this.f1783b.getNativeBuffer(i5);
    }

    public int getNativeBufferId() {
        return this.f1783b.getNativeBufferId();
    }

    public String name() {
        return this.f1785d;
    }

    public void removeJavascriptInterface(String str) {
        this.f1783b.removeJavascriptInterface(str);
    }

    public void setExceptionHandler(ExceptionHandler exceptionHandler) {
        IX5JsContext iX5JsContext;
        android.webkit.ValueCallback<IX5JsError> valueCallback;
        this.f1784c = exceptionHandler;
        if (exceptionHandler == null) {
            iX5JsContext = this.f1783b;
            valueCallback = null;
        } else {
            iX5JsContext = this.f1783b;
            valueCallback = new android.webkit.ValueCallback<IX5JsError>() { // from class: com.tencent.smtt.sdk.JsContext.2
                @Override // android.webkit.ValueCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onReceiveValue(IX5JsError iX5JsError) {
                    JsContext.this.f1784c.handleException(JsContext.this, new JsError(iX5JsError));
                }
            };
        }
        iX5JsContext.setExceptionHandler(valueCallback);
    }

    public void setName(String str) {
        this.f1785d = str;
        this.f1783b.setName(str);
    }

    public int setNativeBuffer(int i5, byte[] bArr) {
        return this.f1783b.setNativeBuffer(i5, bArr);
    }

    public void stealValueFromOtherCtx(String str, JsContext jsContext, String str2) {
        this.f1783b.stealValueFromOtherCtx(str, jsContext.f1783b, str2);
    }

    public JsVirtualMachine virtualMachine() {
        return this.f1782a;
    }
}
