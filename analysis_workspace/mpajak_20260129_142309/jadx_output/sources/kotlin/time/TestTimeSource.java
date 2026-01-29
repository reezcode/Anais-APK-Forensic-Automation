package kotlin.time;

import androidx.activity.d;
import kotlin.SinceKotlin;
import org.apache.commons.io.FilenameUtils;

@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes6.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
    }

    /* renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m1470overflowLRDsOJo(long j5) {
        StringBuilder g5 = d.g("TestTimeSource will overflow if its reading ");
        g5.append(this.reading);
        g5.append("ns is advanced by ");
        g5.append((Object) Duration.m1386toStringimpl(j5));
        g5.append(FilenameUtils.EXTENSION_SEPARATOR);
        throw new IllegalStateException(g5.toString());
    }

    /* renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m1471plusAssignLRDsOJo(long j5) {
        long j6;
        long m1383toLongimpl = Duration.m1383toLongimpl(j5, getUnit());
        if (m1383toLongimpl == Long.MIN_VALUE || m1383toLongimpl == Long.MAX_VALUE) {
            double m1380toDoubleimpl = this.reading + Duration.m1380toDoubleimpl(j5, getUnit());
            if (m1380toDoubleimpl > 9.223372036854776E18d || m1380toDoubleimpl < -9.223372036854776E18d) {
                m1470overflowLRDsOJo(j5);
            }
            j6 = (long) m1380toDoubleimpl;
        } else {
            long j7 = this.reading;
            j6 = j7 + m1383toLongimpl;
            if ((m1383toLongimpl ^ j7) >= 0 && (j7 ^ j6) < 0) {
                m1470overflowLRDsOJo(j5);
            }
        }
        this.reading = j6;
    }

    @Override // kotlin.time.AbstractLongTimeSource
    public long read() {
        return this.reading;
    }
}
