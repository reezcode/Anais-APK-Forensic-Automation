package pl.droidsonroids.gif;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.widget.MediaController;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k4.c;

/* loaded from: classes5.dex */
public final class b extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4681b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f4682c;

    /* renamed from: d, reason: collision with root package name */
    public long f4683d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f4684e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f4685f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap f4686g;

    /* renamed from: h, reason: collision with root package name */
    public final GifInfoHandle f4687h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentLinkedQueue<k4.a> f4688i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f4689j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuffColorFilter f4690k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f4691l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4692m;

    /* renamed from: n, reason: collision with root package name */
    public final k4.d f4693n;

    /* renamed from: o, reason: collision with root package name */
    public final e f4694o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f4695p;

    /* renamed from: q, reason: collision with root package name */
    public ScheduledFuture<?> f4696q;

    /* renamed from: r, reason: collision with root package name */
    public int f4697r;

    /* renamed from: s, reason: collision with root package name */
    public int f4698s;

    /* loaded from: classes12.dex */
    public class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4699c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, int i5) {
            super(bVar);
            this.f4699c = i5;
        }

        @Override // pl.droidsonroids.gif.f
        public final void a() {
            b bVar = b.this;
            bVar.f4687h.q(this.f4699c, bVar.f4686g);
            this.f4707b.f4693n.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@androidx.annotation.Nullable android.content.ContentResolver r3, @androidx.annotation.NonNull android.net.Uri r4) {
        /*
            r2 = this;
            int r0 = pl.droidsonroids.gif.GifInfoHandle.f4678b
            java.lang.String r0 = r4.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            pl.droidsonroids.gif.GifInfoHandle r3 = new pl.droidsonroids.gif.GifInfoHandle
            java.lang.String r4 = r4.getPath()
            r3.<init>(r4)
            goto L26
        L18:
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r3 = r3.openAssetFileDescriptor(r4, r0)
            if (r3 == 0) goto L2a
            pl.droidsonroids.gif.GifInfoHandle r4 = new pl.droidsonroids.gif.GifInfoHandle
            r4.<init>(r3)
            r3 = r4
        L26:
            r2.<init>(r3)
            return
        L2a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not open AssetFileDescriptor for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.b.<init>(android.content.ContentResolver, android.net.Uri):void");
    }

    public b(@NonNull Resources resources, @DrawableRes @RawRes int i5) {
        this(new GifInfoHandle(resources.openRawResourceFd(i5)));
        List<String> list = d.f4702a;
        TypedValue typedValue = new TypedValue();
        resources.getValue(i5, typedValue, true);
        int i6 = typedValue.density;
        if (i6 == 0) {
            i6 = 160;
        } else if (i6 == 65535) {
            i6 = 0;
        }
        int i7 = resources.getDisplayMetrics().densityDpi;
        float f5 = (i6 <= 0 || i7 <= 0) ? 1.0f : i7 / i6;
        this.f4698s = (int) (this.f4687h.e() * f5);
        this.f4697r = (int) (this.f4687h.j() * f5);
    }

    public b(GifInfoHandle gifInfoHandle) {
        this.f4682c = true;
        this.f4683d = Long.MIN_VALUE;
        this.f4684e = new Rect();
        this.f4685f = new Paint(6);
        this.f4688i = new ConcurrentLinkedQueue<>();
        e eVar = new e(this);
        this.f4694o = eVar;
        this.f4692m = true;
        int i5 = k4.c.f3907b;
        this.f4681b = c.a.f3908a;
        this.f4687h = gifInfoHandle;
        Bitmap createBitmap = Bitmap.createBitmap(gifInfoHandle.j(), gifInfoHandle.e(), Bitmap.Config.ARGB_8888);
        this.f4686g = createBitmap;
        createBitmap.setHasAlpha(true ^ gifInfoHandle.k());
        this.f4695p = new Rect(0, 0, gifInfoHandle.j(), gifInfoHandle.e());
        this.f4693n = new k4.d(this);
        eVar.a();
        this.f4697r = gifInfoHandle.j();
        this.f4698s = gifInfoHandle.e();
    }

    public final void a(long j5) {
        if (this.f4692m) {
            this.f4683d = 0L;
            this.f4693n.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f4696q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f4693n.removeMessages(-1);
        this.f4696q = this.f4681b.schedule(this.f4694o, Math.max(j5, 0L), TimeUnit.MILLISECONDS);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f4687h.h() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f4687h.h() > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        boolean z4;
        if (this.f4690k == null || this.f4685f.getColorFilter() != null) {
            z4 = false;
        } else {
            this.f4685f.setColorFilter(this.f4690k);
            z4 = true;
        }
        canvas.drawBitmap(this.f4686g, this.f4695p, this.f4684e, this.f4685f);
        if (z4) {
            this.f4685f.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4685f.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4685f.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.f4687h.c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.f4687h.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4698s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4697r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (!this.f4687h.k() || this.f4685f.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f4692m && this.f4682c) {
            long j5 = this.f4683d;
            if (j5 != Long.MIN_VALUE) {
                long max = Math.max(0L, j5 - SystemClock.uptimeMillis());
                this.f4683d = Long.MIN_VALUE;
                this.f4681b.remove(this.f4694o);
                this.f4696q = this.f4681b.schedule(this.f4694o, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f4682c;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f4682c;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.f4689j) != null && colorStateList.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f4684e.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4689j;
        if (colorStateList == null || (mode = this.f4691l) == null) {
            return false;
        }
        this.f4690k = b(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(@IntRange(from = 0, to = 2147483647L) int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f4681b.execute(new a(this, i5));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = 0, to = 255) int i5) {
        this.f4685f.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f4685f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public final void setDither(boolean z4) {
        this.f4685f.setDither(z4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z4) {
        this.f4685f.setFilterBitmap(z4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f4689j = colorStateList;
        this.f4690k = b(colorStateList, this.f4691l);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f4691l = mode;
        this.f4690k = b(this.f4689j, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        if (!this.f4692m) {
            if (z4) {
                if (z5) {
                    this.f4681b.execute(new pl.droidsonroids.gif.a(this, this));
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        synchronized (this) {
            if (this.f4682c) {
                return;
            }
            this.f4682c = true;
            a(this.f4687h.n());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            if (this.f4682c) {
                this.f4682c = false;
                ScheduledFuture<?> scheduledFuture = this.f4696q;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f4693n.removeMessages(-1);
                this.f4687h.p();
            }
        }
    }

    @NonNull
    public final String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f4687h.j()), Integer.valueOf(this.f4687h.e()), Integer.valueOf(this.f4687h.h()), Integer.valueOf(this.f4687h.g()));
    }
}
