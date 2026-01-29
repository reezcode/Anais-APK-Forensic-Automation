package c0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l0.k;
import p.l;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final o.a f484a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f485b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f486c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.i f487d;

    /* renamed from: e, reason: collision with root package name */
    public final s.d f488e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f489f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f490g;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.h<Bitmap> f491h;

    /* renamed from: i, reason: collision with root package name */
    public a f492i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f493j;

    /* renamed from: k, reason: collision with root package name */
    public a f494k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f495l;

    /* renamed from: m, reason: collision with root package name */
    public l<Bitmap> f496m;

    /* renamed from: n, reason: collision with root package name */
    public a f497n;

    /* renamed from: o, reason: collision with root package name */
    public int f498o;

    /* renamed from: p, reason: collision with root package name */
    public int f499p;

    /* renamed from: q, reason: collision with root package name */
    public int f500q;

    @VisibleForTesting
    /* loaded from: classes9.dex */
    public static class a extends i0.c<Bitmap> {

        /* renamed from: e, reason: collision with root package name */
        public final Handler f501e;

        /* renamed from: f, reason: collision with root package name */
        public final int f502f;

        /* renamed from: g, reason: collision with root package name */
        public final long f503g;

        /* renamed from: h, reason: collision with root package name */
        public Bitmap f504h;

        public a(Handler handler, int i5, long j5) {
            this.f501e = handler;
            this.f502f = i5;
            this.f503g = j5;
        }

        @Override // i0.h
        public final void h(@Nullable Drawable drawable) {
            this.f504h = null;
        }

        @Override // i0.h
        public final void i(@NonNull Object obj) {
            this.f504h = (Bitmap) obj;
            this.f501e.sendMessageAtTime(this.f501e.obtainMessage(1, this), this.f503g);
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes11.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i5 = message.what;
            if (i5 == 1) {
                g.this.b((a) message.obj);
                return true;
            }
            if (i5 != 2) {
                return false;
            }
            g.this.f487d.k((a) message.obj);
            return false;
        }
    }

    public g(com.bumptech.glide.b bVar, o.a aVar, int i5, int i6, l<Bitmap> lVar, Bitmap bitmap) {
        s.d dVar = bVar.f529b;
        com.bumptech.glide.i f5 = com.bumptech.glide.b.f(bVar.f531d.getBaseContext());
        com.bumptech.glide.i f6 = com.bumptech.glide.b.f(bVar.f531d.getBaseContext());
        Objects.requireNonNull(f6);
        com.bumptech.glide.h<Bitmap> a5 = new com.bumptech.glide.h(f6.f584b, f6, Bitmap.class, f6.f585c).a(com.bumptech.glide.i.f583l).a(((h0.f) ((h0.f) new h0.f().d(r.l.f4891a).o()).l()).g(i5, i6));
        this.f486c = new ArrayList();
        this.f487d = f5;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f488e = dVar;
        this.f485b = handler;
        this.f491h = a5;
        this.f484a = aVar;
        c(lVar, bitmap);
    }

    public final void a() {
        if (!this.f489f || this.f490g) {
            return;
        }
        a aVar = this.f497n;
        if (aVar != null) {
            this.f497n = null;
            b(aVar);
            return;
        }
        this.f490g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f484a.e();
        this.f484a.c();
        this.f494k = new a(this.f485b, this.f484a.a(), uptimeMillis);
        com.bumptech.glide.h<Bitmap> w4 = this.f491h.a(new h0.f().k(new k0.d(Double.valueOf(Math.random())))).w(this.f484a);
        w4.u(this.f494k, w4);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<c0.g$b>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<c0.g$b>] */
    @VisibleForTesting
    public final void b(a aVar) {
        this.f490g = false;
        if (this.f493j) {
            this.f485b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f489f) {
            this.f497n = aVar;
            return;
        }
        if (aVar.f504h != null) {
            Bitmap bitmap = this.f495l;
            if (bitmap != null) {
                this.f488e.d(bitmap);
                this.f495l = null;
            }
            a aVar2 = this.f492i;
            this.f492i = aVar;
            int size = this.f486c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((b) this.f486c.get(size)).a();
                }
            }
            if (aVar2 != null) {
                this.f485b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(l<Bitmap> lVar, Bitmap bitmap) {
        Objects.requireNonNull(lVar, "Argument must not be null");
        this.f496m = lVar;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.f495l = bitmap;
        this.f491h = this.f491h.a(new h0.f().n(lVar, true));
        this.f498o = k.d(bitmap);
        this.f499p = bitmap.getWidth();
        this.f500q = bitmap.getHeight();
    }
}
