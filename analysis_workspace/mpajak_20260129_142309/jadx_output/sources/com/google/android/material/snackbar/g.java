package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes16.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static g f1174e;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f1175a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Handler f1176b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public c f1177c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public c f1178d;

    /* loaded from: classes12.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            g gVar = g.this;
            c cVar = (c) message.obj;
            synchronized (gVar.f1175a) {
                if (gVar.f1177c == cVar || gVar.f1178d == cVar) {
                    gVar.a(cVar, 2);
                }
            }
            return true;
        }
    }

    /* loaded from: classes10.dex */
    public interface b {
        void a(int i5);

        void show();
    }

    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<b> f1180a;

        /* renamed from: b, reason: collision with root package name */
        public int f1181b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1182c;

        public c(int i5, b bVar) {
            this.f1180a = new WeakReference<>(bVar);
            this.f1181b = i5;
        }
    }

    public static g b() {
        if (f1174e == null) {
            f1174e = new g();
        }
        return f1174e;
    }

    public final boolean a(@NonNull c cVar, int i5) {
        b bVar = cVar.f1180a.get();
        if (bVar == null) {
            return false;
        }
        this.f1176b.removeCallbacksAndMessages(cVar);
        bVar.a(i5);
        return true;
    }

    public final boolean c(b bVar) {
        c cVar = this.f1177c;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
            if (bVar != null && cVar.f1180a.get() == bVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(b bVar) {
        c cVar = this.f1178d;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
            if (bVar != null && cVar.f1180a.get() == bVar) {
                return true;
            }
        }
        return false;
    }

    public final void e(b bVar) {
        synchronized (this.f1175a) {
            if (c(bVar)) {
                c cVar = this.f1177c;
                if (!cVar.f1182c) {
                    cVar.f1182c = true;
                    this.f1176b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public final void f(b bVar) {
        synchronized (this.f1175a) {
            if (c(bVar)) {
                c cVar = this.f1177c;
                if (cVar.f1182c) {
                    cVar.f1182c = false;
                    g(cVar);
                }
            }
        }
    }

    public final void g(@NonNull c cVar) {
        int i5 = cVar.f1181b;
        if (i5 == -2) {
            return;
        }
        if (i5 <= 0) {
            i5 = i5 == -1 ? 1500 : 2750;
        }
        this.f1176b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f1176b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i5);
    }

    public final void h() {
        c cVar = this.f1178d;
        if (cVar != null) {
            this.f1177c = cVar;
            this.f1178d = null;
            b bVar = cVar.f1180a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f1177c = null;
            }
        }
    }
}
