package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes23.dex */
public final class PointKt {
    public static final float component1(PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return pointF.x;
    }

    public static final int component1(Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        return point.x;
    }

    public static final float component2(PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return pointF.y;
    }

    public static final int component2(Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        return point.y;
    }

    public static final Point minus(Point point, int i5) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i6 = -i5;
        point2.offset(i6, i6);
        return point2;
    }

    public static final Point minus(Point point, Point p4) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        Point point2 = new Point(point.x, point.y);
        point2.offset(-p4.x, -p4.y);
        return point2;
    }

    public static final PointF minus(PointF pointF, float f5) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f6 = -f5;
        pointF2.offset(f6, f6);
        return pointF2;
    }

    public static final PointF minus(PointF pointF, PointF p4) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(-p4.x, -p4.y);
        return pointF2;
    }

    public static final Point plus(Point point, int i5) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i5, i5);
        return point2;
    }

    public static final Point plus(Point point, Point p4) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        Point point2 = new Point(point.x, point.y);
        point2.offset(p4.x, p4.y);
        return point2;
    }

    public static final PointF plus(PointF pointF, float f5) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f5, f5);
        return pointF2;
    }

    public static final PointF plus(PointF pointF, PointF p4) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(p4.x, p4.y);
        return pointF2;
    }

    public static final Point toPoint(PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }

    public static final PointF toPointF(Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        return new PointF(point);
    }

    public static final Point unaryMinus(Point point) {
        Intrinsics.checkNotNullParameter(point, "<this>");
        return new Point(-point.x, -point.y);
    }

    public static final PointF unaryMinus(PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }
}
