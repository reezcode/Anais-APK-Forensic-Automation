package p0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s0.d;

/* loaded from: classes3.dex */
public final class a extends t0.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f4623b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4624c;

    /* renamed from: d, reason: collision with root package name */
    public final PendingIntent f4625d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4626e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f4622f = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new i();

    public a(int i5) {
        this.f4623b = 1;
        this.f4624c = i5;
        this.f4625d = null;
        this.f4626e = null;
    }

    public a(int i5, int i6, PendingIntent pendingIntent, String str) {
        this.f4623b = i5;
        this.f4624c = i6;
        this.f4625d = pendingIntent;
        this.f4626e = str;
    }

    public a(int i5, PendingIntent pendingIntent) {
        this.f4623b = 1;
        this.f4624c = i5;
        this.f4625d = pendingIntent;
        this.f4626e = null;
    }

    public static String j(int i5) {
        if (i5 == 99) {
            return "UNFINISHED";
        }
        if (i5 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i5) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i5) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i5);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4624c == aVar.f4624c && s0.d.a(this.f4625d, aVar.f4625d) && s0.d.a(this.f4626e, aVar.f4626e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4624c), this.f4625d, this.f4626e});
    }

    public final String toString() {
        d.a aVar = new d.a(this);
        aVar.a("statusCode", j(this.f4624c));
        aVar.a("resolution", this.f4625d);
        aVar.a("message", this.f4626e);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int M = i.g.M(parcel, 20293);
        int i6 = this.f4623b;
        i.g.O(parcel, 1, 4);
        parcel.writeInt(i6);
        int i7 = this.f4624c;
        i.g.O(parcel, 2, 4);
        parcel.writeInt(i7);
        i.g.K(parcel, 3, this.f4625d, i5);
        i.g.L(parcel, 4, this.f4626e);
        i.g.N(parcel, M);
    }
}
