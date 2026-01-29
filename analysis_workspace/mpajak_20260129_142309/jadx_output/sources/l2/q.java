package l2;

import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import k2.p;

/* loaded from: classes18.dex */
public final class q {
    public static final i2.z<BigInteger> A;
    public static final i2.z<k2.o> B;
    public static final l2.r C;
    public static final i2.z<StringBuilder> D;
    public static final l2.r E;
    public static final i2.z<StringBuffer> F;
    public static final l2.r G;
    public static final i2.z<URL> H;
    public static final l2.r I;
    public static final i2.z<URI> J;
    public static final l2.r K;
    public static final i2.z<InetAddress> L;
    public static final l2.u M;
    public static final i2.z<UUID> N;
    public static final l2.r O;
    public static final i2.z<Currency> P;
    public static final l2.r Q;
    public static final i2.z<Calendar> R;
    public static final l2.t S;
    public static final i2.z<Locale> T;
    public static final l2.r U;
    public static final i2.z<i2.n> V;
    public static final l2.u W;
    public static final u X;

    /* renamed from: a, reason: collision with root package name */
    public static final i2.z<Class> f4010a;

    /* renamed from: b, reason: collision with root package name */
    public static final l2.r f4011b;

    /* renamed from: c, reason: collision with root package name */
    public static final i2.z<BitSet> f4012c;

    /* renamed from: d, reason: collision with root package name */
    public static final l2.r f4013d;

    /* renamed from: e, reason: collision with root package name */
    public static final i2.z<Boolean> f4014e;

    /* renamed from: f, reason: collision with root package name */
    public static final i2.z<Boolean> f4015f;

    /* renamed from: g, reason: collision with root package name */
    public static final l2.s f4016g;

    /* renamed from: h, reason: collision with root package name */
    public static final i2.z<Number> f4017h;

    /* renamed from: i, reason: collision with root package name */
    public static final l2.s f4018i;

    /* renamed from: j, reason: collision with root package name */
    public static final i2.z<Number> f4019j;

    /* renamed from: k, reason: collision with root package name */
    public static final l2.s f4020k;

    /* renamed from: l, reason: collision with root package name */
    public static final i2.z<Number> f4021l;

    /* renamed from: m, reason: collision with root package name */
    public static final l2.s f4022m;

    /* renamed from: n, reason: collision with root package name */
    public static final i2.z<AtomicInteger> f4023n;

    /* renamed from: o, reason: collision with root package name */
    public static final l2.r f4024o;

    /* renamed from: p, reason: collision with root package name */
    public static final i2.z<AtomicBoolean> f4025p;

    /* renamed from: q, reason: collision with root package name */
    public static final l2.r f4026q;

    /* renamed from: r, reason: collision with root package name */
    public static final i2.z<AtomicIntegerArray> f4027r;

    /* renamed from: s, reason: collision with root package name */
    public static final l2.r f4028s;

    /* renamed from: t, reason: collision with root package name */
    public static final i2.z<Number> f4029t;

    /* renamed from: u, reason: collision with root package name */
    public static final i2.z<Number> f4030u;

    /* renamed from: v, reason: collision with root package name */
    public static final i2.z<Number> f4031v;

    /* renamed from: w, reason: collision with root package name */
    public static final i2.z<Character> f4032w;

    /* renamed from: x, reason: collision with root package name */
    public static final l2.s f4033x;

    /* renamed from: y, reason: collision with root package name */
    public static final i2.z<String> f4034y;

    /* renamed from: z, reason: collision with root package name */
    public static final i2.z<BigDecimal> f4035z;

