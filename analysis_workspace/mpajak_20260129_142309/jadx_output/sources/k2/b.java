package k2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* loaded from: classes23.dex */
public final class b implements q<Object> {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Type f3810e;

    public b(Type type) {
        this.f3810e = type;
    }

    @Override // k2.q
    public final Object c() {
        Type type = this.f3810e;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder g5 = androidx.activity.d.g("Invalid EnumMap type: ");
            g5.append(this.f3810e.toString());
            throw new i2.o(g5.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        StringBuilder g6 = androidx.activity.d.g("Invalid EnumMap type: ");
        g6.append(this.f3810e.toString());
        throw new i2.o(g6.toString());
    }
}
