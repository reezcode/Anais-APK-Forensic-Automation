package k2;

import java.math.BigDecimal;

/* loaded from: classes14.dex */
public final class o extends Number {

    /* renamed from: b, reason: collision with root package name */
    public final String f3833b;

    public o(String str) {
        this.f3833b = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f3833b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        String str = this.f3833b;
        String str2 = ((o) obj).f3833b;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f3833b);
    }

    public final int hashCode() {
        return this.f3833b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f3833b);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f3833b);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f3833b).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f3833b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f3833b).longValue();
        }
    }

    public final String toString() {
        return this.f3833b;
    }
}
