package b2;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes23.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f319a;

    public a(float f5) {
        this.f319a = f5;
    }

    @Override // b2.c
    public final float a(@NonNull RectF rectF) {
        return this.f319a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f319a == ((a) obj).f319a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f319a)});
    }
}
