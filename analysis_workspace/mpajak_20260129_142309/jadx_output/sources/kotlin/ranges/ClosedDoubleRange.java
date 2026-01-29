package kotlin.ranges;

/* loaded from: classes22.dex */
final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {
    private final double _endInclusive;
    private final double _start;

    public ClosedDoubleRange(double d5, double d6) {
        this._start = d5;
        this._endInclusive = d6;
    }

    public boolean contains(double d5) {
        return d5 >= this._start && d5 <= this._endInclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClosedDoubleRange) {
            if (isEmpty() && ((ClosedDoubleRange) obj).isEmpty()) {
                return true;
            }
            ClosedDoubleRange closedDoubleRange = (ClosedDoubleRange) obj;
            if (this._start == closedDoubleRange._start) {
                if (this._endInclusive == closedDoubleRange._endInclusive) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    public Double getEndInclusive() {
        return Double.valueOf(this._endInclusive);
    }

    @Override // kotlin.ranges.ClosedRange
    public Double getStart() {
        return Double.valueOf(this._start);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this._start).hashCode() * 31) + Double.valueOf(this._endInclusive).hashCode();
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public boolean lessThanOrEquals(double d5, double d6) {
        return d5 <= d6;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Double d5, Double d6) {
        return lessThanOrEquals(d5.doubleValue(), d6.doubleValue());
    }

    public String toString() {
        return this._start + ".." + this._endInclusive;
    }
}
