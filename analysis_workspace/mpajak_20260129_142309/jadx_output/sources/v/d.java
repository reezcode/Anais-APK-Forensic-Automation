package v;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import v.o;

/* loaded from: classes22.dex */
public final class d implements o<File, ByteBuffer> {

    /* loaded from: classes13.dex */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: b, reason: collision with root package name */
        public final File f5478b;

        public a(File file) {
            this.f5478b = file;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public final void f(@NonNull com.bumptech.glide.f fVar, @NonNull d.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(l0.a.a(this.f5478b));
            } catch (IOException e5) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e5);
                }
                aVar.c(e5);
            }
        }
    }

    /* loaded from: classes20.dex */
    public static class b implements p<File, ByteBuffer> {
        @Override // v.p
        @NonNull
        public final o<File, ByteBuffer> b(@NonNull s sVar) {
            return new d();
        }
    }

    @Override // v.o
    public final o.a<ByteBuffer> a(@NonNull File file, int i5, int i6, @NonNull p.h hVar) {
        File file2 = file;
        return new o.a<>(new k0.d(file2), new a(file2));
    }

    @Override // v.o
    public final /* bridge */ /* synthetic */ boolean b(@NonNull File file) {
        return true;
    }
}
