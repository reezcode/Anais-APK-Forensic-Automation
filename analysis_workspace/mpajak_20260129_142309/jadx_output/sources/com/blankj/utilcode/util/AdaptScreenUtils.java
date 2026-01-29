package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class AdaptScreenUtils {
    private static List<Field> sMetricsFields;

    private AdaptScreenUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @NonNull
    public static Resources adaptHeight(@NonNull Resources resources, int i5) {
        return adaptHeight(resources, i5, false);
    }

    @NonNull
    public static Resources adaptHeight(@NonNull Resources resources, int i5, boolean z4) {
        applyDisplayMetrics(resources, ((resources.getDisplayMetrics().heightPixels + (z4 ? getNavBarHeight(resources) : 0)) * 72.0f) / i5);
        return resources;
    }

    @NonNull
    public static Resources adaptWidth(@NonNull Resources resources, int i5) {
        applyDisplayMetrics(resources, (resources.getDisplayMetrics().widthPixels * 72.0f) / i5);
        return resources;
    }

    private static void applyDisplayMetrics(@NonNull Resources resources, float f5) {
        resources.getDisplayMetrics().xdpi = f5;
        Utils.getApp().getResources().getDisplayMetrics().xdpi = f5;
        applyOtherDisplayMetrics(resources, f5);
    }

    private static void applyMetricsFields(Resources resources, float f5) {
        Iterator<Field> it = sMetricsFields.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) it.next().get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f5;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private static void applyOtherDisplayMetrics(Resources resources, float f5) {
        if (sMetricsFields != null) {
            applyMetricsFields(resources, f5);
            return;
        }
        sMetricsFields = new ArrayList();
        Class<?> cls = resources.getClass();
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields == null || declaredFields.length <= 0) {
                return;
            }
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                    field.setAccessible(true);
                    DisplayMetrics metricsFromField = getMetricsFromField(resources, field);
                    if (metricsFromField != null) {
                        sMetricsFields.add(field);
                        metricsFromField.xdpi = f5;
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (cls != null);
    }

    @NonNull
    public static Resources closeAdapt(@NonNull Resources resources) {
        applyDisplayMetrics(resources, Resources.getSystem().getDisplayMetrics().density * 72.0f);
        return resources;
    }

    private static DisplayMetrics getMetricsFromField(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    private static int getNavBarHeight(@NonNull Resources resources) {
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static Runnable getPreLoadRunnable() {
        return new Runnable() { // from class: com.blankj.utilcode.util.AdaptScreenUtils.1
            @Override // java.lang.Runnable
            public void run() {
                AdaptScreenUtils.preLoad();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void preLoad() {
        applyDisplayMetrics(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }

    public static int pt2Px(float f5) {
        return (int) (((f5 * Utils.getApp().getResources().getDisplayMetrics().xdpi) / 72.0f) + 0.5d);
    }

    public static int px2Pt(float f5) {
        return (int) (((f5 * 72.0f) / Utils.getApp().getResources().getDisplayMetrics().xdpi) + 0.5d);
    }
}
