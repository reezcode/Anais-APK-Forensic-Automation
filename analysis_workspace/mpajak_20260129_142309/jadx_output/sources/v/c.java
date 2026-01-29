package v;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class c implements p.d<ByteBuffer> {
    @Override // p.d
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull p.h hVar) {
        try {
            l0.a.b(byteBuffer, file);
            return true;
        } catch (IOException e5) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e5);
            }
            return false;
        }
    }
}
