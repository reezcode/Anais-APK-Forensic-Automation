package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.activity.d;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes9.dex */
public class SystemForegroundDispatcher implements WorkConstraintsCallback, ExecutionListener {
    private static final String ACTION_CANCEL_WORK = "ACTION_CANCEL_WORK";
    private static final String ACTION_NOTIFY = "ACTION_NOTIFY";
    private static final String ACTION_START_FOREGROUND = "ACTION_START_FOREGROUND";
    private static final String ACTION_STOP_FOREGROUND = "ACTION_STOP_FOREGROUND";
    private static final String KEY_FOREGROUND_SERVICE_TYPE = "KEY_FOREGROUND_SERVICE_TYPE";
    private static final String KEY_GENERATION = "KEY_GENERATION";
    private static final String KEY_NOTIFICATION = "KEY_NOTIFICATION";
    private static final String KEY_NOTIFICATION_ID = "KEY_NOTIFICATION_ID";
    private static final String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    public static final String TAG = Logger.tagWithPrefix("SystemFgDispatcher");

    @Nullable
    private Callback mCallback;
    public final WorkConstraintsTracker mConstraintsTracker;
    private Context mContext;
    public WorkGenerationalId mCurrentForegroundId;
    public final Map<WorkGenerationalId, ForegroundInfo> mForegroundInfoById;
    public final Object mLock;
    private final TaskExecutor mTaskExecutor;
    public final Set<WorkSpec> mTrackedWorkSpecs;
    private WorkManagerImpl mWorkManagerImpl;
    public final Map<WorkGenerationalId, WorkSpec> mWorkSpecById;

    /* loaded from: classes23.dex */
    public interface Callback {
        void cancelNotification(int i5);

        void notify(int i5, @NonNull Notification notification);

        void startForeground(int i5, int i6, @NonNull Notification notification);

        void stop();
    }

    public SystemForegroundDispatcher(@NonNull Context context) {
        this.mContext = context;
        this.mLock = new Object();
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
        this.mWorkManagerImpl = workManagerImpl;
        this.mTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.mCurrentForegroundId = null;
        this.mForegroundInfoById = new LinkedHashMap();
        this.mTrackedWorkSpecs = new HashSet();
        this.mWorkSpecById = new HashMap();
        this.mConstraintsTracker = new WorkConstraintsTrackerImpl(this.mWorkManagerImpl.getTrackers(), this);
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
    }

    @VisibleForTesting
    public SystemForegroundDispatcher(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl, @NonNull WorkConstraintsTracker workConstraintsTracker) {
        this.mContext = context;
        this.mLock = new Object();
        this.mWorkManagerImpl = workManagerImpl;
        this.mTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.mCurrentForegroundId = null;
        this.mForegroundInfoById = new LinkedHashMap();
        this.mTrackedWorkSpecs = new HashSet();
        this.mWorkSpecById = new HashMap();
        this.mConstraintsTracker = workConstraintsTracker;
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
    }

