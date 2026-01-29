package g3;

import com.superbock.App;
import com.superbock.bean.DInfo;
import java.sql.SQLException;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static e f2959b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<DInfo, String> f2960a;

    public e() {
        try {
            this.f2960a = new o(App.f1372b).b(DInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static e a() {
        if (f2959b == null) {
            synchronized (e.class) {
                if (f2959b == null) {
                    f2959b = new e();
                }
            }
        }
        return f2959b;
    }

    public final void finalize() {
        super.finalize();
        r2.a.e();
    }
}
