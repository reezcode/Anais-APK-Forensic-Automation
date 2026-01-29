package marmojkfnf.dphnidckqxhm;

import android.content.Context;
import fmfjq.twyvy.xjhbp;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes21.dex */
public final class e0 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f4301h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f4302i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f4303j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f4304k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f4305l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f4306m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f4307n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f4308o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f4309p;

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f4310q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f4311r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4312a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4313b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4314c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4315d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4316e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4317f = 60;

    /* renamed from: g, reason: collision with root package name */
    public final long f4318g = 60;

    static {
        xjhbp.classescxclcy(83);
        f4301h = i0.a("WC1Hb29nLVdlc21qZmVmLUtleQ==");
        f4302i = i0.a("RVRhZw==");
        f4303j = i0.a("SWYtTm9uZS1NYXRjaA==");
        f4304k = i0.a("WC1BbmRyb2lkLVBhY2thZ2U=");
        f4305l = i0.a("WC1BbmRyb2lkLUNlcnQ=");
        f4306m = i0.a("WC1Hb29nbGUtR0ZFLUNhbi1SZXRyeQ==");
        f4307n = i0.a("WC1Hb29nLUZpcmViYXNlLUluc3RhbGxhdGlvbnMtQXV0aA==");
        f4309p = i0.a("eXl5eS1NTS1kZCdUJ0hIOm1tOnNzLlNTUydaJw==");
        f4311r = i0.a("aHR0cHM6Ly9maXJlYmFzZXJlbW90ZWNvbmZpZy5nb29nbGVhcGlzLmNvbS92MS9wcm9qZWN0cy8lcy9uYW1lc3BhY2VzLyVzOmZldGNo");
        f4308o = i0.a("5ZOl5Lym5biD");
        f4310q = Pattern.compile(i0.a("XlteOl0rOihbMC05XSspOihhbmRyb2lkfGlvc3x3ZWIpOihbMC05YS1mXSsp"));
    }

    public e0(Context context, String str, String str2, String str3) {
        this.f4312a = context;
        this.f4313b = str;
        this.f4314c = str2;
        this.f4315d = a(str);
        this.f4316e = str3;
    }

    public static native String a(String str);

    public static native boolean a(Context context, JSONObject jSONObject);

    public static native boolean a(JSONObject jSONObject, Context context);

    public final native JSONObject a(String str, String str2, Map<String, String> map, Long l5);

    public final native JSONObject a(HttpURLConnection httpURLConnection, String str, String str2, Map map, Map map2, Long l5);

    public final native JSONObject a(URLConnection uRLConnection);

    public final native void a(HttpURLConnection httpURLConnection, byte[] bArr);
}
