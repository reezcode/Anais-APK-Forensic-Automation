package v2;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import w2.a0;
import w2.b;
import w2.c0;
import w2.d0;
import w2.g0;
import w2.h0;
import w2.i;
import w2.j;
import w2.j0;
import w2.m;
import w2.n;
import w2.o;
import w2.p;
import w2.q;
import w2.r;
import w2.t;
import w2.u;
import w2.v;
import w2.y;
import w2.z;

/* loaded from: classes10.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    STRING(h0.f5771d),
    /* JADX INFO: Fake field, exist only in values array */
    LONG_STRING(new h0() { // from class: w2.a0
        {
            Class[] clsArr = new Class[0];
        }

        @Override // w2.a, v2.a
        public final Class<?> h() {
            return String.class;
        }

        @Override // w2.h0, w2.a, v2.a
        public final int n() {
            return 0;
        }

        @Override // w2.a, v2.a
        public final boolean r() {
            return false;
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    STRING_BYTES(new w2.a() { // from class: w2.g0
        {
            Class[] clsArr = new Class[0];
        }

        @Override // d1.f
        public final Object J(v2.g gVar, Object obj, int i5) {
            String str;
            byte[] bArr = (byte[]) obj;
            if (gVar == null || (str = gVar.f5681e.f5665p) == null) {
                str = "Unicode";
            }
            try {
                return new String(bArr, str);
            } catch (UnsupportedEncodingException e5) {
                throw d1.c.e("Could not convert string with charset name: " + str, e5);
            }
        }

        @Override // v2.f
        public final Object d(c3.e eVar, int i5) {
            return ((q2.d) eVar).c(i5);
        }

        @Override // d1.f, v2.f
        public final Object e(v2.g gVar, Object obj) {
            String str;
            String str2 = (String) obj;
            if (gVar == null || (str = gVar.f5681e.f5665p) == null) {
                str = "Unicode";
            }
            try {
                return str2.getBytes(str);
            } catch (UnsupportedEncodingException e5) {
                throw d1.c.e("Could not convert string with charset name: " + str, e5);
            }
        }

        @Override // w2.a, v2.a
        public final Class<?> h() {
            return String.class;
        }

        @Override // w2.a, v2.a
        public final boolean p() {
            return true;
        }

        @Override // w2.a, v2.a
        public final boolean r() {
            return false;
        }

        @Override // v2.f
        public final Object x(v2.g gVar, String str) {
            throw new SQLException("String-bytes type cannot have default values");
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN(w2.h.f5770e),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN_OBJ(w2.g.f5768d),
    /* JADX INFO: Fake field, exist only in values array */
    DATE(q.f5786e),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_LONG(new w2.b() { // from class: w2.n
        {
            Class[] clsArr = new Class[0];
        }

        @Override // d1.f
        public final Object J(v2.g gVar, Object obj, int i5) {
            return new Date(((Long) obj).longValue());
        }

        @Override // v2.f
        public final Object d(c3.e eVar, int i5) {
            return Long.valueOf(((q2.d) eVar).d(i5));
        }

        @Override // d1.f, v2.f
        public final Object e(v2.g gVar, Object obj) {
            return Long.valueOf(((Date) obj).getTime());
        }

        @Override // w2.a, v2.a
        public final Class<?> h() {
            return Date.class;
        }

        @Override // w2.a, v2.a
        public final boolean j() {
            return false;
        }

        @Override // v2.f
        public final Object x(v2.g gVar, String str) {
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException e5) {
                throw d1.c.e("Problems with field " + gVar + " parsing default date-long value: " + str, e5);
            }
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    DATE_STRING(o.f5780e),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR(new m() { // from class: w2.l
        {
            new Class[1][0] = Character.TYPE;
        }

        @Override // d1.f, v2.f
        public final Object e(v2.g gVar, Object obj) {
            Character ch = (Character) obj;
            if (ch == null || ch.charValue() == 0) {
                return null;
            }
            return ch;
        }

        @Override // w2.a, v2.a
        public final boolean t() {
            return true;
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR_OBJ(m.f5778d),
    /* JADX INFO: Fake field, exist only in values array */
    BYTE(new j() { // from class: w2.k
        {
            new Class[1][0] = Byte.TYPE;
        }

        @Override // w2.a, v2.a
        public final boolean t() {
            return true;
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    BYTE_ARRAY(i.f5772d),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE(j.f5774d),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_STAMP(new d0() { // from class: w2.e0
        {
            new Class[1][0] = Short.TYPE;
        }

        @Override // w2.a, v2.a
        public final boolean t() {
            return true;
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    SQL_DATE(d0.f5762d),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE(new y() { // from class: w2.x
        {
            new Class[1][0] = Integer.TYPE;
        }

        @Override // w2.a, v2.a
        public final boolean t() {
            return true;
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_STAMP(y.f5794d),
    /* JADX INFO: Fake field, exist only in values array */
    SQL_DATE(new z() { // from class: w2.b0
        {
            new Class[1][0] = Long.TYPE;
        }

        @Override // w2.a, v2.a
        public final boolean t() {
            return true;
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE(z.f5795d),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_STAMP(new v() { // from class: w2.w
        {
            new Class[1][0] = Float.TYPE;
        }

        @Override // w2.a, v2.a
        public final boolean t() {
            return true;
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    SQL_DATE(v.f5791d),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE(new r() { // from class: w2.s
        {
            new Class[1][0] = Double.TYPE;
        }

        @Override // w2.a, v2.a
        public final boolean t() {
            return true;
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_STAMP(r.f5787d),
    /* JADX INFO: Fake field, exist only in values array */
    SQL_DATE(c0.f5760d),
    ENUM_STRING(u.f5790d),
    ENUM_INTEGER(new w2.c() { // from class: w2.t
        {
            Class[] clsArr = new Class[0];
        }

        @Override // d1.f
        public final Object J(v2.g gVar, Object obj, int i5) {
            if (gVar == null) {
                return obj;
            }
            Integer num = (Integer) obj;
            Map map = (Map) gVar.f5690n;
            return c.M(gVar, num, map == null ? null : (Enum) map.get(num), gVar.f5681e.f5662m);
        }

        @Override // v2.f
        public final Object d(c3.e eVar, int i5) {
            return Integer.valueOf(((q2.d) eVar).f4744a.getInt(i5));
        }

        @Override // d1.f, v2.f
        public final Object e(v2.g gVar, Object obj) {
            return Integer.valueOf(((Enum) obj).ordinal());
        }

        @Override // w2.a, v2.a
        public final Object f(v2.g gVar) {
            HashMap hashMap = new HashMap();
            Enum[] enumArr = (Enum[]) gVar.j().getEnumConstants();
            if (enumArr == null) {
                throw new SQLException("Field " + gVar + " improperly configured as type " + this);
            }
            for (Enum r32 : enumArr) {
                hashMap.put(Integer.valueOf(r32.ordinal()), r32);
            }
            return hashMap;
        }

        @Override // w2.a, v2.a
        public final Class<?> h() {
            return Integer.TYPE;
        }

        @Override // w2.a, v2.a
        public final boolean j() {
            return false;
        }

        @Override // v2.f
        public final Object x(v2.g gVar, String str) {
            return Integer.valueOf(Integer.parseInt(str));
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_STAMP(j0.f5775d),
    /* JADX INFO: Fake field, exist only in values array */
    SQL_DATE(new w2.a() { // from class: w2.f
        {
            new Class[1][0] = BigInteger.class;
        }

        @Override // d1.f
        public final Object J(v2.g gVar, Object obj, int i5) {
            try {
                return new BigInteger((String) obj);
            } catch (IllegalArgumentException e5) {
                throw d1.c.e("Problems with column " + i5 + " parsing BigInteger string '" + obj + "'", e5);
            }
        }

        @Override // v2.f
        public final Object d(c3.e eVar, int i5) {
            return ((q2.d) eVar).e(i5);
        }

        @Override // d1.f, v2.f
        public final Object e(v2.g gVar, Object obj) {
            return ((BigInteger) obj).toString();
        }

        @Override // w2.a, v2.a
        public final int n() {
            return 255;
        }

        @Override // w2.a, v2.a
        public final boolean r() {
            return false;
        }

        @Override // v2.f
        public final Object x(v2.g gVar, String str) {
            try {
                return new BigInteger(str);
            } catch (IllegalArgumentException e5) {
                throw d1.c.e("Problems with field " + gVar + " parsing default BigInteger string '" + str + "'", e5);
            }
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_STAMP(w2.e.f5763d),
    /* JADX INFO: Fake field, exist only in values array */
    SQL_DATE(w2.d.f5761d),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_STAMP(new w2.a() { // from class: w2.p

        /* renamed from: e, reason: collision with root package name */
        public static Class<?> f5782e = null;

        /* renamed from: f, reason: collision with root package name */
        public static Method f5783f = null;

        /* renamed from: g, reason: collision with root package name */
        public static Constructor<?> f5784g = null;

        /* renamed from: h, reason: collision with root package name */
        public static final String[] f5785h = {"org.joda.time.DateTime"};

        {
            Class[] clsArr = new Class[0];
        }

        @Override // d1.f
        public final Object J(v2.g gVar, Object obj, int i5) {
            try {
                if (f5784g == null) {
                    f5784g = M().getConstructor(Long.TYPE);
                }
                return f5784g.newInstance((Long) obj);
            } catch (Exception e5) {
                throw d1.c.e("Could not use reflection to construct a Joda DateTime", e5);
            }
        }

        public final Class<?> M() {
            if (f5782e == null) {
                f5782e = Class.forName("org.joda.time.DateTime");
            }
            return f5782e;
        }

        @Override // w2.a, v2.a
        public final String[] b() {
            return f5785h;
        }

        @Override // v2.f
        public final Object d(c3.e eVar, int i5) {
            return Long.valueOf(((q2.d) eVar).d(i5));
        }

        @Override // d1.f, v2.f
        public final Object e(v2.g gVar, Object obj) {
            try {
                if (f5783f == null) {
                    f5783f = M().getMethod("getMillis", new Class[0]);
                }
                Method method = f5783f;
                if (obj == null) {
                    return null;
                }
                return method.invoke(obj, new Object[0]);
            } catch (Exception e5) {
                throw d1.c.e("Could not use reflection to get millis from Joda DateTime: " + obj, e5);
            }
        }

        @Override // w2.a, v2.a
        public final Class<?> h() {
            try {
                return M();
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        @Override // w2.a, v2.a
        public final boolean j() {
            return false;
        }

        @Override // w2.a, v2.a
        public final boolean r() {
            return false;
        }

        @Override // v2.f
        public final Object x(v2.g gVar, String str) {
            return Long.valueOf(Long.parseLong(str));
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    SQL_DATE(new q() { // from class: w2.f0

        /* renamed from: g, reason: collision with root package name */
        public static final b.a f5767g = new b.a("yyyy-MM-dd");

        {
            new Class[1][0] = java.sql.Date.class;
        }

        @Override // w2.q, d1.f
        public final Object J(v2.g gVar, Object obj, int i5) {
            return new java.sql.Date(((Timestamp) obj).getTime());
        }

        @Override // w2.q
        public final b.a N() {
            return f5767g;
        }

        @Override // w2.q, d1.f, v2.f
        public final Object e(v2.g gVar, Object obj) {
            return new Timestamp(((java.sql.Date) obj).getTime());
        }

        @Override // w2.b, w2.a, v2.a
        public final boolean m(Field field) {
            return field.getType() == java.sql.Date.class;
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_STAMP(new q() { // from class: w2.i0
        {
            new Class[1][0] = Timestamp.class;
        }

        @Override // w2.q, d1.f
        public final Object J(v2.g gVar, Object obj, int i5) {
            return obj;
        }

        @Override // w2.q, d1.f, v2.f
        public final Object e(v2.g gVar, Object obj) {
            return obj;
        }

        @Override // w2.b, w2.a, v2.a
        public final boolean m(Field field) {
            return field.getType() == Timestamp.class;
        }

        @Override // w2.b, w2.a, v2.a
        public final Object o(Object obj) {
            long currentTimeMillis = System.currentTimeMillis();
            if (obj != null && currentTimeMillis == ((Timestamp) obj).getTime()) {
                return new Timestamp(currentTimeMillis + 1);
            }
            return new Timestamp(currentTimeMillis);
        }
    }),
    UNKNOWN(null);


    /* renamed from: b, reason: collision with root package name */
    public final a f5649b;

    static {
        a0 a0Var = new h0() { // from class: w2.a0
            {
                Class[] clsArr = new Class[0];
            }

            @Override // w2.a, v2.a
            public final Class<?> h() {
                return String.class;
            }

            @Override // w2.h0, w2.a, v2.a
            public final int n() {
                return 0;
            }

            @Override // w2.a, v2.a
            public final boolean r() {
                return false;
            }
        };
        g0 g0Var = new w2.a() { // from class: w2.g0
            {
                Class[] clsArr = new Class[0];
            }

            @Override // d1.f
            public final Object J(v2.g gVar, Object obj, int i5) {
                String str;
                byte[] bArr = (byte[]) obj;
                if (gVar == null || (str = gVar.f5681e.f5665p) == null) {
                    str = "Unicode";
                }
                try {
                    return new String(bArr, str);
                } catch (UnsupportedEncodingException e5) {
                    throw d1.c.e("Could not convert string with charset name: " + str, e5);
                }
            }

            @Override // v2.f
            public final Object d(c3.e eVar, int i5) {
                return ((q2.d) eVar).c(i5);
            }

            @Override // d1.f, v2.f
            public final Object e(v2.g gVar, Object obj) {
                String str;
                String str2 = (String) obj;
                if (gVar == null || (str = gVar.f5681e.f5665p) == null) {
                    str = "Unicode";
                }
                try {
                    return str2.getBytes(str);
                } catch (UnsupportedEncodingException e5) {
                    throw d1.c.e("Could not convert string with charset name: " + str, e5);
                }
            }

            @Override // w2.a, v2.a
            public final Class<?> h() {
                return String.class;
            }

            @Override // w2.a, v2.a
            public final boolean p() {
                return true;
            }

            @Override // w2.a, v2.a
            public final boolean r() {
                return false;
            }

            @Override // v2.f
            public final Object x(v2.g gVar, String str) {
                throw new SQLException("String-bytes type cannot have default values");
            }
        };
        n nVar = new w2.b() { // from class: w2.n
            {
                Class[] clsArr = new Class[0];
            }

            @Override // d1.f
            public final Object J(v2.g gVar, Object obj, int i5) {
                return new Date(((Long) obj).longValue());
            }

            @Override // v2.f
            public final Object d(c3.e eVar, int i5) {
                return Long.valueOf(((q2.d) eVar).d(i5));
            }

            @Override // d1.f, v2.f
            public final Object e(v2.g gVar, Object obj) {
                return Long.valueOf(((Date) obj).getTime());
            }

            @Override // w2.a, v2.a
            public final Class<?> h() {
                return Date.class;
            }

            @Override // w2.a, v2.a
            public final boolean j() {
                return false;
            }

            @Override // v2.f
            public final Object x(v2.g gVar, String str) {
                try {
                    return Long.valueOf(Long.parseLong(str));
                } catch (NumberFormatException e5) {
                    throw d1.c.e("Problems with field " + gVar + " parsing default date-long value: " + str, e5);
                }
            }
        };
        o oVar = o.f5780e;
        i iVar = i.f5772d;
        c0 c0Var = c0.f5760d;
        t tVar = new w2.c() { // from class: w2.t
            {
                Class[] clsArr = new Class[0];
            }

            @Override // d1.f
            public final Object J(v2.g gVar, Object obj, int i5) {
                if (gVar == null) {
                    return obj;
                }
                Integer num = (Integer) obj;
                Map map = (Map) gVar.f5690n;
                return c.M(gVar, num, map == null ? null : (Enum) map.get(num), gVar.f5681e.f5662m);
            }

            @Override // v2.f
            public final Object d(c3.e eVar, int i5) {
                return Integer.valueOf(((q2.d) eVar).f4744a.getInt(i5));
            }

            @Override // d1.f, v2.f
            public final Object e(v2.g gVar, Object obj) {
                return Integer.valueOf(((Enum) obj).ordinal());
            }

            @Override // w2.a, v2.a
            public final Object f(v2.g gVar) {
                HashMap hashMap = new HashMap();
                Enum[] enumArr = (Enum[]) gVar.j().getEnumConstants();
                if (enumArr == null) {
                    throw new SQLException("Field " + gVar + " improperly configured as type " + this);
                }
                for (Enum r32 : enumArr) {
                    hashMap.put(Integer.valueOf(r32.ordinal()), r32);
                }
                return hashMap;
            }

            @Override // w2.a, v2.a
            public final Class<?> h() {
                return Integer.TYPE;
            }

            @Override // w2.a, v2.a
            public final boolean j() {
                return false;
            }

            @Override // v2.f
            public final Object x(v2.g gVar, String str) {
                return Integer.valueOf(Integer.parseInt(str));
            }
        };
        w2.d dVar = w2.d.f5761d;
        p pVar = new w2.a() { // from class: w2.p

            /* renamed from: e, reason: collision with root package name */
            public static Class<?> f5782e = null;

            /* renamed from: f, reason: collision with root package name */
            public static Method f5783f = null;

            /* renamed from: g, reason: collision with root package name */
            public static Constructor<?> f5784g = null;

            /* renamed from: h, reason: collision with root package name */
            public static final String[] f5785h = {"org.joda.time.DateTime"};

            {
                Class[] clsArr = new Class[0];
            }

            @Override // d1.f
            public final Object J(v2.g gVar, Object obj, int i5) {
                try {
                    if (f5784g == null) {
                        f5784g = M().getConstructor(Long.TYPE);
                    }
                    return f5784g.newInstance((Long) obj);
                } catch (Exception e5) {
                    throw d1.c.e("Could not use reflection to construct a Joda DateTime", e5);
                }
            }

            public final Class<?> M() {
                if (f5782e == null) {
                    f5782e = Class.forName("org.joda.time.DateTime");
                }
                return f5782e;
            }

            @Override // w2.a, v2.a
            public final String[] b() {
                return f5785h;
            }

            @Override // v2.f
            public final Object d(c3.e eVar, int i5) {
                return Long.valueOf(((q2.d) eVar).d(i5));
            }

            @Override // d1.f, v2.f
            public final Object e(v2.g gVar, Object obj) {
                try {
                    if (f5783f == null) {
                        f5783f = M().getMethod("getMillis", new Class[0]);
                    }
                    Method method = f5783f;
                    if (obj == null) {
                        return null;
                    }
                    return method.invoke(obj, new Object[0]);
                } catch (Exception e5) {
                    throw d1.c.e("Could not use reflection to get millis from Joda DateTime: " + obj, e5);
                }
            }

            @Override // w2.a, v2.a
            public final Class<?> h() {
                try {
                    return M();
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            }

            @Override // w2.a, v2.a
            public final boolean j() {
                return false;
            }

            @Override // w2.a, v2.a
            public final boolean r() {
                return false;
            }

            @Override // v2.f
            public final Object x(v2.g gVar, String str) {
                return Long.valueOf(Long.parseLong(str));
            }
        };
    }

    c(a aVar) {
        this.f5649b = aVar;
    }
}
