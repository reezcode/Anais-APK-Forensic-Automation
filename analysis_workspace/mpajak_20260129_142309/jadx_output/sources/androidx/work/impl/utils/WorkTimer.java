package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes10.dex */
public class WorkTimer {
    private static final String TAG = Logger.tagWithPrefix("WorkTimer");
    public final RunnableScheduler mRunnableScheduler;
    public final Map<WorkGenerationalId, WorkTimerRunnable> mTimerMap = new HashMap();
    public final Map<WorkGenerationalId, TimeLimitExceededListener> mListeners = new HashMap();
    public final Object mLock = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(@NonNull WorkGenerationalId workGenerationalId);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes19.dex */
    public static class WorkTimerRunnable implements Runnable {
        public static final String TAG = "WrkTimerRunnable";
        private final WorkGenerationalId mWorkGenerationalId;
        private final WorkTimer mWorkTimer;

        public WorkTimerRunnable(@NonNull WorkTimer workTimer, @NonNull WorkGenerationalId workGenerationalId) {
            this.mWorkTimer = workTimer;
            this.mWorkGenerationalId = workGenerationalId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.mWorkTimer.mLock) {
                if (this.mWorkTimer.mTimerMap.remove(this.mWorkGenerationalId) != null) {
                    TimeLimitExceededListener remove = this.mWorkTimer.mListeners.remove(this.mWorkGenerationalId);
                    if (remove != null) {
                        remove.onTimeLimitExceeded(this.mWorkGenerationalId);
                    }
                } else {
                    Logger.get().debug(TAG, String.format("Timer with %s is already marked as complete.", this.mWorkGenerationalId));
                }
            }
        }
    }

    public WorkTimer(@NonNull RunnableScheduler runnableScheduler) {
        this.mRunnableScheduler = runnableScheduler;
    }

    @NonNull
    @VisibleForTesting
    public Map<WorkGenerationalId, TimeLimitExceededListener> getListeners() {
        Map<WorkGenerationalId, TimeLimitExceededListener> map;
        synchronized (this.mLock) {
            map = this.mListeners;
        }
        return map;
    }

    @NonNull
    @VisibleForTesting
    public Map<WorkGenerationalId, WorkTimerRunnable> getTimerMap() {
        Map<WorkGenerationalId, WorkTimerRunnable> map;
        synchronized (this.mLock) {
            map = this.mTimerMap;
        }
        return map;
    }

    public void startTimer(@NonNull WorkGenerationalId workGenerationalId, long j5, @NonNull TimeLimitExceededListener timeLimitExceededListener) {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, "Starting timer for " + workGenerationalId);
            stopTimer(workGenerationalId);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, workGenerationalId);
            this.mTimerMap.put(workGenerationalId, workTimerRunnable);
            this.mListeners.put(workGenerationalId, timeLimitExceededListener);
            this.mRunnableScheduler.scheduleWithDelay(j5, workTimerRunnable);
        }
    }

    public void stopTimer(@NonNull WorkGenerationalId workGenerationalId) {
        synchronized (this.mLock) {
            if (this.mTimerMap.remove(workGenerationalId) != null) {
                Logger.get().debug(TAG, "Stopping timer for " + workGenerationalId);
                this.mListeners.remove(workGenerationalId);
            }
        }
    }
}
