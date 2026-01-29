package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i.g;
import java.util.Arrays;
import q0.c;
import s0.d;
import t0.a;

/* loaded from: classes20.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    public static final Status f641f = new Status(0, null);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f642g;

    /* renamed from: h, reason: collision with root package name */
    public static final Status f643h;

    /* renamed from: b, reason: collision with root package name */
    public final int f644b;

    /* renamed from: c, reason: collision with root package name */
    public final int f645c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f646d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final PendingIntent f647e;

    static {
        new Status(14, null);
        new Status(8, null);
        f642g = new Status(15, null);
        f643h = new Status(16, null);
        new Status(17, null);
        new Status(18, null);
        CREATOR = new c();
    }

    public Status(int i5, int i6, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this.f644b = i5;
        this.f645c = i6;
        this.f646d = str;
        this.f647e = pendingIntent;
    }

    public Status(int i5, @Nullable String str) {
        this.f644b = 1;
        this.f645c = i5;
        this.f646d = str;
        this.f647e = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f644b == status.f644b && this.f645c == status.f645c && d.a(this.f646d, status.f646d) && d.a(this.f647e, status.f647e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f644b), Integer.valueOf(this.f645c), this.f646d, this.f647e});
    }

    public final String toString() {
        d.a aVar = new d.a(this);
        String str = this.f646d;
        if (str == null) {
            int i5 = this.f645c;
            switch (i5) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unknown status code: ");
                    sb.append(i5);
                    str = sb.toString();
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
            }
        }
        aVar.a("statusCode", str);
        aVar.a("resolution", this.f647e);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int M = g.M(parcel, 20293);
        int i6 = this.f645c;
        g.O(parcel, 1, 4);
        parcel.writeInt(i6);
        g.L(parcel, 2, this.f646d);
        g.K(parcel, 3, this.f647e, i5);
        int i7 = this.f644b;
        g.O(parcel, 1000, 4);
        parcel.writeInt(i7);
        g.N(parcel, M);
    }
}
