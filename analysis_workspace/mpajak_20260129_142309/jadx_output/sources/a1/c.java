package a1;

import android.content.pm.PackageManager;
import android.util.Log;
import androidx.collection.ArrayMap;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final g3.a f29a = b.b().a();

    /* renamed from: b, reason: collision with root package name */
    public static String f30b = null;

    public c() {
        new ArrayMap();
    }

    public static boolean a(PackageManager packageManager, String str) {
        try {
            f30b = packageManager.getApplicationInfo(str, 0).packageName;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean b(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return a(packageManager, str);
        }
        StringBuilder sb = new StringBuilder(str2.length() + androidx.activity.d.b(str, 56));
        sb.append("Possible malicious package ");
        sb.append(str);
        sb.append(" declares ");
        sb.append(str2);
        sb.append(" without permission");
        Log.w("InstanceID", sb.toString());
        return false;
    }
}
