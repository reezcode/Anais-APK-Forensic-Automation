package z3;

import a4.h;
import java.io.IOException;
import z3.f;

/* loaded from: classes15.dex */
public final class h extends v3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f6256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f.e f6257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, q qVar, f.e eVar) {
        super(str, true);
        this.f6256e = qVar;
        this.f6257f = eVar;
    }

    @Override // v3.a
    public final long a() {
        try {
            this.f6257f.f6244c.f6207c.b(this.f6256e);
            return -1L;
        } catch (IOException e5) {
            h.a aVar = a4.h.f116c;
            a4.h hVar = a4.h.f114a;
            StringBuilder g5 = androidx.activity.d.g("Http2Connection.Listener failure for ");
            g5.append(this.f6257f.f6244c.f6209e);
            hVar.i(g5.toString(), 4, e5);
            try {
                this.f6256e.c(b.PROTOCOL_ERROR, e5);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
