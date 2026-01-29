package m3;

import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public final Object f4204a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public final Function1<Throwable, Unit> f4205b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(Object obj, Function1<? super Throwable, Unit> function1) {
        this.f4204a = obj;
        this.f4205b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f4204a, oVar.f4204a) && Intrinsics.areEqual(this.f4205b, oVar.f4205b);
    }

    public final int hashCode() {
        Object obj = this.f4204a;
        return this.f4205b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("CompletedWithCancellation(result=");
        g5.append(this.f4204a);
        g5.append(", onCancellation=");
        g5.append(this.f4205b);
        g5.append(')');
        return g5.toString();
    }
}
