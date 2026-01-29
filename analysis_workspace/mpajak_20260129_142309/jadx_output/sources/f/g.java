package f;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import k.h0;
import k.q0;
import k.x0;
import k.z;

/* loaded from: classes14.dex */
public final class g implements f.c {

    /* renamed from: e, reason: collision with root package name */
    public static ConcurrentMap<String, g> f2692e = new ConcurrentHashMap(128, 0.75f, 1);

    /* renamed from: b, reason: collision with root package name */
    public final String f2693b;

    /* renamed from: c, reason: collision with root package name */
    public r[] f2694c;

    /* renamed from: d, reason: collision with root package name */
    public x0 f2695d;

    /* loaded from: classes12.dex */
    public static class a implements r {

        /* renamed from: a, reason: collision with root package name */
        public final int f2696a;

        public a(int i5) {
            this.f2696a = i5;
        }

        @Override // f.g.r
        public final Object a(g gVar, Object obj, Object obj2) {
            return gVar.c(obj2, this.f2696a);
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2697a;

        /* renamed from: b, reason: collision with root package name */
        public final double f2698b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2699c;

        /* renamed from: d, reason: collision with root package name */
        public final long f2700d;

        public b(String str, double d5, int i5) {
            this.f2697a = str;
            this.f2698b = d5;
            this.f2699c = i5;
            this.f2700d = m.j.t(str);
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            Object e5 = gVar.e(obj, this.f2697a, this.f2700d);
            if (e5 == null || !(e5 instanceof Number)) {
                return false;
            }
            double doubleValue = ((Number) e5).doubleValue();
            int i5 = this.f2699c;
            return i5 == 1 ? doubleValue == this.f2698b : i5 == 2 ? doubleValue != this.f2698b : i5 == 4 ? doubleValue >= this.f2698b : i5 == 3 ? doubleValue > this.f2698b : i5 == 6 ? doubleValue <= this.f2698b : i5 == 5 && doubleValue < this.f2698b;
        }
    }

    /* loaded from: classes20.dex */
    public interface c {
        boolean a(g gVar, Object obj);
    }

    /* loaded from: classes4.dex */
    public static class d implements r {

        /* renamed from: a, reason: collision with root package name */
        public final c f2701a;

        public d(c cVar) {
            this.f2701a = cVar;
        }

        @Override // f.g.r
        public final Object a(g gVar, Object obj, Object obj2) {
            if (obj2 == null) {
                return null;
            }
            f.b bVar = new f.b();
            if (!(obj2 instanceof Iterable)) {
                if (this.f2701a.a(gVar, obj2)) {
                    return obj2;
                }
                return null;
            }
            for (Object obj3 : (Iterable) obj2) {
                if (this.f2701a.a(gVar, obj3)) {
                    bVar.add(obj3);
                }
            }
            return bVar;
        }
    }

    /* loaded from: classes5.dex */
    public static class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2702a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2703b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2704c;

        /* renamed from: d, reason: collision with root package name */
        public final long f2705d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f2706e;

        public e(String str, long j5, long j6, boolean z4) {
            this.f2702a = str;
            this.f2703b = m.j.t(str);
            this.f2704c = j5;
            this.f2705d = j6;
            this.f2706e = z4;
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            Object e5 = gVar.e(obj, this.f2702a, this.f2703b);
            if (e5 == null) {
                return false;
            }
            if (e5 instanceof Number) {
                long longValue = ((Number) e5).longValue();
                if (longValue >= this.f2704c && longValue <= this.f2705d) {
                    return !this.f2706e;
                }
            }
            return this.f2706e;
        }
    }

    /* loaded from: classes24.dex */
    public static class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2707a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2708b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f2709c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2710d;

