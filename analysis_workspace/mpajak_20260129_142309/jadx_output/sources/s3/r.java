package s3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class r implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5279c = new b();

    /* renamed from: b, reason: collision with root package name */
    public final String[] f5280b;

    /* loaded from: classes11.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f5281a = new ArrayList(20);

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5281a.add(name);
            this.f5281a.add(StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        public final r b() {
            Object[] array = this.f5281a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new r((String[]) array);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        public final a c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i5 = 0;
            while (i5 < this.f5281a.size()) {
                if (StringsKt.g(name, (String) this.f5281a.get(i5))) {
                    this.f5281a.remove(i5);
                    this.f5281a.remove(i5);
                    i5 -= 2;
                }
                i5 += 2;
            }
            return this;
        }

        public final a d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = r.f5279c;
            bVar.a(name);
            bVar.b(value, name);
            c(name);
            a(name, value);
            return this;
        }
    }

    /* loaded from: classes8.dex */
    public static final class b {
        public final void a(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = str.charAt(i5);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new IllegalArgumentException(t3.c.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i5), str).toString());
                }
            }
        }

        public final void b(String str, String str2) {
            int length = str.length();
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = str.charAt(i5);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(t3.c.j("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i5), str2));
                    sb.append(t3.c.r(str2) ? "" : androidx.activity.d.f(": ", str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        @JvmStatic
        @JvmName(name = "of")
        public final r c(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object clone = namesAndValues.clone();
            Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            String[] strArr = (String[]) clone;
            int length = strArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                if (!(strArr[i5] != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                String str = strArr[i5];
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                strArr[i5] = StringsKt.trim((CharSequence) str).toString();
            }
            IntProgression step = RangesKt.step(ArraysKt.getIndices(strArr), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if (step2 < 0 ? first >= last : first <= last) {
                while (true) {
                    String str2 = strArr[first];
                    String str3 = strArr[first + 1];
                    a(str2);
                    b(str3, str2);
                    if (first == last) {
                        break;
                    }
                    first += step2;
                }
            }
            return new r(strArr);
        }
    }

    public r(String[] strArr) {
        this.f5280b = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r) && Arrays.equals(this.f5280b, ((r) obj).f5280b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5280b);
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int length = this.f5280b.length / 2;
        Pair[] pairArr = new Pair[length];
        for (int i5 = 0; i5 < length; i5++) {
            pairArr[i5] = TuplesKt.to(r(i5), t(i5));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final String l(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f5280b;
        IntProgression step = RangesKt.step(RangesKt.downTo(strArr.length - 2, 0), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 < 0 ? first >= last : first <= last) {
            while (!StringsKt.g(name, strArr[first])) {
                if (first != last) {
                    first += step2;
                }
            }
            return strArr[first + 1];
        }
        return null;
    }

    public final String r(int i5) {
        return this.f5280b[i5 * 2];
    }

    public final a s() {
        a aVar = new a();
        CollectionsKt.addAll(aVar.f5281a, this.f5280b);
        return aVar;
    }

    public final String t(int i5) {
        return this.f5280b[(i5 * 2) + 1];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f5280b.length / 2;
        for (int i5 = 0; i5 < length; i5++) {
            String r4 = r(i5);
            String t4 = t(i5);
            sb.append(r4);
            sb.append(": ");
            if (t3.c.r(r4)) {
                t4 = "██";
            }
            sb.append(t4);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
