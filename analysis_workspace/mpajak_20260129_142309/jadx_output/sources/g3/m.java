package g3;

import com.superbock.App;
import com.superbock.bean.LInfo;
import java.sql.SQLException;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static m f2976b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<LInfo, String> f2977a;

    public m() {
        try {
            this.f2977a = new o(App.f1372b).b(LInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static m a() {
        if (f2976b == null) {
            synchronized (m.class) {
                if (f2976b == null) {
                    f2976b = new m();
                }
            }
        }
        return f2976b;
    }

    public final void finalize() {
        super.finalize();
        r2.a.e();
    }
}
