package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
public final class RectKt {
    @SuppressLint({"CheckResult"})
    public static final Rect and(Rect rect, Rect r4) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Rect rect2 = new Rect(rect);
        rect2.intersect(r4);
        return rect2;
    }

    @SuppressLint({"CheckResult"})
    public static final RectF and(RectF rectF, RectF r4) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.intersect(r4);
        return rectF2;
    }

    public static final float component1(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.left;
    }

    public static final int component1(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.left;
    }

    public static final float component2(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.top;
    }

    public static final int component2(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.top;
    }

    public static final float component3(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.right;
    }

    public static final int component3(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.right;
    }

    public static final float component4(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.bottom;
    }

    public static final int component4(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean contains(Rect rect, Point p4) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        return rect.contains(p4.x, p4.y);
    }

    public static final boolean contains(RectF rectF, PointF p4) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        return rectF.contains(p4.x, p4.y);
    }

    public static final Rect minus(Rect rect, int i5) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i6 = -i5;
        rect2.offset(i6, i6);
        return rect2;
    }

    public static final Rect minus(Rect rect, Point xy) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(xy, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-xy.x, -xy.y);
        return rect2;
    }

    public static final RectF minus(RectF rectF, float f5) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f6 = -f5;
        rectF2.offset(f6, f6);
        return rectF2;
    }

    public static final RectF minus(RectF rectF, PointF xy) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(xy, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-xy.x, -xy.y);
        return rectF2;
    }

    public static final Region minus(Rect rect, Rect r4) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region = new Region(rect);
        region.op(r4, Region.Op.DIFFERENCE);
        return region;
    }

    public static final Region minus(RectF rectF, RectF r4) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        r4.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final Rect or(Rect rect, Rect r4) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Rect rect2 = new Rect(rect);
        rect2.union(r4);
        return rect2;
    }

    public static final RectF or(RectF rectF, RectF r4) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.union(r4);
        return rectF2;
    }

    public static final Rect plus(Rect rect, int i5) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i5, i5);
        return rect2;
    }

    public static final Rect plus(Rect rect, Point xy) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(xy, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(xy.x, xy.y);
        return rect2;
    }

    public static final Rect plus(Rect rect, Rect r4) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Rect rect2 = new Rect(rect);
        rect2.union(r4);
        return rect2;
    }

    public static final RectF plus(RectF rectF, float f5) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f5, f5);
        return rectF2;
    }

    public static final RectF plus(RectF rectF, PointF xy) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(xy, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(xy.x, xy.y);
        return rectF2;
    }

    public static final RectF plus(RectF rectF, RectF r4) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.union(r4);
        return rectF2;
    }

    public static final Rect times(Rect rect, int i5) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i5;
        rect2.left *= i5;
        rect2.right *= i5;
        rect2.bottom *= i5;
        return rect2;
    }

    public static final RectF times(RectF rectF, float f5) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f5;
        rectF2.left *= f5;
        rectF2.right *= f5;
        rectF2.bottom *= f5;
        return rectF2;
    }

    public static final RectF times(RectF rectF, int i5) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        float f5 = i5;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f5;
        rectF2.left *= f5;
        rectF2.right *= f5;
        rectF2.bottom *= f5;
        return rectF2;
    }

    public static final Rect toRect(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public static final RectF toRectF(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new RectF(rect);
    }

    public static final Region toRegion(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new Region(rect);
    }

    public static final Region toRegion(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    public static final RectF transform(RectF rectF, Matrix m5) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(m5, "m");
        m5.mapRect(rectF);
        return rectF;
    }

    public static final Region xor(Rect rect, Rect r4) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region = new Region(rect);
        region.op(r4, Region.Op.XOR);
        return region;
    }

    public static final Region xor(RectF rectF, RectF r4) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        r4.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }
}
