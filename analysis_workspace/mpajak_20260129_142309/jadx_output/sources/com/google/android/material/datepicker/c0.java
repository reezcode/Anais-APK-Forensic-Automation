package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes21.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicReference<b0> f946a = new AtomicReference<>();

    public static long a(long j5) {
        Calendar e5 = e(null);
        e5.setTimeInMillis(j5);
        return b(e5).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar e5 = e(calendar);
        Calendar e6 = e(null);
        e6.set(e5.get(1), e5.get(2), e5.get(5));
        return e6;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        b0 b0Var = f946a.get();
        if (b0Var == null) {
            b0Var = b0.f935c;
        }
        TimeZone timeZone = b0Var.f937b;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l5 = b0Var.f936a;
        if (l5 != null) {
            calendar.setTimeInMillis(l5.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(c());
        return calendar;
    }

    public static Calendar e(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(c());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
