package l4;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import k.j0;

/* loaded from: classes23.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Set<String> f4055a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4056b;

    /* renamed from: c, reason: collision with root package name */
    public final c f4057c;

    public f() {
        g gVar = new g();
        a aVar = new a();
        this.f4055a = new HashSet();
        this.f4056b = gVar;
        this.f4057c = aVar;
    }

    public final File a(Context context, String str, String str2) {
        String a5 = ((g) this.f4056b).a(str);
        return j0.m(str2) ? new File(context.getDir("lib", 0), a5) : new File(context.getDir("lib", 0), androidx.appcompat.widget.a.j(a5, ".", str2));
    }

    public final void b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (j0.m("pl_droidsonroids_gif")) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        d("Beginning load of %s...", "pl_droidsonroids_gif");
        c(context, "pl_droidsonroids_gif", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
    
        if (r2 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0153, code lost:
    
        if (r2 != null) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.f.c(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public final void d(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }
}
