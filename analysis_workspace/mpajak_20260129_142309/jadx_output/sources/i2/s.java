package i2;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes25.dex */
public final class s extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f3302a;

    public s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f3302a = bool;
    }

    public s(Number number) {
        Objects.requireNonNull(number);
        this.f3302a = number;
    }

    public s(String str) {
        Objects.requireNonNull(str);
        this.f3302a = str;
    }

    public static boolean u(s sVar) {
        Serializable serializable = sVar.f3302a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f3302a == null) {
            return sVar.f3302a == null;
        }
        if (u(this) && u(sVar)) {
            return s().longValue() == sVar.s().longValue();
        }
        Serializable serializable = this.f3302a;
        if (!(serializable instanceof Number) || !(sVar.f3302a instanceof Number)) {
            return serializable.equals(sVar.f3302a);
        }
        double doubleValue = s().doubleValue();
        double doubleValue2 = sVar.s().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f3302a == null) {
            return 31;
        }
        if (u(this)) {
            doubleToLongBits = s().longValue();
        } else {
            Serializable serializable = this.f3302a;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(s().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final boolean r() {
        Serializable serializable = this.f3302a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(t());
    }

    public final Number s() {
        Serializable serializable = this.f3302a;
        return serializable instanceof String ? new k2.o((String) serializable) : (Number) serializable;
    }

    public final String t() {
        Serializable serializable = this.f3302a;
        return serializable instanceof Number ? s().toString() : serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }
}
