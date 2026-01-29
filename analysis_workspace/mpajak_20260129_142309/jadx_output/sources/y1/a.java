package y1;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes10.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f6048a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0086a f6049b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6050c;

    /* renamed from: y1.a$a, reason: collision with other inner class name */
    /* loaded from: classes17.dex */
    public interface InterfaceC0086a {
    }

    public a(InterfaceC0086a interfaceC0086a, Typeface typeface) {
        this.f6048a = typeface;
        this.f6049b = interfaceC0086a;
    }

    @Override // y1.f
    public final void a(int i5) {
        c(this.f6048a);
    }

    @Override // y1.f
    public final void b(Typeface typeface, boolean z4) {
        c(typeface);
    }

    public final void c(Typeface typeface) {
        if (this.f6050c) {
            return;
        }
        v1.d dVar = ((v1.c) this.f6049b).f5564a;
        if (dVar.n(typeface)) {
            dVar.k(false);
        }
    }
}
