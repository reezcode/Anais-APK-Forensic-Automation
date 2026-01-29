package v2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Objects;
import t2.k;
import w2.k0;

/* loaded from: classes22.dex */
public final class e {
    public static final c L = c.UNKNOWN;
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String I;
    public String K;

    /* renamed from: a, reason: collision with root package name */
    public String f5650a;

    /* renamed from: b, reason: collision with root package name */
    public String f5651b;

    /* renamed from: d, reason: collision with root package name */
    public a f5653d;

    /* renamed from: e, reason: collision with root package name */
    public String f5654e;

    /* renamed from: f, reason: collision with root package name */
    public int f5655f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5657h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5658i;

    /* renamed from: j, reason: collision with root package name */
    public String f5659j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5660k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5661l;

    /* renamed from: m, reason: collision with root package name */
    public Enum<?> f5662m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5663n;

    /* renamed from: p, reason: collision with root package name */
    public String f5665p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5666q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5667r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5668s;

    /* renamed from: t, reason: collision with root package name */
    public String f5669t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5670u;

    /* renamed from: v, reason: collision with root package name */
    public String f5671v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5672w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5675z;

    /* renamed from: c, reason: collision with root package name */
    public c f5652c = L;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5656g = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5664o = true;

    /* renamed from: x, reason: collision with root package name */
    public int f5673x = -1;

    /* renamed from: y, reason: collision with root package name */
    public Class<? extends a> f5674y = k0.class;
    public int H = 1;
    public boolean J = true;

    public e() {
    }

    public e(String str) {
        this.f5650a = str;
    }

    public static Method a(Field field, boolean z4) {
        String g5 = g(field, "get");
        try {
            Method method = field.getDeclaringClass().getMethod(g5, new Class[0]);
            if (method.getReturnType() == field.getType()) {
                return method;
            }
            if (!z4) {
                return null;
            }
            StringBuilder f5 = androidx.activity.result.a.f("Return type of get method ", g5, " does not return ");
            f5.append(field.getType());
            throw new IllegalArgumentException(f5.toString());
        } catch (Exception unused) {
            if (!z4) {
                return null;
            }
            throw new IllegalArgumentException("Could not find appropriate get method for " + field);
        }
    }

    public static Enum<?> c(Field field, String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        for (Enum<?> r32 : (Enum[]) field.getType().getEnumConstants()) {
            if (r32.name().equals(str)) {
                return r32;
            }
        }
        throw new IllegalArgumentException("Unknwown enum unknown name " + str + " for field " + field);
    }

    public static Method d(Field field, boolean z4) {
        String g5 = g(field, "set");
        try {
            Method method = field.getDeclaringClass().getMethod(g5, field.getType());
            if (method.getReturnType() == Void.TYPE) {
                return method;
            }
            if (!z4) {
                return null;
            }
            StringBuilder f5 = androidx.activity.result.a.f("Return type of set method ", g5, " returns ");
            f5.append(method.getReturnType());
            f5.append(" instead of void");
            throw new IllegalArgumentException(f5.toString());
        } catch (Exception unused) {
            if (!z4) {
                return null;
            }
            throw new IllegalArgumentException("Could not find appropriate set method for " + field);
        }
    }

