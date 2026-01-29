package z0;

import android.annotation.TargetApi;
import android.os.Trace;
import java.io.Closeable;

/* loaded from: classes17.dex */
public final class k implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public static final g3.a f6109c = a1.b.b().a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6110b;

    @TargetApi(18)
    public k(String str) {
        boolean z4 = ((Boolean) f6109c.f2951b).booleanValue();
        this.f6110b = z4;
        if (z4) {
            Trace.beginSection(str.length() > 127 ? str.substring(0, 127) : str);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @TargetApi(18)
    public final void close() {
        if (this.f6110b) {
            Trace.endSection();
        }
    }
}
