package b3;

import java.util.List;

/* loaded from: classes5.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b f434a;

    /* renamed from: b, reason: collision with root package name */
    public b f435b = null;

    public e(b bVar) {
        this.f434a = bVar;
    }

    @Override // b3.b
    public final void a(u2.c cVar, String str, StringBuilder sb, List<z2.a> list) {
        sb.append("(");
        this.f434a.a(cVar, str, sb, list);
        if (this.f435b != null) {
            sb.append("AND");
            sb.append(' ');
            this.f435b.a(cVar, str, sb, list);
        }
        sb.append(") ");
    }
}
