package d0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import l0.a;
import p.h;
import r.w;

/* loaded from: classes15.dex */
public final class d implements e<c0.c, byte[]> {
    @Override // d0.e
    @Nullable
    public final w<byte[]> a(@NonNull w<c0.c> wVar, @NonNull h hVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = wVar.get().f471b.f482a.f484a.g().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = l0.a.f3917a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.f3920a == 0 && bVar.f3921b == bVar.f3922c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new z.b(bArr);
    }
}
