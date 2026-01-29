package androidx.appcompat.widget;

import android.graphics.Color;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import j.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ServiceConfigurationError;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.functions.Function1;

/* loaded from: classes25.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ boolean a(int i5) {
        if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) {
            return false;
        }
        if (i5 == 6) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ boolean b(int i5) {
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            return true;
        }
        if (i5 == 4 || i5 == 5 || i5 == 6) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ boolean c(int i5) {
        if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) {
            return true;
        }
        if (i5 == 6) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ boolean d(int i5) {
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            return false;
        }
        if (i5 == 4 || i5 == 5) {
            return true;
        }
        if (i5 == 6) {
            return false;
        }
        throw null;
    }

    public static int e(StringBuilder sb, String str, String str2, a.C0038a c0038a) {
        sb.append(str);
        sb.append(str2);
        return c0038a.f(sb.toString());
    }

    public static Object f(long[] jArr, int i5, Function1 function1) {
        return function1.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(jArr, i5)));
    }

    public static String g(String str, int i5) {
        return str + i5;
    }

    public static String h(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String i(String str, Object obj) {
        return str + obj;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static ArrayList k(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static /* synthetic */ Iterator l() {
        try {
            return Arrays.asList(new n3.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void m(String str, int i5, int i6, TextView textView) {
        textView.setTextColor(Color.rgb(i5, i6, Integer.parseInt(str)));
    }

    public static void n(StringBuilder sb, String str, char c5, String str2) {
        sb.append(str);
        sb.append(c5);
        sb.append(str2);
    }

    public static /* synthetic */ String o(int i5) {
        return i5 == 1 ? "SELECT" : i5 == 2 ? "SELECT_LONG" : i5 == 3 ? "SELECT_RAW" : i5 == 4 ? "UPDATE" : i5 == 5 ? "DELETE" : i5 == 6 ? "EXECUTE" : "null";
    }
}
