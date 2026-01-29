package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class ParcelableRemoteWorkRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableRemoteWorkRequest> CREATOR = new Parcelable.Creator<ParcelableRemoteWorkRequest>() { // from class: androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableRemoteWorkRequest createFromParcel(Parcel parcel) {
            return new ParcelableRemoteWorkRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableRemoteWorkRequest[] newArray(int i5) {
            return new ParcelableRemoteWorkRequest[i5];
        }
    };
    private final ParcelableWorkerParameters mParcelableWorkerParameters;
    private final String mWorkerClassName;

    public ParcelableRemoteWorkRequest(@NonNull Parcel parcel) {
        this.mWorkerClassName = parcel.readString();
        this.mParcelableWorkerParameters = new ParcelableWorkerParameters(parcel);
    }

    public ParcelableRemoteWorkRequest(@NonNull String str, @NonNull WorkerParameters workerParameters) {
        this.mWorkerClassName = str;
        this.mParcelableWorkerParameters = new ParcelableWorkerParameters(workerParameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public ParcelableWorkerParameters getParcelableWorkerParameters() {
        return this.mParcelableWorkerParameters;
    }

    @NonNull
    public String getWorkerClassName() {
        return this.mWorkerClassName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i5) {
        parcel.writeString(this.mWorkerClassName);
        this.mParcelableWorkerParameters.writeToParcel(parcel, i5);
    }
}
