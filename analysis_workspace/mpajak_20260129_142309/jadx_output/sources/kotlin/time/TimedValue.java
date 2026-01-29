package kotlin.time;

import androidx.activity.d;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes9.dex */
public final class TimedValue<T> {
    private final long duration;
    private final T value;

    private TimedValue(T t4, long j5) {
        this.value = t4;
        this.duration = j5;
    }

    public /* synthetic */ TimedValue(Object obj, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ TimedValue m1489copyRFiDyg4$default(TimedValue timedValue, Object obj, long j5, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = timedValue.value;
        }
        if ((i5 & 2) != 0) {
            j5 = timedValue.duration;
        }
        return timedValue.m1491copyRFiDyg4(obj, j5);
    }

    public final T component1() {
        return this.value;
    }

    /* renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m1490component2UwyO8pc() {
        return this.duration;
    }

    /* renamed from: copy-RFiDyg4, reason: not valid java name */
    public final TimedValue<T> m1491copyRFiDyg4(T t4, long j5) {
        return new TimedValue<>(t4, j5, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) obj;
        return Intrinsics.areEqual(this.value, timedValue.value) && Duration.m1342equalsimpl0(this.duration, timedValue.duration);
    }

    /* renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m1492getDurationUwyO8pc() {
        return this.duration;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t4 = this.value;
        return Duration.m1365hashCodeimpl(this.duration) + ((t4 == null ? 0 : t4.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder g5 = d.g("TimedValue(value=");
        g5.append(this.value);
        g5.append(", duration=");
        g5.append((Object) Duration.m1386toStringimpl(this.duration));
        g5.append(')');
        return g5.toString();
    }
}
