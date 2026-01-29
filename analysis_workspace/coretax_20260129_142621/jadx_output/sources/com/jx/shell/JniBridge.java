package com.jx.shell;

import a.a;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public class JniBridge {
    public static void a(String str, String str2) {
        String[] strArr = {"libdpt.so"};
        try {
            String b = a.b(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str3 = File.separator;
            sb.append(str3);
            sb.append("dpt-libs");
            sb.append(str3);
            sb.append(b);
            File[] listFiles = new File(sb.toString()).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath.endsWith(File.separator + strArr[0])) {
                        System.load(absolutePath);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static native void cbde(ClassLoader classLoader);

    public static native void craa(Context context, String str);

    public static native void craoc(String str);

    public static native String gap();

    public static native String gdp();

    public static native void ia();

    public static native Object ra(String str);

    public static native String rapn();

    public static native String rcf();

    public static native void rde(ClassLoader classLoader, String str);
}
