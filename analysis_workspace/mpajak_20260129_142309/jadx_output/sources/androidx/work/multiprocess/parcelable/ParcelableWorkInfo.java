package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes23.dex */
public class ParcelableWorkInfo implements Parcelable {
    private final WorkInfo mWorkInfo;
    private static final String[] sEMPTY = new String[0];
    public static final Parcelable.Creator<ParcelableWorkInfo> CREATOR = new Parcelable.Creator<ParcelableWorkInfo>() { // from class: androidx.work.multiprocess.parcelable.ParcelableWorkInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkInfo createFromParcel(Parcel parcel) {
            return new ParcelableWorkInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkInfo[] newArray(int i5) {
            return new ParcelableWorkInfo[i5];
        }
    };

    public ParcelableWorkInfo(@NonNull Parcel parcel) {
        this.mWorkInfo = new WorkInfo(UUID.fromString(parcel.readString()), WorkTypeConverters.intToState(parcel.readInt()), new ParcelableData(parcel).getData(), Arrays.asList(parcel.createStringArray()), new ParcelableData(parcel).getData(), parcel.readInt(), parcel.readInt());
    }

    public ParcelableWorkInfo(@NonNull WorkInfo workInfo) {
        this.mWorkInfo = workInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public WorkInfo getWorkInfo() {
        return this.mWorkInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i5) {
        parcel.writeString(this.mWorkInfo.getId().toString());
        parcel.writeInt(WorkTypeConverters.stateToInt(this.mWorkInfo.getState()));
        new ParcelableData(this.mWorkInfo.getOutputData()).writeToParcel(parcel, i5);
        parcel.writeStringArray((String[]) new ArrayList(this.mWorkInfo.getTags()).toArray(sEMPTY));
        new ParcelableData(this.mWorkInfo.getProgress()).writeToParcel(parcel, i5);
        parcel.writeInt(this.mWorkInfo.getRunAttemptCount());
        parcel.writeInt(this.mWorkInfo.getGeneration());
    }
}
