package androidx.work.impl.utils;

import android.os.Build;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.impl.workers.ConstraintTrackingWorkerKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes23.dex */
public final class EnqueueUtilsKt {
    public static final WorkSpec tryDelegateConstrainedWorkSpec(WorkSpec workSpec) {
        WorkSpec copy;
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Constraints constraints = workSpec.constraints;
        String str = workSpec.workerClassName;
        if (Intrinsics.areEqual(str, ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!constraints.requiresBatteryNotLow() && !constraints.requiresStorageNotLow()) {
            return workSpec;
        }
        Data build = new Data.Builder().putAll(workSpec.input).putString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME, str).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        copy = workSpec.copy((r45 & 1) != 0 ? workSpec.id : null, (r45 & 2) != 0 ? workSpec.state : null, (r45 & 4) != 0 ? workSpec.workerClassName : name, (r45 & 8) != 0 ? workSpec.inputMergerClassName : null, (r45 & 16) != 0 ? workSpec.input : build, (r45 & 32) != 0 ? workSpec.output : null, (r45 & 64) != 0 ? workSpec.initialDelay : 0L, (r45 & 128) != 0 ? workSpec.intervalDuration : 0L, (r45 & 256) != 0 ? workSpec.flexDuration : 0L, (r45 & 512) != 0 ? workSpec.constraints : null, (r45 & 1024) != 0 ? workSpec.runAttemptCount : 0, (r45 & 2048) != 0 ? workSpec.backoffPolicy : null, (r45 & 4096) != 0 ? workSpec.backoffDelayDuration : 0L, (r45 & 8192) != 0 ? workSpec.lastEnqueueTime : 0L, (r45 & 16384) != 0 ? workSpec.minimumRetentionDuration : 0L, (r45 & 32768) != 0 ? workSpec.scheduleRequestedAt : 0L, (r45 & 65536) != 0 ? workSpec.expedited : false, (131072 & r45) != 0 ? workSpec.outOfQuotaPolicy : null, (r45 & 262144) != 0 ? workSpec.periodCount : 0, (r45 & 524288) != 0 ? workSpec.generation : 0);
        return copy;
    }

    private static final boolean usesScheduler(List<? extends Scheduler> list, String str) {
        try {
            Class<?> cls = Class.forName(str);
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(((Scheduler) it.next()).getClass())) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final WorkSpec wrapInConstraintTrackingWorkerIfNeeded(List<? extends Scheduler> schedulers, WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        int i5 = Build.VERSION.SDK_INT;
        boolean z4 = false;
        if (23 <= i5 && i5 < 26) {
            z4 = true;
        }
        return (!z4 && (i5 > 22 || !usesScheduler(schedulers, Schedulers.GCM_SCHEDULER))) ? workSpec : tryDelegateConstrainedWorkSpec(workSpec);
    }
}
