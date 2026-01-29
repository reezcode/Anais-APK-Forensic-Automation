package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.d;
import com.google.android.gms.gcm.Task;
import z0.g;

/* loaded from: classes14.dex */
public class OneoffTask extends Task {
    public static final Parcelable.Creator<OneoffTask> CREATOR = new g();

    /* renamed from: k, reason: collision with root package name */
    public final long f660k;

    /* renamed from: l, reason: collision with root package name */
    public final long f661l;

    /* loaded from: classes21.dex */
    public static class a extends Task.a {

        /* renamed from: j, reason: collision with root package name */
        public long f662j = -1;

        /* renamed from: k, reason: collision with root package name */
        public long f663k = -1;

        public a() {
            this.f678e = false;
        }
    }

    public OneoffTask(Parcel parcel) {
        super(parcel);
        this.f660k = parcel.readLong();
        this.f661l = parcel.readLong();
    }

    public OneoffTask(a aVar) {
        super(aVar);
        this.f660k = aVar.f662j;
        this.f661l = aVar.f663k;
    }

    public final String toString() {
        String obj = super.toString();
        long j5 = this.f660k;
        long j6 = this.f661l;
        StringBuilder sb = new StringBuilder(d.b(obj, 64));
        sb.append(obj);
        sb.append(" windowStart=");
        sb.append(j5);
        sb.append(" windowEnd=");
        sb.append(j6);
        return sb.toString();
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        super.writeToParcel(parcel, i5);
        parcel.writeLong(this.f660k);
        parcel.writeLong(this.f661l);
    }
}
