package v3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes18.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public c f5701a;

    /* renamed from: b, reason: collision with root package name */
    public long f5702b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5703c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5704d;

    public a(String name, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f5703c = name;
        this.f5704d = z4;
        this.f5702b = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f5703c;
    }
}
