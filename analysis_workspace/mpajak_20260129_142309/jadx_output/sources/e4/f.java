package e4;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public final boolean f2644a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public final Integer f2645b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public final boolean f2646c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public final Integer f2647d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public final boolean f2648e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public final boolean f2649f;

    public f() {
        this.f2644a = false;
        this.f2645b = null;
        this.f2646c = false;
        this.f2647d = null;
        this.f2648e = false;
        this.f2649f = false;
    }

    public f(boolean z4, Integer num, boolean z5, Integer num2, boolean z6, boolean z7) {
        this.f2644a = z4;
        this.f2645b = num;
        this.f2646c = z5;
        this.f2647d = num2;
        this.f2648e = z6;
        this.f2649f = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2644a == fVar.f2644a && Intrinsics.areEqual(this.f2645b, fVar.f2645b) && this.f2646c == fVar.f2646c && Intrinsics.areEqual(this.f2647d, fVar.f2647d) && this.f2648e == fVar.f2648e && this.f2649f == fVar.f2649f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public final int hashCode() {
        boolean z4 = this.f2644a;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        Integer num = this.f2645b;
        int hashCode = (i5 + (num != null ? num.hashCode() : 0)) * 31;
        ?? r22 = this.f2646c;
        int i6 = r22;
        if (r22 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode + i6) * 31;
        Integer num2 = this.f2647d;
        int hashCode2 = (i7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.f2648e;
        int i8 = r23;
        if (r23 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode2 + i8) * 31;
        boolean z5 = this.f2649f;
        return i9 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("WebSocketExtensions(perMessageDeflate=");
        g5.append(this.f2644a);
        g5.append(", clientMaxWindowBits=");
        g5.append(this.f2645b);
        g5.append(", clientNoContextTakeover=");
        g5.append(this.f2646c);
        g5.append(", serverMaxWindowBits=");
        g5.append(this.f2647d);
        g5.append(", serverNoContextTakeover=");
        g5.append(this.f2648e);
        g5.append(", unknownValues=");
        g5.append(this.f2649f);
        g5.append(")");
        return g5.toString();
    }
}
