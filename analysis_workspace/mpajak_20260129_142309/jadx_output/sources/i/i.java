package i;

import j.n;
import j.o;
import j.p;
import j.q;
import j.s;
import j.t;
import j.u;
import j.v;
import j.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.sql.DataSource;
import k.n0;
import k.p0;
import kotlin.text.Typography;
import m.f;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes20.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f3226k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f3227l;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f3228m;

    /* renamed from: n, reason: collision with root package name */
    public static i f3229n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f3230o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f3231p;

    /* renamed from: a, reason: collision with root package name */
    public final m.f<Type, s> f3232a = new m.f<>();

    /* renamed from: b, reason: collision with root package name */
    public boolean f3233b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3234c;

    /* renamed from: d, reason: collision with root package name */
    public j.a f3235d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3236e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f3237f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f3238g;

    /* renamed from: h, reason: collision with root package name */
    public int f3239h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3240i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3241j;

    static {
        String d5 = m.e.d("fastjson.parser.deny");
        String[] strArr = null;
        f3226k = (d5 == null || d5.length() <= 0) ? null : d5.split(",");
        f3228m = "true".equals(m.e.d("fastjson.parser.autoTypeSupport"));
        String d6 = m.e.d("fastjson.parser.autoTypeAccept");
        if (d6 != null && d6.length() > 0) {
            strArr = d6.split(",");
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        f3227l = strArr;
        f3229n = new i();
        f3230o = false;
        f3231p = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i() {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.i.<init>():void");
    }

    public static Field d(String str, Map<String, Field> map) {
        Field field = map.get(str);
        if (field == null) {
            field = map.get("_" + str);
        }
        if (field == null) {
            field = map.get("m_" + str);
        }
        if (field != null) {
            return field;
        }
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] - ' ');
            field = map.get(new String(charArray));
        }
        if (str.length() <= 2) {
            return field;
        }
        char charAt2 = str.charAt(1);
        if (str.length() <= 2 || charAt < 'a' || charAt > 'z' || charAt2 < 'A' || charAt2 > 'Z') {
            return field;
        }
        for (Map.Entry<String, Field> entry : map.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return field;
    }

    public static boolean e(Class<?> cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == Date.class || cls == java.sql.Date.class || cls == Time.class || cls == Timestamp.class || cls.isEnum();
    }

    public static void f(Class<?> cls, Map<String, Field> map) {
        for (Field field : cls.getDeclaredFields()) {
            String name = field.getName();
            if (!map.containsKey(name)) {
                map.put(name, field);
            }
        }
        if (cls.getSuperclass() == null || cls.getSuperclass() == Object.class) {
            return;
        }
        f(cls.getSuperclass(), map);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    public final Class<?> a(String str, Class<?> cls) {
        Class<?> cls2;
        Class<?> cls3 = null;
        if (str == null) {
            return null;
        }
        if (str.length() >= this.f3239h) {
            throw new f.d(androidx.activity.d.f("autoType is not support. ", str));
        }
        String replace = str.replace(Typography.dollar, FilenameUtils.EXTENSION_SEPARATOR);
        int i5 = 0;
        if (this.f3236e || cls != null) {
            int i6 = 0;
            cls2 = null;
            while (true) {
                String[] strArr = this.f3238g;
                if (i6 >= strArr.length) {
                    int i7 = 0;
                    while (true) {
                        String[] strArr2 = this.f3237f;
                        if (i7 >= strArr2.length) {
                            break;
                        }
                        if (replace.startsWith(strArr2[i7]) && ((Class) m.j.B.get(str)) == null) {
                            throw new f.d(androidx.activity.d.f("autoType is not support. ", str));
                        }
                        i7++;
                    }
                } else {
                    if (replace.startsWith(strArr[i6]) && (cls2 = m.j.O(str)) != null) {
                        return cls2;
                    }
                    i6++;
                }
            }
        } else {
            cls2 = null;
        }
        if (cls2 == null) {
            cls2 = (Class) m.j.B.get(str);
        }
        if (cls2 == null) {
            m.f<Type, s> fVar = this.f3232a;
            int i8 = 0;
            loop0: while (true) {
                f.a<Type, s>[] aVarArr = fVar.f4097a;
                if (i8 >= aVarArr.length) {
                    break;
                }
                f.a<Type, s> aVar = aVarArr[i8];
                if (aVar != null) {
                    for (f.a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f4101c) {
                        Type type = aVar.f4099a;
                        if (type instanceof Class) {
                            Class<?> cls4 = (Class) type;
                            if (cls4.getName().equals(str)) {
                                cls3 = cls4;
                                break loop0;
                            }
                        }
                    }
                }
                i8++;
            }
        } else {
            cls3 = cls2;
        }
        if (cls3 != null) {
            if (cls == null || cls3 == HashMap.class || cls.isAssignableFrom(cls3)) {
                return cls3;
            }
            throw new f.d(androidx.appcompat.view.a.g(cls, androidx.activity.result.a.f("type not match. ", str, " -> ")));
        }
        if (!this.f3236e) {
            int i9 = 0;
            while (true) {
                String[] strArr3 = this.f3237f;
                if (i9 >= strArr3.length) {
                    while (true) {
                        String[] strArr4 = this.f3238g;
                        if (i5 >= strArr4.length) {
                            break;
                        }
                        if (replace.startsWith(strArr4[i5])) {
                            if (cls3 == null) {
                                cls3 = m.j.O(str);
                            }
                            if (cls == null || !cls.isAssignableFrom(cls3)) {
                                return cls3;
                            }
                            throw new f.d(androidx.appcompat.view.a.g(cls, androidx.activity.result.a.f("type not match. ", str, " -> ")));
                        }
                        i5++;
                    }
                } else {
                    if (replace.startsWith(strArr3[i9])) {
                        throw new f.d(androidx.activity.d.f("autoType is not support. ", str));
                    }
                    i9++;
                }
            }
        }
        if (cls3 == null) {
            cls3 = m.j.O(str);
        }
        if (cls3 != null) {
            if (m.j.v(cls3, g.d.class) != null) {
                return cls3;
            }
            if (ClassLoader.class.isAssignableFrom(cls3) || DataSource.class.isAssignableFrom(cls3)) {
                throw new f.d(androidx.activity.d.f("autoType is not support. ", str));
            }
            if (cls != null) {
                if (cls.isAssignableFrom(cls3)) {
                    return cls3;
                }
                throw new f.d(androidx.appcompat.view.a.g(cls, androidx.activity.result.a.f("type not match. ", str, " -> ")));
            }
            if (m.g.b(cls3, cls3).f4105d != null && this.f3236e) {
                throw new f.d(androidx.activity.d.f("autoType is not support. ", str));
            }
        }
        if (this.f3236e) {
            return cls3;
        }
        throw new f.d(androidx.activity.d.f("autoType is not support. ", str));
    }

    public final s b(Class<?> cls, Type type) {
        s sVar;
        s nVar;
        g.b c5;
        Method method;
        j.a aVar;
        Class<?> mappingTo;
        Type type2 = type;
        s a5 = this.f3232a.a(type2);
        if (a5 != null) {
            return a5;
        }
        if (type2 == null) {
            type2 = cls;
        }
        s a6 = this.f3232a.a(type2);
        if (a6 != null) {
            return a6;
        }
        g.d dVar = (g.d) m.j.v(cls, g.d.class);
        if (dVar != null && (mappingTo = dVar.mappingTo()) != Void.class) {
            return b(mappingTo, mappingTo);
        }
        if ((type2 instanceof WildcardType) || (type2 instanceof TypeVariable) || (type2 instanceof ParameterizedType)) {
            a6 = this.f3232a.a(cls);
        }
        if (a6 != null) {
            return a6;
        }
        String replace = cls.getName().replace(Typography.dollar, FilenameUtils.EXTENSION_SEPARATOR);
        if (replace.startsWith("java.awt.") && k.i.j(cls) && !f3230o) {
            String[] strArr = {"java.awt.Point", "java.awt.Font", "java.awt.Rectangle", "java.awt.Color"};
            for (int i5 = 0; i5 < 4; i5++) {
                try {
                    String str = strArr[i5];
                    if (str.equals(replace)) {
                        m.f<Type, s> fVar = this.f3232a;
                        Class<?> cls2 = Class.forName(str);
                        k.i iVar = k.i.f3702a;
                        fVar.b(cls2, iVar);
                        return iVar;
                    }
                } catch (Throwable unused) {
                    f3230o = true;
                }
            }
            a6 = k.i.f3702a;
        }
        if (!f3231p) {
            try {
                if (replace.startsWith("java.time.")) {
                    String[] strArr2 = {"java.time.LocalDateTime", "java.time.LocalDate", "java.time.LocalTime", "java.time.ZonedDateTime", "java.time.OffsetDateTime", "java.time.OffsetTime", "java.time.ZoneOffset", "java.time.ZoneRegion", "java.time.ZoneId", "java.time.Period", "java.time.Duration", "java.time.Instant"};
                    for (int i6 = 0; i6 < 12; i6++) {
                        String str2 = strArr2[i6];
                        if (str2.equals(replace)) {
                            m.f<Type, s> fVar2 = this.f3232a;
                            Class<?> cls3 = Class.forName(str2);
                            p pVar = p.f3388a;
                            fVar2.b(cls3, pVar);
                            return pVar;
                        }
                    }
                } else if (replace.startsWith("java.util.Optional")) {
                    String[] strArr3 = {"java.util.Optional", "java.util.OptionalDouble", "java.util.OptionalInt", "java.util.OptionalLong"};
                    for (int i7 = 0; i7 < 4; i7++) {
                        String str3 = strArr3[i7];
                        if (str3.equals(replace)) {
                            m.f<Type, s> fVar3 = this.f3232a;
                            Class<?> cls4 = Class.forName(str3);
                            t tVar = t.f3410a;
                            fVar3.b(cls4, tVar);
                            return tVar;
                        }
                    }
                }
            } catch (Throwable unused2) {
                f3231p = true;
            }
        }
        if (replace.equals("java.nio.file.Path")) {
            m.f<Type, s> fVar4 = this.f3232a;
            a6 = n0.f3733b;
            fVar4.b(cls, a6);
        }
        if (cls == Map.Entry.class) {
            m.f<Type, s> fVar5 = this.f3232a;
            a6 = n0.f3733b;
            fVar5.b(cls, a6);
        }
        try {
            for (j.d dVar2 : m.i.a(j.d.class, Thread.currentThread().getContextClassLoader())) {
                Iterator<Type> it = dVar2.a().iterator();
                while (it.hasNext()) {
                    this.f3232a.b(it.next(), dVar2);
                }
            }
        } catch (Exception unused3) {
        }
        if (a6 == null) {
            a6 = this.f3232a.a(type2);
        }
        if (a6 != null) {
            return a6;
        }
        if (cls.isEnum()) {
            g.d dVar3 = (g.d) cls.getAnnotation(g.d.class);
            if (dVar3 != null) {
                try {
                    s sVar2 = (s) dVar3.deserializer().newInstance();
                    this.f3232a.b(cls, sVar2);
                    return sVar2;
                } catch (Throwable unused4) {
                }
            }
            sVar = new j.g(cls);
        } else if (cls.isArray()) {
            sVar = p0.f3738a;
        } else if (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) {
            sVar = k.s.f3742a;
        } else if (Map.class.isAssignableFrom(cls)) {
            sVar = q.f3408a;
        } else if (Throwable.class.isAssignableFrom(cls)) {
            sVar = new z(this, cls);
        } else if (u.class.isAssignableFrom(cls)) {
            sVar = new v(cls);
        } else {
            boolean z4 = this.f3233b & (!this.f3240i);
            if (z4) {
                g.d dVar4 = (g.d) m.j.v(cls, g.d.class);
                if (dVar4 != null) {
                    Class<?> deserializer = dVar4.deserializer();
                    if (deserializer != Void.class) {
                        try {
                            Object newInstance = deserializer.newInstance();
                            if (newInstance instanceof s) {
                                sVar = (s) newInstance;
                            }
                        } catch (Throwable unused5) {
                        }
                    }
                    z4 = dVar4.asm();
                }
                if (z4) {
                    Class<?> e5 = m.g.e(cls, dVar4);
                    if (e5 == null) {
                        e5 = cls;
                    }
                    while (true) {
                        if (!Modifier.isPublic(e5.getModifiers())) {
                            z4 = false;
                            break;
                        }
                        e5 = e5.getSuperclass();
                        if (e5 == Object.class || e5 == null) {
                            break;
                        }
                    }
                }
            }
            if (cls.getTypeParameters().length != 0) {
                z4 = false;
            }
            if (z4 && (aVar = this.f3235d) != null && aVar.f3360a.b(cls)) {
                z4 = false;
            }
            if (z4) {
                z4 = m.b.a(cls.getSimpleName());
            }
            if (z4) {
                if (cls.isInterface()) {
                    z4 = false;
                }
                m.g b5 = m.g.b(cls, type2);
                if (z4 && b5.f4109h.length > 200) {
                    z4 = false;
                }
                Constructor<?> constructor = b5.f4104c;
                if (z4 && constructor == null && !cls.isInterface()) {
                    z4 = false;
                }
                for (m.c cVar : b5.f4109h) {
                    if (!cVar.f4068i) {
                        Class<?> cls5 = cVar.f4065f;
                        if (Modifier.isPublic(cls5.getModifiers()) && ((!cls5.isMemberClass() || Modifier.isStatic(cls5.getModifiers())) && ((cVar.f() == null || m.b.a(cVar.f().getName())) && (((c5 = cVar.c()) == null || (m.b.a(c5.name()) && c5.format().length() == 0 && c5.deserializeUsing() == Void.class && !c5.unwrapped())) && (((method = cVar.f4062c) == null || method.getParameterTypes().length <= 1) && (!cls5.isEnum() || (c(cls5) instanceof j.g))))))) {
                        }
                    }
                    z4 = false;
                    break;
                }
            }
            if ((z4 && cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) ? false : z4) {
                m.g b6 = m.g.b(cls, type2);
                try {
                    nVar = this.f3235d.p(this, b6);
                } catch (f.d unused6) {
                    nVar = new n(this, b6);
                } catch (NoSuchMethodException unused7) {
                    sVar = new n(this, cls, type2);
                } catch (Exception e6) {
                    throw new f.d(androidx.appcompat.view.a.g(cls, androidx.activity.d.g("create asm deserializer error, ")), e6);
                }
                sVar = nVar;
            } else {
                sVar = new n(this, cls, type2);
            }
        }
        this.f3232a.b(type2, sVar);
        return sVar;
    }

    public final s c(Type type) {
        s a5 = this.f3232a.a(type);
        if (a5 != null) {
            return a5;
        }
        if (type instanceof Class) {
            return b((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            return rawType instanceof Class ? b((Class) rawType, type) : c(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return c(upperBounds[0]);
            }
        }
        return o.f3387a;
    }
}
