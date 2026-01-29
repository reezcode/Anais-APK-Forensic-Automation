package pl.droidsonroids.gif;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes4.dex */
public class GifIOException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final k4.b f4675b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4676c;

    public GifIOException(int i5, String str) {
        k4.b bVar;
        k4.b[] values = k4.b.values();
        int length = values.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                bVar = k4.b.UNKNOWN;
                bVar.f3906c = i5;
                break;
            } else {
                bVar = values[i6];
                if (bVar.f3906c == i5) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.f4675b = bVar;
        this.f4676c = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (this.f4676c == null) {
            return this.f4675b.a();
        }
        return this.f4675b.a() + ": " + this.f4676c;
    }
}
