package y;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;
import p.g;

/* loaded from: classes5.dex */
public final class c0<T> implements p.j<T, Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public static final p.g<Long> f5968d = new p.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final p.g<Integer> f5969e = new p.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    public static final e f5970f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final f<T> f5971a;

    /* renamed from: b, reason: collision with root package name */
    public final s.d f5972b;

    /* renamed from: c, reason: collision with root package name */
    public final e f5973c;

    /* loaded from: classes25.dex */
    public class a implements g.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f5974a = ByteBuffer.allocate(8);

        @Override // p.g.b
        public final void a(@NonNull byte[] bArr, @NonNull Long l5, @NonNull MessageDigest messageDigest) {
            Long l6 = l5;
            messageDigest.update(bArr);
            synchronized (this.f5974a) {
                this.f5974a.position(0);
                messageDigest.update(this.f5974a.putLong(l6.longValue()).array());
            }
        }
    }

    /* loaded from: classes11.dex */
    public class b implements g.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f5975a = ByteBuffer.allocate(4);

        @Override // p.g.b
        public final void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f5975a) {
                this.f5975a.position(0);
                messageDigest.update(this.f5975a.putInt(num2.intValue()).array());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements f<AssetFileDescriptor> {
        @Override // y.c0.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    @RequiresApi(23)
    /* loaded from: classes19.dex */
    public static final class d implements f<ByteBuffer> {
        @Override // y.c0.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new d0(byteBuffer));
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static class e {
    }

    @VisibleForTesting
    /* loaded from: classes20.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t4);
    }

    /* loaded from: classes19.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // y.c0.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* loaded from: classes17.dex */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public c0(s.d dVar, f<T> fVar) {
        e eVar = f5970f;
        this.f5972b = dVar;
        this.f5971a = fVar;
        this.f5973c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, y.l r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L62
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L62
            if (r14 == r0) goto L62
            y.l$d r0 = y.l.f5992d
            if (r15 == r0) goto L62
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L53
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L53
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L53
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L53
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L53
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L53
            r3 = 90
            if (r2 == r3) goto L36
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L39
        L36:
            r8 = r1
            r1 = r0
            r0 = r8
        L39:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L53
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L53
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L53
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L53
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L53
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L53
            goto L63
        L53:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L62
            java.lang.String r14 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r15, r14, r13)
        L62:
            r13 = 0
        L63:
            if (r13 != 0) goto L69
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L69:
            if (r13 == 0) goto L6c
            return r13
        L6c:
            y.c0$h r9 = new y.c0$h
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c0.c(android.media.MediaMetadataRetriever, long, int, int, int, y.l):android.graphics.Bitmap");
    }

    @Override // p.j
    public final boolean a(@NonNull T t4, @NonNull p.h hVar) {
        return true;
    }

    @Override // p.j
    public final r.w<Bitmap> b(@NonNull T t4, int i5, int i6, @NonNull p.h hVar) {
        long longValue = ((Long) hVar.c(f5968d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) hVar.c(f5969e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) hVar.c(l.f5994f);
        if (lVar == null) {
            lVar = l.f5993e;
        }
        l lVar2 = lVar;
        Objects.requireNonNull(this.f5973c);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f5971a.a(mediaMetadataRetriever, t4);
            Bitmap c5 = c(mediaMetadataRetriever, longValue, num.intValue(), i5, i6, lVar2);
            mediaMetadataRetriever.release();
            return y.e.c(c5, this.f5972b);
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
