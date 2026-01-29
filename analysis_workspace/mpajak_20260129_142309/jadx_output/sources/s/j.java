package s;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes17.dex */
public final class j implements d {

    /* renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f5097j = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final k f5098a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f5099b;

    /* renamed from: c, reason: collision with root package name */
    public final a f5100c;

    /* renamed from: d, reason: collision with root package name */
    public long f5101d;

    /* renamed from: e, reason: collision with root package name */
    public long f5102e;

    /* renamed from: f, reason: collision with root package name */
    public int f5103f;

    /* renamed from: g, reason: collision with root package name */
    public int f5104g;

    /* renamed from: h, reason: collision with root package name */
    public int f5105h;

    /* renamed from: i, reason: collision with root package name */
    public int f5106i;

    /* loaded from: classes22.dex */
    public static final class a {
    }

    public j(long j5) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i5 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i5 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f5101d = j5;
        this.f5098a = mVar;
        this.f5099b = unmodifiableSet;
        this.f5100c = new a();
    }

    @Override // s.d
    public final void a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    @Override // s.d
    @NonNull
    public final Bitmap b(int i5, int i6, Bitmap.Config config) {
        Bitmap g5 = g(i5, i6, config);
        if (g5 != null) {
            return g5;
        }
        if (config == null) {
            config = f5097j;
        }
        return Bitmap.createBitmap(i5, i6, config);
    }

    @Override // s.d
    @NonNull
    public final Bitmap c(int i5, int i6, Bitmap.Config config) {
        Bitmap g5 = g(i5, i6, config);
        if (g5 != null) {
            g5.eraseColor(0);
            return g5;
        }
        if (config == null) {
            config = f5097j;
        }
        return Bitmap.createBitmap(i5, i6, config);
    }

    @Override // s.d
    public final synchronized void d(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
        if (bitmap.isMutable()) {
            Objects.requireNonNull((m) this.f5098a);
            if (l0.k.d(bitmap) <= this.f5101d && this.f5099b.contains(bitmap.getConfig())) {
                Objects.requireNonNull((m) this.f5098a);
                int d5 = l0.k.d(bitmap);
                ((m) this.f5098a).f(bitmap);
                Objects.requireNonNull(this.f5100c);
                this.f5105h++;
                this.f5102e += d5;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + ((m) this.f5098a).e(bitmap));
                }
                e();
                h(this.f5101d);
                return;
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((m) this.f5098a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f5099b.contains(bitmap.getConfig()));
        }
        bitmap.recycle();
    }

    public final void e() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            f();
        }
    }

    public final void f() {
        StringBuilder g5 = androidx.activity.d.g("Hits=");
        g5.append(this.f5103f);
        g5.append(", misses=");
        g5.append(this.f5104g);
        g5.append(", puts=");
        g5.append(this.f5105h);
        g5.append(", evictions=");
        g5.append(this.f5106i);
        g5.append(", currentSize=");
        g5.append(this.f5102e);
        g5.append(", maxSize=");
        g5.append(this.f5101d);
        g5.append("\nStrategy=");
        g5.append(this.f5098a);
        Log.v("LruBitmapPool", g5.toString());
    }

    @Nullable
    public final synchronized Bitmap g(int i5, int i6, @Nullable Bitmap.Config config) {
        Bitmap b5;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        b5 = ((m) this.f5098a).b(i5, i6, config != null ? config : f5097j);
        if (b5 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                Objects.requireNonNull((m) this.f5098a);
                sb.append(m.c(l0.k.c(i5, i6, config), config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f5104g++;
        } else {
            this.f5103f++;
            long j5 = this.f5102e;
            Objects.requireNonNull((m) this.f5098a);
            this.f5102e = j5 - l0.k.d(b5);
            Objects.requireNonNull(this.f5100c);
            b5.setHasAlpha(true);
            b5.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            Objects.requireNonNull((m) this.f5098a);
            sb2.append(m.c(l0.k.c(i5, i6, config), config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        e();
        return b5;
    }

    public final synchronized void h(long j5) {
        while (this.f5102e > j5) {
            m mVar = (m) this.f5098a;
            Bitmap d5 = mVar.f5113b.d();
            if (d5 != null) {
                mVar.a(Integer.valueOf(l0.k.d(d5)), d5);
            }
            if (d5 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    f();
                }
                this.f5102e = 0L;
                return;
            }
            Objects.requireNonNull(this.f5100c);
            long j6 = this.f5102e;
            Objects.requireNonNull((m) this.f5098a);
            this.f5102e = j6 - l0.k.d(d5);
            this.f5106i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((m) this.f5098a).e(d5));
            }
            e();
            d5.recycle();
        }
    }

    @Override // s.d
    @SuppressLint({"InlinedApi"})
    public final void trimMemory(int i5) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i5);
        }
        if (i5 >= 40 || (Build.VERSION.SDK_INT >= 23 && i5 >= 20)) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            h(0L);
        } else if (i5 >= 20 || i5 == 15) {
            h(this.f5101d / 2);
        }
    }
}
