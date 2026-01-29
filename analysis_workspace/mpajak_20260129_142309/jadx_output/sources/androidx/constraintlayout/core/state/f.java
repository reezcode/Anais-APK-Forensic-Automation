package androidx.constraintlayout.core.state;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.io.output.AbstractByteArrayOutputStream;

/* loaded from: classes24.dex */
public final /* synthetic */ class f implements Interpolator, AbstractByteArrayOutputStream.InputStreamConstructor {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f f153a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f f154b = new f();

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream.InputStreamConstructor
    public final InputStream construct(byte[] bArr, int i5, int i6) {
        return new ByteArrayInputStream(bArr, i5, i6);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f5) {
        float lambda$getInterpolator$5;
        lambda$getInterpolator$5 = Transition.lambda$getInterpolator$5(f5);
        return lambda$getInterpolator$5;
    }
}
