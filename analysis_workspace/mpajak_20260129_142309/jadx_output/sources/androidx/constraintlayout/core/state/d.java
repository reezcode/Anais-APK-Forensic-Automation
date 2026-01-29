package androidx.constraintlayout.core.state;

import org.apache.commons.io.function.IOConsumer;

/* loaded from: classes24.dex */
public final /* synthetic */ class d implements Interpolator, IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f147a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f148b = new d();

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        i4.b.c(obj);
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        return i4.b.a(this, iOConsumer);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f5) {
        float lambda$getInterpolator$2;
        lambda$getInterpolator$2 = Transition.lambda$getInterpolator$2(f5);
        return lambda$getInterpolator$2;
    }
}
