package androidx.constraintlayout.core.state;

import java.io.InputStream;
import org.apache.commons.io.input.UnsynchronizedByteArrayInputStream;
import org.apache.commons.io.output.AbstractByteArrayOutputStream;

/* loaded from: classes18.dex */
public final /* synthetic */ class g implements Interpolator, AbstractByteArrayOutputStream.InputStreamConstructor {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f155a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g f156b = new g();

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream.InputStreamConstructor
    public final InputStream construct(byte[] bArr, int i5, int i6) {
        return new UnsynchronizedByteArrayInputStream(bArr, i5, i6);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f5) {
        float lambda$getInterpolator$1;
        lambda$getInterpolator$1 = Transition.lambda$getInterpolator$1(f5);
        return lambda$getInterpolator$1;
    }
}
