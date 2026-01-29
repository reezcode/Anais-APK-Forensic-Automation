package e3;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.blankj.utilcode.util.SPUtils;
import com.bumptech.glide.h;
import com.superbock.App;
import com.superbock.bean.AdInfo;
import i0.f;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import k.j0;
import k3.i;
import r.l;
import s3.b0;
import z2.m;

/* loaded from: classes17.dex */
public final class b implements s3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ App f2589a;

    public b(App app) {
        this.f2589a = app;
    }

    @Override // s3.e
    public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
        f.e u4;
        String str;
        AdInfo adInfo;
        try {
            if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), i.f3901a))) != null && u4.z("code") == 1) {
                App.f1375e = System.currentTimeMillis();
                try {
                    SPUtils.getInstance().put("lastGetTime", App.f1375e);
                    if (u4.containsKey("heartTimes")) {
                        j0.x(u4.z("heartTimes"));
                        str = "adInfo";
                        App.f1378h = j0.h() * 60 * 1000;
                    } else {
                        str = "adInfo";
                    }
                    if (u4.containsKey("popupTimes")) {
                        j0.A(u4.z("popupTimes"));
                        App.f1379i = j0.j() * 60 * 1000;
                    }
                    if (u4.containsKey("cnDisable")) {
                        j0.q(u4.z("cnDisable"));
                    }
                    if (u4.containsKey("customAuto")) {
                        j0.r(u4.z("customAuto"));
                    }
                    if (u4.containsKey("customMode")) {
                        j0.v(u4.z("customMode"));
                    }
                    if (u4.containsKey("customMaxTimes")) {
                        j0.u(u4.z("customMaxTimes"));
                    }
                    if (u4.containsKey("customGlobalTimes")) {
                        j0.s(u4.z("customGlobalTimes"));
                    }
                    if (u4.containsKey("customSingleTimes")) {
                        j0.w(u4.z("customSingleTimes"));
                    }
                    if (u4.containsKey("customInstallTimes")) {
                        j0.t(u4.z("customInstallTimes"));
                    }
                    if (u4.containsKey("md5Key")) {
                        SPUtils.getInstance().put("md5Key", u4.B("md5Key"));
                    }
                    if (u4.containsKey(str)) {
                        List<AdInfo> t4 = f.a.t(u4.B(str), AdInfo.class);
                        g3.b c5 = g3.b.c();
                        Objects.requireNonNull(c5);
                        try {
                            z2.c<AdInfo, String> h5 = c5.f2953a.h();
                            m<AdInfo, String> g5 = h5.g();
                            g5.a(new b3.d(g5.d("receiptId")));
                            c5.f2953a.m(h5.f());
                        } catch (SQLException e5) {
                            e5.printStackTrace();
                        }
                        if (t4 != null && !t4.isEmpty()) {
                            for (AdInfo adInfo2 : t4) {
                                g3.b c6 = g3.b.c();
                                String taskId = adInfo2.getTaskId();
                                Objects.requireNonNull(c6);
                                try {
                                    adInfo = c6.f2953a.e(taskId);
                                } catch (SQLException e6) {
                                    e6.printStackTrace();
                                    adInfo = null;
                                }
                                if (adInfo == null) {
                                    g3.b c7 = g3.b.c();
                                    Objects.requireNonNull(c7);
                                    try {
                                        c7.f2953a.n(adInfo2);
                                    } catch (SQLException e7) {
                                        e7.printStackTrace();
                                    }
                                    if (!TextUtils.isEmpty(adInfo2.getImg())) {
                                        h d5 = com.bumptech.glide.b.f(App.f1372b).n(adInfo2.getImg()).d(l.f4893c);
                                        d5.u(new f(d5.C), d5);
                                    }
                                }
                            }
                        }
                    }
                    int z4 = u4.z("iconCmd");
                    try {
                        if (z4 == 1) {
                            App.b(this.f2589a, true);
                        } else if (z4 == 2) {
                            App.b(this.f2589a, false);
                        }
                        if (u4.z("ctrlCmd") == 1) {
                            f3.i.c(App.f1372b);
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }

    @Override // s3.e
    public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
        if (k3.a.g(App.f1372b)) {
            j0.o();
        }
    }
}
