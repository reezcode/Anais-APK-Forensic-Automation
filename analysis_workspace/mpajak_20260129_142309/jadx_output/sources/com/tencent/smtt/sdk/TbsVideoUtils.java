package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.DexLoader;

/* loaded from: classes12.dex */
public class TbsVideoUtils {

    /* renamed from: a, reason: collision with root package name */
    private static q f2001a;

    private static void a(Context context) {
        synchronized (TbsVideoUtils.class) {
            if (f2001a == null) {
                f.a(true).a(context, false, false);
                s a5 = f.a(true).a();
                DexLoader c5 = a5 != null ? a5.c() : null;
                if (c5 != null) {
                    f2001a = new q(c5);
                }
            }
        }
    }

    public static void deleteVideoCache(Context context, String str) {
        a(context);
        q qVar = f2001a;
        if (qVar != null) {
            qVar.a(context, str);
        }
    }

    public static String getCurWDPDecodeType(Context context) {
        a(context);
        q qVar = f2001a;
        return qVar != null ? qVar.a(context) : "";
    }
}
