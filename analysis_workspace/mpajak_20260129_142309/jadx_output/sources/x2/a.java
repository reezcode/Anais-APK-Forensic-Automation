package x2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import x2.b;

/* loaded from: classes8.dex */
public final class a implements x2.b {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<DateFormat> f5912c = new C0083a();

    /* renamed from: d, reason: collision with root package name */
    public static PrintStream f5913d;

    /* renamed from: e, reason: collision with root package name */
    public static final List<b> f5914e;

    /* renamed from: a, reason: collision with root package name */
    public final String f5915a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f5916b;

    /* renamed from: x2.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static class C0083a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
        }
    }

    /* loaded from: classes25.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Pattern f5917a;

        /* renamed from: b, reason: collision with root package name */
        public b.a f5918b;

        public b(Pattern pattern, b.a aVar) {
            this.f5917a = pattern;
            this.f5918b = aVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    static {
        /*
            x2.a$a r0 = new x2.a$a
            r0.<init>()
            x2.a.f5912c = r0
            java.lang.Class<x2.a> r0 = x2.a.class
            java.lang.String r1 = "/ormliteLocalLog.properties"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L3c
            java.util.List r1 = d(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r0.close()     // Catch: java.io.IOException -> L19
            goto L3d
        L19:
            goto L3d
        L1b:
            r1 = move-exception
            goto L38
        L1d:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = "IO exception reading the log properties file '/ormliteLocalLog.properties': "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1b
            r3.append(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L1b
            r2.println(r1)     // Catch: java.lang.Throwable -> L1b
            r0.close()     // Catch: java.io.IOException -> L3c
            goto L3c
        L38:
            r0.close()     // Catch: java.io.IOException -> L3b
        L3b:
            throw r1
        L3c:
            r1 = 0
        L3d:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            x2.a.f5914e = r1
            java.lang.String r0 = "com.j256.ormlite.logger.file"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L4e
            java.io.PrintStream r0 = java.lang.System.out
            x2.a.f5913d = r0
            goto L5a
        L4e:
            java.io.PrintStream r1 = new java.io.PrintStream     // Catch: java.io.FileNotFoundException -> L5b
            java.io.File r2 = new java.io.File     // Catch: java.io.FileNotFoundException -> L5b
            r2.<init>(r0)     // Catch: java.io.FileNotFoundException -> L5b
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L5b
            x2.a.f5913d = r1     // Catch: java.io.FileNotFoundException -> L5b
        L5a:
            return
        L5b:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Log file "
            java.lang.String r4 = " was not found"
            java.lang.String r0 = androidx.appcompat.widget.a.j(r3, r0, r4)
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.a.<clinit>():void");
    }

    public a(String str) {
        String[] split = str.split("\\.");
        this.f5915a = split.length <= 1 ? str : split[split.length - 1];
        b.a aVar = null;
        List<b> list = f5914e;
        if (list != null) {
            for (b bVar : list) {
                if (bVar.f5917a.matcher(str).matches() && (aVar == null || bVar.f5918b.ordinal() < aVar.ordinal())) {
                    aVar = bVar.f5918b;
                }
            }
        }
        if (aVar == null) {
            String property = System.getProperty("com.j256.ormlite.logger.level");
            if (property == null) {
                aVar = b.a.DEBUG;
            } else {
                try {
                    aVar = b.a.valueOf(property.toUpperCase());
                } catch (IllegalArgumentException e5) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.a.j("Level '", property, "' was not found"), e5);
                }
            }
        }
        this.f5916b = aVar;
    }

    public static List<b> d(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            if (readLine.length() != 0 && readLine.charAt(0) != '#') {
                String[] split = readLine.split("=");
                if (split.length != 2) {
                    System.err.println("Line is not in the format of 'pattern = level': " + readLine);
                } else {
                    try {
                        arrayList.add(new b(Pattern.compile(split[0].trim()), b.a.valueOf(split[1].trim())));
                    } catch (IllegalArgumentException unused) {
                        PrintStream printStream = System.err;
                        StringBuilder g5 = androidx.activity.d.g("Level '");
                        g5.append(split[1]);
                        g5.append("' was not found");
                        printStream.println(g5.toString());
                    }
                }
            }
        }
    }

    @Override // x2.b
    public final void a(b.a aVar, String str) {
        e(aVar, str, null);
    }

    @Override // x2.b
    public final boolean b(b.a aVar) {
        return this.f5916b.f5925b <= aVar.f5925b;
    }

    @Override // x2.b
    public final void c(b.a aVar, String str, Throwable th) {
        e(aVar, str, th);
    }

    public final void e(b.a aVar, String str, Throwable th) {
        if (b(aVar)) {
            StringBuilder sb = new StringBuilder(128);
            sb.append(f5912c.get().format(new Date()));
            sb.append(" [");
            sb.append(aVar.name());
            sb.append("] ");
            androidx.appcompat.widget.a.n(sb, this.f5915a, ' ', str);
            f5913d.println(sb.toString());
            if (th != null) {
                th.printStackTrace(f5913d);
            }
        }
    }
}
