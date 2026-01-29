package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes20.dex */
public final class RegionKt {
    public static final Region and(Region region, Rect r4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.INTERSECT);
        return region2;
    }

    public static final Region and(Region region, Region r4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean contains(Region region, Point p4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(p4, "p");
        return region.contains(p4.x, p4.y);
    }

    public static final void forEach(Region region, Function1<? super Rect, Unit> action) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                action.invoke(rect);
            }
        }
    }

    public static final Iterator<Rect> iterator(Region region) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        return new RegionKt$iterator$1(region);
    }

    public static final Region minus(Region region, Rect r4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region minus(Region region, Region r4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region not(Region region) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region or(Region region, Rect r4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region2 = new Region(region);
        region2.union(r4);
        return region2;
    }

    public static final Region or(Region region, Region r4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.UNION);
        return region2;
    }

    public static final Region plus(Region region, Rect r4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region2 = new Region(region);
        region2.union(r4);
        return region2;
    }

    public static final Region plus(Region region, Region r4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.UNION);
        return region2;
    }

    public static final Region unaryMinus(Region region) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region xor(Region region, Rect r4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.XOR);
        return region2;
    }

    public static final Region xor(Region region, Region r4) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r4, "r");
        Region region2 = new Region(region);
        region2.op(r4, Region.Op.XOR);
        return region2;
    }
}
