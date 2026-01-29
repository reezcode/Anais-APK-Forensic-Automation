package v;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import v.o;

/* loaded from: classes11.dex */
public final class x<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f5548b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a, reason: collision with root package name */
    public final c<Data> f5549a;

    /* loaded from: classes24.dex */
    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f5550a;

        public a(ContentResolver contentResolver) {
            this.f5550a = contentResolver;
        }

        @Override // v.x.c
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f5550a, uri);
        }

        @Override // v.p
        public final o<Uri, AssetFileDescriptor> b(s sVar) {
            return new x(this);
        }
    }

    /* loaded from: classes8.dex */
    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f5551a;

        public b(ContentResolver contentResolver) {
            this.f5551a = contentResolver;
        }

        @Override // v.x.c
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f5551a, uri);
        }

        @Override // v.p
        @NonNull
        public final o<Uri, ParcelFileDescriptor> b(s sVar) {
            return new x(this);
        }
    }

    /* loaded from: classes2.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* loaded from: classes5.dex */
    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f5552a;

        public d(ContentResolver contentResolver) {
            this.f5552a = contentResolver;
        }

        @Override // v.x.c
        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f5552a, uri);
        }

        @Override // v.p
        @NonNull
        public final o<Uri, InputStream> b(s sVar) {
            return new x(this);
        }
    }

    public x(c<Data> cVar) {
        this.f5549a = cVar;
    }

    @Override // v.o
    public final o.a a(@NonNull Uri uri, int i5, int i6, @NonNull p.h hVar) {
        Uri uri2 = uri;
        return new o.a(new k0.d(uri2), this.f5549a.a(uri2));
    }

    @Override // v.o
    public final boolean b(@NonNull Uri uri) {
        return f5548b.contains(uri.getScheme());
    }
}
