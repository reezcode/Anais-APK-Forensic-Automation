package g3;

import com.superbock.App;
import com.superbock.bean.AInfo;
import java.sql.SQLException;
import java.util.List;

/* loaded from: classes17.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f2949c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2950a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2951b;

    public a() {
        this.f2950a = 0;
        try {
            this.f2951b = new o(App.f1372b).b(AInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public a(Object obj) {
        Boolean bool = Boolean.TRUE;
        this.f2950a = 1;
        this.f2951b = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(java.lang.Object r1, i.g r2) {
        /*
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2 = 1
            r0.f2950a = r2
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.a.<init>(java.lang.Object, i.g):void");
    }

    public static a b() {
        if (f2949c == null) {
            synchronized (a.class) {
                if (f2949c == null) {
                    f2949c = new a();
                }
            }
        }
        return f2949c;
    }

    public final List a() {
        Object obj = this.f2951b;
        t2.g gVar = (t2.g) obj;
        z2.m<T, ID> g5 = ((t2.g) obj).c().g();
        g5.c("up", 1);
        g5.b();
        g5.c("ni", 1);
        g5.b();
        g5.c("up2", 0);
        g5.b();
        g5.i("co", 3);
        return gVar.k(g5.j());
    }

    public final void c() {
        Object obj = this.f2951b;
        t2.g gVar = (t2.g) obj;
        z2.m<T, ID> g5 = ((t2.g) obj).c().g();
        g5.c("ty", 0);
        List<AInfo> k5 = gVar.k(g5.j());
        if (k5 == null || k5.isEmpty()) {
            return;
        }
        for (AInfo aInfo : k5) {
            aInfo.setUp(0);
            ((t2.g) this.f2951b).d(aInfo);
        }
    }

    public final void d(AInfo aInfo) {
        ((t2.g) this.f2951b).d(aInfo);
    }

    public final void finalize() {
        switch (this.f2950a) {
            case 0:
                super.finalize();
                r2.a.e();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
