package androidx.constraintlayout.core.state;

import java.io.IOException;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.ProxyInputStream;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Interpolator, IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f146a;

    public /* synthetic */ c(Object obj) {
        this.f146a = obj;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        ((ProxyInputStream) this.f146a).handleIOException((IOException) obj);
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        return i4.b.a(this, iOConsumer);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f5) {
        float lambda$getInterpolator$0;
        lambda$getInterpolator$0 = Transition.lambda$getInterpolator$0((String) this.f146a, f5);
        return lambda$getInterpolator$0;
    }
}
