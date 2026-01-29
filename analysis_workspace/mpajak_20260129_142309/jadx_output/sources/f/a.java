package f;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.TreeMap;
import k.a1;
import k.b1;
import k.e0;
import k.g0;
import k.h0;
import k.q0;
import k.x0;
import k.y0;
import k.z;

/* loaded from: classes25.dex */
public abstract class a implements k, c {

    /* renamed from: b, reason: collision with root package name */
    public static TimeZone f2678b = TimeZone.getDefault();

    /* renamed from: c, reason: collision with root package name */
    public static Locale f2679c = Locale.getDefault();

    /* renamed from: d, reason: collision with root package name */
    public static String f2680d = "@type";

    /* renamed from: e, reason: collision with root package name */
    public static final y0[] f2681e = new y0[0];

    /* renamed from: f, reason: collision with root package name */
    public static String f2682f = "yyyy-MM-dd HH:mm:ss";

    /* renamed from: g, reason: collision with root package name */
    public static int f2683g = (((((((i.b.AutoCloseSource.f3178b | 0) | i.b.InternFieldNames.f3178b) | i.b.UseBigDecimal.f3178b) | i.b.AllowUnQuotedFieldNames.f3178b) | i.b.AllowSingleQuotes.f3178b) | i.b.AllowArbitraryCommas.f3178b) | i.b.SortFeidFastMatch.f3178b) | i.b.IgnoreNotMatch.f3178b;

    /* renamed from: h, reason: collision with root package name */
    public static int f2684h;

    static {
        int i5 = 0 | b1.QuoteFieldNames.f3675b | b1.SkipTransientField.f3675b | b1.WriteEnumUsingName.f3675b | b1.SortField.f3675b;
        String d5 = m.e.d("fastjson.serializerFeatures.MapSortField");
        int i6 = b1.MapSortField.f3675b;
        if ("true".equals(d5)) {
            i5 |= i6;
        } else if ("false".equals(d5)) {
            i5 &= ~i6;
        }
        f2684h = i5;
        new ThreadLocal();
        new ThreadLocal();
    }

    public static Object s(String str) {
        int i5 = f2683g;
        i.i iVar = i.i.f3229n;
        if (str == null) {
            return null;
        }
        i.a aVar = new i.a(str, new i.f(str, i5), iVar);
        Object w4 = aVar.w(null);
        aVar.q(w4);
        aVar.close();
        return w4;
    }

    public static <T> List<T> t(String str, Class<T> cls) {
        ArrayList arrayList = null;
        if (str == null) {
            return null;
        }
        i.a aVar = new i.a(str, new i.f(str, f2683g), i.i.f3229n);
        i.c cVar = aVar.f3146g;
        int q4 = cVar.q();
        if (q4 == 8) {
            cVar.y();
        } else if (q4 != 20 || !cVar.n()) {
            ArrayList arrayList2 = new ArrayList();
            aVar.x(cls, arrayList2, null);
            aVar.q(arrayList2);
            arrayList = arrayList2;
        }
        aVar.close();
        return arrayList;
    }

    public static e u(String str) {
        Object s4 = s(str);
        if (s4 instanceof e) {
            return (e) s4;
        }
        try {
            return (e) w(s4);
        } catch (RuntimeException e5) {
            throw new d("can not cast to JSONObject.", e5);
        }
    }

    public static <T> T v(String str, Class<T> cls) {
        i.i iVar = i.i.f3229n;
        int i5 = f2683g;
        if (str == null) {
            return null;
        }
        i.a aVar = new i.a(str, new i.f(str, i5), iVar);
        T t4 = (T) aVar.A(cls, null);
        aVar.q(t4);
        aVar.close();
        return t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [f.b] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [f.e] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5, types: [f.e] */
    /* JADX WARN: Type inference failed for: r1v7, types: [f.b] */
    public static Object w(Object obj) {
        Object bVar;
        x0 x0Var = x0.f3759f;
        Object obj2 = 0;
        if (obj != null) {
            if (obj instanceof a) {
                return obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                int size = map.size();
                bVar = new e((Map<String, Object>) (map instanceof LinkedHashMap ? new LinkedHashMap(size) : map instanceof TreeMap ? new TreeMap() : new HashMap(size)));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    boolean z4 = m.j.f4122a;
                    bVar.put(key == null ? null : key.toString(), w(entry.getValue()));
                }
            } else {
                if (!(obj instanceof Collection)) {
                    if (!(obj instanceof e0)) {
                        Class<?> cls = obj.getClass();
                        if (cls.isEnum()) {
                            return ((Enum) obj).name();
                        }
                        int i5 = 0;
                        if (cls.isArray()) {
                            int length = Array.getLength(obj);
                            obj2 = new b(length);
                            while (i5 < length) {
                                obj2.add(w(Array.get(obj, i5)));
                                i5++;
                            }
                        } else {
                            if (i.i.e(cls)) {
                                return obj;
                            }
                            q0 c5 = x0Var.c(cls);
                            if (c5 instanceof h0) {
                                h0 h0Var = (h0) c5;
                                obj2 = new e();
                                try {
                                    Objects.requireNonNull(h0Var);
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(h0Var.f3698j.length);
                                    z[] zVarArr = h0Var.f3698j;
                                    int length2 = zVarArr.length;
                                    while (i5 < length2) {
                                        z zVar = zVarArr[i5];
                                        linkedHashMap.put(zVar.f3772b.f4061b, zVar.a(obj));
                                        i5++;
                                    }
                                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                        obj2.put((String) entry2.getKey(), w(entry2.getValue()));
                                    }
                                } catch (Exception e5) {
                                    throw new d("toJSON error", e5);
                                }
                            }
                        }
                    }
                    return s(x(obj));
                }
                Collection collection = (Collection) obj;
                bVar = new b(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    bVar.add(w(it.next()));
                }
            }
            return bVar;
        }
        return obj2;
    }

    public static String x(Object obj) {
        y0[] y0VarArr = f2681e;
        x0 x0Var = x0.f3759f;
        a1 a1Var = new a1(f2684h, new b1[0]);
        try {
            g0 g0Var = new g0(a1Var, x0Var);
            if (y0VarArr != null) {
                for (y0 y0Var : y0VarArr) {
                    g0Var.c(y0Var);
                }
            }
            g0Var.q(obj);
            return a1Var.toString();
        } finally {
            a1Var.close();
        }
    }

    @Override // f.c
    public final String l() {
        a1 a1Var = new a1();
        try {
            new g0(a1Var, x0.f3759f).q(this);
            return a1Var.toString();
        } finally {
            a1Var.close();
        }
    }

    @Override // f.k
    public final void r(Appendable appendable) {
        a1 a1Var = new a1();
        try {
            try {
                new g0(a1Var, x0.f3759f).q(this);
                appendable.append(a1Var.toString());
            } catch (IOException e5) {
                throw new d(e5.getMessage(), e5);
            }
        } finally {
            a1Var.close();
        }
    }

    public final String toString() {
        return l();
    }
}
