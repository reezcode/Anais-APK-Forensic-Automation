package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class JsValue {

    /* renamed from: a, reason: collision with root package name */
    private final JsContext f1790a;

    /* renamed from: b, reason: collision with root package name */
    private final IX5JsValue f1791b;

    /* loaded from: classes17.dex */
    public static class a implements IX5JsValue.JsValueFactory {
        private a() {
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue.JsValueFactory
        public String getJsValueClassName() {
            return JsValue.class.getName();
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue.JsValueFactory
        public IX5JsValue unwrap(Object obj) {
            if (obj == null || !(obj instanceof JsValue)) {
                return null;
            }
            return ((JsValue) obj).f1791b;
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue.JsValueFactory
        public Object wrap(IX5JsValue iX5JsValue) {
            JsContext current;
            if (iX5JsValue == null || (current = JsContext.current()) == null) {
                return null;
            }
            return new JsValue(current, iX5JsValue);
        }
    }

    public JsValue(JsContext jsContext, IX5JsValue iX5JsValue) {
        this.f1790a = jsContext;
        this.f1791b = iX5JsValue;
    }

    public static IX5JsValue.JsValueFactory a() {
        return new a();
    }

    private JsValue a(IX5JsValue iX5JsValue) {
        if (iX5JsValue == null) {
            return null;
        }
        return new JsValue(this.f1790a, iX5JsValue);
    }

    public JsValue call(Object... objArr) {
        return a(this.f1791b.call(objArr));
    }

    public JsValue construct(Object... objArr) {
        return a(this.f1791b.construct(objArr));
    }

    public JsContext context() {
        return this.f1790a;
    }

    public boolean isArray() {
        return this.f1791b.isArray();
    }

    public boolean isArrayBufferOrArrayBufferView() {
        return this.f1791b.isArrayBufferOrArrayBufferView();
    }

    public boolean isBoolean() {
        return this.f1791b.isBoolean();
    }

    public boolean isFunction() {
        return this.f1791b.isFunction();
    }

    public boolean isInteger() {
        return this.f1791b.isInteger();
    }

    public boolean isJavascriptInterface() {
        return this.f1791b.isJavascriptInterface();
    }

    public boolean isNull() {
        return this.f1791b.isNull();
    }

    public boolean isNumber() {
        return this.f1791b.isNumber();
    }

    public boolean isObject() {
        return this.f1791b.isObject();
    }

    public boolean isPromise() {
        return this.f1791b.isPromise();
    }

    public boolean isString() {
        return this.f1791b.isString();
    }

    public boolean isUndefined() {
        return this.f1791b.isUndefined();
    }

    public void reject(Object obj) {
        this.f1791b.resolveOrReject(obj, false);
    }

    public void resolve(Object obj) {
        this.f1791b.resolveOrReject(obj, true);
    }

    public boolean toBoolean() {
        return this.f1791b.toBoolean();
    }

    public ByteBuffer toByteBuffer() {
        return this.f1791b.toByteBuffer();
    }

    public int toInteger() {
        return this.f1791b.toInteger();
    }

    public Object toJavascriptInterface() {
        return this.f1791b.toJavascriptInterface();
    }

    public Number toNumber() {
        return this.f1791b.toNumber();
    }

    public <T> T toObject(Class<T> cls) {
        return (T) this.f1791b.toObject(cls);
    }

    public String toString() {
        return this.f1791b.toString();
    }
}
