package k;

import android.text.TextUtils;
import com.blankj.utilcode.util.SPUtils;
import com.tencent.smtt.sdk.TbsListener;
import comeliest.metempsychosis.pokelogan.R;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.logging.Logger;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;

/* loaded from: classes16.dex */
public class j0 implements k2.q, s3.n {

    /* renamed from: e, reason: collision with root package name */
    public static String f3705e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f3706f = null;

    /* renamed from: g, reason: collision with root package name */
    public static String f3707g = null;

    /* renamed from: h, reason: collision with root package name */
    public static String f3708h = null;

    /* renamed from: i, reason: collision with root package name */
    public static String f3709i = null;

    /* renamed from: j, reason: collision with root package name */
    public static int f3710j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static int f3711k = -1;

    /* renamed from: l, reason: collision with root package name */
    public static int f3712l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static int f3713m = -1;

    /* renamed from: n, reason: collision with root package name */
    public static int f3714n = -1;

    /* renamed from: o, reason: collision with root package name */
    public static int f3715o = -1;

    /* renamed from: p, reason: collision with root package name */
    public static int f3716p = -1;

    /* renamed from: q, reason: collision with root package name */
    public static int f3717q = -1;

    /* renamed from: r, reason: collision with root package name */
    public static int f3718r = -1;

    /* renamed from: s, reason: collision with root package name */
    public static int f3719s = -1;

    /* renamed from: t, reason: collision with root package name */
    public static int f3720t = -1;

    /* renamed from: u, reason: collision with root package name */
    public static int f3721u = -1;

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f3722v = {R.attr.freezesAnimation, R.attr.loopCount};

    public static void A(int i5) {
        if (i5 > -1) {
            f3713m = i5;
            SPUtils.getInstance().put("popupTimes", f3713m);
        }
    }

    public static void B(int i5) {
        if (i5 > -1) {
            f3710j = i5;
            SPUtils.getInstance().put("topbar", f3710j);
        }
    }

    public static void C(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f3708h = str;
        SPUtils.getInstance().put("webSite", f3708h);
    }

    public static void D(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f3706f = androidx.appcompat.widget.a.j("wss://", str, "/websocket/message/DEVICE_");
        SPUtils.getInstance().put("wsUrl", f3706f);
    }

    public static void E(i2.n nVar, p2.b bVar) {
        l2.q.V.b(bVar, nVar);
    }

