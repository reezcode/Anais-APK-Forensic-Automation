package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ProgressUpdater;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public class RemoteProgressUpdater implements ProgressUpdater {
    @Override // androidx.work.ProgressUpdater
    @NonNull
    public h2.a<Void> updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data) {
        return RemoteWorkManager.getInstance(context).setProgress(uuid, data);
    }
}
