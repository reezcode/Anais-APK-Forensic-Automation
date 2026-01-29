package com.tencent.smtt.utils;

import com.tencent.smtt.sdk.TbsListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static f f2403b;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, String> f2404a;

    private f() {
        HashMap hashMap = new HashMap();
        this.f2404a = hashMap;
        hashMap.put(Integer.valueOf(TbsListener.ErrorCode.THROWABLE_INITX5CORE), "if NoSuchMethodError, please check the Class in base.apk which is conflict with x5.");
        hashMap.put(Integer.valueOf(TbsListener.ErrorCode.ERROR_CPU_NOT_SUPPORT), "your CPU is i686|mips|x86_64? sorry X5 is not support them.");
        hashMap.put(402, "QbSdk.forceSysWebView() has been called! Check it.");
        hashMap.put(Integer.valueOf(TbsListener.ErrorCode.INFO_CORE_NOT_EXIST), "try to restart your app.");
    }

    public static f a() {
        if (f2403b == null) {
            f2403b = new f();
        }
        return f2403b;
    }

    public String a(int i5) {
        if (i5 >= 303 && i5 <= 324) {
            return "Core has some problem, try to reinstall the app.";
        }
        try {
            return this.f2404a.get(Integer.valueOf(i5));
        } catch (Exception unused) {
            return "Unexpected load error.";
        }
    }
}
