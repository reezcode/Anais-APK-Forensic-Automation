package y;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* loaded from: classes19.dex */
public interface s {

    /* loaded from: classes7.dex */
    public static final class a implements s {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.data.k f6023a;

        /* renamed from: b, reason: collision with root package name */
        public final s.b f6024b;

        /* renamed from: c, reason: collision with root package name */
        public final List<ImageHeaderParser> f6025c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, s.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f6024b = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f6025c = list;
            this.f6023a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // y.s
        @Nullable
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f6023a.a(), null, options);
        }

        @Override // y.s
        public final void b() {
            w wVar = this.f6023a.f624a;
            synchronized (wVar) {
                wVar.f6035d = wVar.f6033b.length;
            }
        }

        @Override // y.s
        public final int c() {
            return com.bumptech.glide.load.c.a(this.f6025c, this.f6023a.a(), this.f6024b);
        }

        @Override // y.s
        public final ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.c.c(this.f6025c, this.f6023a.a(), this.f6024b);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes15.dex */
    public static final class b implements s {

        /* renamed from: a, reason: collision with root package name */
        public final s.b f6026a;

        /* renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f6027b;

        /* renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f6028c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, s.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f6026a = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f6027b = list;
            this.f6028c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // y.s
        @Nullable
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f6028c.a().getFileDescriptor(), null, options);
        }

        @Override // y.s
        public final void b() {
        }

        @Override // y.s
        public final int c() {
            return com.bumptech.glide.load.c.b(this.f6027b, new com.bumptech.glide.load.b(this.f6028c, this.f6026a));
        }

        @Override // y.s
        public final ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.c.d(this.f6027b, new com.bumptech.glide.load.a(this.f6028c, this.f6026a));
        }
    }

    @Nullable
    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
