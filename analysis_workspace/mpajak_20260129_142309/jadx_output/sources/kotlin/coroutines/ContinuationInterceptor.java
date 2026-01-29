package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin(version = "1.3")
/* loaded from: classes17.dex */
public interface ContinuationInterceptor extends CoroutineContext.Element {
    public static final Key Key = Key.$$INSTANCE;

    /* loaded from: classes20.dex */
    public static final class DefaultImpls {
        public static <R> R fold(ContinuationInterceptor continuationInterceptor, R r4, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.Element.DefaultImpls.fold(continuationInterceptor, r4, operation);
        }

        public static <E extends CoroutineContext.Element> E get(ContinuationInterceptor continuationInterceptor, CoroutineContext.Key<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractCoroutineContextKey)) {
                if (ContinuationInterceptor.Key != key) {
                    return null;
                }
                Intrinsics.checkNotNull(continuationInterceptor, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            if (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey())) {
                return null;
            }
            E e5 = (E) abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor);
            if (e5 instanceof CoroutineContext.Element) {
                return e5;
            }
            return null;
        }

        public static CoroutineContext minusKey(ContinuationInterceptor continuationInterceptor, CoroutineContext.Key<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractCoroutineContextKey)) {
                return ContinuationInterceptor.Key == key ? EmptyCoroutineContext.INSTANCE : continuationInterceptor;
            }
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            return (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey()) || abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor) == null) ? continuationInterceptor : EmptyCoroutineContext.INSTANCE;
        }

        public static CoroutineContext plus(ContinuationInterceptor continuationInterceptor, CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.DefaultImpls.plus(continuationInterceptor, context);
        }

        public static void releaseInterceptedContinuation(ContinuationInterceptor continuationInterceptor, Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
        }
    }

    /* loaded from: classes18.dex */
    public static final class Key implements CoroutineContext.Key<ContinuationInterceptor> {
        public static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key);

    <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    CoroutineContext minusKey(CoroutineContext.Key<?> key);

    void releaseInterceptedContinuation(Continuation<?> continuation);
}
