package m3;

import java.io.Closeable;
import kotlin.ExperimentalStdlibApi;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public abstract class n0 extends v implements Closeable {

    @ExperimentalStdlibApi
    /* loaded from: classes7.dex */
    public static final class a extends AbstractCoroutineContextKey<v, n0> {

        /* renamed from: m3.n0$a$a, reason: collision with other inner class name */
        /* loaded from: classes20.dex */
        public static final class C0050a extends Lambda implements Function1<CoroutineContext.Element, n0> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0050a f4203b = new C0050a();

            public C0050a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final n0 invoke(CoroutineContext.Element element) {
                CoroutineContext.Element element2 = element;
                if (element2 instanceof n0) {
                    return (n0) element2;
                }
                return null;
            }
        }

        public a() {
            super(v.f4218b, C0050a.f4203b);
        }
    }

    static {
        new a();
    }
}
