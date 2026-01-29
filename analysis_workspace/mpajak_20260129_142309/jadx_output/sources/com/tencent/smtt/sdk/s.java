package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.TbsCoreSettings;
import com.tencent.smtt.export.external.libwebp;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.TbsLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private Context f2222a;

    /* renamed from: b, reason: collision with root package name */
    private Context f2223b;

    /* renamed from: c, reason: collision with root package name */
    private String f2224c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f2225d;

    /* renamed from: e, reason: collision with root package name */
    private DexLoader f2226e;

    /* renamed from: f, reason: collision with root package name */
    private String f2227f;

    /* renamed from: g, reason: collision with root package name */
    private String f2228g = null;

    public s(Context context, Context context2, String str, String str2, String[] strArr, String str3) {
        this.f2222a = null;
        this.f2223b = null;
        this.f2224c = null;
        this.f2225d = null;
        this.f2226e = null;
        this.f2227f = "TbsDexOpt";
        TbsLog.i("TbsWizard", "construction start...");
        if (context == null || context2 == null || TextUtils.isEmpty(str) || strArr == null || strArr.length == 0) {
            throw new Exception("TbsWizard paramter error:-1callerContext:" + context + "hostcontext" + context2 + "isEmpty" + TextUtils.isEmpty(str) + "dexfileList" + strArr);
        }
        this.f2222a = context.getApplicationContext();
        if (context2.getApplicationContext() != null) {
            this.f2223b = context2.getApplicationContext();
        } else {
            this.f2223b = context2;
        }
        this.f2224c = str;
        this.f2225d = strArr;
        this.f2227f = str2;
        for (int i5 = 0; i5 < this.f2225d.length; i5++) {
            StringBuilder e5 = androidx.appcompat.graphics.drawable.a.e("#2 mDexFileList[", i5, "]: ");
            e5.append(this.f2225d[i5]);
            TbsLog.i("TbsWizard", e5.toString());
        }
        StringBuilder f5 = androidx.activity.result.a.f("new DexLoader #2 libraryPath is ", str3, " mCallerAppContext is ");
        f5.append(this.f2222a);
        f5.append(" dexOutPutDir is ");
        f5.append(str2);
        TbsLog.i("TbsWizard", f5.toString());
        this.f2226e = new DexLoader(str3, this.f2222a, this.f2225d, str2, QbSdk.f1822o);
        System.currentTimeMillis();
        a(context);
        libwebp.loadWepLibraryIfNeed(context2, this.f2224c);
        Map<String, Object> map = QbSdk.f1822o;
        if (map == null || !map.containsKey(TbsCoreSettings.MULTI_PROCESS_ENABLE)) {
            HashMap hashMap = new HashMap();
            hashMap.put(TbsCoreSettings.MULTI_PROCESS_ENABLE, 0);
            QbSdk.initTbsSettings(hashMap);
            TbsLog.i("[MultiProcess]", "default not enable multi process!");
        }
        Map<String, Object> map2 = QbSdk.f1822o;
        if (map2 != null) {
            this.f2226e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTbsSettings", new Class[]{Map.class}, map2);
            b(context);
        }
        int c5 = c(context);
        if (c5 < 0) {
            StringBuilder e6 = androidx.appcompat.graphics.drawable.a.e("TbsWizard init error: ", c5, "; msg: ");
            e6.append(this.f2228g);
            throw new Exception(e6.toString());
        }
        TbsLog.i("TbsWizard", "construction end...");
    }

    private void b(Context context) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("tbss", 0).edit();
            Map<String, Object> map = QbSdk.f1822o;
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof String) {
                    edit.putString(str, (String) obj);
                    TbsLog.i("TbsWizard", "initTbsSettingsBySP key is " + str + " value is " + ((String) obj));
                }
            }
            edit.commit();
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("stack is ");
            g5.append(Log.getStackTraceString(th));
            TbsLog.i("TbsWizard", g5.toString());
        }
    }

    private int c(Context context) {
        int i5;
        String str;
        TbsLog.i("TbsWizard", "initTesRuntimeEnvironment callerContext is " + context + " mHostContext is " + this.f2223b + " mDexLoader is " + this.f2226e + " mtbsInstallLocation is " + this.f2224c + " mDexOptPath is " + this.f2227f);
        DexLoader dexLoader = this.f2226e;
        Object invokeStaticMethod = dexLoader.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[]{Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, Integer.TYPE, String.class}, context, this.f2223b, dexLoader, this.f2224c, this.f2227f, TbsConfig.TBS_SDK_VERSIONNAME, 44286, QbSdk.a());
        if (invokeStaticMethod == null) {
            d();
            e();
            DexLoader dexLoader2 = this.f2226e;
            invokeStaticMethod = dexLoader2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[]{Context.class, Context.class, DexLoader.class, String.class, String.class}, context, this.f2223b, dexLoader2, this.f2224c, this.f2227f);
        }
        if (invokeStaticMethod == null) {
            i5 = -3;
        } else if (invokeStaticMethod instanceof Integer) {
            i5 = ((Integer) invokeStaticMethod).intValue();
        } else if (invokeStaticMethod instanceof Throwable) {
            TbsCoreLoadStat.getInstance().a(this.f2222a, TbsListener.ErrorCode.THROWABLE_INITTESRUNTIMEENVIRONMENT, (Throwable) invokeStaticMethod);
            i5 = -5;
        } else {
            i5 = -4;
        }
        if (i5 < 0) {
            Object invokeStaticMethod2 = this.f2226e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
            if (invokeStaticMethod2 instanceof Throwable) {
                Throwable th = (Throwable) invokeStaticMethod2;
                StringBuilder g5 = androidx.activity.d.g("#");
                g5.append(th.getMessage());
                g5.append("; cause: ");
                g5.append(th.getCause());
                g5.append("; th: ");
                g5.append(th);
                this.f2228g = g5.toString();
            }
            str = invokeStaticMethod2 instanceof String ? (String) invokeStaticMethod2 : null;
            return i5;
        }
        this.f2228g = str;
        return i5;
    }

    private void d() {
        this.f2226e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "setTesSdkVersionName", new Class[]{String.class}, TbsConfig.TBS_SDK_VERSIONNAME);
    }

    private void e() {
        this.f2226e.setStaticField("com.tencent.tbs.tbsshell.TBSShell", "VERSION", 44286);
    }

    public String a() {
        String str = null;
        Object invokeStaticMethod = this.f2226e.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "invokeStaticMethod", new Class[]{Boolean.TYPE, String.class, String.class, Class[].class, Object[].class}, Boolean.TRUE, "com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0]);
        if (invokeStaticMethod == null) {
            invokeStaticMethod = this.f2226e.invokeStaticMethod("com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0]);
        }
        if (invokeStaticMethod != null) {
            StringBuilder e5 = androidx.activity.result.a.e(String.valueOf(invokeStaticMethod), " ReaderPackName=");
            e5.append(TbsReaderView.gReaderPackName);
            e5.append(" ReaderPackVersion=");
            e5.append(TbsReaderView.gReaderPackVersion);
            str = e5.toString();
        }
        return str == null ? "X5 core get nothing..." : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r3) {
        /*
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = com.tencent.smtt.sdk.QbSdk.f1822o
            if (r0 == 0) goto L15
            java.lang.String r1 = "check_tbs_validity"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L15
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L16
        L15:
            r0 = 1
        L16:
            if (r0 == 0) goto L1b
            com.tencent.smtt.utils.n.b(r3)
        L1b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.s.a(android.content.Context):void");
    }

    public void a(Context context, Context context2, String str, String str2, String[] strArr, String str3) {
        this.f2222a = context.getApplicationContext();
        if (this.f2223b.getApplicationContext() != null) {
            this.f2223b = this.f2223b.getApplicationContext();
        }
        this.f2224c = str;
        this.f2225d = strArr;
        this.f2227f = str2;
        libwebp.loadWepLibraryIfNeed(context2, str);
        Map<String, Object> map = QbSdk.f1822o;
        if (map != null) {
            this.f2226e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTbsSettings", new Class[]{Map.class}, map);
        }
        int c5 = c(context);
        if (c5 >= 0) {
            return;
        }
        StringBuilder e5 = androidx.appcompat.graphics.drawable.a.e("continueInit init error: ", c5, "; msg: ");
        e5.append(this.f2228g);
        throw new Exception(e5.toString());
    }

    public boolean a(Context context, String str, String str2, Bundle bundle) {
        Object invokeStaticMethod = this.f2226e.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "installLocalQbApk", new Class[]{Context.class, String.class, String.class, Bundle.class}, context, str, str2, bundle);
        if (invokeStaticMethod == null) {
            return false;
        }
        return ((Boolean) invokeStaticMethod).booleanValue();
    }

    public String b() {
        String str = null;
        Object invokeStaticMethod = this.f2226e.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "invokeStaticMethod", new Class[]{Boolean.TYPE, String.class, String.class, Class[].class, Object[].class}, Boolean.TRUE, "com.tencent.smtt.util.CrashTracker", "getCrashExtraCacheInfo", null, new Object[0]);
        if (invokeStaticMethod == null) {
            invokeStaticMethod = this.f2226e.invokeStaticMethod("com.tencent.smtt.util.CrashTracker", "getCrashExtraCacheInfo", null, new Object[0]);
        }
        if (invokeStaticMethod != null) {
            StringBuilder e5 = androidx.activity.result.a.e(String.valueOf(invokeStaticMethod), " ReaderPackName=");
            e5.append(TbsReaderView.gReaderPackName);
            e5.append(" ReaderPackVersion=");
            e5.append(TbsReaderView.gReaderPackVersion);
            str = e5.toString();
        }
        return str == null ? "X5 core get cache nothing..." : str;
    }

    public DexLoader c() {
        return this.f2226e;
    }
}
