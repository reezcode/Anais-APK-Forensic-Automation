package z2;

import java.util.List;

/* loaded from: classes6.dex */
public final class c<T, ID> extends k<T, ID> {
    public c(u2.c cVar, d3.c<T, ID> cVar2, t2.g<T, ID> gVar) {
        super(cVar, cVar2, gVar, 5);
    }

    @Override // z2.k
    public final void a(StringBuilder sb, List<a> list) {
    }

    @Override // z2.k
    public final void b(StringBuilder sb) {
        sb.append("DELETE FROM ");
        ((u2.a) this.f6142c).a(sb, this.f6140a.f2495c);
        sb.append(' ');
    }
}
