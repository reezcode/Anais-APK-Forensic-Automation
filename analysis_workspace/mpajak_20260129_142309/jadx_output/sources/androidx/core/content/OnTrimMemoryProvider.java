package androidx.core.content;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

/* loaded from: classes21.dex */
public interface OnTrimMemoryProvider {
    void addOnTrimMemoryListener(@NonNull Consumer<Integer> consumer);

    void removeOnTrimMemoryListener(@NonNull Consumer<Integer> consumer);
}
