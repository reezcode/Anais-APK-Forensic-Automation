package androidx.appcompat.view;

import androidx.recyclerview.widget.RecyclerView;
import com.superbock.bean.AdInfo;
import i.d;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes17.dex */
public final /* synthetic */ class a {
    public static char a(int i5, int i6, int i7, d dVar) {
        return dVar.p0(i5 + i6 + i7);
    }

    public static int b(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static int c(UInt uInt, int i5) {
        return UInt.m110constructorimpl(uInt.m161unboximpl() + i5);
    }

    public static AdInfo d(int i5) {
        AdInfo adInfo = new AdInfo();
        adInfo.setType(i5);
        return adInfo;
    }

    public static Object e(byte[] bArr, int i5, Function1 function1) {
        return function1.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(bArr, i5)));
    }

    public static String f(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String g(Class cls, StringBuilder sb) {
        sb.append(cls.getName());
        return sb.toString();
    }

    public static String h(StringBuilder sb, int i5, String str) {
        sb.append(i5);
        sb.append(str);
        return sb.toString();
    }

    public static /* synthetic */ String i(int i5) {
        return i5 == 1 ? "INITIALIZE" : i5 == 2 ? "RESOURCE_CACHE" : i5 == 3 ? "DATA_CACHE" : i5 == 4 ? "SOURCE" : i5 == 5 ? "ENCODE" : i5 == 6 ? "FINISHED" : "null";
    }

    public static /* synthetic */ String j(int i5) {
        return i5 == 1 ? "STRING" : i5 == 2 ? "LONG_STRING" : i5 == 3 ? "DATE" : i5 == 4 ? "BOOLEAN" : i5 == 5 ? "CHAR" : i5 == 6 ? "BYTE" : i5 == 7 ? "BYTE_ARRAY" : i5 == 8 ? "SHORT" : i5 == 9 ? "INTEGER" : i5 == 10 ? "LONG" : i5 == 11 ? "FLOAT" : i5 == 12 ? "DOUBLE" : i5 == 13 ? "SERIALIZABLE" : i5 == 14 ? "BLOB" : i5 == 15 ? "BIG_DECIMAL" : i5 == 16 ? "OTHER" : i5 == 17 ? "UNKNOWN" : "null";
    }
}
