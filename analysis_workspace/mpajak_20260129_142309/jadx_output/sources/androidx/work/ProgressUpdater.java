package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.UUID;

/* loaded from: classes15.dex */
public interface ProgressUpdater {
    @NonNull
    h2.a<Void> updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data);
}
