package androidx.work.impl.model;

import androidx.activity.d;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes19.dex */
public final class WorkSpec {
    public static final Companion Companion = new Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG;

    @JvmField
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER;

    @JvmField
    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    @JvmField
    @ColumnInfo(name = "backoff_policy")
    public BackoffPolicy backoffPolicy;

    @Embedded
    @JvmField
    public Constraints constraints;

    @JvmField
    @ColumnInfo(name = "run_in_foreground")
    public boolean expedited;

    @JvmField
    @ColumnInfo(name = "flex_duration")
    public long flexDuration;

    @ColumnInfo(defaultValue = "0")
    private final int generation;

    @PrimaryKey
    @JvmField
    @ColumnInfo(name = "id")
    public final String id;

    @JvmField
    @ColumnInfo(name = "initial_delay")
    public long initialDelay;

    @JvmField
    @ColumnInfo(name = "input")
    public Data input;

    @JvmField
    @ColumnInfo(name = "input_merger_class_name")
    public String inputMergerClassName;

    @JvmField
    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;

    @JvmField
    @ColumnInfo(name = "last_enqueue_time")
    public long lastEnqueueTime;

    @JvmField
    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    @JvmField
    @ColumnInfo(name = "out_of_quota_policy")
    public OutOfQuotaPolicy outOfQuotaPolicy;

    @JvmField
    @ColumnInfo(name = "output")
    public Data output;

    @ColumnInfo(defaultValue = "0", name = "period_count")
    private int periodCount;

    @JvmField
    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;

    @JvmField
    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    @JvmField
    @ColumnInfo(name = "state")
    public WorkInfo.State state;

    @JvmField
    @ColumnInfo(name = "worker_class_name")
    public String workerClassName;

    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes24.dex */
    public static final class IdAndState {

        @JvmField
        @ColumnInfo(name = "id")
        public String id;

        @JvmField
        @ColumnInfo(name = "state")
        public WorkInfo.State state;

