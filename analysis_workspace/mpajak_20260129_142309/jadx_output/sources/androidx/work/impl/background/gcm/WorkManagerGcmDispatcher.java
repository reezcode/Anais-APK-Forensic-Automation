package androidx.work.impl.background.gcm;

import android.os.Bundle;
import android.os.PowerManager;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.Schedulers;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import z0.b;

/* loaded from: classes20.dex */
public class WorkManagerGcmDispatcher {
    private static final long AWAIT_TIME_IN_MILLISECONDS = 600000;
    private static final long AWAIT_TIME_IN_MINUTES = 10;
    public static final String TAG = Logger.tagWithPrefix("WrkMgrGcmDispatcher");
    private final StartStopTokens mStartStopTokens = new StartStopTokens();
    public WorkManagerImpl mWorkManagerImpl;
    private final WorkTimer mWorkTimer;

    /* renamed from: androidx.work.impl.background.gcm.WorkManagerGcmDispatcher$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$work$WorkInfo$State;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            $SwitchMap$androidx$work$WorkInfo$State = iArr;
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes21.dex */
    public static class WorkSpecExecutionListener implements ExecutionListener {
        private static final String TAG = Logger.tagWithPrefix("WorkSpecExecutionListener");
        private final WorkGenerationalId mGenerationalId;
        private final CountDownLatch mLatch = new CountDownLatch(1);
        private boolean mNeedsReschedule = false;
        private final StartStopTokens mStartStopTokens;

        public WorkSpecExecutionListener(@NonNull WorkGenerationalId workGenerationalId, @NonNull StartStopTokens startStopTokens) {
            this.mGenerationalId = workGenerationalId;
            this.mStartStopTokens = startStopTokens;
        }

        public CountDownLatch getLatch() {
            return this.mLatch;
        }

        public boolean needsReschedule() {
            return this.mNeedsReschedule;
        }

        @Override // androidx.work.impl.ExecutionListener
        /* renamed from: onExecuted */
        public void lambda$runOnExecuted$1(@NonNull WorkGenerationalId workGenerationalId, boolean z4) {
            if (this.mGenerationalId.equals(workGenerationalId)) {
                this.mStartStopTokens.remove(workGenerationalId);
                this.mNeedsReschedule = z4;
                this.mLatch.countDown();
                return;
            }
            Logger.get().warning(TAG, "Notified for " + workGenerationalId + ", but was looking for " + this.mGenerationalId);
        }
    }

    /* loaded from: classes7.dex */
    public static class WorkSpecTimeLimitExceededListener implements WorkTimer.TimeLimitExceededListener {
        private static final String TAG = Logger.tagWithPrefix("WrkTimeLimitExceededLstnr");
        private final StartStopToken mStartStopToken;
        private final WorkManagerImpl mWorkManager;

        public WorkSpecTimeLimitExceededListener(@NonNull WorkManagerImpl workManagerImpl, @NonNull StartStopToken startStopToken) {
            this.mWorkManager = workManagerImpl;
            this.mStartStopToken = startStopToken;
        }

        @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
        public void onTimeLimitExceeded(@NonNull WorkGenerationalId workGenerationalId) {
            Logger.get().debug(TAG, "WorkSpec time limit exceeded " + workGenerationalId);
            this.mWorkManager.stopWork(this.mStartStopToken);
        }
    }

