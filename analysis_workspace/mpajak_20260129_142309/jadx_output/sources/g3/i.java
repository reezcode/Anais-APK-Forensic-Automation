package g3;

import com.superbock.App;
import com.superbock.bean.HInfo;
import java.sql.SQLException;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static i f2967b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<HInfo, String> f2968a;

    public i() {
        try {
            this.f2968a = new o(App.f1372b).b(HInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static i a() {
        if (f2967b == null) {
            synchronized (i.class) {
                if (f2967b == null) {
                    f2967b = new i();
                }
            }
        }
        return f2967b;
    }

    public final void finalize() {
        super.finalize();
        r2.a.e();
    }
}
