package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.jscore.interfaces.IX5JsError;

/* loaded from: classes2.dex */
public class JsError {

    /* renamed from: a, reason: collision with root package name */
    private final IX5JsError f1789a;

    public JsError(IX5JsError iX5JsError) {
        this.f1789a = iX5JsError;
    }

    public String getMessage() {
        return this.f1789a.getMessage();
    }

    public String getStack() {
        return this.f1789a.getStack();
    }
}
