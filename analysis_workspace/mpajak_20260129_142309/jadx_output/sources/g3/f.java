package g3;

import com.superbock.App;
import com.superbock.bean.EInfo;
import java.sql.SQLException;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static f f2961b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<EInfo, String> f2962a;

    public f() {
        try {
            this.f2962a = new o(App.f1372b).b(EInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static f a() {
        if (f2961b == null) {
            synchronized (f.class) {
                if (f2961b == null) {
                    f2961b = new f();
                }
            }
        }
        return f2961b;
    }

    public final EInfo b() {
        t2.g<EInfo, String> gVar = this.f2962a;
        z2.h<EInfo, String> c5 = gVar.c();
        c5.l("mo", true);
        z2.m<EInfo, String> g5 = c5.g();
        g5.c("up2", 0);
        g5.b();
        g5.i("co", 3);
        return gVar.j(g5.j());
    }

    public final void c() {
        t2.g<EInfo, String> gVar = this.f2962a;
        List<EInfo> k5 = gVar.k(gVar.c().m());
        if (k5 == null || k5.isEmpty()) {
            return;
        }
        for (EInfo eInfo : k5) {
            eInfo.setUp(0);
            eInfo.setUp2(0);
            if (!eInfo.getPa().toLowerCase().endsWith(".gif") && !eInfo.getPa().contains("/luban_disk_cache/")) {
                eInfo.setCo(0);
            }
            this.f2962a.d(eInfo);
        }
    }

    public final void d(EInfo eInfo) {
        this.f2962a.d(eInfo);
    }

    public final void finalize() {
        super.finalize();
        r2.a.e();
    }
}
