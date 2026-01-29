package androidx.core.location;

import android.location.Location;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class LocationKt {
    public static final double component1(Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return location.getLatitude();
    }

    public static final double component2(Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return location.getLongitude();
    }
}
