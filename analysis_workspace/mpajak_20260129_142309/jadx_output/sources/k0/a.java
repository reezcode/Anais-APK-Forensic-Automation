package k0;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import l0.k;
import p.f;

/* loaded from: classes15.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    public final int f3796b;

    /* renamed from: c, reason: collision with root package name */
    public final f f3797c;

    public a(int i5, f fVar) {
        this.f3796b = i5;
        this.f3797c = fVar;
    }

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        this.f3797c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3796b).array());
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3796b == aVar.f3796b && this.f3797c.equals(aVar.f3797c);
    }

    @Override // p.f
    public final int hashCode() {
        return k.g(this.f3797c, this.f3796b);
    }
}
