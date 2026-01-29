package kotlin.text;

import androidx.activity.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes19.dex */
public final class MatchGroup {
    private final IntRange range;
    private final String value;

    public MatchGroup(String value, IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.value = value;
        this.range = range;
    }

    public static /* synthetic */ MatchGroup copy$default(MatchGroup matchGroup, String str, IntRange intRange, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = matchGroup.value;
        }
        if ((i5 & 2) != 0) {
            intRange = matchGroup.range;
        }
        return matchGroup.copy(str, intRange);
    }

    public final String component1() {
        return this.value;
    }

    public final IntRange component2() {
        return this.range;
    }

    public final MatchGroup copy(String value, IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        return new MatchGroup(value, range);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.areEqual(this.value, matchGroup.value) && Intrinsics.areEqual(this.range, matchGroup.range);
    }

    public final IntRange getRange() {
        return this.range;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.range.hashCode() + (this.value.hashCode() * 31);
    }

    public String toString() {
        StringBuilder g5 = d.g("MatchGroup(value=");
        g5.append(this.value);
        g5.append(", range=");
        g5.append(this.range);
        g5.append(')');
        return g5.toString();
    }
}
