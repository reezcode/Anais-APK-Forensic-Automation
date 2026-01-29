package v;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import v.o;

/* loaded from: classes3.dex */
public final class t<Data> implements o<Integer, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final o<Uri, Data> f5537a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f5538b;

    /* loaded from: classes19.dex */
    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f5539a;

        public a(Resources resources) {
            this.f5539a = resources;
        }

        @Override // v.p
        public final o<Integer, AssetFileDescriptor> b(s sVar) {
            return new t(this.f5539a, sVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes23.dex */
    public static class b implements p<Integer, ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f5540a;

        public b(Resources resources) {
            this.f5540a = resources;
        }

        @Override // v.p
        @NonNull
        public final o<Integer, ParcelFileDescriptor> b(s sVar) {
            return new t(this.f5540a, sVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes22.dex */
    public static class c implements p<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f5541a;

        public c(Resources resources) {
            this.f5541a = resources;
        }

        @Override // v.p
        @NonNull
        public final o<Integer, InputStream> b(s sVar) {
            return new t(this.f5541a, sVar.b(Uri.class, InputStream.class));
        }
    }

    /* loaded from: classes5.dex */
    public static class d implements p<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f5542a;

        public d(Resources resources) {
            this.f5542a = resources;
        }

        @Override // v.p
        @NonNull
        public final o<Integer, Uri> b(s sVar) {
            return new t(this.f5542a, w.f5545a);
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f5538b = resources;
        this.f5537a = oVar;
    }

    @Override // v.o
    public final o.a a(@NonNull Integer num, int i5, int i6, @NonNull p.h hVar) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.f5538b.getResourcePackageName(num2.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + this.f5538b.getResourceTypeName(num2.intValue()) + IOUtils.DIR_SEPARATOR_UNIX + this.f5538b.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e5) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e5);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f5537a.a(uri, i5, i6, hVar);
    }

    @Override // v.o
    public final /* bridge */ /* synthetic */ boolean b(@NonNull Integer num) {
        return true;
    }
}
