package androidx.core.graphics;

import android.graphics.PointF;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(@NonNull PointF pointF, float f5, @NonNull PointF pointF2, float f6) {
        this.mStart = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.mStartFraction = f5;
        this.mEnd = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.mEndFraction = f6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        return Float.compare(this.mStartFraction, pathSegment.mStartFraction) == 0 && Float.compare(this.mEndFraction, pathSegment.mEndFraction) == 0 && this.mStart.equals(pathSegment.mStart) && this.mEnd.equals(pathSegment.mEnd);
    }

    @NonNull
    public PointF getEnd() {
        return this.mEnd;
    }

    public float getEndFraction() {
        return this.mEndFraction;
    }

    @NonNull
    public PointF getStart() {
        return this.mStart;
    }

    public float getStartFraction() {
        return this.mStartFraction;
    }

    public int hashCode() {
        int hashCode = this.mStart.hashCode() * 31;
        float f5 = this.mStartFraction;
        int hashCode2 = (this.mEnd.hashCode() + ((hashCode + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31)) * 31;
        float f6 = this.mEndFraction;
        return hashCode2 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0);
    }

    public String toString() {
        StringBuilder g5 = d.g("PathSegment{start=");
        g5.append(this.mStart);
        g5.append(", startFraction=");
        g5.append(this.mStartFraction);
        g5.append(", end=");
        g5.append(this.mEnd);
        g5.append(", endFraction=");
        g5.append(this.mEndFraction);
        g5.append('}');
        return g5.toString();
    }
}
