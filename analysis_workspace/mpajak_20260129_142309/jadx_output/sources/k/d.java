package k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import sun.reflect.annotation.AnnotationType;

/* loaded from: classes9.dex */
public final class d implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public static d f3680a = new d();

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        if (interfaces.length == 1 && interfaces[0].isAnnotation()) {
            Map members = AnnotationType.getInstance(interfaces[0]).members();
            f.e eVar = new f.e(members.size(), false);
            Object obj3 = null;
            for (Map.Entry entry : members.entrySet()) {
                try {
                    obj3 = ((Method) entry.getValue()).invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
                eVar.put((String) entry.getKey(), f.a.w(obj3));
            }
            g0Var.q(eVar);
        }
    }
}
