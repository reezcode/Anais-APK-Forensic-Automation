package k3;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActivityChooserModel;
import com.blankj.utilcode.util.SPUtils;
import comeliest.metempsychosis.pokelogan.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes25.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f3861a;

    public static boolean a(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningTasks(10);
        if (runningTasks == null || runningTasks.isEmpty()) {
            return false;
        }
        Iterator<ActivityManager.RunningTaskInfo> it = runningTasks.iterator();
        while (it.hasNext()) {
            if (it.next().topActivity.getClassName().startsWith("com.superbock.ui.custom")) {
                return true;
            }
        }
        return false;
    }

    public static String b(Context context) {
        String str;
        PackageManager packageManager = context.getPackageManager();
        try {
            str = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        return str == null ? context.getString(R.string.app_name) : str;
    }

    public static String c(Context context) {
        if (TextUtils.isEmpty(f3861a)) {
            String string = SPUtils.getInstance().getString("deviceId");
            f3861a = string;
            if (TextUtils.isEmpty(string)) {
                f3861a = Settings.Secure.getString(context.getContentResolver(), "android_id") + "m2p6";
                SPUtils.getInstance().put("deviceId", f3861a);
            }
        }
        return f3861a;
    }

    public static String d() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "hw_sc.build.platform.version");
            return TextUtils.isEmpty(str) ? "" : str;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    @RequiresApi(api = 23)
    public static ActivityManager.AppTask e(Context context) {
        ComponentName componentName;
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getAppTasks();
        if (appTasks == null || appTasks.isEmpty()) {
            return null;
        }
        for (ActivityManager.AppTask appTask : appTasks) {
            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            if (taskInfo != null && (componentName = taskInfo.topActivity) != null && componentName.getClassName().startsWith("com.superbock.ui.custom")) {
                return appTask;
            }
        }
        return null;
    }

    public static boolean f(Context context) {
        int i5;
        String string;
        try {
            i5 = Settings.Secure.getInt(context.getApplicationContext().getContentResolver(), "accessibility_enabled");
        } catch (Settings.SettingNotFoundException unused) {
            i5 = 0;
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        if (i5 == 1 && (string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services")) != null) {
            simpleStringSplitter.setString(string);
            String packageName = context.getPackageName();
            while (simpleStringSplitter.hasNext()) {
                if (simpleStringSplitter.next().startsWith(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        return (networkInfo != null && networkInfo.isConnected()) || (networkInfo2 != null && networkInfo2.isConnected());
    }

    public static boolean h() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "Harmony".equalsIgnoreCase(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean i(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
    }

    public static boolean j() {
        String language = Locale.getDefault().getLanguage();
        if ("zh".equals(language)) {
            String country = Locale.getDefault().getCountry();
            if ("tw".equalsIgnoreCase(country) || "hk".equalsIgnoreCase(country) || "mo".equalsIgnoreCase(country)) {
                language = "tw";
            }
        }
        return "zh".equalsIgnoreCase(language) && "CN".equalsIgnoreCase(SPUtils.getInstance().getString("area"));
    }

    public static void k(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.setStreamVolume(3, 0, 0);
        audioManager.setStreamVolume(10, 0, 0);
        audioManager.setStreamVolume(4, 0, 0);
        audioManager.setStreamVolume(8, 0, 0);
        audioManager.setStreamVolume(2, 0, 0);
        audioManager.setStreamVolume(5, 0, 0);
        audioManager.setStreamVolume(1, 0, 0);
        audioManager.setStreamVolume(0, 0, 0);
    }

    public static void l(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        ResolveInfo next = packageManager.queryIntentActivities(intent, 0).iterator().next();
        if (next != null) {
            ActivityInfo activityInfo = next.activityInfo;
            String str2 = activityInfo.packageName;
            String str3 = activityInfo.name;
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.addFlags(268435456);
            intent2.setComponent(new ComponentName(str2, str3));
            context.startActivity(intent2);
        }
    }

    public static String m(String str) {
        String replaceAll;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (str.startsWith("#") && str.length() == 7) {
                String substring = str.substring(1);
                replaceAll = Integer.parseInt(substring.substring(0, 2), 16) + "," + Integer.parseInt(substring.substring(2, 4), 16) + "," + Integer.parseInt(substring.substring(4, 6), 16);
            } else {
                if (!str.startsWith("rgb(") || !str.endsWith(")")) {
                    return null;
                }
                replaceAll = str.replaceFirst("rgb\\(", "").replace(")", "").replaceAll("\\s+", "");
            }
            return replaceAll;
        } catch (Exception unused) {
            return null;
        }
    }
}
