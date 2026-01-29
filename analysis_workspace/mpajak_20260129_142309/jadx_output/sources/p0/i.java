package p0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class i implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int g5 = t0.b.g(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < g5) {
            int readInt = parcel.readInt();
            int i7 = 65535 & readInt;
            if (i7 == 1) {
                i5 = t0.b.d(parcel, readInt);
            } else if (i7 == 2) {
                i6 = t0.b.d(parcel, readInt);
            } else if (i7 == 3) {
                pendingIntent = (PendingIntent) t0.b.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i7 != 4) {
                t0.b.f(parcel, readInt);
            } else {
                str = t0.b.b(parcel, readInt);
            }
        }
        t0.b.c(parcel, g5);
        return new a(i5, i6, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i5) {
        return new a[i5];
    }
}