        public IdAndState(String id, WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.id = id;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = idAndState.id;
            }
            if ((i5 & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final IdAndState copy(String id, WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            return new IdAndState(id, state);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return Intrinsics.areEqual(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return this.state.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            StringBuilder g5 = d.g("IdAndState(id=");
            g5.append(this.id);
            g5.append(", state=");
            g5.append(this.state);
            g5.append(')');
            return g5.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static final class WorkInfoPojo {

        @ColumnInfo(name = "generation")
        private final int generation;

        @ColumnInfo(name = "id")
        private String id;

        @ColumnInfo(name = "output")
        private Data output;

        @Relation(entity = WorkProgress.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        private List<Data> progress;

        @ColumnInfo(name = "run_attempt_count")
        private int runAttemptCount;

        @ColumnInfo(name = "state")
        private WorkInfo.State state;

        @Relation(entity = WorkTag.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        private List<String> tags;

        public WorkInfoPojo(String id, WorkInfo.State state, Data output, int i5, int i6, List<String> tags, List<Data> progress) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.id = id;
            this.state = state;
            this.output = output;
            this.runAttemptCount = i5;
            this.generation = i6;
            this.tags = tags;
            this.progress = progress;
        }

        public static /* synthetic */ WorkInfoPojo copy$default(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state, Data data, int i5, int i6, List list, List list2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = workInfoPojo.id;
            }
            if ((i7 & 2) != 0) {
                state = workInfoPojo.state;
            }
            WorkInfo.State state2 = state;
            if ((i7 & 4) != 0) {
                data = workInfoPojo.output;
            }
            Data data2 = data;
            if ((i7 & 8) != 0) {
                i5 = workInfoPojo.runAttemptCount;
            }
            int i8 = i5;
            if ((i7 & 16) != 0) {
                i6 = workInfoPojo.generation;
            }
            int i9 = i6;
            if ((i7 & 32) != 0) {
                list = workInfoPojo.tags;
            }
            List list3 = list;
            if ((i7 & 64) != 0) {
                list2 = workInfoPojo.progress;
            }
            return workInfoPojo.copy(str, state2, data2, i8, i9, list3, list2);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final Data component3() {
            return this.output;
        }

        public final int component4() {
            return this.runAttemptCount;
        }

        public final int component5() {
            return this.generation;
        }

        public final List<String> component6() {
            return this.tags;
        }

        public final List<Data> component7() {
            return this.progress;
        }

        public final WorkInfoPojo copy(String id, WorkInfo.State state, Data output, int i5, int i6, List<String> tags, List<Data> progress) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(progress, "progress");
            return new WorkInfoPojo(id, state, output, i5, i6, tags, progress);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return Intrinsics.areEqual(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && Intrinsics.areEqual(this.output, workInfoPojo.output) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.generation == workInfoPojo.generation && Intrinsics.areEqual(this.tags, workInfoPojo.tags) && Intrinsics.areEqual(this.progress, workInfoPojo.progress);
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final String getId() {
            return this.id;
        }

        public final Data getOutput() {
            return this.output;
        }

        public final List<Data> getProgress() {
            return this.progress;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        public final WorkInfo.State getState() {
            return this.state;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public int hashCode() {
            return this.progress.hashCode() + ((this.tags.hashCode() + ((((((this.output.hashCode() + ((this.state.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31) + this.runAttemptCount) * 31) + this.generation) * 31)) * 31);
        }

        public final void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        public final void setOutput(Data data) {
            Intrinsics.checkNotNullParameter(data, "<set-?>");
            this.output = data;
        }

        public final void setProgress(List<Data> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.progress = list;
        }

        public final void setRunAttemptCount(int i5) {
            this.runAttemptCount = i5;
        }

        public final void setState(WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.state = state;
        }

        public final void setTags(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.tags = list;
        }

        public String toString() {
            StringBuilder g5 = d.g("WorkInfoPojo(id=");
            g5.append(this.id);
            g5.append(", state=");
            g5.append(this.state);
            g5.append(", output=");
            g5.append(this.output);
            g5.append(", runAttemptCount=");
            g5.append(this.runAttemptCount);
            g5.append(", generation=");
            g5.append(this.generation);
            g5.append(", tags=");
            g5.append(this.tags);
            g5.append(", progress=");
            g5.append(this.progress);
            g5.append(')');
            return g5.toString();
        }

        public final WorkInfo toWorkInfo() {
            return new WorkInfo(UUID.fromString(this.id), this.state, this.output, this.tags, this.progress.isEmpty() ^ true ? this.progress.get(0) : Data.EMPTY, this.runAttemptCount, this.generation);
        }
    }

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = tagWithPrefix;
        WORK_INFO_MAPPER = a.f303b;
    }

    public WorkSpec(String id, WorkInfo.State state, String workerClassName, String str, Data input, Data output, long j5, long j6, long j7, Constraints constraints, @IntRange(from = 0) int i5, BackoffPolicy backoffPolicy, long j8, long j9, long j10, long j11, boolean z4, OutOfQuotaPolicy outOfQuotaPolicy, int i6, int i7) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = str;
        this.input = input;
        this.output = output;
        this.initialDelay = j5;
        this.intervalDuration = j6;
        this.flexDuration = j7;
        this.constraints = constraints;
        this.runAttemptCount = i5;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j8;
        this.lastEnqueueTime = j9;
        this.minimumRetentionDuration = j10;
        this.scheduleRequestedAt = j11;
        this.expedited = z4;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i6;
        this.generation = i7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WorkSpec(java.lang.String r31, androidx.work.WorkInfo.State r32, java.lang.String r33, java.lang.String r34, androidx.work.Data r35, androidx.work.Data r36, long r37, long r39, long r41, androidx.work.Constraints r43, int r44, androidx.work.BackoffPolicy r45, long r46, long r48, long r50, long r52, boolean r54, androidx.work.OutOfQuotaPolicy r55, int r56, int r57, int r58, kotlin.jvm.internal.DefaultConstructorMarker r59) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpec.<init>(java.lang.String, androidx.work.WorkInfo$State, java.lang.String, java.lang.String, androidx.work.Data, androidx.work.Data, long, long, long, androidx.work.Constraints, int, androidx.work.BackoffPolicy, long, long, long, long, boolean, androidx.work.OutOfQuotaPolicy, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String newId, WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new Data(other.input), new Data(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new Constraints(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, 524288, null);
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String id, String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        int collectionSizeOrDefault;
        if (list == null) {
            return null;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    public final long calculateNextRunTime() {
        long j5;
        long j6;
        if (isBackedOff()) {
            long scalb = this.backoffPolicy == BackoffPolicy.LINEAR ? this.backoffDelayDuration * this.runAttemptCount : (long) Math.scalb(this.backoffDelayDuration, this.runAttemptCount - 1);
            j6 = this.lastEnqueueTime;
            j5 = RangesKt.coerceAtMost(scalb, WorkRequest.MAX_BACKOFF_MILLIS);
        } else {
            if (isPeriodic()) {
                int i5 = this.periodCount;
                long j7 = this.lastEnqueueTime;
                if (i5 == 0) {
                    j7 += this.initialDelay;
                }
                long j8 = this.flexDuration;
                long j9 = this.intervalDuration;
                if (j8 != j9) {
                    r3 = i5 == 0 ? (-1) * j8 : 0L;
                    j7 += j9;
                } else if (i5 != 0) {
                    r3 = j9;
                }
                return j7 + r3;
            }
            j5 = this.lastEnqueueTime;
            if (j5 == 0) {
                j5 = System.currentTimeMillis();
            }
            j6 = this.initialDelay;
        }
        return j5 + j6;
    }

    public final String component1() {
        return this.id;
    }

    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.periodCount;
    }

    public final WorkInfo.State component2() {
        return this.state;
    }

    public final int component20() {
        return this.generation;
    }

    public final String component3() {
        return this.workerClassName;
    }

    public final String component4() {
        return this.inputMergerClassName;
    }

    public final Data component5() {
        return this.input;
    }

    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    public final WorkSpec copy(String id, WorkInfo.State state, String workerClassName, String str, Data input, Data output, long j5, long j6, long j7, Constraints constraints, @IntRange(from = 0) int i5, BackoffPolicy backoffPolicy, long j8, long j9, long j10, long j11, boolean z4, OutOfQuotaPolicy outOfQuotaPolicy, int i6, int i7) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id, state, workerClassName, str, input, output, j5, j6, j7, constraints, i5, backoffPolicy, j8, j9, j10, j11, z4, outOfQuotaPolicy, i6, i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return Intrinsics.areEqual(this.id, workSpec.id) && this.state == workSpec.state && Intrinsics.areEqual(this.workerClassName, workSpec.workerClassName) && Intrinsics.areEqual(this.inputMergerClassName, workSpec.inputMergerClassName) && Intrinsics.areEqual(this.input, workSpec.input) && Intrinsics.areEqual(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && Intrinsics.areEqual(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final boolean hasConstraints() {
        return !Intrinsics.areEqual(Constraints.NONE, this.constraints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.workerClassName.hashCode() + ((this.state.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
        String str = this.inputMergerClassName;
        int hashCode2 = (this.output.hashCode() + ((this.input.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        long j5 = this.initialDelay;
        int i5 = (hashCode2 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.intervalDuration;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.flexDuration;
        int hashCode3 = (this.backoffPolicy.hashCode() + ((((this.constraints.hashCode() + ((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31) + this.runAttemptCount) * 31)) * 31;
        long j8 = this.backoffDelayDuration;
        int i7 = (hashCode3 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.lastEnqueueTime;
        int i8 = (i7 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.minimumRetentionDuration;
        int i9 = (i8 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.scheduleRequestedAt;
        int i10 = (i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        boolean z4 = this.expedited;
        int i11 = z4;
        if (z4 != 0) {
            i11 = 1;
        }
        return ((((this.outOfQuotaPolicy.hashCode() + ((i10 + i11) * 31)) * 31) + this.periodCount) * 31) + this.generation;
    }

    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final void setBackoffDelayDuration(long j5) {
        if (j5 > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (j5 < WorkRequest.MIN_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = RangesKt.coerceIn(j5, WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final void setPeriodCount(int i5) {
        this.periodCount = i5;
    }

    public final void setPeriodic(long j5) {
        if (j5 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(RangesKt.coerceAtLeast(j5, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), RangesKt.coerceAtLeast(j5, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    public final void setPeriodic(long j5, long j6) {
        if (j5 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = RangesKt.coerceAtLeast(j5, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (j6 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j6 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + j5);
        }
        this.flexDuration = RangesKt.coerceIn(j6, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, this.intervalDuration);
    }

    public String toString() {
        StringBuilder g5 = d.g("{WorkSpec: ");
        g5.append(this.id);
        g5.append('}');
        return g5.toString();
    }
}
