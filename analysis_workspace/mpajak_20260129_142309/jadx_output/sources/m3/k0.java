package m3;

import java.util.Objects;
import kotlin.collections.ArraysKt___ArraysJvmKt;

/* loaded from: classes23.dex */
public abstract class k0 extends v {

    /* renamed from: c, reason: collision with root package name */
    public long f4186c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4187d;

    /* renamed from: e, reason: collision with root package name */
    public q3.a<g0<?>> f4188e;

    public final void A(g0<?> g0Var) {
        q3.a<g0<?>> aVar = this.f4188e;
        if (aVar == null) {
            aVar = new q3.a<>();
            this.f4188e = aVar;
        }
        Object[] objArr = aVar.f4755a;
        int i5 = aVar.f4757c;
        objArr[i5] = g0Var;
        int length = (objArr.length - 1) & (i5 + 1);
        aVar.f4757c = length;
        int i6 = aVar.f4756b;
        if (length == i6) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, i6, 0, 10, (Object) null);
            Object[] objArr3 = aVar.f4755a;
            int length3 = objArr3.length;
            int i7 = aVar.f4756b;
            ArraysKt___ArraysJvmKt.copyInto$default(objArr3, objArr2, length3 - i7, 0, i7, 4, (Object) null);
            aVar.f4755a = objArr2;
            aVar.f4756b = 0;
            aVar.f4757c = length2;
        }
    }

    public final void E(boolean z4) {
        this.f4186c = z(z4) + this.f4186c;
        if (z4) {
            return;
        }
        this.f4187d = true;
    }

    public final boolean H() {
        return this.f4186c >= z(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    public final boolean I() {
        q3.a<g0<?>> aVar = this.f4188e;
        if (aVar == null) {
            return false;
        }
        int i5 = aVar.f4756b;
        g0 g0Var = null;
        if (i5 != aVar.f4757c) {
            ?? r32 = aVar.f4755a;
            ?? r6 = r32[i5];
            r32[i5] = 0;
            aVar.f4756b = (i5 + 1) & (r32.length - 1);
            Objects.requireNonNull(r6, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            g0Var = r6;
        }
        g0 g0Var2 = g0Var;
        if (g0Var2 == null) {
            return false;
        }
        g0Var2.run();
        return true;
    }

    public void shutdown() {
    }

    public final void y() {
        long z4 = this.f4186c - z(true);
        this.f4186c = z4;
        if (z4 <= 0 && this.f4187d) {
            shutdown();
        }
    }

    public final long z(boolean z4) {
        return z4 ? 4294967296L : 1L;
    }
}
