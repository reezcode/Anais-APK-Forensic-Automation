package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0017a();

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final u f917b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final u f918c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final c f919d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public u f920e;

    /* renamed from: f, reason: collision with root package name */
    public final int f921f;

    /* renamed from: g, reason: collision with root package name */
    public final int f922g;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    /* loaded from: classes23.dex */
    public class C0017a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final a createFromParcel(@NonNull Parcel parcel) {
            return new a((u) parcel.readParcelable(u.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final a[] newArray(int i5) {
            return new a[i5];
        }
    }

    /* loaded from: classes17.dex */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final long f923e = c0.a(u.k(1900, 0).f1022g);

        /* renamed from: f, reason: collision with root package name */
        public static final long f924f = c0.a(u.k(2100, 11).f1022g);

        /* renamed from: a, reason: collision with root package name */
        public long f925a;

        /* renamed from: b, reason: collision with root package name */
        public long f926b;

        /* renamed from: c, reason: collision with root package name */
        public Long f927c;

        /* renamed from: d, reason: collision with root package name */
        public c f928d;

        public b(@NonNull a aVar) {
            this.f925a = f923e;
            this.f926b = f924f;
            this.f928d = new f();
            this.f925a = aVar.f917b.f1022g;
            this.f926b = aVar.f918c.f1022g;
            this.f927c = Long.valueOf(aVar.f920e.f1022g);
            this.f928d = aVar.f919d;
        }
    }

    /* loaded from: classes11.dex */
    public interface c extends Parcelable {
        boolean e(long j5);
    }

    public a(u uVar, u uVar2, c cVar, u uVar3) {
        this.f917b = uVar;
        this.f918c = uVar2;
        this.f920e = uVar3;
        this.f919d = cVar;
        if (uVar3 != null && uVar.f1017b.compareTo(uVar3.f1017b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (uVar3 != null && uVar3.f1017b.compareTo(uVar2.f1017b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f922g = uVar.p(uVar2) + 1;
        this.f921f = (uVar2.f1019d - uVar.f1019d) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f917b.equals(aVar.f917b) && this.f918c.equals(aVar.f918c) && ObjectsCompat.equals(this.f920e, aVar.f920e) && this.f919d.equals(aVar.f919d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f917b, this.f918c, this.f920e, this.f919d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f917b, 0);
        parcel.writeParcelable(this.f918c, 0);
        parcel.writeParcelable(this.f920e, 0);
        parcel.writeParcelable(this.f919d, 0);
    }
}
