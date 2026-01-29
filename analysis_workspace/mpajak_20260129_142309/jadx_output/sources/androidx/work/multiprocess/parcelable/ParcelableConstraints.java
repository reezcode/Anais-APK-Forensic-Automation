package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Constraints;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.concurrent.TimeUnit;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes8.dex */
public class ParcelableConstraints implements Parcelable {
    public static final Parcelable.Creator<ParcelableConstraints> CREATOR = new Parcelable.Creator<ParcelableConstraints>() { // from class: androidx.work.multiprocess.parcelable.ParcelableConstraints.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableConstraints createFromParcel(Parcel parcel) {
            return new ParcelableConstraints(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableConstraints[] newArray(int i5) {
            return new ParcelableConstraints[i5];
        }
    };
    private final Constraints mConstraints;

    public ParcelableConstraints(@NonNull Parcel parcel) {
        Constraints.Builder builder = new Constraints.Builder();
        builder.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(parcel.readInt()));
        builder.setRequiresBatteryNotLow(ParcelUtils.readBooleanValue(parcel));
        builder.setRequiresCharging(ParcelUtils.readBooleanValue(parcel));
        builder.setRequiresStorageNotLow(ParcelUtils.readBooleanValue(parcel));
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            builder.setRequiresDeviceIdle(ParcelUtils.readBooleanValue(parcel));
        }
        if (i5 >= 24) {
            if (ParcelUtils.readBooleanValue(parcel)) {
                for (Constraints.ContentUriTrigger contentUriTrigger : WorkTypeConverters.byteArrayToSetOfTriggers(parcel.createByteArray())) {
                    builder.addContentUriTrigger(contentUriTrigger.getUri(), contentUriTrigger.isTriggeredForDescendants());
                }
            }
            long readLong = parcel.readLong();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.setTriggerContentMaxDelay(readLong, timeUnit);
            builder.setTriggerContentUpdateDelay(parcel.readLong(), timeUnit);
        }
        this.mConstraints = builder.build();
    }

    public ParcelableConstraints(@NonNull Constraints constraints) {
        this.mConstraints = constraints;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public Constraints getConstraints() {
        return this.mConstraints;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i5) {
        parcel.writeInt(WorkTypeConverters.networkTypeToInt(this.mConstraints.getRequiredNetworkType()));
        ParcelUtils.writeBooleanValue(parcel, this.mConstraints.requiresBatteryNotLow());
        ParcelUtils.writeBooleanValue(parcel, this.mConstraints.requiresCharging());
        ParcelUtils.writeBooleanValue(parcel, this.mConstraints.requiresStorageNotLow());
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 23) {
            ParcelUtils.writeBooleanValue(parcel, this.mConstraints.requiresDeviceIdle());
        }
        if (i6 >= 24) {
            boolean hasContentUriTriggers = this.mConstraints.hasContentUriTriggers();
            ParcelUtils.writeBooleanValue(parcel, hasContentUriTriggers);
            if (hasContentUriTriggers) {
                parcel.writeByteArray(WorkTypeConverters.setOfTriggersToByteArray(this.mConstraints.getContentUriTriggers()));
            }
            parcel.writeLong(this.mConstraints.getContentTriggerMaxDelayMillis());
            parcel.writeLong(this.mConstraints.getContentTriggerUpdateDelayMillis());
        }
    }
}
