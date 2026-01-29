package z0;

import com.blankj.utilcode.constant.CacheConstants;

/* loaded from: classes6.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f6107b = new i();

    /* renamed from: a, reason: collision with root package name */
    public final int f6108a = 0;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof i) && ((i) obj).f6108a == this.f6108a;
    }

    public final int hashCode() {
        return (((((this.f6108a + 1) ^ 1000003) * 1000003) ^ 30) * 1000003) ^ CacheConstants.HOUR;
    }

    public final String toString() {
        int i5 = this.f6108a;
        StringBuilder sb = new StringBuilder(74);
        sb.append("policy=");
        sb.append(i5);
        sb.append(" initial_backoff=");
        sb.append(30);
        sb.append(" maximum_backoff=");
        sb.append(CacheConstants.HOUR);
        return sb.toString();
    }
}
