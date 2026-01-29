package androidx.work.impl.model;

import androidx.activity.d;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, primaryKeys = {"work_spec_id", "generation"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes11.dex */
public final class SystemIdInfo {

    @ColumnInfo(defaultValue = "0")
    private final int generation;

    @JvmField
    @ColumnInfo(name = "system_id")
    public final int systemId;

    @JvmField
    @ColumnInfo(name = "work_spec_id")
    public final String workSpecId;

    public SystemIdInfo(String workSpecId, int i5, int i6) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i5;
        this.systemId = i6;
    }

    public static /* synthetic */ SystemIdInfo copy$default(SystemIdInfo systemIdInfo, String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = systemIdInfo.workSpecId;
        }
        if ((i7 & 2) != 0) {
            i5 = systemIdInfo.generation;
        }
        if ((i7 & 4) != 0) {
            i6 = systemIdInfo.systemId;
        }
        return systemIdInfo.copy(str, i5, i6);
    }

    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    public final int component3() {
        return this.systemId;
    }

    public final SystemIdInfo copy(String workSpecId, int i5, int i6) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        return new SystemIdInfo(workSpecId, i5, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        return Intrinsics.areEqual(this.workSpecId, systemIdInfo.workSpecId) && this.generation == systemIdInfo.generation && this.systemId == systemIdInfo.systemId;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public int hashCode() {
        return (((this.workSpecId.hashCode() * 31) + this.generation) * 31) + this.systemId;
    }

    public String toString() {
        StringBuilder g5 = d.g("SystemIdInfo(workSpecId=");
        g5.append(this.workSpecId);
        g5.append(", generation=");
        g5.append(this.generation);
        g5.append(", systemId=");
        g5.append(this.systemId);
        g5.append(')');
        return g5.toString();
    }
}
