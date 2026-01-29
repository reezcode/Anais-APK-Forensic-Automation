package j;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import k.g0;
import k.q0;

/* loaded from: classes13.dex */
public final class t implements q0, s {

    /* renamed from: a, reason: collision with root package name */
    public static t f3410a = new t();

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        if (type == OptionalInt.class) {
            Integer l5 = m.j.l(aVar.A(Integer.class, null));
            return l5 == null ? (T) OptionalInt.empty() : (T) OptionalInt.of(l5.intValue());
        }
        if (type == OptionalLong.class) {
            Long n4 = m.j.n(aVar.A(Long.class, null));
            return n4 == null ? (T) OptionalLong.empty() : (T) OptionalLong.of(n4.longValue());
        }
        if (type == OptionalDouble.class) {
            Double j5 = m.j.j(aVar.A(Double.class, null));
            return j5 == null ? (T) OptionalDouble.empty() : (T) OptionalDouble.of(j5.doubleValue());
        }
        if (!m.j.f4129h) {
            try {
                m.j.f4130i = Class.forName("java.util.Optional");
            } catch (Exception unused) {
            } catch (Throwable th) {
                m.j.f4129h = true;
                throw th;
            }
            m.j.f4129h = true;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType() == m.j.f4130i) {
                type = parameterizedType.getActualTypeArguments()[0];
            }
        }
        Object A = aVar.A(type, null);
        return A == null ? (T) Optional.empty() : (T) Optional.of(A);
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        if (obj == null) {
            g0Var.s();
            return;
        }
        if (obj instanceof Optional) {
            Optional optional = (Optional) obj;
            g0Var.q(optional.isPresent() ? optional.get() : null);
            return;
        }
        if (obj instanceof OptionalDouble) {
            OptionalDouble optionalDouble = (OptionalDouble) obj;
            if (optionalDouble.isPresent()) {
                g0Var.q(Double.valueOf(optionalDouble.getAsDouble()));
                return;
            } else {
                g0Var.s();
                return;
            }
        }
        if (obj instanceof OptionalInt) {
            OptionalInt optionalInt = (OptionalInt) obj;
            if (optionalInt.isPresent()) {
                g0Var.f3689j.z(optionalInt.getAsInt());
                return;
            } else {
                g0Var.s();
                return;
            }
        }
        if (!(obj instanceof OptionalLong)) {
            StringBuilder g5 = androidx.activity.d.g("not support optional : ");
            g5.append(obj.getClass());
            throw new f.d(g5.toString());
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        if (optionalLong.isPresent()) {
            g0Var.f3689j.A(optionalLong.getAsLong());
        } else {
            g0Var.s();
        }
    }

    @Override // j.s
    public final int e() {
        return 12;
    }
}
