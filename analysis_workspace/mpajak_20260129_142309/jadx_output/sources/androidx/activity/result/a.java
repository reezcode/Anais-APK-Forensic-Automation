package androidx.activity.result;

import android.graphics.Canvas;
import com.blankj.utilcode.util.RomUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.ranges.IntRange;

/* loaded from: classes18.dex */
public final /* synthetic */ class a {
    public static int a(IntRange intRange, int i5) {
        return intRange.getEndInclusive().intValue() + i5;
    }

    public static Object b(CharSequence charSequence, int i5, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i5)));
    }

    public static Object c(int[] iArr, int i5, Function1 function1) {
        return function1.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(iArr, i5)));
    }

    public static String d(String str, long j5) {
        return str + j5;
    }

    public static StringBuilder e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder f(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ Iterator g() {
        try {
            return Arrays.asList(new n3.a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void h(int i5, Canvas canvas, int i6, int i7) {
        InlineMarker.finallyStart(i5);
        canvas.restoreToCount(i6);
        InlineMarker.finallyEnd(i7);
    }

    public static boolean i(String str) {
        String str2;
        str2 = RomUtils.getRomInfo().name;
        return str.equals(str2);
    }

    public static /* synthetic */ String j(int i5) {
        return i5 == 1 ? "BEGIN_ARRAY" : i5 == 2 ? "END_ARRAY" : i5 == 3 ? "BEGIN_OBJECT" : i5 == 4 ? "END_OBJECT" : i5 == 5 ? "NAME" : i5 == 6 ? "STRING" : i5 == 7 ? "NUMBER" : i5 == 8 ? "BOOLEAN" : i5 == 9 ? "NULL" : i5 == 10 ? "END_DOCUMENT" : "null";
    }
}
