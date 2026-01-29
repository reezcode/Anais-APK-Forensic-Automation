package m;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import f.m;
import j.n;
import j.s;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import k.b1;
import k.w0;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;

/* loaded from: classes20.dex */
public final class j {
    public static volatile boolean A = false;
    public static Class<?> C = null;

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4122a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4123b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4124c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4125d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f4126e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f4127f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f4128g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4129h;

    /* renamed from: i, reason: collision with root package name */
    public static Class<?> f4130i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f4131j;

    /* renamed from: k, reason: collision with root package name */
    public static Class<? extends Annotation> f4132k;

    /* renamed from: l, reason: collision with root package name */
    public static Class<? extends Annotation> f4133l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f4134m;

    /* renamed from: n, reason: collision with root package name */
    public static Class<? extends Annotation> f4135n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f4136o;

    /* renamed from: p, reason: collision with root package name */
    public static Method f4137p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f4138q;

    /* renamed from: r, reason: collision with root package name */
    public static volatile Class f4139r;

    /* renamed from: s, reason: collision with root package name */
    public static volatile boolean f4140s;

    /* renamed from: t, reason: collision with root package name */
    public static volatile boolean f4141t;

    /* renamed from: u, reason: collision with root package name */
    public static volatile Constructor f4142u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile Method f4143v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile Method f4144w;

    /* renamed from: x, reason: collision with root package name */
    public static volatile Method f4145x;

    /* renamed from: y, reason: collision with root package name */
    public static volatile boolean f4146y;

    /* renamed from: z, reason: collision with root package name */
    public static volatile Map<Class, String[]> f4147z;
    public static ConcurrentMap<String, Class<?>> B = new ConcurrentHashMap(16, 0.75f, 1);
    public static boolean D = false;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r4v63, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    static {
        try {
            f4122a = "true".equals(e.d("fastjson.compatibleWithJavaBean"));
            f4123b = "true".equals(e.d("fastjson.compatibleWithFieldName"));
        } catch (Throwable unused) {
        }
        B.put("byte", Byte.TYPE);
        B.put("short", Short.TYPE);
        B.put("int", Integer.TYPE);
        B.put("long", Long.TYPE);
        B.put(TypedValues.Custom.S_FLOAT, Float.TYPE);
        B.put("double", Double.TYPE);
        B.put(TypedValues.Custom.S_BOOLEAN, Boolean.TYPE);
        B.put("char", Character.TYPE);
        B.put("[byte", byte[].class);
        B.put("[short", short[].class);
        B.put("[int", int[].class);
        B.put("[long", long[].class);
        B.put("[float", float[].class);
        B.put("[double", double[].class);
        B.put("[boolean", boolean[].class);
        B.put("[char", char[].class);
        B.put("[B", byte[].class);
        B.put("[S", short[].class);
        B.put("[I", int[].class);
        B.put("[J", long[].class);
        B.put("[F", float[].class);
        B.put("[D", double[].class);
        B.put("[C", char[].class);
        B.put("[Z", boolean[].class);
        Class[] clsArr = {Object.class, Cloneable.class, O("java.lang.AutoCloseable"), Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, HashMap.class, Hashtable.class, TreeMap.class, IdentityHashMap.class, WeakHashMap.class, LinkedHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, TimeUnit.class, ConcurrentHashMap.class, O("java.util.concurrent.ConcurrentSkipListMap"), O("java.util.concurrent.ConcurrentSkipListSet"), AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, Time.class, java.sql.Date.class, Timestamp.class, SimpleDateFormat.class, f.e.class};
        for (int i5 = 0; i5 < 58; i5++) {
            Class cls = clsArr[i5];
            if (cls != null) {
                B.put(cls.getName(), cls);
            }
        }
        String[] strArr = {"java.awt.Rectangle", "java.awt.Point", "java.awt.Font", "java.awt.Color"};
        for (int i6 = 0; i6 < 4; i6++) {
            Class O = O(strArr[i6]);
            if (O == null) {
                break;
            }
            B.put(O.getName(), O);
        }
        String[] strArr2 = {"org.springframework.util.LinkedMultiValueMap", "org.springframework.util.LinkedCaseInsensitiveMap", "org.springframework.remoting.support.RemoteInvocation", "org.springframework.remoting.support.RemoteInvocationResult", "org.springframework.security.web.savedrequest.DefaultSavedRequest", "org.springframework.security.web.savedrequest.SavedCookie", "org.springframework.security.web.csrf.DefaultCsrfToken", "org.springframework.security.web.authentication.WebAuthenticationDetails", "org.springframework.security.core.context.SecurityContextImpl", "org.springframework.security.authentication.UsernamePasswordAuthenticationToken", "org.springframework.security.core.authority.SimpleGrantedAuthority", "org.springframework.security.core.userdetails.User"};
        for (int i7 = 0; i7 < 12; i7++) {
            Class O2 = O(strArr2[i7]);
            if (O2 == null) {
                return;
            }
            B.put(O2.getName(), O2);
        }
    }

