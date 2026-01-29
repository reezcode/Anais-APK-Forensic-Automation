package r2;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import t2.g;
import t2.h;
import x2.b;
import x2.c;
import x2.d;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static c f5032a = d.a(a.class);

    /* renamed from: b, reason: collision with root package name */
    public static Class<? extends b> f5033b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f5034c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f5035d = false;

    /* renamed from: e, reason: collision with root package name */
    public static int f5036e = 0;

    @Deprecated
    public static synchronized b a(Context context) {
        b c5;
        synchronized (a.class) {
            if (f5033b == null) {
                if (context == null) {
                    throw new IllegalArgumentException("context argument is null");
                }
                b(d(context.getApplicationContext(), context.getClass()));
            }
            c5 = c(context, f5033b);
        }
        return c5;
    }

    public static void b(Class<? extends b> cls) {
        if (cls == null) {
            throw new IllegalStateException("Helper class was trying to be reset to null");
        }
        Class<? extends b> cls2 = f5033b;
        if (cls2 == null) {
            f5033b = cls;
        } else {
            if (cls2 == cls) {
                return;
            }
            StringBuilder g5 = androidx.activity.d.g("Helper class was ");
            g5.append(f5033b);
            g5.append(" but is trying to be reset to ");
            g5.append(cls);
            throw new IllegalStateException(g5.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.HashMap, java.util.Map<t2.h$a, t2.g<?, ?>>] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.HashMap, java.util.Map<java.lang.Object, t2.g<?, ?>>] */
    public static <T extends b> T c(Context context, Class<T> cls) {
        if (f5034c == null) {
            if (f5035d) {
                c cVar = f5032a;
                b.a aVar = b.a.INFO;
                Object obj = c.f5926b;
                cVar.f(aVar, null, "helper was already closed and is being re-opened", obj, obj, obj, null);
            }
            if (context == null) {
                throw new IllegalArgumentException("context argument is null");
            }
            try {
                try {
                    f5034c = cls.getConstructor(Context.class).newInstance(context.getApplicationContext());
                    f5032a.g("zero instances, created helper {}", f5034c);
                    ThreadLocal<List<t2.a<?, ?>>> threadLocal = t2.a.f5422j;
                    synchronized (t2.a.class) {
                    }
                    Map<h.a, g<?, ?>> map = h.f5438a;
                    synchronized (h.class) {
                        ?? r11 = h.f5438a;
                        if (r11 != 0) {
                            r11.clear();
                            h.f5438a = null;
                        }
                        ?? r112 = h.f5439b;
                        if (r112 != 0) {
                            r112.clear();
                            h.f5439b = null;
                        }
                    }
                    f5036e = 0;
                } catch (Exception e5) {
                    throw new IllegalStateException(androidx.activity.d.e("Could not construct instance of helper class ", cls), e5);
                }
            } catch (Exception e6) {
                throw new IllegalStateException(androidx.activity.d.e("Could not find public constructor that has a single (Context) argument for helper class ", cls), e6);
            }
        }
        f5036e++;
        f5032a.h("returning helper {}, instance count = {} ", f5034c, Integer.valueOf(f5036e));
        return (T) f5034c;
    }

    public static Class<? extends b> d(Context context, Class<?> cls) {
        Type[] actualTypeArguments;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("open_helper_classname", TypedValues.Custom.S_STRING, context.getPackageName());
        if (identifier != 0) {
            String string = resources.getString(identifier);
            try {
                return Class.forName(string);
            } catch (Exception e5) {
                throw new IllegalStateException(androidx.activity.d.f("Could not create helper instance for class ", string), e5);
            }
        }
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            Type genericSuperclass = cls2.getGenericSuperclass();
            if (genericSuperclass != null && (genericSuperclass instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments()) != null && actualTypeArguments.length != 0) {
                for (Type type : actualTypeArguments) {
                    if (type instanceof Class) {
                        Class<? extends b> cls3 = (Class) type;
                        if (b.class.isAssignableFrom(cls3)) {
                            return cls3;
                        }
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find OpenHelperClass because none of the generic parameters of class " + cls + " extends OrmLiteSqliteOpenHelper.  You should use getHelper(Context, Class) instead.");
    }

    public static synchronized void e() {
        synchronized (a.class) {
            f5036e--;
            f5032a.h("releasing helper {}, instance count = {}", f5034c, Integer.valueOf(f5036e));
            if (f5036e <= 0) {
                if (f5034c != null) {
                    f5032a.g("zero instances, closing helper {}", f5034c);
                    f5034c.close();
                    f5034c = null;
                    f5035d = true;
                }
                int i5 = f5036e;
                if (i5 < 0) {
                    c cVar = f5032a;
                    Integer valueOf = Integer.valueOf(i5);
                    b.a aVar = b.a.ERROR;
                    Object obj = c.f5926b;
                    cVar.f(aVar, null, "too many calls to release helper, instance count = {}", valueOf, obj, obj, null);
                }
            }
        }
    }
}
