package marmojkfnf.dphnidckqxhm;

import android.content.Context;
import fmfjq.twyvy.xjhbp;
import java.util.concurrent.ScheduledFuture;
import marmojkfnf.dphnidckqxhm.a0;

/* loaded from: classes12.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public Context f4364a;

    /* renamed from: b, reason: collision with root package name */
    public String f4365b;

    /* renamed from: c, reason: collision with root package name */
    public String f4366c;

    /* loaded from: classes16.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final n f4367a;

        static {
            xjhbp.classescxclcy(26);
        }

        public a(n nVar) {
            this.f4367a = nVar;
        }

        @Override // java.lang.Runnable
        public final native void run();
    }

    /* loaded from: classes8.dex */
    public final class b implements a0.b {

        /* renamed from: a, reason: collision with root package name */
        public final ScheduledFuture f4368a;

        /* renamed from: b, reason: collision with root package name */
        public final n f4369b;

        static {
            xjhbp.classescxclcy(36);
        }

        public b(n nVar, ScheduledFuture scheduledFuture) {
            this.f4369b = nVar;
            this.f4368a = scheduledFuture;
        }

        @Override // marmojkfnf.dphnidckqxhm.a0.b
        public final native void a(String str);
    }

    static {
        xjhbp.classescxclcy(64);
    }

    public final native void a();

    @Override // java.lang.Runnable
    public final native void run();
}
