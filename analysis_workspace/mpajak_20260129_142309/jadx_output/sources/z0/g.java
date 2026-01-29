package z0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.OneoffTask;

/* loaded from: classes15.dex */
public final class g implements Parcelable.Creator<OneoffTask> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OneoffTask createFromParcel(Parcel parcel) {
        return new OneoffTask(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OneoffTask[] newArray(int i5) {
        return new OneoffTask[i5];
    }
}
