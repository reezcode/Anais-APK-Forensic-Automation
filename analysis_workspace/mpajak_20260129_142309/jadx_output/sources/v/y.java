package v;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import v.o;

/* loaded from: classes11.dex */
public final class y<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f5553b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final o<g, Data> f5554a;

    /* loaded from: classes15.dex */
    public static class a implements p<Uri, InputStream> {
        @Override // v.p
        @NonNull
        public final o<Uri, InputStream> b(s sVar) {
            return new y(sVar.b(g.class, InputStream.class));
        }
    }

    public y(o<g, Data> oVar) {
        this.f5554a = oVar;
    }

    @Override // v.o
    public final o.a a(@NonNull Uri uri, int i5, int i6, @NonNull p.h hVar) {
        return this.f5554a.a(new g(uri.toString()), i5, i6, hVar);
    }

    @Override // v.o
    public final boolean b(@NonNull Uri uri) {
        return f5553b.contains(uri.getScheme());
    }
}
