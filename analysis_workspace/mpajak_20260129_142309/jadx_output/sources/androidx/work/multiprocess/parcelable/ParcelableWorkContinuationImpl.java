package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkRequestHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes10.dex */
public class ParcelableWorkContinuationImpl implements Parcelable {
    private WorkContinuationImplInfo mInfo;
    private static final ExistingWorkPolicy[] sValues = ExistingWorkPolicy.values();
    public static final Parcelable.Creator<ParcelableWorkContinuationImpl> CREATOR = new Parcelable.Creator<ParcelableWorkContinuationImpl>() { // from class: androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkContinuationImpl createFromParcel(@NonNull Parcel parcel) {
            return new ParcelableWorkContinuationImpl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkContinuationImpl[] newArray(int i5) {
            return new ParcelableWorkContinuationImpl[i5];
        }
    };

    /* loaded from: classes17.dex */
    public static class WorkContinuationImplInfo {
        private final String mName;
        private List<WorkContinuationImplInfo> mParents;
        private final List<? extends WorkRequest> mRequests;
        private final ExistingWorkPolicy mWorkPolicy;

        public WorkContinuationImplInfo(@NonNull WorkContinuationImpl workContinuationImpl) {
            this.mName = workContinuationImpl.getName();
            this.mWorkPolicy = workContinuationImpl.getExistingWorkPolicy();
            this.mRequests = workContinuationImpl.getWork();
            List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
            this.mParents = null;
            if (parents != null) {
                this.mParents = new ArrayList(parents.size());
                Iterator<WorkContinuationImpl> it = parents.iterator();
                while (it.hasNext()) {
                    this.mParents.add(new WorkContinuationImplInfo(it.next()));
                }
            }
        }

        public WorkContinuationImplInfo(@Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends WorkRequest> list, @Nullable List<WorkContinuationImplInfo> list2) {
            this.mName = str;
            this.mWorkPolicy = existingWorkPolicy;
            this.mRequests = list;
            this.mParents = list2;
        }

        @Nullable
        private static List<WorkContinuationImpl> parents(@NonNull WorkManagerImpl workManagerImpl, @Nullable List<WorkContinuationImplInfo> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (WorkContinuationImplInfo workContinuationImplInfo : list) {
                arrayList.add(new WorkContinuationImpl(workManagerImpl, workContinuationImplInfo.getName(), workContinuationImplInfo.getExistingWorkPolicy(), workContinuationImplInfo.getWork(), parents(workManagerImpl, workContinuationImplInfo.getParentInfos())));
            }
            return arrayList;
        }

        @NonNull
        public ExistingWorkPolicy getExistingWorkPolicy() {
            return this.mWorkPolicy;
        }

        @Nullable
        public String getName() {
            return this.mName;
        }

        @Nullable
        public List<WorkContinuationImplInfo> getParentInfos() {
            return this.mParents;
        }

        @NonNull
        public List<? extends WorkRequest> getWork() {
            return this.mRequests;
        }

        @NonNull
        public WorkContinuationImpl toWorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl) {
            return new WorkContinuationImpl(workManagerImpl, getName(), getExistingWorkPolicy(), getWork(), parents(workManagerImpl, getParentInfos()));
        }
    }

    public ParcelableWorkContinuationImpl(@NonNull Parcel parcel) {
        ArrayList arrayList = null;
        String readString = ParcelUtils.readBooleanValue(parcel) ? parcel.readString() : null;
        ExistingWorkPolicy existingWorkPolicy = sValues[parcel.readInt()];
        int readInt = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(readInt);
        ClassLoader classLoader = getClass().getClassLoader();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList2.add((WorkRequestHolder) ((ParcelableWorkRequest) parcel.readParcelable(classLoader)).getWorkRequest());
        }
        if (ParcelUtils.readBooleanValue(parcel)) {
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            for (int i6 = 0; i6 < readInt2; i6++) {
                arrayList3.add(((ParcelableWorkContinuationImpl) parcel.readParcelable(classLoader)).getInfo());
            }
            arrayList = arrayList3;
        }
        this.mInfo = new WorkContinuationImplInfo(readString, existingWorkPolicy, arrayList2, arrayList);
    }

    public ParcelableWorkContinuationImpl(@NonNull WorkContinuationImpl workContinuationImpl) {
        this.mInfo = new WorkContinuationImplInfo(workContinuationImpl);
    }

    public ParcelableWorkContinuationImpl(@NonNull WorkContinuationImplInfo workContinuationImplInfo) {
        this.mInfo = workContinuationImplInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public WorkContinuationImplInfo getInfo() {
        return this.mInfo;
    }

    @NonNull
    public WorkContinuationImpl toWorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl) {
        return this.mInfo.toWorkContinuationImpl(workManagerImpl);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i5) {
        String name = this.mInfo.getName();
        boolean z4 = !TextUtils.isEmpty(name);
        ParcelUtils.writeBooleanValue(parcel, z4);
        if (z4) {
            parcel.writeString(name);
        }
        parcel.writeInt(this.mInfo.getExistingWorkPolicy().ordinal());
        List<? extends WorkRequest> work = this.mInfo.getWork();
        parcel.writeInt(work.size());
        if (!work.isEmpty()) {
            for (int i6 = 0; i6 < work.size(); i6++) {
                parcel.writeParcelable(new ParcelableWorkRequest(work.get(i6)), i5);
            }
        }
        List<WorkContinuationImplInfo> parentInfos = this.mInfo.getParentInfos();
        boolean z5 = (parentInfos == null || parentInfos.isEmpty()) ? false : true;
        ParcelUtils.writeBooleanValue(parcel, z5);
        if (z5) {
            parcel.writeInt(parentInfos.size());
            for (int i7 = 0; i7 < parentInfos.size(); i7++) {
                parcel.writeParcelable(new ParcelableWorkContinuationImpl(parentInfos.get(i7)), i5);
            }
        }
    }
}
