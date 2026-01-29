package m3;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public final Object f4196a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public final d f4197b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public final Function1<Throwable, Unit> f4198c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public final Object f4199d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public final Throwable f4200e;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Object obj, d dVar, Function1<? super Throwable, Unit> function1, Object obj2, Throwable th) {
        this.f4196a = obj;
        this.f4197b = dVar;
        this.f4198c = function1;
        this.f4199d = obj2;
        this.f4200e = th;
    }

    public m(Object obj, d dVar, Function1 function1, Throwable th, int i5) {
        dVar = (i5 & 2) != 0 ? null : dVar;
        function1 = (i5 & 4) != 0 ? null : function1;
        th = (i5 & 16) != 0 ? null : th;
        this.f4196a = obj;
        this.f4197b = dVar;
        this.f4198c = function1;
        this.f4199d = null;
        this.f4200e = th;
    }

    public static m a(m mVar, d dVar, Throwable th, int i5) {
        Object obj = (i5 & 1) != 0 ? mVar.f4196a : null;
        if ((i5 & 2) != 0) {
            dVar = mVar.f4197b;
        }
        d dVar2 = dVar;
        Function1<Throwable, Unit> function1 = (i5 & 4) != 0 ? mVar.f4198c : null;
        Object obj2 = (i5 & 8) != 0 ? mVar.f4199d : null;
        if ((i5 & 16) != 0) {
            th = mVar.f4200e;
        }
        Objects.requireNonNull(mVar);
        return new m(obj, dVar2, function1, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f4196a, mVar.f4196a) && Intrinsics.areEqual(this.f4197b, mVar.f4197b) && Intrinsics.areEqual(this.f4198c, mVar.f4198c) && Intrinsics.areEqual(this.f4199d, mVar.f4199d) && Intrinsics.areEqual(this.f4200e, mVar.f4200e);
    }

    public final int hashCode() {
        Object obj = this.f4196a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        d dVar = this.f4197b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.f4198c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f4199d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4200e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("CompletedContinuation(result=");
        g5.append(this.f4196a);
        g5.append(", cancelHandler=");
        g5.append(this.f4197b);
        g5.append(", onCancellation=");
        g5.append(this.f4198c);
        g5.append(", idempotentResume=");
        g5.append(this.f4199d);
        g5.append(", cancelCause=");
        g5.append(this.f4200e);
        g5.append(')');
        return g5.toString();
    }
}
