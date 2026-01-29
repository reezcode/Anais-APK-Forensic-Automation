package w2;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class u extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final u f5790d = new u();

    public u() {
        super(1, new Class[]{Enum.class});
    }

    @Override // d1.f
    public final Object J(v2.g gVar, Object obj, int i5) {
        if (gVar == null) {
            return obj;
        }
        String str = (String) obj;
        Map map = (Map) gVar.f5690n;
        return c.M(gVar, str, map == null ? null : (Enum) map.get(str), gVar.f5681e.f5662m);
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        return ((q2.d) eVar).e(i5);
    }

    @Override // d1.f, v2.f
    public final Object e(v2.g gVar, Object obj) {
        return ((Enum) obj).name();
    }

    @Override // w2.a, v2.a
    public final Object f(v2.g gVar) {
        HashMap hashMap = new HashMap();
        Enum[] enumArr = (Enum[]) gVar.j().getEnumConstants();
        if (enumArr == null) {
            throw new SQLException("Field " + gVar + " improperly configured as type " + this);
        }
        for (Enum r32 : enumArr) {
            hashMap.put(r32.name(), r32);
        }
        return hashMap;
    }

    @Override // w2.a, v2.a
    public final int n() {
        return 100;
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        return str;
    }
}
