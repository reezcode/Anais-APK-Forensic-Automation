package h2;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes10.dex */
public interface a<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
