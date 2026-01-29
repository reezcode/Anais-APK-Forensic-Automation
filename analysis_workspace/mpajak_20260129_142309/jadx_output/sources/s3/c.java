package s3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final a f5180n = new a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5181a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5183c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5184d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5185e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5186f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5187g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5188h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5189i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5190j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5191k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5192l;

    /* renamed from: m, reason: collision with root package name */
    public String f5193m;

    /* loaded from: classes15.dex */
    public static final class a {
        public final int a(String str, String str2, int i5) {
            boolean contains$default;
            int length = str.length();
            while (i5 < length) {
                contains$default = StringsKt__StringsKt.contains$default(str2, str.charAt(i5), false, 2, (Object) null);
                if (contains$default) {
                    return i5;
                }
                i5++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final s3.c b(s3.r r28) {
            /*
                Method dump skipped, instructions count: 421
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.c.a.b(s3.r):s3.c");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z4, boolean z5, int i5, int i6, boolean z6, boolean z7, boolean z8, int i7, int i8, boolean z9, boolean z10, boolean z11, String str) {
        this.f5181a = z4;
        this.f5182b = z5;
        this.f5183c = i5;
        this.f5184d = i6;
        this.f5185e = z6;
        this.f5186f = z7;
        this.f5187g = z8;
        this.f5188h = i7;
        this.f5189i = i8;
        this.f5190j = z9;
        this.f5191k = z10;
        this.f5192l = z11;
        this.f5193m = str;
    }

    public final String toString() {
        String str = this.f5193m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5181a) {
            sb.append("no-cache, ");
        }
        if (this.f5182b) {
            sb.append("no-store, ");
        }
        if (this.f5183c != -1) {
            sb.append("max-age=");
            sb.append(this.f5183c);
            sb.append(", ");
        }
        if (this.f5184d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f5184d);
            sb.append(", ");
        }
        if (this.f5185e) {
            sb.append("private, ");
        }
        if (this.f5186f) {
            sb.append("public, ");
        }
        if (this.f5187g) {
            sb.append("must-revalidate, ");
        }
        if (this.f5188h != -1) {
            sb.append("max-stale=");
            sb.append(this.f5188h);
            sb.append(", ");
        }
        if (this.f5189i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f5189i);
            sb.append(", ");
        }
        if (this.f5190j) {
            sb.append("only-if-cached, ");
        }
        if (this.f5191k) {
            sb.append("no-transform, ");
        }
        if (this.f5192l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f5193m = sb2;
        return sb2;
    }
}
