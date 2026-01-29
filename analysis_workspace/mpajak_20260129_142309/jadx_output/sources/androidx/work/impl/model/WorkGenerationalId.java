package androidx.work.impl.model;

import androidx.activity.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class WorkGenerationalId {
    private final int generation;
    private final String workSpecId;

    public WorkGenerationalId(String workSpecId, int i5) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i5;
    }

    public static /* synthetic */ WorkGenerationalId copy$default(WorkGenerationalId workGenerationalId, String str, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = workGenerationalId.workSpecId;
        }
        if ((i6 & 2) != 0) {
            i5 = workGenerationalId.generation;
        }
        return workGenerationalId.copy(str, i5);
    }

    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    public final WorkGenerationalId copy(String workSpecId, int i5) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        return new WorkGenerationalId(workSpecId, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj;
        return Intrinsics.areEqual(this.workSpecId, workGenerationalId.workSpecId) && this.generation == workGenerationalId.generation;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + this.generation;
    }

    public String toString() {
        StringBuilder g5 = d.g("WorkGenerationalId(workSpecId=");
        g5.append(this.workSpecId);
        g5.append(", generation=");
        g5.append(this.generation);
        g5.append(')');
        return g5.toString();
    }
}
