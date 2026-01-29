package kotlin.coroutines;

import kotlin.SinceKotlin;

@SinceKotlin(version = "1.3")
/* loaded from: classes20.dex */
public interface Continuation<T> {
    CoroutineContext getContext();

    void resumeWith(Object obj);
}
