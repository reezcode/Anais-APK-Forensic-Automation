package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.sdk.ProxyConfig;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public class e extends ProxyController {
    private void a(Executor executor, Runnable runnable) {
        try {
            Class<?> cls = Class.forName("androidx.webkit.internal.ProxyControllerImpl");
            Method declaredMethod = cls.getDeclaredMethod("getBoundaryInterface", new Class[0]);
            declaredMethod.setAccessible(true);
            Class.forName("org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface").getMethod("clearProxyOverride", Runnable.class, Executor.class).invoke(declaredMethod.invoke(cls.newInstance(), new Object[0]), runnable, executor);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static String[][] a(List<ProxyConfig.ProxyRule> list) {
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 2);
        for (int i5 = 0; i5 < list.size(); i5++) {
            strArr[i5][0] = list.get(i5).getSchemeFilter();
            strArr[i5][1] = list.get(i5).getUrl();
        }
        return strArr;
    }

    private void b(Executor executor, Runnable runnable) {
        try {
            DexLoader b5 = u.a().c().b();
            b5.invokeMethod(b5.newInstance("android.webview.chromium.tencent.TencentSupportProxyController", new Class[0], new Object[0]), "android.webview.chromium.tencent.TencentSupportProxyController", "clearProxyOverride", new Class[]{Runnable.class, Executor.class}, runnable, executor);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(String[][] strArr, String[] strArr2, Runnable runnable, Executor executor) {
        try {
            DexLoader b5 = u.a().c().b();
            b5.invokeMethod(b5.newInstance("android.webview.chromium.tencent.TencentSupportProxyController", new Class[0], new Object[0]), "android.webview.chromium.tencent.TencentSupportProxyController", "setProxyOverride", new Class[]{String[][].class, String[].class, Runnable.class, Executor.class, Boolean.TYPE}, strArr, strArr2, runnable, executor, Boolean.FALSE);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void b(String[][] strArr, String[] strArr2, Runnable runnable, Executor executor) {
        try {
            Class<?> cls = Class.forName("androidx.webkit.internal.ProxyControllerImpl");
            Method declaredMethod = cls.getDeclaredMethod("getBoundaryInterface", new Class[0]);
            declaredMethod.setAccessible(true);
            Class.forName("org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface").getMethod("setProxyOverride", String[][].class, String[].class, Runnable.class, Executor.class).invoke(declaredMethod.invoke(cls.newInstance(), new Object[0]), strArr, strArr2, runnable, executor);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.tencent.smtt.sdk.ProxyController
    public void clearProxyOverride(Executor executor, Runnable runnable) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            a(executor, runnable);
        } else {
            b(executor, runnable);
        }
    }

    @Override // com.tencent.smtt.sdk.ProxyController
    public void setProxyOverride(ProxyConfig proxyConfig, Executor executor, Runnable runnable) {
        String[][] a5 = a(proxyConfig.getProxyRules());
        String[] strArr = (String[]) proxyConfig.getBypassRules().toArray(new String[0]);
        u a6 = u.a();
        if (a6 == null || !a6.b()) {
            b(a5, strArr, runnable, executor);
        } else {
            a(a5, strArr, runnable, executor);
        }
    }
}
