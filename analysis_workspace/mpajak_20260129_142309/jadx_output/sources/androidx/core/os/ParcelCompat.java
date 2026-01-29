package androidx.core.os;

import android.os.Parcel;
import androidx.annotation.NonNull;

/* loaded from: classes17.dex */
public final class ParcelCompat {
    private ParcelCompat() {
    }

    public static boolean readBoolean(@NonNull Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void writeBoolean(@NonNull Parcel parcel, boolean z4) {
        parcel.writeInt(z4 ? 1 : 0);
    }
}
