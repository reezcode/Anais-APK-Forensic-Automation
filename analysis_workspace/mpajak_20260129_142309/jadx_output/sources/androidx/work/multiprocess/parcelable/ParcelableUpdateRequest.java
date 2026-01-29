package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes9.dex */
public class ParcelableUpdateRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableUpdateRequest> CREATOR = new Parcelable.Creator<ParcelableUpdateRequest>() { // from class: androidx.work.multiprocess.parcelable.ParcelableUpdateRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableUpdateRequest createFromParcel(@NonNull Parcel parcel) {
            return new ParcelableUpdateRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableUpdateRequest[] newArray(int i5) {
            return new ParcelableUpdateRequest[i5];
        }
    };
    private final String mId;
    private final ParcelableData mParcelableData;

    public ParcelableUpdateRequest(@NonNull Parcel parcel) {
        this.mId = parcel.readString();
        this.mParcelableData = new ParcelableData(parcel);
    }

    public ParcelableUpdateRequest(@NonNull UUID uuid, @NonNull Data data) {
        this.mId = uuid.toString();
        this.mParcelableData = new ParcelableData(data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public Data getData() {
        return this.mParcelableData.getData();
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i5) {
        parcel.writeString(this.mId);
        this.mParcelableData.writeToParcel(parcel, i5);
    }
}
