package androidx.work.impl.constraints;

import androidx.work.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class WorkConstraintsTrackerKt {
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"WorkConstraintsTracker\")");
        TAG = tagWithPrefix;
    }
}