    public WorkManagerGcmDispatcher(@NonNull WorkManagerImpl workManagerImpl, @NonNull WorkTimer workTimer) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkTimer = workTimer;
    }

    private int reschedule(@NonNull final String str) {
        final WorkDatabase workDatabase = this.mWorkManagerImpl.getWorkDatabase();
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.background.gcm.WorkManagerGcmDispatcher.2
            @Override // java.lang.Runnable
            public void run() {
                workDatabase.workSpecDao().markWorkSpecScheduled(str, -1L);
                Schedulers.schedule(WorkManagerGcmDispatcher.this.mWorkManagerImpl.getConfiguration(), WorkManagerGcmDispatcher.this.mWorkManagerImpl.getWorkDatabase(), WorkManagerGcmDispatcher.this.mWorkManagerImpl.getSchedulers());
            }
        });
        Logger.get().debug(TAG, "Returning RESULT_SUCCESS for WorkSpec " + str);
        return 0;
    }

    @MainThread
    public void onInitializeTasks() {
        this.mWorkManagerImpl.getWorkTaskExecutor().executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.background.gcm.WorkManagerGcmDispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                Logger.get().debug(WorkManagerGcmDispatcher.TAG, "onInitializeTasks(): Rescheduling work");
                WorkManagerGcmDispatcher.this.mWorkManagerImpl.rescheduleEligibleWork();
            }
        });
    }

    public int onRunTask(@NonNull b bVar) {
        Logger logger;
        String str;
        StringBuilder sb;
        String str2;
        Logger logger2;
        String str3;
        Logger logger3 = Logger.get();
        String str4 = TAG;
        logger3.debug(str4, "Handling task " + bVar);
        String str5 = bVar.f6099a;
        if (str5 != null && !str5.isEmpty()) {
            Bundle bundle = bVar.f6100b;
            WorkGenerationalId workGenerationalId = new WorkGenerationalId(str5, bundle != null ? bundle.getInt(GcmTaskConverter.EXTRA_WORK_GENERATION, 0) : 0);
            WorkSpecExecutionListener workSpecExecutionListener = new WorkSpecExecutionListener(workGenerationalId, this.mStartStopTokens);
            StartStopToken startStopToken = this.mStartStopTokens.tokenFor(workGenerationalId);
            WorkSpecTimeLimitExceededListener workSpecTimeLimitExceededListener = new WorkSpecTimeLimitExceededListener(this.mWorkManagerImpl, startStopToken);
            Processor processor = this.mWorkManagerImpl.getProcessor();
            processor.addExecutionListener(workSpecExecutionListener);
            PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(this.mWorkManagerImpl.getApplicationContext(), "WorkGcm-onRunTask (" + str5 + ")");
            this.mWorkManagerImpl.startWork(startStopToken);
            this.mWorkTimer.startTimer(workGenerationalId, 600000L, workSpecTimeLimitExceededListener);
            try {
                try {
                    newWakeLock.acquire();
                    workSpecExecutionListener.getLatch().await(AWAIT_TIME_IN_MINUTES, TimeUnit.MINUTES);
                    processor.removeExecutionListener(workSpecExecutionListener);
                    this.mWorkTimer.stopTimer(workGenerationalId);
                    newWakeLock.release();
                    if (workSpecExecutionListener.needsReschedule()) {
                        logger2 = Logger.get();
                        str3 = "Rescheduling WorkSpec" + str5;
                    } else {
                        WorkSpec workSpec = this.mWorkManagerImpl.getWorkDatabase().workSpecDao().getWorkSpec(str5);
                        WorkInfo.State state = workSpec != null ? workSpec.state : null;
                        if (state == null) {
                            logger = Logger.get();
                            sb = new StringBuilder();
                            str2 = "WorkSpec %s does not exist";
                        } else {
                            int i5 = AnonymousClass3.$SwitchMap$androidx$work$WorkInfo$State[state.ordinal()];
                            if (i5 == 1 || i5 == 2) {
                                Logger.get().debug(str4, "Returning RESULT_SUCCESS for WorkSpec " + str5);
                                return 0;
                            }
                            if (i5 != 3) {
                                logger2 = Logger.get();
                                str3 = "Rescheduling eligible work.";
                            } else {
                                logger = Logger.get();
                                sb = new StringBuilder();
                                str2 = "Returning RESULT_FAILURE for WorkSpec ";
                            }
                        }
                        sb.append(str2);
                        sb.append(str5);
                        str = sb.toString();
                    }
                    logger2.debug(str4, str3);
                    return reschedule(str5);
                } catch (InterruptedException unused) {
                    Logger.get().debug(TAG, "Rescheduling WorkSpec" + str5);
                    int reschedule = reschedule(str5);
                    processor.removeExecutionListener(workSpecExecutionListener);
                    this.mWorkTimer.stopTimer(workGenerationalId);
                    newWakeLock.release();
                    return reschedule;
                }
            } catch (Throwable th) {
                processor.removeExecutionListener(workSpecExecutionListener);
                this.mWorkTimer.stopTimer(workGenerationalId);
                newWakeLock.release();
                throw th;
            }
        }
        logger = Logger.get();
        str = "Bad request. No workSpecId.";
        logger.debug(str4, str);
        return 2;
    }
}
