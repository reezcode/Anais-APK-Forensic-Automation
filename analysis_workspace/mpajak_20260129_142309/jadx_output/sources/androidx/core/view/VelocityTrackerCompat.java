package androidx.core.view;

import android.view.VelocityTracker;

@Deprecated
/* loaded from: classes4.dex */
public final class VelocityTrackerCompat {
    private VelocityTrackerCompat() {
    }

    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker, int i5) {
        return velocityTracker.getXVelocity(i5);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker, int i5) {
        return velocityTracker.getYVelocity(i5);
    }
}
