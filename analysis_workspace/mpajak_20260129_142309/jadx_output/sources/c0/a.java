package c0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import l0.k;
import r.w;

/* loaded from: classes11.dex */
public final class a implements p.j<ByteBuffer, c> {

    /* renamed from: f, reason: collision with root package name */
    public static final C0011a f461f = new C0011a();

    /* renamed from: g, reason: collision with root package name */
    public static final b f462g = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f463a;

    /* renamed from: b, reason: collision with root package name */
    public final List<ImageHeaderParser> f464b;

    /* renamed from: c, reason: collision with root package name */
    public final b f465c;

    /* renamed from: d, reason: collision with root package name */
    public final C0011a f466d;

    /* renamed from: e, reason: collision with root package name */
    public final c0.b f467e;

    @VisibleForTesting
    /* renamed from: c0.a$a, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0011a {
    }

    @VisibleForTesting
    /* loaded from: classes10.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<o.d> f468a;

        public b() {
            char[] cArr = k.f3942a;
            this.f468a = new ArrayDeque(0);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, s.d dVar, s.b bVar) {
        b bVar2 = f462g;
        C0011a c0011a = f461f;
        this.f463a = context.getApplicationContext();
        this.f464b = list;
        this.f466d = c0011a;
        this.f467e = new c0.b(dVar, bVar);
        this.f465c = bVar2;
    }

    public static int d(o.c cVar, int i5, int i6) {
        int min = Math.min(cVar.f4539g / i6, cVar.f4538f / i5);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i5 + "x" + i6 + "], actual dimens: [" + cVar.f4538f + "x" + cVar.f4539g + "]");
        }
        return max;
    }

    @Override // p.j
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull p.h hVar) {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) hVar.c(i.f508b)).booleanValue()) {
            return false;
        }
        List<ImageHeaderParser> list = this.f464b;
        if (byteBuffer2 == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            int size = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
                ImageHeaderParser.ImageType a5 = list.get(i5).a(byteBuffer2);
                if (a5 != ImageHeaderParser.ImageType.UNKNOWN) {
                    imageType = a5;
                    break;
                }
                i5++;
            }
        }
        return imageType == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Queue<o.d>] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.ArrayDeque, java.util.Queue<o.d>] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayDeque, java.util.Queue<o.d>] */
    @Override // p.j
    public final w<c> b(@NonNull ByteBuffer byteBuffer, int i5, int i6, @NonNull p.h hVar) {
        o.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f465c;
        synchronized (bVar) {
            o.d dVar2 = (o.d) bVar.f468a.poll();
            if (dVar2 == null) {
                dVar2 = new o.d();
            }
            dVar = dVar2;
            dVar.f4545b = null;
            Arrays.fill(dVar.f4544a, (byte) 0);
            dVar.f4546c = new o.c();
            dVar.f4547d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            dVar.f4545b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f4545b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            e c5 = c(byteBuffer2, i5, i6, dVar, hVar);
            b bVar2 = this.f465c;
            synchronized (bVar2) {
                dVar.f4545b = null;
                dVar.f4546c = null;
                bVar2.f468a.offer(dVar);
            }
            return c5;
        } catch (Throwable th) {
            b bVar3 = this.f465c;
            synchronized (bVar3) {
                dVar.f4545b = null;
                dVar.f4546c = null;
                bVar3.f468a.offer(dVar);
                throw th;
            }
        }
    }

    @Nullable
    public final e c(ByteBuffer byteBuffer, int i5, int i6, o.d dVar, p.h hVar) {
        int i7 = l0.f.f3932b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            o.c b5 = dVar.b();
            if (b5.f4535c > 0 && b5.f4534b == 0) {
                Bitmap.Config config = hVar.c(i.f507a) == p.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int d5 = d(b5, i5, i6);
                C0011a c0011a = this.f466d;
                c0.b bVar = this.f467e;
                Objects.requireNonNull(c0011a);
                o.e eVar = new o.e(bVar, b5, byteBuffer, d5);
                eVar.i(config);
                eVar.f4558k = (eVar.f4558k + 1) % eVar.f4559l.f4535c;
                Bitmap b6 = eVar.b();
                if (b6 == null) {
                    return null;
                }
                e eVar2 = new e(new c(this.f463a, eVar, x.b.f5905b, i5, i6, b6));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    StringBuilder g5 = androidx.activity.d.g("Decoded GIF from stream in ");
                    g5.append(l0.f.a(elapsedRealtimeNanos));
                    Log.v("BufferGifDecoder", g5.toString());
                }
                return eVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder g6 = androidx.activity.d.g("Decoded GIF from stream in ");
                g6.append(l0.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", g6.toString());
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder g7 = androidx.activity.d.g("Decoded GIF from stream in ");
                g7.append(l0.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", g7.toString());
            }
        }
    }
}
