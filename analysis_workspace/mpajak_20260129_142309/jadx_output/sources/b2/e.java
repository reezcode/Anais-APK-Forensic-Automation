package b2;

import androidx.annotation.NonNull;

/* loaded from: classes24.dex */
public final class e extends d {
    @Override // b2.d
    public final void a(@NonNull m mVar, float f5, float f6) {
        mVar.f(f6 * f5, 180.0f, 90.0f);
        double d5 = f6;
        double d6 = f5;
        mVar.e((float) (Math.sin(Math.toRadians(90.0f)) * d5 * d6), (float) (Math.sin(Math.toRadians(0.0f)) * d5 * d6));
    }
}
