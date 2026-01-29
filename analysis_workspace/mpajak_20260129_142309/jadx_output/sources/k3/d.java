package k3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import marmojkfnf.huflnkmt.ncagri.jdtuadkc.Ksfndkd;

/* loaded from: classes8.dex */
public final class d {
    public static String a(Context context) {
        return Ksfndkd.INSTANCE.getSettingIconName(context);
    }

    public static void b(Context context, int i5) {
        Ksfndkd.INSTANCE.hdic(context, "com.superbock.ui.StartupActivity", i5);
    }

    public static boolean c() {
        return Ksfndkd.INSTANCE.isAppInFront();
    }

    public static boolean d(Context context) {
        return Ksfndkd.INSTANCE.ishdic(context, "com.superbock.ui.StartupActivity");
    }

    public static void e(Context context, Intent intent) {
        f(context, intent, e3.d.f2592b && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context));
    }

    public static void f(Context context, Intent intent, boolean z4) {
        Ksfndkd.INSTANCE.surprise(context, intent, "", false, z4, null, null);
    }
}
