package j;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes12.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public static q f3408a = new q();

    public final Map<Object, Object> b(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return new ConcurrentHashMap();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            return EnumMap.class.equals(rawType) ? new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]) : b(rawType);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new f.d("unsupport type " + type);
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e5) {
            throw new f.d("unsupport type " + type, e5);
        }
    }

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        if (type == f.e.class && aVar.f3154o == null) {
            return (T) ((f.e) aVar.H(new f.e(aVar.f3146g.A(i.b.OrderedField)), null));
        }
        i.c cVar = aVar.f3146g;
        if (cVar.q() == 8) {
            cVar.Q(16);
            return null;
        }
        Map<Object, Object> b5 = b(type);
        i.h hVar = aVar.f3147h;
        try {
            aVar.M(hVar, b5, obj);
            return (T) d(aVar, type, obj, b5);
        } finally {
            aVar.P(hVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02a5 A[Catch: all -> 0x0355, TRY_LEAVE, TryCatch #0 {all -> 0x0355, blocks: (B:119:0x0248, B:179:0x024e, B:121:0x0253, B:123:0x0259, B:125:0x025f, B:128:0x0267, B:130:0x0270, B:132:0x027c, B:133:0x028e, B:134:0x029c, B:136:0x02a5, B:139:0x02ac, B:140:0x02b3, B:141:0x027f, B:144:0x0288, B:148:0x0291, B:149:0x02b4, B:150:0x02d2, B:151:0x02d3, B:153:0x02d9, B:155:0x02df, B:157:0x02eb, B:159:0x02f3, B:163:0x02ff, B:161:0x0307, B:166:0x030e, B:168:0x031a, B:171:0x0331, B:176:0x033a, B:177:0x0354), top: B:118:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ac A[Catch: all -> 0x0355, TRY_ENTER, TryCatch #0 {all -> 0x0355, blocks: (B:119:0x0248, B:179:0x024e, B:121:0x0253, B:123:0x0259, B:125:0x025f, B:128:0x0267, B:130:0x0270, B:132:0x027c, B:133:0x028e, B:134:0x029c, B:136:0x02a5, B:139:0x02ac, B:140:0x02b3, B:141:0x027f, B:144:0x0288, B:148:0x0291, B:149:0x02b4, B:150:0x02d2, B:151:0x02d3, B:153:0x02d9, B:155:0x02df, B:157:0x02eb, B:159:0x02f3, B:163:0x02ff, B:161:0x0307, B:166:0x030e, B:168:0x031a, B:171:0x0331, B:176:0x033a, B:177:0x0354), top: B:118:0x0248 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(i.a r17, java.lang.reflect.Type r18, java.lang.Object r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.q.d(i.a, java.lang.reflect.Type, java.lang.Object, java.util.Map):java.lang.Object");
    }

    @Override // j.s
    public final int e() {
        return 12;
    }
}
