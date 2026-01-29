package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes17.dex */
public final class PopupWindowCompat {
    private static final String TAG = "PopupWindowCompatApi21";
    private static Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    @RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        public static void showAsDropDown(PopupWindow popupWindow, View view, int i5, int i6, int i7) {
            popupWindow.showAsDropDown(view, i5, i6, i7);
        }
    }

    @RequiresApi(23)
    /* loaded from: classes10.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static boolean getOverlapAnchor(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @DoNotInline
        public static int getWindowLayoutType(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @DoNotInline
        public static void setOverlapAnchor(PopupWindow popupWindow, boolean z4) {
            popupWindow.setOverlapAnchor(z4);
        }

        @DoNotInline
        public static void setWindowLayoutType(PopupWindow popupWindow, int i5) {
            popupWindow.setWindowLayoutType(i5);
        }
    }

    private PopupWindowCompat() {
    }

    public static boolean getOverlapAnchor(@NonNull PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getOverlapAnchor(popupWindow);
        }
        if (!sOverlapAnchorFieldAttempted) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                sOverlapAnchorField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.i(TAG, "Could not fetch mOverlapAnchor field from PopupWindow", e5);
            }
            sOverlapAnchorFieldAttempted = true;
        }
        Field field = sOverlapAnchorField;
        if (field == null) {
            return false;
        }
        try {
            return ((Boolean) field.get(popupWindow)).booleanValue();
        } catch (IllegalAccessException e6) {
            Log.i(TAG, "Could not get overlap anchor field in PopupWindow", e6);
            return false;
        }
    }

    public static int getWindowLayoutType(@NonNull PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getWindowLayoutType(popupWindow);
        }
        if (!sGetWindowLayoutTypeMethodAttempted) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", new Class[0]);
                sGetWindowLayoutTypeMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            sGetWindowLayoutTypeMethodAttempted = true;
        }
        Method method = sGetWindowLayoutTypeMethod;
        if (method != null) {
            try {
                return ((Integer) method.invoke(popupWindow, new Object[0])).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    public static void setOverlapAnchor(@NonNull PopupWindow popupWindow, boolean z4) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setOverlapAnchor(popupWindow, z4);
            return;
        }
        if (!sOverlapAnchorFieldAttempted) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                sOverlapAnchorField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.i(TAG, "Could not fetch mOverlapAnchor field from PopupWindow", e5);
            }
            sOverlapAnchorFieldAttempted = true;
        }
        Field field = sOverlapAnchorField;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z4));
            } catch (IllegalAccessException e6) {
                Log.i(TAG, "Could not set overlap anchor field in PopupWindow", e6);
            }
        }
    }

    public static void setWindowLayoutType(@NonNull PopupWindow popupWindow, int i5) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setWindowLayoutType(popupWindow, i5);
            return;
        }
        if (!sSetWindowLayoutTypeMethodAttempted) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                sSetWindowLayoutTypeMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            sSetWindowLayoutTypeMethodAttempted = true;
        }
        Method method = sSetWindowLayoutTypeMethod;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i5));
            } catch (Exception unused2) {
            }
        }
    }

    public static void showAsDropDown(@NonNull PopupWindow popupWindow, @NonNull View view, int i5, int i6, int i7) {
        Api19Impl.showAsDropDown(popupWindow, view, i5, i6, i7);
    }
}
