package c0;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import p.k;
import r.w;

/* loaded from: classes3.dex */
public final class d implements k<c> {
    @Override // p.d
    public final boolean a(@NonNull Object obj, @NonNull File file, @NonNull p.h hVar) {
        try {
            l0.a.b(((c) ((w) obj).get()).f471b.f482a.f484a.g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e5) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e5);
            }
            return false;
        }
    }

    @Override // p.k
    @NonNull
    public final p.c b(@NonNull p.h hVar) {
        return p.c.SOURCE;
    }
}
