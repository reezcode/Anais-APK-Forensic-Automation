package w;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p.h;
import q.a;
import v.o;
import v.p;
import v.s;
import y.c0;

/* loaded from: classes23.dex */
public final class c implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5729a;

    /* loaded from: classes8.dex */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f5730a;

        public a(Context context) {
            this.f5730a = context;
        }

        @Override // v.p
        @NonNull
        public final o<Uri, InputStream> b(s sVar) {
            return new c(this.f5730a);
        }
    }

    public c(Context context) {
        this.f5729a = context.getApplicationContext();
    }

    @Override // v.o
    @Nullable
    public final o.a<InputStream> a(@NonNull Uri uri, int i5, int i6, @NonNull h hVar) {
        Uri uri2 = uri;
        boolean z4 = false;
        if (i5 != Integer.MIN_VALUE && i6 != Integer.MIN_VALUE && i5 <= 512 && i6 <= 384) {
            Long l5 = (Long) hVar.c(c0.f5968d);
            if (l5 != null && l5.longValue() == -1) {
                z4 = true;
            }
            if (z4) {
                k0.d dVar = new k0.d(uri2);
                Context context = this.f5729a;
                return new o.a<>(dVar, q.a.c(context, uri2, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }

    @Override // v.o
    public final boolean b(@NonNull Uri uri) {
        Uri uri2 = uri;
        return d1.d.j(uri2) && uri2.getPathSegments().contains("video");
    }
}
