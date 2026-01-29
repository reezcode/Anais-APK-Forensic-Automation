package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.UUID;

/* loaded from: classes8.dex */
public interface ForegroundUpdater {
    @NonNull
    h2.a<Void> setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo);
}
