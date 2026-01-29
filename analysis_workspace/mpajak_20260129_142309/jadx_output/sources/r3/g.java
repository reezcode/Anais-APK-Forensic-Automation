package r3;

import kotlin.jvm.JvmField;

/* loaded from: classes24.dex */
public abstract class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public long f5064b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public h f5065c;

    public g() {
        i iVar = k.f5073f;
        this.f5064b = 0L;
        this.f5065c = iVar;
    }

    public g(long j5, h hVar) {
        this.f5064b = j5;
        this.f5065c = hVar;
    }
}
