package androidx.work.impl.utils;

import android.content.Context;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes13.dex */
public class WorkProgressUpdater implements ProgressUpdater {
    public static final String TAG = Logger.tagWithPrefix("WorkProgressUpdater");
    public final TaskExecutor mTaskExecutor;
    public final WorkDatabase mWorkDatabase;

    public WorkProgressUpdater(@NonNull WorkDatabase workDatabase, @NonNull TaskExecutor taskExecutor) {
        this.mWorkDatabase = workDatabase;
        this.mTaskExecutor = taskExecutor;
    }

    @Override // androidx.work.ProgressUpdater
    @NonNull
    public h2.a<Void> updateProgress(@NonNull Context context, @NonNull final UUID uuid, @NonNull final Data data) {
        final SettableFuture create = SettableFuture.create();
        this.mTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.utils.WorkProgressUpdater.1
            @Override // java.lang.Runnable
            public void run() {
                WorkSpec workSpec;
                String uuid2 = uuid.toString();
                Logger logger = Logger.get();
                String str = WorkProgressUpdater.TAG;
                StringBuilder g5 = d.g("Updating progress for ");
                g5.append(uuid);
                g5.append(" (");
                g5.append(data);
                g5.append(")");
                logger.debug(str, g5.toString());
                WorkProgressUpdater.this.mWorkDatabase.beginTransaction();
                try {
                    workSpec = WorkProgressUpdater.this.mWorkDatabase.workSpecDao().getWorkSpec(uuid2);
                } finally {
                    try {
                    } finally {
                    }
                }
                if (workSpec == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (workSpec.state == WorkInfo.State.RUNNING) {
                    WorkProgressUpdater.this.mWorkDatabase.workProgressDao().insert(new WorkProgress(uuid2, data));
                } else {
                    Logger.get().warning(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                create.set(null);
                WorkProgressUpdater.this.mWorkDatabase.setTransactionSuccessful();
            }
        });
        return create;
    }
}
