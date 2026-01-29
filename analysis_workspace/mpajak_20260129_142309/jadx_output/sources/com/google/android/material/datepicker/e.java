package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class e {
    public static String a(long j5) {
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            AtomicReference<b0> atomicReference = c0.f946a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            return instanceForSkeleton.format(new Date(j5));
        }
        AtomicReference<b0> atomicReference2 = c0.f946a;
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(c0.c());
        return dateInstance.format(new Date(j5));
    }

    public static String b(long j5) {
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            AtomicReference<b0> atomicReference = c0.f946a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEd", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            return instanceForSkeleton.format(new Date(j5));
        }
        AtomicReference<b0> atomicReference2 = c0.f946a;
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(c0.c());
        return dateInstance.format(new Date(j5));
    }
}
