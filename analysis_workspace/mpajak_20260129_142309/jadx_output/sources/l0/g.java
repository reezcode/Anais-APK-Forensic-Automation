package l0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes25.dex */
public class g<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<T, a<Y>> f3933a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public long f3934b;

    /* renamed from: c, reason: collision with root package name */
    public long f3935c;

    /* loaded from: classes3.dex */
    public static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        public final Y f3936a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3937b;

        public a(Y y4, int i5) {
            this.f3936a = y4;
            this.f3937b = i5;
        }
    }

    public g(long j5) {
        this.f3934b = j5;
    }

    @Nullable
    public final synchronized Y a(@NonNull T t4) {
        a aVar;
        aVar = (a) this.f3933a.get(t4);
        return aVar != null ? aVar.f3936a : null;
    }

    public int b(@Nullable Y y4) {
        return 1;
    }

    public void c(@NonNull T t4, @Nullable Y y4) {
    }

    @Nullable
    public final synchronized Y d(@NonNull T t4, @Nullable Y y4) {
        int b5 = b(y4);
        long j5 = b5;
        if (j5 >= this.f3934b) {
            c(t4, y4);
            return null;
        }
        if (y4 != null) {
            this.f3935c += j5;
        }
        a<Y> put = this.f3933a.put(t4, y4 == null ? null : new a<>(y4, b5));
        if (put != null) {
            this.f3935c -= put.f3937b;
            if (!put.f3936a.equals(y4)) {
                c(t4, put.f3936a);
            }
        }
        e(this.f3934b);
        return put != null ? put.f3936a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j5) {
        while (this.f3935c > j5) {
            Iterator it = this.f3933a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f3935c -= aVar.f3937b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.f3936a);
        }
    }
}
