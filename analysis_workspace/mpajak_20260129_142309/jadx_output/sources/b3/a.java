package b3;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes19.dex */
public abstract class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f431a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.g f432b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f433c;

    public a(String str, v2.g gVar, Object obj) {
        boolean u4;
        if (gVar != null) {
            if (gVar.f5681e.F) {
                u4 = false;
            } else {
                v2.a aVar = gVar.f5688l;
                if (aVar == null) {
                    throw new SQLException("Internal error.  Data-persister is not configured for field.  Please post _full_ exception with associated data objects to mailing list: " + gVar);
                }
                u4 = aVar.u();
            }
            if (!u4) {
                StringBuilder f5 = androidx.activity.result.a.f("Field '", str, "' is of data type ");
                f5.append(gVar.f5688l);
                f5.append(" which can not be compared");
                throw new SQLException(f5.toString());
            }
        }
        this.f431a = str;
        this.f432b = gVar;
        this.f433c = obj;
    }

    @Override // b3.b
    public final void a(u2.c cVar, String str, StringBuilder sb, List<z2.a> list) {
        if (str != null) {
            ((u2.a) cVar).a(sb, str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        }
        u2.a aVar = (u2.a) cVar;
        aVar.a(sb, this.f431a);
        sb.append(' ');
        c(sb);
        d(aVar, sb, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(u2.c r9, v2.g r10, java.lang.StringBuilder r11, java.util.List<z2.a> r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.a.b(u2.c, v2.g, java.lang.StringBuilder, java.util.List, java.lang.Object):void");
    }

    public abstract void c(StringBuilder sb);

    public void d(u2.c cVar, StringBuilder sb, List<z2.a> list) {
        b(cVar, this.f432b, sb, list, this.f433c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f431a);
        sb.append(' ');
        c(sb);
        sb.append(' ');
        sb.append(this.f433c);
        return sb.toString();
    }
}
