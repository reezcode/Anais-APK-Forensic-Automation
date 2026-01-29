package y;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final p.g<p.b> f5996f = p.g.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", p.b.PREFER_ARGB_8888);

    /* renamed from: g, reason: collision with root package name */
    public static final p.g<p.i> f5997g = p.g.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", p.i.SRGB);

    /* renamed from: h, reason: collision with root package name */
    public static final p.g<Boolean> f5998h;

    /* renamed from: i, reason: collision with root package name */
    public static final p.g<Boolean> f5999i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set<String> f6000j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f6001k;

    /* renamed from: l, reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f6002l;

    /* renamed from: a, reason: collision with root package name */
    public final s.d f6003a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f6004b;

    /* renamed from: c, reason: collision with root package name */
    public final s.b f6005c;

    /* renamed from: d, reason: collision with root package name */
    public final List<ImageHeaderParser> f6006d;

    /* renamed from: e, reason: collision with root package name */
    public final r f6007e = r.a();

    /* loaded from: classes16.dex */
    public class a implements b {
        @Override // y.m.b
        public final void a(s.d dVar, Bitmap bitmap) {
        }

        @Override // y.m.b
        public final void b() {
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(s.d dVar, Bitmap bitmap);

        void b();
    }

    static {
        p.g<l> gVar = l.f5994f;
        Boolean bool = Boolean.FALSE;
        f5998h = p.g.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f5999i = p.g.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f6000j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f6001k = new a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = l0.k.f3942a;
        f6002l = new ArrayDeque(0);
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, s.d dVar, s.b bVar) {
        this.f6006d = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f6004b = displayMetrics;
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.f6003a = dVar;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f6005c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(y.s r5, android.graphics.BitmapFactory.Options r6, y.m.b r7, s.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.b()
            r5.b()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = y.a0.f5961c
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L21
            r4.unlock()
            return r5
        L1f:
            r5 = move-exception
            goto L48
        L21:
            r4 = move-exception
            java.io.IOException r1 = h(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L1f
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L32
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L1f
        L32:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L47
            r8.d(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            java.util.concurrent.locks.Lock r6 = y.a0.f5961c
            r6.unlock()
            return r5
        L46:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L47:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L48:
            java.util.concurrent.locks.Lock r6 = y.a0.f5961c
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y.m.c(y.s, android.graphics.BitmapFactory$Options, y.m$b, s.d):android.graphics.Bitmap");
    }

    @Nullable
    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder g5 = androidx.activity.d.g(" (");
        g5.append(bitmap.getAllocationByteCount());
        g5.append(")");
        String sb = g5.toString();
        StringBuilder g6 = androidx.activity.d.g("[");
        g6.append(bitmap.getWidth());
        g6.append("x");
        g6.append(bitmap.getHeight());
        g6.append("] ");
        g6.append(bitmap.getConfig());
        g6.append(sb);
        return g6.toString();
    }

    public static int e(double d5) {
        if (d5 > 1.0d) {
            d5 = 1.0d / d5;
        }
        return (int) Math.round(d5 * 2.147483647E9d);
    }

    public static int[] f(s sVar, BitmapFactory.Options options, b bVar, s.d dVar) {
        options.inJustDecodeBounds = true;
        c(sVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static boolean g(int i5) {
        return i5 == 90 || i5 == 270;
    }

    public static IOException h(IllegalArgumentException illegalArgumentException, int i5, int i6, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i5 + ", outHeight: " + i6 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void i(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayDeque, java.util.Queue<android.graphics.BitmapFactory$Options>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayDeque, java.util.Queue<android.graphics.BitmapFactory$Options>] */
    public final r.w<Bitmap> a(s sVar, int i5, int i6, p.h hVar, b bVar) {
        ?? r14;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f6005c.b(65536, byte[].class);
        synchronized (m.class) {
            r14 = f6002l;
            synchronized (r14) {
                options = (BitmapFactory.Options) r14.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                i(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        p.b bVar2 = (p.b) hVar.c(f5996f);
        p.i iVar = (p.i) hVar.c(f5997g);
        l lVar = (l) hVar.c(l.f5994f);
        boolean booleanValue = ((Boolean) hVar.c(f5998h)).booleanValue();
        p.g<Boolean> gVar = f5999i;
        try {
            e c5 = e.c(b(sVar, options2, lVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i5, i6, booleanValue, bVar), this.f6003a);
            i(options2);
            synchronized (r14) {
                r14.offer(options2);
            }
            this.f6005c.put(bArr);
            return c5;
        } catch (Throwable th) {
            i(options2);
            ?? r22 = f6002l;
            synchronized (r22) {
                r22.offer(options2);
                this.f6005c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x03e6, code lost:
    
        if (r0 >= 26) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x051a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(y.s r33, android.graphics.BitmapFactory.Options r34, y.l r35, p.b r36, p.i r37, boolean r38, int r39, int r40, boolean r41, y.m.b r42) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.m.b(y.s, android.graphics.BitmapFactory$Options, y.l, p.b, p.i, boolean, int, int, boolean, y.m$b):android.graphics.Bitmap");
    }
}
