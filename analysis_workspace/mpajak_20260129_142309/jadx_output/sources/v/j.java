package v;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public final class j implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<i>> f5497b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Map<String, String> f5498c;

    /* loaded from: classes15.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final Map<String, List<i>> f5499b;

        /* renamed from: a, reason: collision with root package name */
        public Map<String, List<i>> f5500a = f5499b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = property.charAt(i5);
                    if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                        charAt = '?';
                    }
                    sb.append(charAt);
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f5499b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f5501a;

        public b(@NonNull String str) {
            this.f5501a = str;
        }

        @Override // v.i
        public final String a() {
            return this.f5501a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f5501a.equals(((b) obj).f5501a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5501a.hashCode();
        }

        public final String toString() {
            StringBuilder g5 = androidx.activity.d.g("StringHeaderFactory{value='");
            g5.append(this.f5501a);
            g5.append('\'');
            g5.append('}');
            return g5.toString();
        }
    }

    public j(Map<String, List<i>> map) {
        this.f5497b = Collections.unmodifiableMap(map);
    }

    @Override // v.h
    public final Map<String, String> a() {
        if (this.f5498c == null) {
            synchronized (this) {
                if (this.f5498c == null) {
                    this.f5498c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f5498c;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f5497b.entrySet()) {
            List<i> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i5 = 0; i5 < size; i5++) {
                String a5 = value.get(i5).a();
                if (!TextUtils.isEmpty(a5)) {
                    sb.append(a5);
                    if (i5 != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f5497b.equals(((j) obj).f5497b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5497b.hashCode();
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("LazyHeaders{headers=");
        g5.append(this.f5497b);
        g5.append('}');
        return g5.toString();
    }
}
