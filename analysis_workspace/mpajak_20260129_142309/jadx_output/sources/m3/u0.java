package m3;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public interface u0 extends CoroutineContext.Element {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4216a = 0;

    /* loaded from: classes7.dex */
    public static final class a {
        public static /* synthetic */ i0 a(u0 u0Var, boolean z4, boolean z5, Function1 function1, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z4 = false;
            }
            return u0Var.n(z4, (i5 & 2) != 0, function1);
        }
    }

    /* loaded from: classes12.dex */
    public static final class b implements CoroutineContext.Key<u0> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f4217b = new b();
    }

    i0 a(Function1<? super Throwable, Unit> function1);

    i e(k kVar);

    boolean isActive();

    i0 n(boolean z4, boolean z5, Function1<? super Throwable, Unit> function1);

    CancellationException q();

    void r(CancellationException cancellationException);

    boolean start();
}
