package com.tencent.smtt.sdk.ui.dialog;

import android.content.Context;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static float f2254a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    private static int f2255b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f2256c = -1;

    public static int a(Context context, float f5) {
        return b(context, (f5 * 160.0f) / 320.0f);
    }

    private static void a(Context context) {
        if (f2254a < 0.0f) {
            try {
                Field declaredField = Class.forName("com.tencent.mobileqq.app.FontSettingManager").getDeclaredField("customMetrics");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj instanceof DisplayMetrics) {
                    DisplayMetrics displayMetrics = (DisplayMetrics) obj;
                    f2254a = displayMetrics.density;
                    f2255b = displayMetrics.heightPixels;
                }
            } catch (Exception unused) {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                f2254a = displayMetrics2.density;
                f2255b = displayMetrics2.heightPixels;
            }
        }
    }

    private static int b(Context context, float f5) {
        if (f2254a == -1.0f) {
            a(context);
        }
        return (int) ((f5 * f2254a) + 0.5f);
    }
}
