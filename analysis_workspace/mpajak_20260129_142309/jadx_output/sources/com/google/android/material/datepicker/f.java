package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* loaded from: classes18.dex */
public final class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f951b;

    /* loaded from: classes21.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final f createFromParcel(@NonNull Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final f[] newArray(int i5) {
            return new f[i5];
        }
    }

    public f() {
        this.f951b = Long.MIN_VALUE;
    }

    public f(long j5, a aVar) {
        this.f951b = j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.a.c
    public final boolean e(long j5) {
        return j5 >= this.f951b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f951b == ((f) obj).f951b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f951b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i5) {
        parcel.writeLong(this.f951b);
    }
}
