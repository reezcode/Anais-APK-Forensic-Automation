package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes25.dex */
public class ParcelableRuntimeExtras implements Parcelable {
    public static final Parcelable.Creator<ParcelableRuntimeExtras> CREATOR = new Parcelable.Creator<ParcelableRuntimeExtras>() { // from class: androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableRuntimeExtras createFromParcel(Parcel parcel) {
            return new ParcelableRuntimeExtras(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableRuntimeExtras[] newArray(int i5) {
            return new ParcelableRuntimeExtras[i5];
        }
    };
    private WorkerParameters.RuntimeExtras mRuntimeExtras;

    public ParcelableRuntimeExtras(@NonNull Parcel parcel) {
        ArrayList arrayList;
        ClassLoader classLoader = getClass().getClassLoader();
        Network network = ParcelUtils.readBooleanValue(parcel) ? (Network) parcel.readParcelable(classLoader) : null;
        if (ParcelUtils.readBooleanValue(parcel)) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            arrayList = new ArrayList(readParcelableArray.length);
            for (Parcelable parcelable : readParcelableArray) {
                arrayList.add((Uri) parcelable);
            }
        } else {
            arrayList = null;
        }
        ArrayList<String> createStringArrayList = ParcelUtils.readBooleanValue(parcel) ? parcel.createStringArrayList() : null;
        WorkerParameters.RuntimeExtras runtimeExtras = new WorkerParameters.RuntimeExtras();
        this.mRuntimeExtras = runtimeExtras;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            runtimeExtras.network = network;
        }
        if (i5 >= 24) {
            if (arrayList != null) {
                runtimeExtras.triggeredContentUris = arrayList;
            }
            if (createStringArrayList != null) {
                runtimeExtras.triggeredContentAuthorities = createStringArrayList;
            }
        }
    }

    public ParcelableRuntimeExtras(@NonNull WorkerParameters.RuntimeExtras runtimeExtras) {
        this.mRuntimeExtras = runtimeExtras;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public WorkerParameters.RuntimeExtras getRuntimeExtras() {
        return this.mRuntimeExtras;
    }

    @Override // android.os.Parcelable
    @SuppressLint({"NewApi"})
    public void writeToParcel(@NonNull Parcel parcel, int i5) {
        List<String> list;
        int i6 = Build.VERSION.SDK_INT;
        List<Uri> list2 = null;
        Network network = i6 >= 28 ? this.mRuntimeExtras.network : null;
        boolean z4 = network != null;
        ParcelUtils.writeBooleanValue(parcel, z4);
        if (z4) {
            parcel.writeParcelable(network, i5);
        }
        if (i6 >= 24) {
            WorkerParameters.RuntimeExtras runtimeExtras = this.mRuntimeExtras;
            list2 = runtimeExtras.triggeredContentUris;
            list = runtimeExtras.triggeredContentAuthorities;
        } else {
            list = null;
        }
        boolean z5 = (list2 == null || list2.isEmpty()) ? false : true;
        ParcelUtils.writeBooleanValue(parcel, z5);
        if (z5) {
            int size = list2.size();
            Uri[] uriArr = new Uri[size];
            for (int i7 = 0; i7 < size; i7++) {
                uriArr[i7] = list2.get(i7);
            }
            parcel.writeParcelableArray(uriArr, i5);
        }
        boolean z6 = (list == null || list.isEmpty()) ? false : true;
        ParcelUtils.writeBooleanValue(parcel, z6);
        if (z6) {
            parcel.writeStringList(list);
        }
    }
}
