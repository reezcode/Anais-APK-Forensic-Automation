package q0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes6.dex */
public final class c implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final Status createFromParcel(Parcel parcel) {
        int g5 = t0.b.g(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < g5) {
            int readInt = parcel.readInt();
            int i7 = 65535 & readInt;
            if (i7 == 1) {
                i6 = t0.b.d(parcel, readInt);
            } else if (i7 == 2) {
                str = t0.b.b(parcel, readInt);
            } else if (i7 == 3) {
                pendingIntent = (PendingIntent) t0.b.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i7 != 1000) {
                t0.b.f(parcel, readInt);
            } else {
                i5 = t0.b.d(parcel, readInt);
            }
        }
        t0.b.c(parcel, g5);
        return new Status(i5, i6, str, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i5) {
        return new Status[i5];
    }
}
