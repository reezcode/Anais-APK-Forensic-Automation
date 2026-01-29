package k;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.text.Typography;

/* loaded from: classes14.dex */
public final class z implements Comparable<z> {

    /* renamed from: b, reason: collision with root package name */
    public final m.c f3772b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3773c;

    /* renamed from: d, reason: collision with root package name */
    public int f3774d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3775e;

    /* renamed from: f, reason: collision with root package name */
    public String f3776f;

    /* renamed from: g, reason: collision with root package name */
    public String f3777g;

    /* renamed from: h, reason: collision with root package name */
    public j f3778h;

    /* renamed from: i, reason: collision with root package name */
    public String f3779i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3780j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3781k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3782l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3783m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3784n;

    /* renamed from: o, reason: collision with root package name */
    public a f3785o;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final q0 f3786a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f3787b;

        public a(q0 q0Var, Class<?> cls) {
            this.f3786a = q0Var;
            this.f3787b = cls;
        }
    }

    public z(Class<?> cls, m.c cVar) {
        boolean z4;
        g.d dVar;
        this.f3780j = false;
        this.f3781k = false;
        this.f3782l = false;
        this.f3784n = false;
        this.f3772b = cVar;
        this.f3778h = new j(cVar);
        if (cls != null && cVar.f4076q && (dVar = (g.d) m.j.v(cls, g.d.class)) != null) {
            for (b1 b1Var : dVar.serialzeFeatures()) {
                if (b1Var == b1.WriteEnumUsingToString) {
                    this.f3780j = true;
                } else if (b1Var == b1.WriteEnumUsingName) {
                    this.f3781k = true;
                } else if (b1Var == b1.DisableCircularReferenceDetect) {
                    this.f3782l = true;
                }
            }
        }
        AccessibleObject accessibleObject = cVar.f4062c;
        m.j.P(accessibleObject == null ? cVar.f4063d : accessibleObject);
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.quote);
        this.f3775e = androidx.appcompat.graphics.drawable.a.c(sb, cVar.f4061b, "\":");
        g.b c5 = cVar.c();
        if (c5 != null) {
            b1[] serialzeFeatures = c5.serialzeFeatures();
            int length = serialzeFeatures.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    z4 = false;
                    break;
                } else {
                    if ((serialzeFeatures[i5].f3675b & b1.F) != 0) {
                        z4 = true;
                        break;
                    }
                    i5++;
                }
            }
            String format = c5.format();
            this.f3779i = format;
            if (format.trim().length() == 0) {
                this.f3779i = null;
            }
            for (b1 b1Var2 : c5.serialzeFeatures()) {
                if (b1Var2 == b1.WriteEnumUsingToString) {
                    this.f3780j = true;
                } else if (b1Var2 == b1.WriteEnumUsingName) {
                    this.f3781k = true;
                } else if (b1Var2 == b1.DisableCircularReferenceDetect) {
                    this.f3782l = true;
                }
            }
            this.f3774d = b1.b(c5.serialzeFeatures());
        } else {
            z4 = false;
        }
        this.f3773c = z4;
        this.f3784n = m.j.I(cVar.f4062c) || m.j.H(cVar.f4062c);
    }

    public final Object a(Object obj) {
        m.c cVar = this.f3772b;
        Method method = cVar.f4062c;
        Object invoke = method != null ? method.invoke(obj, new Object[0]) : cVar.f4063d.get(obj);
        if (this.f3779i == null || invoke == null || this.f3772b.f4065f != Date.class) {
            return invoke;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f3779i);
        simpleDateFormat.setTimeZone(f.a.f2678b);
        return simpleDateFormat.format(invoke);
    }

    public final Object b(Object obj) {
        m.c cVar = this.f3772b;
        Method method = cVar.f4062c;
        boolean z4 = false;
        Object invoke = method != null ? method.invoke(obj, new Object[0]) : cVar.f4063d.get(obj);
        if (this.f3784n) {
            boolean z5 = m.j.f4122a;
            if (invoke != null) {
                if (m.j.f4137p == null && !m.j.f4138q) {
                    try {
                        m.j.f4137p = Class.forName("org.hibernate.Hibernate").getMethod("isInitialized", Object.class);
                    } catch (Throwable unused) {
                        m.j.f4138q = true;
                    }
                }
                Method method2 = m.j.f4137p;
                if (method2 != null) {
                    try {
                        z4 = ((Boolean) method2.invoke(null, invoke)).booleanValue();
                    } catch (Throwable unused2) {
                    }
                }
                z4 = true;
            }
            if (!z4) {
                return null;
            }
        }
        return invoke;
    }

    public final void c(g0 g0Var) {
        String str;
        a1 a1Var = g0Var.f3689j;
        if (!a1Var.f3637g) {
            if (this.f3777g == null) {
                this.f3777g = androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), this.f3772b.f4061b, ":");
            }
            str = this.f3777g;
        } else if (a1Var.f3636f) {
            if (this.f3776f == null) {
                StringBuilder sb = new StringBuilder();
                sb.append('\'');
                this.f3776f = androidx.appcompat.graphics.drawable.a.c(sb, this.f3772b.f4061b, "':");
            }
            str = this.f3776f;
        } else {
            str = this.f3775e;
        }
        a1Var.write(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(z zVar) {
        return this.f3772b.compareTo(zVar.f3772b);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(k.g0 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.z.d(k.g0, java.lang.Object):void");
    }
}
