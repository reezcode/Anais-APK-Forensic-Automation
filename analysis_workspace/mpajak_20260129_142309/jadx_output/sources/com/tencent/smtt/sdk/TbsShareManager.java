package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Build;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

/* loaded from: classes14.dex */
public class TbsShareManager {

    /* renamed from: a, reason: collision with root package name */
    private static Context f1990a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f1991b;
    public static boolean mHasQueried;

    @Deprecated
    public static int findCoreForThirdPartyApp(Context context) {
        return -1;
    }

    @Deprecated
    public static File getBackupCoreFile(Context context, String str) {
        return null;
    }

    @Deprecated
    public static int getBackupCoreVersion(Context context, String str) {
        return 0;
    }

    @Deprecated
    public static File getBackupDecoupleCoreFile(Context context, String str) {
        return null;
    }

    @Deprecated
    public static int getBackupDecoupleCoreVersion(Context context, String str) {
        return 0;
    }

    @Deprecated
    public static boolean getCoreDisabled() {
        return false;
    }

    @Deprecated
    public static String[] getCoreProviderAppList() {
        return new String[0];
    }

    @Deprecated
    public static int getCoreShareDecoupleCoreVersion(Context context, String str) {
        return 0;
    }

    @Deprecated
    public static String getHostCorePathAppDefined() {
        return "";
    }

    public static Context getPackageContext(Context context, String str, boolean z4) {
        if (context != null && context.getPackageName().equals(str)) {
            return context;
        }
        if (context == null) {
            TbsLog.e("TbsShareManager", "getPackageContext appContext is null!!");
            return null;
        }
        if (z4) {
            try {
                if (!context.getPackageName().equals(str) && (TbsPVConfig.getInstance(context).isEnableNoCoreGray() || Build.VERSION.SDK_INT >= 29)) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return context.createPackageContext(str, 2);
    }

    @Deprecated
    public static File getSDCoreFile(Context context, String str, int i5) {
        return null;
    }

    @Deprecated
    public static int getSharedTbsCoreVersion(Context context, String str) {
        return 0;
    }

    @Deprecated
    public static File getStableCoreFile(Context context, String str) {
        return null;
    }

    @Deprecated
    public static int getStableCoreVersion(Context context, String str) {
        return 0;
    }

    @Deprecated
    public static int getTbsStableCoreVersion(Context context, int i5) {
        return 0;
    }

    public static boolean isThirdPartyApp(Context context) {
        Context context2;
        try {
            context2 = f1990a;
        } catch (Throwable th) {
            TbsLog.i(th);
        }
        if (context2 != null && context2.equals(context.getApplicationContext())) {
            return f1991b;
        }
        Context applicationContext = context.getApplicationContext();
        f1990a = applicationContext;
        String packageName = applicationContext.getPackageName();
        String[] strArr = {TbsConfig.APP_DEMO, TbsConfig.APP_WX, TbsConfig.APP_QQ, TbsConfig.APP_QZONE, "com.tencent.qqlite"};
        for (int i5 = 0; i5 < 5; i5++) {
            if (packageName.equals(strArr[i5])) {
                f1991b = false;
                return false;
            }
        }
        f1991b = true;
        return true;
    }

    @Deprecated
    public static void setHostCorePathAppDefined(String str) {
    }
}
