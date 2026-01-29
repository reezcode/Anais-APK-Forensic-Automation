package z2;

import java.sql.SQLException;

/* loaded from: classes7.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public String f6122a = null;

    /* renamed from: b, reason: collision with root package name */
    public v2.g f6123b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6124c = false;

    /* renamed from: d, reason: collision with root package name */
    public Object f6125d = null;

    @Override // z2.a
    public final Object a() {
        if (!this.f6124c) {
            StringBuilder g5 = androidx.activity.d.g("Column value has not been set for ");
            g5.append(this.f6122a);
            throw new SQLException(g5.toString());
        }
        Object obj = this.f6125d;
        if (obj == null) {
            return null;
        }
        v2.g gVar = this.f6123b;
        return gVar == null ? obj : (gVar.f5681e.f5660k && gVar.j() == obj.getClass()) ? this.f6123b.f5692p.e(obj) : this.f6123b.d(obj);
    }

    @Override // z2.a
    public final v2.g b() {
        return this.f6123b;
    }

    @Override // z2.a
    public final void c() {
    }

    @Override // z2.a
    public final void d(String str, v2.g gVar) {
        String str2 = this.f6122a;
        if (str2 != null && !str2.equals(str)) {
            StringBuilder g5 = androidx.activity.d.g("Column name cannot be set twice from ");
            g5.append(this.f6122a);
            g5.append(" to ");
            g5.append(str);
            g5.append(".  Using a SelectArg twice in query with different columns?");
            throw new IllegalArgumentException(g5.toString());
        }
        this.f6122a = str;
        v2.g gVar2 = this.f6123b;
        if (gVar2 == null || gVar2 == gVar) {
            this.f6123b = gVar;
            return;
        }
        StringBuilder g6 = androidx.activity.d.g("FieldType name cannot be set twice from ");
        g6.append(this.f6123b);
        g6.append(" to ");
        g6.append(gVar);
        g6.append(".  Using a SelectArg twice in query with different columns?");
        throw new IllegalArgumentException(g6.toString());
    }

    public final String toString() {
        if (!this.f6124c) {
            return "[unset]";
        }
        try {
            Object a5 = a();
            return a5 == null ? "[null]" : a5.toString();
        } catch (SQLException e5) {
            return "[could not get value: " + e5 + "]";
        }
    }
}
