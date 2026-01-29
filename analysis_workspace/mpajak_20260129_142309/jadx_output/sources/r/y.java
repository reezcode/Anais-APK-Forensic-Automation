package r;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes8.dex */
public final class y implements p.f {

    /* renamed from: j, reason: collision with root package name */
    public static final l0.g<Class<?>, byte[]> f4996j = new l0.g<>(50);

    /* renamed from: b, reason: collision with root package name */
    public final s.b f4997b;

    /* renamed from: c, reason: collision with root package name */
    public final p.f f4998c;

    /* renamed from: d, reason: collision with root package name */
    public final p.f f4999d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5000e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5001f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f5002g;

    /* renamed from: h, reason: collision with root package name */
    public final p.h f5003h;

    /* renamed from: i, reason: collision with root package name */
    public final p.l<?> f5004i;

    public y(s.b bVar, p.f fVar, p.f fVar2, int i5, int i6, p.l<?> lVar, Class<?> cls, p.h hVar) {
        this.f4997b = bVar;
        this.f4998c = fVar;
        this.f4999d = fVar2;
        this.f5000e = i5;
        this.f5001f = i6;
        this.f5004i = lVar;
        this.f5002g = cls;
        this.f5003h = hVar;
    }

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f4997b.c();
        ByteBuffer.wrap(bArr).putInt(this.f5000e).putInt(this.f5001f).array();
        this.f4999d.a(messageDigest);
        this.f4998c.a(messageDigest);
        messageDigest.update(bArr);
        p.l<?> lVar = this.f5004i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f5003h.a(messageDigest);
        l0.g<Class<?>, byte[]> gVar = f4996j;
        byte[] a5 = gVar.a(this.f5002g);
        if (a5 == null) {
            a5 = this.f5002g.getName().getBytes(p.f.f4612a);
            gVar.d(this.f5002g, a5);
        }
        messageDigest.update(a5);
        this.f4997b.put(bArr);
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f5001f == yVar.f5001f && this.f5000e == yVar.f5000e && l0.k.b(this.f5004i, yVar.f5004i) && this.f5002g.equals(yVar.f5002g) && this.f4998c.equals(yVar.f4998c) && this.f4999d.equals(yVar.f4999d) && this.f5003h.equals(yVar.f5003h);
    }

    @Override // p.f
    public final int hashCode() {
        int hashCode = ((((this.f4999d.hashCode() + (this.f4998c.hashCode() * 31)) * 31) + this.f5000e) * 31) + this.f5001f;
        p.l<?> lVar = this.f5004i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return this.f5003h.hashCode() + ((this.f5002g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("ResourceCacheKey{sourceKey=");
        g5.append(this.f4998c);
        g5.append(", signature=");
        g5.append(this.f4999d);
        g5.append(", width=");
        g5.append(this.f5000e);
        g5.append(", height=");
        g5.append(this.f5001f);
        g5.append(", decodedResourceClass=");
        g5.append(this.f5002g);
        g5.append(", transformation='");
        g5.append(this.f5004i);
        g5.append('\'');
        g5.append(", options=");
        g5.append(this.f5003h);
        g5.append('}');
        return g5.toString();
    }
}
