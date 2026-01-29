package t3;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class b implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5448c;

    public b(String str, boolean z4) {
        this.f5447b = str;
        this.f5448c = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f5447b);
        thread.setDaemon(this.f5448c);
        return thread;
    }
}
