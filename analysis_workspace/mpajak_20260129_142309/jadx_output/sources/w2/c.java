package w2;

import java.lang.reflect.Field;
import java.sql.SQLException;

/* loaded from: classes16.dex */
public abstract class c extends a {
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;[Ljava/lang/Class<*>;)V */
    public c(int i5, Class[] clsArr) {
        super(i5, clsArr);
    }

    public static Enum<?> M(v2.g gVar, Object obj, Enum<?> r32, Enum<?> r4) {
        if (r32 != null) {
            return r32;
        }
        if (r4 != null) {
            return r4;
        }
        throw new SQLException("Cannot get enum value of '" + obj + "' for field " + gVar);
    }

    @Override // w2.a, v2.a
    public final boolean m(Field field) {
        return field.getType().isEnum();
    }
}
