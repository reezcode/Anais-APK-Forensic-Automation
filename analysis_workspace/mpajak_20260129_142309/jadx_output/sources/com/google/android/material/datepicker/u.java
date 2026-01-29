package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes18.dex */
public final class u implements Comparable<u>, Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Calendar f1017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1018c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1019d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1020e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1021f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1022g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public String f1023h;

    /* loaded from: classes15.dex */
    public class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final u createFromParcel(@NonNull Parcel parcel) {
            return u.k(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final u[] newArray(int i5) {
            return new u[i5];
        }
    }

    public u(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar b5 = c0.b(calendar);
        this.f1017b = b5;
        this.f1018c = b5.get(2);
        this.f1019d = b5.get(1);
        this.f1020e = b5.getMaximum(7);
        this.f1021f = b5.getActualMaximum(5);
        this.f1022g = b5.getTimeInMillis();
    }

    @NonNull
    public static u k(int i5, int i6) {
        Calendar e5 = c0.e(null);
        e5.set(1, i5);
        e5.set(2, i6);
        return new u(e5);
    }

    @NonNull
    public static u l(long j5) {
        Calendar e5 = c0.e(null);
        e5.setTimeInMillis(j5);
        return new u(e5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f1018c == uVar.f1018c && this.f1019d == uVar.f1019d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1018c), Integer.valueOf(this.f1019d)});
    }

    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull u uVar) {
        return this.f1017b.compareTo(uVar.f1017b);
    }

    public final int m() {
        int firstDayOfWeek = this.f1017b.get(7) - this.f1017b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f1020e : firstDayOfWeek;
    }

    @NonNull
    public final String n() {
        if (this.f1023h == null) {
            this.f1023h = DateUtils.formatDateTime(null, this.f1017b.getTimeInMillis(), 8228);
        }
        return this.f1023h;
    }

    @NonNull
    public final u o(int i5) {
        Calendar b5 = c0.b(this.f1017b);
        b5.add(2, i5);
        return new u(b5);
    }

    public final int p(@NonNull u uVar) {
        if (!(this.f1017b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (uVar.f1018c - this.f1018c) + ((uVar.f1019d - this.f1019d) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i5) {
        parcel.writeInt(this.f1019d);
        parcel.writeInt(this.f1018c);
    }
}
