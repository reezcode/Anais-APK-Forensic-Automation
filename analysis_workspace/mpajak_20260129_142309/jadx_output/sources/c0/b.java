package c0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.a;

/* loaded from: classes23.dex */
public final class b implements a.InterfaceC0058a {

    /* renamed from: a, reason: collision with root package name */
    public final s.d f469a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final s.b f470b;

    public b(s.d dVar, @Nullable s.b bVar) {
        this.f469a = dVar;
        this.f470b = bVar;
    }

    @NonNull
    public final byte[] a(int i5) {
        s.b bVar = this.f470b;
        return bVar == null ? new byte[i5] : (byte[]) bVar.b(i5, byte[].class);
    }
}
