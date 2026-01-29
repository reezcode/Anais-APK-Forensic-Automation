package s3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f5197a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f5198b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f5199c;

    public e0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f5197a = address;
        this.f5198b = proxy;
        this.f5199c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (Intrinsics.areEqual(e0Var.f5197a, this.f5197a) && Intrinsics.areEqual(e0Var.f5198b, this.f5198b) && Intrinsics.areEqual(e0Var.f5199c, this.f5199c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5199c.hashCode() + ((this.f5198b.hashCode() + ((this.f5197a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Route{");
        g5.append(this.f5199c);
        g5.append('}');
        return g5.toString();
    }
}
