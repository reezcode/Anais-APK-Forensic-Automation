package kotlin.ranges;

/* loaded from: classes17.dex */
final class OpenEndDoubleRange implements OpenEndRange<Double> {
    private final double _endExclusive;
    private final double _start;

    public OpenEndDoubleRange(double d5, double d6) {
        this._start = d5;
        this._endExclusive = d6;
    }

    private final boolean lessThanOrEquals(double d5, double d6) {
        return d5 <= d6;
    }

    public boolean contains(double d5) {
        return d5 >= this._start && d5 < this._endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Double d5) {
        return contains(d5.doubleValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof OpenEndDoubleRange) {
            if (isEmpty() && ((OpenEndDoubleRange) obj).isEmpty()) {
                return true;
            }
            OpenEndDoubleRange openEndDoubleRange = (OpenEndDoubleRange) obj;
            if (this._start == openEndDoubleRange._start) {
                if (this._endExclusive == openEndDoubleRange._endExclusive) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public Double getEndExclusive() {
        return Double.valueOf(this._endExclusive);
    }

    @Override // kotlin.ranges.OpenEndRange
    public Double getStart() {
        return Double.valueOf(this._start);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this._start).hashCode() * 31) + Double.valueOf(this._endExclusive).hashCode();
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this._start >= this._endExclusive;
    }

    public String toString() {
        return this._start + "..<" + this._endExclusive;
    }
}