    public static e e(u2.c cVar, Field field) {
        Annotation annotation;
        Annotation annotation2;
        d dVar = (d) field.getAnnotation(d.class);
        if (dVar != null) {
            if (!dVar.persisted()) {
                return null;
            }
            e eVar = new e();
            eVar.f5650a = field.getName();
            Objects.requireNonNull(cVar);
            eVar.f5651b = h(dVar.columnName());
            eVar.f5652c = dVar.dataType();
            String defaultValue = dVar.defaultValue();
            if (!defaultValue.equals("__ormlite__ no default value string was specified")) {
                eVar.f5654e = defaultValue;
            }
            eVar.f5655f = dVar.width();
            eVar.f5656g = dVar.canBeNull();
            eVar.f5657h = dVar.id();
            eVar.f5658i = dVar.generatedId();
            eVar.f5659j = h(dVar.generatedIdSequence());
            eVar.f5660k = dVar.foreign();
            eVar.f5661l = dVar.useGetSet();
            eVar.f5662m = c(field, dVar.unknownEnumName());
            eVar.f5663n = dVar.throwIfNull();
            eVar.f5665p = h(dVar.format());
            eVar.f5666q = dVar.unique();
            eVar.f5667r = dVar.uniqueCombo();
            eVar.f5668s = dVar.index();
            eVar.f5669t = h(dVar.indexName());
            eVar.f5670u = dVar.uniqueIndex();
            eVar.f5671v = h(dVar.uniqueIndexName());
            eVar.f5672w = dVar.foreignAutoRefresh();
            eVar.f5673x = dVar.maxForeignAutoRefreshLevel();
            eVar.f5674y = dVar.persisterClass();
            eVar.f5675z = dVar.allowGeneratedIdInsert();
            eVar.A = h(dVar.columnDefinition());
            eVar.B = dVar.foreignAutoCreate();
            eVar.C = dVar.version();
            eVar.D = h(dVar.foreignColumnName());
            eVar.E = dVar.readOnly();
            return eVar;
        }
        h hVar = (h) field.getAnnotation(h.class);
        if (hVar != null) {
            e eVar2 = new e();
            eVar2.f5650a = field.getName();
            if (hVar.columnName().length() > 0) {
                eVar2.f5651b = hVar.columnName();
            }
            eVar2.F = true;
            eVar2.G = hVar.eager();
            int maxEagerForeignCollectionLevel = hVar.maxEagerForeignCollectionLevel();
            if (maxEagerForeignCollectionLevel == 1) {
                maxEagerForeignCollectionLevel = hVar.maxEagerLevel();
            }
            eVar2.H = maxEagerForeignCollectionLevel;
            eVar2.I = h(hVar.orderColumnName());
            eVar2.J = hVar.orderAscending();
            hVar.columnName();
            String h5 = h(hVar.foreignFieldName());
            if (h5 == null) {
                h5 = h(h(hVar.foreignColumnName()));
            }
            eVar2.K = h5;
            return eVar2;
        }
        Annotation annotation3 = null;
        Annotation annotation4 = null;
        Annotation annotation5 = null;
        Annotation annotation6 = null;
        Annotation annotation7 = null;
        Annotation annotation8 = null;
        Annotation annotation9 = null;
        Annotation annotation10 = null;
        Annotation annotation11 = null;
        for (Annotation annotation12 : field.getAnnotations()) {
            Class<? extends Annotation> annotationType = annotation12.annotationType();
            if (annotationType.getName().equals("javax.persistence.Column")) {
                annotation3 = annotation12;
            }
            if (annotationType.getName().equals("javax.persistence.Basic")) {
                annotation4 = annotation12;
            }
            if (annotationType.getName().equals("javax.persistence.Id")) {
                annotation5 = annotation12;
            }
            if (annotationType.getName().equals("javax.persistence.GeneratedValue")) {
                annotation10 = annotation12;
            }
            if (annotationType.getName().equals("javax.persistence.OneToOne")) {
                annotation6 = annotation12;
            }
            if (annotationType.getName().equals("javax.persistence.ManyToOne")) {
                annotation7 = annotation12;
            }
            if (annotationType.getName().equals("javax.persistence.JoinColumn")) {
                annotation11 = annotation12;
            }
            if (annotationType.getName().equals("javax.persistence.Enumerated")) {
                annotation8 = annotation12;
            }
            if (annotationType.getName().equals("javax.persistence.Version")) {
                annotation9 = annotation12;
            }
        }
        if (annotation3 == null && annotation4 == null && annotation5 == null && annotation6 == null && annotation7 == null && annotation8 == null && annotation9 == null) {
            return null;
        }
        e eVar3 = new e();
        String name = field.getName();
        Objects.requireNonNull(cVar);
        eVar3.f5650a = name;
        if (annotation3 != null) {
            try {
                annotation = annotation9;
                String str = (String) annotation3.getClass().getMethod("name", new Class[0]).invoke(annotation3, new Object[0]);
                if (str != null && str.length() > 0) {
                    eVar3.f5651b = str;
                }
                annotation2 = annotation8;
                String str2 = (String) annotation3.getClass().getMethod("columnDefinition", new Class[0]).invoke(annotation3, new Object[0]);
                if (str2 != null && str2.length() > 0) {
                    eVar3.A = str2;
                }
                eVar3.f5655f = ((Integer) annotation3.getClass().getMethod("length", new Class[0]).invoke(annotation3, new Object[0])).intValue();
                Boolean bool = (Boolean) annotation3.getClass().getMethod("nullable", new Class[0]).invoke(annotation3, new Object[0]);
                if (bool != null) {
                    eVar3.f5656g = bool.booleanValue();
                }
                Boolean bool2 = (Boolean) annotation3.getClass().getMethod("unique", new Class[0]).invoke(annotation3, new Object[0]);
                if (bool2 != null) {
                    eVar3.f5666q = bool2.booleanValue();
                }
            } catch (Exception e5) {
                throw d1.c.e("Problem accessing fields from the @Column annotation for field " + field, e5);
            }
        } else {
            annotation2 = annotation8;
            annotation = annotation9;
        }
        if (annotation4 != null) {
            try {
                Boolean bool3 = (Boolean) annotation4.getClass().getMethod("optional", new Class[0]).invoke(annotation4, new Object[0]);
                if (bool3 == null) {
                    eVar3.f5656g = true;
                } else {
                    eVar3.f5656g = bool3.booleanValue();
                }
            } catch (Exception e6) {
                throw d1.c.e("Problem accessing fields from the @Basic annotation for field " + field, e6);
            }
        }
        if (annotation5 != null) {
            if (annotation10 == null) {
                eVar3.f5657h = true;
            } else {
                eVar3.f5658i = true;
            }
        }
        if (annotation6 != null || annotation7 != null) {
            if (Collection.class.isAssignableFrom(field.getType()) || k.class.isAssignableFrom(field.getType())) {
                eVar3.F = true;
                if (annotation11 != null) {
                    try {
                        Object invoke = annotation11.getClass().getMethod("fetch", new Class[0]).invoke(annotation11, new Object[0]);
                        if (invoke != null && invoke.toString().equals("EAGER")) {
                            eVar3.G = true;
                        }
                    } catch (Exception e7) {
                        throw d1.c.e("Problem accessing fields from the @JoinColumn annotation for field " + field, e7);
                    }
                }
            } else {
                eVar3.f5660k = true;
                if (annotation11 != null) {
                    try {
                        String str3 = (String) annotation11.getClass().getMethod("name", new Class[0]).invoke(annotation11, new Object[0]);
                        if (str3 != null && str3.length() > 0) {
                            eVar3.f5651b = str3;
                        }
                        Boolean bool4 = (Boolean) annotation11.getClass().getMethod("nullable", new Class[0]).invoke(annotation11, new Object[0]);
                        if (bool4 != null) {
                            eVar3.f5656g = bool4.booleanValue();
                        }
                        Boolean bool5 = (Boolean) annotation11.getClass().getMethod("unique", new Class[0]).invoke(annotation11, new Object[0]);
                        if (bool5 != null) {
                            eVar3.f5666q = bool5.booleanValue();
                        }
                    } catch (Exception e8) {
                        throw d1.c.e("Problem accessing fields from the @JoinColumn annotation for field " + field, e8);
                    }
                }
            }
        }
        if (annotation2 != null) {
            try {
                Object invoke2 = annotation2.getClass().getMethod("value", new Class[0]).invoke(annotation2, new Object[0]);
                eVar3.f5652c = (invoke2 == null || !invoke2.toString().equals("STRING")) ? c.ENUM_INTEGER : c.ENUM_STRING;
            } catch (Exception e9) {
                throw d1.c.e("Problem accessing fields from the @Enumerated annotation for field " + field, e9);
            }
        }
        if (annotation != null) {
            eVar3.C = true;
        }
        if (eVar3.f() == null) {
            eVar3.f5653d = b.a(field);
        }
        eVar3.f5661l = (a(field, false) == null || d(field, false) == null) ? false : true;
        return eVar3;
    }

    public static String g(Field field, String str) {
        StringBuilder g5 = androidx.activity.d.g(str);
        g5.append(field.getName().substring(0, 1).toUpperCase());
        g5.append(field.getName().substring(1));
        return g5.toString();
    }

    public static String h(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public final String b(String str) {
        StringBuilder e5;
        String str2;
        if (this.f5651b == null) {
            e5 = androidx.activity.result.a.e(str, "_");
            str2 = this.f5650a;
        } else {
            e5 = androidx.activity.result.a.e(str, "_");
            str2 = this.f5651b;
        }
        return androidx.appcompat.graphics.drawable.a.c(e5, str2, "_idx");
    }

    public final a f() {
        a aVar = this.f5653d;
        return aVar == null ? this.f5652c.f5649b : aVar;
    }
}
