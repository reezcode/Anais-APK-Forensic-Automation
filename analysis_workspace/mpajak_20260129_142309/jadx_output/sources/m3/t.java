package m3;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class t extends Lambda implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<CoroutineContext> f4212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4213c = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Ref.ObjectRef objectRef) {
        super(2);
        this.f4212b = objectRef;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlin.coroutines.CoroutineContext] */
    @Override // kotlin.jvm.functions.Function2
    public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        CoroutineContext coroutineContext2 = coroutineContext;
        CoroutineContext.Element element2 = element;
        boolean z4 = element2 instanceof r;
        CoroutineContext coroutineContext3 = element2;
        if (z4) {
            if (this.f4212b.element.get(element2.getKey()) == null) {
                r rVar = (r) element2;
                coroutineContext3 = rVar;
                if (this.f4213c) {
                    coroutineContext3 = rVar.b();
                }
            } else {
                Ref.ObjectRef<CoroutineContext> objectRef = this.f4212b;
                objectRef.element = objectRef.element.minusKey(element2.getKey());
                coroutineContext3 = ((r) element2).s();
            }
        }
        return coroutineContext2.plus(coroutineContext3);
    }
}
