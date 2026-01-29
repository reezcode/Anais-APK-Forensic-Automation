package com.tencent.smtt.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.WebView;

/* loaded from: classes20.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static String f2419a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f2420b = "GA";

    /* renamed from: c, reason: collision with root package name */
    private static String f2421c = "GE";

    /* renamed from: d, reason: collision with root package name */
    private static String f2422d = "9422";

    /* renamed from: e, reason: collision with root package name */
    private static String f2423e = "0";

    /* renamed from: f, reason: collision with root package name */
    private static String f2424f = "";

    /* renamed from: g, reason: collision with root package name */
    private static boolean f2425g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f2426h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f2427i;

    public static String a(Context context) {
        return a(context, "0");
    }

    public static String a(Context context, String str) {
        if (!TextUtils.isEmpty(f2419a)) {
            return f2419a;
        }
        String a5 = a(context, String.valueOf(WebView.getTbsSDKVersion(context)), str, f2420b, f2421c, f2422d, f2423e, f2424f, f2425g);
        f2419a = a5;
        return a5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.l.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    private static String a(String str) {
        return TbsConfig.APP_WX.equals(str) ? "WX" : TbsConfig.APP_QQ.equals(str) ? "QQ" : TbsConfig.APP_QZONE.equals(str) ? "QZ" : TbsConfig.APP_QB.equals(str) ? "QB" : "TRD";
    }

    private static void a(StringBuilder sb, String str, String str2) {
        sb.append("&");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
    }

    private static int b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            return defaultDisplay.getWidth();
        }
        return -1;
    }

    private static int c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            return defaultDisplay.getHeight();
        }
        return -1;
    }

    private static boolean d(Context context) {
        if (f2426h) {
            return f2427i;
        }
        try {
            boolean z4 = (Math.min(b(context), c(context)) * 160) / e(context) >= 700;
            f2427i = z4;
            f2426h = true;
            return z4;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int e(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            return 160;
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }
}
