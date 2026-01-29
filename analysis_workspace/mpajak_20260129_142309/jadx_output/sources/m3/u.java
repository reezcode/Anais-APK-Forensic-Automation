package m3;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class u extends Lambda implements Function2<Boolean, CoroutineContext.Element, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final u f4215b = new u();

    public u() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(Boolean bool, CoroutineContext.Element element) {
        return Boolean.valueOf(bool.booleanValue() || (element instanceof r));
    }
}
