package y0;

import java.lang.reflect.Field;
import y0.a;

/* loaded from: classes16.dex */
public final class b<T> extends a.AbstractBinderC0085a {

    /* renamed from: a, reason: collision with root package name */
    public final T f6047a;

    public b(T t4) {
        this.f6047a = t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T e(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f6047a;
        }
        c1.a aVar2 = (c1.a) aVar;
        Field[] declaredFields = aVar2.getClass().getDeclaredFields();
        Field field = null;
        int i5 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i5++;
                field = field2;
            }
        }
        if (i5 != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(aVar2);
        } catch (IllegalAccessException e5) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e5);
        } catch (NullPointerException e6) {
            throw new IllegalArgumentException("Binder object is null.", e6);
        }
    }
}
