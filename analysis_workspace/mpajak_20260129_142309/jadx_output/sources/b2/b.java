package b2;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes25.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f320a;

    /* renamed from: b, reason: collision with root package name */
    public final float f321b;

    public b(float f5, @NonNull c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f320a;
            f5 += ((b) cVar).f321b;
        }
        this.f320a = cVar;
        this.f321b = f5;
    }

    @Override // b2.c
    public final float a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f320a.a(rectF) + this.f321b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f320a.equals(bVar.f320a) && this.f321b == bVar.f321b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f320a, Float.valueOf(this.f321b)});
    }
}
