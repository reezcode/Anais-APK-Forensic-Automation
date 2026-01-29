package com.tencent.smtt.sdk;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class ProxyController {

    /* loaded from: classes25.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final ProxyController f1807a = new e();
    }

    public static ProxyController getInstance() {
        return a.f1807a;
    }

    public abstract void clearProxyOverride(Executor executor, Runnable runnable);

    public abstract void setProxyOverride(ProxyConfig proxyConfig, Executor executor, Runnable runnable);
}
