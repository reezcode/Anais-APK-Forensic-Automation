package i2;

import java.lang.reflect.Field;
import java.util.Locale;
import org.apache.commons.io.FilenameUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class b implements i2.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3262b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0037b f3263c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f3264d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f3265e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f3266f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f3267g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f3268h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f3269i;

    /* loaded from: classes23.dex */
    public enum a extends b {
        public a() {
            super("IDENTITY", 0, null);
        }

        @Override // i2.c
        public final String a(Field field) {
            return field.getName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [i2.b$g] */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.b$b] */
    /* JADX WARN: Type inference failed for: r3v0, types: [i2.b$c] */
    /* JADX WARN: Type inference failed for: r5v0, types: [i2.b$d] */
    /* JADX WARN: Type inference failed for: r7v0, types: [i2.b$e] */
    /* JADX WARN: Type inference failed for: r9v0, types: [i2.b$f] */
    static {
        a aVar = new a();
        f3262b = aVar;
        ?? r12 = new b() { // from class: i2.b.b
            @Override // i2.c
            public final String a(Field field) {
                return b.c(field.getName());
            }
        };
        f3263c = r12;
        ?? r32 = new b() { // from class: i2.b.c
            @Override // i2.c
            public final String a(Field field) {
                return b.c(b.b(field.getName(), ' '));
            }
        };
        f3264d = r32;
        ?? r5 = new b() { // from class: i2.b.d
            @Override // i2.c
            public final String a(Field field) {
                return b.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f3265e = r5;
        ?? r7 = new b() { // from class: i2.b.e
            @Override // i2.c
            public final String a(Field field) {
                return b.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f3266f = r7;
        ?? r9 = new b() { // from class: i2.b.f
            @Override // i2.c
            public final String a(Field field) {
                return b.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f3267g = r9;
        ?? r11 = new b() { // from class: i2.b.g
            @Override // i2.c
            public final String a(Field field) {
                return b.b(field.getName(), FilenameUtils.EXTENSION_SEPARATOR).toLowerCase(Locale.ENGLISH);
            }
        };
        f3268h = r11;
        f3269i = new b[]{aVar, r12, r32, r5, r7, r9, r11};
    }

    public b(String str, int i5, a aVar) {
    }

    public static String b(String str, char c5) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c5);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i5 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i5) + upperCase + str.substring(i5 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3269i.clone();
    }
}
