package kotlin.time.jdk8;

import java.time.Duration;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.ExperimentalTime;

@JvmName(name = "DurationConversionsJDK8Kt")
/* loaded from: classes13.dex */
public final class DurationConversionsJDK8Kt {
    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @InlineOnly
    /* renamed from: toJavaDuration-LRDsOJo, reason: not valid java name */
    private static final Duration m1493toJavaDurationLRDsOJo(long j5) {
        Duration ofSeconds = Duration.ofSeconds(kotlin.time.Duration.m1358getInWholeSecondsimpl(j5), kotlin.time.Duration.m1360getNanosecondsComponentimpl(j5));
        Intrinsics.checkNotNullExpressionValue(ofSeconds, "toJavaDuration-LRDsOJo");
        return ofSeconds;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @InlineOnly
    private static final long toKotlinDuration(Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return kotlin.time.Duration.m1373plusLRDsOJo(DurationKt.toDuration(duration.getSeconds(), DurationUnit.SECONDS), DurationKt.toDuration(duration.getNano(), DurationUnit.NANOSECONDS));
    }
}
