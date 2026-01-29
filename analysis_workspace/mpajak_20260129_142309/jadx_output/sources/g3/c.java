package g3;

import com.superbock.App;
import com.superbock.bean.BInfo;
import java.sql.SQLException;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static c f2954b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<BInfo, String> f2955a;

    public c() {
        try {
            this.f2955a = new o(App.f1372b).b(BInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static c a() {
        if (f2954b == null) {
            synchronized (c.class) {
                if (f2954b == null) {
                    f2954b = new c();
                }
            }
        }
        return f2954b;
    }

    public final void finalize() {
        super.finalize();
        r2.a.e();
    }
}
