package g3;

import com.superbock.App;
import com.superbock.bean.IInfo;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static j f2969c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2970a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f2971b;

    public j() {
        try {
            this.f2971b = new o(App.f1372b).b(IInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public j(Field field) {
        Objects.requireNonNull(field);
        this.f2971b = field;
    }

    public static j a() {
        if (f2969c == null) {
            synchronized (j.class) {
                if (f2969c == null) {
                    f2969c = new j();
                }
            }
        }
        return f2969c;
    }

    public final void finalize() {
        switch (this.f2970a) {
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
