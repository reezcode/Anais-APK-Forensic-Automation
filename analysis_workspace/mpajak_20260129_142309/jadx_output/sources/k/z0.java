package k;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes23.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public List<k> f3788a = null;

    /* renamed from: b, reason: collision with root package name */
    public List<c> f3789b = null;

    /* renamed from: c, reason: collision with root package name */
    public List<s0> f3790c = null;

    /* renamed from: d, reason: collision with root package name */
    public List<e1> f3791d = null;

    /* renamed from: e, reason: collision with root package name */
    public List<o0> f3792e = null;

    /* renamed from: f, reason: collision with root package name */
    public List<t0> f3793f = null;

    /* renamed from: g, reason: collision with root package name */
    public List<i0> f3794g = null;

    /* renamed from: h, reason: collision with root package name */
    public List<u> f3795h = null;

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<k.c>] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList, java.util.List<k.k>] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList, java.util.List<k.s0>] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList, java.util.List<k.u>] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList, java.util.List<k.e1>] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList, java.util.List<k.o0>] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList, java.util.List<k.t0>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<k.i0>] */
    public final void c(y0 y0Var) {
        if (y0Var == null) {
            return;
        }
        if (y0Var instanceof t0) {
            if (this.f3793f == null) {
                this.f3793f = new ArrayList();
            }
            this.f3793f.add((t0) y0Var);
        }
        if (y0Var instanceof o0) {
            if (this.f3792e == null) {
                this.f3792e = new ArrayList();
            }
            this.f3792e.add((o0) y0Var);
        }
        if (y0Var instanceof e1) {
            if (this.f3791d == null) {
                this.f3791d = new ArrayList();
            }
            this.f3791d.add((e1) y0Var);
        }
        if (y0Var instanceof u) {
            if (this.f3795h == null) {
                this.f3795h = new ArrayList();
            }
            this.f3795h.add((u) y0Var);
        }
        if (y0Var instanceof s0) {
            if (this.f3790c == null) {
                this.f3790c = new ArrayList();
            }
            this.f3790c.add((s0) y0Var);
        }
        if (y0Var instanceof k) {
            if (this.f3788a == null) {
                this.f3788a = new ArrayList();
            }
            this.f3788a.add((k) y0Var);
        }
        if (y0Var instanceof c) {
            if (this.f3789b == null) {
                this.f3789b = new ArrayList();
            }
            this.f3789b.add((c) y0Var);
        }
        if (y0Var instanceof i0) {
            if (this.f3794g == null) {
                this.f3794g = new ArrayList();
            }
            this.f3794g.add((i0) y0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<k.s0>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<k.s0>] */
    public final boolean e(g0 g0Var, Object obj, String str, Object obj2) {
        ?? r12 = g0Var.f3790c;
        if (r12 != 0) {
            Iterator it = r12.iterator();
            while (it.hasNext()) {
                if (!((s0) it.next()).b()) {
                    return false;
                }
            }
        }
        ?? r13 = this.f3790c;
        if (r13 == 0) {
            return true;
        }
        Iterator it2 = r13.iterator();
        while (it2.hasNext()) {
            if (!((s0) it2.next()).b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<k.t0>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<k.t0>] */
    public final boolean f(g0 g0Var, Object obj, String str) {
        ?? r12 = g0Var.f3793f;
        if (r12 != 0) {
            Iterator it = r12.iterator();
            while (it.hasNext()) {
                if (!((t0) it.next()).d()) {
                    return false;
                }
            }
        }
        ?? r13 = this.f3793f;
        if (r13 == 0) {
            return true;
        }
        Iterator it2 = r13.iterator();
        while (it2.hasNext()) {
            if (!((t0) it2.next()).d()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<k.o0>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<k.o0>] */
    public final String g(g0 g0Var, Object obj, String str, Object obj2) {
        ?? r12 = g0Var.f3792e;
        if (r12 != 0) {
            Iterator it = r12.iterator();
            while (it.hasNext()) {
                str = ((o0) it.next()).a();
            }
        }
        ?? r13 = this.f3792e;
        if (r13 != 0) {
            Iterator it2 = r13.iterator();
            while (it2.hasNext()) {
                str = ((o0) it2.next()).a();
            }
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<k.u>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<k.u>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<k.e1>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<k.e1>] */
    public final Object h(g0 g0Var, j jVar, Object obj, String str, Object obj2) {
        boolean z4;
        if (obj2 != null) {
            if ((g0Var.f3689j.f3641k || !(jVar == null || (jVar.f3703a.f4069j & b1.WriteNonStringValueAsString.f3675b) == 0)) && (((z4 = obj2 instanceof Number)) || (obj2 instanceof Boolean))) {
                String str2 = null;
                if (z4 && jVar != null) {
                    str2 = jVar.f3704b;
                }
                obj2 = str2 != null ? new DecimalFormat(str2).format(obj2) : obj2.toString();
            } else if (jVar != null && jVar.f3703a.f4077r) {
                obj2 = f.a.s((String) obj2);
            }
        }
        ?? r22 = g0Var.f3791d;
        if (r22 != 0) {
            Iterator it = r22.iterator();
            while (it.hasNext()) {
                obj2 = ((e1) it.next()).c();
            }
        }
        ?? r23 = this.f3791d;
        if (r23 != 0) {
            Iterator it2 = r23.iterator();
            while (it2.hasNext()) {
                obj2 = ((e1) it2.next()).c();
            }
        }
        ?? r12 = g0Var.f3795h;
        if (r12 != 0) {
            Iterator it3 = r12.iterator();
            while (it3.hasNext()) {
                obj2 = ((u) it3.next()).a();
            }
        }
        ?? r13 = this.f3795h;
        if (r13 != 0) {
            Iterator it4 = r13.iterator();
            while (it4.hasNext()) {
                obj2 = ((u) it4.next()).a();
            }
        }
        return obj2;
    }
}
