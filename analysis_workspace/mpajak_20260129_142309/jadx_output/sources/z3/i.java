package z3;

import java.io.IOException;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import z3.f;

/* loaded from: classes14.dex */
public final class i extends v3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f.e f6258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f6259f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f6260g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, f.e eVar, u uVar) {
        super(str, true);
        this.f6258e = eVar;
        this.f6260g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, z3.q>] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, z3.u] */
    @Override // v3.a
    public final long a() {
        ?? r22;
        int i5;
        T t4;
        f.e eVar = this.f6258e;
        boolean z4 = this.f6259f;
        u settings = this.f6260g;
        Objects.requireNonNull(eVar);
        Intrinsics.checkNotNullParameter(settings, "settings");
        Ref.LongRef longRef = new Ref.LongRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        synchronized (eVar.f6244c.f6230z) {
            synchronized (eVar.f6244c) {
                u uVar = eVar.f6244c.f6224t;
                if (z4) {
                    r22 = settings;
                } else {
                    u uVar2 = new u();
                    uVar2.b(uVar);
                    uVar2.b(settings);
                    Unit unit = Unit.INSTANCE;
                    r22 = uVar2;
                }
                objectRef2.element = r22;
                long a5 = r22.a() - uVar.a();
                longRef.element = a5;
                if (a5 != 0 && !eVar.f6244c.f6208d.isEmpty()) {
                    Object[] array = eVar.f6244c.f6208d.values().toArray(new q[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    t4 = (q[]) array;
                    objectRef.element = t4;
                    f fVar = eVar.f6244c;
                    u uVar3 = (u) objectRef2.element;
                    Objects.requireNonNull(fVar);
                    Intrinsics.checkNotNullParameter(uVar3, "<set-?>");
                    fVar.f6224t = uVar3;
                    eVar.f6244c.f6216l.c(new g(eVar.f6244c.f6209e + " onSettings", eVar, objectRef2), 0L);
                    Unit unit2 = Unit.INSTANCE;
                }
                t4 = 0;
                objectRef.element = t4;
                f fVar2 = eVar.f6244c;
                u uVar32 = (u) objectRef2.element;
                Objects.requireNonNull(fVar2);
                Intrinsics.checkNotNullParameter(uVar32, "<set-?>");
                fVar2.f6224t = uVar32;
                eVar.f6244c.f6216l.c(new g(eVar.f6244c.f6209e + " onSettings", eVar, objectRef2), 0L);
                Unit unit22 = Unit.INSTANCE;
            }
            try {
                eVar.f6244c.f6230z.a((u) objectRef2.element);
            } catch (IOException e5) {
                f.a(eVar.f6244c, e5);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        q[] qVarArr = (q[]) objectRef.element;
        if (qVarArr == null) {
            return -1L;
        }
        Intrinsics.checkNotNull(qVarArr);
        for (q qVar : qVarArr) {
            synchronized (qVar) {
                long j5 = longRef.element;
                qVar.f6298d += j5;
                if (j5 > 0) {
                    qVar.notifyAll();
                }
                Unit unit4 = Unit.INSTANCE;
            }
        }
        return -1L;
    }
}
