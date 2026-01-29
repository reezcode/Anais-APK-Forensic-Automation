package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes14.dex */
public class RemoteForegroundUpdater implements ForegroundUpdater {
    @Override // androidx.work.ForegroundUpdater
    @NonNull
    public h2.a<Void> setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo) {
        return RemoteWorkManager.getInstance(context).setForegroundAsync(uuid.toString(), foregroundInfo);
    }
}
