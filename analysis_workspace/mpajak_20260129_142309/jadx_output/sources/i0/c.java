package i0;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l0.k;

/* loaded from: classes6.dex */
public abstract class c<T> implements h<T> {

    /* renamed from: b, reason: collision with root package name */
    public final int f3244b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3245c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public h0.c f3246d;

    public c() {
        if (!k.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f3244b = Integer.MIN_VALUE;
        this.f3245c = Integer.MIN_VALUE;
    }

    @Override // i0.h
    public final void a(@NonNull g gVar) {
        gVar.b(this.f3244b, this.f3245c);
    }

    @Override // i0.h
    public final void b(@NonNull g gVar) {
    }

    @Override // i0.h
    public final void c(@Nullable Drawable drawable) {
    }

    @Override // e0.l
    public final void d() {
    }

    @Override // i0.h
    public final void e(@Nullable h0.c cVar) {
        this.f3246d = cVar;
    }

    @Override // i0.h
    public final void f(@Nullable Drawable drawable) {
    }

    @Override // i0.h
    @Nullable
    public final h0.c g() {
        return this.f3246d;
    }

    @Override // e0.l
    public final void onDestroy() {
    }

    @Override // e0.l
    public final void onStart() {
    }
}
