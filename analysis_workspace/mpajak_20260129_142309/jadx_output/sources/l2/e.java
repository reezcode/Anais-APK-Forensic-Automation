package l2;

import i2.a0;
import i2.y;
import i2.z;

/* loaded from: classes17.dex */
public final class e implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final k2.e f3962b;

    public e(k2.e eVar) {
        this.f3962b = eVar;
    }

    @Override // i2.a0
    public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
        j2.a aVar2 = (j2.a) aVar.f4568a.getAnnotation(j2.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (z<T>) b(this.f3962b, iVar, aVar, aVar2);
    }

    public final z<?> b(k2.e eVar, i2.i iVar, o2.a<?> aVar, j2.a aVar2) {
        z<?> oVar;
        Object c5 = eVar.a(new o2.a(aVar2.value())).c();
        if (c5 instanceof z) {
            oVar = (z) c5;
        } else if (c5 instanceof a0) {
            oVar = ((a0) c5).a(iVar, aVar);
        } else {
            boolean z4 = c5 instanceof i2.t;
            if (!z4 && !(c5 instanceof i2.m)) {
                StringBuilder g5 = androidx.activity.d.g("Invalid attempt to bind an instance of ");
                g5.append(c5.getClass().getName());
                g5.append(" as a @JsonAdapter for ");
                g5.append(aVar.toString());
                g5.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(g5.toString());
            }
            oVar = new o<>(z4 ? (i2.t) c5 : null, c5 instanceof i2.m ? (i2.m) c5 : null, iVar, aVar);
        }
        return (oVar == null || !aVar2.nullSafe()) ? oVar : new y(oVar);
    }
}
