package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.export.external.TbsCoreSettings;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes14.dex */
public enum TbsPrivacyAccess {
    DeviceId(false),
    Imsi(false),
    AndroidId(false),
    MacAddress(false),
    AndroidVersion(true),
    DeviceModel(true),
    AppList(true);


    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    private static boolean f1966a = true;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1967c = false;

    /* renamed from: d, reason: collision with root package name */
    private static String[] f1968d = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1970b;

    /* loaded from: classes5.dex */
    public enum ConfigurablePrivacy {
        IMSI("imsi"),
        ANDROID_ID("android_id"),
        MAC("mac"),
        ANDROID_VERSION("android_version"),
        DEVICE_MODEL("device_model"),
        APP_LIST("app_list"),
        QIMEI36("q36"),
        MODEL("model"),
        OAID("oaid"),
        SERIAL("serial"),
        ACTION("action"),
        QB_INSTALLED("qb_installed");


        /* renamed from: a, reason: collision with root package name */
        public String f1972a;

        ConfigurablePrivacy(String str) {
            this.f1972a = str;
        }
    }

    TbsPrivacyAccess(boolean z4) {
        this.f1970b = z4;
    }

    private static void a(Context context, SharedPreferences.Editor editor, ConfigurablePrivacy configurablePrivacy, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder g5 = androidx.activity.d.g("doConfigPrivacy  ");
        g5.append(configurablePrivacy.f1972a);
        g5.append(" is ");
        g5.append(str);
        TbsLog.i("TbsPrivacy", g5.toString());
        if (!TextUtils.isEmpty(configurablePrivacy.f1972a) && configurablePrivacy.f1972a.equals("action")) {
            a(context, str);
            return;
        }
        editor.putString(configurablePrivacy.f1972a, str);
        TbsLog.i("TbsPrivacy", "configurePrivacy " + configurablePrivacy.f1972a + " is " + str);
    }

    private static void a(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && FileUtil.a(context) && str.equals("deleteQBApk")) {
                String a5 = FileUtil.a(context, 9);
                if (TextUtils.isEmpty(a5)) {
                    return;
                }
                File file = new File(a5);
                TbsLog.i("TbsPrivacy", "doActionByApp QbApkDir is " + file.getAbsolutePath());
                FileUtil.b(file);
            }
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("doActionByApp stack is ");
            g5.append(Log.getStackTraceString(th));
            TbsLog.i("TbsPrivacy", g5.toString());
        }
    }

    public static void configureAllPrivacy(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            if (bundle.containsKey("qimei36")) {
                bundle.putString(ConfigurablePrivacy.QIMEI36.f1972a, bundle.getString("qimei36"));
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                TbsLog.i("TbsPrivacy", "configureAllPrivacy bundle key is " + it.next());
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("uifa", 0).edit();
            for (ConfigurablePrivacy configurablePrivacy : ConfigurablePrivacy.values()) {
                if (bundle.containsKey(configurablePrivacy.f1972a)) {
                    a(context, edit, configurablePrivacy, bundle.getString(configurablePrivacy.f1972a));
                }
            }
            edit.putString("app_call", "done");
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    public static void configureAllPrivacy(Context context, String str) {
        if (str == null) {
            return;
        }
        try {
            String b5 = com.tencent.smtt.utils.s.b(context);
            TbsLog.i("TbsPrivacy", "configureAllPrivacy state is " + b5);
            if (b5.contains("app_list")) {
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("uifa", 0).edit();
            edit.putString("app_list", str);
            edit.putString("app_call", "done");
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    public static void configurePrivacy(Context context, ConfigurablePrivacy configurablePrivacy, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("uifa", 0).edit();
        a(context, edit, configurablePrivacy, str);
        edit.commit();
    }

    @Deprecated
    public static void disableSensitiveApi() {
        f1966a = false;
        HashMap hashMap = new HashMap();
        hashMap.put(TbsCoreSettings.NO_SENSITIVE_API, Boolean.TRUE);
        QbSdk.initTbsSettings(hashMap);
    }

    public static String getConfigurePrivacy(Context context, ConfigurablePrivacy configurablePrivacy, String str) {
        return context.getSharedPreferences("uifa", 0).getString(configurablePrivacy.f1972a, str);
    }

    public static String[] getItemToRmPrivacy() {
        return f1968d;
    }

    @Deprecated
    public static boolean isEnableSensitiveApi() {
        return f1966a;
    }

    public static void rmPrivacyItemIfNeeded(Context context) {
        try {
            TbsLog.i("TbsPrivacy", "mRmPrivacyItemChecked is " + f1967c);
            if (f1967c) {
                return;
            }
            f1967c = true;
            String b5 = com.tencent.smtt.utils.s.b(context);
            TbsLog.i("TbsPrivacy", "rmPrivacyItemIfNeeded state is " + b5);
            if (b5.equals("removenone")) {
                f1968d = null;
                return;
            }
            f1968d = b5.split("\\|");
            TbsLog.i("TbsPrivacy", "rmPrivacyItemIfNeeded mItemToRmPrivacy is " + f1968d);
            SharedPreferences sharedPreferences = context.getSharedPreferences("uifa", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : f1968d) {
                if (sharedPreferences.contains(str)) {
                    edit.remove(str);
                }
            }
            edit.commit();
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("stack is ");
            g5.append(Log.getStackTraceString(th));
            TbsLog.i("TbsPrivacy", g5.toString());
        }
    }

    public boolean isDisabled() {
        return !this.f1970b;
    }

    public boolean isEnabled() {
        return this.f1970b;
    }

    public void setEnabled(boolean z4) {
        this.f1970b = z4;
        TbsLog.i("TbsPrivacy", name() + " is " + z4);
    }
}
