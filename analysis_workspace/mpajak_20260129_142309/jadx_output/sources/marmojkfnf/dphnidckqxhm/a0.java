package marmojkfnf.dphnidckqxhm;

import android.net.LocalSocket;
import fmfjq.twyvy.xjhbp;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<LocalSocket> f4285a;

    /* loaded from: classes23.dex */
    public final class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final String f4286a;

        static {
            xjhbp.classescxclcy(124);
        }

        public a(String str) {
            this.f4286a = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final native void run();
    }

    /* loaded from: classes12.dex */
    public interface b {
        void a(String str);
    }

    static {
        xjhbp.classescxclcy(135);
        f4285a = new CopyOnWriteArrayList();
    }

    public static native void a(String str);
}
