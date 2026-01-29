package com.blankj.utilcode.util;

import androidx.activity.result.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ReflectUtils {
    private final Object object;
    private final Class<?> type;

    /* loaded from: classes12.dex */
    public static class NULL {
        private NULL() {
        }
    }

    /* loaded from: classes12.dex */
    public static class ReflectException extends RuntimeException {
        private static final long serialVersionUID = 858774075258496016L;

        public ReflectException(String str) {
            super(str);
        }

        public ReflectException(String str, Throwable th) {
            super(str, th);
        }

        public ReflectException(Throwable th) {
            super(th);
        }
    }

    private ReflectUtils(Class<?> cls) {
        this(cls, cls);
    }

    private ReflectUtils(Class<?> cls, Object obj) {
        this.type = cls;
        this.object = obj;
    }

    private <T extends AccessibleObject> T accessible(T t4) {
        if (t4 == null) {
            return null;
        }
        if (t4 instanceof Member) {
            Member member = (Member) t4;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t4;
            }
        }
        if (!t4.isAccessible()) {
            t4.setAccessible(true);
        }
        return t4;
    }

    private Method exactMethod(String str, Class<?>[] clsArr) {
        Class<?> type = type();
        try {
            return type.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return type.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    type = type.getSuperclass();
                }
            } while (type != null);
            throw new NoSuchMethodException();
        }
    }

    private static Class<?> forName(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e5) {
            throw new ReflectException(e5);
        }
    }

    private static Class<?> forName(String str, ClassLoader classLoader) {
        try {
            return Class.forName(str, true, classLoader);
        } catch (ClassNotFoundException e5) {
            throw new ReflectException(e5);
        }
    }

    private Field getAccessibleField(String str) {
        Class<?> type = type();
        try {
            return (Field) accessible(type.getField(str));
        } catch (NoSuchFieldException e5) {
            do {
                try {
                    return (Field) accessible(type.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    type = type.getSuperclass();
                    if (type == null) {
                        throw new ReflectException(e5);
                    }
                }
            } while (type == null);
            throw new ReflectException(e5);
        }
    }

    private Class<?>[] getArgsType(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            clsArr[i5] = obj == null ? NULL.class : obj.getClass();
        }
        return clsArr;
    }

    private Field getField(String str) {
        Field accessibleField = getAccessibleField(str);
        if ((accessibleField.getModifiers() & 16) == 16) {
            try {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                declaredField.setInt(accessibleField, accessibleField.getModifiers() & (-17));
            } catch (NoSuchFieldException unused) {
                accessibleField.setAccessible(true);
            }
        }
        return accessibleField;
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && match(method.getParameterTypes(), clsArr);
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < clsArr2.length; i5++) {
            if (clsArr2[i5] != NULL.class && !wrapper(clsArr[i5]).isAssignableFrom(wrapper(clsArr2[i5]))) {
                return false;
            }
        }
        return true;
    }

    private ReflectUtils method(Method method, Object obj, Object... objArr) {
        try {
            accessible(method);
            if (method.getReturnType() != Void.TYPE) {
                return reflect(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return reflect(obj);
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    private ReflectUtils newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return new ReflectUtils(constructor.getDeclaringClass(), ((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static ReflectUtils reflect(Class<?> cls) {
        return new ReflectUtils(cls);
    }

    public static ReflectUtils reflect(Object obj) {
        return new ReflectUtils(obj == null ? Object.class : obj.getClass(), obj);
    }

    public static ReflectUtils reflect(String str) {
        return reflect(forName(str));
    }

    public static ReflectUtils reflect(String str, ClassLoader classLoader) {
        return reflect(forName(str, classLoader));
    }

    private Method similarMethod(String str, Class<?>[] clsArr) {
        Class<?> type = type();
        ArrayList arrayList = new ArrayList();
        for (Method method : type.getMethods()) {
            if (isSimilarSignature(method, str, clsArr)) {
                arrayList.add(method);
            }
        }
        if (arrayList.isEmpty()) {
            do {
                for (Method method2 : type.getDeclaredMethods()) {
                    if (isSimilarSignature(method2, str, clsArr)) {
                        arrayList.add(method2);
                    }
                }
                if (arrayList.isEmpty()) {
                    type = type.getSuperclass();
                }
            } while (type != null);
            StringBuilder f5 = a.f("No similar method ", str, " with params ");
            f5.append(Arrays.toString(clsArr));
            f5.append(" could be found on type ");
            f5.append(type());
            f5.append(".");
            throw new NoSuchMethodException(f5.toString());
        }
        sortMethods(arrayList);
        return (Method) arrayList.get(0);
    }

    private void sortConstructors(List<Constructor<?>> list) {
        Collections.sort(list, new Comparator<Constructor<?>>() { // from class: com.blankj.utilcode.util.ReflectUtils.1
            @Override // java.util.Comparator
            public int compare(Constructor<?> constructor, Constructor<?> constructor2) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
                int length = parameterTypes.length;
                for (int i5 = 0; i5 < length; i5++) {
                    if (!parameterTypes[i5].equals(parameterTypes2[i5])) {
                        return ReflectUtils.this.wrapper(parameterTypes[i5]).isAssignableFrom(ReflectUtils.this.wrapper(parameterTypes2[i5])) ? 1 : -1;
                    }
                }
                return 0;
            }
        });
    }

    private void sortMethods(List<Method> list) {
        Collections.sort(list, new Comparator<Method>() { // from class: com.blankj.utilcode.util.ReflectUtils.2
            @Override // java.util.Comparator
            public int compare(Method method, Method method2) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                int length = parameterTypes.length;
                for (int i5 = 0; i5 < length; i5++) {
                    if (!parameterTypes[i5].equals(parameterTypes2[i5])) {
                        return ReflectUtils.this.wrapper(parameterTypes[i5]).isAssignableFrom(ReflectUtils.this.wrapper(parameterTypes2[i5])) ? 1 : -1;
                    }
                }
                return 0;
            }
        });
    }

    private Class<?> type() {
        return this.type;
    }

    private Object unwrap(Object obj) {
        return obj instanceof ReflectUtils ? ((ReflectUtils) obj).get() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Class<?> wrapper(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectUtils) && this.object.equals(((ReflectUtils) obj).get());
    }

    public ReflectUtils field(String str) {
        try {
            Field field = getField(str);
            return new ReflectUtils(field.getType(), field.get(this.object));
        } catch (IllegalAccessException e5) {
            throw new ReflectException(e5);
        }
    }

    public ReflectUtils field(String str, Object obj) {
        try {
            getField(str).set(this.object, unwrap(obj));
            return this;
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    public <T> T get() {
        return (T) this.object;
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public ReflectUtils method(String str) {
        return method(str, new Object[0]);
    }

    public ReflectUtils method(String str, Object... objArr) {
        Class<?>[] argsType = getArgsType(objArr);
        try {
            try {
                return method(exactMethod(str, argsType), this.object, objArr);
            } catch (NoSuchMethodException e5) {
                throw new ReflectException(e5);
            }
        } catch (NoSuchMethodException unused) {
            return method(similarMethod(str, argsType), this.object, objArr);
        }
    }

    public ReflectUtils newInstance() {
        return newInstance(new Object[0]);
    }

    public ReflectUtils newInstance(Object... objArr) {
        Class<?>[] argsType = getArgsType(objArr);
        try {
            return newInstance(type().getDeclaredConstructor(argsType), objArr);
        } catch (NoSuchMethodException e5) {
            ArrayList arrayList = new ArrayList();
            for (Constructor<?> constructor : type().getDeclaredConstructors()) {
                if (match(constructor.getParameterTypes(), argsType)) {
                    arrayList.add(constructor);
                }
            }
            if (arrayList.isEmpty()) {
                throw new ReflectException(e5);
            }
            sortConstructors(arrayList);
            return newInstance((Constructor) arrayList.get(0), objArr);
        }
    }

    public <P> P proxy(Class<P> cls) {
        final boolean z4 = this.object instanceof Map;
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.blankj.utilcode.util.ReflectUtils.3
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                String name = method.getName();
                try {
                    return ReflectUtils.reflect(ReflectUtils.this.object).method(name, objArr).get();
                } catch (ReflectException e5) {
                    if (z4) {
                        Map map = (Map) ReflectUtils.this.object;
                        int length = objArr == null ? 0 : objArr.length;
                        if (length == 0 && name.startsWith("get")) {
                            return map.get(ReflectUtils.property(name.substring(3)));
                        }
                        if (length == 0 && name.startsWith("is")) {
                            return map.get(ReflectUtils.property(name.substring(2)));
                        }
                        if (length == 1 && name.startsWith("set")) {
                            map.put(ReflectUtils.property(name.substring(3)), objArr[0]);
                            return null;
                        }
                    }
                    throw e5;
                }
            }
        });
    }

    public String toString() {
        return this.object.toString();
    }
}
