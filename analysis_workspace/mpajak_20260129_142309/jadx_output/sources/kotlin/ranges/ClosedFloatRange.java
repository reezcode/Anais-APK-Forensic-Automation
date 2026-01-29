package kotlin.ranges;

/* loaded from: classes19.dex */
final class ClosedFloatRange implements ClosedFloatingPointRange<Float> {
    private final float _endInclusive;
    private final float _start;

    public ClosedFloatRange(float f5, float f6) {
        this._start = f5;
        this._endInclusive = f6;
    }

    public boolean contains(float f5) {
        return f5 >= this._start && f5 <= this._endInclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClosedFloatRange) {
            if (isEmpty() && ((ClosedFloatRange) obj).isEmpty()) {
                return true;
            }
            ClosedFloatRange closedFloatRange = (ClosedFloatRange) obj;
            if (this._start == closedFloatRange._start) {
                if (this._endInclusive == closedFloatRange._endInclusive) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    public Float getEndInclusive() {
        return Float.valueOf(this._endInclusive);
    }

    @Override // kotlin.ranges.ClosedRange
    public Float getStart() {
        return Float.valueOf(this._start);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this._start).hashCode() * 31) + Float.valueOf(this._endInclusive).hashCode();
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public boolean lessThanOrEquals(float f5, float f6) {
        return f5 <= f6;
    }

    @Override // kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Float f5, Float f6) {
        return lessThanOrEquals(f5.floatValue(), f6.floatValue());
    }

    public String toString() {
        return this._start + ".." + this._endInclusive;
    }
}
