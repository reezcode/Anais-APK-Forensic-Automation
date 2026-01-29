package b2;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f368a;

    public i(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        this.f368a = f5;
    }

    @Override // b2.c
    public final float a(@NonNull RectF rectF) {
        return rectF.height() * this.f368a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f368a == ((i) obj).f368a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f368a)});
    }
}
