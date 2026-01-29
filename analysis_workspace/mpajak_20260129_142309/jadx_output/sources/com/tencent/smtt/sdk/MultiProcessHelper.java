package com.tencent.smtt.sdk;

import android.os.Bundle;

/* loaded from: classes20.dex */
public class MultiProcessHelper {
    private static Object a(String str, Bundle bundle) {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            try {
                return a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "invokeStaticMiscMethod", new Class[]{String.class, Bundle.class}, str, bundle);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean getMultiProcessAutoRecoveryEnabled() {
        Object a5 = a("getMultiProcessAutoRecoveryEnabled", null);
        if (a5 instanceof Boolean) {
            return ((Boolean) a5).booleanValue();
        }
        return true;
    }

    public static String getMultiProcessChoseTypeReason() {
        Object a5 = a("getMultiProcessChoseTypeReason", null);
        return a5 instanceof String ? (String) a5 : "";
    }

    public static boolean getMultiProcessNoSandBoxEnabled() {
        Object a5 = a("getMultiProcessNoSandBoxIfNotIsolatedEnabled", null);
        if (a5 instanceof Boolean) {
            return ((Boolean) a5).booleanValue();
        }
        return true;
    }

    public static int getMultiProcessType() {
        Object a5 = a("getMultiProcessType", null);
        if (a5 instanceof Integer) {
            return ((Integer) a5).intValue();
        }
        return -1;
    }
}
