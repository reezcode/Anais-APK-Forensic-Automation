package kotlin.ranges;

/* loaded from: classes8.dex */
final class OpenEndFloatRange implements OpenEndRange<Float> {
    private final float _endExclusive;
    private final float _start;

    public OpenEndFloatRange(float f5, float f6) {
        this._start = f5;
        this._endExclusive = f6;
    }

    private final boolean lessThanOrEquals(float f5, float f6) {
        return f5 <= f6;
    }

    public boolean contains(float f5) {
        return f5 >= this._start && f5 < this._endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Float f5) {
        return contains(f5.floatValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof OpenEndFloatRange) {
            if (isEmpty() && ((OpenEndFloatRange) obj).isEmpty()) {
                return true;
            }
            OpenEndFloatRange openEndFloatRange = (OpenEndFloatRange) obj;
            if (this._start == openEndFloatRange._start) {
                if (this._endExclusive == openEndFloatRange._endExclusive) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public Float getEndExclusive() {
        return Float.valueOf(this._endExclusive);
    }

    @Override // kotlin.ranges.OpenEndRange
    public Float getStart() {
        return Float.valueOf(this._start);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this._start).hashCode() * 31) + Float.valueOf(this._endExclusive).hashCode();
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this._start >= this._endExclusive;
    }

    public String toString() {
        return this._start + "..<" + this._endExclusive;
    }
}
