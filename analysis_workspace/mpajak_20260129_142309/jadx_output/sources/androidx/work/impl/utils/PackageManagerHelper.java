package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Logger;

/* loaded from: classes20.dex */
public class PackageManagerHelper {
    private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

    private PackageManagerHelper() {
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context, @NonNull Class<?> cls) {
        return isComponentExplicitlyEnabled(context, cls.getName());
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context, @NonNull String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str)) == 1;
    }

    public static void setComponentEnabled(@NonNull Context context, @NonNull Class<?> cls, boolean z4) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z4 ? 1 : 2, 1);
            Logger logger = Logger.get();
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z4 ? "enabled" : "disabled");
            logger.debug(str, sb.toString());
        } catch (Exception e5) {
            Logger logger2 = Logger.get();
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z4 ? "enabled" : "disabled");
            logger2.debug(str2, sb2.toString(), e5);
        }
    }
}
