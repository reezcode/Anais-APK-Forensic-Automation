package l0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j {
    public static void a(boolean z4, @NonNull String str) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static <T> T b(@Nullable T t4) {
        Objects.requireNonNull(t4, "Argument must not be null");
        return t4;
    }
}
