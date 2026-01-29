package k;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class n0 implements q0, j.s {

    /* renamed from: c, reason: collision with root package name */
    public static Method f3734c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3735d;

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f3733b = new n0();

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3732a = "true".equals(m.e.d("fastjson.deserializer.fileRelativePathSupport"));

    /* JADX WARN: Type inference failed for: r10v39, types: [T, java.text.DateFormat, java.text.SimpleDateFormat] */
    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        Object w4;
        String str;
        i.c cVar = aVar.f3146g;
        int i5 = 0;
        if (type != InetSocketAddress.class) {
            if (aVar.f3151l == 2) {
                aVar.f3151l = 0;
                aVar.a(16);
                if (cVar.q() != 4) {
                    throw new f.d("syntax error");
                }
                if (!"val".equals(cVar.k0())) {
                    throw new f.d("syntax error");
                }
                cVar.y();
                aVar.a(17);
                w4 = aVar.w(null);
                aVar.a(13);
            } else {
                w4 = aVar.w(null);
            }
            if (w4 == null) {
                str = null;
            } else {
                if (!(w4 instanceof String)) {
                    if (w4 instanceof f.e) {
                        f.e eVar = (f.e) w4;
                        if (type == Currency.class) {
                            String B = eVar.B("currency");
                            if (B != null) {
                                return (T) Currency.getInstance(B);
                            }
                            String B2 = eVar.B("currencyCode");
                            if (B2 != null) {
                                return (T) Currency.getInstance(B2);
                            }
                        }
                        if (type == Map.Entry.class) {
                            return (T) eVar.entrySet().iterator().next();
                        }
                    }
                    throw new f.d("expect string");
                }
                str = (String) w4;
            }
            if (str == null || str.length() == 0) {
                return null;
            }
            if (type == UUID.class) {
                return (T) UUID.fromString(str);
            }
            if (type == URI.class) {
                return (T) URI.create(str);
            }
            if (type == URL.class) {
                try {
                    return (T) new URL(str);
                } catch (MalformedURLException e5) {
                    throw new f.d("create url error", e5);
                }
            }
            if (type == Pattern.class) {
                return (T) Pattern.compile(str);
            }
            if (type == Locale.class) {
                return (T) m.j.Q(str);
            }
            if (type == SimpleDateFormat.class) {
                ?? r10 = (T) new SimpleDateFormat(str, cVar.f0());
                r10.setTimeZone(cVar.l0());
                return r10;
            }
            if (type == InetAddress.class || type == Inet4Address.class || type == Inet6Address.class) {
                try {
                    return (T) InetAddress.getByName(str);
                } catch (UnknownHostException e6) {
                    throw new f.d("deserialize inet adress error", e6);
                }
            }
            if (type == File.class) {
                if (str.indexOf("..") < 0 || f3732a) {
                    return (T) new File(str);
                }
                throw new f.d("file relative path not support.");
            }
            if (type == TimeZone.class) {
                return (T) TimeZone.getTimeZone(str);
            }
            if (type instanceof ParameterizedType) {
                type = ((ParameterizedType) type).getRawType();
            }
            if (type == Class.class) {
                Objects.requireNonNull(aVar.f3143d);
                return (T) m.j.O(str);
            }
            if (type == Charset.class) {
                return (T) Charset.forName(str);
            }
            if (type == Currency.class) {
                return (T) Currency.getInstance(str);
            }
            if (type == f.g.class) {
                return (T) new f.g(str);
            }
            if (!(type instanceof Class)) {
                StringBuilder g5 = androidx.activity.d.g("MiscCodec not support ");
                g5.append(type.toString());
                throw new f.d(g5.toString());
            }
            String name = ((Class) type).getName();
            if (name.equals("java.nio.file.Path")) {
                try {
                    if (f3734c == null && !f3735d) {
                        f3734c = m.j.O("java.nio.file.Paths").getMethod("get", String.class, String[].class);
                    }
                    Method method = f3734c;
                    if (method != null) {
                        return (T) method.invoke(null, str, new String[0]);
                    }
                    throw new f.d("Path deserialize erorr");
                } catch (IllegalAccessException e7) {
                    throw new f.d("Path deserialize erorr", e7);
                } catch (NoSuchMethodException unused) {
                    f3735d = true;
                } catch (InvocationTargetException e8) {
                    throw new f.d("Path deserialize erorr", e8);
                }
            }
            throw new f.d(androidx.activity.d.f("MiscCodec not support ", name));
        }
        if (cVar.q() == 8) {
            cVar.y();
            return null;
        }
        aVar.a(12);
        InetAddress inetAddress = null;
        while (true) {
            String k02 = cVar.k0();
            cVar.Q(17);
            if (k02.equals("address")) {
                aVar.a(17);
                inetAddress = (InetAddress) aVar.A(InetAddress.class, null);
            } else {
                boolean equals = k02.equals("port");
                aVar.a(17);
                if (!equals) {
                    aVar.s();
                } else {
                    if (cVar.q() != 2) {
                        throw new f.d("port is not int");
                    }
                    int I = cVar.I();
                    cVar.y();
                    i5 = I;
                }
            }
            if (cVar.q() != 16) {
                aVar.a(13);
                return (T) new InetSocketAddress(inetAddress, i5);
            }
            cVar.y();
        }
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        String currencyCode;
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.E();
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == SimpleDateFormat.class) {
            currencyCode = ((SimpleDateFormat) obj).toPattern();
            if (a1Var.l(b1.WriteClassName) && obj.getClass() != type) {
                a1Var.write(123);
                a1Var.q(f.a.f2680d);
                g0Var.r(obj.getClass().getName());
                a1Var.w(',', "val", currencyCode);
                a1Var.write(125);
                return;
            }
        } else if (cls == Class.class) {
            currencyCode = ((Class) obj).getName();
        } else {
            if (cls == InetSocketAddress.class) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                InetAddress address = inetSocketAddress.getAddress();
                a1Var.write(123);
                if (address != null) {
                    a1Var.q("address");
                    g0Var.q(address);
                    a1Var.write(44);
                }
                a1Var.q("port");
                a1Var.z(inetSocketAddress.getPort());
                a1Var.write(125);
                return;
            }
            if (obj instanceof File) {
                currencyCode = ((File) obj).getPath();
            } else if (obj instanceof InetAddress) {
                currencyCode = ((InetAddress) obj).getHostAddress();
            } else if (obj instanceof TimeZone) {
                currencyCode = ((TimeZone) obj).getID();
            } else {
                if (!(obj instanceof Currency)) {
                    if (obj instanceof f.k) {
                        ((f.k) obj).r(a1Var);
                        return;
                    }
                    if (obj instanceof Iterator) {
                        f(g0Var, a1Var, (Iterator) obj);
                        return;
                    }
                    if (obj instanceof Iterable) {
                        f(g0Var, a1Var, ((Iterable) obj).iterator());
                        return;
                    }
                    if (!(obj instanceof Map.Entry)) {
                        if (!obj.getClass().getName().equals("net.sf.json.JSONNull")) {
                            throw new f.d(androidx.activity.d.e("not support class : ", cls));
                        }
                        a1Var.E();
                        return;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key instanceof String) {
                        String str = (String) key;
                        if (value instanceof String) {
                            a1Var.x('{', str, (String) value);
                            a1Var.write(125);
                            return;
                        } else {
                            a1Var.write(123);
                            a1Var.q(str);
                        }
                    } else {
                        a1Var.write(123);
                        g0Var.q(key);
                        a1Var.write(58);
                    }
                    g0Var.q(value);
                    a1Var.write(125);
                    return;
                }
                currencyCode = ((Currency) obj).getCurrencyCode();
            }
        }
        a1Var.J(currencyCode);
    }

    @Override // j.s
    public final int e() {
        return 4;
    }

    public final void f(g0 g0Var, a1 a1Var, Iterator<?> it) {
        a1Var.write(91);
        int i5 = 0;
        while (it.hasNext()) {
            if (i5 != 0) {
                a1Var.write(44);
            }
            g0Var.q(it.next());
            i5++;
        }
        a1Var.write(93);
    }
}
