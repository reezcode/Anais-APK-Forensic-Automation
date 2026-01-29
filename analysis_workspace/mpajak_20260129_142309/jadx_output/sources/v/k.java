package v;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import v.o;

/* loaded from: classes12.dex */
public final class k implements o<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5502a;

    /* loaded from: classes15.dex */
    public static final class a implements p<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f5503a;

        public a(Context context) {
            this.f5503a = context;
        }

        @Override // v.p
        @NonNull
        public final o<Uri, File> b(s sVar) {
            return new k(this.f5503a);
        }
    }

    /* loaded from: classes13.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: d, reason: collision with root package name */
        public static final String[] f5504d = {"_data"};

        /* renamed from: b, reason: collision with root package name */
        public final Context f5505b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f5506c;

        public b(Context context, Uri uri) {
            this.f5505b = context;
            this.f5506c = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final p.a e() {
            return p.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void f(@NonNull com.bumptech.glide.f fVar, @NonNull d.a<? super File> aVar) {
            Cursor query = this.f5505b.getContentResolver().query(this.f5506c, f5504d, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.d(new File(r0));
                return;
            }
            StringBuilder g5 = androidx.activity.d.g("Failed to find file path for: ");
            g5.append(this.f5506c);
            aVar.c(new FileNotFoundException(g5.toString()));
        }
    }

    public k(Context context) {
        this.f5502a = context;
    }

    @Override // v.o
    public final o.a<File> a(@NonNull Uri uri, int i5, int i6, @NonNull p.h hVar) {
        Uri uri2 = uri;
        return new o.a<>(new k0.d(uri2), new b(this.f5502a, uri2));
    }

    @Override // v.o
    public final boolean b(@NonNull Uri uri) {
        return d1.d.j(uri);
    }
}