    @NonNull
    public static Intent createCancelWorkIntent(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_CANCEL_WORK);
        intent.setData(Uri.parse("workspec://" + str));
        intent.putExtra(KEY_WORKSPEC_ID, str);
        return intent;
    }

    @NonNull
    public static Intent createNotifyIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, @NonNull ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_NOTIFY);
        intent.putExtra(KEY_NOTIFICATION_ID, foregroundInfo.getNotificationId());
        intent.putExtra(KEY_FOREGROUND_SERVICE_TYPE, foregroundInfo.getForegroundServiceType());
        intent.putExtra(KEY_NOTIFICATION, foregroundInfo.getNotification());
        intent.putExtra(KEY_WORKSPEC_ID, workGenerationalId.getWorkSpecId());
        intent.putExtra(KEY_GENERATION, workGenerationalId.getGeneration());
        return intent;
    }

    @NonNull
    public static Intent createStartForegroundIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, @NonNull ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_START_FOREGROUND);
        intent.putExtra(KEY_WORKSPEC_ID, workGenerationalId.getWorkSpecId());
        intent.putExtra(KEY_GENERATION, workGenerationalId.getGeneration());
        intent.putExtra(KEY_NOTIFICATION_ID, foregroundInfo.getNotificationId());
        intent.putExtra(KEY_FOREGROUND_SERVICE_TYPE, foregroundInfo.getForegroundServiceType());
        intent.putExtra(KEY_NOTIFICATION, foregroundInfo.getNotification());
        return intent;
    }

    @NonNull
    public static Intent createStopForegroundIntent(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_STOP_FOREGROUND);
        return intent;
    }

    @MainThread
    private void handleCancelWork(@NonNull Intent intent) {
        Logger.get().info(TAG, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.mWorkManagerImpl.cancelWorkById(UUID.fromString(stringExtra));
    }

    @MainThread
    private void handleNotify(@NonNull Intent intent) {
        int i5 = 0;
        int intExtra = intent.getIntExtra(KEY_NOTIFICATION_ID, 0);
        int intExtra2 = intent.getIntExtra(KEY_FOREGROUND_SERVICE_TYPE, 0);
        String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra(KEY_GENERATION, 0));
        Notification notification = (Notification) intent.getParcelableExtra(KEY_NOTIFICATION);
        Logger.get().debug(TAG, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.mCallback == null) {
            return;
        }
        this.mForegroundInfoById.put(workGenerationalId, new ForegroundInfo(intExtra, notification, intExtra2));
        if (this.mCurrentForegroundId == null) {
            this.mCurrentForegroundId = workGenerationalId;
            this.mCallback.startForeground(intExtra, intExtra2, notification);
            return;
        }
        this.mCallback.notify(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<WorkGenerationalId, ForegroundInfo>> it = this.mForegroundInfoById.entrySet().iterator();
        while (it.hasNext()) {
            i5 |= it.next().getValue().getForegroundServiceType();
        }
        ForegroundInfo foregroundInfo = this.mForegroundInfoById.get(this.mCurrentForegroundId);
        if (foregroundInfo != null) {
            this.mCallback.startForeground(foregroundInfo.getNotificationId(), i5, foregroundInfo.getNotification());
        }
    }

    @MainThread
    private void handleStartForeground(@NonNull Intent intent) {
        Logger.get().info(TAG, "Started foreground service " + intent);
        final String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        this.mTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundDispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                WorkSpec runningWorkSpec = SystemForegroundDispatcher.this.mWorkManagerImpl.getProcessor().getRunningWorkSpec(stringExtra);
                if (runningWorkSpec == null || !runningWorkSpec.hasConstraints()) {
                    return;
                }
                synchronized (SystemForegroundDispatcher.this.mLock) {
                    SystemForegroundDispatcher.this.mWorkSpecById.put(WorkSpecKt.generationalId(runningWorkSpec), runningWorkSpec);
                    SystemForegroundDispatcher.this.mTrackedWorkSpecs.add(runningWorkSpec);
                    SystemForegroundDispatcher systemForegroundDispatcher = SystemForegroundDispatcher.this;
                    systemForegroundDispatcher.mConstraintsTracker.replace(systemForegroundDispatcher.mTrackedWorkSpecs);
                }
            }
        });
    }

    @MainThread
    public void handleStop(@NonNull Intent intent) {
        Logger.get().info(TAG, "Stopping foreground service");
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.stop();
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(@NonNull List<WorkSpec> list) {
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(@NonNull List<WorkSpec> list) {
        if (list.isEmpty()) {
            return;
        }
        for (WorkSpec workSpec : list) {
            String str = workSpec.id;
            Logger.get().debug(TAG, "Constraints unmet for WorkSpec " + str);
            this.mWorkManagerImpl.stopForegroundWork(WorkSpecKt.generationalId(workSpec));
        }
    }

    @MainThread
    public void onDestroy() {
        this.mCallback = null;
        synchronized (this.mLock) {
            this.mConstraintsTracker.reset();
        }
        this.mWorkManagerImpl.getProcessor().removeExecutionListener(this);
    }

    @Override // androidx.work.impl.ExecutionListener
    @MainThread
    /* renamed from: onExecuted */
    public void lambda$runOnExecuted$1(@NonNull WorkGenerationalId workGenerationalId, boolean z4) {
        Map.Entry<WorkGenerationalId, ForegroundInfo> next;
        synchronized (this.mLock) {
            WorkSpec remove = this.mWorkSpecById.remove(workGenerationalId);
            if (remove != null ? this.mTrackedWorkSpecs.remove(remove) : false) {
                this.mConstraintsTracker.replace(this.mTrackedWorkSpecs);
            }
        }
        ForegroundInfo remove2 = this.mForegroundInfoById.remove(workGenerationalId);
        if (workGenerationalId.equals(this.mCurrentForegroundId) && this.mForegroundInfoById.size() > 0) {
            Iterator<Map.Entry<WorkGenerationalId, ForegroundInfo>> it = this.mForegroundInfoById.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.mCurrentForegroundId = next.getKey();
            if (this.mCallback != null) {
                ForegroundInfo value = next.getValue();
                this.mCallback.startForeground(value.getNotificationId(), value.getForegroundServiceType(), value.getNotification());
                this.mCallback.cancelNotification(value.getNotificationId());
            }
        }
        Callback callback = this.mCallback;
        if (remove2 == null || callback == null) {
            return;
        }
        Logger logger = Logger.get();
        String str = TAG;
        StringBuilder g5 = d.g("Removing Notification (id: ");
        g5.append(remove2.getNotificationId());
        g5.append(", workSpecId: ");
        g5.append(workGenerationalId);
        g5.append(", notificationType: ");
        g5.append(remove2.getForegroundServiceType());
        logger.debug(str, g5.toString());
        callback.cancelNotification(remove2.getNotificationId());
    }

    public void onStartCommand(@NonNull Intent intent) {
        String action = intent.getAction();
        if (ACTION_START_FOREGROUND.equals(action)) {
            handleStartForeground(intent);
        } else if (!ACTION_NOTIFY.equals(action)) {
            if (ACTION_CANCEL_WORK.equals(action)) {
                handleCancelWork(intent);
                return;
            } else {
                if (ACTION_STOP_FOREGROUND.equals(action)) {
                    handleStop(intent);
                    return;
                }
                return;
            }
        }
        handleNotify(intent);
    }

    @MainThread
    public void setCallback(@NonNull Callback callback) {
        if (this.mCallback != null) {
            Logger.get().error(TAG, "A callback already exists.");
        } else {
            this.mCallback = callback;
        }
    }
}