        public f(String str, long[] jArr, boolean z4) {
            this.f2707a = str;
            this.f2708b = m.j.t(str);
            this.f2709c = jArr;
            this.f2710d = z4;
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            Object e5 = gVar.e(obj, this.f2707a, this.f2708b);
            if (e5 == null) {
                return false;
            }
            if (e5 instanceof Number) {
                long longValue = ((Number) e5).longValue();
                for (long j5 : this.f2709c) {
                    if (j5 == longValue) {
                        return !this.f2710d;
                    }
                }
            }
            return this.f2710d;
        }
    }

    /* renamed from: f.g$g, reason: collision with other inner class name */
    /* loaded from: classes25.dex */
    public static class C0032g implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2711a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2712b;

        /* renamed from: c, reason: collision with root package name */
        public final Long[] f2713c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2714d;

        public C0032g(String str, Long[] lArr, boolean z4) {
            this.f2711a = str;
            this.f2712b = m.j.t(str);
            this.f2713c = lArr;
            this.f2714d = z4;
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            Object e5 = gVar.e(obj, this.f2711a, this.f2712b);
            int i5 = 0;
            if (e5 == null) {
                Long[] lArr = this.f2713c;
                int length = lArr.length;
                while (i5 < length) {
                    if (lArr[i5] != null) {
                        i5++;
                    }
                }
                return this.f2714d;
            }
            if (e5 instanceof Number) {
                long longValue = ((Number) e5).longValue();
                Long[] lArr2 = this.f2713c;
                int length2 = lArr2.length;
                while (i5 < length2) {
                    Long l5 = lArr2[i5];
                    if (l5 == null || l5.longValue() != longValue) {
                        i5++;
                    }
                }
            }
            return this.f2714d;
            return !this.f2714d;
        }
    }

    /* loaded from: classes21.dex */
    public static class h implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2715a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2716b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2717c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2718d;

        public h(String str, long j5, int i5) {
            this.f2715a = str;
            this.f2716b = m.j.t(str);
            this.f2717c = j5;
            this.f2718d = i5;
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            Object e5 = gVar.e(obj, this.f2715a, this.f2716b);
            if (e5 == null || !(e5 instanceof Number)) {
                return false;
            }
            long longValue = ((Number) e5).longValue();
            int i5 = this.f2718d;
            return i5 == 1 ? longValue == this.f2717c : i5 == 2 ? longValue != this.f2717c : i5 == 4 ? longValue >= this.f2717c : i5 == 3 ? longValue > this.f2717c : i5 == 6 ? longValue <= this.f2717c : i5 == 5 && longValue < this.f2717c;
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public final String f2719a;

        /* renamed from: b, reason: collision with root package name */
        public int f2720b;

        /* renamed from: c, reason: collision with root package name */
        public char f2721c;

        /* renamed from: d, reason: collision with root package name */
        public int f2722d;

        public i(String str) {
            this.f2719a = str;
            d();
        }

        public static boolean b(char c5) {
            return c5 == '-' || c5 == '+' || (c5 >= '0' && c5 <= '9');
        }

        public final void a(char c5) {
            if (this.f2721c == c5) {
                if (c()) {
                    return;
                }
                d();
            } else {
                throw new f.i("expect '" + c5 + ", but '" + this.f2721c + "'");
            }
        }

        public final boolean c() {
            return this.f2720b >= this.f2719a.length();
        }

        public final void d() {
            String str = this.f2719a;
            int i5 = this.f2720b;
            this.f2720b = i5 + 1;
            this.f2721c = str.charAt(i5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:265:0x03f5, code lost:
        
            if (r5 == 8) goto L433;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0179  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final f.g.r e(boolean r17) {
            /*
                Method dump skipped, instructions count: 1595
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f.g.i.e(boolean):f.g$r");
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
        
            if (r1 != '-') goto L7;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0019 -> B:12:0x000e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long f() {
            /*
                r3 = this;
                int r0 = r3.f2720b
                int r0 = r0 + (-1)
                char r1 = r3.f2721c
                r2 = 43
                if (r1 == r2) goto Le
                r2 = 45
                if (r1 != r2) goto L11
            Le:
                r3.d()
            L11:
                char r1 = r3.f2721c
                r2 = 48
                if (r1 < r2) goto L1c
                r2 = 57
                if (r1 > r2) goto L1c
                goto Le
            L1c:
                int r1 = r3.f2720b
                int r1 = r1 + (-1)
                java.lang.String r2 = r3.f2719a
                java.lang.String r0 = r2.substring(r0, r1)
                long r0 = java.lang.Long.parseLong(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.g.i.f():long");
        }

        public final String g() {
            j();
            char c5 = this.f2721c;
            if (c5 != '\\') {
                boolean[] zArr = m.e.f4083c;
                if (!(c5 < zArr.length && zArr[c5])) {
                    StringBuilder g5 = androidx.activity.d.g("illeal jsonpath syntax. ");
                    g5.append(this.f2719a);
                    throw new f.i(g5.toString());
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!c()) {
                char c6 = this.f2721c;
                if (c6 == '\\') {
                    d();
                    sb.append(this.f2721c);
                    if (c()) {
                        break;
                    }
                    d();
                } else {
                    boolean[] zArr2 = m.e.f4084d;
                    if (!(c6 < zArr2.length && zArr2[c6])) {
                        break;
                    }
                    sb.append(c6);
                    d();
                }
            }
            if (c()) {
                char c7 = this.f2721c;
                boolean[] zArr3 = m.e.f4084d;
                if (c7 < zArr3.length && zArr3[c7]) {
                    sb.append(c7);
                }
            }
            return sb.toString();
        }

        public final String h() {
            char c5 = this.f2721c;
            d();
            int i5 = this.f2720b - 1;
            while (this.f2721c != c5 && !c()) {
                d();
            }
            String substring = this.f2719a.substring(i5, c() ? this.f2720b : this.f2720b - 1);
            a(c5);
            return substring;
        }

        public final Object i() {
            j();
            if (b(this.f2721c)) {
                return Long.valueOf(f());
            }
            char c5 = this.f2721c;
            if (c5 == '\"' || c5 == '\'') {
                return h();
            }
            if (c5 != 'n') {
                throw new UnsupportedOperationException();
            }
            if ("null".equals(g())) {
                return null;
            }
            throw new f.i(this.f2719a);
        }

        public final void j() {
            while (true) {
                char c5 = this.f2721c;
                if (c5 > ' ') {
                    return;
                }
                if (c5 != ' ' && c5 != '\r' && c5 != '\n' && c5 != '\t' && c5 != '\f' && c5 != '\b') {
                    return;
                } else {
                    d();
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class j implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2723a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2724b;

        /* renamed from: c, reason: collision with root package name */
        public final String f2725c;

        /* renamed from: d, reason: collision with root package name */
        public final String f2726d;

        /* renamed from: e, reason: collision with root package name */
        public final String[] f2727e;

        /* renamed from: f, reason: collision with root package name */
        public final int f2728f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f2729g;

        public j(String str, String str2, String str3, String[] strArr, boolean z4) {
            this.f2723a = str;
            this.f2724b = m.j.t(str);
            this.f2725c = str2;
            this.f2726d = str3;
            this.f2727e = strArr;
            this.f2729g = z4;
            int length = str2 != null ? str2.length() + 0 : 0;
            length = str3 != null ? length + str3.length() : length;
            if (strArr != null) {
                for (String str4 : strArr) {
                    length += str4.length();
                }
            }
            this.f2728f = length;
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            int i5;
            Object e5 = gVar.e(obj, this.f2723a, this.f2724b);
            if (e5 == null) {
                return false;
            }
            String obj2 = e5.toString();
            if (obj2.length() < this.f2728f) {
                return this.f2729g;
            }
            String str = this.f2725c;
            if (str == null) {
                i5 = 0;
            } else {
                if (!obj2.startsWith(str)) {
                    return this.f2729g;
                }
                i5 = this.f2725c.length() + 0;
            }
            String[] strArr = this.f2727e;
            if (strArr != null) {
                for (String str2 : strArr) {
                    int indexOf = obj2.indexOf(str2, i5);
                    if (indexOf == -1) {
                        return this.f2729g;
                    }
                    i5 = indexOf + str2.length();
                }
            }
            String str3 = this.f2726d;
            return (str3 == null || obj2.endsWith(str3)) ? !this.f2729g : this.f2729g;
        }
    }

    /* loaded from: classes5.dex */
    public static class k implements r {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f2730a;

        public k(int[] iArr) {
            this.f2730a = iArr;
        }

        @Override // f.g.r
        public final Object a(g gVar, Object obj, Object obj2) {
            ArrayList arrayList = new ArrayList(this.f2730a.length);
            int i5 = 0;
            while (true) {
                int[] iArr = this.f2730a;
                if (i5 >= iArr.length) {
                    return arrayList;
                }
                arrayList.add(gVar.c(obj2, iArr[i5]));
                i5++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class l implements r {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f2731a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f2732b;

        public l(String[] strArr) {
            this.f2731a = strArr;
            this.f2732b = new long[strArr.length];
            int i5 = 0;
            while (true) {
                long[] jArr = this.f2732b;
                if (i5 >= jArr.length) {
                    return;
                }
                jArr[i5] = m.j.t(strArr[i5]);
                i5++;
            }
        }

        @Override // f.g.r
        public final Object a(g gVar, Object obj, Object obj2) {
            ArrayList arrayList = new ArrayList(this.f2731a.length);
            int i5 = 0;
            while (true) {
                String[] strArr = this.f2731a;
                if (i5 >= strArr.length) {
                    return arrayList;
                }
                arrayList.add(gVar.e(obj2, strArr[i5], this.f2732b[i5]));
                i5++;
            }
        }
    }

    /* loaded from: classes11.dex */
    public static class m implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2733a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2734b;

        public m(String str) {
            this.f2733a = str;
            this.f2734b = m.j.t(str);
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            return gVar.e(obj, this.f2733a, this.f2734b) != null;
        }
    }

    /* loaded from: classes13.dex */
    public static class n implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2735a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2736b;

        public n(String str) {
            this.f2735a = str;
            this.f2736b = m.j.t(str);
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            return gVar.e(obj, this.f2735a, this.f2736b) == null;
        }
    }

    /* loaded from: classes18.dex */
    public static class o implements r {

        /* renamed from: a, reason: collision with root package name */
        public final String f2737a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2738b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2739c;

        public o(String str, boolean z4) {
            this.f2737a = str;
            this.f2738b = m.j.t(str);
            this.f2739c = z4;
        }

        @Override // f.g.r
        public final Object a(g gVar, Object obj, Object obj2) {
            if (!this.f2739c) {
                return gVar.e(obj2, this.f2737a, this.f2738b);
            }
            ArrayList arrayList = new ArrayList();
            gVar.a(obj2, this.f2737a, arrayList);
            return arrayList;
        }
    }

    /* loaded from: classes8.dex */
    public static class p implements r {

        /* renamed from: a, reason: collision with root package name */
        public final int f2740a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2741b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2742c;

        public p(int i5, int i6, int i7) {
            this.f2740a = i5;
            this.f2741b = i6;
            this.f2742c = i7;
        }

        @Override // f.g.r
        public final Object a(g gVar, Object obj, Object obj2) {
            int intValue = s.f2747a.b(gVar, obj2).intValue();
            int i5 = this.f2740a;
            if (i5 < 0) {
                i5 += intValue;
            }
            int i6 = this.f2741b;
            if (i6 < 0) {
                i6 += intValue;
            }
            int i7 = ((i6 - i5) / this.f2742c) + 1;
            if (i7 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i7);
            while (i5 <= i6 && i5 < intValue) {
                arrayList.add(gVar.c(obj2, i5));
                i5 += this.f2742c;
            }
            return arrayList;
        }
    }

    /* loaded from: classes8.dex */
    public static class q implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2743a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2744b;

        /* renamed from: c, reason: collision with root package name */
        public final Pattern f2745c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2746d;

        public q(String str, String str2, boolean z4) {
            this.f2743a = str;
            this.f2744b = m.j.t(str);
            this.f2745c = Pattern.compile(str2);
            this.f2746d = z4;
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            Object e5 = gVar.e(obj, this.f2743a, this.f2744b);
            if (e5 == null) {
                return false;
            }
            boolean matches = this.f2745c.matcher(e5.toString()).matches();
            return this.f2746d ? !matches : matches;
        }
    }

    /* loaded from: classes16.dex */
    public interface r {
        Object a(g gVar, Object obj, Object obj2);
    }

    /* loaded from: classes21.dex */
    public static class s implements r {

        /* renamed from: a, reason: collision with root package name */
        public static final s f2747a = new s();

        @Override // f.g.r
        public final /* bridge */ /* synthetic */ Object a(g gVar, Object obj, Object obj2) {
            return b(gVar, obj2);
        }

        public final Integer b(g gVar, Object obj) {
            int i5;
            if (obj != null) {
                if (obj instanceof Collection) {
                    i5 = ((Collection) obj).size();
                } else if (obj instanceof Object[]) {
                    i5 = ((Object[]) obj).length;
                } else if (obj.getClass().isArray()) {
                    i5 = Array.getLength(obj);
                } else {
                    int i6 = 0;
                    if (obj instanceof Map) {
                        Iterator it = ((Map) obj).values().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                i6++;
                            }
                        }
                    } else {
                        h0 d5 = gVar.d(obj.getClass());
                        if (d5 != null) {
                            try {
                                for (z zVar : d5.f3698j) {
                                    if (zVar.b(obj) != null) {
                                        i6++;
                                    }
                                }
                            } catch (Exception e5) {
                                StringBuilder g5 = androidx.activity.d.g("evalSize error : ");
                                g5.append(gVar.f2693b);
                                throw new f.i(g5.toString(), e5);
                            }
                        }
                    }
                    i5 = i6;
                }
                return Integer.valueOf(i5);
            }
            i5 = -1;
            return Integer.valueOf(i5);
        }
    }

    /* loaded from: classes8.dex */
    public static class t implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2748a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2749b;

        /* renamed from: c, reason: collision with root package name */
        public final String[] f2750c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2751d;

        public t(String str, String[] strArr, boolean z4) {
            this.f2748a = str;
            this.f2749b = m.j.t(str);
            this.f2750c = strArr;
            this.f2751d = z4;
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            Object e5 = gVar.e(obj, this.f2748a, this.f2749b);
            for (String str : this.f2750c) {
                if (str == e5 || (str != null && str.equals(e5))) {
                    return !this.f2751d;
                }
            }
            return this.f2751d;
        }
    }

    /* loaded from: classes7.dex */
    public static class u implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2752a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2753b;

        /* renamed from: c, reason: collision with root package name */
        public final String f2754c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2755d;

        public u(String str, String str2, int i5) {
            this.f2752a = str;
            this.f2753b = m.j.t(str);
            this.f2754c = str2;
            this.f2755d = i5;
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            Object e5 = gVar.e(obj, this.f2752a, this.f2753b);
            int i5 = this.f2755d;
            if (i5 == 1) {
                return this.f2754c.equals(e5);
            }
            if (i5 == 2) {
                return !this.f2754c.equals(e5);
            }
            if (e5 == null) {
                return false;
            }
            int compareTo = this.f2754c.compareTo(e5.toString());
            int i6 = this.f2755d;
            return i6 == 4 ? compareTo <= 0 : i6 == 3 ? compareTo < 0 : i6 == 6 ? compareTo >= 0 : i6 == 5 && compareTo > 0;
        }
    }

    /* loaded from: classes2.dex */
    public static class v implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f2756a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2757b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f2758c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2759d;

        public v(String str, Object obj, boolean z4) {
            this.f2759d = true;
            if (obj == null) {
                throw new IllegalArgumentException("value is null");
            }
            this.f2756a = str;
            this.f2757b = m.j.t(str);
            this.f2758c = obj;
            this.f2759d = z4;
        }

        @Override // f.g.c
        public final boolean a(g gVar, Object obj) {
            boolean equals = this.f2758c.equals(gVar.e(obj, this.f2756a, this.f2757b));
            return !this.f2759d ? !equals : equals;
        }
    }

    /* loaded from: classes7.dex */
    public static class w implements r {

        /* renamed from: a, reason: collision with root package name */
        public static w f2760a = new w();

        @Override // f.g.r
        public final Object a(g gVar, Object obj, Object obj2) {
            h0 d5 = gVar.d(obj2.getClass());
            if (d5 == null) {
                if (obj2 instanceof Map) {
                    return ((Map) obj2).values();
                }
                throw new UnsupportedOperationException();
            }
            try {
                return d5.l(obj2);
            } catch (Exception e5) {
                StringBuilder g5 = androidx.activity.d.g("jsonpath error, path ");
                g5.append(gVar.f2693b);
                throw new f.i(g5.toString(), e5);
            }
        }
    }

    public g(String str) {
        x0 x0Var = x0.f3759f;
        i.i iVar = i.i.f3229n;
        if (str.length() == 0) {
            throw new f.i("json-path can not be null or empty");
        }
        this.f2693b = str;
        this.f2695d = x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, f.g>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, f.g>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, f.g>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, f.g>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(java.lang.Object r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g.b(java.lang.Object, java.lang.String):java.lang.Object");
    }

    public static boolean f(Class<?> cls) {
        return cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class;
    }

    public final void a(Object obj, String str, List<Object> list) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(str)) {
                list.add(map.get(str));
                return;
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                a(it.next(), str, list);
            }
            return;
        }
        h0 d5 = d(obj.getClass());
        if (d5 == null) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                for (int i5 = 0; i5 < list2.size(); i5++) {
                    a(list2.get(i5), str, list);
                }
                return;
            }
            return;
        }
        try {
            z j5 = d5.j(str);
            if (j5 == null) {
                Iterator it2 = ((ArrayList) d5.l(obj)).iterator();
                while (it2.hasNext()) {
                    a(it2.next(), str, list);
                }
                return;
            }
            try {
                try {
                    list.add(j5.b(obj));
                } catch (InvocationTargetException e5) {
                    throw new f.d("getFieldValue error." + str, e5);
                }
            } catch (IllegalAccessException e6) {
                throw new f.d("getFieldValue error." + str, e6);
            }
        } catch (Exception e7) {
            StringBuilder g5 = androidx.activity.d.g("jsonpath error, path ");
            g5.append(this.f2693b);
            g5.append(", segement ");
            g5.append(str);
            throw new f.i(g5.toString(), e7);
        }
    }

    public final Object c(Object obj, int i5) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (i5 >= 0) {
                if (i5 < list.size()) {
                    return list.get(i5);
                }
                return null;
            }
            if (Math.abs(i5) <= list.size()) {
                return list.get(list.size() + i5);
            }
            return null;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            if (i5 >= 0) {
                if (i5 < length) {
                    return Array.get(obj, i5);
                }
                return null;
            }
            if (Math.abs(i5) <= length) {
                return Array.get(obj, length + i5);
            }
            return null;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(Integer.valueOf(i5));
            return obj2 == null ? map.get(Integer.toString(i5)) : obj2;
        }
        if (!(obj instanceof Collection)) {
            throw new UnsupportedOperationException();
        }
        int i6 = 0;
        for (Object obj3 : (Collection) obj) {
            if (i6 == i5) {
                return obj3;
            }
            i6++;
        }
        return null;
    }

    public final h0 d(Class<?> cls) {
        q0 c5 = this.f2695d.c(cls);
        if (c5 instanceof h0) {
            return (h0) c5;
        }
        return null;
    }

    public final Object e(Object obj, String str, long j5) {
        int i5;
        int i6;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(str);
            return (obj2 == null && 5614464919154503228L == j5) ? Integer.valueOf(map.size()) : obj2;
        }
        h0 d5 = d(obj.getClass());
        if (d5 != null) {
            try {
                return d5.k(obj, str, j5);
            } catch (Exception e5) {
                StringBuilder g5 = androidx.activity.d.g("jsonpath error, path ");
                g5.append(this.f2693b);
                g5.append(", segement ");
                g5.append(str);
                throw new f.i(g5.toString(), e5);
            }
        }
        if (!(obj instanceof List)) {
            if (obj instanceof Enum) {
                Enum r6 = (Enum) obj;
                if (-4270347329889690746L == j5) {
                    return r6.name();
                }
                if (-1014497654951707614L == j5) {
                    i6 = r6.ordinal();
                }
            }
            if (obj instanceof Calendar) {
                Calendar calendar = (Calendar) obj;
                if (8963398325558730460L == j5) {
                    i5 = 1;
                } else if (-811277319855450459L == j5) {
                    i5 = 2;
                } else if (-3851359326990528739L == j5) {
                    i5 = 5;
                } else if (4647432019745535567L == j5) {
                    i5 = 11;
                } else if (6607618197526598121L == j5) {
                    i5 = 12;
                } else if (-6586085717218287427L == j5) {
                    i5 = 13;
                }
                i6 = calendar.get(i5);
            }
            return null;
        }
        List list = (List) obj;
        if (5614464919154503228L != j5) {
            f.b bVar = new f.b(list.size());
            for (int i7 = 0; i7 < list.size(); i7++) {
                Object e6 = e(list.get(i7), str, j5);
                if (e6 instanceof Collection) {
                    bVar.addAll((Collection) e6);
                } else if (e6 != null) {
                    bVar.add(e6);
                }
            }
            return bVar;
        }
        i6 = list.size();
        return Integer.valueOf(i6);
    }

    @Override // f.c
    public final String l() {
        return f.a.x(this.f2693b);
    }
}
