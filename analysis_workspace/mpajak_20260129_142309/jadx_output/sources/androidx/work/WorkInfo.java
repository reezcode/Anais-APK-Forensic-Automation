package androidx.work;

import androidx.activity.d;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.ULong;

/* loaded from: classes11.dex */
public final class WorkInfo {
    private final int mGeneration;

    @NonNull
    private UUID mId;

    @NonNull
    private Data mOutputData;

    @NonNull
    private Data mProgress;
    private int mRunAttemptCount;

    @NonNull
    private State mState;

    @NonNull
    private Set<String> mTags;

    /* loaded from: classes6.dex */
    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkInfo(@NonNull UUID uuid, @NonNull State state, @NonNull Data data, @NonNull List<String> list, @NonNull Data data2, int i5, int i6) {
        this.mId = uuid;
        this.mState = state;
        this.mOutputData = data;
        this.mTags = new HashSet(list);
        this.mProgress = data2;
        this.mRunAttemptCount = i5;
        this.mGeneration = i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.mRunAttemptCount == workInfo.mRunAttemptCount && this.mGeneration == workInfo.mGeneration && this.mId.equals(workInfo.mId) && this.mState == workInfo.mState && this.mOutputData.equals(workInfo.mOutputData) && this.mTags.equals(workInfo.mTags)) {
            return this.mProgress.equals(workInfo.mProgress);
        }
        return false;
    }

    public int getGeneration() {
        return this.mGeneration;
    }

    @NonNull
    public UUID getId() {
        return this.mId;
    }

    @NonNull
    public Data getOutputData() {
        return this.mOutputData;
    }

    @NonNull
    public Data getProgress() {
        return this.mProgress;
    }

    @IntRange(from = ULong.MIN_VALUE)
    public int getRunAttemptCount() {
        return this.mRunAttemptCount;
    }

    @NonNull
    public State getState() {
        return this.mState;
    }

    @NonNull
    public Set<String> getTags() {
        return this.mTags;
    }

    public int hashCode() {
        return ((((this.mProgress.hashCode() + ((this.mTags.hashCode() + ((this.mOutputData.hashCode() + ((this.mState.hashCode() + (this.mId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.mRunAttemptCount) * 31) + this.mGeneration;
    }

    public String toString() {
        StringBuilder g5 = d.g("WorkInfo{mId='");
        g5.append(this.mId);
        g5.append('\'');
        g5.append(", mState=");
        g5.append(this.mState);
        g5.append(", mOutputData=");
        g5.append(this.mOutputData);
        g5.append(", mTags=");
        g5.append(this.mTags);
        g5.append(", mProgress=");
        g5.append(this.mProgress);
        g5.append('}');
        return g5.toString();
    }
}
