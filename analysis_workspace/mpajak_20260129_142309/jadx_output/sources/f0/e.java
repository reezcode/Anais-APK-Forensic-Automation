package f0;

import java.lang.reflect.InvocationTargetException;

@Deprecated
/* loaded from: classes24.dex */
public final class e {
    public static c a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof c) {
                    return (c) newInstance;
                }
                throw new RuntimeException(androidx.appcompat.widget.a.i("Expected instanceof GlideModule, but found: ", newInstance));
            } catch (IllegalAccessException e5) {
                b(cls, e5);
                throw null;
            } catch (InstantiationException e6) {
                b(cls, e6);
                throw null;
            } catch (NoSuchMethodException e7) {
                b(cls, e7);
                throw null;
            } catch (InvocationTargetException e8) {
                b(cls, e8);
                throw null;
            }
        } catch (ClassNotFoundException e9) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e9);
        }
    }

    public static void b(Class<?> cls, Exception exc) {
        throw new RuntimeException(androidx.activity.d.e("Unable to instantiate GlideModule implementation for ", cls), exc);
    }
}
