package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.DurationApi26Impl;
import java.time.Duration;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public abstract class WorkRequest {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MAX_BACKOFF_MILLIS = 18000000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final UUID id;
    private final Set<String> tags;
    private final WorkSpec workSpec;

    /* loaded from: classes23.dex */
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;
        private UUID id;
        private final Set<String> tags;
        private WorkSpec workSpec;
        private final Class<? extends ListenableWorker> workerClass;

        public Builder(Class<? extends ListenableWorker> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.workerClass = workerClass;
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            this.id = randomUUID;
            String uuid = this.id.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.workSpec = new WorkSpec(uuid, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            this.tags = SetsKt.mutableSetOf(name2);
        }

        public final B addTag(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.tags.add(tag);
            return getThisObject$work_runtime_release();
        }

        public final W build() {
            W buildInternal$work_runtime_release = buildInternal$work_runtime_release();
            Constraints constraints = this.workSpec.constraints;
            int i5 = Build.VERSION.SDK_INT;
            boolean z4 = (i5 >= 24 && constraints.hasContentUriTriggers()) || constraints.requiresBatteryNotLow() || constraints.requiresCharging() || (i5 >= 23 && constraints.requiresDeviceIdle());
            WorkSpec workSpec = this.workSpec;
            if (workSpec.expedited) {
                if (!(!z4)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (!(workSpec.initialDelay <= 0)) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            setId(randomUUID);
            return buildInternal$work_runtime_release;
        }

        public abstract W buildInternal$work_runtime_release();

        public final boolean getBackoffCriteriaSet$work_runtime_release() {
            return this.backoffCriteriaSet;
        }

        public final UUID getId$work_runtime_release() {
            return this.id;
        }

        public final Set<String> getTags$work_runtime_release() {
            return this.tags;
        }

        public abstract B getThisObject$work_runtime_release();

        public final WorkSpec getWorkSpec$work_runtime_release() {
            return this.workSpec;
        }

        public final Class<? extends ListenableWorker> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        public final B keepResultsForAtLeast(long j5, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.minimumRetentionDuration = timeUnit.toMillis(j5);
            return getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        public final B keepResultsForAtLeast(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.workSpec.minimumRetentionDuration = DurationApi26Impl.toMillisCompat(duration);
            return getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, long j5, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(timeUnit.toMillis(j5));
            return getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, Duration duration) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(DurationApi26Impl.toMillisCompat(duration));
            return getThisObject$work_runtime_release();
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z4) {
            this.backoffCriteriaSet = z4;
        }

        public final B setConstraints(Constraints constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.workSpec.constraints = constraints;
            return getThisObject$work_runtime_release();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B setExpedited(OutOfQuotaPolicy policy) {
            Intrinsics.checkNotNullParameter(policy, "policy");
            WorkSpec workSpec = this.workSpec;
            workSpec.expedited = true;
            workSpec.outOfQuotaPolicy = policy;
            return getThisObject$work_runtime_release();
        }

        public final B setId(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            String uuid = id.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            this.workSpec = new WorkSpec(uuid, this.workSpec);
            return getThisObject$work_runtime_release();
        }

        public final void setId$work_runtime_release(UUID uuid) {
            Intrinsics.checkNotNullParameter(uuid, "<set-?>");
            this.id = uuid;
        }

        public B setInitialDelay(long j5, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(j5);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        @RequiresApi(26)
        public B setInitialDelay(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.workSpec.initialDelay = DurationApi26Impl.toMillisCompat(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setInitialRunAttemptCount(int i5) {
            this.workSpec.runAttemptCount = i5;
            return getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setInitialState(WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.workSpec.state = state;
            return getThisObject$work_runtime_release();
        }

        public final B setInputData(Data inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.workSpec.input = inputData;
            return getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setLastEnqueueTime(long j5, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.lastEnqueueTime = timeUnit.toMillis(j5);
            return getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setScheduleRequestedAt(long j5, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.scheduleRequestedAt = timeUnit.toMillis(j5);
            return getThisObject$work_runtime_release();
        }

        public final void setWorkSpec$work_runtime_release(WorkSpec workSpec) {
            Intrinsics.checkNotNullParameter(workSpec, "<set-?>");
            this.workSpec = workSpec;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WorkRequest(UUID id, WorkSpec workSpec, Set<String> tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.id = id;
        this.workSpec = workSpec;
        this.tags = tags;
    }

    public UUID getId() {
        return this.id;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String getStringId() {
        String uuid = getId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        return uuid;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<String> getTags() {
        return this.tags;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }
}
