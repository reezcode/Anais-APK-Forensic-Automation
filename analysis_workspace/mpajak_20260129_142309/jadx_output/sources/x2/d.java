package x2;

import x2.b;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static a f5928a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes18.dex */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final C0084a f5929d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f5930e;

        /* renamed from: b, reason: collision with root package name */
        public final String f5931b;

        /* renamed from: c, reason: collision with root package name */
        public final String f5932c;

        /* JADX INFO: Fake field, exist only in values array */
        a EF1;

        /* JADX INFO: Fake field, exist only in values array */
        a EF2;

        /* JADX INFO: Fake field, exist only in values array */
        a EF4;

        /* JADX INFO: Fake field, exist only in values array */
        a EF6;

        /* JADX INFO: Fake field, exist only in values array */
        a EF8;

        /* renamed from: x2.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes11.dex */
        public enum C0084a extends a {
            public C0084a(String str, String str2) {
                super("LOCAL", 5, str, str2);
            }

            @Override // x2.d.a
            public final b a(String str) {
                return new x2.a(str);
            }

            @Override // x2.d.a
            public final boolean c() {
                return true;
            }
        }

        static {
            a aVar = new a("ANDROID", 0, "android.util.Log", "com.j256.ormlite.android.AndroidLog");
            a aVar2 = new a("SLF4J", 1, "org.slf4j.LoggerFactory", "com.j256.ormlite.logger.Slf4jLoggingLog");
            a aVar3 = new a("COMMONS_LOGGING", 2, "org.apache.commons.logging.LogFactory", "com.j256.ormlite.logger.CommonsLoggingLog");
            a aVar4 = new a("LOG4J2", 3, "org.apache.logging.log4j.LogManager", "com.j256.ormlite.logger.Log4j2Log");
            a aVar5 = new a("LOG4J", 4, "org.apache.log4j.Logger", "com.j256.ormlite.logger.Log4jLog");
            C0084a c0084a = new C0084a(x2.a.class.getName(), x2.a.class.getName());
            f5929d = c0084a;
            f5930e = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, c0084a};
        }

        public a(String str, int i5, String str2, String str3) {
            this.f5931b = str2;
            this.f5932c = str3;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f5930e.clone();
        }

        public b a(String str) {
            try {
                return b(str);
            } catch (Exception e5) {
                x2.a aVar = new x2.a(str);
                b.a aVar2 = b.a.WARNING;
                StringBuilder g5 = androidx.activity.d.g("Unable to call constructor with single String argument for class ");
                g5.append(this.f5932c);
                g5.append(", so had to use local log: ");
                g5.append(e5.getMessage());
                aVar.e(aVar2, g5.toString(), null);
                return aVar;
            }
        }

        public final b b(String str) {
            return (b) Class.forName(this.f5932c).getConstructor(String.class).newInstance(str);
        }

        public boolean c() {
            boolean z4;
            try {
                Class.forName(this.f5931b);
                z4 = true;
            } catch (Exception unused) {
                z4 = false;
            }
            if (!z4) {
                return false;
            }
            try {
                b(getClass().getName()).b(b.a.INFO);
                return true;
            } catch (Exception unused2) {
                return false;
            }
        }
    }

    public static c a(Class<?> cls) {
        a valueOf;
        String name = cls.getName();
        if (f5928a == null) {
            String property = System.getProperty("com.j256.ormlite.logger.type");
            if (property != null) {
                try {
                    valueOf = a.valueOf(property);
                } catch (IllegalArgumentException unused) {
                    new x2.a(d.class.getName()).e(b.a.WARNING, androidx.appcompat.widget.a.j("Could not find valid log-type from system property 'com.j256.ormlite.logger.type', value '", property, "'"), null);
                }
                f5928a = valueOf;
            }
            a[] values = a.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    valueOf = a.f5929d;
                    break;
                }
                a aVar = values[i5];
                if (aVar.c()) {
                    valueOf = aVar;
                    break;
                }
                i5++;
            }
            f5928a = valueOf;
        }
        return new c(f5928a.a(name));
    }
}
