package w0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes18.dex */
public final class a implements ThreadFactory {

    /* renamed from: c, reason: collision with root package name */
    public final ThreadFactory f5750c = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final String f5749b = "EnhancedIntentService";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f5750c.newThread(new b(runnable));
        newThread.setName(this.f5749b);
        return newThread;
    }
}
