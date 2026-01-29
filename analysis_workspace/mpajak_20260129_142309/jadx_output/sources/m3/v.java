package m3;

import kotlin.ExperimentalStdlibApi;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public abstract class v extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4218b = new a();

    @ExperimentalStdlibApi
    /* loaded from: classes6.dex */
    public static final class a extends AbstractCoroutineContextKey<ContinuationInterceptor, v> {

        /* renamed from: m3.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0051a extends Lambda implements Function1<CoroutineContext.Element, v> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0051a f4219b = new C0051a();

            public C0051a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final v invoke(CoroutineContext.Element element) {
                CoroutineContext.Element element2 = element;
                if (element2 instanceof v) {
                    return (v) element2;
                }
                return null;
            }
        }

        public a() {
            super(ContinuationInterceptor.Key, C0051a.f4219b);
        }
    }

    public v() {
        super(ContinuationInterceptor.Key);
    }

    public abstract void c(CoroutineContext coroutineContext, Runnable runnable);

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        return new q3.e(this, continuation);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(Continuation<?> continuation) {
        ((q3.e) continuation).j();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.b(this);
    }

    public boolean x() {
        return !(this instanceof i1);
    }
}
