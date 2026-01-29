package com.tencent.smtt.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.TbsPrivacyAccess;

/* loaded from: classes8.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static String f2461a = "";

    public static long a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }

    public static String a(Context context) {
        SharedPreferences sharedPreferences;
        String string;
        if (!TextUtils.isEmpty(f2461a)) {
            return f2461a;
        }
        try {
            sharedPreferences = context.getSharedPreferences("sai", 0);
            string = sharedPreferences.getString("bmo", "");
            f2461a = string;
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("stack is ");
            g5.append(Log.getStackTraceString(th));
            TbsLog.i("TbsUtils", g5.toString());
        }
        if (!TextUtils.isEmpty(string)) {
            return f2461a;
        }
        TbsPrivacyAccess.ConfigurablePrivacy configurablePrivacy = TbsPrivacyAccess.ConfigurablePrivacy.MODEL;
        f2461a = TbsPrivacyAccess.getConfigurePrivacy(context, configurablePrivacy, "");
        TbsLog.i("TbsUtils", "getBuildModel from sp is " + f2461a);
        if (!TextUtils.isEmpty(f2461a)) {
            return f2461a;
        }
        if (TextUtils.isEmpty(f2461a) && !TbsConfig.APP_QQ.equals(context.getPackageName())) {
            f2461a = Build.MODEL;
        }
        TbsLog.i("TbsUtils", "getBuildModel is " + f2461a);
        if (!TextUtils.isEmpty(f2461a)) {
            TbsPrivacyAccess.configurePrivacy(context, configurablePrivacy, f2461a);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("bmo", f2461a);
            edit.commit();
        }
        return f2461a;
    }

    public static void a(Context context, Bundle bundle) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("sai", 0).edit();
            if (bundle.containsKey(QbSdk.KEY_THIRD_PARTY_TURING)) {
                boolean z4 = bundle.getBoolean(QbSdk.KEY_THIRD_PARTY_TURING);
                edit.putBoolean("itge", z4);
                TbsLog.e("TbsUtils", "setEnableForThirdParty key is itge value is " + z4);
            }
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        return "removenone";
    }
}
