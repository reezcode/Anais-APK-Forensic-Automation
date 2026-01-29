package androidx.work.impl.model;

import androidx.activity.d;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.Intrinsics;

@Entity
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes23.dex */
public final class Preference {

    @PrimaryKey
    @ColumnInfo(name = "key")
    private final String key;

    @ColumnInfo(name = "long_value")
    private final Long value;

    public Preference(String key, Long l5) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.value = l5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(String key, boolean z4) {
        this(key, Long.valueOf(z4 ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }

    public static /* synthetic */ Preference copy$default(Preference preference, String str, Long l5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = preference.key;
        }
        if ((i5 & 2) != 0) {
            l5 = preference.value;
        }
        return preference.copy(str, l5);
    }

    public final String component1() {
        return this.key;
    }

    public final Long component2() {
        return this.value;
    }

    public final Preference copy(String key, Long l5) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new Preference(key, l5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        return Intrinsics.areEqual(this.key, preference.key) && Intrinsics.areEqual(this.value, preference.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        Long l5 = this.value;
        return hashCode + (l5 == null ? 0 : l5.hashCode());
    }

    public String toString() {
        StringBuilder g5 = d.g("Preference(key=");
        g5.append(this.key);
        g5.append(", value=");
        g5.append(this.value);
        g5.append(')');
        return g5.toString();
    }
}
