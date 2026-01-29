package v0;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* loaded from: classes19.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f5555a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f5556b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f5557c;

    @TargetApi(20)
    public static boolean a(Context context) {
        if (f5555a == null) {
            f5555a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f5555a.booleanValue();
    }

    @TargetApi(26)
    public static boolean b(Context context) {
        if (a(context)) {
            if (Build.VERSION.SDK_INT >= 24) {
                if (f5556b == null) {
                    f5556b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
                }
                if (!f5556b.booleanValue() || b.a()) {
                }
            }
            return true;
        }
        return false;
    }
}
