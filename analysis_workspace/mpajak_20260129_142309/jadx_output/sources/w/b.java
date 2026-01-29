package w;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p.h;
import q.a;
import v.o;
import v.p;
import v.s;

/* loaded from: classes18.dex */
public final class b implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5727a;

    /* loaded from: classes15.dex */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f5728a;

        public a(Context context) {
            this.f5728a = context;
        }

        @Override // v.p
        @NonNull
        public final o<Uri, InputStream> b(s sVar) {
            return new b(this.f5728a);
        }
    }

    public b(Context context) {
        this.f5727a = context.getApplicationContext();
    }

    @Override // v.o
    public final o.a<InputStream> a(@NonNull Uri uri, int i5, int i6, @NonNull h hVar) {
        Uri uri2 = uri;
        if (!(i5 != Integer.MIN_VALUE && i6 != Integer.MIN_VALUE && i5 <= 512 && i6 <= 384)) {
            return null;
        }
        k0.d dVar = new k0.d(uri2);
        Context context = this.f5727a;
        return new o.a<>(dVar, q.a.c(context, uri2, new a.C0060a(context.getContentResolver())));
    }

    @Override // v.o
    public final boolean b(@NonNull Uri uri) {
        Uri uri2 = uri;
        return d1.d.j(uri2) && !uri2.getPathSegments().contains("video");
    }
}
