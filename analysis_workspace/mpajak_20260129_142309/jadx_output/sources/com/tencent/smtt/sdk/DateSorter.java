package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.interfaces.IX5DateSorter;

/* loaded from: classes5.dex */
public class DateSorter {
    public static int DAY_COUNT;

    /* renamed from: a, reason: collision with root package name */
    private android.webkit.DateSorter f1779a;

    /* renamed from: b, reason: collision with root package name */
    private IX5DateSorter f1780b;

    static {
        a();
        DAY_COUNT = 5;
    }

    public DateSorter(Context context) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            this.f1779a = new android.webkit.DateSorter(context);
        } else {
            this.f1780b = a5.c().h(context);
        }
    }

    private static boolean a() {
        u a5 = u.a();
        return a5 != null && a5.b();
    }

    public long getBoundary(int i5) {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? this.f1779a.getBoundary(i5) : this.f1780b.getBoundary(i5);
    }

    public int getIndex(long j5) {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? this.f1779a.getIndex(j5) : this.f1780b.getIndex(j5);
    }

    public String getLabel(int i5) {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? this.f1779a.getLabel(i5) : this.f1780b.getLabel(i5);
    }
}
