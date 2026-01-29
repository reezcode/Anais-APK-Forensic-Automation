package y;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import y.m;
import y.s;

/* loaded from: classes17.dex */
public final class z implements p.j<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final m f6043a;

    /* renamed from: b, reason: collision with root package name */
    public final s.b f6044b;

    /* loaded from: classes4.dex */
    public static class a implements m.b {

        /* renamed from: a, reason: collision with root package name */
        public final w f6045a;

        /* renamed from: b, reason: collision with root package name */
        public final l0.d f6046b;

        public a(w wVar, l0.d dVar) {
            this.f6045a = wVar;
            this.f6046b = dVar;
        }

        @Override // y.m.b
        public final void a(s.d dVar, Bitmap bitmap) {
            IOException iOException = this.f6046b.f3928c;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                dVar.d(bitmap);
                throw iOException;
            }
        }

        @Override // y.m.b
        public final void b() {
            w wVar = this.f6045a;
            synchronized (wVar) {
                wVar.f6035d = wVar.f6033b.length;
            }
        }
    }

    public z(m mVar, s.b bVar) {
        this.f6043a = mVar;
        this.f6044b = bVar;
    }

    @Override // p.j
    public final boolean a(@NonNull InputStream inputStream, @NonNull p.h hVar) {
        Objects.requireNonNull(this.f6043a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayDeque, java.util.Queue<l0.d>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayDeque, java.util.Queue<l0.d>] */
    @Override // p.j
    public final r.w<Bitmap> b(@NonNull InputStream inputStream, int i5, int i6, @NonNull p.h hVar) {
        w wVar;
        boolean z4;
        l0.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof w) {
            wVar = (w) inputStream2;
            z4 = false;
        } else {
            wVar = new w(inputStream2, this.f6044b);
            z4 = true;
        }
        ?? r12 = l0.d.f3926d;
        synchronized (r12) {
            dVar = (l0.d) r12.poll();
        }
        if (dVar == null) {
            dVar = new l0.d();
        }
        dVar.f3927b = wVar;
        l0.h hVar2 = new l0.h(dVar);
        a aVar = new a(wVar, dVar);
        try {
            m mVar = this.f6043a;
            r.w<Bitmap> a5 = mVar.a(new s.a(hVar2, mVar.f6006d, mVar.f6005c), i5, i6, hVar, aVar);
            dVar.f3928c = null;
            dVar.f3927b = null;
            synchronized (r12) {
                r12.offer(dVar);
            }
            if (z4) {
                wVar.b();
            }
            return a5;
        } catch (Throwable th) {
            dVar.f3928c = null;
            dVar.f3927b = null;
            ?? r14 = l0.d.f3926d;
            synchronized (r14) {
                r14.offer(dVar);
                if (z4) {
                    wVar.b();
                }
                throw th;
            }
        }
    }
}
