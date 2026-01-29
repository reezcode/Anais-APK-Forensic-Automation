package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.location.c;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTrackerImpl;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import h2.a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ConstraintTrackingWorker extends ListenableWorker implements WorkConstraintsCallback {
    private volatile boolean areConstraintsUnmet;
    private ListenableWorker delegate;
    private final SettableFuture<ListenableWorker.Result> future;
    private final Object lock;
    private final WorkerParameters workerParameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = SettableFuture.create();
    }

    private final void setupAndRunConstraintTrackingWork() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.future.isCancelled()) {
            return;
        }
        String string = getInputData().getString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
        Logger logger = Logger.get();
        Intrinsics.checkNotNullExpressionValue(logger, "get()");
        if (string == null || string.length() == 0) {
            str6 = ConstraintTrackingWorkerKt.TAG;
            logger.error(str6, "No worker to delegate to.");
        } else {
            ListenableWorker createWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), string, this.workerParameters);
            this.delegate = createWorkerWithDefaultFallback;
            if (createWorkerWithDefaultFallback == null) {
                str5 = ConstraintTrackingWorkerKt.TAG;
                logger.debug(str5, "No worker to delegate to.");
            } else {
                WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(workManagerImpl, "getInstance(applicationContext)");
                WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
                String uuid = getId().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
                WorkSpec workSpec = workSpecDao.getWorkSpec(uuid);
                if (workSpec != null) {
                    Trackers trackers = workManagerImpl.getTrackers();
                    Intrinsics.checkNotNullExpressionValue(trackers, "workManagerImpl.trackers");
                    WorkConstraintsTrackerImpl workConstraintsTrackerImpl = new WorkConstraintsTrackerImpl(trackers, this);
                    workConstraintsTrackerImpl.replace(CollectionsKt.listOf(workSpec));
                    String uuid2 = getId().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
                    if (!workConstraintsTrackerImpl.areAllConstraintsMet(uuid2)) {
                        str = ConstraintTrackingWorkerKt.TAG;
                        logger.debug(str, "Constraints not met for delegate " + string + ". Requesting retry.");
                        SettableFuture<ListenableWorker.Result> future = this.future;
                        Intrinsics.checkNotNullExpressionValue(future, "future");
                        ConstraintTrackingWorkerKt.setRetry(future);
                        return;
                    }
                    str2 = ConstraintTrackingWorkerKt.TAG;
                    logger.debug(str2, "Constraints met for delegate " + string);
                    try {
                        ListenableWorker listenableWorker = this.delegate;
                        Intrinsics.checkNotNull(listenableWorker);
                        a<ListenableWorker.Result> startWork = listenableWorker.startWork();
                        Intrinsics.checkNotNullExpressionValue(startWork, "delegate!!.startWork()");
                        startWork.addListener(new c(this, startWork, 2), getBackgroundExecutor());
                        return;
                    } catch (Throwable th) {
                        str3 = ConstraintTrackingWorkerKt.TAG;
                        logger.debug(str3, androidx.appcompat.widget.a.j("Delegated worker ", string, " threw exception in startWork."), th);
                        synchronized (this.lock) {
                            if (!this.areConstraintsUnmet) {
                                SettableFuture<ListenableWorker.Result> future2 = this.future;
                                Intrinsics.checkNotNullExpressionValue(future2, "future");
                                ConstraintTrackingWorkerKt.setFailed(future2);
                                return;
                            } else {
                                str4 = ConstraintTrackingWorkerKt.TAG;
                                logger.debug(str4, "Constraints were unmet, Retrying.");
                                SettableFuture<ListenableWorker.Result> future3 = this.future;
                                Intrinsics.checkNotNullExpressionValue(future3, "future");
                                ConstraintTrackingWorkerKt.setRetry(future3);
                                return;
                            }
                        }
                    }
                }
            }
        }
        SettableFuture<ListenableWorker.Result> future4 = this.future;
        Intrinsics.checkNotNullExpressionValue(future4, "future");
        ConstraintTrackingWorkerKt.setFailed(future4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndRunConstraintTrackingWork$lambda$2(ConstraintTrackingWorker this$0, a innerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.lock) {
            if (this$0.areConstraintsUnmet) {
                SettableFuture<ListenableWorker.Result> future = this$0.future;
                Intrinsics.checkNotNullExpressionValue(future, "future");
                ConstraintTrackingWorkerKt.setRetry(future);
            } else {
                this$0.future.setFuture(innerFuture);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(ConstraintTrackingWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setupAndRunConstraintTrackingWork();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public final ListenableWorker getDelegate() {
        return this.delegate;
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(List<WorkSpec> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(List<WorkSpec> workSpecs) {
        String str;
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        Logger logger = Logger.get();
        str = ConstraintTrackingWorkerKt.TAG;
        logger.debug(str, "Constraints changed for " + workSpecs);
        synchronized (this.lock) {
            this.areConstraintsUnmet = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.delegate;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        listenableWorker.stop();
    }

    @Override // androidx.work.ListenableWorker
    public a<ListenableWorker.Result> startWork() {
        getBackgroundExecutor().execute(new androidx.room.c(this, 3));
        SettableFuture<ListenableWorker.Result> future = this.future;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }
}
