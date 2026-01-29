package g3;

import com.superbock.App;
import com.superbock.bean.FInfo;
import java.sql.SQLException;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static g f2963b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<FInfo, String> f2964a;

    public g() {
        try {
            this.f2964a = new o(App.f1372b).b(FInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static g a() {
        if (f2963b == null) {
            synchronized (g.class) {
                if (f2963b == null) {
                    f2963b = new g();
                }
            }
        }
        return f2963b;
    }

    public final void finalize() {
        super.finalize();
        r2.a.e();
    }
}
