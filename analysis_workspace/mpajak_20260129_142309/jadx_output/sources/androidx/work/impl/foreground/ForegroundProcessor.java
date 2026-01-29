package androidx.work.impl.foreground;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes12.dex */
public interface ForegroundProcessor {
    boolean isEnqueuedInForeground(@NonNull String str);

    void startForeground(@NonNull String str, @NonNull ForegroundInfo foregroundInfo);

    void stopForeground(@NonNull String str);
}
