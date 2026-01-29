package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkContinuation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class RemoteWorkContinuationImpl extends RemoteWorkContinuation {
    private final RemoteWorkManagerClient mClient;
    private final WorkContinuation mContinuation;

    public RemoteWorkContinuationImpl(@NonNull RemoteWorkManagerClient remoteWorkManagerClient, @NonNull WorkContinuation workContinuation) {
        this.mClient = remoteWorkManagerClient;
        this.mContinuation = workContinuation;
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    @NonNull
    @SuppressLint({"EnqueueWork"})
    public RemoteWorkContinuation combineInternal(@NonNull List<RemoteWorkContinuation> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<RemoteWorkContinuation> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RemoteWorkContinuationImpl) it.next()).mContinuation);
        }
        return new RemoteWorkContinuationImpl(this.mClient, WorkContinuation.combine(arrayList));
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    @NonNull
    public h2.a<Void> enqueue() {
        return this.mClient.enqueue(this.mContinuation);
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    @NonNull
    @SuppressLint({"EnqueueWork"})
    public RemoteWorkContinuation then(@NonNull List<OneTimeWorkRequest> list) {
        return new RemoteWorkContinuationImpl(this.mClient, this.mContinuation.then(list));
    }
}
