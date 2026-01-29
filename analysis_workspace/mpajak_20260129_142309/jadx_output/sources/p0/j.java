package p0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes18.dex */
public final class j implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int g5 = t0.b.g(parcel);
        String str = null;
        int i5 = 0;
        long j5 = -1;
        while (parcel.dataPosition() < g5) {
            int readInt = parcel.readInt();
            int i6 = 65535 & readInt;
            if (i6 == 1) {
                str = t0.b.b(parcel, readInt);
            } else if (i6 == 2) {
                i5 = t0.b.d(parcel, readInt);
            } else if (i6 != 3) {
                t0.b.f(parcel, readInt);
            } else {
                t0.b.h(parcel, readInt, 8);
                j5 = parcel.readLong();
            }
        }
        t0.b.c(parcel, g5);
        return new b(str, i5, j5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i5) {
        return new b[i5];
    }
}
