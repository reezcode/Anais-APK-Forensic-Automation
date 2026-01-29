package m3;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes23.dex */
public interface w extends CoroutineContext.Element {

    /* loaded from: classes15.dex */
    public static final class a implements CoroutineContext.Key<w> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f4221b = new a();
    }

    void handleException(Throwable th);
}
