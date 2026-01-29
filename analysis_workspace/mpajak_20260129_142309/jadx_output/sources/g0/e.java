package g0;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.j;

/* loaded from: classes23.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f2917a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f2918b = new HashMap();

    /* loaded from: classes14.dex */
    public static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f2919a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f2920b;

        /* renamed from: c, reason: collision with root package name */
        public final j<T, R> f2921c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, j<T, R> jVar) {
            this.f2919a = cls;
            this.f2920b = cls2;
            this.f2921c = jVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<g0.e$a<?, ?>>>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<g0.e$a<?, ?>>>] */
    @NonNull
    public final synchronized List<a<?, ?>> a(@NonNull String str) {
        List<a<?, ?>> list;
        if (!this.f2917a.contains(str)) {
            this.f2917a.add(str);
        }
        list = (List) this.f2918b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f2918b.put(str, list);
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<g0.e$a<?, ?>>>] */
    @NonNull
    public final synchronized <T, R> List<Class<R>> b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f2917a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f2918b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.f2919a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f2920b)) && !arrayList.contains(aVar.f2920b)) {
                        arrayList.add(aVar.f2920b);
                    }
                }
            }
        }
        return arrayList;
    }
}
