package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.d;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import org.apache.commons.io.FilenameUtils;

@SuppressLint({"LogConditional"})
/* loaded from: classes19.dex */
public class Debug {
    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder g5 = d.g(".(");
        g5.append(stackTraceElement.getFileName());
        g5.append(":");
        g5.append(stackTraceElement.getLineNumber());
        g5.append(") ");
        g5.append(str);
        g5.append("  ");
        String sb = g5.toString();
        PrintStream printStream = System.out;
        StringBuilder f5 = androidx.activity.result.a.f(" >>>>>>>>>>>>>>>>>>. dump ", sb, "  ");
        f5.append(layoutParams.getClass().getName());
        printStream.println(f5.toString());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(sb + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + sb);
    }

    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder g5 = d.g(".(");
        g5.append(stackTraceElement.getFileName());
        g5.append(":");
        g5.append(stackTraceElement.getLineNumber());
        g5.append(") ");
        g5.append(str);
        g5.append("  ");
        String sb = g5.toString();
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            PrintStream printStream = System.out;
            StringBuilder e5 = androidx.activity.result.a.e(sb, "     ");
            e5.append(getName(childAt));
            printStream.println(e5.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(sb + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpPoc(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder g5 = d.g(".(");
        g5.append(stackTraceElement.getFileName());
        g5.append(":");
        g5.append(stackTraceElement.getLineNumber());
        g5.append(")");
        String sb = g5.toString();
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder e5 = androidx.activity.result.a.e(sb, "------------- ");
        e5.append(cls.getName());
        e5.append(" --------------------");
        printStream.println(e5.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(sb + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder e6 = androidx.activity.result.a.e(sb, "------------- ");
        e6.append(cls.getSimpleName());
        e6.append(" --------------------");
        printStream2.println(e6.toString());
    }

    public static String getActionType(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getCallFrom(int i5) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i5 + 2];
        StringBuilder g5 = d.g(".(");
        g5.append(stackTraceElement.getFileName());
        g5.append(":");
        g5.append(stackTraceElement.getLineNumber());
        g5.append(")");
        return g5.toString();
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder g5 = d.g(".(");
        g5.append(stackTraceElement.getFileName());
        g5.append(":");
        g5.append(stackTraceElement.getLineNumber());
        g5.append(") ");
        g5.append(stackTraceElement.getMethodName());
        g5.append("()");
        return g5.toString();
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder g5 = d.g(".(");
        g5.append(stackTraceElement.getFileName());
        g5.append(":");
        g5.append(stackTraceElement.getLineNumber());
        g5.append(")");
        return g5.toString();
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        StringBuilder g5 = d.g(".(");
        g5.append(stackTraceElement.getFileName());
        g5.append(":");
        g5.append(stackTraceElement.getLineNumber());
        g5.append(")");
        return g5.toString();
    }

    public static String getName(Context context, int i5) {
        if (i5 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i5);
        } catch (Exception unused) {
            return androidx.appcompat.widget.a.g("?", i5);
        }
    }

    public static String getName(Context context, int[] iArr) {
        String str;
        try {
            String str2 = iArr.length + "[";
            int i5 = 0;
            while (i5 < iArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(i5 == 0 ? "" : " ");
                String sb2 = sb.toString();
                try {
                    str = context.getResources().getResourceEntryName(iArr[i5]);
                } catch (Resources.NotFoundException unused) {
                    str = "? " + iArr[i5] + " ";
                }
                str2 = sb2 + str;
                i5++;
            }
            return str2 + "]";
        } catch (Exception e5) {
            Log.v("DEBUG", e5.toString());
            return "UNKNOWN";
        }
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String getState(MotionLayout motionLayout, int i5) {
        return getState(motionLayout, i5, -1);
    }

    public static String getState(MotionLayout motionLayout, int i5, int i6) {
        int length;
        if (i5 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i5);
        if (i6 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i6) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i6 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i6) / length).toString().replace((char) 0, FilenameUtils.EXTENSION_SEPARATOR) + "_", "_");
    }

    public static void logStack(String str, String str2, int i5) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i5, stackTrace.length - 1);
        String str3 = " ";
        for (int i6 = 1; i6 <= min; i6++) {
            StackTraceElement stackTraceElement = stackTrace[i6];
            StringBuilder g5 = d.g(".(");
            g5.append(stackTrace[i6].getFileName());
            g5.append(":");
            g5.append(stackTrace[i6].getLineNumber());
            g5.append(") ");
            g5.append(stackTrace[i6].getMethodName());
            String sb = g5.toString();
            str3 = d.f(str3, " ");
            Log.v(str, str2 + str3 + sb + str3);
        }
    }

    public static void printStack(String str, int i5) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i5, stackTrace.length - 1);
        String str2 = " ";
        for (int i6 = 1; i6 <= min; i6++) {
            StackTraceElement stackTraceElement = stackTrace[i6];
            StringBuilder g5 = d.g(".(");
            g5.append(stackTrace[i6].getFileName());
            g5.append(":");
            g5.append(stackTrace[i6].getLineNumber());
            g5.append(") ");
            String sb = g5.toString();
            str2 = d.f(str2, " ");
            System.out.println(str + str2 + sb + str2);
        }
    }
}
