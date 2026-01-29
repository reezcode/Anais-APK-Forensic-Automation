package v;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes12.dex */
public final class n<A, B> {

    /* renamed from: a, reason: collision with root package name */
    public final l0.g<a<A>, B> f5507a = new m();

    @VisibleForTesting
    /* loaded from: classes6.dex */
    public static final class a<A> {

        /* renamed from: d, reason: collision with root package name */
        public static final Queue<a<?>> f5508d;

        /* renamed from: a, reason: collision with root package name */
        public int f5509a;

        /* renamed from: b, reason: collision with root package name */
        public int f5510b;

        /* renamed from: c, reason: collision with root package name */
        public A f5511c;

        static {
            char[] cArr = l0.k.f3942a;
            f5508d = new ArrayDeque(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Queue<v.n$a<?>>] */
        public static a a(Object obj) {
            a aVar;
            ?? r02 = f5508d;
            synchronized (r02) {
                aVar = (a) r02.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f5511c = obj;
            aVar.f5510b = 0;
            aVar.f5509a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5510b == aVar.f5510b && this.f5509a == aVar.f5509a && this.f5511c.equals(aVar.f5511c);
        }

        public final int hashCode() {
            return this.f5511c.hashCode() + (((this.f5509a * 31) + this.f5510b) * 31);
        }
    }
}
