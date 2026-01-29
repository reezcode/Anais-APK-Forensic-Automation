package x2;

import java.util.Arrays;
import x2.b;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5926b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final b f5927a;

    public c(b bVar) {
        this.f5927a = bVar;
    }

    public final void a(StringBuilder sb, Object obj) {
        String arrays;
        if (obj == f5926b) {
            return;
        }
        if (obj == null) {
            arrays = "null";
        } else {
            if (!obj.getClass().isArray()) {
                sb.append(obj);
                return;
            }
            arrays = Arrays.toString((Object[]) obj);
        }
        sb.append(arrays);
    }

    public final void b(String str, Object obj) {
        b.a aVar = b.a.DEBUG;
        Object obj2 = f5926b;
        f(aVar, null, str, obj, obj2, obj2, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        f(b.a.DEBUG, null, str, obj, obj2, f5926b, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        f(b.a.DEBUG, null, str, obj, obj2, obj3, null);
    }

    public final void e(String str, Object obj, Object obj2) {
        f(b.a.INFO, null, str, obj, obj2, f5926b, null);
    }

    public final void f(b.a aVar, Throwable th, String str, Object obj, Object obj2, Object obj3, Object[] objArr) {
        if (this.f5927a.b(aVar)) {
            StringBuilder sb = null;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int indexOf = str.indexOf("{}", i5);
                if (indexOf == -1) {
                    break;
                }
                if (sb == null) {
                    sb = new StringBuilder(128);
                }
                sb.append((CharSequence) str, i5, indexOf);
                i5 = indexOf + 2;
                if (objArr == null) {
                    if (i6 == 0) {
                        a(sb, obj);
                    } else if (i6 == 1) {
                        a(sb, obj2);
                    } else if (i6 == 2) {
                        a(sb, obj3);
                    }
                } else if (i6 < objArr.length) {
                    a(sb, objArr[i6]);
                }
                i6++;
            }
            if (sb != null) {
                sb.append((CharSequence) str, i5, str.length());
                str = sb.toString();
            }
            if (th == null) {
                this.f5927a.a(aVar, str);
            } else {
                this.f5927a.c(aVar, str, th);
            }
        }
    }

    public final void g(String str, Object obj) {
        b.a aVar = b.a.TRACE;
        Object obj2 = f5926b;
        f(aVar, null, str, obj, obj2, obj2, null);
    }

    public final void h(String str, Object obj, Object obj2) {
        f(b.a.TRACE, null, str, obj, obj2, f5926b, null);
    }

    public final void i(String str, Object obj, Object obj2, Object obj3) {
        f(b.a.TRACE, null, str, obj, obj2, obj3, null);
    }
}