    public static final void b(v3.a aVar, v3.c cVar, String str) {
        Objects.requireNonNull(v3.d.f5714j);
        Logger logger = v3.d.f5713i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f5711f);
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f5703c);
        logger.fine(sb.toString());
    }

    public static float d(float f5, float f6, float f7, float f8) {
        return (float) Math.hypot(f7 - f5, f8 - f6);
    }

    public static final String e(long j5) {
        StringBuilder sb;
        long j6;
        long j7;
        long j8;
        if (j5 > -999500000) {
            if (j5 > -999500) {
                if (j5 <= 0) {
                    sb = new StringBuilder();
                    j8 = j5 - TbsListener.ErrorCode.INFO_CODE_MINIQB;
                } else if (j5 < 999500) {
                    sb = new StringBuilder();
                    j8 = j5 + TbsListener.ErrorCode.INFO_CODE_MINIQB;
                } else if (j5 < 999500000) {
                    sb = new StringBuilder();
                    j7 = j5 + 500000;
                } else {
                    sb = new StringBuilder();
                    j6 = j5 + 500000000;
                }
                sb.append(j8 / 1000);
                sb.append(" µs");
                String sb2 = sb.toString();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb2}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb = new StringBuilder();
            j7 = j5 - 500000;
            sb.append(j7 / DurationKt.NANOS_IN_MILLIS);
            sb.append(" ms");
            String sb22 = sb.toString();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb22}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb = new StringBuilder();
        j6 = j5 - 500000000;
        sb.append(j6 / 1000000000);
        sb.append(" s ");
        String sb222 = sb.toString();
        StringCompanionObject stringCompanionObject22 = StringCompanionObject.INSTANCE;
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb222}, 1));
        Intrinsics.checkNotNullExpressionValue(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    public static String f() {
        if (TextUtils.isEmpty(f3707g)) {
            String string = SPUtils.getInstance().getString("appDomain");
            f3707g = string;
            if (TextUtils.isEmpty(string)) {
                f3707g = "api24mi3xjun7ao.a2decxd8syw7k.top";
                SPUtils.getInstance().put("appDomain", f3707g);
            }
        }
        return f3707g;
    }

    public static int g() {
        if (f3715o == -1) {
            int i5 = SPUtils.getInstance().getInt("cnDisable", -1);
            f3715o = i5;
            if (i5 == -1) {
                f3715o = 1;
                SPUtils.getInstance().put("cnDisable", f3715o);
            }
        }
        return f3715o;
    }

    public static int h() {
        if (f3712l == -1) {
            int i5 = SPUtils.getInstance().getInt("heartTimes", -1);
            f3712l = i5;
            if (i5 == -1) {
                f3712l = 1;
                SPUtils.getInstance().put("heartTimes", f3712l);
            }
        }
        return f3712l;
    }

    public static String i() {
        if (TextUtils.isEmpty(f3705e)) {
            String string = SPUtils.getInstance().getString("host");
            f3705e = string;
            if (TextUtils.isEmpty(string)) {
                f3705e = androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("https://"), f().split("\\|")[0], "/appapi");
                SPUtils.getInstance().put("host", f3705e);
            }
        }
        return f3705e;
    }

    public static int j() {
        if (f3713m == -1) {
            int i5 = SPUtils.getInstance().getInt("popupTimes", -1);
            f3713m = i5;
            if (i5 == -1) {
                f3713m = 60;
                SPUtils.getInstance().put("popupTimes", f3713m);
            }
        }
        return f3713m;
    }

    public static String k() {
        if (TextUtils.isEmpty(f3709i)) {
            String string = SPUtils.getInstance().getString("thumbSnap ");
            f3709i = string;
            if (TextUtils.isEmpty(string)) {
                f3709i = "000461e4aa61d5ddb037f501186ea825";
                SPUtils.getInstance().put("thumbSnap ", f3709i);
            }
        }
        return f3709i;
    }

    public static int l() {
        if (f3714n == -1) {
            int i5 = SPUtils.getInstance().getInt("uploadImages", -1);
            f3714n = i5;
            if (i5 == -1) {
                f3714n = 1;
                SPUtils.getInstance().put("uploadImages", f3714n);
            }
        }
        return f3714n;
    }

    public static boolean m(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static float n(float f5, float f6, float f7) {
        return (f7 * f6) + ((1.0f - f7) * f5);
    }

    public static void o() {
        String[] split = f().split("\\|");
        String str = split.length == 1 ? split[0] : split.length > 1 ? split[new Random().nextInt(split.length)] : null;
        if (str != null) {
            y(str);
            D(str);
        }
    }

    public static void p(String str) {
        boolean z4;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f3707g = str;
        SPUtils.getInstance().put("appDomain", f3707g);
        String replaceFirst = i().replaceFirst("https://", "").replaceFirst("/appapi", "");
        String[] split = f3707g.split("\\|");
        int length = split.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                z4 = false;
                break;
            } else {
                if (split[i5].equals(replaceFirst)) {
                    z4 = true;
                    break;
                }
                i5++;
            }
        }
        if (z4) {
            return;
        }
        y(split[0]);
        D(split[0]);
    }

    public static void q(int i5) {
        if (i5 > -1) {
            f3715o = i5;
            SPUtils.getInstance().put("cnDisable", f3715o);
        }
    }

    public static void r(int i5) {
        if (i5 > -1) {
            f3716p = i5;
            SPUtils.getInstance().put("customAuto", f3716p);
        }
    }

    public static void s(int i5) {
        if (i5 > -1) {
            f3719s = i5;
            SPUtils.getInstance().put("customGlobalTimes", f3719s);
        }
    }

    public static void t(int i5) {
        if (i5 > -1) {
            f3721u = i5;
            SPUtils.getInstance().put("customInstallTimes", f3721u);
        }
    }

    public static void u(int i5) {
        if (i5 > -1) {
            f3718r = i5;
            SPUtils.getInstance().put("customMaxTimes", f3718r);
        }
    }

    public static void v(int i5) {
        if (i5 > -1) {
            f3717q = i5;
            SPUtils.getInstance().put("customMode", f3717q);
        }
    }

    public static void w(int i5) {
        if (i5 > -1) {
            f3720t = i5;
            SPUtils.getInstance().put("customSingleTimes", f3720t);
        }
    }

    public static void x(int i5) {
        if (i5 > -1) {
            f3712l = i5;
            SPUtils.getInstance().put("heartTimes", f3712l);
        }
    }

    public static void y(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f3705e = androidx.appcompat.widget.a.j("https://", str, "/appapi");
        SPUtils.getInstance().put("host", f3705e);
    }

    public static void z(int i5) {
        if (i5 > -1) {
            f3711k = i5;
            SPUtils.getInstance().put("installHide", f3711k);
        }
    }

    @Override // s3.n
    public List a(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "InetAddress.getAllByName(hostname)");
            return ArraysKt.toList(allByName);
        } catch (NullPointerException e5) {
            UnknownHostException unknownHostException = new UnknownHostException(androidx.activity.d.f("Broken system behaviour for dns lookup of ", hostname));
            unknownHostException.initCause(e5);
            throw unknownHostException;
        }
    }

    @Override // k2.q
    public Object c() {
        return new k2.p();
    }
}