    public static List<c> A(Class<?> cls, boolean z4, Map<String, c> map) {
        ArrayList arrayList = new ArrayList();
        g.d dVar = (g.d) v(cls, g.d.class);
        String[] orders = dVar != null ? dVar.orders() : null;
        if (orders == null || orders.length <= 0) {
            Iterator<c> it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            if (z4) {
                Collections.sort(arrayList);
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
            for (c cVar : map.values()) {
                linkedHashMap.put(cVar.f4061b, cVar);
            }
            for (String str : orders) {
                c cVar2 = (c) linkedHashMap.get(str);
                if (cVar2 != null) {
                    arrayList.add(cVar2);
                    linkedHashMap.remove(str);
                }
            }
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                arrayList.add((c) it2.next());
            }
        }
        return arrayList;
    }

    public static Type B(Type type) {
        return (!(type instanceof ParameterizedType) && (type instanceof Class)) ? B(((Class) type).getGenericSuperclass()) : type;
    }

    public static Constructor C(Constructor[] constructorArr) {
        Constructor constructor = null;
        for (Constructor constructor2 : constructorArr) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if ((parameterTypes.length <= 0 || !parameterTypes[parameterTypes.length - 1].getName().equals("kotlin.jvm.internal.DefaultConstructorMarker")) && (constructor == null || constructor.getParameterTypes().length < parameterTypes.length)) {
                constructor = constructor2;
            }
        }
        return constructor;
    }

    public static String[] D(Class cls) {
        if (f4142u == null && !f4141t) {
            try {
                f4142u = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getConstructor(Class.class);
            } catch (Throwable unused) {
                f4141t = true;
            }
        }
        if (f4142u == null) {
            return null;
        }
        if (f4143v == null && !f4141t) {
            try {
                f4143v = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getMethod("getConstructors", new Class[0]);
            } catch (Throwable unused2) {
                f4141t = true;
            }
        }
        if (f4144w == null && !f4141t) {
            try {
                f4144w = KFunction.class.getMethod("getParameters", new Class[0]);
            } catch (Throwable unused3) {
                f4141t = true;
            }
        }
        if (f4145x == null && !f4141t) {
            try {
                f4145x = KParameter.class.getMethod("getName", new Class[0]);
            } catch (Throwable unused4) {
                f4141t = true;
            }
        }
        if (f4146y) {
            return null;
        }
        try {
            Iterator it = ((Iterable) f4143v.invoke(f4142u.newInstance(cls), new Object[0])).iterator();
            Object obj = null;
            while (it.hasNext()) {
                obj = it.next();
                it.hasNext();
            }
            List list = (List) f4144w.invoke(obj, new Object[0]);
            String[] strArr = new String[list.size()];
            for (int i5 = 0; i5 < list.size(); i5++) {
                strArr[i5] = (String) f4145x.invoke(list.get(i5), new Object[0]);
            }
            return strArr;
        } catch (Throwable th) {
            th.printStackTrace();
            f4146y = true;
            return null;
        }
    }

    public static String E(Map<String, Field> map, String str, String str2, int i5) {
        if (!f4123b || map.containsKey(str2)) {
            return str2;
        }
        String substring = str.substring(i5);
        return map.containsKey(substring) ? substring : str2;
    }

    public static Class<?> F(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return F(((ParameterizedType) type).getRawType());
        }
        throw new f.d("TODO");
    }

    public static g.b G(Class<?> cls, Method method) {
        boolean z4;
        g.b bVar;
        boolean z5;
        g.b bVar2;
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces.length > 0) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> cls2 : interfaces) {
                for (Method method2 : cls2.getMethods()) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    if (parameterTypes2.length == parameterTypes.length && method2.getName().equals(method.getName())) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= parameterTypes.length) {
                                z5 = true;
                                break;
                            }
                            if (!parameterTypes2[i5].equals(parameterTypes[i5])) {
                                z5 = false;
                                break;
                            }
                            i5++;
                        }
                        if (z5 && (bVar2 = (g.b) method2.getAnnotation(g.b.class)) != null) {
                            return bVar2;
                        }
                    }
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && Modifier.isAbstract(superclass.getModifiers())) {
            Class<?>[] parameterTypes3 = method.getParameterTypes();
            for (Method method3 : superclass.getMethods()) {
                Class<?>[] parameterTypes4 = method3.getParameterTypes();
                if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= parameterTypes3.length) {
                            z4 = true;
                            break;
                        }
                        if (!parameterTypes4[i6].equals(parameterTypes3[i6])) {
                            z4 = false;
                            break;
                        }
                        i6++;
                    }
                    if (z4 && (bVar = (g.b) method3.getAnnotation(g.b.class)) != null) {
                        return bVar;
                    }
                }
            }
        }
        return null;
    }

    public static boolean H(Method method) {
        if (method == null) {
            return false;
        }
        if (f4135n == null && !f4136o) {
            try {
                f4135n = Class.forName("javax.persistence.ManyToMany");
            } catch (Throwable unused) {
                f4136o = true;
            }
        }
        if (f4135n == null) {
            return false;
        }
        return method.isAnnotationPresent(f4133l) || method.isAnnotationPresent(f4135n);
    }

    public static boolean I(Method method) {
        if (method == null) {
            return false;
        }
        if (f4133l == null && !f4134m) {
            try {
                f4133l = Class.forName("javax.persistence.OneToMany");
            } catch (Throwable unused) {
                f4134m = true;
            }
        }
        Class<? extends Annotation> cls = f4133l;
        if (cls == null) {
            return false;
        }
        return method.isAnnotationPresent(cls);
    }

    public static boolean J(Type type) {
        Type genericSuperclass;
        if (type instanceof ParameterizedType) {
            return true;
        }
        if (!(type instanceof Class) || (genericSuperclass = ((Class) type).getGenericSuperclass()) == Object.class) {
            return false;
        }
        return J(genericSuperclass);
    }

    public static boolean K(Class<?> cls, String str) {
        g.d dVar = (g.d) v(cls, g.d.class);
        if (dVar != null) {
            String[] includes = dVar.includes();
            if (includes.length > 0) {
                for (String str2 : includes) {
                    if (str.equals(str2)) {
                        return false;
                    }
                }
                return true;
            }
            for (String str3 : dVar.ignores()) {
                if (str.equals(str3)) {
                    return true;
                }
            }
        }
        return (cls.getSuperclass() == Object.class || cls.getSuperclass() == null || !K(cls.getSuperclass(), str)) ? false : true;
    }

    public static boolean L(Class cls) {
        if (f4139r == null && !f4140s) {
            try {
                f4139r = Class.forName("kotlin.Metadata");
            } catch (Throwable unused) {
                f4140s = true;
            }
        }
        if (f4139r == null) {
            return false;
        }
        return cls.isAnnotationPresent(f4139r);
    }

    public static boolean M(String str) {
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt == '+' || charAt == '-') {
                if (i5 != 0) {
                    return false;
                }
            } else if (charAt < '0' || charAt > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean N(Class<?> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            String name = cls2.getName();
            if (name.equals("net.sf.cglib.proxy.Factory") || name.equals("org.springframework.cglib.proxy.Factory") || name.equals("javassist.util.proxy.ProxyObject") || name.equals("org.apache.ibatis.javassist.util.proxy.ProxyObject")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    public static Class O(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Class<?> cls = (Class) B.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.charAt(0) == '[') {
            return Array.newInstance((Class<?>) O(str.substring(1)), 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(";")) {
            return O(str.substring(1, str.length() - 1));
        }
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                cls = contextClassLoader.loadClass(str);
                B.put(str, cls);
                return cls;
            }
        } catch (Throwable unused) {
        }
        try {
            cls = Class.forName(str);
            B.put(str, cls);
            return cls;
        } catch (Throwable unused2) {
            return cls;
        }
    }

    public static void P(AccessibleObject accessibleObject) {
        if (f4124c && !accessibleObject.isAccessible()) {
            try {
                accessibleObject.setAccessible(true);
            } catch (AccessControlException unused) {
                f4124c = false;
            }
        }
    }

    public static Locale Q(String str) {
        String[] split = str.split("_");
        return split.length == 1 ? new Locale(split[0]) : split.length == 2 ? new Locale(split[0], split[1]) : new Locale(split[0], split[1], split[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static w0 a(Class cls, boolean z4) {
        String[] strArr;
        String str;
        String str2;
        int i5;
        List arrayList;
        g.d dVar = (g.d) v(cls, g.d.class);
        if (dVar != null) {
            strArr = dVar.orders();
            str = dVar.typeName();
            if (str.length() == 0) {
                str = null;
            }
            m naming = dVar.naming();
            if (naming == null || naming == m.CamelCase) {
                naming = null;
            }
            i5 = b1.b(dVar.serialzeFeatures());
            Class superclass = cls.getSuperclass();
            String str3 = null;
            while (superclass != null && superclass != Object.class) {
                g.d dVar2 = (g.d) v(superclass, g.d.class);
                if (dVar2 == null) {
                    break;
                }
                str3 = dVar2.typeKey();
                if (str3.length() != 0) {
                    break;
                }
                superclass = superclass.getSuperclass();
                str3 = str3;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i6 = 0;
            String str4 = str3;
            while (i6 < length) {
                g.d dVar3 = (g.d) v(interfaces[i6], g.d.class);
                if (dVar3 != null) {
                    str4 = dVar3.typeKey();
                    if (str4.length() != 0) {
                        break;
                    }
                }
                i6++;
                str4 = str4;
            }
            m mVar = naming;
            str2 = (str4 == 0 || str4.length() != 0) ? str4 : null;
            r0 = mVar;
        } else {
            strArr = null;
            str = null;
            str2 = 0;
            i5 = 0;
        }
        HashMap hashMap = new HashMap();
        i.i.f(cls, hashMap);
        List r4 = z4 ? r(cls, false, r0) : q(cls, hashMap, false, r0);
        c[] cVarArr = new c[r4.size()];
        r4.toArray(cVarArr);
        if (strArr == null || strArr.length == 0) {
            arrayList = new ArrayList(r4);
            Collections.sort(arrayList);
        } else {
            arrayList = z4 ? r(cls, true, r0) : q(cls, hashMap, true, r0);
        }
        c[] cVarArr2 = new c[arrayList.size()];
        arrayList.toArray(cVarArr2);
        if (Arrays.equals(cVarArr2, cVarArr)) {
            cVarArr2 = cVarArr;
        }
        return new w0(cls, dVar, str, str2, i5, cVarArr, cVarArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T b(java.lang.Object r11, java.lang.Class<T> r12, i.i r13) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.j.b(java.lang.Object, java.lang.Class, i.i):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.HashMap] */
    public static <T> T c(Object obj, Type type, i.i iVar) {
        if (obj == 0) {
            return null;
        }
        if (type instanceof Class) {
            return (T) b(obj, (Class) type, iVar);
        }
        if (!(type instanceof ParameterizedType)) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                    return null;
                }
            }
            if (type instanceof TypeVariable) {
                return obj;
            }
            throw new f.d("can not cast to : " + type);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == List.class || rawType == ArrayList.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                ?? r02 = (T) ((rawType == Set.class || rawType == HashSet.class) ? new HashSet() : rawType == TreeSet.class ? new TreeSet() : new ArrayList());
                Iterator<T> it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    r02.add(c(it.next(), type2, iVar));
                }
                return r02;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                ?? r03 = (T) new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    r03.put(c(entry.getKey(), type3, iVar), c(entry.getValue(), type4, iVar));
                }
                return r03;
            }
        }
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            return null;
        }
        if (parameterizedType.getActualTypeArguments().length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return (T) c(obj, rawType, iVar);
        }
        throw new f.d("can not cast to : " + parameterizedType);
    }

    public static BigDecimal d(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0) {
            return null;
        }
        if ((obj instanceof Map) && ((Map) obj).size() == 0) {
            return null;
        }
        return new BigDecimal(obj2);
    }

    public static BigInteger e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2) || "NULL".equals(obj2)) {
            return null;
        }
        return new BigInteger(obj2);
    }

    public static Boolean f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return Boolean.FALSE;
            }
            if ("Y".equalsIgnoreCase(str) || ExifInterface.GPS_DIRECTION_TRUE.equals(str)) {
                return Boolean.TRUE;
            }
            if ("F".equalsIgnoreCase(str) || "N".equals(str)) {
                return Boolean.FALSE;
            }
        }
        throw new f.d(androidx.appcompat.widget.a.i("can not cast to boolean, value : ", obj));
    }

    public static Byte g(Object obj) {
        byte parseByte;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            parseByte = ((Number) obj).byteValue();
        } else {
            if (!(obj instanceof String)) {
                throw new f.d(androidx.appcompat.widget.a.i("can not cast to byte, value : ", obj));
            }
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            parseByte = Byte.parseByte(str);
        }
        return Byte.valueOf(parseByte);
    }

    public static Character h(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return (Character) obj;
        }
        if (!(obj instanceof String)) {
            throw new f.d(androidx.appcompat.widget.a.i("can not cast to char, value : ", obj));
        }
        String str = (String) obj;
        if (str.length() == 0) {
            return null;
        }
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new f.d(androidx.appcompat.widget.a.i("can not cast to char, value : ", obj));
    }

    public static Date i(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        long j5 = -1;
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            i.f fVar = new i.f(str);
            try {
                if (fVar.S0(false)) {
                    return fVar.f3190k.getTime();
                }
                fVar.close();
                if (str.startsWith("/Date(") && str.endsWith(")/")) {
                    str = str.substring(6, str.length() - 2);
                }
                if (str.indexOf(45) != -1) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat((str.length() == f.a.f2682f.length() || (str.length() == 22 && f.a.f2682f.equals("yyyyMMddHHmmssSSSZ"))) ? f.a.f2682f : str.length() == 10 ? "yyyy-MM-dd" : str.length() == 19 ? "yyyy-MM-dd HH:mm:ss" : (str.length() == 29 && str.charAt(26) == ':' && str.charAt(28) == '0') ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : "yyyy-MM-dd HH:mm:ss.SSS", f.a.f2679c);
                    simpleDateFormat.setTimeZone(f.a.f2678b);
                    try {
                        return simpleDateFormat.parse(str);
                    } catch (ParseException unused) {
                        throw new f.d(androidx.activity.d.f("can not cast to Date, value : ", str));
                    }
                }
                if (str.length() == 0) {
                    return null;
                }
                j5 = Long.parseLong(str);
            } finally {
                fVar.close();
            }
        }
        if (j5 >= 0) {
            return new Date(j5);
        }
        Class<?> cls = obj.getClass();
        if ("oracle.sql.TIMESTAMP".equals(cls.getName())) {
            if (f4126e == null && !f4125d) {
                try {
                    f4126e = cls.getMethod("toJdbc", new Class[0]);
                } catch (NoSuchMethodException unused2) {
                } catch (Throwable th) {
                    f4125d = true;
                    throw th;
                }
                f4125d = true;
            }
            try {
                return (Date) f4126e.invoke(obj, new Object[0]);
            } catch (Exception e5) {
                throw new f.d("can not cast oracle.sql.TIMESTAMP to Date", e5);
            }
        }
        if (!"oracle.sql.DATE".equals(cls.getName())) {
            throw new f.d(androidx.appcompat.widget.a.i("can not cast to Date, value : ", obj));
        }
        if (f4128g == null && !f4127f) {
            try {
                f4128g = cls.getMethod("toJdbc", new Class[0]);
            } catch (NoSuchMethodException unused3) {
            } catch (Throwable th2) {
                f4127f = true;
                throw th2;
            }
            f4127f = true;
        }
        try {
            return (Date) f4128g.invoke(obj, new Object[0]);
        } catch (Exception e6) {
            throw new f.d("can not cast oracle.sql.DATE to Date", e6);
        }
    }

    public static Double j(Object obj) {
        double parseDouble;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            parseDouble = ((Number) obj).doubleValue();
        } else {
            if (!(obj instanceof String)) {
                throw new f.d(androidx.appcompat.widget.a.i("can not cast to double, value : ", obj));
            }
            String obj2 = obj.toString();
            if (obj2.length() == 0 || "null".equals(obj2) || "NULL".equals(obj2)) {
                return null;
            }
            if (obj2.indexOf(44) != 0) {
                obj2 = obj2.replaceAll(",", "");
            }
            parseDouble = Double.parseDouble(obj2);
        }
        return Double.valueOf(parseDouble);
    }

    public static Float k(Object obj) {
        float parseFloat;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            parseFloat = ((Number) obj).floatValue();
        } else {
            if (!(obj instanceof String)) {
                throw new f.d(androidx.appcompat.widget.a.i("can not cast to float, value : ", obj));
            }
            String obj2 = obj.toString();
            if (obj2.length() == 0 || "null".equals(obj2) || "NULL".equals(obj2)) {
                return null;
            }
            if (obj2.indexOf(44) != 0) {
                obj2 = obj2.replaceAll(",", "");
            }
            parseFloat = Float.parseFloat(obj2);
        }
        return Float.valueOf(parseFloat);
    }

    public static Integer l(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if (str.indexOf(44) != 0) {
                str = str.replaceAll(",", "");
            }
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
                Iterator it = map.values().iterator();
                it.next();
                return l(it.next());
            }
        }
        throw new f.d(androidx.appcompat.widget.a.i("can not cast to int, value : ", obj));
    }

    public static <T> T m(Map<String, Object> map, Class<T> cls, i.i iVar) {
        int i5 = 0;
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get("className");
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get("fileName");
                Number number = (Number) map.get("lineNumber");
                if (number != null) {
                    i5 = number.intValue();
                }
                return (T) new StackTraceElement(str, str2, str3, i5);
            }
            Object obj = map.get(f.a.f2680d);
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (iVar == null) {
                    iVar = i.i.f3229n;
                }
                Class<?> a5 = iVar.a(str4, null);
                if (a5 == null) {
                    throw new ClassNotFoundException(str4 + " not found");
                }
                if (!a5.equals(cls)) {
                    return (T) m(map, a5, iVar);
                }
            }
            if (cls.isInterface()) {
                f.e eVar = map instanceof f.e ? (f.e) map : new f.e(map);
                if (iVar == null) {
                    iVar = i.i.f3229n;
                }
                return iVar.f3232a.a(cls) != null ? (T) f.a.v(f.a.x(eVar), cls) : (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, eVar);
            }
            if (cls == Locale.class) {
                Object obj2 = map.get("language");
                Object obj3 = map.get("country");
                if (obj2 instanceof String) {
                    String str5 = (String) obj2;
                    if (obj3 instanceof String) {
                        return (T) new Locale(str5, (String) obj3);
                    }
                    if (obj3 == null) {
                        return (T) new Locale(str5);
                    }
                }
            }
            if (cls == String.class && (map instanceof f.e)) {
                return (T) map.toString();
            }
            if (cls == LinkedHashMap.class && (map instanceof f.e)) {
                T t4 = (T) ((f.e) map).f2688i;
                if (t4 instanceof LinkedHashMap) {
                    return t4;
                }
                new LinkedHashMap().putAll(t4);
            }
            if (iVar == null) {
                iVar = i.i.f3229n;
            }
            s c5 = iVar.c(cls);
            n nVar = c5 instanceof n ? (n) c5 : null;
            if (nVar != null) {
                return (T) nVar.d(map, iVar);
            }
            throw new f.d("can not get javaBeanDeserializer. " + cls.getName());
        } catch (Exception e5) {
            throw new f.d(e5.getMessage(), e5);
        }
    }

    public static Long n(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if (str.indexOf(44) != 0) {
                str = str.replaceAll(",", "");
            }
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                i.f fVar = new i.f(str);
                Calendar calendar = fVar.S0(false) ? fVar.f3190k : null;
                fVar.close();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
                Iterator it = map.values().iterator();
                it.next();
                return n(it.next());
            }
        }
        throw new f.d(androidx.appcompat.widget.a.i("can not cast to long, value : ", obj));
    }

    public static Short o(Object obj) {
        short parseShort;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            parseShort = ((Number) obj).shortValue();
        } else {
            if (!(obj instanceof String)) {
                throw new f.d(androidx.appcompat.widget.a.i("can not cast to short, value : ", obj));
            }
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            parseShort = Short.parseShort(str);
        }
        return Short.valueOf(parseShort);
    }

    public static void p(Class cls, m mVar, Map map, Field[] fieldArr) {
        String str;
        int i5;
        int i6;
        int i7;
        for (Field field : fieldArr) {
            if (!Modifier.isStatic(field.getModifiers())) {
                g.b bVar = (g.b) field.getAnnotation(g.b.class);
                String name = field.getName();
                if (bVar == null) {
                    str = null;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                } else if (bVar.serialize()) {
                    int ordinal = bVar.ordinal();
                    int b5 = b1.b(bVar.serialzeFeatures());
                    int a5 = i.b.a(bVar.parseFeatures());
                    if (bVar.name().length() != 0) {
                        name = bVar.name();
                    }
                    str = bVar.label().length() != 0 ? bVar.label() : null;
                    i5 = ordinal;
                    i6 = b5;
                    i7 = a5;
                }
                if (mVar != null) {
                    name = mVar.a(name);
                }
                String str2 = name;
                if (!map.containsKey(str2)) {
                    map.put(str2, new c(str2, null, field, cls, null, i5, i6, i7, null, bVar, str));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010b, code lost:
    
        if (r1 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.util.HashMap, java.util.Map<java.lang.Class, java.lang.String[]>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List q(java.lang.Class r38, java.util.Map r39, boolean r40, f.m r41) {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.j.q(java.lang.Class, java.util.Map, boolean, f.m):java.util.List");
    }

    public static List r(Class cls, boolean z4, m mVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            p(cls2, mVar, linkedHashMap, cls2.getDeclaredFields());
        }
        return A(cls, z4, linkedHashMap);
    }

    public static String s(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static long t(String str) {
        long j5 = -3750763034362895579L;
        for (int i5 = 0; i5 < str.length(); i5++) {
            j5 = (j5 ^ str.charAt(i5)) * 1099511628211L;
        }
        return j5;
    }

    public static long u(String str) {
        long j5 = -3750763034362895579L;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt != '_' && charAt != '-') {
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = (char) (charAt + ' ');
                }
                j5 = (j5 ^ charAt) * 1099511628211L;
            }
        }
        return j5;
    }

    public static <A extends Annotation> A v(Class<?> cls, Class<A> cls2) {
        A a5 = (A) cls.getAnnotation(cls2);
        if (a5 != null) {
            return a5;
        }
        if (cls.getAnnotations().length <= 0) {
            return null;
        }
        for (Annotation annotation : cls.getAnnotations()) {
            A a6 = (A) annotation.annotationType().getAnnotation(cls2);
            if (a6 != null) {
                return a6;
            }
        }
        return null;
    }

    public static Class<?> w(Type type) {
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return w(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            return (Class) ((TypeVariable) type).getBounds()[0];
        }
        if (!(type instanceof WildcardType)) {
            return Object.class;
        }
        Type[] upperBounds = ((WildcardType) type).getUpperBounds();
        return upperBounds.length == 1 ? w(upperBounds[0]) : Object.class;
    }

    public static Class<?> x(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return Object.class;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
            if (upperBounds.length == 1) {
                type2 = upperBounds[0];
            }
        }
        if (!(type2 instanceof Class)) {
            throw new f.d("can not create ASMParser");
        }
        Class<?> cls = (Class) type2;
        if (Modifier.isPublic(cls.getModifiers())) {
            return cls;
        }
        throw new f.d("can not create ASMParser");
    }

    public static Type y(Type type) {
        Type type2;
        if (type instanceof ParameterizedType) {
            type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                if (upperBounds.length == 1) {
                    type2 = upperBounds[0];
                }
            }
        } else {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (!cls.getName().startsWith("java.")) {
                    type2 = y(cls.getGenericSuperclass());
                }
            }
            type2 = null;
        }
        return type2 == null ? Object.class : type2;
    }

    public static Field z(Class<?> cls, String str, Field[] fieldArr) {
        char charAt;
        char charAt2;
        for (Field field : fieldArr) {
            String name = field.getName();
            if (str.equals(name)) {
                return field;
            }
            if (str.length() > 2 && (charAt = str.charAt(0)) >= 'a' && charAt <= 'z' && (charAt2 = str.charAt(1)) >= 'A' && charAt2 <= 'Z' && str.equalsIgnoreCase(name)) {
                return field;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        return z(superclass, str, superclass.getDeclaredFields());
    }
}