    /* loaded from: classes21.dex */
    public class a extends i2.z<AtomicIntegerArray> {
        @Override // i2.z
        public final AtomicIntegerArray a(p2.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.r()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.z()));
                } catch (NumberFormatException e5) {
                    throw new i2.u(e5);
                }
            }
            aVar.f();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i5 = 0; i5 < size; i5++) {
                atomicIntegerArray.set(i5, ((Integer) arrayList.get(i5)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // i2.z
        public final void b(p2.b bVar, AtomicIntegerArray atomicIntegerArray) {
            bVar.b();
            int length = atomicIntegerArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                bVar.y(r6.get(i5));
            }
            bVar.f();
        }
    }

    /* loaded from: classes5.dex */
    public class a0 extends i2.z<Number> {
        @Override // i2.z
        public final Number a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            try {
                return Integer.valueOf(aVar.z());
            } catch (NumberFormatException e5) {
                throw new i2.u(e5);
            }
        }

        @Override // i2.z
        public final void b(p2.b bVar, Number number) {
            bVar.A(number);
        }
    }

    /* loaded from: classes11.dex */
    public class b extends i2.z<Number> {
        @Override // i2.z
        public final Number a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            try {
                return Long.valueOf(aVar.A());
            } catch (NumberFormatException e5) {
                throw new i2.u(e5);
            }
        }

        @Override // i2.z
        public final void b(p2.b bVar, Number number) {
            bVar.A(number);
        }
    }

    /* loaded from: classes3.dex */
    public class b0 extends i2.z<AtomicInteger> {
        @Override // i2.z
        public final AtomicInteger a(p2.a aVar) {
            try {
                return new AtomicInteger(aVar.z());
            } catch (NumberFormatException e5) {
                throw new i2.u(e5);
            }
        }

        @Override // i2.z
        public final void b(p2.b bVar, AtomicInteger atomicInteger) {
            bVar.y(atomicInteger.get());
        }
    }

    /* loaded from: classes15.dex */
    public class c extends i2.z<Number> {
        @Override // i2.z
        public final Number a(p2.a aVar) {
            if (aVar.N() != 9) {
                return Float.valueOf((float) aVar.y());
            }
            aVar.I();
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, Number number) {
            bVar.A(number);
        }
    }

    /* loaded from: classes12.dex */
    public class c0 extends i2.z<AtomicBoolean> {
        @Override // i2.z
        public final AtomicBoolean a(p2.a aVar) {
            return new AtomicBoolean(aVar.x());
        }

        @Override // i2.z
        public final void b(p2.b bVar, AtomicBoolean atomicBoolean) {
            bVar.H(atomicBoolean.get());
        }
    }

    /* loaded from: classes10.dex */
    public class d extends i2.z<Number> {
        @Override // i2.z
        public final Number a(p2.a aVar) {
            if (aVar.N() != 9) {
                return Double.valueOf(aVar.y());
            }
            aVar.I();
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, Number number) {
            bVar.A(number);
        }
    }

    /* loaded from: classes11.dex */
    public static final class d0<T extends Enum<T>> extends i2.z<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, T> f4036a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map<T, String> f4037b = new HashMap();

        /* loaded from: classes13.dex */
        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f4038a;

            public a(Class cls) {
                this.f4038a = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.f4038a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public d0(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String name = r4.name();
                    j2.b bVar = (j2.b) field.getAnnotation(j2.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.f4036a.put(str, r4);
                        }
                    }
                    this.f4036a.put(name, r4);
                    this.f4037b.put(r4, name);
                }
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            }
        }

        @Override // i2.z
        public final Object a(p2.a aVar) {
            if (aVar.N() != 9) {
                return (Enum) this.f4036a.get(aVar.K());
            }
            aVar.I();
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, Object obj) {
            Enum r32 = (Enum) obj;
            bVar.E(r32 == null ? null : (String) this.f4037b.get(r32));
        }
    }

    /* loaded from: classes15.dex */
    public class e extends i2.z<Character> {
        @Override // i2.z
        public final Character a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            String K = aVar.K();
            if (K.length() == 1) {
                return Character.valueOf(K.charAt(0));
            }
            StringBuilder f5 = androidx.activity.result.a.f("Expecting character, got: ", K, "; at ");
            f5.append(aVar.q());
            throw new i2.u(f5.toString());
        }

        @Override // i2.z
        public final void b(p2.b bVar, Character ch) {
            Character ch2 = ch;
            bVar.E(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* loaded from: classes22.dex */
    public class f extends i2.z<String> {
        @Override // i2.z
        public final String a(p2.a aVar) {
            int N = aVar.N();
            if (N != 9) {
                return N == 8 ? Boolean.toString(aVar.x()) : aVar.K();
            }
            aVar.I();
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, String str) {
            bVar.E(str);
        }
    }

    /* loaded from: classes4.dex */
    public class g extends i2.z<BigDecimal> {
        @Override // i2.z
        public final BigDecimal a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            String K = aVar.K();
            try {
                return new BigDecimal(K);
            } catch (NumberFormatException e5) {
                StringBuilder f5 = androidx.activity.result.a.f("Failed parsing '", K, "' as BigDecimal; at path ");
                f5.append(aVar.q());
                throw new i2.u(f5.toString(), e5);
            }
        }

        @Override // i2.z
        public final void b(p2.b bVar, BigDecimal bigDecimal) {
            bVar.A(bigDecimal);
        }
    }

    /* loaded from: classes10.dex */
    public class h extends i2.z<BigInteger> {
        @Override // i2.z
        public final BigInteger a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            String K = aVar.K();
            try {
                return new BigInteger(K);
            } catch (NumberFormatException e5) {
                StringBuilder f5 = androidx.activity.result.a.f("Failed parsing '", K, "' as BigInteger; at path ");
                f5.append(aVar.q());
                throw new i2.u(f5.toString(), e5);
            }
        }

        @Override // i2.z
        public final void b(p2.b bVar, BigInteger bigInteger) {
            bVar.A(bigInteger);
        }
    }

    /* loaded from: classes3.dex */
    public class i extends i2.z<k2.o> {
        @Override // i2.z
        public final k2.o a(p2.a aVar) {
            if (aVar.N() != 9) {
                return new k2.o(aVar.K());
            }
            aVar.I();
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, k2.o oVar) {
            bVar.A(oVar);
        }
    }

    /* loaded from: classes23.dex */
    public class j extends i2.z<StringBuilder> {
        @Override // i2.z
        public final StringBuilder a(p2.a aVar) {
            if (aVar.N() != 9) {
                return new StringBuilder(aVar.K());
            }
            aVar.I();
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            bVar.E(sb2 == null ? null : sb2.toString());
        }
    }

    /* loaded from: classes19.dex */
    public class k extends i2.z<Class> {
        @Override // i2.z
        public final Class a(p2.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // i2.z
        public final void b(p2.b bVar, Class cls) {
            StringBuilder g5 = androidx.activity.d.g("Attempted to serialize java.lang.Class: ");
            g5.append(cls.getName());
            g5.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(g5.toString());
        }
    }

    /* loaded from: classes22.dex */
    public class l extends i2.z<StringBuffer> {
        @Override // i2.z
        public final StringBuffer a(p2.a aVar) {
            if (aVar.N() != 9) {
                return new StringBuffer(aVar.K());
            }
            aVar.I();
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, StringBuffer stringBuffer) {
            StringBuffer stringBuffer2 = stringBuffer;
            bVar.E(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    /* loaded from: classes21.dex */
    public class m extends i2.z<URL> {
        @Override // i2.z
        public final URL a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
            } else {
                String K = aVar.K();
                if (!"null".equals(K)) {
                    return new URL(K);
                }
            }
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, URL url) {
            URL url2 = url;
            bVar.E(url2 == null ? null : url2.toExternalForm());
        }
    }

    /* loaded from: classes22.dex */
    public class n extends i2.z<URI> {
        @Override // i2.z
        public final URI a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
            } else {
                try {
                    String K = aVar.K();
                    if (!"null".equals(K)) {
                        return new URI(K);
                    }
                } catch (URISyntaxException e5) {
                    throw new i2.o(e5);
                }
            }
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, URI uri) {
            URI uri2 = uri;
            bVar.E(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* loaded from: classes4.dex */
    public class o extends i2.z<InetAddress> {
        @Override // i2.z
        public final InetAddress a(p2.a aVar) {
            if (aVar.N() != 9) {
                return InetAddress.getByName(aVar.K());
            }
            aVar.I();
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, InetAddress inetAddress) {
            InetAddress inetAddress2 = inetAddress;
            bVar.E(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    /* loaded from: classes8.dex */
    public class p extends i2.z<UUID> {
        @Override // i2.z
        public final UUID a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            String K = aVar.K();
            try {
                return UUID.fromString(K);
            } catch (IllegalArgumentException e5) {
                StringBuilder f5 = androidx.activity.result.a.f("Failed parsing '", K, "' as UUID; at path ");
                f5.append(aVar.q());
                throw new i2.u(f5.toString(), e5);
            }
        }

        @Override // i2.z
        public final void b(p2.b bVar, UUID uuid) {
            UUID uuid2 = uuid;
            bVar.E(uuid2 == null ? null : uuid2.toString());
        }
    }

    /* renamed from: l2.q$q, reason: collision with other inner class name */
    /* loaded from: classes21.dex */
    public class C0046q extends i2.z<Currency> {
        @Override // i2.z
        public final Currency a(p2.a aVar) {
            String K = aVar.K();
            try {
                return Currency.getInstance(K);
            } catch (IllegalArgumentException e5) {
                StringBuilder f5 = androidx.activity.result.a.f("Failed parsing '", K, "' as Currency; at path ");
                f5.append(aVar.q());
                throw new i2.u(f5.toString(), e5);
            }
        }

        @Override // i2.z
        public final void b(p2.b bVar, Currency currency) {
            bVar.E(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes8.dex */
    public class r extends i2.z<Calendar> {
        @Override // i2.z
        public final Calendar a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            aVar.b();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (aVar.N() != 4) {
                String E = aVar.E();
                int z4 = aVar.z();
                if ("year".equals(E)) {
                    i5 = z4;
                } else if ("month".equals(E)) {
                    i6 = z4;
                } else if ("dayOfMonth".equals(E)) {
                    i7 = z4;
                } else if ("hourOfDay".equals(E)) {
                    i8 = z4;
                } else if ("minute".equals(E)) {
                    i9 = z4;
                } else if ("second".equals(E)) {
                    i10 = z4;
                }
            }
            aVar.l();
            return new GregorianCalendar(i5, i6, i7, i8, i9, i10);
        }

        @Override // i2.z
        public final void b(p2.b bVar, Calendar calendar) {
            if (calendar == null) {
                bVar.q();
                return;
            }
            bVar.c();
            bVar.n("year");
            bVar.y(r4.get(1));
            bVar.n("month");
            bVar.y(r4.get(2));
            bVar.n("dayOfMonth");
            bVar.y(r4.get(5));
            bVar.n("hourOfDay");
            bVar.y(r4.get(11));
            bVar.n("minute");
            bVar.y(r4.get(12));
            bVar.n("second");
            bVar.y(r4.get(13));
            bVar.l();
        }
    }

    /* loaded from: classes14.dex */
    public class s extends i2.z<Locale> {
        @Override // i2.z
        public final Locale a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.K(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            return nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // i2.z
        public final void b(p2.b bVar, Locale locale) {
            Locale locale2 = locale;
            bVar.E(locale2 == null ? null : locale2.toString());
        }
    }

    /* loaded from: classes9.dex */
    public class t extends i2.z<i2.n> {
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<i2.n>] */
        @Override // i2.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final i2.n a(p2.a aVar) {
            if (aVar instanceof l2.f) {
                l2.f fVar = (l2.f) aVar;
                int N = fVar.N();
                if (N != 5 && N != 2 && N != 4 && N != 10) {
                    i2.n nVar = (i2.n) fVar.Y();
                    fVar.U();
                    return nVar;
                }
                StringBuilder g5 = androidx.activity.d.g("Unexpected ");
                g5.append(androidx.activity.result.a.j(N));
                g5.append(" when reading a JsonElement.");
                throw new IllegalStateException(g5.toString());
            }
            int a5 = f.h.a(aVar.N());
            if (a5 == 0) {
                i2.l lVar = new i2.l();
                aVar.a();
                while (aVar.r()) {
                    i2.n a6 = a(aVar);
                    if (a6 == null) {
                        a6 = i2.p.f3300a;
                    }
                    lVar.f3299b.add(a6);
                }
                aVar.f();
                return lVar;
            }
            if (a5 != 2) {
                if (a5 == 5) {
                    return new i2.s(aVar.K());
                }
                if (a5 == 6) {
                    return new i2.s(new k2.o(aVar.K()));
                }
                if (a5 == 7) {
                    return new i2.s(Boolean.valueOf(aVar.x()));
                }
                if (a5 != 8) {
                    throw new IllegalArgumentException();
                }
                aVar.I();
                return i2.p.f3300a;
            }
            i2.q qVar = new i2.q();
            aVar.b();
            while (aVar.r()) {
                String E = aVar.E();
                i2.n a7 = a(aVar);
                k2.p<String, i2.n> pVar = qVar.f3301a;
                if (a7 == null) {
                    a7 = i2.p.f3300a;
                }
                pVar.put(E, a7);
            }
            aVar.l();
            return qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i2.z
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void b(p2.b bVar, i2.n nVar) {
            if (nVar == null || (nVar instanceof i2.p)) {
                bVar.q();
                return;
            }
            if (nVar instanceof i2.s) {
                i2.s l5 = nVar.l();
                Serializable serializable = l5.f3302a;
                if (serializable instanceof Number) {
                    bVar.A(l5.s());
                    return;
                } else if (serializable instanceof Boolean) {
                    bVar.H(l5.r());
                    return;
                } else {
                    bVar.E(l5.t());
                    return;
                }
            }
            boolean z4 = nVar instanceof i2.l;
            if (z4) {
                bVar.b();
                if (!z4) {
                    throw new IllegalStateException("Not a JSON Array: " + nVar);
                }
                Iterator<i2.n> it = ((i2.l) nVar).iterator();
                while (it.hasNext()) {
                    b(bVar, it.next());
                }
                bVar.f();
                return;
            }
            boolean z5 = nVar instanceof i2.q;
            if (!z5) {
                StringBuilder g5 = androidx.activity.d.g("Couldn't write ");
                g5.append(nVar.getClass());
                throw new IllegalArgumentException(g5.toString());
            }
            bVar.c();
            if (!z5) {
                throw new IllegalStateException("Not a JSON Object: " + nVar);
            }
            k2.p pVar = k2.p.this;
            p.e eVar = pVar.f3839f.f3851e;
            int i5 = pVar.f3838e;
            while (true) {
                p.e eVar2 = pVar.f3839f;
                if (!(eVar != eVar2)) {
                    bVar.l();
                    return;
                }
                if (eVar == eVar2) {
                    throw new NoSuchElementException();
                }
                if (pVar.f3838e != i5) {
                    throw new ConcurrentModificationException();
                }
                p.e eVar3 = eVar.f3851e;
                bVar.n((String) eVar.f3853g);
                b(bVar, (i2.n) eVar.f3854h);
                eVar = eVar3;
            }
        }
    }

    /* loaded from: classes19.dex */
    public class u implements i2.a0 {
        @Override // i2.a0
        public final <T> i2.z<T> a(i2.i iVar, o2.a<T> aVar) {
            Class<? super T> cls = aVar.f4568a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new d0(cls);
        }
    }

    /* loaded from: classes6.dex */
    public class v extends i2.z<BitSet> {
        @Override // i2.z
        public final BitSet a(p2.a aVar) {
            BitSet bitSet = new BitSet();
            aVar.a();
            int N = aVar.N();
            int i5 = 0;
            while (N != 2) {
                int a5 = f.h.a(N);
                boolean z4 = true;
                if (a5 == 5 || a5 == 6) {
                    int z5 = aVar.z();
                    if (z5 == 0) {
                        z4 = false;
                    } else if (z5 != 1) {
                        StringBuilder e5 = androidx.appcompat.graphics.drawable.a.e("Invalid bitset value ", z5, ", expected 0 or 1; at path ");
                        e5.append(aVar.q());
                        throw new i2.u(e5.toString());
                    }
                } else {
                    if (a5 != 7) {
                        StringBuilder g5 = androidx.activity.d.g("Invalid bitset value type: ");
                        g5.append(androidx.activity.result.a.j(N));
                        g5.append("; at path ");
                        g5.append(aVar.getPath());
                        throw new i2.u(g5.toString());
                    }
                    z4 = aVar.x();
                }
                if (z4) {
                    bitSet.set(i5);
                }
                i5++;
                N = aVar.N();
            }
            aVar.f();
            return bitSet;
        }

        @Override // i2.z
        public final void b(p2.b bVar, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            bVar.b();
            int length = bitSet2.length();
            for (int i5 = 0; i5 < length; i5++) {
                bVar.y(bitSet2.get(i5) ? 1L : 0L);
            }
            bVar.f();
        }
    }

    /* loaded from: classes15.dex */
    public class w extends i2.z<Boolean> {
        @Override // i2.z
        public final Boolean a(p2.a aVar) {
            int N = aVar.N();
            if (N != 9) {
                return Boolean.valueOf(N == 6 ? Boolean.parseBoolean(aVar.K()) : aVar.x());
            }
            aVar.I();
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, Boolean bool) {
            bVar.z(bool);
        }
    }

    /* loaded from: classes22.dex */
    public class x extends i2.z<Boolean> {
        @Override // i2.z
        public final Boolean a(p2.a aVar) {
            if (aVar.N() != 9) {
                return Boolean.valueOf(aVar.K());
            }
            aVar.I();
            return null;
        }

        @Override // i2.z
        public final void b(p2.b bVar, Boolean bool) {
            Boolean bool2 = bool;
            bVar.E(bool2 == null ? "null" : bool2.toString());
        }
    }

    /* loaded from: classes12.dex */
    public class y extends i2.z<Number> {
        @Override // i2.z
        public final Number a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            try {
                int z4 = aVar.z();
                if (z4 <= 255 && z4 >= -128) {
                    return Byte.valueOf((byte) z4);
                }
                StringBuilder e5 = androidx.appcompat.graphics.drawable.a.e("Lossy conversion from ", z4, " to byte; at path ");
                e5.append(aVar.q());
                throw new i2.u(e5.toString());
            } catch (NumberFormatException e6) {
                throw new i2.u(e6);
            }
        }

        @Override // i2.z
        public final void b(p2.b bVar, Number number) {
            bVar.A(number);
        }
    }

    /* loaded from: classes12.dex */
    public class z extends i2.z<Number> {
        @Override // i2.z
        public final Number a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            try {
                int z4 = aVar.z();
                if (z4 <= 65535 && z4 >= -32768) {
                    return Short.valueOf((short) z4);
                }
                StringBuilder e5 = androidx.appcompat.graphics.drawable.a.e("Lossy conversion from ", z4, " to short; at path ");
                e5.append(aVar.q());
                throw new i2.u(e5.toString());
            } catch (NumberFormatException e6) {
                throw new i2.u(e6);
            }
        }

        @Override // i2.z
        public final void b(p2.b bVar, Number number) {
            bVar.A(number);
        }
    }

    static {
        i2.y yVar = new i2.y(new k());
        f4010a = yVar;
        f4011b = new l2.r(Class.class, yVar);
        i2.y yVar2 = new i2.y(new v());
        f4012c = yVar2;
        f4013d = new l2.r(BitSet.class, yVar2);
        w wVar = new w();
        f4014e = wVar;
        f4015f = new x();
        f4016g = new l2.s(Boolean.TYPE, Boolean.class, wVar);
        y yVar3 = new y();
        f4017h = yVar3;
        f4018i = new l2.s(Byte.TYPE, Byte.class, yVar3);
        z zVar = new z();
        f4019j = zVar;
        f4020k = new l2.s(Short.TYPE, Short.class, zVar);
        a0 a0Var = new a0();
        f4021l = a0Var;
        f4022m = new l2.s(Integer.TYPE, Integer.class, a0Var);
        i2.y yVar4 = new i2.y(new b0());
        f4023n = yVar4;
        f4024o = new l2.r(AtomicInteger.class, yVar4);
        i2.y yVar5 = new i2.y(new c0());
        f4025p = yVar5;
        f4026q = new l2.r(AtomicBoolean.class, yVar5);
        i2.y yVar6 = new i2.y(new a());
        f4027r = yVar6;
        f4028s = new l2.r(AtomicIntegerArray.class, yVar6);
        f4029t = new b();
        f4030u = new c();
        f4031v = new d();
        e eVar = new e();
        f4032w = eVar;
        f4033x = new l2.s(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f4034y = fVar;
        f4035z = new g();
        A = new h();
        B = new i();
        C = new l2.r(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = new l2.r(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = new l2.r(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = new l2.r(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = new l2.r(URI.class, nVar);
        o oVar = new o();
        L = oVar;
        M = new l2.u(InetAddress.class, oVar);
        p pVar = new p();
        N = pVar;
        O = new l2.r(UUID.class, pVar);
        i2.y yVar7 = new i2.y(new C0046q());
        P = yVar7;
        Q = new l2.r(Currency.class, yVar7);
        r rVar = new r();
        R = rVar;
        S = new l2.t(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = new l2.r(Locale.class, sVar);
        t tVar = new t();
        V = tVar;
        W = new l2.u(i2.n.class, tVar);
        X = new u();
    }
}
