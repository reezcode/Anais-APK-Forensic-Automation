package k2;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes23.dex */
public final class c implements q<Object> {

    /* renamed from: e, reason: collision with root package name */
    public final d1.f f3811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Class f3812f;

    public c(Class cls) {
        d1.f uVar;
        this.f3812f = cls;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            uVar = new r(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    uVar = new s(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    uVar = new t(declaredMethod3);
                }
            } catch (Exception unused3) {
                uVar = new u();
            }
        }
        this.f3811e = uVar;
    }

    @Override // k2.q
    public final Object c() {
        try {
            return this.f3811e.C(this.f3812f);
        } catch (Exception e5) {
            StringBuilder g5 = androidx.activity.d.g("Unable to create instance of ");
            g5.append(this.f3812f);
            g5.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new RuntimeException(g5.toString(), e5);
        }
    }
}
