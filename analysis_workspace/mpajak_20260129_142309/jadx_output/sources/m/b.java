package m;

import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/* loaded from: classes23.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f4060a;

    static {
        boolean z4;
        String property = System.getProperty("java.vm.name");
        if (property != null) {
            String lowerCase = property.toLowerCase();
            if (lowerCase.contains("dalvik") || lowerCase.contains("lemur")) {
                z4 = true;
                f4060a = z4;
            }
        }
        z4 = false;
        f4060a = z4;
    }

    public static boolean a(String str) {
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt < 1 || charAt > 127 || charAt == '.') {
                return false;
            }
        }
        return true;
    }

    public static String b(Class<?> cls) {
        StringBuilder g5;
        String str;
        if (cls.isPrimitive()) {
            return d(cls);
        }
        if (cls.isArray()) {
            g5 = androidx.activity.d.g("[");
            str = b(cls.getComponentType());
        } else {
            g5 = androidx.activity.d.g("L");
            g5.append(f(cls));
            str = ";";
        }
        g5.append(str);
        return g5.toString();
    }

    public static String c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        StringBuilder sb = new StringBuilder((parameterTypes.length + 1) << 4);
        sb.append('(');
        for (Class<?> cls : parameterTypes) {
            sb.append(b(cls));
        }
        sb.append(')');
        sb.append(b(method.getReturnType()));
        return sb.toString();
    }

    public static String d(Class<?> cls) {
        if (Integer.TYPE == cls) {
            return "I";
        }
        if (Void.TYPE == cls) {
            return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
        }
        if (Boolean.TYPE == cls) {
            return "Z";
        }
        if (Character.TYPE == cls) {
            return "C";
        }
        if (Byte.TYPE == cls) {
            return "B";
        }
        if (Short.TYPE == cls) {
            return ExifInterface.LATITUDE_SOUTH;
        }
        if (Float.TYPE == cls) {
            return "F";
        }
        if (Long.TYPE == cls) {
            return "J";
        }
        if (Double.TYPE == cls) {
            return "D";
        }
        StringBuilder g5 = androidx.activity.d.g("Type: ");
        g5.append(cls.getCanonicalName());
        g5.append(" is not a primitive type");
        throw new IllegalStateException(g5.toString());
    }

    public static String[] e(AccessibleObject accessibleObject) {
        Class<?>[] parameterTypes;
        Class<?> declaringClass;
        String str;
        String[] strArr;
        if (f4060a) {
            return new String[0];
        }
        if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            parameterTypes = method.getParameterTypes();
            str = method.getName();
            declaringClass = method.getDeclaringClass();
        } else {
            Constructor constructor = (Constructor) accessibleObject;
            parameterTypes = constructor.getParameterTypes();
            declaringClass = constructor.getDeclaringClass();
            str = "<init>";
        }
        if (parameterTypes.length == 0) {
            return new String[0];
        }
        ClassLoader classLoader = declaringClass.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(declaringClass.getName().replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) + ".class");
        try {
            if (resourceAsStream == null) {
                return new String[0];
            }
            h.b bVar = new h.b(resourceAsStream);
            h.j jVar = new h.j(str, parameterTypes);
            bVar.a(jVar);
            h.g gVar = jVar.f3053c;
            if (gVar != null && gVar.f3027e) {
                strArr = gVar.a().split(",");
                return strArr;
            }
            strArr = new String[0];
            return strArr;
        } catch (IOException unused) {
            return new String[0];
        } finally {
            e.a(resourceAsStream);
        }
    }

    public static String f(Class<?> cls) {
        if (!cls.isArray()) {
            return !cls.isPrimitive() ? cls.getName().replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) : d(cls);
        }
        StringBuilder g5 = androidx.activity.d.g("[");
        g5.append(b(cls.getComponentType()));
        return g5.toString();
    }
}
