package com.tencent.smtt.sdk;

import android.content.Context;
import java.util.UnknownFormatConversionException;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static int f2116a = 5;

    /* renamed from: b, reason: collision with root package name */
    public static int f2117b = 16;

    /* renamed from: c, reason: collision with root package name */
    public static char[] f2118c = new char[16];

    /* renamed from: d, reason: collision with root package name */
    public static String f2119d = "dex2oat-cmdline";

    /* renamed from: e, reason: collision with root package name */
    public static long f2120e = 4096;

    public static String a(Context context, String str) {
        com.tencent.smtt.utils.c cVar = new com.tencent.smtt.utils.c(str);
        cVar.a(f2118c);
        cVar.a(f2118c[f2116a] == 1);
        cVar.a(f2120e);
        return a(new String(a(cVar)));
    }

    private static String a(String str) {
        String[] split = str.split(new String("\u0000"));
        int i5 = 0;
        while (i5 < split.length) {
            int i6 = i5 + 1;
            String str2 = split[i5];
            int i7 = i6 + 1;
            String str3 = split[i6];
            if (str2.equals(f2119d)) {
                return str3;
            }
            i5 = i7;
        }
        return "";
    }

    public static char[] a(com.tencent.smtt.utils.c cVar) {
        char[] cArr = new char[4];
        char[] cArr2 = new char[4];
        cVar.a(cArr);
        if (cArr[0] != 'o' || cArr[1] != 'a' || cArr[2] != 't') {
            throw new UnknownFormatConversionException(String.format("Invalid art magic %c%c%c", Character.valueOf(cArr[0]), Character.valueOf(cArr[1]), Character.valueOf(cArr[2])));
        }
        cVar.a(cArr2);
        cVar.b();
        cVar.b();
        cVar.b();
        cVar.b();
        cVar.b();
        cVar.b();
        cVar.b();
        cVar.b();
        if (cArr2[1] <= '4') {
            cVar.b();
            cVar.b();
            cVar.b();
        }
        cVar.b();
        cVar.b();
        cVar.b();
        cVar.b();
        cVar.b();
        cVar.b();
        cVar.b();
        char[] cArr3 = new char[cVar.b()];
        cVar.a(cArr3);
        return cArr3;
    }
}
