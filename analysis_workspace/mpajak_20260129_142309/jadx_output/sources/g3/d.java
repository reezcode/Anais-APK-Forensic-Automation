package g3;

import com.superbock.App;
import com.superbock.bean.CInfo;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static d f2956c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2957a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2958b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d() {
        this(new w3.l(v3.d.f5712h));
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f2957a = 1;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i5) {
        this();
        this.f2957a = i5;
        if (i5 == 1) {
            TimeUnit timeUnit = TimeUnit.MINUTES;
        } else {
            try {
                this.f2958b = new o(App.f1372b).b(CInfo.class);
            } catch (SQLException e5) {
                e5.printStackTrace();
            }
        }
    }

    public d(w3.l delegate) {
        this.f2957a = 1;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f2958b = delegate;
    }

    public static d a() {
        if (f2956c == null) {
            synchronized (d.class) {
                if (f2956c == null) {
                    f2956c = new d(0);
                }
            }
        }
        return f2956c;
    }

    public final void b() {
        Object obj = this.f2958b;
        List<CInfo> k5 = ((t2.g) obj).k(((t2.g) obj).c().m());
        if (k5 == null || k5.isEmpty()) {
            return;
        }
        for (CInfo cInfo : k5) {
            cInfo.setUp(0);
            ((t2.g) this.f2958b).d(cInfo);
        }
    }

    public final void finalize() {
        switch (this.f2957a) {
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
