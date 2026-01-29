package q3;

import java.util.Objects;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m3.g1;

/* loaded from: classes20.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final r f4791a = new r("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    public static final Function2<Object, CoroutineContext.Element, Object> f4792b = a.f4795b;

    /* renamed from: c, reason: collision with root package name */
    public static final Function2<g1<?>, CoroutineContext.Element, g1<?>> f4793c = b.f4796b;

    /* renamed from: d, reason: collision with root package name */
    public static final Function2<w, CoroutineContext.Element, w> f4794d = c.f4797b;

    /* loaded from: classes11.dex */
    public static final class a extends Lambda implements Function2<Object, CoroutineContext.Element, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f4795b = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, CoroutineContext.Element element) {
            CoroutineContext.Element element2 = element;
            if (!(element2 instanceof g1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? element2 : Integer.valueOf(intValue + 1);
        }
    }

    /* loaded from: classes14.dex */
    public static final class b extends Lambda implements Function2<g1<?>, CoroutineContext.Element, g1<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f4796b = new b();

        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final g1<?> invoke(g1<?> g1Var, CoroutineContext.Element element) {
            g1<?> g1Var2 = g1Var;
            CoroutineContext.Element element2 = element;
            if (g1Var2 != null) {
                return g1Var2;
            }
            if (element2 instanceof g1) {
                return (g1) element2;
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends Lambda implements Function2<w, CoroutineContext.Element, w> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f4797b = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final w invoke(w wVar, CoroutineContext.Element element) {
            w wVar2 = wVar;
            CoroutineContext.Element element2 = element;
            if (element2 instanceof g1) {
                g1<Object> g1Var = (g1) element2;
                Object w4 = g1Var.w(wVar2.f4799a);
                Object[] objArr = wVar2.f4800b;
                int i5 = wVar2.f4802d;
                objArr[i5] = w4;
                g1<Object>[] g1VarArr = wVar2.f4801c;
                wVar2.f4802d = i5 + 1;
                g1VarArr[i5] = g1Var;
            }
            return wVar2;
        }
    }

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f4791a) {
            return;
        }
        if (!(obj instanceof w)) {
            Object fold = coroutineContext.fold(null, f4793c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((g1) fold).f(obj);
            return;
        }
        w wVar = (w) obj;
        int length = wVar.f4801c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i5 = length - 1;
            g1<Object> g1Var = wVar.f4801c[length];
            Intrinsics.checkNotNull(g1Var);
            g1Var.f(wVar.f4800b[length]);
            if (i5 < 0) {
                return;
            } else {
                length = i5;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = coroutineContext.fold(0, f4792b);
            Intrinsics.checkNotNull(obj);
        }
        return obj == 0 ? f4791a : obj instanceof Integer ? coroutineContext.fold(new w(coroutineContext, ((Number) obj).intValue()), f4794d) : ((g1) obj).w(coroutineContext);
    }
}
