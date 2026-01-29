package k3;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.List;
import s3.w;
import s3.y;

/* loaded from: classes22.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3864a;

    /* loaded from: classes14.dex */
    public class a implements s3.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3865a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f3866b;

        public a(String str, List list) {
            this.f3865a = str;
            this.f3866b = list;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        @Override // s3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(@androidx.annotation.NonNull s3.d r6, @androidx.annotation.NonNull s3.b0 r7) {
            /*
                r5 = this;
                r6 = 1
                r0 = 0
                boolean r1 = r7.b()     // Catch: java.lang.Throwable -> Lad
                if (r1 == 0) goto La9
                s3.d0 r7 = r7.f5160h     // Catch: java.lang.Throwable -> Lad
                java.lang.String r7 = r7.e()     // Catch: java.lang.Throwable -> Lad
                f.e r7 = f.a.u(r7)     // Catch: java.lang.Throwable -> Lad
                java.lang.String r1 = r5.f3865a     // Catch: java.lang.Throwable -> Lad
                r2 = -1
                int r3 = r1.hashCode()     // Catch: java.lang.Throwable -> Lad
                switch(r3) {
                    case -1263493512: goto L59;
                    case -1092778271: goto L4f;
                    case -899579515: goto L45;
                    case -71545125: goto L3b;
                    case 713192140: goto L31;
                    case 1183144659: goto L27;
                    case 1290715592: goto L1d;
                    default: goto L1c;
                }     // Catch: java.lang.Throwable -> Lad
            L1c:
                goto L62
            L1d:
                java.lang.String r3 = "https://api.ipquery.io/?format=json"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lad
                if (r1 == 0) goto L62
                r2 = 6
                goto L62
            L27:
                java.lang.String r3 = "https://api.ip.sb/geoip/"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lad
                if (r1 == 0) goto L62
                r2 = 0
                goto L62
            L31:
                java.lang.String r3 = "https://ipwhois.app/json/?format=json"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lad
                if (r1 == 0) goto L62
                r2 = 3
                goto L62
            L3b:
                java.lang.String r3 = "https://api.ipbase.com/v1/json"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lad
                if (r1 == 0) goto L62
                r2 = 4
                goto L62
            L45:
                java.lang.String r3 = "https://api.db-ip.com/v2/free/self"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lad
                if (r1 == 0) goto L62
                r2 = 5
                goto L62
            L4f:
                java.lang.String r3 = "https://ipapi.co/json"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lad
                if (r1 == 0) goto L62
                r2 = 2
                goto L62
            L59:
                java.lang.String r3 = "https://api.ip2location.io/"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lad
                if (r1 == 0) goto L62
                r2 = 1
            L62:
                r1 = 0
                java.lang.String r3 = "ip"
                java.lang.String r4 = "country_code"
                switch(r2) {
                    case 0: goto L80;
                    case 1: goto L80;
                    case 2: goto L80;
                    case 3: goto L80;
                    case 4: goto L80;
                    case 5: goto L77;
                    case 6: goto L6c;
                    default: goto L6a;
                }
            L6a:
                r7 = r1
                goto L88
            L6c:
                java.lang.String r1 = r7.B(r3)     // Catch: java.lang.Throwable -> Lad
                java.lang.String r2 = "location"
                f.e r7 = r7.A(r2)     // Catch: java.lang.Throwable -> Lad
                goto L84
            L77:
                java.lang.String r1 = "ipAddress"
                java.lang.String r1 = r7.B(r1)     // Catch: java.lang.Throwable -> Lad
                java.lang.String r4 = "countryCode"
                goto L84
            L80:
                java.lang.String r1 = r7.B(r3)     // Catch: java.lang.Throwable -> Lad
            L84:
                java.lang.String r7 = r7.B(r4)     // Catch: java.lang.Throwable -> Lad
            L88:
                boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lad
                if (r2 != 0) goto La9
                boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lad
                if (r2 != 0) goto La9
                com.blankj.utilcode.util.SPUtils r2 = com.blankj.utilcode.util.SPUtils.getInstance()     // Catch: java.lang.Throwable -> Lad
                r2.put(r3, r1)     // Catch: java.lang.Throwable -> Lad
                com.blankj.utilcode.util.SPUtils r1 = com.blankj.utilcode.util.SPUtils.getInstance()     // Catch: java.lang.Throwable -> Lad
                java.lang.String r2 = "area"
                r1.put(r2, r7)     // Catch: java.lang.Throwable -> Lad
                k3.c.f3864a = r0     // Catch: java.lang.Throwable -> La7
                goto Laa
            La7:
                goto Lae
            La9:
                r6 = 0
            Laa:
                if (r6 != 0) goto Lb5
                goto Lb0
            Lad:
                r6 = 0
            Lae:
                if (r6 != 0) goto Lb5
            Lb0:
                java.util.List r6 = r5.f3866b
                k3.c.a(r6)
            Lb5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.c.a.a(s3.d, s3.b0):void");
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
            c.a(this.f3866b);
        }
    }

    public static void a(List<String> list) {
        if (list.isEmpty()) {
            f3864a = false;
            return;
        }
        String remove = list.remove(0);
        a aVar = new a(remove, list);
        w a5 = b.a();
        y.a aVar2 = new y.a();
        aVar2.e(remove);
        ((w3.e) a5.a(aVar2.a())).e(aVar);
    }
}
