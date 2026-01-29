package v;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import v.o;

/* loaded from: classes16.dex */
public final class a<Data> implements o<Uri, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f5471a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0073a<Data> f5472b;

    /* renamed from: v.a$a, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC0073a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* loaded from: classes3.dex */
    public static class b implements p<Uri, ParcelFileDescriptor>, InterfaceC0073a<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f5473a;

        public b(AssetManager assetManager) {
            this.f5473a = assetManager;
        }

        @Override // v.a.InterfaceC0073a
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // v.p
        @NonNull
        public final o<Uri, ParcelFileDescriptor> b(s sVar) {
            return new a(this.f5473a, this);
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements p<Uri, InputStream>, InterfaceC0073a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f5474a;

        public c(AssetManager assetManager) {
            this.f5474a = assetManager;
        }

        @Override // v.a.InterfaceC0073a
        public final com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // v.p
        @NonNull
        public final o<Uri, InputStream> b(s sVar) {
            return new a(this.f5474a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0073a<Data> interfaceC0073a) {
        this.f5471a = assetManager;
        this.f5472b = interfaceC0073a;
    }

    @Override // v.o
    public final o.a a(@NonNull Uri uri, int i5, int i6, @NonNull p.h hVar) {
        Uri uri2 = uri;
        return new o.a(new k0.d(uri2), this.f5472b.a(this.f5471a, uri2.toString().substring(22)));
    }

    @Override // v.o
    public final boolean b(@NonNull Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}
