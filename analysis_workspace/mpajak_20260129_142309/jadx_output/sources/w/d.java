package w;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p.h;
import v.o;
import v.p;
import v.s;

@RequiresApi(29)
/* loaded from: classes5.dex */
public final class d<DataT> implements o<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5731a;

    /* renamed from: b, reason: collision with root package name */
    public final o<File, DataT> f5732b;

    /* renamed from: c, reason: collision with root package name */
    public final o<Uri, DataT> f5733c;

    /* renamed from: d, reason: collision with root package name */
    public final Class<DataT> f5734d;

    /* loaded from: classes3.dex */
    public static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f5735a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<DataT> f5736b;

        public a(Context context, Class<DataT> cls) {
            this.f5735a = context;
            this.f5736b = cls;
        }

        @Override // v.p
        @NonNull
        public final o<Uri, DataT> b(@NonNull s sVar) {
            return new d(this.f5735a, sVar.b(File.class, this.f5736b), sVar.b(Uri.class, this.f5736b), this.f5736b);
        }
    }

    @RequiresApi(29)
    /* loaded from: classes14.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    /* loaded from: classes15.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: w.d$d, reason: collision with other inner class name */
    /* loaded from: classes16.dex */
    public static final class C0079d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: l, reason: collision with root package name */
        public static final String[] f5737l = {"_data"};

        /* renamed from: b, reason: collision with root package name */
        public final Context f5738b;

        /* renamed from: c, reason: collision with root package name */
        public final o<File, DataT> f5739c;

        /* renamed from: d, reason: collision with root package name */
        public final o<Uri, DataT> f5740d;

        /* renamed from: e, reason: collision with root package name */
        public final Uri f5741e;

        /* renamed from: f, reason: collision with root package name */
        public final int f5742f;

        /* renamed from: g, reason: collision with root package name */
        public final int f5743g;

        /* renamed from: h, reason: collision with root package name */
        public final h f5744h;

        /* renamed from: i, reason: collision with root package name */
        public final Class<DataT> f5745i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f5746j;

        /* renamed from: k, reason: collision with root package name */
        @Nullable
        public volatile com.bumptech.glide.load.data.d<DataT> f5747k;

        public C0079d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i5, int i6, h hVar, Class<DataT> cls) {
            this.f5738b = context.getApplicationContext();
            this.f5739c = oVar;
            this.f5740d = oVar2;
            this.f5741e = uri;
            this.f5742f = i5;
            this.f5743g = i6;
            this.f5744h = hVar;
            this.f5745i = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<DataT> a() {
            return this.f5745i;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f5747k;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Nullable
        public final com.bumptech.glide.load.data.d<DataT> c() {
            o.a<DataT> a5;
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                o<File, DataT> oVar = this.f5739c;
                Uri uri = this.f5741e;
                try {
                    Cursor query = this.f5738b.getContentResolver().query(uri, f5737l, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                query.close();
                                a5 = oVar.a(file, this.f5742f, this.f5743g, this.f5744h);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                a5 = this.f5740d.a(this.f5738b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.f5741e) : this.f5741e, this.f5742f, this.f5743g, this.f5744h);
            }
            if (a5 != null) {
                return a5.f5514c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f5746j = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f5747k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final p.a e() {
            return p.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void f(@NonNull f fVar, @NonNull d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c5 = c();
                if (c5 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f5741e));
                    return;
                }
                this.f5747k = c5;
                if (this.f5746j) {
                    cancel();
                } else {
                    c5.f(fVar, aVar);
                }
            } catch (FileNotFoundException e5) {
                aVar.c(e5);
            }
        }
    }

    public d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f5731a = context.getApplicationContext();
        this.f5732b = oVar;
        this.f5733c = oVar2;
        this.f5734d = cls;
    }

    @Override // v.o
    public final o.a a(@NonNull Uri uri, int i5, int i6, @NonNull h hVar) {
        Uri uri2 = uri;
        return new o.a(new k0.d(uri2), new C0079d(this.f5731a, this.f5732b, this.f5733c, uri2, i5, i6, hVar, this.f5734d));
    }

    @Override // v.o
    public final boolean b(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && d1.d.j(uri);
    }
}
