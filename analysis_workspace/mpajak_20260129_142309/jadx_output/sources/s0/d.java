package s0;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f5121a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f5122b;

        public a(Object obj) {
            Objects.requireNonNull(obj, "null reference");
            this.f5122b = obj;
            this.f5121a = new ArrayList();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        public final a a(String str, @Nullable Object obj) {
            ?? r02 = this.f5121a;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 1);
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            r02.add(sb.toString());
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f5122b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f5121a.size();
            for (int i5 = 0; i5 < size; i5++) {
                sb.append((String) this.f5121a.get(i5));
                if (i5 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
