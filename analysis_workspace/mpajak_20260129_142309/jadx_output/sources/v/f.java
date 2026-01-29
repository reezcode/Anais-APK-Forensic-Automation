package v;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import v.o;

/* loaded from: classes3.dex */
public final class f<Data> implements o<File, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final d<Data> f5484a;

    /* loaded from: classes12.dex */
    public static class a<Data> implements p<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final d<Data> f5485a;

        public a(d<Data> dVar) {
            this.f5485a = dVar;
        }

        @Override // v.p
        @NonNull
        public final o<File, Data> b(@NonNull s sVar) {
            return new f(this.f5485a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            @Override // v.f.d
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // v.f.d
            public final ParcelFileDescriptor b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // v.f.d
            public final void c(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* loaded from: classes10.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final File f5486b;

        /* renamed from: c, reason: collision with root package name */
        public final d<Data> f5487c;

        /* renamed from: d, reason: collision with root package name */
        public Data f5488d;

        public c(File file, d<Data> dVar) {
            this.f5486b = file;
            this.f5487c = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<Data> a() {
            return this.f5487c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            Data data = this.f5488d;
            if (data != null) {
                try {
                    this.f5487c.c(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final p.a e() {
            return p.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void f(@NonNull com.bumptech.glide.f fVar, @NonNull d.a<? super Data> aVar) {
            try {
                Data b5 = this.f5487c.b(this.f5486b);
                this.f5488d = b5;
                aVar.d(b5);
            } catch (FileNotFoundException e5) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e5);
                }
                aVar.c(e5);
            }
        }
    }

    /* loaded from: classes17.dex */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    /* loaded from: classes10.dex */
    public static class e extends a<InputStream> {

        /* loaded from: classes3.dex */
        public class a implements d<InputStream> {
            @Override // v.f.d
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // v.f.d
            public final InputStream b(File file) {
                return new FileInputStream(file);
            }

            @Override // v.f.d
            public final void c(InputStream inputStream) {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f5484a = dVar;
    }

    @Override // v.o
    public final o.a a(@NonNull File file, int i5, int i6, @NonNull p.h hVar) {
        File file2 = file;
        return new o.a(new k0.d(file2), new c(file2, this.f5484a));
    }

    @Override // v.o
    public final /* bridge */ /* synthetic */ boolean b(@NonNull File file) {
        return true;
    }
}
