package f4;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes10.dex */
public interface y extends Closeable, Flushable {
    void T(f fVar, long j5);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    b0 i();
}
