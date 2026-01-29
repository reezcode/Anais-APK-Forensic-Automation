package x3;

import kotlin.jvm.internal.Intrinsics;
import s3.d0;
import s3.u;

/* loaded from: classes17.dex */
public final class h extends d0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f5949b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5950c;

    /* renamed from: d, reason: collision with root package name */
    public final f4.h f5951d;

    public h(String str, long j5, f4.h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f5949b = str;
        this.f5950c = j5;
        this.f5951d = source;
    }

    @Override // s3.d0
    public final long a() {
        return this.f5950c;
    }

    @Override // s3.d0
    public final u b() {
        String str = this.f5949b;
        if (str != null) {
            return u.f5303f.b(str);
        }
        return null;
    }

    @Override // s3.d0
    public final f4.h c() {
        return this.f5951d;
    }
}
