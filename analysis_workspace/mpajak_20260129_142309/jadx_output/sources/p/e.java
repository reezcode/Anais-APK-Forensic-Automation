package p;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class e extends IOException {
    public e(String str, int i5, @Nullable Throwable th) {
        super(str + ", status code: " + i5, th);
    }
}
