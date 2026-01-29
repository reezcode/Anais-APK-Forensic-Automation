package q2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* loaded from: classes19.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static Class<?> f4748a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f4749b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f4750c;

    /* renamed from: d, reason: collision with root package name */
    public static Field f4751d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f4752e;

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f4753f;

    /* loaded from: classes23.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @v2.d
        public String f4754a;
    }

    static {
        Object obj;
        int[] iArr = null;
        try {
            f4748a = Class.forName("org.apache.harmony.lang.annotation.AnnotationFactory");
            f4750c = Class.forName("org.apache.harmony.lang.annotation.AnnotationMember");
            Class<?> cls = Class.forName("[Lorg.apache.harmony.lang.annotation.AnnotationMember;");
            Field declaredField = f4748a.getDeclaredField("elements");
            f4749b = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = f4750c.getDeclaredField("name");
            f4751d = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = f4750c.getDeclaredField("value");
            f4752e = declaredField3;
            declaredField3.setAccessible(true);
            InvocationHandler invocationHandler = Proxy.getInvocationHandler((v2.d) a.class.getDeclaredField("a").getAnnotation(v2.d.class));
            if (invocationHandler.getClass() == f4748a && (obj = f4749b.get(invocationHandler)) != null && obj.getClass() == cls) {
                Object[] objArr = (Object[]) obj;
                int[] iArr2 = new int[objArr.length];
                for (int i5 = 0; i5 < objArr.length; i5++) {
                    iArr2[i5] = b((String) f4751d.get(objArr[i5]));
                }
                iArr = iArr2;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | SecurityException unused) {
        }
        f4753f = iArr;
    }

    public static v2.e a(v2.d dVar, Field field) {
        Object obj;
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(dVar);
        if (invocationHandler.getClass() != f4748a || (obj = f4749b.get(invocationHandler)) == null) {
            return null;
        }
        v2.e eVar = new v2.e(field.getName());
        Object[] objArr = (Object[]) obj;
        int i5 = 0;
        while (true) {
            int[] iArr = f4753f;
            if (i5 >= iArr.length) {
                return eVar;
            }
            Object obj2 = f4752e.get(objArr[i5]);
            if (obj2 != null) {
                int i6 = iArr[i5];
                switch (i6) {
                    case 1:
                        eVar.f5651b = c((String) obj2);
                        break;
                    case 2:
                        eVar.f5652c = (v2.c) obj2;
                        break;
                    case 3:
                        String str = (String) obj2;
                        if (!str.equals("__ormlite__ no default value string was specified")) {
                            eVar.f5654e = str;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        eVar.f5655f = ((Integer) obj2).intValue();
                        break;
                    case 5:
                        eVar.f5656g = ((Boolean) obj2).booleanValue();
                        break;
                    case 6:
                        eVar.f5657h = ((Boolean) obj2).booleanValue();
                        break;
                    case 7:
                        eVar.f5658i = ((Boolean) obj2).booleanValue();
                        break;
                    case 8:
                        eVar.f5659j = c((String) obj2);
                        break;
                    case 9:
                        eVar.f5660k = ((Boolean) obj2).booleanValue();
                        break;
                    case 10:
                        eVar.f5661l = ((Boolean) obj2).booleanValue();
                        break;
                    case 11:
                        eVar.f5662m = v2.e.c(field, (String) obj2);
                        break;
                    case 12:
                        eVar.f5663n = ((Boolean) obj2).booleanValue();
                        break;
                    case 13:
                        eVar.f5664o = ((Boolean) obj2).booleanValue();
                        break;
                    case 14:
                        eVar.f5665p = c((String) obj2);
                        break;
                    case 15:
                        eVar.f5666q = ((Boolean) obj2).booleanValue();
                        break;
                    case 16:
                        eVar.f5667r = ((Boolean) obj2).booleanValue();
                        break;
                    case 17:
                        eVar.f5668s = ((Boolean) obj2).booleanValue();
                        break;
                    case 18:
                        eVar.f5670u = ((Boolean) obj2).booleanValue();
                        break;
                    case 19:
                        eVar.f5669t = c((String) obj2);
                        break;
                    case 20:
                        eVar.f5671v = c((String) obj2);
                        break;
                    case 21:
                        eVar.f5672w = ((Boolean) obj2).booleanValue();
                        break;
                    case 22:
                        eVar.f5673x = ((Integer) obj2).intValue();
                        break;
                    case 23:
                        eVar.f5674y = (Class) obj2;
                        break;
                    case 24:
                        eVar.f5675z = ((Boolean) obj2).booleanValue();
                        break;
                    case 25:
                        eVar.A = c((String) obj2);
                        break;
                    case 26:
                        eVar.B = ((Boolean) obj2).booleanValue();
                        break;
                    case 27:
                        eVar.C = ((Boolean) obj2).booleanValue();
                        break;
                    case 28:
                        eVar.D = c((String) obj2);
                        break;
                    case 29:
                        eVar.E = ((Boolean) obj2).booleanValue();
                        break;
                    default:
                        throw new IllegalStateException(androidx.appcompat.widget.a.g("Could not find support for DatabaseField number ", i6));
                }
            }
            i5++;
        }
    }

    public static int b(String str) {
        if (str.equals("columnName")) {
            return 1;
        }
        if (str.equals("dataType")) {
            return 2;
        }
        if (str.equals("defaultValue")) {
            return 3;
        }
        if (str.equals("width")) {
            return 4;
        }
        if (str.equals("canBeNull")) {
            return 5;
        }
        if (str.equals("id")) {
            return 6;
        }
        if (str.equals("generatedId")) {
            return 7;
        }
        if (str.equals("generatedIdSequence")) {
            return 8;
        }
        if (str.equals("foreign")) {
            return 9;
        }
        if (str.equals("useGetSet")) {
            return 10;
        }
        if (str.equals("unknownEnumName")) {
            return 11;
        }
        if (str.equals("throwIfNull")) {
            return 12;
        }
        if (str.equals("persisted")) {
            return 13;
        }
        if (str.equals("format")) {
            return 14;
        }
        if (str.equals("unique")) {
            return 15;
        }
        if (str.equals("uniqueCombo")) {
            return 16;
        }
        if (str.equals("index")) {
            return 17;
        }
        if (str.equals("uniqueIndex")) {
            return 18;
        }
        if (str.equals("indexName")) {
            return 19;
        }
        if (str.equals("uniqueIndexName")) {
            return 20;
        }
        if (str.equals("foreignAutoRefresh")) {
            return 21;
        }
        if (str.equals("maxForeignAutoRefreshLevel")) {
            return 22;
        }
        if (str.equals("persisterClass")) {
            return 23;
        }
        if (str.equals("allowGeneratedIdInsert")) {
            return 24;
        }
        if (str.equals("columnDefinition")) {
            return 25;
        }
        if (str.equals("foreignAutoCreate")) {
            return 26;
        }
        if (str.equals("version")) {
            return 27;
        }
        if (str.equals("foreignColumnName")) {
            return 28;
        }
        if (str.equals("readOnly")) {
            return 29;
        }
        throw new IllegalStateException(androidx.activity.d.f("Could not find support for DatabaseField ", str));
    }

    public static String c(String str) {
        if (str.length() == 0) {
            return null;
        }
        return str;
    }
}
