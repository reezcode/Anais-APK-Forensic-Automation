package androidx.work.impl.utils;

import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkManagerImpl;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes14.dex */
public class StopWorkRunnable implements Runnable {
    private static final String TAG = Logger.tagWithPrefix("StopWorkRunnable");
    private final boolean mStopInForeground;
    private final StartStopToken mToken;
    private final WorkManagerImpl mWorkManagerImpl;

    public StopWorkRunnable(@NonNull WorkManagerImpl workManagerImpl, @NonNull StartStopToken startStopToken, boolean z4) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mToken = startStopToken;
        this.mStopInForeground = z4;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean stopForegroundWork = this.mStopInForeground ? this.mWorkManagerImpl.getProcessor().stopForegroundWork(this.mToken) : this.mWorkManagerImpl.getProcessor().stopWork(this.mToken);
        Logger logger = Logger.get();
        String str = TAG;
        StringBuilder g5 = d.g("StopWorkRunnable for ");
        g5.append(this.mToken.getId().getWorkSpecId());
        g5.append("; Processor.stopWork = ");
        g5.append(stopForegroundWork);
        logger.debug(str, g5.toString());
    }
}
